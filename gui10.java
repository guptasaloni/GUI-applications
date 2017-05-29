import java.awt.*;
import java.awt.event.*;
class gui10 implements ActionListener
{
	//Label l1;
	TextField tf,tf1;
	Button b;
	public gui10()
	{
		Frame f=new Frame();
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		Label l=new Label("Name");
		tf=new TextField(20);
		b=new Button("click here");
		tf1=new TextField(30);
		b.addActionListener(this);
		f.add(l);
		f.add(tf);
		f.add(b);
		f.add(tf1);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String nam=tf.getText();
		if(e.getSource()==b)
		tf1.setText("hello  "+nam);
	}
	public static void main(String args[])
	{
		new gui10();
	}
}