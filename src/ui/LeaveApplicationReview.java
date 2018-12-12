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

import model.LeaveApplicationModel;
import utils.Constants;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.SwingConstants;

public class LeaveApplicationReview extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private LeaveApplicationModel application;
	private LeaveApplicationDecision instance;
	private int userType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					LeaveApplicationReview frame = new LeaveApplicationReview();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeaveApplicationReview(LeaveApplicationModel application, int userType, LeaveApplicationDecision instance) {
		
		this.application = application;
		this.userType = userType;
		this.instance = instance;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Leave Application Review TS");
		lblNewLabel.setBounds(149, 11, 303, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setBounds(26, 53, 113, 14);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(312, 139, 85, 14);
		
		JLabel lblEmployeeId = new JLabel("Employee No");
		lblEmployeeId.setBounds(26, 97, 113, 14);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(312, 97, 85, 14);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setBounds(26, 139, 113, 14);
		
		JLabel lblLeaveDetails = new JLabel("Leave Details");
		lblLeaveDetails.setBounds(208, 182, 113, 14);
		lblLeaveDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNewLabel_1 = new JLabel("Type of Leave");
		lblNewLabel_1.setBounds(26, 254, 113, 14);
		
		String[] leaves = new String[] {"PL", "CL", "ODL", "OL"};
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(26, 297, 46, 24);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(288, 297, 46, 24);
		
		JLabel lblTotalNoOf = new JLabel("Total no. of days");
		lblTotalNoOf.setBounds(26, 339, 113, 14);
		
		JLabel lblReason = new JLabel("Reason");
		lblReason.setBounds(29, 381, 54, 24);
		
		String[] applyToRoles = new String[] {"HOD", "DOFA", "DORC", "Director"};
		
		JLabel numberOfLeaveDays = new JLabel("");
		numberOfLeaveDays.setBounds(149, 339, 46, 14);
		
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblEmployeeName);
		contentPane.add(lblDepartment);
		contentPane.add(lblEmployeeId);
		contentPane.add(lblDate);
		contentPane.add(lblDesignation);
		contentPane.add(lblLeaveDetails);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblFrom);
		contentPane.add(lblTo);
		contentPane.add(lblTotalNoOf);
		contentPane.add(lblReason);
		contentPane.add(numberOfLeaveDays);
		
		JLabel lblEName = new JLabel("");
		lblEName.setBounds(149, 53, 185, 14);
		contentPane.add(lblEName);
		
		JLabel lblEId = new JLabel("");
		lblEId.setBounds(149, 97, 151, 14);
		contentPane.add(lblEId);
		
		JLabel lblEDesignation = new JLabel("");
		lblEDesignation.setBounds(149, 139, 164, 14);
		contentPane.add(lblEDesignation);
		
		JLabel lblEDept = new JLabel("");
		lblEDept.setBounds(410, 139, 86, 14);
		contentPane.add(lblEDept);
		
		JLabel lblEAppDate = new JLabel("");
		lblEAppDate.setBounds(410, 97, 85, 14);
		contentPane.add(lblEAppDate);
		
		JLabel lblETypeOfLeave = new JLabel("");
		lblETypeOfLeave.setBounds(149, 254, 94, 14);
		contentPane.add(lblETypeOfLeave);
		
		JLabel lblUrgent = new JLabel("Urgent ");
		lblUrgent.setBounds(284, 254, 85, 14);
		contentPane.add(lblUrgent);
		
		JLabel labelEUrgent = new JLabel("");
		labelEUrgent.setBounds(402, 254, 59, 14);
		contentPane.add(labelEUrgent);
		
		JLabel lblEEndDate = new JLabel("");
		lblEEndDate.setBounds(372, 302, 111, 14);
		contentPane.add(lblEEndDate);
		
		JLabel lblEStartDate = new JLabel("");
		lblEStartDate.setBounds(149, 302, 100, 14);
		contentPane.add(lblEStartDate);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(332, 339, 95, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(93, 381, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblEReason = new JLabel("");
		lblEReason.setVerticalAlignment(SwingConstants.TOP);
		lblEReason.setBounds(95, 386, 388, 70);
		contentPane.add(lblEReason);
		
		JLabel lblHodsApproval = new JLabel("HOD's Approval");
		lblHodsApproval.setBounds(26, 476, 113, 14);
		contentPane.add(lblHodsApproval);
		
		JLabel lblDofa = new JLabel("DoFA's approval");
		lblDofa.setBounds(26, 526, 113, 14);
		contentPane.add(lblDofa);
		
		JLabel lblDirector = new JLabel("Director's Approval");
		lblDirector.setBounds(239, 476, 141, 14);
		contentPane.add(lblDirector);
		
		JLabel lblHodApproval = new JLabel("Pending");
		lblHodApproval.setBounds(149, 476, 85, 14);
		contentPane.add(lblHodApproval);
		
		JLabel lblDofaApproval = new JLabel("Pending");
		lblDofaApproval.setBounds(149, 526, 94, 14);
		contentPane.add(lblDofaApproval);
		
		JLabel lblDirectorApproval = new JLabel("Pending");
		lblDirectorApproval.setBounds(392, 476, 69, 14);
		contentPane.add(lblDirectorApproval);
		
		JButton button = new JButton("Approve ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				approveApplication();
			}
		});
		button.setBounds(71, 576, 100, 23);
		contentPane.add(button);
		
		JButton btnReject = new JButton("Reject ");
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rejectApplication();
			}
		});
		btnReject.setBounds(208, 576, 89, 23);
		contentPane.add(btnReject);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		getDepartment();
		lblEName.setText(application.getEmployeeName());
		lblEId.setText(application.getEmployeeId());
		lblEDesignation.setText(application.getDesignation());
		lblEDept.setText(application.getEmployeeDept());
		lblEAppDate.setText(formatter.format(application.getApplicationDate()));
		lblEName.setText(application.getEmployeeName());
		lblEName.setText(application.getEmployeeName());
		lblETypeOfLeave.setText(application.getTypeOfLeave());
		labelEUrgent.setText(application.isUrgent()? "Yes" : "No");
		lblEStartDate.setText(formatter.format(application.getStartDate()));
		lblEEndDate.setText(formatter.format(application.getEndDate()));
		numberOfLeaveDays.setText(application.getTotalDays() + "");
		lblEReason.setText(application.getLeaveReason());
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				instance.recreate();
				setVisible(false);
			}
		});
		btnBack.setBounds(347, 575, 114, 25);
		contentPane.add(btnBack);
		switch(application.getHodStatus()) {
			case Constants.PENDING:
				lblHodApproval.setText("Pending");
				break;
			case Constants.APPROVED:
				lblHodApproval.setText("Approved");
				break;
			case Constants.REJECTED:
				lblHodApproval.setText("Rejected");
				break;
		}
		switch(application.getDofaStatus()) {
			case Constants.PENDING:
				lblDofaApproval.setText("Pending");
				break;
			case Constants.APPROVED:
				lblDofaApproval.setText("Approved");
				break;
			case Constants.REJECTED:
				lblDofaApproval.setText("Rejected");
				break;
		}
		switch(application.getDirectorStatus()) {
			case Constants.PENDING:
				lblDirectorApproval.setText("Pending");
				break;
			case Constants.APPROVED:
				lblDirectorApproval.setText("Approved");
				break;
			case Constants.REJECTED:
				lblDirectorApproval.setText("Rejected");
				break;
		}
		
	}
	
	private void getDepartment() {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName(Constants.JDBC_DRIVER);
			conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
			String query = "SELECT Department FROM Teaching_Staff WHERE EID = ?;";
			stmt = conn.prepareStatement(query);
			stmt.setString(1, application.getEmployeeId());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				application.setEmployeeDept(rs.getString("Department"));
			}
			rs.close();
			setVisible(true);
		} catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Failed to fetch data.", "Operation failed", JOptionPane.ERROR_MESSAGE);
			instance.recreate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Failed to fetch data.", "Operation failed", JOptionPane.ERROR_MESSAGE);
			instance.recreate();
		} finally {
			try {
				if(conn != null)
					conn.close();
				if(stmt != null)
					stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void approveApplication() {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName(Constants.JDBC_DRIVER);
			conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
			String query = null;
			conn.setAutoCommit(false);
			if(userType == Constants.HOD_CSE || userType == Constants.HOD_ECE || userType == Constants.HOD_MME) {
				query = "Update Leave_Applications set HOD_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.APPROVED);
				stmt.setInt(2, application.getApplicationId());
				stmt.executeUpdate();
				conn.commit();
			}else if(userType == Constants.DOFA) {
				query = "Update Leave_Applications set DOFA_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.APPROVED);
				stmt.setInt(2, application.getApplicationId());
				stmt.executeUpdate();
				conn.commit();
			} else if(userType == Constants.DIRECTOR) {
				query = "Update Leave_Applications set Director_Status = ?, Application_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.APPROVED);
				stmt.setInt(2, Constants.APPROVED);
				stmt.setInt(3, application.getApplicationId());
				stmt.executeUpdate();
				query = "Select * from LeaveRecord WHERE EID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setString(1, application.getEmployeeId());
				ResultSet rs = stmt.executeQuery();
				String typeOfLeave = application.getTypeOfLeave();
				rs.next();
				String leaves = rs.getString(typeOfLeave);
				String newCount = null;
				rs.close();
				if(typeOfLeave.equals("PL") || typeOfLeave.equals("CL")) {
					int currentCount = Integer.parseInt(leaves.split("/")[0]);
					newCount = (currentCount + application.getTotalDays()) + "/" + leaves.split("/")[1];
					if(typeOfLeave.equals("PL")) {
						query = "UPDATE LeaveRecord SET PL = ? WHERE EID = ?;";
						stmt = conn.prepareStatement(query);
						stmt.setString(1, newCount);
						stmt.setString(2, application.getEmployeeId());
					} else {
						query = "UPDATE LeaveRecord SET CL = ? WHERE EID = ?;";
						stmt = conn.prepareStatement(query);
						stmt.setString(1, newCount);
						stmt.setString(2, application.getEmployeeId());
					}
				} else {
					int currentCount = Integer.parseInt(leaves);
					newCount = (currentCount + application.getTotalDays()) + "";
					query = "UPDATE LeaveRecord SET " + typeOfLeave + " = ? WHERE EID = ?;";
					stmt = conn.prepareStatement(query);
					stmt.setString(1, newCount);
					stmt.setString(2, application.getEmployeeId());
				}
				stmt.executeUpdate();
				conn.commit();
			}
			JOptionPane.showMessageDialog(this, "Application successfully approved.", "Process successful", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			instance.recreate();
		} catch(SQLException e) {
			e.printStackTrace();
			try {
				if(conn != null) {
					conn.rollback();
				}
			} catch(SQLException e1) {
				
			}
			JOptionPane.showMessageDialog(this, "Could not approve application.", "Operation failed", JOptionPane.ERROR_MESSAGE);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Could not approve application.", "Operation failed", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				if(conn != null)
					conn.close();
				if(stmt != null)
					stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void rejectApplication() {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName(Constants.JDBC_DRIVER);
			conn = DriverManager.getConnection(Constants.DB_URL, Constants.USER, Constants.PASS);
			String query = null;
			if(userType == Constants.HOD_CSE || userType == Constants.HOD_ECE || userType == Constants.HOD_MME) {
				query = "Update Leave_Applications set HOD_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.REJECTED);
				stmt.setInt(2, application.getApplicationId());
				stmt.executeUpdate();
			} else if(userType == Constants.DOFA) {
				query = "Update Leave_Applications set DOFA_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.REJECTED);
				stmt.setInt(2, application.getApplicationId());
				stmt.executeUpdate();
			} else if(userType == Constants.DIRECTOR) {
				query = "Update Leave_Applications set Director_Status = ?, Application_Status = ? WHERE AID = ?;";
				stmt = conn.prepareStatement(query);
				stmt.setInt(1, Constants.REJECTED);
				stmt.setInt(2, Constants.REJECTED);
				stmt.setInt(3, application.getApplicationId());
				stmt.executeUpdate();
			}
			JOptionPane.showMessageDialog(this, "Application successfully rejected.", "Process successful", JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			instance.recreate();
		} catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Could not reject application.", "Operation failed", JOptionPane.ERROR_MESSAGE);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Could not reject application.", "Operation failed", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				if(conn != null)
					conn.close();
				if(stmt != null)
					stmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
