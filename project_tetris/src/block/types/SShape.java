package block.types;

import project.tetris.Block;

public class SShape extends Block {
    public SShape() {
        super(new int[][] {{0, 1, 1},
                           {1, 1, 0}});
    }
}
