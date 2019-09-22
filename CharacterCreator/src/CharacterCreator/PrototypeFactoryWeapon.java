/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;

import java.util.HashMap;

/**
 *
 * @author raque
 */
public class PrototypeFactoryWeapon {
    
     public static HashMap<Integer, IPrototypeCharacter> prototypesWeapons = new HashMap<>();
    
    public static Character getCloneWeapon(String weaponName){
        return prototypesWeapons.get(weaponName).deepClone();
    }
    
    public static void addWeapon(Integer number, IPrototypeCharacter prototype){
        prototypesWeapons.put(number, prototype);
    }
    
}
