import java.applet.*;
import java.awt.*;
public class AppletFigures extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(150,30,50,150);
        g.drawLine(150,30,250,150);
        g.drawLine(50,150,250,150);
        g.drawRect(50,150,200,300);
        g.drawRect(70,200,50,50);
        g.drawRect(170,200,50,50);
        g.drawRect(130,300,50,150);
    }
}

/*<applet code = "AppletFigures.class" width="350" height="350"></applet>*/