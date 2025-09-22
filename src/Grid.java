import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.Random;

public class Grid {
    private static final int rows = 20;
    private static final int cols = 20;
    private static final int offset = 10;

    private Cell[][] cells;
    private Random rand;

    public Grid() {
        cells = new Cell[cols][rows];
        rand = new Random();

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int x = offset + c * Cell.size;
                int y = offset + r * Cell.size;
                char colChar = (char) ('A' + c);

                // Randomly assign a terrain
                if (rand.nextDouble() < 0.7) {  // 70% chance grass
                    cells[c][r] = new GrassCell(colChar, r, x, y);
                } else {                        // 30% chance water
                    cells[c][r] = new WaterCell(colChar, r, x, y);
                }
            }
        }
    }

    public void paint(Graphics g, Point mouseLoc) {
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                cells[c][r].paint(g, mouseLoc);
            }
        }
    }

    public Optional<Cell> cellAtColRow(int c, int r) {
        if (c >= 0 && c < cols && r >= 0 && r < rows) {
            return Optional.of(cells[c][r]);
        }
        return Optional.empty();
    }

    public Optional<Cell> cellAtPoint(Point p) {
        if (p == null) return Optional.empty();
        int c = (p.x - offset) / Cell.size;
        int r = (p.y - offset) / Cell.size;
        return cellAtColRow(c, r);
    }
}
