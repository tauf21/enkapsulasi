/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author root
 */
public class RunLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran cyrcle = new Lingkaran();
        cyrcle.setJari(14);
        System.out.println("kelilig : "+cyrcle.keliling()+"\nLuas    : "+cyrcle.luas());
    }
    
}
