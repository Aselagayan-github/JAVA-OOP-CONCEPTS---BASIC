/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user_login;


public class User_login {
     void Wellcome(){
         System.out.println("READ AND WRITE ONLY PROPERTY EX 03 ");
         System.out.println("-----------------------------------");
     }
    
    public static void main(String[] args) {
        User_login ul =new User_login();
        ul.Wellcome();
        
        //write property
        
        acount_user au =new acount_user();
        au.username();
        
        //read property
        System.out.println("your password is:- "+au.readpassword());
    }
    
}
