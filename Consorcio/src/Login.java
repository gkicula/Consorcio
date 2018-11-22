import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setUndecorated(true);
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 405);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 317, 364);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Button JbuttonEntrar = new Button("Entrar");
		JbuttonEntrar.setBounds(323, 322, 351, 31);
		JbuttonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  if(usuario.getText().equals("admin")&&senha.getText().equals("1234")) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				dispose();
			  }else {
				  JOptionPane.showMessageDialog(rootPane, "Senha ou Usuário Inválidos");
			  }
			}
		});
		JbuttonEntrar.setForeground(new Color(0, 51, 51));
		JbuttonEntrar.setBackground(new Color(124, 252, 0));
		contentPane.add(JbuttonEntrar);
		
		usuario = new JTextField();
		usuario.setBounds(325, 168, 349, 36);
		usuario.setColumns(10);
		contentPane.add(usuario);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setBounds(325, 137, 74, 20);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(325, 215, 74, 20);
		contentPane.add(lblSenha);
		
		senha = new JPasswordField();
		senha.setBounds(324, 246, 350, 36);
		contentPane.add(senha);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblX.setForeground(new Color(255, 0, 0));
		lblX.setBounds(657, 0, 27, 29);
		contentPane.add(lblX);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, JbuttonEntrar, usuario, lblUsuario, lblSenha}));
	}
}
