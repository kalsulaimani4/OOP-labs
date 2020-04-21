/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author alsul
 */
public class Cat extends Animal implements Pet {
    
    public String name;
    
   
    public Cat(String name){
        super(4);
        this.name=name;
    }
    
    public Cat(){
        this(" ");
    }
    
    
    
    @Override
    void Eat() {
        System.out.println("CAT EATS CAT FOOD");
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("cat plays with cotten ball ");
    }
    
    
}
