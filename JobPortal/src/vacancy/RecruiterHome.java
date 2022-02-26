package vacancy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuItem;

public class RecruiterHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecruiterHome frame = new RecruiterHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RecruiterHome() {
		setTitle("JobPortal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("Viewed Profiles");
		menuBar.add(menu1);
		
		JMenuItem viewed1 = new JMenuItem("Contacted Profiles");
		menu1.add(viewed1);
		
		JMenuItem viewed2 = new JMenuItem("ShortlistedProfiles");
		menu1.add(viewed2);
		
		JMenuItem viewed3 = new JMenuItem("SelectedProfiles");
		menu1.add(viewed3);
		
		JMenu menu2 = new JMenu("Similar Profiles");
		menuBar.add(menu2);
		
		JMenuItem similar1 = new JMenuItem("Profiles");
		menu2.add(similar1);
		
		JMenu menu3 = new JMenu("More Profiles");
		menuBar.add(menu3);
		
		JMenuItem more1 = new JMenuItem("RejectedEarlier");
		menu3.add(more1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Candidates = new JLabel("Candidates Search");
		Candidates.setBounds(10, 26, 113, 17);
		contentPane.add(Candidates);
		
		textField = new JTextField();
		textField.setBounds(133, 23, 246, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
