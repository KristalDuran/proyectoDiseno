/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pumkin
 */
public class CharacterCreatorMain {
    public static List<String> imgPaths = new ArrayList<String>();
    public static List<Weapon> weapons = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    
        imgPaths.add("hello world");
        imgPaths.add("hola mundo");

        Weapon w1= new Weapon("a", 55, 50.0, 1, 5,imgPaths );
        Weapon w2= new Weapon("b", 55, 50.0, 1, 5,imgPaths );
        Weapon w3= new Weapon("c", 55, 50.0, 1, 5,imgPaths );
        Weapon w4= new Weapon("d", 55, 50.0, 1, 5,imgPaths );
        weapons.add(w1); 
        weapons.add(w2); 

        PrototypeFactoryWeapon.addWeapon("a", w1);
        PrototypeFactoryWeapon.addWeapon("b", w2);
        PrototypeFactoryWeapon.addWeapon("c", w3);
        PrototypeFactoryWeapon.addWeapon("d", w4);
        
        
        Warrior wa1 = new Warrior("andaluz", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Warrior wa2 = new Warrior("sr dark", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Warrior wa3 = new Warrior("king dark", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Mecha me1 = new Mecha("la brithany", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Mecha me2 = new Mecha("la nathasha", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Mecha me3 = new Mecha("la kimberly", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
        Mecha me4 = new Mecha("el brayan", 1, 100.00, 15.02, 600, 4, 1, weapons, imgPaths);
      
        PrototypeFactoryCharacter.addCharacter("andaluz", wa1);
        PrototypeFactoryCharacter.addCharacter("sr dark", wa2);
        PrototypeFactoryCharacter.addCharacter("king dark", wa3);
        PrototypeFactoryCharacter.addCharacter("la brithany", me1);
        PrototypeFactoryCharacter.addCharacter("la nathasha", me2);
        PrototypeFactoryCharacter.addCharacter("la kimberly", me3);
        PrototypeFactoryCharacter.addCharacter("el brayan", me4);
        
        
        
        System.out.println("ESTOY CLONANDO LOS PERSONAJES");
        ICharacter cha = PrototypeFactoryCharacter.getCloneCharacter("andaluz");
        ICharacter cha1 = PrototypeFactoryCharacter.getCloneCharacter("king dark");
        ICharacter cha2 = PrototypeFactoryCharacter.getCloneCharacter("la nathasha");
        ICharacter cha3 = PrototypeFactoryCharacter.getCloneCharacter("el brayan");
        System.out.println("1 "+cha.toString());
        System.out.println("2 "+cha1.toString());
        System.out.println("3 "+cha2.toString());
        System.out.println("4 "+cha3.toString());
        
         System.out.println("ESTOY CLONANDO LAS ARMAS");
        IWeapon we1 = PrototypeFactoryWeapon.getCloneWeapon("a");
        IWeapon we2 = PrototypeFactoryWeapon.getCloneWeapon("b");
        IWeapon we3 = PrototypeFactoryWeapon.getCloneWeapon("d");
     
         System.out.println("1 "+we1.toString());
         System.out.println("2 "+we2.toString());
         System.out.println("3 "+we3.toString());
        
        
        
        

    
     
    }
    
 
    
}
