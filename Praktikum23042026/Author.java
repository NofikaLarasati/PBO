/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program Author dalam komposisi
 */
package Praktikum23042026;

/**
 *
 * @author LENOVO
 */
public class Author {
    /// The private instance variables
    private final  String name;
    private String email;
    private final char gender;  ///'m' or 'f'
    
    /** Constructs s Author instance with the given inputs */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    /** Returns the name */
    public String getName() {
        return name;
    }
    
    /** Returns the gender */
    public char getGender() {
        return gender;
    } 
    
    /** Returns the email */
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String toString(){
        return "Author[name = " + name +", email =" + email +", gender =" + gender +"]";
    }
}
