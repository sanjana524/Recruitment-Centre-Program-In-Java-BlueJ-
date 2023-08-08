 
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class JFrameGraphics extends JPanel
{
    public void paint(Graphics g)
    {
        g.drawRect(10,10,470,340);
        g.drawRect(350,30,100,100);
        g.drawString(" Photo",380,80);
        g.drawString("Name : Raj Malhotra ",30,60);
        g.drawString("Age : 25 ",30,90);
        g.drawString("Phone Number : 1234567890",30,120);
        g.drawString("Stream : Software Engineer",30,150);
        g.drawString("Branch : Application Development ",30,180);
        g.drawString("Programming Language : Ruby",30,210);
        g.drawString("Company : Amazon",30,240);
        g.drawString("Reference Number : 1234567890",30,270);
        g.drawString("Address : R-1005, Heliconia, Magarpatta City, Pune-411013",30,300);
        g.drawString("Enter the Reference number in the Company's website to know further updates.",30,370);
        g.drawString("Thank you!!",220,400);
    }
    
    public static void main (String args[])
    {
        JFrame frame=new JFrame("Reference Card");
        frame.getContentPane().add(new JFrameGraphics());
        frame.setSize(500,450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}