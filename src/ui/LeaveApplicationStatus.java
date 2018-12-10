package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;

import model.LeaveApplicationObject;
import javax.swing.JButton;

public class LeaveApplicationStatus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveApplicationStatus frame = new LeaveApplicationStatus();
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
	public LeaveApplicationStatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		LeaveApplicationObject app1 = new LeaveApplicationObject("Jared Dunn", "CSE", "RT5Y7", "2018-12-10", "Assistant Professor", "PL", true, "2018-12-15", "2018-12-18", 4, "DOFA", "Spending time with family.");
//		LeaveApplicationObject app2 = new LeaveApplicationObject("Richard Hendricks", "ECE", "HJYI4", "2018-12-10", "Professor", "CL", false, "2018-12-19", "2018-12-21", 3, "DOFA", "Gotta catch 'em all!");
//		
//		DefaultListModel<LeaveApplicationObject> model = new DefaultListModel<>();
//		model.addElement(app1);
//		model.addElement(app2);
//		
//		JList<LeaveApplicationObject> list = new JList<>(model);
//		list.setCellRenderer(new ApplicationStatusRenderer());
//		contentPane.add(new JScrollPane(list));
		
		String columns[] = {"No.", "Application date", "Type of leave", "Urgent", "From", "To", "Status"};
		String data[][] = {};
		
		JTable applicationStatusTable = new JTable(data, columns);
		applicationStatusTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		applicationStatusTable.getColumnModel().getColumn(0).setPreferredWidth(25);
		applicationStatusTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		applicationStatusTable.getColumnModel().getColumn(2).setPreferredWidth(75);
		applicationStatusTable.getColumnModel().getColumn(3).setPreferredWidth(50);
		applicationStatusTable.getColumnModel().getColumn(4).setPreferredWidth(80);
		applicationStatusTable.getColumnModel().getColumn(5).setPreferredWidth(80);
		contentPane.setLayout(null);
		JScrollPane sp = new JScrollPane(applicationStatusTable);
		sp.setBounds(5, 5, 419, 261);
		contentPane.add(sp);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(143, 277, 135, 23);
		contentPane.add(btnNewButton);
		
	}

}
