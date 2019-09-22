/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CharacterCreator;

import java.util.ArrayList;

/**
 *
 * @author Pumkin
 */
public class CharacterCreatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al = new ArrayList();
        al.add("");
        
        CharacterBuilder cb = new CharacterBuilder();
        ICharacter character = cb.setCost(0)
                               .setDps(0)
                               .setHp(0)
                               .setLevel(0)
                               .setName("new")
                               .setPlayerLevel(0)
                               .setSize(0)
                               .addImg("/h/j")
                               .addWeapon(new Weapon("", 0, 0, 0, 0, al))
                               .buildMecha();
        
        
        Controller controller = new Controller();
        
        controller.setName("Name");
        controller.setCost(10);
        controller.buildMecha();
        
        
    }
    
}
