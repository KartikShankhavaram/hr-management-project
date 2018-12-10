package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class RemainingLeaves extends JFrame {

	private JPanel contentPane;
	private JTable remainingLeavesTable;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemainingLeaves frame = new RemainingLeaves();
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
	public RemainingLeaves() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String data[][] = {{"PL", "30", "10"}, {"CL", "40", "20"}};
		String columns[] = {"Type of leave", "Total number of leaves", "Number of leaves left"};
		contentPane.setLayout(null);
		
		remainingLeavesTable = new JTable(data, columns);
		remainingLeavesTable.setBounds(0, 0, 100, 100);
		JScrollPane sp=new JScrollPane(remainingLeavesTable);
		sp.setBounds(10, 52, 414, 209);
		contentPane.add(sp);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(178, 272, 89, 23);
		contentPane.add(btnBack);
	}

}
