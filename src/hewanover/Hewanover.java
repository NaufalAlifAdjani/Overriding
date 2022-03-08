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
public class Hewanover {

    public String makan(){
        return"Apa yang dimakan hewan ini ? "; 
    }
    public String berkembangbiak(){
        return"Bagaimana perkembangbiakan hewan ini ? ";
    }
    public void makana(){
        System.out.println("Apa yang dimakan hewan ini ?");
    }
    public void berkembangbiakan(){
        System.out.println("Bagaimana perkembangbiakan hewan ini");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        sapi muncul = new sapi();
        cicak muncul2 = new cicak();
        System.out.println("non void");
        System.out.println(muncul.makan());
        System.out.println(muncul.berkembangbiak());
        System.out.println("========================");
        System.out.println(muncul2.makan());
        System.out.println(muncul2.berkembangbiak());
        System.out.println("========================");
        System.out.println("void");
        muncul.makana();
        muncul.berkembangbiakan();
        System.out.println("========================");
        muncul2.makana();
        muncul2.berkembangbiakan();
        
    }
    
}

