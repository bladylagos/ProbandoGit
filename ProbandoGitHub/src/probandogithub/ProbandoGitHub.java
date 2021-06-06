/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandogithub;

import java.util.Scanner;

/**
 *
 * @author Gerardo Lagos
 */
public class ProbandoGitHub {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }

        System.out.println("Ingrese un numero:");
        int num = entrada.nextInt();

        if (num >= 10) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }
    }

}
