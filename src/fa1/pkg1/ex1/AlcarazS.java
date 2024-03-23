/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fa1.pkg1.ex1;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Alcaraz
 */
public class AlcarazS {

    
    public static void main(String[] args) {
        int menuans, studAge;
        int ctr=0;
        String studName;
        boolean flag = true;
        //Basketball
        int bBallPos=2;
                       
        Scanner scanB = new Scanner(System.in);

        String[] bBallName = new String[bBallPos];  
        int[] bBallAge = new int[bBallPos];

        Array[] studentsB = new Array[bBallPos];   
    
        //Volleyball
        int vBallPos=3; 
        int ctrV=0;

        String[] vBallName = new String[vBallPos];  
        int[] vBallAge = new int[vBallPos];

        Array[] studentsV = new Array[vBallPos]; 
        
        do {
        
           System.out.println("Select Team");
           System.out.println("------------------");
           System.out.println("[1] Basketball");
           System.out.println("[2] Volleyball");
           System.out.println("[3] Exit");
           System.out.println("------------------");
           
           
          Scanner menu = new Scanner(System.in);
           
           System.out.print("Choice: ");
           menuans = scanB.nextInt();
           scanB.nextLine();
           
            
            if (menuans<=0 || menuans>=4)
                System.out.println("Please enter 1, 2, or 3 only!");
          

        switch(menuans) {
            
            case 1: //Basketball
                
                if (ctr==bBallPos) {
                    System.out.println("Sorry! The Basketball Team has already reached its maximum number of members.");
                    break;
                }  
                   
                System.out.println("Application for the Basketball Team!");

                System.out.print("Enter name: ");
                studName = scanB.nextLine();   
                //System.out.println(bBallName);
                    
                System.out.print("Enter age: ");
                studAge = scanB.nextInt();
                //System.out.println(bBallAge);

                if(studAge>=18 && studAge<22) {
                    if(ctr<=bBallPos) {
                        ctr = ctr + 1;
                        bBallName[ctr-1] = studName;
                        bBallAge[ctr-1] = studAge;
                        System.out.println("Welcome to the Basketball Team!");
                    }
                } else {
                    System.out.println("Sorry, you are not qualified!");
                }
                               
                break;
                
                
                
                
            case 2: //Volleyball
                
                if (ctrV==vBallPos) {
                  System.out.println("Sorry! The Volleyball Team has already reached its maximum number of members.");
                  break;
                }  
                   
                System.out.println("Application for the Volleyball Team!");

                System.out.print("Enter name: ");
                studName = scanB.nextLine();   
                //System.out.println(vBallName);
                    
                System.out.print("Enter age: ");
                studAge = scanB.nextInt();
                //System.out.println(vBallAge);

                if(studAge>=14 && studAge<18) {
                    if(ctrV<=vBallPos) {
                        ctrV = ctrV + 1;
                        vBallName[ctrV-1] = studName;
                        vBallAge[ctrV-1] = studAge;
                        System.out.println("Welcome to the Volleyball Team!");
                    }

                } else {
                       System.out.println("Sorry, you are not qualified!");
                    }
                             
                break;
           
            case 3: //Exit
                System.out.println("Qualified players for Basketball Team:");
                System.out.println(bBallName[0]);
                System.out.println(bBallName[1]);
                System.out.println("Qualified players for Volleyball Team:");
                System.out.println(vBallName[0]);
                System.out.println(vBallName[1]);
                System.out.println(vBallName[2]);
                
                flag=false;
        }
        
    } while(flag);

}
}
 
    
