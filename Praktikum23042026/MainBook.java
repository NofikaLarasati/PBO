/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program MainBook dalam komposisi
 */
package Praktikum23042026;

/**
 *
 * @author LENOVO
 */
public class MainBook {
    public static void main (String[] args){
        // TODO code application logic here
        Author Cha = new Author ("Echa Priwidia","Echa@gmail.com",'p');
        System.out.println(Cha);  // Author's toString()
        // Echa Priwidia (p) at Echa@gmail.com
        
        // Test book' constructor dan toString()
        Book dummyBook = new Book ("Rumah Abah", Cha, 150000, 50);
        System.out.println(dummyBook); //Book's toString()
        // 'Algoritma dan Pemrograman' by Rinaldi munir (m) at rinaldi@gmail.com
        
        //Test Setters and Getters
        dummyBook.setPrice(150000);
        dummyBook.setQty(50);
        System.out.println("Name is: " + dummyBook.getName());
        //name is : Rumah Abah
        System.out.println("Price is: " + dummyBook.getPrice());
        // price is : 150000
        System.out.println("Qty is: " + dummyBook.getQty());
        // qty is : 88
        System.out.println("Author is: " + dummyBook.getAuthor());
        // invoke Author 
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("Author's gender is: " + dummyBook.getAuthor().getGender());
        
        Book moreDummyBook = new Book("java for more dummies",new Author("peter lee","peter@nowhere",'p'),19.99,8);
        System.out.println(moreDummyBook);     
    }
}
