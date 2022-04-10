package Forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Users;
import mant.UserManage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginform extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField fpasword;
        

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
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
	public loginform() {
		setUndecorated(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(loginform.class.getResource("/imagenes/login-icon-button-vector-illustration-isolated-white-background-127000574.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 507);
		contentPane = new JPanel();
		contentPane.setName("");
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 102), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setLocationRelativeTo(null);
		

		JLabel lbluser = new JLabel("User");
		lbluser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbluser.setBounds(322, 149, 48, 30);
		contentPane.add(lbluser);

		txtuser = new JTextField();
		txtuser.setBorder(new LineBorder(new Color(0, 0, 102)));
		txtuser.setBounds(320, 190, 152, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);

		JLabel lblpasword = new JLabel("Pasword");
		lblpasword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblpasword.setBounds(322, 221, 84, 14);
		contentPane.add(lblpasword);

		JButton btnlogin = new JButton("Log in");
		btnlogin.setBorder(new LineBorder(new Color(0, 0, 102), 2));
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnlogin.setBounds(356, 301, 89, 23);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGin();
			}
		});
		contentPane.add(btnlogin);

		JButton btnsignin = new JButton("Sign in");
		btnsignin.setBorder(new LineBorder(new Color(0, 0, 102), 2));
		btnsignin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnsignin.setBounds(356, 348, 89, 23);
		btnsignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				openregister();
			}
		});
		contentPane.add(btnsignin);

		fpasword = new JPasswordField();
		fpasword.setBorder(new LineBorder(new Color(0, 0, 102)));
		fpasword.setBounds(322, 246, 150, 20);
		contentPane.add(fpasword);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(loginform.class.getResource("/image/kisspng-computer-icons-scalable-vector-graphics-login-clip-5c020cab6b8720.4616597715436381874404 (1).jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(281, 139, 45, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(loginform.class.getResource("/image/pass icon.png")));
		lblNewLabel_1.setBounds(281, 205, 45, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(loginform.class.getResource("/image/\u2014Pngtree\u2014user avatar login interface abstract_6796241 (1).png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(299, 24, 192, 114);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Estas seguro que quieres cerrar la aplicacion?", "Confirmacion", JOptionPane.YES_NO_OPTION)== 0) {
					loginform.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.black);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setBounds(735, 0, 20, 20);
		contentPane.add(lblX);
	}

	protected void openregister() {
		
		this.dispose();
		
		Register REGISTER = new Register();
	    REGISTER.setVisible(true);
		
	}

	protected void LOGin() {

		String usuarios = txtuser.getText();
		String clave = String.valueOf(fpasword.getPassword());

		UserManage usermanage = new UserManage();

		Users use2 = new Users();
		use2.setUsuarios(usuarios);
		use2.setClave(clave);
		Users use = usermanage.obtenerUser(use2);

		if (use!=null) {
			JOptionPane.showMessageDialog(contentPane, "Welcome");
                        
                        this.dispose();
                        UsersRegisters usersname = new UsersRegisters();
                        usersname.setVisible(true);
            
			
			
		} else {

			JOptionPane.showMessageDialog(contentPane, "Datos incorrectos, si no esta registrado debe registrarse.", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}
}
