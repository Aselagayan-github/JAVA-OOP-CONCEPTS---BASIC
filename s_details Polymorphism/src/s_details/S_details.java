/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s_details;

/**
 *
 * @author Asela gayan
 */
public class S_details {

    void welcome(){
    System.out.println("WELLCOME STUDENT DETAILS!!!!!!!!!!!!!!");
    System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        
      S_details s = new S_details();
      s.welcome();
      System.out.println();
     
      Student1 s1 = new Student1(12344445,21,"Asela");
        System.out.println("*)YOUR NAME IS:- "+s1.name);
        System.out.println("*)YOUR ID   IS:- "+s1.id);
        System.out.println("*)YOUR AGE  IS:- "+s1.age);
       
        System.out.println();
        
      Student2 s2 = new Student2(16775747,22,"umesh");
        System.out.println("*)YOUR NAME IS:- "+s2.name);
        System.out.println("*)YOUR ID   IS:- "+s2.id);
        System.out.println("*)YOUR AGE  IS:- "+s2.age);
     
     
        
    
      
    }
    
}
