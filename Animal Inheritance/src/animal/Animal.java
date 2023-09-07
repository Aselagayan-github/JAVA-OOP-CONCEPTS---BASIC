/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;



public class Animal {
    //animals feature
    int noumber_legs;
    String colour;
    char gender;

    void move(){
    System.out.println("I CAN move ");
    }
    void eat(){
    System.out.println("I CAN eat");
    }
    void sleep(){
    System.out.println("I CAN sleep");
    }
    public static void main(String[] args) {
        System.out.println("******Animals can******");
        Animal a= new Animal();
        a.move();
        a.eat();
        a.sleep();
        
        //space 
        System.out.println();
        
        System.out.println("********Birds can*********");
        //Birds B=new Birds();
        //B.Move();
        Animal a1=new Birds();
        a1.move();
        a1.eat();
        a1.sleep();
        
         //space 
        System.out.println();
         
        System.out.println("**********Mammmels can*******");
        //Mammels M=new Mammels();
        //M.Move();
        Animal a2=new Mammels();
        a2.move();
        a2.eat();
        a2.sleep();
        
         //space 
        System.out.println();
        
        System.out.println("**********Reptiles can*******");
        //Reptiles R=new Reptiles();
        //R.Move();
        Animal a3=new Reptiles();
        a3.move();
        a3.eat();
        a3.sleep();

    }
    
}
