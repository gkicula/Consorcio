import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import connectionFactory.Conexao;

import java.awt.Font;

public class TelaPrincipal extends JFrame {
	
	Conexao conecta = new Conexao();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		
		conecta.obterConexao();
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 400);
		setUndecorated(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu menuCadastros = new JMenu("Cadastros");
		menuBar.add(menuCadastros);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCliente tela = new FormCliente();
				tela.setVisible(true);
			}
		});
		menuCadastros.add(btnCliente);
		
		JMenu menuRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(menuRelatrios);
		
		JMenu menuFerramentas = new JMenu("Ferramentas");
		menuBar.add(menuFerramentas);
		
		JButton btnTelaBemVindo = new JButton("Tela Bem Vindo");
		btnTelaBemVindo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				dispose();
			}
		});
		menuFerramentas.add(btnTelaBemVindo);
		
		JMenu menuSair = new JMenu("Sair");
		menuBar.add(menuSair);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
		});
		menuSair.add(btnSair);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrameBemVindo = new JInternalFrame("Bem-vindo");
		internalFrameBemVindo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		internalFrameBemVindo.setBounds(0, 0, 764, 354);
		contentPane.add(internalFrameBemVindo);
		internalFrameBemVindo.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 61, 748, 252);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		internalFrameBemVindo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnCadastroCliente = new JButton("");
		btnCadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCliente tela = new FormCliente();
				tela.setVisible(true);
			}
		});
		btnCadastroCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/addCliente.png")));
		btnCadastroCliente.setBounds(10, 11, 74, 66);
		panel.add(btnCadastroCliente);
		
		JButton btnProcurarCliente = new JButton("");
		btnProcurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchCliente tela = new SearchCliente();
				tela.setVisible(true);
			}
		});
		btnProcurarCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/btnSearch.png")));
		btnProcurarCliente.setBounds(10, 88, 74, 66);
		panel.add(btnProcurarCliente);
		
		JButton btnSairBemVindo = new JButton("");
		btnSairBemVindo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				internalFrameBemVindo.dispose();
				
			}
		});
		btnSairBemVindo.setBackground(Color.WHITE);
		btnSairBemVindo.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/botaoSair.png")));
		btnSairBemVindo.setBounds(663, 0, 85, 60);
		internalFrameBemVindo.getContentPane().add(btnSairBemVindo);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo");
		lblSejaBemVindo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSejaBemVindo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 40));
		lblSejaBemVindo.setBounds(10, 10, 420, 50);
		internalFrameBemVindo.getContentPane().add(lblSejaBemVindo);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{menuBar, menuCadastros, menuRelatrios, menuFerramentas, btnTelaBemVindo, menuSair, btnSair, contentPane, internalFrameBemVindo, internalFrameBemVindo.getContentPane(), panel, btnSairBemVindo}));
		internalFrameBemVindo.setVisible(true);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
