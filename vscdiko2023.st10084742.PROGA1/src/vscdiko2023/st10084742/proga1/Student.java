/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vscdiko2023.st10084742.proga1;

import java.util.Scanner;

/**
 *
 * @author Vuyani
 */
public class Student {
    
    
    public static void menu(){
        int userInput;
        Scanner kb = new Scanner(System.in);
        System.out.println("(1) Capture a new student."
                + "\n(2) Search for a new student."
                + "\n(3) Delete a student."
                + "\n(4) Print student report"
                + "\n(5) Exit Application");
        
        userInput = kb.nextInt();
        
        switch(userInput = 1){
            case 1: SaveStudent();
            case 2: SearchStudent();
            case 3: DeleteStudent();
            case 4: StudentReport();
            case 5: ExitStudentApplication();
            default:
        }
        
        
     }
    
     public static void SaveStudent(){
         
            Scanner keyboard = new Scanner(System.in);
           
            System.out.println("Enter student details: ");
            String[] studentModel = new String[3];
            int[] studentModelAge = new int[1];
            char studAgeA = 'A';
            char studAgez = 'z';
            int ageNum = studAgeA;
            int ageNum2 = studAgez;
            
            for (int i = 0; i < 10; i++) {
             
         }
            

         
             
            System.out.print("Enter the student id >> ");
                studentModel[0] = keyboard.nextLine();
            System.out.print("Enter the student name >> ");
                studentModel[1] = keyboard.nextLine();
              
 
            System.out.print("Enter the student age >> ");
                studentModelAge[0] = keyboard.nextInt();
                
                if (studentModelAge[0] < 16) {
                    int i = 0;
                    while(studentModelAge[0] < 16) {
                    
                         System.out.println("You have entered an incorrect student age!!! ");
                        System.out.print("Enter the student age >> ");
                         studentModelAge[0] = keyboard.nextInt();
                        
                    
                }
                }
                
                else if(studentModelAge[0] >= ageNum && studentModelAge[0] <= ageNum2){
                    
                    for (int i = 0; i < 1; i++) {
                         System.out.println("You have entered an incorrect student age!!! ");
                        System.out.print("Enter the student age >> ");
                    
                }
                }
                 
            keyboard.nextLine();
            System.out.print("Enter student email >> ");
                studentModel[2] = keyboard.nextLine();
            System.out.print("Enter student course >> ");
                studentModel[3] = keyboard.nextLine();
            
            System.out.println("Student details: ");
                for (int i = 0; i < 1; i++) {
                System.out.println(studentModel[i]);
                }
         }
     
    public static void SearchStudent(){
         
     }
    
     public static void DeleteStudent(){
         
     }
    
      public static void StudentReport(){
         
     }
    
       public static void ExitStudentApplication(){
         
     }
    
    
          
        }

