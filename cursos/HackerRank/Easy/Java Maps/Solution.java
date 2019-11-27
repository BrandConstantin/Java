import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            //in.nextLine();
            hm.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (hm.get(s) == null) {
                System.out.println("Not found");
            }else{
                System.out.println(s + "=" + hm.get(s)); 
            }
        }
        in.close();
    }
}