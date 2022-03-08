/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewanover;

/**
 *
 * @author SENJU
 */
public class sapi extends Hewanover {
    public String  makan(){
        System.out.println(super.makan());
        return"sapi makan rumput";
    }
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return"sapi beranak";
    }
    public void  makana(){
        System.out.println(super.makan());
        System.out.println("sapi makan rumput");
    }
    public void berkembangbiakan(){
        System.out.println(super.berkembangbiak());
        System.out.println("sapi beranak");
    }
}
