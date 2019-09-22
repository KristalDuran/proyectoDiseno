/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;

/**
 *
 * @author kduran
 */
public class Controller {
    CharacterBuilder builder;
    
    public Controller(){
        builder = new CharacterBuilder();
    }

    
    public ICharacter getCharacter(String type){
        ICharacter character = Factory.getCharacter(type);
        this.builder.repairCharacter(character);
        return character;
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
