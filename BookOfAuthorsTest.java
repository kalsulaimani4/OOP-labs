/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

import java.util.Arrays;



/**
 *
 * @author alsul
 */
public class BookOfAuthorsTest {
    public static void main(String[] args){
        Author one = new Author("khalil","alsulaimani.2000",'m');
        
        Author two = new Author("maoid","alsulaimani.2002",'m');
        
        Author three = new Author("mohanad","alsulaimani.2004",'m');
        
        Author[] names= new Author[]{one,two,three};
        
        BookOfAuthors book1= new BookOfAuthors("way of kindoms ",names,100.3,10);
        
        System.out.println(Arrays.toString(book1.getAuthor()));
        
      
    }
   
    
}
