/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CharacterCreator.CharacterBuilder;
import CharacterCreator.ICharacter;
import CharacterCreator.IWeapon;
import CharacterCreator.Mecha;
import Loader.MechaJsonLoader;
import Loader.WeapJsonLoader;
import java.util.ArrayList;
import java.util.List;
import CharacterCreator.CharacterBuilder;
import PrototypePattern.PrototypeFactoryCharacter;
import PrototypePattern.PrototypeFactoryWeapon;
import CharacterCreator.Warrior;
import CharacterCreator.Weapon;
import Loader.WarrJsonLoader;
import CharacterCreator.IPrototypeCharacter;

/**
 *
 * @author Pumkin
 */
public class Controller {
    
    private int[][] p1Board = new int[3][2];
    private int[][] p2Board = new int[3][2];
    private List<ICharacter> characterList = new ArrayList<>();
    private List<IWeapon> weaponList = new ArrayList<>();
    /*player lists*/
    private List<ICharacter> playe1List = new ArrayList<>();
    private List<ICharacter> playe2List = new ArrayList<>();
    /*builder*/
    private CharacterBuilder builder;
    
    public Controller(){
        builder = new CharacterBuilder();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j] = 0;
                p2Board[i][j] = 0;
            } 
        }
        
        /*generate weapons and characters list*/
        WeapJsonLoader weapJsonLoad = new WeapJsonLoader();
        weaponList = weapJsonLoad.load("src\\resources\\weapons.json");

        MechaJsonLoader mechaJsonLoad = new MechaJsonLoader(weaponList);
        List<ICharacter> mechaList = mechaJsonLoad.load("src\\resources\\mecha.json");
        
        for(ICharacter m : mechaList){
            characterList.add(m);
        }
        
        WarrJsonLoader warrJsonLoad = new WarrJsonLoader(weaponList);
        List<ICharacter> warrList = warrJsonLoad.load("src\\resources\\warrior.json");
        
        for(ICharacter w : warrList){
            characterList.add(w);
        }
        
        /*Add weapons and characters to prototype factory*/
        for(IWeapon x : weaponList){
            Weapon w = (Weapon) x;
            PrototypeFactoryWeapon.addWeapon(w.getName(), w);
        }
        for(ICharacter c : characterList){
            PrototypeFactoryCharacter.addCharacter(c.getName(), (IPrototypeCharacter) c);
        }
    }

    public String getWeaponImg(String name){
        String imgPath = "";
        for(IWeapon i : weaponList){
            Weapon w = (Weapon)i;          
            if(w.getName() == name){
                imgPath = w.getImgPath().get(0);
            }
        }
        return imgPath;
    }
    
    public String getCharacterImg(String name){
        String imgPath = "";
        for(ICharacter c : characterList){
            if(c.getName() == name){
                imgPath = c.getImgPaths().get(0);
            }
        }
        return imgPath;
    }
    
    public int[][] getP1Board() {
        return p1Board;
    }

    public void setP1Board(int[][] p1Board) {
        this.p1Board = p1Board;
    }

    public int[][] getP2Board() {
        return p2Board;
    }

    public void setP2Board(int[][] p2Board) {
        this.p2Board = p2Board;
    }

    public List<ICharacter> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<ICharacter> characterList) {
        this.characterList = characterList;
    }

    public List<IWeapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<IWeapon> weaponList) {
        this.weaponList = weaponList;
    }
    
    
    public int[] getP1BoardXY(){
        int[] xy = new int[2];
        if(p1Board[2][1] == 1){
            xy[0] = 4;
            xy[1] = 4;
            return xy;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(p1Board[i][j] == 0){
                   xy[0] = i;
                   xy[1] = j;
                   p1Board[i][j] = 1;
                   return xy;
                }
            } 
        }
        return xy;
    }
    
    public int[] getP2BoardXY(){
        int[] xy = new int[2];
        if(p2Board[2][1] == 1){
            xy[0] = 4;
            xy[1] = 4;
            return xy;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                if(p2Board[i][j] == 0){
                   xy[0] = i;
                   xy[1] = j;
                   p2Board[i][j] = 1;
                   return xy;
                }
            } 
        }
        return xy;
    }
    
    public String getCharacterInfo(ICharacter c){
        String info = 
                "Name: " + c.getName() + "\n" +
                "Level: " + c.getLevel() + "\n" +
                "Health Points: " + c.getHp() + "\n" +
                "Dps: " + c.getDps() + "\n" + 
                "Cost: " + c.getCost();
        return info;
    }
    
    public ICharacter getCharacter(String key){
        ICharacter character = PrototypeFactoryCharacter.getCloneCharacter(key);
        this.builder.repairCharacter(character);
        return character;
    }

    public IWeapon getWeapon(String key){
        return PrototypeFactoryWeapon.getCloneWeapon(key);
    }
    
    public void setName(String name) {
        this.builder = builder.setName(name);
    }

    public void setLevel(int level) {
        this.builder = builder.setLevel(level);
    }

    public void setHp(double hp) {
        this.builder = builder.setHp(hp);
    }

    public void setDps(double dps) {
        this.builder = builder.setDps(dps);
    }

    public void setCost(int cost) {
        this.builder = builder.setCost(cost);
    }

    public void setSize(int size) {
        this.builder = builder.setSize(size);
    }

    public void setPlayerLevel(int playerLevel) {
        this.builder = builder.setPlayerLevel(playerLevel);
    }
    
    public void addImg(String imgPath){
        this.builder = builder.addImg(imgPath);
    }
    
    public void addWeapon(Weapon weapon){
        this.builder = builder.addWeapon(weapon);
    }
    
    public Warrior buildWarrior(){
        return (Warrior) builder.buildWarrior();
    }
    
    public Mecha buildMecha(){
        return (Mecha) builder.buildMecha();
    }
    
}
