/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vscdiko2023.st10084742.proga1;

import java.util.Scanner;

/**
 *
 * @author Vuyani
 */
public class Vscdiko2023St10084742PROGA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int userEntry;
         Scanner kb = new Scanner(System.in);
         System.out.println("STUDENT MANAGEMENT APPLICATION"
                + "\n****************************"
                + "\nEnter (1) to launch menu or any other key to exit");
         userEntry = kb.nextInt();
         
              switch(userEntry = 1){
                case 1: Student.menu();
                default: System.exit(0);
              }
    
 }
    }
    
