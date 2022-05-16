import java.applet.*;
import java.awt.*;
public class AppletFontColor extends Applet
{
    Font f1,f2,f3;
    public void init()
    {
        setBackground(Color.YELLOW);
        f1=new Font("Arial",Font.BOLD,18);
        f2=new Font("Forte",Font.ITALIC,24);
        f3=new Font("Elephant",Font.PLAIN,36);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.setFont(f1);
        g.drawString("VIVEK SINGH ADHIKARI",50,50);
        
        g.setColor(Color.RED);
        g.setFont(f2);
        g.drawString("BCA 4 M2",50,100);

        g.setColor(Color.BLUE);
        g.setFont(f3);
        g.drawString("GGSIPU",200,200);
    }
}
/*<applet code ="AppletFontColor.class" width="450" height="350"> </applet>*/