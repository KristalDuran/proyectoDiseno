/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loader;

import CharacterCreator.ICharacter;
import CharacterCreator.IWeapon;
import CharacterCreator.Weapon;
import java.util.List;
import org.json.simple.*;
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Pumkin
 */
public class WeapJsonLoader implements IWeaponLoader{

    public WeapJsonLoader() {
    }

    
    @Override
    public List<IWeapon> load(String fileName) {
                
        List<IWeapon> weaponList = new ArrayList<>();
        
        try {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));
            
            for (Object obj : jsonArray){
                
                List<String> imgPaths = new ArrayList<>();
                
                JSONObject weapon = (JSONObject) obj;
                JSONArray imgs = (JSONArray) weapon.get("imgPaths");
                for (Object i : imgs){
                    imgPaths.add((String) i);
                }
                IWeapon w = (IWeapon) new Weapon(
                        (String) weapon.get("name"),
                        ((Long)weapon.get("level")).intValue(),
                        (float)((Long)weapon.get("damage")),
                        ((Long)weapon.get("reach")).intValue(),
                        ((Long)weapon.get("aoe")).intValue(),
                        imgPaths);
                weaponList.add(w);
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return weaponList;
        
    }
    
}
