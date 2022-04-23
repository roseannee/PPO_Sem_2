package project.tetris;

import block.types.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class GameArea extends JPanel{
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;
    
    private Color[][] background;
    
    private Block block;
    
    private Block[] blockTypes;
    
    public GameArea(JPanel placeholder, int columns) {
        this.setBounds(placeholder.getBounds());
        this.setBackground(placeholder.getBackground());
        this.setBorder(placeholder.getBorder());
        
        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns;
        gridRows = this.getBounds().height / gridCellSize;
        
        blockTypes = new Block[] {new IShape(),
                                  new JShape(),
                                  new LShape(),
                                  new SShape(),
                                  new OShape(),
                                  new TShape(),
                                  new ZShape()};
    }
    
    public void initBackgroundArray() {
        background = new Color[gridRows][gridColumns];
    }
    
    public void spawnBlock() {
        Random random = new Random();
        
        block = blockTypes[random.nextInt(blockTypes.length)];
        block.spawn(gridColumns);
    }
    
    public boolean isBlockOutOfBounds() {
        if (block.getY() < 0) {
            block = null;
            return true;
        }
        
        return false;
    }
    
    public boolean moveBlockDown() {
        if (checkBottom() == false) { return false; }
        
        block.moveDown();
        repaint();
        
        return true;
    }
    
    public void rotateBlock() {
        if (block == null) return;
        
        block.rotate();
        
        if (block.getLeftEdge() < 0) block.setX(0);
        
        if (block.getRightEdge() >= gridColumns) block.setX(gridColumns - block.getWidth());
        
        if (block.getBottomEdge() >= gridRows) block.setY(gridRows - block.getHeight());
        
        repaint();
    }
    
    public void dropBlock() {
        if (block == null) return;
        
        while (checkBottom()) {
            block.moveDown();
        }
        repaint();
    }
    
    public void moveBlockLeft() {
        if (block == null) return;
        
        if (!checkLeft()) return;
        
        block.moveLeft();
        repaint();        
    }
    
    public void moveBlockRight() {
        if (block == null) return;
        
        if (!checkRight()) return;
        
        block.moveRight();
        repaint();
    }
    
    private boolean checkBottom() {
        if (block.getBottomEdge() == gridRows) return false;
        
        int[][] shape = block.getShape();
        int height = block.getHeight();
        int width = block.getWidth();
        
        for (int col = 0; col < width; col++) {
            for (int row = height - 1; row >= 0; row--) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX();
                    int y = row + block.getY() + 1;

                    if (y < 0) break;

                    if (background[y][x] != null) return false;

                    break;
                }
            }
        }
        
        return true;
    }
    
    private boolean checkLeft() {
        if (block.getLeftEdge() == 0) return false;
        
        int[][] shape = block.getShape();
        int height = block.getHeight();
        int width = block.getWidth();
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX() - 1;
                    int y = row + block.getY();

                    if (y < 0) break;

                    if (background[y][x] != null) return false;

                    break;
                }
            }
        }
        
        return true;
    }
    
    private boolean checkRight() {
        if (block.getRightEdge() == gridColumns) return false;
        
        int[][] shape = block.getShape();
        int height = block.getHeight();
        int width = block.getWidth();
        
        for (int row = 0; row < height; row++) {
            for (int col = width - 1; col >= 0; col--) {
                if (shape[row][col] != 0) {
                    int x = col + block.getX() + 1;
                    int y = row + block.getY();

                    if (y < 0) break;

                    if (background[y][x] != null) return false;

                    break;
                }
            }
        }
        
        return true;
    }
    
    public int clearLines() {
        boolean lineFilled;
        
        int linesCleared = 0;
        
        for (int row = gridRows - 1; row >= 0; row--) {
            lineFilled = true;
            for (int col = 0; col < gridColumns; col++) {
                if (background[row][col] == null) {
                    lineFilled = false;
                    break;
                }
            }
            
            if (lineFilled) {
                linesCleared++;
                
                clearOneLine(row);
                shiftDownBlocks(row);
                
                clearOneLine(0);
                
                row++;
                
                repaint();
            }
        }
        
        return linesCleared;
    }
    
    private void clearOneLine(int row) {
        for (int i = 0; i < gridColumns; i++) {
            background[row][i] = null;
        }
    }
     
    private void shiftDownBlocks(int row) {
        for (int r = row; r > 0; r--) {
            for (int col = 0; col < gridColumns; col++) {
                background[r][col] = background[r - 1][col];
            }
        }
    }
    
    public void moveBlockToBackground() {
        int[][] shape = block.getShape();
        
        int height = block.getHeight();
        int width = block.getWidth();
        
        int xPosition = block.getX();
        int yPosition = block.getY();
        
        Color color = block.getColor();
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (shape[row][col] == 1) {
                    background[row + yPosition][col + xPosition] = color;
                }
            }
        }
    }
    
    private void drawBlock(Graphics g) {
        int[][] shape = block.getShape();
        Color color = block.getColor();
        
        int height = block.getHeight();
        int width = block.getWidth();
        
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (shape[row][col] == 1) {
                    int x = (block.getX() + col) * gridCellSize;
                    int y = (block.getY() + row) * gridCellSize;
                    
                    drawGridSquare(g, color, x, y);
                }
            }
        }
    }
    
    private void drawBackground(Graphics g) {
        Color color;
        
        for (int row = 0; row < gridRows; row++) {
            for (int col = 0; col < gridColumns; col++) {
                color = background[row][col];
                
                if (color != null) {
                    int x = col * gridCellSize;
                    int y = row * gridCellSize;
                                     
                    drawGridSquare(g, color, x, y);
                }
            }
        }
    }
    
    private void drawGridSquare(Graphics g, Color color, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, gridCellSize, gridCellSize);

        g.setColor(Color.black);
        g.drawRect(x, y, gridCellSize, gridCellSize);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        drawBackground(g);
        drawBlock(g);
    }
}
