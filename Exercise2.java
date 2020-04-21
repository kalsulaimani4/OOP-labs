/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author alsul
 */
import java.io.*;

public class Exercise2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int n = 10;
        int[] v = new int[n];
        try{
        FileReader f = new FileReader("D:dati.txt");
        BufferedReader in = new BufferedReader(f);
        
        int i = 0;
        String linea = in.readLine();
        while (linea != null) {
            v[i] = Integer.parseInt(linea);
            linea = in.readLine();
            i++;
        }
        f.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        }
    }
}
