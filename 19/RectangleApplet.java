import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class RectangleApplet extends Applet {
    private int x, y, width, height;
    private Color color;

    public void init() {
        // Read parameters from HTML file
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        width = Integer.parseInt(getParameter("width"));
        height = Integer.parseInt(getParameter("height"));
        color = Color.decode(getParameter("color"));
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
