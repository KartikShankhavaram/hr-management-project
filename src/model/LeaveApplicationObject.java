/**
 * 
 */
package model;

/**
 * @author Kartik Shankhavaram
 *
 */
public class LeaveApplicationObject {
	private String employeeName;
	private String employeeDept;
	private String employeeNo;
	private String applicationDate;
	private String designation;
	private String typeOfLeave;
	private boolean isUrgent;
	private String startDate;
	private String endDate;
	private int totalDays;
	private String appliedTo;
	private String leaveReason;
	private boolean isApproved;

	public LeaveApplicationObject(String employeeName, String employeeDept, String employeeNo, String applicationDate,
			String designation, String typeOfLeave, boolean isUrgent, String startDate, String endDate, int totalDays,
			String appliedTo, String leaveReason) {
		super();
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeNo = employeeNo;
		this.applicationDate = applicationDate;
		this.designation = designation;
		this.typeOfLeave = typeOfLeave;
		this.isUrgent = isUrgent;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalDays = totalDays;
		this.appliedTo = appliedTo;
		this.leaveReason = leaveReason;
	}

	public LeaveApplicationObject(String employeeName, String employeeDept, String employeeNo, String applicationDate,
			String designation, String typeOfLeave, boolean isUrgent, String startDate, String endDate, int totalDays,
			String appliedTo, String leaveReason, boolean isApproved) {
		super();
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeNo = employeeNo;
		this.applicationDate = applicationDate;
		this.designation = designation;
		this.typeOfLeave = typeOfLeave;
		this.isUrgent = isUrgent;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalDays = totalDays;
		this.appliedTo = appliedTo;
		this.leaveReason = leaveReason;
		this.isApproved = isApproved;
	}



	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTypeOfLeave() {
		return typeOfLeave;
	}

	public void setTypeOfLeave(String typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}

	public boolean isUrgent() {
		return isUrgent;
	}

	public void setUrgent(boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public String getAppliedTo() {
		return appliedTo;
	}

	public void setAppliedTo(String appliedTo) {
		this.appliedTo = appliedTo;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	@Override
	public String toString() {
		return "LeaveApplicationObject [employeeName=" + employeeName + ", employeeDept=" + employeeDept
				+ ", employeeNo=" + employeeNo + ", applicationDate=" + applicationDate + ", designation=" + designation
				+ ", typeOfLeave=" + typeOfLeave + ", isUrgent=" + isUrgent + ", startDate=" + startDate + ", endDate="
				+ endDate + ", totalDays=" + totalDays + ", appliedTo=" + appliedTo + ", leaveReason=" + leaveReason
				+ ", isApproved=" + isApproved + "]";
	}
	
}
