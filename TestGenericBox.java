/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author alsul
 */
public class TestGenericBox {

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<String>("Hello");
        String str = box1.getContent();
        System.out.println(box1);
        GenericBox<Integer> box2 = new GenericBox<Integer>(123);
        int i = box2.getContent();
        System.out.println(box2);
        GenericBox<Double> box3 = new GenericBox<Double>(55.66);
        double d = box3.getContent();
        System.out.println(box3);
    }
}

