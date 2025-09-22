import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;
  List<Item> items;                     // store items placed on the grid
  Inventory<Item> inventory;            // generic container for items

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();
    items = new ArrayList<>();
    inventory = new Inventory<>();

    // Add actors
    actors.add(new Cat(grid.cellAtColRow(0, 0).get()));
    actors.add(new Dog(grid.cellAtColRow(0, 15).get()));
    actors.add(new Bird(grid.cellAtColRow(12, 9).get()));

    // Add items to the world
    Item bone = new Bone(grid.cellAtColRow(5, 5).get());
    Item fish = new Fish(grid.cellAtColRow(10, 10).get());
    Item seed = new Seed(grid.cellAtColRow(15, 3).get());
    items.add(bone);
    items.add(fish);
    items.add(seed);

    // Store items also in the generic inventory
    inventory.add(bone);
    inventory.add(fish);
    inventory.add(seed);
  }

  public void paint(Graphics g, Point mouseLoc) {
    // draw grid with terrain
    grid.paint(g, mouseLoc);

    // draw actors
    for (Actor a : actors) {
      a.paint(g);
    }

    // draw items
    for (Item i : items) {
      i.paint(g);
    }

    // hover highlight
    Optional<Cell> underMouse = grid.cellAtPoint(mouseLoc);
    if (underMouse.isPresent()) {
      Cell hoverCell = underMouse.get();
      g.setColor(Color.DARK_GRAY);
      g.drawString(
        String.valueOf(hoverCell.col) + String.valueOf(hoverCell.row),
        740,
        30
      );
      g.drawString("Terrain: " + hoverCell.getTerrain().getName(), 740, 50);
    }

    // display inventory count
    g.setColor(Color.BLACK);
    g.drawString("Inventory: " + inventory.getAll().size() + " items", 740, 70);
  }
}
