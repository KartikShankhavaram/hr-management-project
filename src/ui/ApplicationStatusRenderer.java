package ui;

import java.awt.Component;
import java.awt.FlowLayout;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import model.LeaveApplicationObject;

public class ApplicationStatusRenderer extends JLabel implements ListCellRenderer<LeaveApplicationObject> {

	@Override
	public Component getListCellRendererComponent(JList<? extends LeaveApplicationObject> list,
			LeaveApplicationObject value, int index, boolean isSelected, boolean cellHasFocus) {	
		
		JLabel lblIndex = new JLabel(index + 1 + ". ");
		lblIndex.setBounds(0, 0, 20, 50);
		JLabel lblEmployeeName = new JLabel(value.getEmployeeName());
		lblEmployeeName.setBounds(0, 25, 75, 50);
		
		LocalDate startDate;
		LocalDate endDate;
		
		DateTimeFormatter formatToString = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		startDate = LocalDate.parse(value.getStartDate(), parseFormat);
		endDate = LocalDate.parse(value.getEndDate(), parseFormat);
		if(startDate == null || endDate == null)
			return null;
		System.out.println(list.getModel().getSize());
		JLabel labelStartDate = new JLabel(startDate.format(formatToString));
		labelStartDate.setBounds(0, 105, 40, 50);
		JLabel lblEndDate = new JLabel(endDate.format(formatToString));
		lblEndDate.setBounds(0, 150, 40, 50);
		setText(index + 1 + ". " + "  " + value.getEmployeeName() + "  " + startDate.format(formatToString) + "   " + endDate.format(formatToString));
		return this;
	}

}
