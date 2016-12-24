import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class appp extends Applet implements ActionListener{
TextField t =new TextField("    hello    ");
public void init()
{
//setBackground(Color.green);
Button b1=new Button("START");
Button b2=new Button("STOP");
Button b3=new Button("PAUSE");
add(b1);
add(b2);
add(b3);
add(t);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String action=ae.getActionCommand();
if(action.equals("START"))
{
showStatus("START is Pressed");
t.setText("START is Pressed");
t.setBackground(Color.green);
}
else if(action.equals("STOP"))
{
showStatus("STOP is Pressed");
t.setText("STOP is Pressed");
t.setBackground(Color.red);
}
else if(action.equals("PAUSE"))
{showStatus("PAUSE is Pressed");
t.setText("PAUSE is Pressed");
t.setBackground(Color.blue);
}
}
}