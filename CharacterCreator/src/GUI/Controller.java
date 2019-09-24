/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CharacterCreator.ICharacter;
import CharacterCreator.IWeapon;
import CharacterCreator.Mecha;
import Loader.MechaJsonLoader;
import Loader.WeapJsonLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pumkin
 */
public class Controller {
    
    private int[][] p1Board = new int[3][2];
    private int[][] p2Board = new int[3][2];
    private List<ICharacter> characterList = new ArrayList<>();
    private List<IWeapon> weaponList = new ArrayList<>();
    
    public Controller(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j] = 0;
                p2Board[i][j] = 0;
            } 
        }
        
        /*generate weapons and characters list*/
        WeapJsonLoader weapJsonLoad = new WeapJsonLoader();
        List<IWeapon> weaponList = weapJsonLoad.load("src\\resources\\weapons.json");
        
        MechaJsonLoader mechaJsonLoad = new MechaJsonLoader(weaponList);
        List<ICharacter> mechaList = mechaJsonLoad.load("src\\resources\\mecha.json");
        
        for(ICharacter m : mechaList){
            characterList.add(m);
        }
        
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
    
    
    
}
