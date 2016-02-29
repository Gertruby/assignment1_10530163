/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.util.Scanner;

/**
 *
 * @author GERTRUDE ANGELA
 */
public class SpacingBoxing {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double earthweight;
        int option;
        double ans=0;
        
      
        
        System.out.print("Please enter your current earth weight:");
        double Weight = input.nextDouble();
        
        System.out.println("\n I have information for the following planets");
        System.out.println("\t 1.Venus  2.Mars  3.Jupiter");
        System.out.println("\t 4.Saturn 5.Uranus    6.Neptune");
        System.out.println("\n Which planet are you visiting?");
        option=input.nextInt();
        
          if (option==1){
        //option 1=Venus
                ans=0.78;
        }
        else if(option==2){
        //option 2=Mars
                ans=0.39  ;
        }
        else if(option==3){    
        //option 3=Jupiter        
                ans=2.65;
        }
        else if(option==4){
        //option 4=Saturn
                ans=1.17;
        }
        else if(option==5){
        //option 5=Uranus
                ans=1.05;
        }
        else if(option==6){
        //option 6=Neptune
                 ans=1.23;
        }
        System.out.println( "\nYour weight will be"+(ans*Weight)+" pounds on that planet" );
    }
    
}
