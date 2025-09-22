import java.awt.Graphics;

public abstract class Item {
    protected Cell location;

    public Item(Cell location) {
        this.location = location;
    }

    public Cell getLocation() {
        return location;
    }

    public void setLocation(Cell location) {
        this.location = location;
    }

    /**
     * Draw the item on the grid.
     */
    public abstract void paint(Graphics g);
}
