package block.types;

import project.tetris.Block;

public class ZShape extends Block {
    public ZShape() {
        super(new int[][] {{1, 1, 0},
                           {0, 1, 1}});
    }
}
