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
 * @author kduran
 */
public class CharacterBuilder implements IBuilder<ICharacter>{
    private String name;
    private int level;
    private double hp; //health points
    private double dps; //damage per second
    private int cost;
    private int size;
    private int playerLevel;
    private List<Weapon> weapons = new ArrayList<>();
    private List<String> imgPaths = new ArrayList<>();
    
    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public CharacterBuilder setHp(double hp) {
        this.hp = hp;
        return this;
    }

    public CharacterBuilder setDps(double dps) {
        this.dps = dps;
        return this;
    }

    public CharacterBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public CharacterBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public CharacterBuilder setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
        return this;
    }
    
    public CharacterBuilder addImg(String imgPath) {
        this.imgPaths.add(imgPath);
        return this;
    }
    
    public CharacterBuilder addWeapon(Weapon weapon) {
        this.weapons.add(weapon);
        return this;
    }
    
    public CharacterBuilder repairCharacter(ICharacter character){
        this.name = character.getName();
        this.level = character.getLevel();
        this.hp = character.getHp(); //health points
        this.dps = character.getDps(); //damage per second
        this.cost = character.getCost();
        this.size = character.getSize();
        this.playerLevel = character.getPlayerLevel();
        this.imgPaths = character.getImgPaths();
        this.weapons = character.getWeapons();
        return this;
    }
    
    @Override
    public ICharacter buildMecha() {
        return new Mecha(name, level, hp, dps, cost, size, playerLevel, imgPaths);
    }
    
    @Override
    public ICharacter buildWarrior() {
        return new Warrior(name, level, hp, dps, cost, size, playerLevel, imgPaths);
    }
    
}
