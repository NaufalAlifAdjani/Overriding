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
public class cicak extends Hewanover{
    public String  makan(){
        System.out.println(super.makan());
        return"cicak makan laron";
    }
    public String berkembangbiak(){
        System.out.println(super.berkembangbiak());
        return"cicak bertelur";
    }
    public void  makana(){
        System.out.println(super.makan());
        System.out.println("cicak makan laron");
    }
    public void berkembangbiakan(){
        System.out.println(super.berkembangbiak());
        System.out.println("cicak bertelur");
    }
}
