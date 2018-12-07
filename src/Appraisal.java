import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Appraisal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 474, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 417, 438, 1000);
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
		lblWhatToAdd.setBounds(32, 352, 95, 14);
		contentPane.add(lblWhatToAdd);
		panel.setLayout(null);
		
		JRadioButton rdbtnPaper = new JRadioButton("Paper");
		buttonGroup.add(rdbtnPaper);
		rdbtnPaper.setBounds(142, 348, 86, 23);
		contentPane.add(rdbtnPaper);
		
		rdbtnPaper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel.removeAll();
				
				JLabel lblName = new JLabel("Title");
				lblName.setBounds(20, 27, 46, 14);
				panel.add(lblName);
				
				textField_4 = new JTextField();
				textField_4.setBounds(107, 24, 308, 20);
				panel.add(textField_4);
				textField_4.setColumns(10);
				
				JLabel lblDescription = new JLabel("Description");
				lblDescription.setBounds(20, 71, 77, 14);
				panel.add(lblDescription);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(107, 66, 308, 72);
				panel.add(textArea_1);
				
				JLabel lblDateOfPublication = new JLabel("Date of publication");
				lblDateOfPublication.setBounds(10, 173, 95, 14);
				panel.add(lblDateOfPublication);
				
				JLabel lblAreYouThe = new JLabel("Are you the first author?");
				lblAreYouThe.setBounds(10, 198, 163, 14);
				panel.add(lblAreYouThe);
				
				String choices[] = new String[] {"Yes", "No"};
				
				JComboBox comboBox = new JComboBox(choices);
				comboBox.setBounds(183, 198, 77, 20);
				panel.add(comboBox);
				
				JLabel lblPublishedInWhich = new JLabel("Published in which journals?");
				lblPublishedInWhich.setBounds(10, 246, 163, 14);
				panel.add(lblPublishedInWhich);
				
				JTextArea textArea_2 = new JTextArea();
				textArea_2.setBounds(183, 241, 199, 42);
				panel.add(textArea_2);
			
				validate();
				repaint();
			}
		});
		
		JRadioButton rdbtnConference = new JRadioButton("Conference");
		buttonGroup.add(rdbtnConference);
		rdbtnConference.setBounds(274, 348, 101, 23);
		contentPane.add(rdbtnConference);
		
		rdbtnConference.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Conference choice
				
				panel.removeAll();

				JLabel lblConferenceTopic = new JLabel("Conference Topic");
				lblConferenceTopic.setBounds(18, 35, 105, 14);
				panel.add(lblConferenceTopic);
				
				textField_5 = new JTextField();
				textField_5.setBounds(133, 32, 86, 20);
				panel.add(textField_5);
				textField_5.setColumns(10);
				
				JLabel lblAttendedconducted = new JLabel("Attended/Conducted");
				lblAttendedconducted.setBounds(18, 212, 131, 14);
				panel.add(lblAttendedconducted);
				
				String[] confChoice = new String[] {"Attended", "Conducted"};
				
				JComboBox comboBox = new JComboBox(confChoice);
				comboBox.setBounds(159, 209, 77, 20);
				panel.add(comboBox);
				
				JLabel lblDescription = new JLabel("Description");
				lblDescription.setBounds(18, 83, 53, 14);
				panel.add(lblDescription);
				
				JTextArea textArea_1 = new JTextArea();
				textArea_1.setBounds(99, 78, 329, 89);
				panel.add(textArea_1);
				
				JLabel lblWasSpeaker = new JLabel("Was Speaker?");
				lblWasSpeaker.setBounds(18, 181, 68, 14);
				panel.add(lblWasSpeaker);
				
				JComboBox comboBox_1 = new JComboBox(new String[] {"Yes", "No"});
				comboBox_1.setBounds(159, 178, 42, 20);
				panel.add(comboBox_1);
				
				JLabel lblDateOfConference = new JLabel("Date of conference");
				lblDateOfConference.setBounds(18, 250, 93, 14);
				panel.add(lblDateOfConference);
				
				validate();
				repaint();
			}
		});
	}
}
