import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;
public class start extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose User");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(138, 43, 151, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Employee", "Admin"}));
		comboBox.setBounds(122, 80, 128, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblUserid = new JLabel("UserId");
		lblUserid.setBounds(42, 127, 48, 14);
		frame.getContentPane().add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(122, 127, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42, 164, 48, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 158, 128, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(comboBox.getSelectedItem().equals("Employee"))
				{
					try
					{
					   conn c1=new conn();
		               String u=textField.getText();
		               String v=textField_1.getText();
		               String q="select * from emplogin where userid='"+u+"' and password='"+v+"'";
		               ResultSet rs=c1.s.executeQuery(q);
		               if(rs.next()){
		            	   new TakeAttendence().setVisible(true);
		                   setVisible(false);
		               }
		               else
		               {
		            	   JOptionPane.showMessageDialog(null, "Invalid login");
		                   setVisible(false);
		               }
					}
					catch(Exception ae)
					{
						ae.printStackTrace();
					}
				}
				if(comboBox.getSelectedItem().equals("Admin"))
				{
					
					try
			        {
						//System.out.println("Raju");
			            conn c1=new conn();
			            String u=textField.getText();
			            String v=textField_1.getText(); 
			            String q="select * from login where username='"+u+"' and password='"+v+"'";
			            
			            ResultSet rs=c1.s.executeQuery(q); // query execute
			            if(rs.next()){
			                new project().setVisible(true);
			                setVisible(false);
			       
			            }
			            else{
			                JOptionPane.showMessageDialog(null, "Invalid login");
			                setVisible(false);
			            }
			        }catch(Exception ae){
			            ae.printStackTrace();
			        }
				}
				
			}
		});
		btnLogin.setBounds(123, 204, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

	
}
