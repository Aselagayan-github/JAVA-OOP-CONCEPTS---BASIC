/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honda4;


public class Honda4 extends Cars {
    void welcome(){
    System.out.println("******WELLCOME HONDA SELLING MARKET!!!!!!!!");
    }
    
    @Override
    void run(){
    System.out.println("**:- HONDA 4 CAR IS VER SAFTY AND VERY FAST");
    }

   
    public static void main(String[] args) {
        Cars C = new Honda4();
        Honda4 h4 = new Honda4();
        
        h4.welcome();
        System.out.println();
        C.condition();
        C.run();
    }
    
}
