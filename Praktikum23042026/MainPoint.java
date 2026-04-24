/*
 * Nama: Dafa Nofika Larasati
   Nim: 2501081014
   Deskripsi: Program MaiPoint dalam komposisi
 */
package Praktikum23042026;

/**
 *
 * @author LENOVO
 */
public class MainPoint {
   public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3,4);
        
        p1.setX(1);
        p2.setY(2);
        
        System.out.println("P1 : "+p1);
        System.out.println("P2 : "+p2);
        
        int[] xy = p1.getXY();
        System.out.println("P1 X : "+xy[0]+", Y : "+xy[1]);
        
        p1.setXY(5, 6);
        System.out.println("P1 setelah setXY : "+p1);
        
        System.out.println("Distance P1 ke (0,0) : "+p1.distance());
        System.out.println("Distance P1 ke (2,3) : "+p1.distance(2,3));
        System.out.println("Distance P1 ke P2 : "+p1.distance());
    
    }
}
