/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author brand
 */
public class question7 {

    public static void main(String[] args) {
        int weekday = 5;
        boolean holiday = false;
        
        switch(weekday){
            case 1: case 2: case 3: case 4: case 5:
                holiday = false;
                System.out.println("Wake up at 7:00");
                break;
                
            case 6: case 7:
                holiday = true;
                System.out.println("Sleep in!");
                break;
                
            default:
                System.out.println("Error");
                break;
        }
    }
}
