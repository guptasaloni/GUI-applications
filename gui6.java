import java.awt.*;

class gui6
{
	public static void main(String args[])
	{
		Frame f=new Frame("GridBagLayout");
		f.setSize(300,300);
		f.setLayout(new GridLayout(3,1));
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		
		//p1.setLayout(new GridBagLayout());
		//p2.setLayout(new GridBagLayout());
		//p1.setBackground(Color.red);
		//p2.setBackground(Color.green);
		
		Label l1=new Label("Name");
		Label l2=new Label("Password");
		TextField t1=new TextField(20);
		TextField t2=new TextField(20);
		Button b=new Button("Submit");
		
		GridBagLayout gb=new GridBagLayout();
		GridBagLayout gb1=new GridBagLayout();
		p1.setLayout(gb);
		p2.setLayout(gb1);
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0; 
		gbc.gridwidth=2; gbc.gridheight=2;
		gbc.weightx=1.0; gbc.weighty=1.0;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		p1.add(l1,gbc);
		gbc.gridx=2; gbc.gridy=0;
		p1.add(t1,gbc);
		gbc.gridx=0; gbc.gridy=2;
		p2.add(l2,gbc);
		gbc.gridx=2; gbc.gridy=2;
		p2.add(t2,gbc);
		//gbc.gridx=4; //gbc.gridy=4;
		p3.add(b);
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setVisible(true);
		
	}
}