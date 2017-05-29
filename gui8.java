import java.awt.*;
import java.awt.event.*;
class gui8
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(300,300);
		
		Scrollbar sc1=new Scrollbar();
		Scrollbar sc2=new Scrollbar();
		sc1.setBackground(Color.red);
		sc2.setBackground(Color.green);
		Panel p1=new Panel();
		Panel p2=new Panel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p1.add(sc1,BorderLayout.EAST);
		p2.add(sc2,BorderLayout.EAST);
		p2.add(p1);
		f.add(p2);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}