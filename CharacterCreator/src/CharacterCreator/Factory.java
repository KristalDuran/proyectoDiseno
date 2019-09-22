package CharacterCreator;


import CharacterCreator.CharacterBuilder;
import CharacterCreator.ICharacter;
import CharacterCreator.Warrior;
import CharacterCreator.Weapon;
import java.util.ArrayList;
import java.util.List;
import sun.java2d.Disposer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kduran
 */
public class Factory {
    
    
    public static ICharacter getCharacter(String key){
        return new Warrior(); //aqui se llamaria a prototype
    }
    
    // agrega imagenes o armas 
//    public static ICharacter addCharacter(ICharacter character, ArrayList<Object> objest){
//        for (Object object : objest) {
//            if (object instanceof String) {
//                character.getImgPaths().add((String)object);
//            }
//            if (object instanceof Weapon) {
//                character.getWeapons().add((Weapon)object);
//            }
//        }
//        return character;
//    }
    
    // llamar al de clonar y hace set de los datos que se quieran modificar (todos opcionales), excluyendo fotos y armas
//    public static ICharacter clonar(int keyCharacter, String pName, int pLeve, double pHp, double pDps, int pCost, int pSize, int pPlayerLevel){
//        // clono el ICharacter con el key recibido
//        // hago switch que sabe si es uno o e otro 
//        // el objeto nuevo le cambio los datos
//        ICharacter c = new Warrior();
//        c.setCost((pCost == 0)?c.getCost():pCost);
//        c.setName((pName == null || pName == "")?c.getName():pName);
//        c.setDps((pDps == 0)?c.getDps():pDps);
//        c.setHp((pHp == 0)?c.getHp():pHp);
//        c.setLevel((pLeve == 0)?c.getLevel():pLeve);
//        c.setPlayerLevel((pPlayerLevel == 0)?c.getPlayerLevel():pPlayerLevel);
//        c.setSize((pSize == 0)?c.getSize():pSize);
//        return c;
//    }
//    
//    // new character
//    public static ICharacter addCharacter(String type, String name){
//        
//        switch(type){
//            case "mecha":
//                return cb.buildMecha();
//            case "warrior":
//                return cb.buildWarrior();
//        }
//        return null;
//    }
//    
//    private static CharacterBuilder addObjects(CharacterBuilder character, ArrayList<Object> objects){
//        for (Object object : objects) {
//            if (object instanceof String) {
//                character.addImg((String)object);
//            }
//            if (object instanceof Weapon) {
//                character.addWeapon((Weapon)object);
//            }
//        }
//        return character;
//    }
}
