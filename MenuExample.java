import java.awt.*;
public class MenuExample
{
    Frame f;
    MenuExample()
    {
        f=new Frame("Example of Menu");
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("File");
        Menu m2=new Menu("Edit");
        Menu m3=new Menu("View");
        Menu sb = new Menu("Zoom");
        MenuItem mi1=new MenuItem("New");
        MenuItem mi2=new MenuItem("New Window");
        MenuItem mi3=new MenuItem("Open");
        MenuItem mi4=new MenuItem("Save");
        MenuItem mi5=new MenuItem("Exit");
        MenuItem mi6=new MenuItem("Undo");
        MenuItem mi7=new MenuItem("Cut");
        MenuItem mi8=new MenuItem("Copy");
        MenuItem mi9=new MenuItem("Paste");
        MenuItem mi10=new MenuItem("Zoom In");
        MenuItem mi11=new MenuItem("Zoom Out");
        MenuItem mi12=new MenuItem("Restore");
        MenuItem mi13=new MenuItem("Status Bar");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        m1.add(mi5);
        m2.add(mi6);
        m2.add(mi7);
        m2.add(mi8);
        m2.add(mi9);
        m3.add(mi13);
        sb.add(mi10);
        sb.add(mi11);
        sb.add(mi12);
        m3.add(sb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        f.setMenuBar(mb);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new MenuExample();
    }
}
