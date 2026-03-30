/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switch_statements;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Switch_Statements {

    public static void main(String[] args) {
        // create a application that demonstrates the diff between Nested if-else statement and switch Statement
        // prompt user to enter a number and based on the number enter a day.
        // add import
        Scanner sb=new Scanner(System.in);
        
        //Prompt the user to enter a value between1-7
        System.out.println("Please enter a value between 1-7");
        int userInput = sb.nextInt();
        
        // implement Nested if else
        if(userInput==1){
            System.out.println("Monday");
        }else if(userInput==2){
            System.out.println("Tuesday");
        }else if(userInput==3){
            System.out.println("Wednesday");
        }else if(userInput==4){
            System.out.println("Thursday");
            
         }else if(userInput==5){  
             System.out.println("Friday");
         }else if (userInput==6){
             System.out.println("Saturday");
         }else if (userInput==7){
             System.out.println("Sunday");    
             
            
        }
        // switch Statement(used AS aleternate instead of nested if else)
        switch(userInput){
            case 1:
                System.out.println("Monday");
                break;//stops switch after a matching case has been found
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry");
                break;
                
        }
    }
}
