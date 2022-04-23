package project.tetris;

import java.awt.Color;
import java.util.Random;

public class Block {
    private int[][] shape;
    private Color color;
    
    private int x;
    private int y;
    
    private int[][][] moreShapes;
    private int currentRotation;
    
    private Color[] avaliableColors = {Color.red, Color.orange, Color.yellow, Color.green,
                                       Color.cyan, Color.blue, Color.magenta};

    public Block(int[][] shape) {
        this.shape = shape;
        
        initShapes();
    }
    
    private void initShapes() {
        moreShapes = new int[4][][];
        
        for (int i = 0; i < 4; i++) {
            int row = shape[0].length;
            int col = shape.length;
            
            moreShapes[i] = new int[row][col];
            
            for (int y = 0; y < row; y++) {
                for (int x = 0; x < col; x++) {
                    moreShapes[i][y][x] = shape[col - x - 1][y];
                }
            }
            
            shape = moreShapes[i];
        }
    }

    public void spawn(int gridWidth) {
        Random random = new Random();
        
        currentRotation = random.nextInt(moreShapes.length);
        shape = moreShapes[currentRotation];
        
        y = -getHeight();
        x = random.nextInt(gridWidth - getWidth());
        
        color = avaliableColors[random.nextInt(avaliableColors.length)];
    }
    
    public int[][] getShape() { return shape; }

    public Color getColor() { return color; }
    
    public int getHeight() { return shape.length; }
    
    public int getWidth() { return shape[0].length; }

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    
    public void setY(int y) { this.y = y; }
    
    public void moveDown() { y++; }
    
    public void moveLeft() { x--; }
    
    public void moveRight() { x++; }
    
    public void rotate() {
        currentRotation++;
        if (currentRotation > 3) currentRotation = 0;
        shape = moreShapes[currentRotation];
    }
    
    public int getBottomEdge() { return y + getHeight(); }
    
    public int getLeftEdge() { return x; }
    
    public int getRightEdge() { return x + getWidth(); }
} 
