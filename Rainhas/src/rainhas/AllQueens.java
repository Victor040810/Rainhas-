/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainhas;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class AllQueens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner stdin = new Scanner(System.in);
        System.out.println("Numeor de rainhas a colocar? ");
        int nr = stdin.nextInt();
        
        Queens q = new Queens(nr);
        q.colocaRainha();
    }
    
}
