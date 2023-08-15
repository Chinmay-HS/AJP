import java.awt.*;

public class TextButtonExample extends Frame
{
    TextField tf1,tf2,tf3;
    Button ok, cancel;
    Label l1,l2;
    TextArea ta;
    TextButtonExample(String s)
    {
        super(s);
        tf1=new TextField();
        tf1.setBounds(50,50,150,20);
        tf2=new TextField();
        tf2.setBounds(50,100,150,20);
        tf3=new TextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);
        ta=new TextArea(10,50);
        ta.setBounds(50,200,200,50);
        ok = new Button("OK");
        ok.setBounds(50,180,75,20);
        cancel = new Button("CANCEL");
        cancel.setBounds(125,180,75,20);
        l1=new Label("Enter you name");
        l2=new Label("Enter your password");
        l1.setBounds(50,40,150,90);
        l2.setBounds(50,90,150,90);
        add(tf1);
        add(tf2);
        add(tf3);
        add(ta);
        add(l1);
        add(l2);
        add(ok);
        add(cancel);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        TextButtonExample t = new TextButtonExample("TextField and TextArea Example");
    }
}