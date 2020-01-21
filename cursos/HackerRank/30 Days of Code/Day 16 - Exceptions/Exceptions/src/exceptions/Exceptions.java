package exceptions;

/**
 *
 * @author BrandConstantin
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] intArray = new int[10];
        
        try{
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 =" + c[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown " + e);
        }
    }
    
}
