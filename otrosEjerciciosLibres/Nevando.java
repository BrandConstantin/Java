/**
* Haz un programa que imite la nieve cayendo
* 
* 
* 
* @author costy
**/
public class Nevando{
    public static void main(String[] args){
        
        int espacio = ((int)(Math.random() * 50));
        for (int i = 0; i <= 5000; i++){
            espacio = ((int)(Math.random() * 10));
            for (int i1 = 0; i1 <= espacio; i1++)
            System.out.print(" ");
            System.out.print("*");
        }
    }
}
