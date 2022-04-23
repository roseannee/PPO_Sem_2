package project.tetris;

import javax.swing.JOptionPane;

public class Tetris {
    private static GameForm gameF;
    private static StartupForm startupF;
    private static LeaderboardForm leaderboardF;
    
    public static void start() {
        gameF.setVisible(true);
        gameF.startGame();
    }
    
    public static void showLeaderboard() {
        leaderboardF.setVisible(true);
    }
    
    public static void showStartup() {
        startupF.setVisible(true);
    }
    
    public static void gameOver(int score) {
        String playerName = JOptionPane.showInputDialog("Game Over!\nPlease enter your name.");
        gameF.setVisible(false);
        leaderboardF.addPlayer(playerName, score);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gameF = new GameForm();
                startupF = new StartupForm();
                leaderboardF = new LeaderboardForm();

                startupF.setVisible(true);
            }
        });
    }
}
