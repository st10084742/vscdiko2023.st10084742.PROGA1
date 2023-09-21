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
public class BusinessApplication {
    

   public static void sortInventory(){
       Scanner keyboard = new Scanner(System.in);
    char[] itemList = new char[5];
    int valA;
    int valB;
    int temp;
    int comparisonsToMake = itemList.length -1;

    for(valA = 0; valA < itemList.length - 1; ++valA){
        for (valB = 0; valB < comparisonsToMake; ++valB) {
            if(itemList[valB] > itemList[valB + 1]){
                temp = itemList[valB];
                itemList[valB] = itemList[valB + 1];
                itemList[valB + 1] = temp;
        }
        }
    -- comparisonsToMake;

} 
    
}
}
