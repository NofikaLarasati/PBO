/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program Book dalam komposisi
 * 
 */
package Praktikum23042026;

/**
 *
 * @author LENOVO
 */
public class Book {
    /// The private instance variabel
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    /** Constructor a Book instance with the given author */
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    // Getters and Setters
    /** Return a  name */
    public String getName() {
        return name;
    } 
    
    public Author getAuthor() {
        return author;
    }
    
    public Double getPrice() {
        return price;
    } 
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString() {
        return "Book[Nama: " + name + 
           ", Author: " + author + 
           ", Harga: " + price + 
           ", Jumlah: " + qty + "]";
    }
}
