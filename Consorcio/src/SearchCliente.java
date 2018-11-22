import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchCliente extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField txtPesquisar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchCliente frame = new SearchCliente();
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
	public SearchCliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 780, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(173, 255, 47));
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new LineBorder(new Color(173, 255, 47)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBackground(new Color(255, 255, 255));
		txtPesquisar.setBounds(109, 100, 650, 20);
		contentPane.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(173, 255, 47)));
		panel.setBounds(0, 50, 780, 468);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPesquisar.setBounds(10, 49, 89, 23);
		panel.add(btnPesquisar);
		
		JLabel lblPesquisaDeClientes = new JLabel("PESQUISA DE CLIENTES");
		lblPesquisaDeClientes.setForeground(new Color(0, 0, 0));
		lblPesquisaDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPesquisaDeClientes.setBounds(269, 0, 221, 52);
		contentPane.add(lblPesquisaDeClientes);
	}
}
