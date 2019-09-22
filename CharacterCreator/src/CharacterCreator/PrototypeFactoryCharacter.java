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
public class PrototypeFactoryCharacter {
    
     public static HashMap<Integer, IPrototypeCharacter> prototypesCharacter = new HashMap<>();
    
    public static Character getCloneCharacter(String characterName){
        return prototypesCharacter.get(characterName).deepClone();
    }
    
    public static void addCharacter(Integer number, IPrototypeCharacter prototype){
        prototypesCharacter.put(number, prototype);
    } 
    
}
