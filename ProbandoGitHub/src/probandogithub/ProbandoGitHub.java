/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandogithub;

import java.util.Scanner;
import javax.swing.JOptionPane;

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

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));

        if (num >= 10) {
            JOptionPane.showMessageDialog(null, "Es mayor");
        } else {
            JOptionPane.showMessageDialog(null, "Es menor");
        }

    }

}
