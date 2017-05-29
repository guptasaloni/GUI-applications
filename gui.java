import  java.awt.*;

class gui
{
	public static void main(String args[])
	{
		Frame f=new Frame("SIMPLE APP");
		f.setSize(400,500);
		f.setLayout(new FlowLayout());
		
		Label l=new Label("Name:");
		f.add(l);
		
		TextField t=new TextField(30);
		f.add(t);
		
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		}
}