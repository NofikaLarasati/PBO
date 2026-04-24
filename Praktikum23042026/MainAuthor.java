/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program MainAuthor dalam komposisi
 */
package Praktikum23042026;

/**
 *
 * @author LENOVO
 */
public class MainAuthor {
    public static void main(String[] args) {
        /// TO DO code application logic here
        Author Rin = new Author ("Rinaldi Munir","rinaldi@gmail.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("rinaldi@gmail.com");
        System.out.println("Nama : "+Rin.getName());
        System.out.println("Gender : "+Rin.getGender());
        System.out.println("Email : "+Rin.getEmail());
    }
}
