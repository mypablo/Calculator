import javax.swing.*;


public class Calculator extends javax.swing.JFrame {

	public Calculator(){
		
		super("Calculator");
		setSize(300,200);
		
		
		JPanel panel = new JPanel();
		JTextField first = new JTextField(10);
		JTextField second = new JTextField(10);
		JTextField cal = new JTextField(3);
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		
		
		
		panel.add(first);
		panel.add(cal);
		panel.add(second);
		add(panel);
		
		
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(zero);
		setVisible(true);
		
		
		
		
	
	
	}
		
		
	
	
	public static void main(String[] args) {
		
		
		Calculator Calc = new Calculator();
	}
	
}
