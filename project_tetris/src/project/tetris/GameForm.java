package project.tetris;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class GameForm extends JFrame {
    private GameArea gArea;
    private GameThread gThread;
    
    public GameForm() {
        initComponents();
        
        gArea = new GameArea(placeholder, 10);
        this.add(gArea);
        
        initControls();
    }
    
    private void initControls() {
        InputMap inputM = this.getRootPane().getInputMap();
        ActionMap actionM = this.getRootPane().getActionMap();
        
        inputM.put(KeyStroke.getKeyStroke("UP"), "up");
        inputM.put(KeyStroke.getKeyStroke("DOWN"), "down");
        inputM.put(KeyStroke.getKeyStroke("LEFT"), "left");
        inputM.put(KeyStroke.getKeyStroke("RIGHT"), "right");
        
        actionM.put("up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gArea.rotateBlock();
            }
        });
        
        actionM.put("down", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gArea.dropBlock();
            }
        });
        
        actionM.put("left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gArea.moveBlockLeft();
            }
        });
        
        actionM.put("right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gArea.moveBlockRight();
            }
        });
    }
    
    public void startGame() {
        gArea.initBackgroundArray();
        gThread = new GameThread(gArea, this);
        gThread.start();
    }
    
    public void updateScore(int score) {
        scoreLabel.setText("Score : " + score);
    }
    
    public void updateLevel(int level) {
        levelLabel.setText("Level : " + level);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        placeholder = new javax.swing.JPanel();
        scoreLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        mainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        placeholder.setBackground(new java.awt.Color(238, 238, 238));
        placeholder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout placeholderLayout = new javax.swing.GroupLayout(placeholder);
        placeholder.setLayout(placeholderLayout);
        placeholderLayout.setHorizontalGroup(
            placeholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        placeholderLayout.setVerticalGroup(
            placeholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        scoreLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        scoreLabel.setText("Score : 0");

        levelLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        levelLabel.setText("Level : 1");

        mainMenuButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenuButton.setFocusPainted(false);
        mainMenuButton.setFocusable(false);
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(placeholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenuButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelLabel))
                    .addComponent(placeholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        gThread.interrupt();
        this.setVisible(false);
        Tetris.showStartup();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel levelLabel;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JPanel placeholder;
    private javax.swing.JLabel scoreLabel;
    // End of variables declaration//GEN-END:variables
}
