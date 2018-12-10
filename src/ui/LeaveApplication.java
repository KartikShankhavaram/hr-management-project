package ui;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class LeaveApplication extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setBounds(100, 100, 525, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Leave Application Form");
		lblNewLabel.setBounds(181, 11, 303, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(26, 53, 113, 14);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(265, 53, 85, 14);
		
		JLabel lblEmployeeNo = new JLabel("Employee No");
		lblEmployeeNo.setBounds(26, 97, 113, 14);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(265, 97, 85, 14);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(26, 139, 113, 14);
		
		textField = new JTextField();
		textField.setBounds(149, 50, 86, 20);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(360, 50, 86, 20);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 94, 86, 20);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(360, 94, 86, 20);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(149, 136, 86, 20);
		textField_4.setColumns(10);
		
		JLabel lblLeaveDetails = new JLabel("Leave Details");
		lblLeaveDetails.setBounds(229, 208, 94, 14);
		lblLeaveDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Type of Leave");
		lblNewLabel_1.setBounds(26, 254, 113, 14);
		
		String[] leaves = new String[] {"PL", "CL", "ODL", "OL"};
		
		JComboBox<String> comboBox = new JComboBox(leaves);
		comboBox.setBounds(149, 251, 86, 20);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(26, 297, 46, 24);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(239, 297, 46, 24);
		
		JLabel lblTotalNoOf = new JLabel("Total no. of days");
		lblTotalNoOf.setBounds(26, 339, 113, 14);
		
		JLabel lblReason = new JLabel("Reason");
		lblReason.setBounds(26, 386, 54, 24);
		
		JTextArea reasonTextArea = new JTextArea();
		reasonTextArea.setRows(3);
		reasonTextArea.setBounds(95, 381, 351, 61);
		reasonTextArea.setLineWrap(true);
		
		String[] applyToRoles = new String[] {"HOD", "DOFA", "DORC", "Director"};
		
		JComboBox<String> comboBox_1 = new JComboBox(applyToRoles);
		comboBox_1.setBounds(360, 336, 83, 20);
		
		JLabel lblApplyTo = new JLabel("Apply to");
		lblApplyTo.setBounds(237, 339, 113, 14);
		
		JButton btnGoToAppraisal = new JButton("Submit Leave Application");
		btnGoToAppraisal.setBounds(166, 468, 180, 23);
		
		JLabel numberOfLeaveDays = new JLabel("1");
		numberOfLeaveDays.setBounds(149, 339, 46, 14);
		
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		URL dateImageURL = LeaveApplication.class.getResource("/resources/datepickerbutton1.png");
        Image dateExampleImage = Toolkit.getDefaultToolkit().getImage(dateImageURL);
        ImageIcon dateExampleIcon = new ImageIcon(dateExampleImage);

		DatePickerSettings startDateSettings = new DatePickerSettings();
        startDateSettings.setFirstDayOfWeek(DayOfWeek.SUNDAY);
        startDateSettings.setAllowEmptyDates(false);
        startDateSettings.setAllowKeyboardEditing(false);
        
        
		DatePicker startDate = new DatePicker(startDateSettings);
		startDate.setBounds(72, 297, 160, 24);
		startDate.getComponentToggleCalendarButton().setBounds(136, 0, 24, 24);
		startDate.getComponentDateTextField().setBounds(0, 0, 136, 24);
        startDate.setDate(LocalDate.now().plusDays(7));
        JButton startDatePickerButton = startDate.getComponentToggleCalendarButton();
        startDatePickerButton.setText("");
        startDatePickerButton.setIcon(dateExampleIcon);
		startDate.setLayout(null);
		startDateSettings.setDateRangeLimits(LocalDate.now().plusDays(7), null);
		
		DatePickerSettings endDateSettings = startDateSettings.copySettings();
		DatePicker endDate = new DatePicker(endDateSettings);
		endDate.setBounds(285, 297, 160, 24);
		endDate.getComponentToggleCalendarButton().setBounds(136, 0, 24, 24);
		endDate.getComponentDateTextField().setBounds(0, 0, 136, 24);
        endDate.setDate(LocalDate.now().plusDays(7));
        JButton endDatePickerButton = endDate.getComponentToggleCalendarButton();
        endDatePickerButton.setText("");
        endDatePickerButton.setIcon(dateExampleIcon);
		endDate.setLayout(null);
		endDateSettings.setDateRangeLimits(LocalDate.now().plusDays(7), null);
		
		startDate.addDateChangeListener(new DateChangeListener() {
			
			@Override
			public void dateChanged(DateChangeEvent arg0) {
				// TODO Auto-generated method stub
				if(startDate.getDate().isAfter(endDate.getDate())) {
					endDate.setDate(startDate.getDate());
				}
				numberOfLeaveDays.setText(startDate.getDate().until(endDate.getDate(), ChronoUnit.DAYS) + 1 + "");				
			}
		});
		
		endDate.addDateChangeListener(new DateChangeListener() {
			
			@Override
			public void dateChanged(DateChangeEvent arg0) {
				// TODO Auto-generated method stub
				if(startDate.getDate().isAfter(endDate.getDate())) {
					startDate.setDate(endDate.getDate().minusDays(1));
				}
				numberOfLeaveDays.setText(startDate.getDate().until(endDate.getDate(), ChronoUnit.DAYS) + 1 + "");
			}
		});
		
		JCheckBox chckbxUrgent = new JCheckBox("Urgent");
		chckbxUrgent.setBounds(285, 250, 97, 23);
		chckbxUrgent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int minDays = 7;
				if(chckbxUrgent.isSelected()) {
					minDays = 0;
				}
				startDateSettings.setDateRangeLimits(LocalDate.now().plusDays(minDays), null);
				endDateSettings.setDateRangeLimits(LocalDate.now().plusDays(minDays), null);
				startDate.setDate(LocalDate.now().plusDays(minDays));
				endDate.setDate(LocalDate.now().plusDays(minDays));
			}
		});
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblEmployeeName);
		contentPane.add(textField);
		contentPane.add(lblDepartment);
		contentPane.add(textField_1);
		contentPane.add(lblEmployeeNo);
		contentPane.add(textField_2);
		contentPane.add(lblDate);
		contentPane.add(textField_3);
		contentPane.add(lblDesignation);
		contentPane.add(textField_4);
		contentPane.add(lblLeaveDetails);
		contentPane.add(lblNewLabel_1);
		contentPane.add(comboBox);
		contentPane.add(startDate);
		contentPane.add(endDate);
		contentPane.add(lblFrom);
		contentPane.add(lblTo);
		contentPane.add(lblTotalNoOf);
		contentPane.add(lblReason);
		contentPane.add(reasonTextArea);
		contentPane.add(lblApplyTo);
		contentPane.add(comboBox_1);
		contentPane.add(btnGoToAppraisal);
		contentPane.add(numberOfLeaveDays);
		contentPane.add(chckbxUrgent);
		
	}
}
