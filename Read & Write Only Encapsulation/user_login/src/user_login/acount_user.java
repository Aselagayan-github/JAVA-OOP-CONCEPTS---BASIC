/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user_login;

import java.util.Scanner;


public class acount_user {
    private String password = "asela1234";
    private String name ="gayan";
    String usn,iusn;
    public void username(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter your name:- ");
        usn=in.nextLine();
        iusn = String.valueOf(usn);
        System.out.println();
        
        if(name.equals(iusn)){
           System.out.println("**8YOUR USER NAME IS CORRECT!!!!!!!!!!!");
        }
        else{
            System.out.println("INVALID USER NAME PLEASE TRY AGAIN!!!!!!!!!!!!!!!!!!");
        }
        System.out.println();
    
    }
    
    public String  readpassword(){
           return password;
    }
}
    
