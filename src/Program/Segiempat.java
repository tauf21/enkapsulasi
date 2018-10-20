/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author taufika.amary@gmail.com
 */
public class Segiempat {
    private int panjang;
    private int lebar;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
    public int luas(){
        return this.panjang*this.lebar;
    }
    
    
}
