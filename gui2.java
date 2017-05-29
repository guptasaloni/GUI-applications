import  java.awt.*;

class gui2
{
	public static void main(String args[])
	{
		Frame f=new Frame("SIMPLE APP");
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		Panel p1=new Panel();
		Panel p2=new Panel();
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		Label l=new Label("Name:");
		f.add(p1);
		
		TextField t=new TextField(30);
		f.add(p2);
		
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		p1.add(l);
		p1.add(t);
		p2.add(b1);
		p2.add(b2);
		f.setVisible(true);
		}
}