import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                int count = 0;
                int xx = x;
                while(xx > 0) {
                    xx /= 10;
                    ++count; 
                }                

                //Complete this line
                System.out.print(s1);

                for(int j = 0; j < (15 - s1.length()); j++){
                    System.out.print(" ");
                }
                
                if(count == 3){
                    System.out.print(x);
                }else if(count == 2){
                    System.out.print("0" + x);
                }else if(count == 1){
                    System.out.print("00" + x);
                }else{
                    System.out.print("000");
                }
                
                System.out.println("");
            }
            System.out.println("================================");

    }
}