/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author brand
 */
public class question1 {

    public boolean isPrime(int x) {
        boolean prime = false;
        
        if(x % 2 != 0){
            prime = false;
        }else{
            prime = true;
        }
        
        return isPrime(x);
    }
}
