/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import CharacterCreator.ICharacter;
import CharacterCreator.IWeapon;
import CharacterCreator.Mecha;
import CharacterCreator.Warrior;
import CharacterCreator.Weapon;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Pumkin
 */
public class WarrJsonLoader implements ICharacterLoader{

    private List<IWeapon> weapons = new ArrayList<>(); 
    
    public WarrJsonLoader(List<IWeapon> weapons) {
        this.weapons = weapons;
    }
    
    @Override
    public List<ICharacter> load(String fileName) {
        
        List<ICharacter> characterList = new ArrayList<>();
        
        try {
            JSONParser parser = new JSONParser();
            JSONArray a = (JSONArray) parser.parse(new FileReader(fileName));
            
            for (Object o : a){
                
                List<String> imgPaths = new ArrayList<>();
                List<Weapon> weaponsList = new ArrayList<>();
                
                JSONObject mecha = (JSONObject) o;
                JSONArray imgs = (JSONArray) mecha.get("imgPaths");
                JSONArray weaps = (JSONArray) mecha.get("weapons");
                for (Object i : imgs){
                    imgPaths.add((String) i);
                }
                for (Object w : weaps){
                    for (IWeapon weapon : weapons){
                        Weapon x = (Weapon) weapon;
                        if(x.getName().equals((String)w)){
                            weaponsList.add(x);
                        }
                        
                    }
                }                 
                ICharacter c = new Warrior(
                        (String) mecha.get("name"), 
                        ((Long)mecha.get("level")).intValue(), 
                        ((Double)mecha.get("hp")),
                        ((Double)mecha.get("dps")), 
                        ((Long)mecha.get("cost")).intValue(),
                        ((Long)mecha.get("level")).intValue(),
                        ((Long)mecha.get("level")).intValue(),
                        imgPaths);
                
                c.setImgPaths(imgPaths);
                c.setWeapons(weaponsList);
                characterList.add(c);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return characterList;
    }


    
}