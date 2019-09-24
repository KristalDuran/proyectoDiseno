/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CharacterCreator.ICharacter;
import CharacterCreator.IWeapon;
import CharacterCreator.Mecha;
import CharacterCreator.Weapon;
import Loader.MechaJsonLoader;
import Loader.WeapJsonLoader;
import com.bulenkov.darcula.DarculaLaf;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author Pumkin
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    private JLabel[][] p1Board = new JLabel[3][2];
    private JLabel[][] p2Board = new JLabel[3][2];
    private Controller controller = new Controller();
    
    private javax.swing.border.Border border = BorderFactory.createLineBorder(Color.yellow);
    
    /*player lists*/
    private List<ICharacter> playe1List = new ArrayList<>();
    private List<ICharacter> playe2List = new ArrayList<>();
    
    public GUI() {
        
        initComponents();
        for(ICharacter c : controller.getCharacterList()){
            comBoxCharList1.addItem(c.getName());
            comBoxCharList2.addItem(c.getName());
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        P1char_12 = new javax.swing.JLabel();
        P2char_11 = new javax.swing.JLabel();
        P2char_12 = new javax.swing.JLabel();
        P1char_11 = new javax.swing.JLabel();
        P2char_22 = new javax.swing.JLabel();
        P2char_21 = new javax.swing.JLabel();
        P1char_22 = new javax.swing.JLabel();
        P1char_21 = new javax.swing.JLabel();
        P2char_32 = new javax.swing.JLabel();
        P2char_31 = new javax.swing.JLabel();
        P1char_32 = new javax.swing.JLabel();
        P1char_31 = new javax.swing.JLabel();
        labelBg = new javax.swing.JLabel();
        comBoxCharList2 = new javax.swing.JComboBox<>();
        btnAddChar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneP2 = new javax.swing.JTextPane();
        comBoxWeaponP2 = new javax.swing.JComboBox<>();
        labelWeaponIcon2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textPaneP1 = new javax.swing.JTextPane();
        comBoxWeaponP1 = new javax.swing.JComboBox<>();
        labelWeaponIcon1 = new javax.swing.JLabel();
        labelAddRemove2 = new javax.swing.JLabel();
        comBoxAddRem2 = new javax.swing.JComboBox<>();
        btnRemove2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnRemove1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        comBoxAddRem1 = new javax.swing.JComboBox<>();
        labelAddRemove1 = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        comBoxCharList1 = new javax.swing.JComboBox<>();
        btnAddChar1 = new javax.swing.JButton();
        labelP1 = new javax.swing.JLabel();
        playerP2 = new javax.swing.JLabel();
        btnP1UpLvl = new javax.swing.JButton();
        btnP2UpLvl1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(915, 600));
        setSize(new java.awt.Dimension(915, 600));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        P1char_12.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[0][1] = P1char_12;
        P1char_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_12MouseClicked(evt);
            }
        });

        P2char_11.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[0][0] = P2char_11;
        P2char_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_11MouseClicked(evt);
            }
        });

        P2char_12.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[0][1] = P2char_12;
        P2char_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_12MouseClicked(evt);
            }
        });

        P1char_11.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[0][0] = P1char_11;
        P1char_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_11MouseClicked(evt);
            }
        });

        P2char_22.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[1][1] = P2char_22;
        P2char_22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_22MouseClicked(evt);
            }
        });

        P2char_21.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[1][0] = P2char_21;
        P2char_21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_21MouseClicked(evt);
            }
        });

        P1char_22.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[1][1] = P1char_22;
        P1char_22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_22MouseClicked(evt);
            }
        });

        P1char_21.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[1][0] = P1char_21;
        P1char_21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_21MouseClicked(evt);
            }
        });

        P2char_32.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[2][1] = P2char_32;
        P2char_32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_32MouseClicked(evt);
            }
        });

        P2char_31.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p2Board[2][0] = P2char_31;
        P2char_31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2char_31MouseClicked(evt);
            }
        });

        P1char_32.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[2][1] = P1char_32;
        P1char_32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_32MouseClicked(evt);
            }
        });

        P1char_31.setPreferredSize(new java.awt.Dimension(100, 100));
        this.p1Board[2][0] = P1char_31;
        P1char_31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1char_31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P1char_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P1char_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P2char_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(P2char_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(P1char_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P1char_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P2char_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(P1char_21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P1char_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(P2char_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P2char_22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2char_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2char_11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2char_12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2char_21, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2char_22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_21, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2char_31, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_32, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2char_32, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1char_31, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(200, 190, 500, 360);

        labelBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bgImg/bg.jpg"))); // NOI18N
        getContentPane().add(labelBg);
        labelBg.setBounds(150, 100, 600, 450);

        comBoxCharList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxCharList2ActionPerformed(evt);
            }
        });
        getContentPane().add(comBoxCharList2);
        comBoxCharList2.setBounds(580, 30, 170, 26);

        btnAddChar2.setText("Add");
        btnAddChar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddChar2);
        btnAddChar2.setBounds(580, 60, 60, 32);

        textPaneP2.setEditable(false);
        jScrollPane1.setViewportView(textPaneP2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(760, 100, 130, 290);

        comBoxWeaponP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comBoxWeaponP2ItemStateChanged(evt);
            }
        });
        comBoxWeaponP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxWeaponP2ActionPerformed(evt);
            }
        });
        getContentPane().add(comBoxWeaponP2);
        comBoxWeaponP2.setBounds(760, 400, 130, 26);

        labelWeaponIcon2.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(labelWeaponIcon2);
        labelWeaponIcon2.setBounds(770, 430, 30, 30);

        textPaneP1.setEditable(false);
        jScrollPane2.setViewportView(textPaneP1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 110, 130, 290);

        comBoxWeaponP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comBoxWeaponP1ItemStateChanged(evt);
            }
        });
        getContentPane().add(comBoxWeaponP1);
        comBoxWeaponP1.setBounds(10, 410, 130, 26);

        labelWeaponIcon1.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(labelWeaponIcon1);
        labelWeaponIcon1.setBounds(20, 440, 30, 30);

        labelAddRemove2.setText("Add / Remove Weapon");
        getContentPane().add(labelAddRemove2);
        labelAddRemove2.setBounds(760, 470, 130, 16);

        getContentPane().add(comBoxAddRem2);
        comBoxAddRem2.setBounds(760, 490, 130, 26);

        btnRemove2.setText("Remove");
        getContentPane().add(btnRemove2);
        btnRemove2.setBounds(810, 520, 80, 32);

        btnAdd2.setText("Add");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd2);
        btnAdd2.setBounds(760, 520, 52, 32);

        btnRemove1.setText("Remove");
        getContentPane().add(btnRemove1);
        btnRemove1.setBounds(60, 520, 80, 32);

        btnAdd1.setText("Add");
        getContentPane().add(btnAdd1);
        btnAdd1.setBounds(10, 520, 52, 32);

        getContentPane().add(comBoxAddRem1);
        comBoxAddRem1.setBounds(10, 490, 130, 26);

        labelAddRemove1.setText("Add / Remove Weapon");
        getContentPane().add(labelAddRemove1);
        labelAddRemove1.setBounds(10, 470, 130, 16);

        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bgImg/title.png"))); // NOI18N
        getContentPane().add(labelTitle);
        labelTitle.setBounds(370, 20, 150, 60);

        comBoxCharList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxCharList1ActionPerformed(evt);
            }
        });
        getContentPane().add(comBoxCharList1);
        comBoxCharList1.setBounds(150, 30, 170, 26);

        btnAddChar1.setText("Add");
        btnAddChar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddChar1);
        btnAddChar1.setBounds(260, 60, 60, 32);

        labelP1.setText("Player 1");
        getContentPane().add(labelP1);
        labelP1.setBounds(90, 30, 50, 20);

        playerP2.setText("Player 2");
        getContentPane().add(playerP2);
        playerP2.setBounds(770, 30, 50, 20);

        btnP1UpLvl.setText("Level+1");
        getContentPane().add(btnP1UpLvl);
        btnP1UpLvl.setBounds(60, 440, 77, 32);

        btnP2UpLvl1.setText("Level+1");
        getContentPane().add(btnP2UpLvl1);
        btnP2UpLvl1.setBounds(820, 430, 74, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P2char_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_11MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_11.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(0));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(0).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }                                     

    }//GEN-LAST:event_P2char_11MouseClicked

    private void comBoxCharList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxCharList2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxCharList2ActionPerformed

    private void comBoxCharList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxCharList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxCharList1ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void comBoxWeaponP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxWeaponP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxWeaponP2ActionPerformed

    private void btnAddChar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChar1ActionPerformed
        try {
            int[] xy = controller.getP1BoardXY();
            if(xy[0] != 4){
                String path = controller.getCharacterImg((String)comBoxCharList1.getSelectedItem());
                BufferedImage img = ImageIO.read(new File(path));
                p1Board[xy[0]][xy[1]].setIcon(new ImageIcon(img));
                playe1List.add(controller.getCharacter((String)comBoxCharList1.getSelectedItem()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_btnAddChar1ActionPerformed

    private void btnAddChar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChar2ActionPerformed
        try {
            int[] xy = controller.getP2BoardXY();
            if(xy[0] != 4){
                String path = controller.getCharacterImg((String)comBoxCharList2.getSelectedItem());
                BufferedImage img = ImageIO.read(new File(path));
                p2Board[xy[0]][xy[1]].setIcon(new ImageIcon(img));
                playe2List.add(controller.getCharacter((String)comBoxCharList2.getSelectedItem()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_btnAddChar2ActionPerformed

    private void P1char_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_11MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_11.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(0));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(0).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_P1char_11MouseClicked

    private void P1char_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_12MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_12.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(1));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(1).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_P1char_12MouseClicked

    private void comBoxWeaponP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comBoxWeaponP1ItemStateChanged
        try{
            if(comBoxWeaponP1.getSelectedItem() != null){
                String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
                BufferedImage img = ImageIO.read(new File(path));
                labelWeaponIcon1.setIcon(new ImageIcon(img));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comBoxWeaponP1ItemStateChanged

    private void P1char_21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_21MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_21.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(2));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(2).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_P1char_21MouseClicked

    private void P1char_22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_22MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_22.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(3));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(3).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_P1char_22MouseClicked

    private void P1char_31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_31MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_31.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(4));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(4).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_P1char_31MouseClicked

    private void P1char_32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1char_32MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p1Board[i][j].setBorder(null);
            } 
        }
        P1char_32.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe1List.get(5));
        textPaneP1.setText("");
        textPaneP1.setText(characterInfo);
        comBoxWeaponP1.removeAllItems();
        for(IWeapon i : playe1List.get(5).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP1.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP1.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon1.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_P1char_32MouseClicked

    private void comBoxWeaponP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comBoxWeaponP2ItemStateChanged
        try{
            if(comBoxWeaponP2.getSelectedItem() != null){
                String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
                BufferedImage img = ImageIO.read(new File(path));
                labelWeaponIcon2.setIcon(new ImageIcon(img));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comBoxWeaponP2ItemStateChanged

    private void P2char_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_12MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_12.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(1));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(1).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_P2char_12MouseClicked

    private void P2char_21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_21MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_21.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(2));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(2).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_P2char_21MouseClicked

    private void P2char_22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_22MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_22.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(3));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(3).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_P2char_22MouseClicked

    private void P2char_31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_31MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_31.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(4));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(4).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_P2char_31MouseClicked

    private void P2char_32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2char_32MouseClicked
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                p2Board[i][j].setBorder(null);
            } 
        }
        P2char_32.setBorder(this.border);
        String characterInfo = controller.getCharacterInfo(playe2List.get(5));
        textPaneP2.setText("");
        textPaneP2.setText(characterInfo);
        comBoxWeaponP2.removeAllItems();
        for(IWeapon i : playe2List.get(5).getWeapons()){
            Weapon w = (Weapon) i;
            comBoxWeaponP2.addItem(w.getName());
        }
        try{
            String path = controller.getWeaponImg((String)comBoxWeaponP2.getSelectedItem());
            BufferedImage img = ImageIO.read(new File(path));
            labelWeaponIcon2.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_P2char_32MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Set the Darcula look and feel */
        
        BasicLookAndFeel darcula = new DarculaLaf();
        UIManager.setLookAndFeel(darcula);

        /* Initial code */   
            
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1char_11;
    private javax.swing.JLabel P1char_12;
    private javax.swing.JLabel P1char_21;
    private javax.swing.JLabel P1char_22;
    private javax.swing.JLabel P1char_31;
    private javax.swing.JLabel P1char_32;
    private javax.swing.JLabel P2char_11;
    private javax.swing.JLabel P2char_12;
    private javax.swing.JLabel P2char_21;
    private javax.swing.JLabel P2char_22;
    private javax.swing.JLabel P2char_31;
    private javax.swing.JLabel P2char_32;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAddChar1;
    private javax.swing.JButton btnAddChar2;
    private javax.swing.JButton btnP1UpLvl;
    private javax.swing.JButton btnP2UpLvl1;
    private javax.swing.JButton btnRemove1;
    private javax.swing.JButton btnRemove2;
    private javax.swing.JComboBox<String> comBoxAddRem1;
    private javax.swing.JComboBox<String> comBoxAddRem2;
    private javax.swing.JComboBox<String> comBoxCharList1;
    private javax.swing.JComboBox<String> comBoxCharList2;
    private javax.swing.JComboBox<String> comBoxWeaponP1;
    private javax.swing.JComboBox<String> comBoxWeaponP2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAddRemove1;
    private javax.swing.JLabel labelAddRemove2;
    private javax.swing.JLabel labelBg;
    private javax.swing.JLabel labelP1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelWeaponIcon1;
    private javax.swing.JLabel labelWeaponIcon2;
    private javax.swing.JLabel playerP2;
    private javax.swing.JTextPane textPaneP1;
    private javax.swing.JTextPane textPaneP2;
    // End of variables declaration//GEN-END:variables
}
