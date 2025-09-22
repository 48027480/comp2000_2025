import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.List;

public abstract class Actor {
    protected Color color;
    protected Cell loc;
    protected List<Polygon> display;
    protected Inventory<Item> inventory;   // each actor has its own inventory

    public Actor(Cell loc) {
        this.loc = loc;
        this.inventory = new Inventory<>();
    }

    /**
     * Paint the actor on the grid
     */
    public void paint(Graphics g) {
        for (Polygon p : display) {
            g.setColor(color);
            g.fillPolygon(p);
            g.setColor(Color.GRAY);
            g.drawPolygon(p);
        }
    }

    /** Add an item to this actor's inventory */
    public void pickUp(Item item) {
        inventory.add(item);
    }

    /** Get the items currently held by this actor */
    public List<Item> getInventoryItems() {
        return inventory.getItems();
    }

    /** Get the actor's current location */
    public Cell getCell() {
        return loc;
    }

    /** Set the actor's location */
    public void setCell(Cell newCell) {
        loc = newCell;
    }
}
