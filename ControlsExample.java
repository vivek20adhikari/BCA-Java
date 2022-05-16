import java.awt.*;
public class ControlsExample
{
    Frame f;
    ControlsExample()
    {
        f=new Frame("This Is An Example Of Controls In Frame");
        
        Label l=new Label("Label 1");
        l.setBounds(50,50,100,40);
        f.add(l);
        
        Button b=new Button ("Click Here");
        b.setBounds(100,100,100,40);
        f.add(b);
        
        TextField t=new TextField("BCA m2");
        b.setBounds(150,150,100,40);
        f.add(t);

        List li=new List(5,true);
        li.add("Apple");
        li.add("Mango");
        li.add("Grapes");
        li.add("Banana");
        li.add("Orange");
        li.add("Melon");
        li.add("Cherry");
        li.setBounds(200,200,100,40);
        f.add(li);

        Checkbox c1=new Checkbox("C++");
        Checkbox c2=new Checkbox("JAVA");
        Checkbox c3=new Checkbox("C");
        c1.setBounds(20,350,100,40);
        c2.setBounds(20,380,100,40);
        c3.setBounds(20,410,100,40);
        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ControlsExample();
    }
}