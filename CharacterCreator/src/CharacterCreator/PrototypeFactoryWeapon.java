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
    
     public static HashMap<String, IPrototypeWeapon> prototypesWeapons = new HashMap<>();
    
    public static Weapon getCloneWeapon(String weaponName){
        return (Weapon) prototypesWeapons.get(weaponName).deepClone();
    }
    
    public static void addWeapon(String name, IPrototypeWeapon prototype){
        prototypesWeapons.put(name, prototype);
    }
    
}
