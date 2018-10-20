/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author taufik.amary@gmail.com
 */
public class Lingkaran {
    private int jari;

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }
    public double luas(){
        return Math.pow(this.jari, 2)*3.14;}
    public double keliling(){
        return this.jari*2*3.14;}
}
