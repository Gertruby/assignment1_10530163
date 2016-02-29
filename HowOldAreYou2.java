/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author GERTRUDE ANGELA
 */
public class HowOldAreYou2 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input=new Scanner(System.in);
        System.out.print("Hey,what's your name?(Sorry I keep forget)");
        name=input.nextLine();
        System.out.print("Ok,"+name+",how old are you? ");
        age=input.nextInt();
        
        if (age<16){
            System.out.print("you can't drive,"+name);
        }
        else if(age<=17){
  
           System.out.print("you can drive but you can't vote,"+name);
    }
        else if(age<=24){
            System.out.print("you can vote but not rent a car,"+name);
        }
        else{
            System.out.print("you can do pretty much anything,"+name);
        }
            
    } }
    
