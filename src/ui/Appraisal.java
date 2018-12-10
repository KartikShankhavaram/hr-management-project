package ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Appraisal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable papersTable;
	private JPanel panel;
	private ImageIcon dateButtonIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appraisal frame = new Appraisal();
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
	public Appraisal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(471, 127, 438, 423);
		contentPane.add(panel);
		
		JLabel lblAppraisal = new JLabel("Appraisal Form");
		lblAppraisal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAppraisal.setBounds(161, 23, 132, 19);
		contentPane.add(lblAppraisal);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(32, 78, 95, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployeeNo = new JLabel("Employee No");
		lblEmployeeNo.setBounds(32, 128, 77, 14);
		contentPane.add(lblEmployeeNo);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(242, 78, 77, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(242, 128, 77, 14);
		contentPane.add(lblDesignation);
		
		textField = new JTextField();
		textField.setBounds(137, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(329, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 125, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(329, 125, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHeadOfAny = new JLabel("Special positions");
		lblHeadOfAny.setBounds(32, 233, 132, 14);
		contentPane.add(lblHeadOfAny);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(137, 228, 278, 81);
		contentPane.add(textArea);
		
		JLabel lblWhatToAdd = new JLabel("What to add?");
		lblWhatToAdd.setBounds(481, 78, 95, 14);
		contentPane.add(lblWhatToAdd);
		panel.setLayout(null);
		
		JRadioButton rdbtnPaper = new JRadioButton("Research Paper");
		buttonGroup.add(rdbtnPaper);
		rdbtnPaper.setBounds(627, 74, 121, 23);
		contentPane.add(rdbtnPaper);
		
		URL dateImageURL = LeaveApplication.class.getResource("/resources/datepickerbutton1.png");
        Image dateExampleImage = Toolkit.getDefaultToolkit().getImage(dateImageURL);
        dateButtonIcon = new ImageIcon(dateExampleImage);
        
        showPaperTable();
        rdbtnPaper.setSelected(true);
        
		rdbtnPaper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel.removeAll();
				showPaperTable();
				validate();
				repaint();
				
			}
		});
		
		JRadioButton rdbtnConference = new JRadioButton("Conference");
		buttonGroup.add(rdbtnConference);
		rdbtnConference.setBounds(808, 74, 101, 23);
		contentPane.add(rdbtnConference);
		
		rdbtnConference.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Conference choice
				
				panel.removeAll();
				
				String[] columnNames = {"No.", "Title", "Description", "Date of conference", "Was speaker", "Attended/Conducted" };      
				
				papersTable = new JTable(new String[][] {}, columnNames);
				papersTable.setBounds(10, 11, 418, 300);
				papersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
				papersTable.getColumnModel().getColumn(0).setPreferredWidth(25);
				papersTable.getColumnModel().getColumn(1).setPreferredWidth(75);
				papersTable.getColumnModel().getColumn(2).setPreferredWidth(200);
				papersTable.getColumnModel().getColumn(3).setPreferredWidth(150);
				papersTable.getColumnModel().getColumn(4).setPreferredWidth(90);
				papersTable.getColumnModel().getColumn(5).setPreferredWidth(110);
				JScrollPane sp=new JScrollPane(papersTable);
				sp.setBounds(10, 11, 418, 300);
				panel.add(sp);
				
				JButton btnAddConferenceEntry = new JButton("Add Conference Entry");
				
				btnAddConferenceEntry.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						panel.removeAll();
						showConferenceForm();
						validate();
						repaint();
					}
				});
				
				btnAddConferenceEntry.setBounds(152, 339, 160, 23);
				panel.add(btnAddConferenceEntry);
				
				validate();
				repaint();
			}
		});
				
	}
	
	private void showConferenceForm() {
		JLabel lblConferenceTopic = new JLabel("Conference Topic");
		lblConferenceTopic.setBounds(10, 0, 105, 20);
		panel.add(lblConferenceTopic);
		
		textField_5 = new JTextField();
		textField_5.setBounds(159, 0, 269, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAttendedconducted = new JLabel("Attended/Conducted");
		lblAttendedconducted.setBounds(18, 212, 131, 14);
		panel.add(lblAttendedconducted);
		
		String[] confChoice = new String[] {"Attended", "Conducted"};
		
		JComboBox comboBox = new JComboBox(confChoice);
		comboBox.setBounds(159, 209, 97, 20);
		panel.add(comboBox);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 60, 105, 14);
		panel.add(lblDescription);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(159, 55, 269, 89);
		panel.add(textArea_1);
		
		JLabel lblWasSpeaker = new JLabel("Was Speaker?");
		lblWasSpeaker.setBounds(18, 181, 97, 14);
		panel.add(lblWasSpeaker);
		
		JComboBox comboBox_1 = new JComboBox(new String[] {"Yes", "No"});
		comboBox_1.setBounds(159, 178, 77, 20);
		panel.add(comboBox_1);
		
		JLabel lblDateOfConference = new JLabel("Date of conference");
		lblDateOfConference.setBounds(18, 250, 131, 24);
		panel.add(lblDateOfConference);
		
		DatePickerSettings conferenceStartDateSettings = new DatePickerSettings();
		conferenceStartDateSettings.setFirstDayOfWeek(DayOfWeek.SUNDAY);
		conferenceStartDateSettings.setAllowEmptyDates(false);
		conferenceStartDateSettings.setAllowKeyboardEditing(false);
		
		DatePicker conferenceStartDate = new DatePicker(conferenceStartDateSettings);
		conferenceStartDate.setBounds(159, 251, 160, 24);
		conferenceStartDate.getComponentToggleCalendarButton().setBounds(136, 0, 24, 24);
		conferenceStartDate.getComponentDateTextField().setBounds(0, 0, 136, 24);
        conferenceStartDate.setDate(LocalDate.now());
        JButton conferenceStartDatePickerButton = conferenceStartDate.getComponentToggleCalendarButton();
        conferenceStartDatePickerButton.setText("");
        conferenceStartDatePickerButton.setIcon(dateButtonIcon);
		conferenceStartDate.setLayout(null);
		conferenceStartDateSettings.setDateRangeLimits(null, LocalDate.now());
		panel.add(conferenceStartDate);
		
		DatePickerSettings conferenceEndDateSettings = new DatePickerSettings();
		conferenceEndDateSettings.setFirstDayOfWeek(DayOfWeek.SUNDAY);
		conferenceEndDateSettings.setAllowEmptyDates(false);
		conferenceEndDateSettings.setAllowKeyboardEditing(false);
		
		DatePicker conferenceEndDate = new DatePicker(conferenceEndDateSettings);
		conferenceEndDate.setBounds(159, 311, 160, 24);
		conferenceEndDate.getComponentToggleCalendarButton().setBounds(136, 0, 24, 24);
		conferenceEndDate.getComponentDateTextField().setBounds(0, 0, 136, 24);
		conferenceEndDate.setDate(LocalDate.now());
        JButton conferenceEndDatePickerButton = conferenceEndDate.getComponentToggleCalendarButton();
        conferenceEndDatePickerButton.setText("");
        conferenceEndDatePickerButton.setIcon(dateButtonIcon);
        conferenceEndDate.setLayout(null);
		conferenceEndDateSettings.setDateRangeLimits(null, LocalDate.now());
		panel.add(conferenceEndDate);
		
		conferenceStartDate.addDateChangeListener(new DateChangeListener() {
			
			@Override
			public void dateChanged(DateChangeEvent arg0) {
				// TODO Auto-generated method stub
				if(conferenceStartDate.getDate().isAfter(conferenceEndDate.getDate())) {
					conferenceEndDate.setDate(conferenceStartDate.getDate());
				}			
			}
		});
		
		conferenceEndDate.addDateChangeListener(new DateChangeListener() {
			
			@Override
			public void dateChanged(DateChangeEvent arg0) {
				// TODO Auto-generated method stub
				if(conferenceStartDate.getDate().isAfter(conferenceEndDate.getDate())) {
					conferenceStartDate.setDate(conferenceEndDate.getDate());
				}			
			}
		});
		
		JLabel lblTo = new JLabel("to");
		lblTo.setBounds(216, 286, 46, 14);
		panel.add(lblTo);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(83, 381, 89, 23);
		panel.add(btnSubmit);
				
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				showConferenceTable();
				validate();
				repaint();
			}
		});
		btnCancel.setBounds(283, 381, 89, 23);
		panel.add(btnCancel);
	}
	
	private void showConferenceTable() {
		String[] columnNames = {"No.", "Title", "Description", "Date of conference", "Was speaker", "Attended/Conducted" };      
		
		papersTable = new JTable(new String[][] {}, columnNames);
		papersTable.setBounds(10, 11, 418, 300);
		papersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		papersTable.getColumnModel().getColumn(0).setPreferredWidth(25);
		papersTable.getColumnModel().getColumn(1).setPreferredWidth(75);
		papersTable.getColumnModel().getColumn(2).setPreferredWidth(200);
		papersTable.getColumnModel().getColumn(3).setPreferredWidth(150);
		papersTable.getColumnModel().getColumn(4).setPreferredWidth(90);
		papersTable.getColumnModel().getColumn(5).setPreferredWidth(110);
		JScrollPane sp=new JScrollPane(papersTable);
		sp.setBounds(10, 11, 418, 300);
		panel.add(sp);
		
		JButton btnAddConferenceEntry = new JButton("Add Conference Entry");
		
		btnAddConferenceEntry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				showConferenceForm();
				validate();
				repaint();
			}
		});
		
		btnAddConferenceEntry.setBounds(152, 339, 160, 23);
		panel.add(btnAddConferenceEntry);
	}
	
	private void showPaperForm() {
		JLabel lblName = new JLabel("Title");
		lblName.setBounds(10, 0, 46, 20);
		panel.add(lblName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(107, 0, 308, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 71, 77, 14);
		panel.add(lblDescription);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(107, 66, 308, 72);
		panel.add(textArea_1);
		
		JLabel lblDateOfPublication = new JLabel("Date of publication");
		lblDateOfPublication.setBounds(10, 173, 116, 14);
		panel.add(lblDateOfPublication);
		
		DatePickerSettings publicationDateSettings = new DatePickerSettings();
        publicationDateSettings.setFirstDayOfWeek(DayOfWeek.SUNDAY);
        publicationDateSettings.setAllowEmptyDates(false);
        publicationDateSettings.setAllowKeyboardEditing(false);
        
		DatePicker publicationDatePicker = new DatePicker(publicationDateSettings);
		publicationDatePicker.setBounds(186, 169, 160, 24);
		panel.add(publicationDatePicker);
		publicationDatePicker.getComponentToggleCalendarButton().setBounds(136, 0, 24, 24);
		publicationDatePicker.getComponentDateTextField().setBounds(0, 0, 136, 24);
		publicationDatePicker.setDate(LocalDate.now());
		JButton publicationDatePickerButton = publicationDatePicker.getComponentToggleCalendarButton();
		publicationDatePickerButton.setText("");
		publicationDatePickerButton.setIcon(dateButtonIcon);
		publicationDatePicker.setLayout(null);
		publicationDateSettings.setDateRangeLimits(null, LocalDate.now());
		
		JLabel lblAreYouThe = new JLabel("Are you the first author?");
		lblAreYouThe.setBounds(10, 204, 163, 14);
		panel.add(lblAreYouThe);
		
		String choices[] = new String[] {"Yes", "No"};
		
		JComboBox comboBox = new JComboBox(choices);
		comboBox.setBounds(186, 201, 77, 20);
		panel.add(comboBox);
		
		JLabel lblPublishedInWhich = new JLabel("Published in which journals?");
		lblPublishedInWhich.setBounds(10, 246, 163, 14);
		panel.add(lblPublishedInWhich);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(183, 241, 199, 42);
		panel.add(textArea_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(83, 330, 89, 23);
		panel.add(btnSubmit);
				
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				showPaperTable();
				validate();
				repaint();
			}
		});
		btnCancel.setBounds(283, 330, 89, 23);
		panel.add(btnCancel);
	}
	
	private void showPaperTable() {
		String[] columnNames = {"No.", "Title", "Description", "Date of publication", "First Author", "Journals" };      
		
		papersTable = new JTable(new String[][] {}, columnNames);
		papersTable.setBounds(10, 11, 418, 300);
		papersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		papersTable.getColumnModel().getColumn(0).setPreferredWidth(25);
		papersTable.getColumnModel().getColumn(1).setPreferredWidth(75);
		papersTable.getColumnModel().getColumn(2).setPreferredWidth(200);
		papersTable.getColumnModel().getColumn(3).setPreferredWidth(120);
		papersTable.getColumnModel().getColumn(5).setPreferredWidth(200);
		JScrollPane sp=new JScrollPane(papersTable);
		sp.setBounds(10, 11, 418, 300);
		panel.add(sp);
		
		JButton btnAddPaper = new JButton("Add Paper Entry");
		btnAddPaper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				showPaperForm();
				validate();
				repaint();
			}
		});
		btnAddPaper.setBounds(152, 339, 160, 23);
		panel.add(btnAddPaper);
	}
}