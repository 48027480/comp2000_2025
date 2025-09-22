import java.awt.Color;
import java.awt.Graphics;

public class Bone extends Item {

    public Bone(Cell location) {
        super(location);
    }

    @Override
    public void paint(Graphics g) {
        int x = location.x;
        int y = location.y;
        int size = Cell.size;

        g.setColor(Color.WHITE);
        g.fillOval(x + size / 4, y + size / 3, size / 2, size / 4);
        g.setColor(Color.BLACK);
        g.drawOval(x + size / 4, y + size / 3, size / 2, size / 4);
    }
}
