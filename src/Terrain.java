import java.awt.Color;

public interface Terrain {
    /**
     * @return the display color associated with this terrain type.
     */
    Color getColor();

    /**
     * @return a human-readable name of the terrain type.
     */
    String getName();
}
