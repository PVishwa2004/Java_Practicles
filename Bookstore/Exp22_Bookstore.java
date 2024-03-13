package Bookstore;

import Bookstore.core.Book;
import Bookstore.inventory.*;

public class Exp22_Bookstore {
    public static void main(String[] args) {
        // Creating a sample book
        Book sampleBook = new Book("Book name", "Vishwa", "5012869", 250.00);

        // Creating an inventory manager and adding the sample book
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.addBook(sampleBook);

        // Retrieving and printing book details
        Book retrievedBook = inventoryManager.getBookDetails("5012869");
        if (retrievedBook != null) {
            System.out.println("Book Details:\nTitle: " + retrievedBook.getTitle()
                    + "\nAuthor: " + retrievedBook.getAuthor()
                    + "\nISBN: " + retrievedBook.getIsbn()
                    + "\nPrice: " + retrievedBook.getPrice());
        }

        // Updating stock level
        inventoryManager.updateStockLevel("5012869", 50);
    }
}

