import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
public class DrawingComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2=(Graphics2D)g;
        Rectangle rect=new Rectangle(10,20,900,420);
        g2.setColor(Color.CYAN);
        g2.fill(rect);
    }
}