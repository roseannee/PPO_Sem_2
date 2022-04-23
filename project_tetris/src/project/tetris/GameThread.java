package project.tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameThread extends Thread {
    private GameArea gArea;
    private GameForm gForm;
    
    private int score;
    private int level = 1;
    private int scorePerLevel = 3;
    
    private int pause = 1000;
    private int speedupPerLevel = 100;
    
    public GameThread(GameArea gArea, GameForm gForm) {
        this.gArea = gArea;
        this.gForm = gForm;
        
        gForm.updateScore(score);
        gForm.updateLevel(level);
    }
    
    @Override
    public void run() {
        while(true) {
            gArea.spawnBlock();
            
            while (gArea.moveBlockDown()) {
                try {
                    Thread.sleep(pause);
                } catch (InterruptedException ex) {
                    return;
                }
            }
            
            if (gArea.isBlockOutOfBounds()) {
                Tetris.gameOver(score);
                break;
            }
            
            gArea.moveBlockToBackground();
            
            score += gArea.clearLines();
            gForm.updateScore(score);
            
            int newLevel = score / scorePerLevel + 1;
            if (newLevel > level) {
                level = newLevel;
                gForm.updateLevel(level);
                
                pause -= speedupPerLevel;
            }
        }         
    }
}
