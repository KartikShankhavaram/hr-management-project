package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class StaffDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffDashboard frame = new StaffDashboard();
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
	public StaffDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnApplyForLeave = new JButton("Apply for Leave");
		btnApplyForLeave.setBounds(53, 86, 143, 23);
		contentPane.add(btnApplyForLeave);
		
		JButton btnViewApplicationStatus = new JButton("View Application\n Status");
		btnViewApplicationStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewApplicationStatus.setBounds(227, 86, 171, 23);
		contentPane.add(btnViewApplicationStatus);
		
		JButton btnViewRemainingLeaves = new JButton("View Remaining Leaves");
		btnViewRemainingLeaves.setBounds(227, 173, 171, 23);
		contentPane.add(btnViewRemainingLeaves);
		
		JButton btnFillAppraisalForm = new JButton("Fill Appraisal Form");
		btnFillAppraisalForm.setBounds(53, 173, 143, 23);
		contentPane.add(btnFillAppraisalForm);
		
	}

}
