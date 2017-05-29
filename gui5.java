import java.awt.*;

class gui5
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(250,250);
		f.setLayout(new GridBagLayout());
		
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b10=new Button("10");
		Button b11=new Button("11");
		Button b12=new Button("12");
		Button b13=new Button("13");
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		p1.setLayout(new GridBagLayout());
		//p2.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;
		gbc.gridy=0; 
		gbc.gridwidth=2; gbc.gridheight=2;
		gbc.weightx=1.0; gbc.weighty=1.0;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		p1.add(b1,gbc);
		gbc.gridx=0; gbc.gridy=1;
		p1.add(b2,gbc);
		gbc.gridx=1; gbc.gridy=0;
		p1.add(b3,gbc);
		gbc.gridx=2; gbc.gridy=0;
		p1.add(b4,gbc);
		gbc.gridx=3; gbc.gridy=0;
		p1.add(b5,gbc);
		
		f.add(p1);
		f.setVisible(true);
	}
}