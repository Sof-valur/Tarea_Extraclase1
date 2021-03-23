/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 50684
 */
public class TryCatch {

    public static void main(String[] args) {
        try {
            int[] arreglo = {4, 5, 6};
            
            for (int i = 0; i < 4; i++) {
                System.out.println(arreglo[i]);
            }
        } catch(Exception e) {
            System.out.println("An exception happened: " + e.getLocalizedMessage());
        }
    } 
}
