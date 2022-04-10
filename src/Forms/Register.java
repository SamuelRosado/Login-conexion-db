 package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Users;
import mant.RegisterManage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtlastname;
	private JTextField txtnumberphone;
	private JTextField txtemail;
	private JTextField txtUser;
	private JPasswordField FPassword;
	private JPasswordField fconfirmpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(245, 323, 75, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(245, 359, 75, 34);
		contentPane.add(lblPassword);
		
		JLabel lblPasswordConfirm = new JLabel("Confirm Password");
		lblPasswordConfirm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPasswordConfirm.setBounds(239, 404, 119, 26);
		contentPane.add(lblPasswordConfirm);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(245, 166, 98, 26);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLastName.setBounds(245, 203, 75, 34);
		contentPane.add(lblLastName);
		
		JLabel lblNumberPhone = new JLabel("Number Phone");
		lblNumberPhone.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNumberPhone.setBounds(245, 248, 98, 25);
		contentPane.add(lblNumberPhone);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(245, 284, 63, 27);
		contentPane.add(lblNewLabel_6);
		
		JButton btnsign_in = new JButton("Sign in");
		btnsign_in.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnsign_in.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnsign_in.setForeground(Color.black);
				
			}
		});
		btnsign_in.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SIGNIN();
				
			}
		});
		btnsign_in.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnsign_in.setBounds(312, 462, 98, 34);
		contentPane.add(btnsign_in);
		
		txtName = new JTextField();
		txtName.setBounds(371, 170, 129, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtlastname = new JTextField();
		txtlastname.setBounds(371, 211, 129, 20);
		contentPane.add(txtlastname);
		txtlastname.setColumns(10);
		
		txtnumberphone = new JTextField();
		txtnumberphone.setBounds(371, 251, 129, 20);
		contentPane.add(txtnumberphone);
		txtnumberphone.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(371, 288, 129, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setBounds(371, 326, 129, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		FPassword = new JPasswordField();
		FPassword.setBounds(371, 367, 129, 20);
		contentPane.add(FPassword);
		
		fconfirmpassword = new JPasswordField();
		fconfirmpassword.setBounds(371, 408, 129, 20);
		contentPane.add(fconfirmpassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Register.class.getResource("/image/candado (1).png")));
		lblNewLabel_1.setBounds(215, 11, 332, 144);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SIGN IN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(205, 68, 98, 34);
		contentPane.add(lblNewLabel_2);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener((ActionEvent e) -> {
                    
                    this.dispose();
                    loginform logform = new loginform();
                    logform.setVisible(true);
                });
		btnback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				btnback.setForeground(Color.black);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnback.setForeground(Color.blue);
			}
                        
		});
                
                
		btnback.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnback.setBounds(0, 0, 105, 34);
		contentPane.add(btnback);
                
                
                
                
                
	}
        

	protected void SIGNIN() {
		
		String usuarios = txtUser.getText();
		String clave = String.valueOf(FPassword.getPassword());
		String conclave = String.valueOf(fconfirmpassword.getPassword());
		String nombre = txtName.getText();
		String apellido = txtlastname.getText();
		String numero_telefono = txtnumberphone.getText();
		String email = txtemail.getText();
		
                 if(FPassword.getText().equals(fconfirmpassword.getText())){
                    
                
                
                
		Users users = new Users();
		
		users.setUsuarios(usuarios);
		users.setClave(clave);
		users.setConclave(conclave);
		users.setNombre(nombre);
		users.setApellido(apellido);
		users.setNumero_telefono(numero_telefono);
		users.setEmail(email);
		
		RegisterManage registmanage = new RegisterManage();
		
		int ko = registmanage.register(users);
                             
		
		if(ko >0 ) {
			JOptionPane.showMessageDialog(contentPane, "Usuario registrado correctamente.");   
                        
                    this.dispose();
                    loginform logform = new loginform();
                    logform.setVisible(true);
                        
		}
		else {
			JOptionPane.showMessageDialog(contentPane, "Error al registrar usuario.","ERROR", JOptionPane.WARNING_MESSAGE);
		}
                 }
                 else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                                
                }
		
	}
}
