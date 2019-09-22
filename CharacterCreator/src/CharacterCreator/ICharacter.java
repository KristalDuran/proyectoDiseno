/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pumkin
 */
public abstract class ICharacter {
    
    private String name;
    private int level;
    private double hp; //health points
    private double dps; //damage per second
    private int cost;
    private int size;
    private int playerLevel;
    private List<Weapon> weapons = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();

    
    

   
}
