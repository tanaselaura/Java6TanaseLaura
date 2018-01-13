/*
 *ebook database
 */
package ebook.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Laurici
 */
public class CreateDatabaseStructure {
    
    
    public static void main(String args[]) throws ClassNotFoundException{
        String user = "TANASELAURA";
        String password = "laura";
        String url = "jdbc:derby://localhost:1527/EBOOKS;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection;
        Statement statement;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);

            statement = connection.createStatement();
            //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");
            
            //create table BOOK_TYPES
            statement.execute("create table BOOK_TYPES(TYPE VARCHAR (25)PRIMARY KEY )");
            
            //create table BOOK_GENRES
            statement.execute("create table BOOK_GENRES(GENRE VARCHAR (25)PRIMARY KEY )");
            
            //CREATE TABLE EBOOKS
            statement.execute("CREATE TABLE EBOOKS " +
                    "(ISBN VARCHAR(50) PRIMARY KEY," +
                    " TITLE VARCHAR(50) NOT NULL," +
                    " TYPE VARCHAR(25), " +
                    " PAGES INTEGER, " +
                    " GENRE VARCHAR(25), " +
                    //add foreign key for type and genre
                    " FOREIGN KEY (TYPE) REFERENCES BOOK_TYPES(TYPE), " +
                    " FOREIGN KEY (GENRE) REFERENCES BOOK_GENRES(GENRE))");
            
            //CREATE TABLE BOOK_AUTHORS
            statement.execute("CREATE TABLE BOOK_AUTHORS " +
                    "(CNP VARCHAR(13) PRIMARY KEY, " +
                    " FIRST_NAME VARCHAR(30) NOT NULL, " + 
                    " FAMILY_NAME VARCHAR(30) NOT NULL)");
            
            //CREATE TABLE EBOOKS_AUTHORS
            statement.execute("CREATE TABLE EBOOKS_AUTHORS " +
                    "(ID INTEGER PRIMARY KEY, "  +
                    " ISBN VARCHAR(50) NOT NULL, " +
                    " CNP VARCHAR(13), " +
                    //add foreign key for ISBN and CNP
                    " FOREIGN KEY (ISBN) REFERENCES EBOOKS(ISBN), " +
                    " FOREIGN KEY (CNP) REFERENCES BOOK_AUTHORS(CNP))");
            
            //CREATE TABLE RATINGS
            statement.execute("CREATE TABLE RATINGS (RATING VARCHAR(5) PRIMARY KEY)");
            
            //CREATE TABLE USERS
            statement.execute("CREATE TABLE USERS " +
                    "(CNP VARCHAR(13) PRIMARY KEY, " +
                    " NAME VARCHAR(50) NOT NULL, " + 
                    " PASSWORD VARCHAR(50) NOT NULL)");
            
            //CREATE TABLE EBOOKS_RATING_USERS
            statement.execute("CREATE TABLE EBOOKS_RATING_USERS " +
                    "(ID INTEGER PRIMARY KEY, " +
                    " RATING VARCHAR(5) NOT NULL, " + 
                    " CNP VARCHAR(13) NOT NULL, " + 
                    " ISBN VARCHAR(50) NOT NULL, " +
                    //add foreing key for raiting CNP and ISBN
                    " FOREIGN KEY (RATING) REFERENCES RATINGS(RATING), " +
                    " FOREIGN KEY (CNP) REFERENCES USERS(CNP), " +
                    " FOREIGN KEY (ISBN) REFERENCES EBOOKS(ISBN))");
            
            //add book types
            statement.execute("INSERT INTO BOOK_TYPES VALUES ('eBook'),('PDF')");
            //add book genres
            statement.execute("INSERT INTO BOOK_GENRES VALUES ('Science fiction'),('Satire'),('Drama'),('Action and Adventure'),('Romance'),('Mystery'),('Horror'),('Self help'),('Health'),('Guide'),('Travel'),('Children.s'),('Religion & New Age'),('Science'),('History'),('Math'),('Anthology'),('Poetry'),('Encyclopedias'),('Dictionaries'),('Comics'),('Art'),('Cookbooks'),('Diaries'),('Journals'),('Prayer books'),('Series'),('Trilogy'),('Biographies'),('Autobiographies'),('Fantasy')");
            //add stars for ratings
            statement.execute("INSERT INTO RATINGS VALUES ('*'), ('**'), ('***'), ('****'), ('*****')");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
