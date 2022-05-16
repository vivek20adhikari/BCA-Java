import java.awt.*;
import java.awt.event.*;
class StudentInfo extends Frame{
    StudentInfo(){
        Label l1 = new Label("Student Name : ");
        add(l1);

        TextField t1 = new TextField();
        add(t1);

        Label l2 = new Label("Student Age : ");
        add(l2);

        TextField t2 = new TextField();
        add(t2);

        Label l3 = new Label("Student Gender : ");
        add(l3);

        TextField t3 = new TextField();
        add(t3);

        Label l4 = new Label("Student Course : ");
        add(l4);

        Choice c = new Choice();
        c.add("BBA");
        c.add("BCA");
        c.add("B Com");
        add(c);

        Label l5 = new Label("Name : ");
        add(l5);

        Label l6 = new Label("Name : ");
        add(l6);

        Label l7 = new Label("Name : ");
        add(l7);

        Label l8 = new Label("Name : ");
        add(l8);

        Button b1 = new Button("Submit");
        add(b1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l5.setText("Name " + t1.getText());
                l6.setText("Age " + t2.getText());
                l7.setText("Gender " + t3.getText());
                //l8.setText(c.getText());
            }
        });

        Button b2 = new Button("Reset");
        add(b2);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

        setSize(500, 300);
        setLayout(new GridLayout(10, 2));
        setVisible(true);
    }

    public static void main(String args[]){
        new StudentInfo();
    }
}