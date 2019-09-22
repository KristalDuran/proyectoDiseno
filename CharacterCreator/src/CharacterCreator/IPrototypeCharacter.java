/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;



/**
 *
 * @author raque
 */
public interface IPrototypeCharacter<T extends Character> extends Cloneable {
    
    public T clone();
    public T deepClone();
    
}
