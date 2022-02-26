package vacancy;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CandidateHome extends JFrame {
	private JTextField txtJobSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandidateHome frame = new CandidateHome();
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
	public CandidateHome() {
		setTitle("JobPortal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screenSize.width, screenSize.height);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu1 = new JMenu("Jobs");
		menuBar.add(Menu1);
		
		JMenuItem Job1 = new JMenuItem("Application Engineer");
		Menu1.add(Job1);
		
		JMenuItem Job2 = new JMenuItem("System Engineer");
		Menu1.add(Job2);
		
		JMenuItem Job3 = new JMenuItem("Network Engineer");
		Menu1.add(Job3);
		
		JMenu Menu2 = new JMenu("Recruiters");
		menuBar.add(Menu2);
		
		JMenuItem Recruiters1 = new JMenuItem("Companies");
		Menu2.add(Recruiters1);
		
		JMenuItem Recruiters = new JMenuItem("Consultancy");
		Menu2.add(Recruiters);
		
		JMenu Menu3 = new JMenu("More");
		menuBar.add(Menu3);
		
		JMenuItem More1 = new JMenuItem("Career Tools");
		Menu3.add(More1);
		
		JMenuItem More2 = new JMenuItem("Study Aboard");
		Menu3.add(More2);
		
		JMenuItem More3 = new JMenuItem("Top Exams");
		Menu3.add(More3);
		
		JMenuItem More4 = new JMenuItem("Top vacancies");
		Menu3.add(More4);
		
		JMenu Menu4 = new JMenu("Type");
		menuBar.add(Menu4);
		
		JMenuItem Type1 = new JMenuItem("Full Time Employement");
		Menu4.add(Type1);
		
		JMenuItem Type2 = new JMenuItem("Part Time Employement");
		Menu4.add(Type2);
		getContentPane().setLayout(null);
		
		JLabel lblJobSearch = new JLabel("Job Search");
		lblJobSearch.setBounds(379, 11, 89, 14);
		getContentPane().add(lblJobSearch);
		
		txtJobSearch = new JTextField();
		txtJobSearch.setBounds(550, 11, 162, 14);
		getContentPane().add(txtJobSearch);
		txtJobSearch.setColumns(10);
	}
}
