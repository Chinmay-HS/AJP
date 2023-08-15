import java.awt.*;
public class MyFrame extends Frame
{
    Checkbox cb1,cb2, cb3, cb4;
    CheckboxGroup cbg;
    String msg = "";
    MyFrame()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setTitle("Programming Languages");
        cb1 = new Checkbox("Java", false);
        cb1.setBounds(100,100,150,150);
        add(cb1);
        cb2 = new Checkbox("C++", false);
        cb2.setBounds(100, 200, 150, 150);
        add(cb2);
        cbg = new CheckboxGroup();
        cb3 = new Checkbox("Python", false, cbg);
        cb3.setBounds(100, 300, 150, 150);
        add(cb3);
        cb4 = new Checkbox("Assembly", false, cbg);
        cb4.setBounds(100, 400, 150, 150);
        add(cb4);
    }
    public static void main(String args[])
    {
        MyFrame f = new MyFrame();
    }
}