package com;
    import java.io.*;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Objects;
	import java.util.Scanner;
	public class Main{
	 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 Library library = new Library();
	 System.out.println("Loading Books from File.");
	 library.loadBooksFromFile("Books.txt");
	 while(true)
	 {
		 int choice = 0;
		 System.out.println("1.Add Books");
		 System.out.println("2.Search Books");
		 System.out.println("3.Remove Books");
		 System.out.println("4.Update Book");
		 System.out.println("5.Show Books");
		 System.out.println("6.Exit");
		 System.out.println("\nEnter your Choice: ");
		 choice = scanner.nextInt();
		 scanner.nextLine();
		 if(choice == 1)
		 {
		 String title = "";
		 String author = "";
		 float price = 0F;
		 int quantity = 0;
		 System.out.println("Enter Book Title: ");
		 title = scanner.nextLine();
		 System.out.println("Enter Author Name: ");
		 author = scanner.nextLine();
		 System.out.println("Enter the Price: ");
		 price = scanner.nextFloat();
		 System.out.println("Enter the Quantity: ");
		 quantity = scanner.nextInt();
		 scanner.nextLine();
		 Book newBook = new Book();
		 newBook.setTitle(title);
		 newBook.setAuthor(author);
		 newBook.setPrice(price);
		 newBook.setQuantity(quantity);
		 library.addBooks(newBook);
		 }
		 else if(choice == 2)
		 {
		 library.searchBooks();
		 }
		 else if(choice == 3)
		 {
		 String title = "";
		 System.out.println("Enter Book Title: ");
		 title = scanner.nextLine();
		 library.removeBook(title);
		 }
		 else if (choice == 4)
		 {
		 String title = "";
		 System.out.println("Enter Book Title: ");
		 title = scanner.nextLine();
		 String author = "";
		 System.out.println("Enter Book Author: ");
		 author = scanner.nextLine();
		 library.updateBookDetails(title,author);
		 }
		 else if(choice == 5)
		 {
		 library.ShowBooks();
		 }
		 else if (choice == 6)
		 {
		 scanner.close();
		 library.saveBooksToFile("Books.txt");
		 System.out.println("File Saved Successfully.");
		 System.out.println("\nGOOD BYE!");
		 break;
		 }
		 else
		 {
		 System.out.println("INVALID INPUT!");
		 }
		 }
	 }
	}
 
