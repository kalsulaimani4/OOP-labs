/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.ex1;

/**
 *
 * @author alsul
 */
public class NameTest {
    public static void main(String[] args){
        Name person1= new Name("khalil","ibrahim","khalil");
        System.out.println(person1.intilas());
        System.out.println(person1.toFullString());
        System.out.println(person1.toLastString());
        System.out.println(person1.toString());
        System.out.println(person1.toUpperCase());
        
        System.out.println("----------------------------");
        
        Name person2 = new Name("moaid ibrahim alsulaimani");
        System.out.println(person2.intilas());
        System.out.println(person2.toFullString());
        System.out.println(person2.toLastString());
        System.out.println(person2.toString());
        System.out.println(person2.toUpperCase());
    }
    
}
