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
public class Fish extends Animal implements Pet{
    
    private String name;
    
    public Fish() {
       super(0);
    }

    @Override
    void Eat() {
        System.out.println("fish eats fish food ");
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
        System.out.println("fish play by swimming ");
    }
    
    /**
     *
     */
    @Override
    public void Walk(){
        System.out.println("fish dont walk thay SWIM free in the tank :D ");
    }
    
    
}
