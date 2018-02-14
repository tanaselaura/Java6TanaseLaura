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
            statement.execute("create table BOOK_TYPES" +
                     "(ID INTEGER PRIMARY KEY, "  +
                     "TYPE VARCHAR (25) )");
            
            //create table ROLES
            statement.execute("create table ROLES(ROLE VARCHAR(10)PRIMARY KEY )");
            
             //create table BOOK_PAPER_QUALITIES
            statement.execute("create table BOOK_PAPER_QUALITIES" +
                     "(ID INTEGER PRIMARY KEY, "  +
                     "QUALITY VARCHAR (25) )");
            
            //create table BOOK_GENRES
            statement.execute("create table BOOK_GENRES" +
                     "(ID INTEGER PRIMARY KEY, "  +
                     "GENRE VARCHAR (25) )");
            
            //CREATE TABLE EBOOKS
            statement.execute("CREATE TABLE EBOOKS " +
                    "(ISBN VARCHAR(50) PRIMARY KEY," +
                    " TITLE VARCHAR(50) NOT NULL," +
                    " TYPE INTEGER, " +
                    " PAGES INTEGER, " +
                    " PRET numeric(10,2), " +
                    " ID_QUALITY INTEGER, " +
                    " GENRE INTEGER) " );
                    //add foreign key for type and genre
                    //" FOREIGN KEY (TYPE) REFERENCES BOOK_TYPES(TYPE), " +
                    //" FOREIGN KEY (GENRE) REFERENCES BOOK_GENRES(GENRE))");
            
            //CREATE TABLE BOOK_AUTHORS
            statement.execute("CREATE TABLE BOOK_AUTHORS " +
                    "(CNP VARCHAR(13) PRIMARY KEY, " +
                    " FIRST_NAME VARCHAR(30) NOT NULL, " + 
                    " FAMILY_NAME VARCHAR(30) NOT NULL)");
            
            //CREATE TABLE EBOOKS_AUTHORS
            statement.execute("CREATE TABLE EBOOKS_AUTHORS " +
                    "(ID INTEGER PRIMARY KEY, "  +
                    " ISBN VARCHAR(50) NOT NULL, " +
                    " CNP VARCHAR(13)) " );
                    //add foreign key for ISBN and CNP
                   // " FOREIGN KEY (ISBN) REFERENCES EBOOKS(ISBN), " +
                    //" FOREIGN KEY (CNP) REFERENCES BOOK_AUTHORS(CNP))");
            
            //CREATE TABLE RATINGS
            statement.execute("CREATE TABLE RATINGS" +
                     "(ID INTEGER PRIMARY KEY, "  +
                     "RATING VARCHAR(5) )");
            
            //CREATE TABLE USERS
            statement.execute("CREATE TABLE USERS " +
                    "(CNP VARCHAR(13) PRIMARY KEY, " +
                    " NAME VARCHAR(50) NOT NULL, " + 
                    " PASSWORD VARCHAR(50) NOT NULL, " +
                    " ROLE VARCHAR(10) )");
            
            //CREATE TABLE EBOOKS_RATING_USERS
            statement.execute("CREATE TABLE EBOOKS_RATING_USERS " +
                    "(ID INTEGER PRIMARY KEY, " +
                    " RATING INTEGER NOT NULL, " + 
                    " CNP VARCHAR(13) NOT NULL, " + 
                    " ISBN VARCHAR(50) NOT NULL )" );
                    //add foreing key for raiting CNP and ISBN
                    //" FOREIGN KEY (RATING) REFERENCES RATINGS(RATING), " +
                    //" FOREIGN KEY (CNP) REFERENCES USERS(CNP), " +
                    //" FOREIGN KEY (ISBN) REFERENCES EBOOKS(ISBN))");
            
            //add book types
            statement.execute("INSERT INTO BOOK_TYPES(id, type) VALUES (1,'eBook'),(2,'PDF'), (3,'Kindle')");
            //add book genres
            statement.execute("INSERT INTO BOOK_GENRES(id, genre) VALUES (1,'Science fiction'),(2,'Satire'),(3,'Drama'),(4,'Action and Adventure'),(5,'Romance'),(6,'Mystery'),(7,'Horror'),(8,'Self help'),(9,'Health'),(10,'Guide'),(11,'Travel'),(12,'Children.s'),(13,'Religion & New Age'),(14,'Science'),(15,'History'),(16,'Math'),(17,'Anthology'),(18,'Poetry'),(19,'Encyclopedias'),(20,'Dictionaries'),(21,'Comics'),(22, 'Art'),(23, 'Cookbooks'),(24, 'Diaries'),(25,'Journals'),(26,'Prayer books'),(27,'Series'),(28,'Trilogy'),(29,'Biographies'),(30,'Autobiographies'),(31,'Fantasy')");
            //add stars for ratings
            statement.execute("INSERT INTO RATINGS(id, RATING) VALUES (1,'*'), (2,'**'), (3,'***'), (4,'****'), (5,'*****')");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
