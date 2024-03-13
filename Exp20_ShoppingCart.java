public class Exp20_ShoppingCart {
    public static void main(String[] args) {
        // Create objects for each class
        Product product1 = new Electronics("E1001", "Smartphone", 699.99, "Samsung");
        Product product2 = new Clothing("C2001", "T-Shirt", 19.99, "M");
        Product product3 = new Books("B3001", "Java Programming", 29.99, "John Doe");

        // Demonstrate polymorphism by displaying product details
        System.out.println("Product 1:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3:");
        product3.displayProductDetails();
    }
}

class Product {
    private String productId;
    private String productName;
    private double price;

    // Constructor
    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

// Derived class Electronics from Product
class Electronics extends Product {
    private String brand;

    // Constructor
    public Electronics(String productId, String productName, double price, String brand) {
        super(productId, productName, price);
        this.brand = brand;
    }

    // Method to display electronics product details
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Brand: " + brand);
    }
}

// Derived class Clothing from Product
class Clothing extends Product {
    private String size;

    // Constructor
    public Clothing(String productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }

    // Method to display clothing product details
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Size: " + size);
    }
}

// Derived class Books from Product
class Books extends Product {
    private String author;

    // Constructor
    public Books(String productId, String productName, double price, String author) {
        super(productId, productName, price);
        this.author = author;
    }

    // Method to display book product details
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
        System.out.println("Author: " + author);
    }
}
