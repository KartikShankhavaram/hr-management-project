import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JList;

public class LeaveApplication extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveApplication frame = new LeaveApplication();
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
	public LeaveApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave Application Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(181, 11, 303, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(26, 53, 113, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(265, 53, 85, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblEmployeeNo = new JLabel("Employee No");
		lblEmployeeNo.setBounds(26, 97, 113, 14);
		contentPane.add(lblEmployeeNo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(265, 97, 85, 14);
		contentPane.add(lblDate);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(26, 139, 113, 14);
		contentPane.add(lblDesignation);
		
		textField = new JTextField();
		textField.setBounds(149, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(360, 50, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(149, 94, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(360, 94, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(149, 136, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblLeaveDetails = new JLabel("Leave Details");
		lblLeaveDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLeaveDetails.setBounds(229, 208, 94, 14);
		contentPane.add(lblLeaveDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Type of Leave");
		lblNewLabel_1.setBounds(26, 254, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		String[] leaves = new String[] {"PL", "CL", "ODL", "OL"};
		
		JComboBox comboBox = new JComboBox(leaves);
		comboBox.setBounds(149, 251, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(26, 297, 46, 14);
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(239, 297, 46, 14);
		contentPane.add(lblTo);
		
		JLabel lblTotalNoOf = new JLabel("Total no. of days");
		lblTotalNoOf.setBounds(26, 328, 113, 14);
		contentPane.add(lblTotalNoOf);
		
		JLabel lblReason = new JLabel("Reason");
		lblReason.setBounds(239, 328, 36, 14);
		contentPane.add(lblReason);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(292, 323, 192, 59);
		contentPane.add(textArea);
		
		String[] applyToRoles = new String[] {"Director", "HOD", "DOFA", "DORC"};
		
		JComboBox comboBox_1 = new JComboBox(applyToRoles);
		comboBox_1.setBounds(149, 411, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblApplyTo = new JLabel("Apply to");
		lblApplyTo.setBounds(26, 414, 113, 14);
		contentPane.add(lblApplyTo);
	}
}
