/*
 * Peter Horne-Deus 
 * MamaJunesChicken.java
 * This is a buying calculator for a chicken shop
 * October 4,2018
 */

package MamaJune;

/**
 *
 * @author pehor9164
 */
import java.text.*;

public class MamaJunesChicken extends javax.swing.JFrame {
    // Globally declared variables...
        int numSandwich,numFingers,numWings,numStirfry,numBBQ,numFries,numBurgers,numHot;
        double before,withTax,cost,saving;
    
    
    public MamaJunesChicken() {
        initComponents();
        
        sandwichTxtField.setText("0");
        fingerTxtField.setText("0");
        wingsTxtField.setText("0");
        stirTxtField.setText("0");
        BBQWingsTxtFeild.setText("0");
        friesTxtField.setText("0");
        burgerTxtField.setText("0");
        hotTxtField.setText("0");
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backingPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        sloganLbl = new javax.swing.JLabel();
        sandwichLbl = new javax.swing.JLabel();
        fingerLbl = new javax.swing.JLabel();
        wingLbl = new javax.swing.JLabel();
        stirLbl = new javax.swing.JLabel();
        bbqWingLbl = new javax.swing.JLabel();
        friLbl = new javax.swing.JLabel();
        burgerLbl = new javax.swing.JLabel();
        hotLbl = new javax.swing.JLabel();
        hotTxtField = new javax.swing.JTextField();
        sandwichTxtField = new javax.swing.JTextField();
        fingerTxtField = new javax.swing.JTextField();
        wingsTxtField = new javax.swing.JTextField();
        stirTxtField = new javax.swing.JTextField();
        BBQWingsTxtFeild = new javax.swing.JTextField();
        friesTxtField = new javax.swing.JTextField();
        burgerTxtField = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        priceBefore = new javax.swing.JLabel();
        taxLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        instuctionsLbl = new javax.swing.JLabel();
        dealLbl = new javax.swing.JLabel();
        savingsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backingPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setFont(new java.awt.Font("SouvenirGreek Lt BT", 0, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(204, 0, 0));
        titleLbl.setText("Mama June's Southwest Chicken");
        backingPnl.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        sloganLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sloganLbl.setText("Home of the best fried chinken this side of the Kentucky");
        backingPnl.add(sloganLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        sandwichLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        sandwichLbl.setText("Chicken Sandwich $5.25");
        backingPnl.add(sandwichLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        fingerLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        fingerLbl.setText("Chicken Fingers  $3.75");
        backingPnl.add(fingerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        wingLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        wingLbl.setText("Chicken Wings    $6.99 ");
        backingPnl.add(wingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        stirLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        stirLbl.setText("Chicken StirFry  $7.50");
        backingPnl.add(stirLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        bbqWingLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        bbqWingLbl.setText("BBQ Chicken Wings    $3.75");
        backingPnl.add(bbqWingLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        friLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        friLbl.setText("Chicken Fries        $6.25");
        backingPnl.add(friLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 190, -1));

        burgerLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        burgerLbl.setText("Chicken Burger       $5.25");
        backingPnl.add(burgerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        hotLbl.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        hotLbl.setText("Hot Chicken Wings    $4.00");
        backingPnl.add(hotLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        hotTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hotTxtFieldFocusLost(evt);
            }
        });
        hotTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hotTxtFieldMousePressed(evt);
            }
        });
        hotTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(hotTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 50, -1));

        sandwichTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sandwichTxtFieldFocusLost(evt);
            }
        });
        sandwichTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sandwichTxtFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sandwichTxtFieldMousePressed(evt);
            }
        });
        sandwichTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwichTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(sandwichTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 50, -1));

        fingerTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fingerTxtFieldFocusLost(evt);
            }
        });
        fingerTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fingerTxtFieldMousePressed(evt);
            }
        });
        fingerTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fingerTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(fingerTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 50, -1));

        wingsTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wingsTxtFieldFocusLost(evt);
            }
        });
        wingsTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wingsTxtFieldMousePressed(evt);
            }
        });
        wingsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wingsTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(wingsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        stirTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stirTxtFieldFocusLost(evt);
            }
        });
        stirTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                stirTxtFieldMousePressed(evt);
            }
        });
        stirTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stirTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(stirTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, -1));

        BBQWingsTxtFeild.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BBQWingsTxtFeildFocusLost(evt);
            }
        });
        BBQWingsTxtFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BBQWingsTxtFeildMousePressed(evt);
            }
        });
        BBQWingsTxtFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBQWingsTxtFeildActionPerformed(evt);
            }
        });
        backingPnl.add(BBQWingsTxtFeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, -1));

        friesTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                friesTxtFieldFocusLost(evt);
            }
        });
        friesTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                friesTxtFieldMousePressed(evt);
            }
        });
        friesTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(friesTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 50, -1));

        burgerTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                burgerTxtFieldFocusLost(evt);
            }
        });
        burgerTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                burgerTxtFieldMousePressed(evt);
            }
        });
        burgerTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerTxtFieldActionPerformed(evt);
            }
        });
        backingPnl.add(burgerTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 50, -1));

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        backingPnl.add(calculateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        priceBefore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        priceBefore.setText("Price Before Tax:       ");
        backingPnl.add(priceBefore, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));

        taxLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taxLbl.setText("Tax:    ");
        backingPnl.add(taxLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 140, -1));

        totalLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        totalLbl.setText("Total:       ");
        backingPnl.add(totalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 120, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitBtn.setText("X");
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        backingPnl.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 0, 50, 30));

        resetBtn.setBackground(new java.awt.Color(255, 255, 255));
        resetBtn.setForeground(new java.awt.Color(204, 204, 204));
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MamaJune/672406-refresh-128.png"))); // NOI18N
        resetBtn.setBorderPainted(false);
        resetBtn.setContentAreaFilled(false);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        backingPnl.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        instuctionsLbl.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        instuctionsLbl.setForeground(new java.awt.Color(204, 0, 0));
        instuctionsLbl.setText("Add in what you would like to order and press calculate for the price ");
        backingPnl.add(instuctionsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        dealLbl.setText("On orders of $25 or more get 10% off");
        backingPnl.add(dealLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        savingsLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        savingsLbl.setText("Savings:");
        backingPnl.add(savingsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backingPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backingPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hotTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotTxtFieldActionPerformed

    private void sandwichTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwichTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sandwichTxtFieldActionPerformed

    private void fingerTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fingerTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fingerTxtFieldActionPerformed

    private void wingsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wingsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wingsTxtFieldActionPerformed

    private void stirTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stirTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stirTxtFieldActionPerformed

    private void BBQWingsTxtFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBQWingsTxtFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BBQWingsTxtFeildActionPerformed

    private void friesTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friesTxtFieldActionPerformed

    private void burgerTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burgerTxtFieldActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        //Creating a decimal format
        DecimalFormat money = new DecimalFormat("$###,###.##");
        
       
       
        //Creating constents
        final double TAX = 0.13;
        final double SANDWICH_PRICE = 5.25;
        final double FINGERS_PRICE = 3.75;
        final double WINGS_PRICE = 6.99;
        final double STIRFRY_PRICE = 7.50;
        final double BBQ_PRICE = 3.75;
        final double FRIES_PRICE = 6.25;
        final double BURGER_PRICE = 5.25;
        final double HOT_PRICE = 4.00;
        final double SAVINGS_OFF = 0.10;
        
        //Giving variables the value of the user input
        numSandwich = Integer.parseInt(sandwichTxtField.getText());
        numFingers = Integer.parseInt(fingerTxtField.getText());
        numWings = Integer.parseInt(wingsTxtField.getText());
        numStirfry = Integer.parseInt(stirTxtField.getText());
        numBBQ = Integer.parseInt(BBQWingsTxtFeild.getText());
        numFries = Integer.parseInt(friesTxtField.getText());
        numBurgers = Integer.parseInt(burgerTxtField.getText());
        numHot = Integer.parseInt(hotTxtField.getText());
        
        //Alugerithem to calculate different levels of the cost
        before = (SANDWICH_PRICE*numSandwich) + (FINGERS_PRICE*numFingers ) + (WINGS_PRICE*numWings) + (STIRFRY_PRICE*numStirfry) + (BBQ_PRICE*numBBQ) + (FRIES_PRICE*numFries) + (BURGER_PRICE*numBurgers) + (HOT_PRICE*numHot);
        withTax = before * TAX;
        cost = before + withTax;
        
        //Caculating total savings
        if (cost >= 25){
        saving = cost * SAVINGS_OFF;
        cost = cost - saving;
        }
        else {
            saving = 0;
        }
        
        //Output of costs
        taxLbl.setText("Tax: " + money.format(withTax));
        priceBefore.setText("Price Before Tax: " + money.format(before));
        totalLbl.setText("Total " + money.format(cost));
        savingsLbl.setText("Savings: " + money.format(saving));
        
        //Reseting program for another use
        sandwichTxtField.setText("0");
        fingerTxtField.setText("0");
        wingsTxtField.setText("0");
        stirTxtField.setText("0");
        BBQWingsTxtFeild.setText("0");
        friesTxtField.setText("0");
        burgerTxtField.setText("0");
        hotTxtField.setText("0");
        
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        //Reseting program for another use
        sandwichTxtField.setText("0");
        fingerTxtField.setText("0");
        wingsTxtField.setText("0");
        stirTxtField.setText("0");
        BBQWingsTxtFeild.setText("0");
        friesTxtField.setText("0");
        burgerTxtField.setText("0");
        hotTxtField.setText("0");
        
        //Reseting lables
        taxLbl.setText("Tax: ");
        priceBefore.setText("Price Before Tax: ");
        totalLbl.setText("Total ");
        savingsLbl.setText("Savings: ");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void sandwichTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwichTxtFieldMousePressed
       // sandwichTxtField.setText("");
    }//GEN-LAST:event_sandwichTxtFieldMousePressed

    private void sandwichTxtFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sandwichTxtFieldMouseExited
       
    }//GEN-LAST:event_sandwichTxtFieldMouseExited

    private void sandwichTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sandwichTxtFieldFocusLost
       // sandwichTxtField.setText("0");
    }//GEN-LAST:event_sandwichTxtFieldFocusLost

    private void fingerTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fingerTxtFieldMousePressed
        //fingerTxtField.setText("");
    }//GEN-LAST:event_fingerTxtFieldMousePressed

    private void fingerTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fingerTxtFieldFocusLost
        //fingerTxtField.setText("0");
    }//GEN-LAST:event_fingerTxtFieldFocusLost

    private void wingsTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wingsTxtFieldMousePressed
        //wingsTxtField.setText("");
    }//GEN-LAST:event_wingsTxtFieldMousePressed

    private void wingsTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wingsTxtFieldFocusLost
        //wingsTxtField.setText("0");
    }//GEN-LAST:event_wingsTxtFieldFocusLost

    private void stirTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stirTxtFieldMousePressed
        //stirTxtField.setText("");
    }//GEN-LAST:event_stirTxtFieldMousePressed

    private void stirTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stirTxtFieldFocusLost
       // stirTxtField.setText("0");
    }//GEN-LAST:event_stirTxtFieldFocusLost

    private void BBQWingsTxtFeildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBQWingsTxtFeildMousePressed
       // BBQWingsTxtFeild.setText("");
    }//GEN-LAST:event_BBQWingsTxtFeildMousePressed

    private void BBQWingsTxtFeildFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BBQWingsTxtFeildFocusLost
       // BBQWingsTxtFeild.setText("0");
    }//GEN-LAST:event_BBQWingsTxtFeildFocusLost

    private void friesTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friesTxtFieldMousePressed
       // friesTxtField.setText("");
    }//GEN-LAST:event_friesTxtFieldMousePressed

    private void friesTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_friesTxtFieldFocusLost
       // friesTxtField.setText("0");
    }//GEN-LAST:event_friesTxtFieldFocusLost

    private void burgerTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_burgerTxtFieldMousePressed
       // burgerTxtField.setText("");
    }//GEN-LAST:event_burgerTxtFieldMousePressed

    private void burgerTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_burgerTxtFieldFocusLost
        //burgerTxtField.setText("0");
    }//GEN-LAST:event_burgerTxtFieldFocusLost

    private void hotTxtFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotTxtFieldMousePressed
        //hotTxtField.setText("");
    }//GEN-LAST:event_hotTxtFieldMousePressed

    private void hotTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hotTxtFieldFocusLost
        //hotTxtField.setText("0");
    }//GEN-LAST:event_hotTxtFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MamaJunesChicken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MamaJunesChicken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MamaJunesChicken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MamaJunesChicken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MamaJunesChicken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BBQWingsTxtFeild;
    private javax.swing.JPanel backingPnl;
    private javax.swing.JLabel bbqWingLbl;
    private javax.swing.JLabel burgerLbl;
    private javax.swing.JTextField burgerTxtField;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel dealLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel fingerLbl;
    private javax.swing.JTextField fingerTxtField;
    private javax.swing.JLabel friLbl;
    private javax.swing.JTextField friesTxtField;
    private javax.swing.JLabel hotLbl;
    private javax.swing.JTextField hotTxtField;
    private javax.swing.JLabel instuctionsLbl;
    private javax.swing.JLabel priceBefore;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel sandwichLbl;
    private javax.swing.JTextField sandwichTxtField;
    private javax.swing.JLabel savingsLbl;
    private javax.swing.JLabel sloganLbl;
    private javax.swing.JLabel stirLbl;
    private javax.swing.JTextField stirTxtField;
    private javax.swing.JLabel taxLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JLabel wingLbl;
    private javax.swing.JTextField wingsTxtField;
    // End of variables declaration//GEN-END:variables
}
