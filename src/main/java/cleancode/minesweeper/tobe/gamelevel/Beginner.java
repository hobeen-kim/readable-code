package cleancode.minesweeper.tobe.gamelevel;

public class Beginner implements GameLevel{
    @Override
    public int getRowSize() {
        return 8;
    }

    @Override
    public int getColumnSize() {
        return 10;
    }

    @Override
    public int getLandMineCount() {
        return 10;
    }
}