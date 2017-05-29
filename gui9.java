import java.awt.*;
import java.awt.event.*;

class gui9 
{
	public static void main(String arg[])
	{
		//CardLayout c=new CardLayout();
		Frame f=new Frame("CardLayout");
		f.setSize(300,300);
		//f.add(c);
		Panel p1=new Panel(); p1.setLayout(new GridLayout(4,1));
		Panel p2=new Panel(); 
		
		Panel p3=new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p4=new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p5=new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p6=new Panel(new FlowLayout(FlowLayout.LEFT));
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		Button b1=new Button("Next");
		Button b2=new Button("Previous");
		
		Label l=new Label("Q. capital of Delhi?");
		f.add(l,BorderLayout.NORTH);
		Label l1=new Label("A.");
		Checkbox cb1=new Checkbox("Jaipur",false);
		Label l2=new Label("B.");
		Checkbox cb2=new Checkbox("Jodhpur");
		Label l3=new Label("C.");
		Checkbox cb3=new Checkbox("Jaiselmer");
		Label l4=new Label("D.");
		Checkbox cb4=new Checkbox("Udaipur");
		
		
		p3.add(l1); p3.add(cb1);
		p4.add(l2); p4.add(cb2);
		p5.add(l3); p5.add(cb3);
		p6.add(l4); p6.add(cb4);
		
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		f.add(p1);
		p2.add(b1); p2.add(b2);
		f.add(p2,BorderLayout.SOUTH);
		f.setVisible(true);
		
	}
}
