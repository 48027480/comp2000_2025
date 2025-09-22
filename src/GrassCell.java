import java.awt.Color;

public class GrassCell extends Cell implements Terrain {

    public GrassCell(char inCol, int inRow, int x, int y) {
        super(inCol, inRow, x, y);
    }

    @Override
    public Color getColor() {
        return new Color(34, 139, 34); // forest green
    }

    @Override
    public String getName() {
        return "Grass";
    }

    @Override
    public void paint(java.awt.Graphics g, java.awt.Point mousePos) {
        // If hovered, darken the color, otherwise use terrain color
        if (contains(mousePos)) {
            g.setColor(getColor().darker());
        } else {
            g.setColor(getColor());
        }
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
    }
}
