/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import CharacterCreator.ICharacter;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Pumkin
 */
public interface ICharacterLoader {
    
    public List<ICharacter> load(String fileName);
    
}
