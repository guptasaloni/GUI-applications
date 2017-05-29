import java.awt.*;
//import javax.swing.*;

class gui3
{
	public static void main(String args[])
	{
		Frame f=new Frame("Scrollbar");
		Panel p=new Panel();
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		Scrollbar sc1=new Scrollbar();
		sc1.setMaximum(300);
		sc1.setMinimum(0);
		sc1.setValue(0);
		sc1.setBackground(Color.red);
		Scrollbar sc2=new Scrollbar();
		sc2.setMaximum(300);
		sc2.setMinimum(0);
		sc2.setValue(3);
		sc2.setBackground(Color.green);
		//sc1.setLayout(new BorderLayout());
		p.add(sc1,BorderLayout.EAST);
		p.add(sc2,BorderLayout.EAST);
		f.add(p);
		f.setVisible(true);
	}
}