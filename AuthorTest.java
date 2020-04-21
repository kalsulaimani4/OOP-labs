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
public class AuthorTest {
    public static void main(String[] args){
        Author k = new Author("khalil","alsulaimani@uqu",'m');
        
        k.setEmail("yeet.com.uk");
        System.out.println("name is "+k.getName()); 
        System.out.println("gender :"+k.getGender());
        System.out.println("emial is "+k.getEmail());
        System.out.println(k.toString());
        
        
    }
    
}
