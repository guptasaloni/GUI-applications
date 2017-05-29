import java.awt.*;
import java.awt.event.*;
class gui12 implements ActionListener
{
	Button b;
	Dialog d;
	public gui12()
	{
		Frame f=new Frame();
		Panel p=new Panel();
		f.setSize(300,300);
		d=new Dialog(f,"filedialog");
		p.add(new Button("ok"));
		d.add(p);
		b=new Button("lol");
		b.addActionListener(this);
		f.add(b);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			d.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		new gui12();
	}
}