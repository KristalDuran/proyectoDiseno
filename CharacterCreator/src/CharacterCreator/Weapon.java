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
public class Weapon implements IWeapon{
    
    private String name;
    private int level;
    private float damage;
    private int reach;
    private int aoe; //area of effect
    private List<String> imgPaths = new ArrayList<>();
    
    private Weapon(){
        
    }

    public Weapon(String name, int level, float damage, int reach, int aoe, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.reach = reach;
        this.aoe = aoe;
        this.imgPaths = imgPaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAoe() {
        return aoe;
    }

    public void setAoe(int aoe) {
        this.aoe = aoe;
    }

    public List<String> getImgPath() {
        return imgPaths;
    }

    public void setImgPath(List<String> imgPath) {
        this.imgPaths = imgPath;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", level=" + level + ", damage=" + damage + ", reach=" + reach + ", aoe=" + aoe + ", imgPaths=" + imgPaths + '}';
    }
    
    
    
}
