package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoginAsStaff = new JButton("Login as Staff");
		btnLoginAsStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffDashboard obj = new StaffDashboard();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnLoginAsStaff.setBounds(144, 45, 158, 23);
		contentPane.add(btnLoginAsStaff);
		
		JButton btnLoginAsDofa = new JButton("Login as DOFA");
		btnLoginAsDofa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LeaveApplicationDecision obj = new LeaveApplicationDecision();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnLoginAsDofa.setBounds(144, 90, 158, 23);
		contentPane.add(btnLoginAsDofa);
		
		JButton btnLoginAsDirector = new JButton("Login as Director");
		btnLoginAsDirector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LeaveApplicationDecision obj = new LeaveApplicationDecision();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnLoginAsDirector.setBounds(144, 180, 158, 23);
		contentPane.add(btnLoginAsDirector);
		
		JLabel lblLnmiit = new JLabel("LNMIIT");
		lblLnmiit.setBounds(190, 11, 46, 14);
		contentPane.add(lblLnmiit);
		
		JButton button = new JButton("Login as HOD");
		button.setBounds(144, 134, 158, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Login as Registrar");
		button_1.setBounds(144, 224, 158, 23);
		contentPane.add(button_1);
		
		
	}
}
