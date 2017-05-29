import java.awt.*;
import java.awt.event.*;

class gui1 implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextField tf1;
	public gui1()
	{
		Frame f=new Frame("Calculater");
		f.setSize(300,150);
		
		b1=new Button("1");
		b1.addActionListener(this);
		
		b2=new Button("2");
		b2.addActionListener(this);
		
		b3=new Button("3");
		b3.addActionListener(this);
		
		b4=new Button("+");
		b4.addActionListener(this);
		
		b5=new Button("4");
		b5.addActionListener(this);
		b6=new Button("5");
		b6.addActionListener(this);
		
		b7=new Button("6");
		b7.addActionListener(this);
		
		b8=new Button("-");
		b8.addActionListener(this);
		
		b9=new Button("7");
		b9.addActionListener(this);
		
		b10=new Button("8");
		b10.addActionListener(this);
		
		b11=new Button("9");
		b11.addActionListener(this);
		
		b12=new Button("*");
		b12.addActionListener(this);
		
		b13=new Button("c");
		b13.addActionListener(this);
		
		b14=new Button("0");
		b14.addActionListener(this);
		
		b15=new Button("/");
		b15.addActionListener(this);
		
		b16=new Button("=");
		b16.addActionListener(this);
		Panel p1=new Panel();
		Panel p2=new Panel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new GridLayout(4,4));
		f.add(p1,BorderLayout.NORTH);
		//p1.setBackground(Color.red);
		tf1=new TextField(12);
		p1.add(tf1);
		//p1.add(p2);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		f.add(p2);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		p1.setVisible(true);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String t=tf1.getText();
			tf1.setText(t+"1");
		}
		else
			if(e.getSource()==b2)
			{
				String t=tf1.getText();
			    tf1.setText(t+"2");
			}
			else
				if(e.getSource()==b3)
				{
					String t=tf1.getText();
					tf1.setText(t+"3");
				}
				else
					if(e.getSource()==b4)
					{
						String t=tf1.getText();
						tf1.setText(t+"+");
					}
					else
					if(e.getSource()==b5)
					{
						String t=tf1.getText();
						tf1.setText(t+"4");
					}
					else
					if(e.getSource()==b6)
					{
						String t=tf1.getText();
						tf1.setText(t+"5");
					}
					else
					if(e.getSource()==b7)
					{
						String t=tf1.getText();
						tf1.setText(t+"6");
					}
					else
					if(e.getSource()==b8)
					{
						String t=tf1.getText();
						tf1.setText(t+"-");
					}
					else
					if(e.getSource()==b9)
					{
						String t=tf1.getText();
						tf1.setText(t+"7");
					}
					else
					if(e.getSource()==b10)
					{
						String t=tf1.getText();
						tf1.setText(t+"8");
					}
					else
					if(e.getSource()==b11)
					{
						String t=tf1.getText();
						tf1.setText(t+"9");
					}
					else
					if(e.getSource()==b12)
					{
						String t=tf1.getText();
						tf1.setText(t+"*");
					}
					else
					if(e.getSource()==b13)
					{
						String t=tf1.getText();
						tf1.setText("  ");
					}
					else
					if(e.getSource()==b14)
					{
						String t=tf1.getText();
						tf1.setText(t+"0");
					}
					else
					if(e.getSource()==b15)
					{
						String t=tf1.getText();
						tf1.setText(t+"/");
					}
					else
					if(e.getSource()==b16)
					{
						String t=tf1.getText();
						tf1.setText(t+"=");
					}
	}
	public static void main(String args[])
	{
		new gui1();
	}
}