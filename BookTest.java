/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author alsul
 */
public class BookTest {
    public static void main(String[] args){
        Author khalil = new Author("khalil","alsulaimani@uqu",'m');
        Book b= new Book("way of kings",khalil,30.4);
        b.setQty(1);
        System.out.println(b.toString());
        
        System.out.println("========================================");
        
        Author mimi = new Author("mimi","alsulaimani@uqu",'f');
        Book b2 = new Book("way of queens",mimi,100.2,4);
        System.out.println(b2.toString());
        
        System.out.println(b.getAuthor().getName());
        System.out.println(b.getAuthor().getEmail());
    }
    
}
