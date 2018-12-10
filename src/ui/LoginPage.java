package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoginAsStaff = new JButton("Login as Staff");
		btnLoginAsStaff.setBounds(51, 80, 117, 23);
		contentPane.add(btnLoginAsStaff);
		
		JButton btnLoginAsDofa = new JButton("Login as DOFA");
		btnLoginAsDofa.setBounds(258, 80, 117, 23);
		contentPane.add(btnLoginAsDofa);
		
		JButton btnLoginAsDorc = new JButton("Login as DORC");
		btnLoginAsDorc.setBounds(51, 161, 117, 23);
		contentPane.add(btnLoginAsDorc);
		
		JButton btnLoginAsDirector = new JButton("Login as Director");
		btnLoginAsDirector.setBounds(258, 161, 117, 23);
		contentPane.add(btnLoginAsDirector);
		
		JLabel lblLnmiit = new JLabel("LNMIIT");
		lblLnmiit.setBounds(190, 11, 46, 14);
		contentPane.add(lblLnmiit);
		
		
	}
}
