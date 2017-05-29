import java.awt.*;

class gui4
{
	public static void main(String arg[])
	{
		CardLayout c=new CardLayout();
		Frame f=new Frame("CardLayout");
		f.setSize(300,300);
		Panel p1=new Panel();
		Panel p2=new Panel();
		Button b1=new Button("Next");
		Button b2=new Button("Previous");
		//p1.setLayout(new GridLayout(5,1));
		//Label l=new Label("q. capital of delhi?");
		List l1,l2,l3,l4;
		//CheckboxGroup c1=new CheckboxGroup();
		l1=new List(4);
		l2=new List(4);
		l3=new List(4);
		l4=new List(4);
		l1.add("Q. capital of delhi?");
		l1.add("Jaipur");
		l1.add("Jodhpur");
		l1.add("Pali");
		l1.add("Chomu");
		
		l2.add("Q. capital of Jammu?");
		l2.add("Jaipur");
		l2.add("Jodhpur");
		l2.add("Pali");
		l2.add("Chomu");
		
		l3.add("Q. capital of rajasthan?");
		l3.add("Jaipur");
		l3.add("Jodhpur");
		l3.add("Pali");
		l3.add("Chomu");
		
		l4.add("Q. capital of chandigarh?");
		l4.add("Jaipur");
		l4.add("Jodhpur");
		l4.add("Pali");
		l4.add("Chomu");
		p1.add(l1);
		p1.add(l2);
		p1.add(l3);
		p1.add(l4);
		p2.add(b1);
		p2.add(b2);
		p1.setLayout(c);
		p2.setLayout(new GridLayout(1,2));
		f.add(p1,BorderLayout.NORTH);
		f.add(p2,BorderLayout.SOUTH);
		f.setVisible(true);
		
	}
}
