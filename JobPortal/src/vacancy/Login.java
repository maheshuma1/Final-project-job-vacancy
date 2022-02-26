package vacancy;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmJobvacancy;
	private JTextField txt1;
	private JPasswordField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmJobvacancy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJobvacancy = new JFrame();
		frmJobvacancy.setTitle("JobVacancy");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmJobvacancy.setBounds(0,0,screenSize.width, screenSize.height);
		//frmJobvacancy.setBounds(100, 100, 450, 300);
		frmJobvacancy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJobvacancy.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("UserName");
		lbl1.setBounds(223, 46, 66, 14);
		frmJobvacancy.getContentPane().add(lbl1);
		
		txt1 = new JTextField();
		txt1.setBounds(312, 43, 96, 20);
		frmJobvacancy.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lbl2 = new JLabel("Password");
		lbl2.setBounds(223, 121, 66, 14);
		frmJobvacancy.getContentPane().add(lbl2);
		
		JButton btn1 = new JButton("Login");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
/*					String q = "select * from LoginInfo where username=? and password=? ";
					PreparedStatement p = connection.prepareStatement(q);
					p.setString(1, lbl1.getText());
					p.setString(2, lbl2.getText());
					ResultSet r = p.executeQuery();
					int count =0;
					while(r.next()) {
						count = count++;
						
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "UserName and password is correct");
					}else if (count>1) {
						JOptionPane.showMessageDialog(null, "Dulicate Credentials");
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Login Credentials, Please Try again..");
					}
					r.close();
					p.close();*/
					
					if(txt1.getText().equalsIgnoreCase("test1") && txt2.getText().equals("1234")) {
						frmJobvacancy.dispose();
						CandidateHome home = new CandidateHome();
						home.setVisible(true);
					}else if(txt1.getText().equalsIgnoreCase("hrtest1") && txt2.getText().equals("1234")) {
						frmJobvacancy.dispose();
						RecruiterHome home = new RecruiterHome();
						home.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Login Credentials, Please Try again..");
					}
				} catch (HeadlessException e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
		btn1.setBounds(261, 196, 89, 23);
		frmJobvacancy.getContentPane().add(btn1);
		
		txt2 = new JPasswordField();
		txt2.setEchoChar('$');
		txt2.setBounds(312, 118, 96, 20);
		frmJobvacancy.getContentPane().add(txt2);
		
		JLabel lblIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/JobPortal.jpg")).getImage();
		lblIcon.setIcon(new ImageIcon(img));
		lblIcon.setBounds(10, 11, 203, 83);
		frmJobvacancy.getContentPane().add(lblIcon);
	}
}
