
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;

public class raju extends JFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	public raju() 
	{
		setAlwaysOnTop(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setBounds(0, 14, 0, 373);
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("Userid");
		lblNewLabel_2.setBounds(48, 77, 66, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(48, 134, 66, 14);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(124, 74, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 131, 96, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=lblNewLabel_2.getText();
				String pass=lblPassword.getText();
				if(str.equals("raju"))
				{
					JOptionPane.showMessageDialog(null, "logined successfully");
				}
				else
					JOptionPane.showMessageDialog(null, "Invalid login");
			}
		});
		btnLogin.setBounds(52, 202, 59, 23);
		getContentPane().add(btnLogin);
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setBounds(131, 202, 120, 23);
		getContentPane().add(btnForgetPassword);
		setVisible(true);
		setBounds(50,50,50,50);
		 setSize(300,300);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		login obj=new login();
	}
	public static void main(String[] args)
	{
		raju obj=new raju();
	}

	
}
