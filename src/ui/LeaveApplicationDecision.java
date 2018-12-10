package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.LeaveApplicationObject;

public class LeaveApplicationDecision extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveApplicationDecision frame = new LeaveApplicationDecision();
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
	public LeaveApplicationDecision() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LeaveApplicationObject app1 = new LeaveApplicationObject("Jared Dunn", "CSE", "RT5Y7", "2018-12-10", "Assistant Professor", "PL", true, "2018-12-15", "2018-12-18", 4, "DOFA", "Spending time with family.");
		LeaveApplicationObject app2 = new LeaveApplicationObject("Richard Hendricks", "ECE", "HJYI4", "2018-12-10", "Professor", "CL", false, "2018-12-19", "2018-12-21", 3, "DOFA", "Gotta catch 'em all!");
		LeaveApplicationObject app3 = new LeaveApplicationObject("Richard Hendricks", "ECE", "HJYI4", "2018-12-10", "Professor", "CL", false, "2018-12-19", "2018-12-21", 3, "DOFA", "Gotta catch 'em all!");
		
		addListItem(1, app1);
		addListItem(2, app2);
		addListItem(3, app3);
		
//		String columns[] = {"No.", "Application date", "Employee", "Urgent", "From", "To"};
//		String data[][] = {};
//		
//		JTable applicationStatusTable = new JTable(data, columns);
//		applicationStatusTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		applicationStatusTable.getColumnModel().getColumn(0).setPreferredWidth(25);
//		applicationStatusTable.getColumnModel().getColumn(1).setPreferredWidth(100);
//		applicationStatusTable.getColumnModel().getColumn(2).setPreferredWidth(75);
//		applicationStatusTable.getColumnModel().getColumn(3).setPreferredWidth(50);
//		applicationStatusTable.getColumnModel().getColumn(4).setPreferredWidth(80);
//		applicationStatusTable.getColumnModel().getColumn(5).setPreferredWidth(80);
//		contentPane.setLayout(null);
//		JScrollPane sp = new JScrollPane(applicationStatusTable);
//		sp.setBounds(5, 5, 419, 261);
//		contentPane.add(sp);
	}
	
	private void addListItem(int index, LeaveApplicationObject application) {
		JPanel panel = new JPanel(null);
		int height = 30;
		panel.setBounds(20, index*height, 540, height);
		JLabel lblIndex = new JLabel(index + ". ");
		lblIndex.setBounds(0, 0, 40, height);
		JLabel lblAppDate = new JLabel(application.getApplicationDate());
		lblAppDate.setBounds(45, 0, 90, height);
		JLabel lblEmployee = new JLabel(application.getEmployeeName());
		lblEmployee.setBounds(140, 0, 150, height);
		JLabel lblUrgent = new JLabel(application.isUrgent()?"Yes":"No");
		lblUrgent.setBounds(295, 0, 50, height);
		JLabel lblFrom = new JLabel(application.getStartDate());
		lblFrom.setBounds(350, 0, 90, height);
		JLabel lblTo = new JLabel(application.getEndDate());
		lblTo.setBounds(445, 0, 90, height);
		panel.add(lblIndex);
		panel.add(lblAppDate);
		panel.add(lblEmployee);
		panel.add(lblUrgent);
		panel.add(lblFrom);
		panel.add(lblTo);
		contentPane.add(panel);
	}

}
