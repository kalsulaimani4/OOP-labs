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
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    
    // constructor
    public Book(String name, Author author,double price){
      this.name=name;
      this.author=author;
      this.price=price;
    }
    
    public Book (String name, Author author, double price, int qty) {
        this.name=name;
      this.author=author;
      this.price=price;
      this.qty=qty;
    }
    
    public String getName(){
        return name;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price= price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty= qty;
    }
    
    
    @Override
    public String toString(){
        String s;
        s="Book name : "+name+"\n"+author.toString()+"\nprice: "+price+"\nquantity : "+qty;
        return s;
    }
    
    
}
