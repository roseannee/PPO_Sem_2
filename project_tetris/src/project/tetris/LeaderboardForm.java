package project.tetris;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class LeaderboardForm extends javax.swing.JFrame {
    private DefaultTableModel tabelModel;
    
    private String leaderboardFile = "leaderboard";
    
    private TableRowSorter<TableModel> sorter;
    
    public LeaderboardForm() {
        initComponents();
        initTableData();
        initTableSorter();
    }

    public void addPlayer(String playerName, int score) {
        tabelModel.addRow(new Object[] {playerName, score});
        
        sorter.sort();
        
        saveLeaderboard();
        
        this.setVisible(true);
    }
    
    private void initTableData() {
        Vector columnIdentifiers = new Vector();
        columnIdentifiers.add("Player");
        columnIdentifiers.add("Score");
        
        tabelModel = (DefaultTableModel) leaderboardTable.getModel();
        
        try {
            FileInputStream fileInpStream = new FileInputStream(leaderboardFile);
            ObjectInputStream objectInpStream = new ObjectInputStream(fileInpStream);

            tabelModel.setDataVector((Vector<Vector>) objectInpStream.readObject(), columnIdentifiers);

            objectInpStream.close();
            fileInpStream.close();
        } catch (Exception e) { }
    }
           
    private void saveLeaderboard() {
        try {
            FileOutputStream fileOutpStream = new FileOutputStream(leaderboardFile);
            ObjectOutputStream objectOutpStream = new ObjectOutputStream(fileOutpStream);

            objectOutpStream.writeObject(tabelModel.getDataVector());

            objectOutpStream.close();
            fileOutpStream.close();
        } catch (Exception e) { }
    }
    
    private void initTableSorter() {
        sorter = new TableRowSorter<>(tabelModel);
        leaderboardTable.setRowSorter(sorter);
        
        ArrayList<SortKey> keys = new ArrayList<>();
        keys.add(new SortKey(1, SortOrder.DESCENDING));
        
        sorter.setSortKeys(keys);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaderboardTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainMenuButton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mainMenuButton.setText("Main Menu");
        mainMenuButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenuButton.setFocusPainted(false);
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        leaderboardTable.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        leaderboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player", "Score"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(leaderboardTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        this.setVisible(false);
        Tetris.showStartup();
    }//GEN-LAST:event_mainMenuButtonActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leaderboardTable;
    private javax.swing.JButton mainMenuButton;
    // End of variables declaration//GEN-END:variables
}
