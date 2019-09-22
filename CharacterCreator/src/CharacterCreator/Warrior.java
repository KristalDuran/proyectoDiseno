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
public class Warrior extends ICharacter implements IPrototypeCharacter{
    
    private String name;
    private int level;
    private double hp; //health points
    private double dps; //damage per second
    private int cost;
    private int size;
    private int playerLevel;
    private List<Weapon> weapons = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();

    public Warrior(){
        
    }
    
    public Warrior(String name, int level, double hp, double dps, int cost, 
            int size, int playerLevel, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dps = dps;
        this.cost = cost;
        this.size = size;
        this.playerLevel = playerLevel;
        this.imgPaths = imgPaths;
    }
    public Warrior(String name, int level, double hp, double dps, int cost, 
            int size, int playerLevel,List<Weapon> weapons, List<String> imgPaths) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.dps = dps;
        this.cost = cost;
        this.size = size;
        this.playerLevel = playerLevel;
        this.weapons = weapons;
        this.imgPaths = imgPaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDps() {
        return dps;
    }

    public void setDps(double dps) {
        this.dps = dps;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<String> getImgPath() {
        return imgPaths;
    }

    public void setImgPath(List<String> imgPath) {
        this.imgPaths = imgPath;
    }

    @Override
    public IPrototypeCharacter clone() {
        return new Warrior(this.name,this.level, this.hp, this.dps, this.cost,
        this.size, this.playerLevel, this.weapons, this.imgPaths);
    }

    @Override
    public IPrototypeCharacter deepClone() {
         List<Weapon> newWeapons = new ArrayList<>();
         List<String> newImgPaths = new ArrayList<>();
         for (Weapon weapon : this.weapons) {
            newWeapons.add(new Weapon(weapon.getName(), weapon.getLevel(), 
                    weapon.getDamage(), weapon.getReach(), weapon.getAoe(), weapon.getImgPath()));
        }
        for (String imagen : this.imgPaths) {
            newImgPaths.add(new String(imagen));
        }
        return new Warrior(this.name,this.level, this.hp, this.dps, this.cost,
        this.size, this.playerLevel, newWeapons, newImgPaths);
    }

    @Override
    public String toString() {
        return "Warrior{" + "name=" + name + ", level=" + level + ", hp=" + hp + ", dps=" + dps + ", cost=" + cost + ", size=" + size + ", playerLevel=" + playerLevel + ", weapons=" + weapons + ", imgPaths=" + imgPaths + '}';
    }
    
    
    
}
