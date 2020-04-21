/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.ArrayList;

/**
 *
 * @author alsul
 */
public class PairTest {
    public static void main(String[] args){
        Pair<String, Integer>  p = new Pair("mike ",1);
        Pair<String,Double> p1 = new Pair("yeets",4.5);
        Pair<String, Integer>  p2 = new Pair("lilli ",5);
        Pair<String, Integer>  p3 = new Pair("michel ",4);
        Pair<String, Integer>  p4 = new Pair("scarra ",10);
        
        ArrayList<Pair> pairs= new ArrayList<Pair>();
        pairs.add(p);
        pairs.add(p1);
        pairs.add(p2);
        pairs.add(p3);
        pairs.add(p4);
        
        for(int i=0;i<pairs.size();i++){
            System.out.println("my name is "+pairs.get(i).getName()+" in the year "+pairs.get(i).getYear()+" at univerity ");
        }
        
    }
    
}
