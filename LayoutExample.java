import java.awt.*;
public class LayoutExample
{
    Frame f;
    LayoutExample()
    {
        f=new Frame("Layout Manager Example");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4); 
        f.add(b5);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new LayoutExample();
    }
}