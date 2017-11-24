/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author Laurici
 */
public class HelloWorldAnonymousClasses {
     // Inner interface HelloWorld
 interface HelloWorld {
 public void greet();
 public void greetSomeone(String someone);
 }
 // Method sayHello prints
 
 public void sayHello() {
 // Local class EnglishGreetings implemented in the method sayHello()
 
 class EnglishGreeting implements HelloWorld {
 String name = "world";
 @Override
 public void greet() {
 greetSomeone("world");
 }
 @Override
 public void greetSomeone(String someone) {
 name = someone;
 System.out.println("Hello " + name);
 }
 } // end of EnglishGreeting local class
 // create an EnglishGreeting object/instance
 HelloWorld englishGreeting = new EnglishGreeting();
 // create an anonimous class that greets in French language
 
 //HelloWorld frenchGreeting;
 class FrenchGreeting implements HelloWorld {
 //frenchGreeting = new HelloWorld() {
 String name = "tout le monde";
 @Override
 public void greet() {
 greetSomeone("tout le monde");
 }
 @Override
 public void greetSomeone(String someone) {
 name = someone;
 System.out.println("Salut " + name);
 } // end of anonimous class
 }
 HelloWorld frenchGreeting = new FrenchGreeting();
  // create an anonimous class for Spanish language
 //HelloWorld spanishGreeting;
 class SpanishGreeting implements HelloWorld {
 //spanishGreeting = new HelloWorld() {
 String name = "mundo";
 @Override
 public void greet() {
 greetSomeone("mundo");
 }
 @Override
 public void greetSomeone(String someone) {
 name = someone;
 System.out.println("Hola, " + name);
 } // end of anonymous class
 }
 HelloWorld spanishGreeting = new SpanishGreeting();
 englishGreeting.greet();
 frenchGreeting.greetSomeone("Fred");
 spanishGreeting.greet();
 }
   
   
}
