import java.awt.Color;
import java.awt.Graphics;

public class Fish extends Item {

    public Fish(Cell location) {
        super(location);
    }

    @Override
    public void paint(Graphics g) {
        int x = location.x;
        int y = location.y;
        int size = Cell.size;

        g.setColor(Color.CYAN);
        g.fillOval(x + size / 4, y + size / 3, size / 2, size / 3); // fish body

        g.setColor(Color.BLUE);
        g.fillPolygon(
            new int[]{x + size / 4, x + size / 8, x + size / 4},
            new int[]{y + size / 3, y + size / 2, y + 2 * size / 3},
            3
        ); // fish tail
    }
}
