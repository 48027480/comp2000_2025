import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Cell extends Rectangle {
    char col;
    int row;
    static final int size = 35;

    public Cell(char inCol, int inRow, int x, int y) {
        super(x, y, size, size);
        col = inCol;
        row = inRow;
    }

    // Subclasses must define their terrain color
    public abstract Color getColor();

    // Subclasses must define their terrain name
    public abstract String getName();

    public void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(getColor().brighter());
        } else {
            g.setColor(getColor());
        }
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }

    @Override
    public String toString() {
        return getName() + " Cell (" + col + row + ")";
    }
}
