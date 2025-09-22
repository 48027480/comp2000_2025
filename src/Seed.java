import java.awt.Color;
import java.awt.Graphics;

public class Seed extends Item {

    public Seed(Cell location) {
        super(location);
    }

    @Override
    public void paint(Graphics g) {
        int x = location.x;
        int y = location.y;
        int size = Cell.size;

        g.setColor(new Color(139, 69, 19)); // brown
        g.fillOval(x + size / 3, y + size / 3, size / 4, size / 4); // small seed
    }
}
