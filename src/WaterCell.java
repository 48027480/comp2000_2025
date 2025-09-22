import java.awt.Color;

public class WaterCell extends Cell implements Terrain {

    public WaterCell(char inCol, int inRow, int x, int y) {
        super(inCol, inRow, x, y);
    }

    @Override
    public Color getColor() {
        return new Color(30, 144, 255); // dodger blue
    }

    @Override
    public String getName() {
        return "Water";
    }

    @Override
    public void paint(java.awt.Graphics g, java.awt.Point mousePos) {
        // If hovered, brighten the color, otherwise use terrain color
        if (contains(mousePos)) {
            g.setColor(getColor().brighter());
        } else {
            g.setColor(getColor());
        }
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }
}
