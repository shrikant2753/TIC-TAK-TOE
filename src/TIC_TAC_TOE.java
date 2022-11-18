
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.magenta;
import static java.awt.Color.white;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {

    private String turn = "X";
    private int turnCount=0;
    private int xCount = 0;
    private int oCount = 0;
    /**
     * Creates new form TIC_TAC_TOE
     */
    public TIC_TAC_TOE() {
        initComponents();
        
    }
    
    private void setScore(){
            txtPlayerO.setText(String.valueOf(oCount));
            txtPlayerX.setText(String.valueOf(xCount));
            
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);    
    }
    
    public void choosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn  = "O";
        }
        else{
            turn  = "X";
        }
    }
    
    private void winningGame(){
        if(turnCount == 9){
            txtbtn1.setText("");
            txtbtn2.setText("");
            txtbtn3.setText("");
            txtbtn4.setText("");
            txtbtn5.setText("");
            txtbtn6.setText("");
            txtbtn7.setText("");
            txtbtn8.setText("");
            txtbtn9.setText("");

            txtbtn1.setEnabled(true);
            txtbtn2.setEnabled(true);
            txtbtn3.setEnabled(true);
            txtbtn4.setEnabled(true);
            txtbtn5.setEnabled(true);
            txtbtn6.setEnabled(true);
            txtbtn7.setEnabled(true);
            txtbtn8.setEnabled(true);
            txtbtn9.setEnabled(true);


            txtbtn1.setBackground(white);
            txtbtn2.setBackground(white);
            txtbtn3.setBackground(white);
            txtbtn4.setBackground(white);
            txtbtn5.setBackground(white);
            txtbtn6.setBackground(white);
            txtbtn7.setBackground(white);
            txtbtn8.setBackground(white);
            txtbtn9.setBackground(white);
            return;
        }
        String btn1 = txtbtn1.getText();
        String btn2 = txtbtn2.getText();
        String btn3 = txtbtn3.getText();
        String btn4 = txtbtn4.getText();
        String btn5 = txtbtn5.getText();
        String btn6 = txtbtn6.getText();
        String btn7 = txtbtn7.getText();
        String btn8 = txtbtn8.getText();
        String btn9 = txtbtn9.getText();
        
        if(btn1.equals(btn2) && btn2.equals(btn3) && !"".equals(btn1)){
            JOptionPane.showMessageDialog(this, "player" + turn + " win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            
            
            txtbtn1.setForeground(black);
            txtbtn2.setForeground(black);
            txtbtn3.setForeground(black);
            setScore();
        }
        
        else if(btn4.equals(btn5) && btn5.equals(btn6) && !"".equals(btn4)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn4.setForeground(black);
            txtbtn5.setForeground(black);
            txtbtn6.setForeground(black);
            setScore();
        }
        
        else if(btn7.equals(btn8) && btn8.equals(btn9) && !"".equals(btn7)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn7.setForeground(black);
            txtbtn8.setForeground(black);
            txtbtn9.setForeground(black);
            setScore();
        }
        
        else if(btn1.equals(btn4) && btn4.equals(btn7) && !"".equals(btn7)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn4.setForeground(black);
            txtbtn1.setForeground(black);
            txtbtn7.setForeground(black);
            setScore();
        }
        
        else if(btn2.equals(btn5) && btn5.equals(btn8) && !"".equals(btn8)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn2.setForeground(black);
            txtbtn5.setForeground(black);
            txtbtn8.setForeground(black);
            setScore();
        }
        
        else if(btn3.equals(btn6) && btn6.equals(btn9) && !"".equals(btn9)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn3.setForeground(black);
            txtbtn6.setForeground(black);
            txtbtn9.setForeground(black);
            setScore();
        }
        
        else if(btn3.equals(btn5) && btn5.equals(btn7) && !"".equals(btn7)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn7.setForeground(black);
            txtbtn3.setForeground(black);
            txtbtn5.setForeground(black);
            setScore();
        }
        
        else if(btn1.equals(btn5) && btn5.equals(btn9) && !"".equals(btn1)){
            JOptionPane.showMessageDialog(this, "Player" + turn + " Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            if(turn.equalsIgnoreCase("x")){
                xCount++;
            }
            else{
                oCount++;
            }
            txtbtn1.setForeground(black);
            txtbtn5.setForeground(black);
            txtbtn9.setForeground(black);
            setScore();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtExit = new javax.swing.JButton();
        txtReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playerX = new javax.swing.JLabel();
        playerY = new javax.swing.JLabel();
        txtPlayerO = new javax.swing.JLabel();
        txtPlayerX = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 90));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 310));

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.setBorder(null);
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.setBorder(null);
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.setBorder(null);
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.setBorder(null);
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.setBorder(null);
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.setBorder(null);
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.setBorder(null);
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.setBorder(null);
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.setBorder(null);
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(255, 0, 0));
        txtExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtExit.setForeground(new java.awt.Color(250, 248, 248));
        txtExit.setText("EXIT");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        txtReset.setBackground(new java.awt.Color(210, 255, 255));
        txtReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtReset.setText("RESET");
        txtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 239, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerX.setText("PlayerX");

        playerY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerY.setText("PlayerO");

        txtPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPlayerO.setText("_ _ _ _ ");

        txtPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPlayerX.setText("_ _ _ _ ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SCORE CARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(playerY, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(playerX, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerX, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerY, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        txtbtn2.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn2.setForeground(Color.red);
        }
        else
            txtbtn2.setForeground(magenta);
        txtbtn2.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_txtExitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:

        txtbtn1.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn1.setForeground(Color.red);
        }
        else
            txtbtn1.setForeground(magenta);
        txtbtn1.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        txtbtn3.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn3.setForeground(Color.red);
        }
        else
            txtbtn3.setForeground(magenta);
        txtbtn3.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        txtbtn4.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn4.setForeground(Color.red);
        }
        else
            txtbtn4.setForeground(magenta);
        txtbtn4.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        txtbtn5.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn5.setForeground(Color.red);
        }
        else
            txtbtn5.setForeground(magenta);
        txtbtn5.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        txtbtn6.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn6.setForeground(Color.red);
        }
        else
            txtbtn6.setForeground(magenta);
        txtbtn6.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        txtbtn7.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn7.setForeground(Color.red);
        }
        else
            txtbtn7.setForeground(magenta);
        txtbtn7.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        txtbtn8.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn8.setForeground(Color.red);
        }
        else
            txtbtn8.setForeground(magenta);
        txtbtn8.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        txtbtn9.setText(turn);
        
        if(turn.equalsIgnoreCase("x")){
            txtbtn9.setForeground(Color.red);
        }
        else
            txtbtn9.setForeground(magenta);
        txtbtn9.setEnabled(false);
        turnCount++;
        winningGame();
        choosePlayer();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResetActionPerformed
        // TODO add your handling code here:
        txtbtn1.setText("");
        txtbtn2.setText("");
        txtbtn3.setText("");
        txtbtn4.setText("");
        txtbtn5.setText("");
        txtbtn6.setText("");
        txtbtn7.setText("");
        txtbtn8.setText("");
        txtbtn9.setText("");
        
        txtbtn1.setEnabled(true);
        txtbtn2.setEnabled(true);
        txtbtn3.setEnabled(true);
        txtbtn4.setEnabled(true);
        txtbtn5.setEnabled(true);
        txtbtn6.setEnabled(true);
        txtbtn7.setEnabled(true);
        txtbtn8.setEnabled(true);
        txtbtn9.setEnabled(true);
        
        
        txtbtn1.setBackground(white);
        txtbtn2.setBackground(white);
        txtbtn3.setBackground(white);
        txtbtn4.setBackground(white);
        txtbtn5.setBackground(white);
        txtbtn6.setBackground(white);
        txtbtn7.setBackground(white);
        txtbtn8.setBackground(white);
        txtbtn9.setBackground(white);
          
    }//GEN-LAST:event_txtResetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playerX;
    private javax.swing.JLabel playerY;
    private javax.swing.JButton txtExit;
    private javax.swing.JLabel txtPlayerO;
    private javax.swing.JLabel txtPlayerX;
    private javax.swing.JButton txtReset;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
