import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import br.com.Consorcio.bean.ModeloCliente;
import br.com.Consorcio.bean.ModeloContatoCliente;
import br.com.Consorcio.bean.ModeloEnderecoCliente;
import br.com.Consorcio.bean.ModeloSexo;
import br.com.Consorcio.dao.ClienteDao;
import br.com.Consorcio.dao.ContatoClienteDao;
import br.com.Consorcio.dao.EnderecoClienteDao;
import br.com.Consorcio.dao.SexoDao;
import connectionFactory.Conexao;

import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;

public class FormCliente extends JFrame {
	
	ModeloContatoCliente mode = new ModeloContatoCliente();
	ContatoClienteDao contro = new ContatoClienteDao();
	ModeloEnderecoCliente model = new ModeloEnderecoCliente();
	EnderecoClienteDao control = new EnderecoClienteDao();
	ModeloCliente modelo = new ModeloCliente();	
	ClienteDao controle = new ClienteDao();
	Conexao conex = new Conexao();

	private JPanel contentPane;
	private JLabel lblCelularDois;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtDataNascimento;
	private JTextField txtCidade;
	private JTextField txtRua;
	private JTextField txtCep;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtCelularUm;
	private JTextField txtCelularDois;
	private JTextField txtCelularTres;
	private JTextField txtTelefoneUm;
	private JTextField txtTelefoneDois;
	private JTextField txtEmail;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
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
	public FormCliente() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 780, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(0, 31, 780, 469);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(38, 113, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(38, 138, 46, 14);
		panel.add(lblCpf);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(208, 138, 46, 14);
		panel.add(lblRg);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(38, 169, 106, 14);
		panel.add(lblDataDeNascimento);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(394, 113, 46, 14);
		panel.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(599, 113, 46, 14);
		panel.add(lblBairro);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(394, 139, 46, 14);
		panel.add(lblRua);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(616, 139, 46, 14);
		panel.add(lblNmero);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(394, 164, 46, 14);
		panel.add(lblCep);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(539, 164, 70, 14);
		panel.add(lblComplemento);
		
		JLabel lblGeral = new JLabel("GERAL");
		lblGeral.setBounds(86, 64, 46, 14);
		lblGeral.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		panel.add(lblGeral);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setBounds(423, 64, 77, 14);
		lblEndereo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		panel.add(lblEndereo);
		
		JLabel lblContato = new JLabel("CONTATO");
		lblContato.setBounds(86, 250, 70, 14);
		lblContato.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		panel.add(lblContato);
		
		JLabel lblCelularUm = new JLabel("Celular");
		lblCelularUm.setBounds(38, 284, 46, 14);
		panel.add(lblCelularUm);
		
		lblCelularDois = new JLabel("Celular");
		lblCelularDois.setBounds(38, 309, 46, 14);
		panel.add(lblCelularDois);
		
		JLabel lblCelularTres = new JLabel("Celular");
		lblCelularTres.setBounds(38, 334, 46, 14);
		panel.add(lblCelularTres);
		
		JLabel lblTelefoneUm = new JLabel("Telefone");
		lblTelefoneUm.setBounds(208, 284, 46, 14);
		panel.add(lblTelefoneUm);
		
		JLabel lblTelefoneDois = new JLabel("Telefone");
		lblTelefoneDois.setBounds(208, 309, 46, 14);
		panel.add(lblTelefoneDois);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(208, 334, 46, 14);
		panel.add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setBounds(79, 110, 295, 20);
		txtNome.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(73, 138, 128, 20);
		txtCpf.setColumns(10);
		panel.add(txtCpf);
		
		txtRg = new JTextField();
		txtRg.setBounds(239, 135, 135, 20);
		panel.add(txtRg);
		txtRg.setColumns(10);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setBounds(154, 166, 220, 20);
		panel.add(txtDataNascimento);
		txtDataNascimento.setColumns(10);
		
		JButton btnCadastrar = new JButton("");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.setNomeCliente(txtNome.getText());
				modelo.setCpfCliente(txtCpf.getText());
				modelo.setRgCliente(txtRg.getText());
				modelo.setDataNascimentoCliente(txtDataNascimento.getText());
				model.setCidadeCliente(txtCidade.getText());
				model.setBairroCliente(txtBairro.getText());
				model.setRuaCliente(txtRua.getText());
				model.setNumeroCliente(Integer.parseInt(txtNumero.getText()));
				model.setCepCliente(Integer.parseInt(txtCep.getText()));
             	model.setComplementoCliente(txtComplemento.getText());
             	mode.setCelularUmCliente(Integer.parseInt(txtCelularUm.getText()));
             	mode.setCelularDoisCliente(Integer.parseInt(txtCelularDois.getText()));
             	mode.setCelularTresCliente(Integer.parseInt(txtCelularTres.getText()));
             	mode.setTelefoneUmCliente(Integer.parseInt(txtTelefoneUm.getText()));
             	mode.setTelefoneDoisCliente(Integer.parseInt(txtTelefoneDois.getText()));
             	mode.setEmailCliente(txtEmail.getText());
             	controle.cadastrarCliente(modelo);
             	control.cadastrarCliente(model);
             	contro.cadastrarCliente(mode);
			}
		});
		btnCadastrar.setIcon(new ImageIcon(FormCliente.class.getResource("/imagens/btnCheck.png")));
		btnCadastrar.setBounds(639, 309, 131, 39);
		panel.add(btnCadastrar);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(434, 110, 155, 20);
		panel.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtRua = new JTextField();
		txtRua.setBounds(423, 136, 183, 20);
		panel.add(txtRua);
		txtRua.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(423, 161, 106, 20);
		panel.add(txtCep);
		txtCep.setColumns(10);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(613, 161, 142, 20);
		panel.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(639, 110, 116, 20);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(669, 135, 86, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtCelularUm = new JTextField();
		txtCelularUm.setBounds(86, 281, 106, 20);
		panel.add(txtCelularUm);
		txtCelularUm.setColumns(10);
		
		txtCelularDois = new JTextField();
		txtCelularDois.setBounds(86, 306, 106, 20);
		txtCelularDois.setColumns(10);
		panel.add(txtCelularDois);
		
		txtCelularTres = new JTextField();
		txtCelularTres.setBounds(86, 334, 106, 20);
		txtCelularTres.setColumns(10);
		panel.add(txtCelularTres);
		
		txtTelefoneUm = new JTextField();
		txtTelefoneUm.setBounds(268, 281, 106, 20);
		panel.add(txtTelefoneUm);
		txtTelefoneUm.setColumns(10);
		
		txtTelefoneDois = new JTextField();
		txtTelefoneDois.setBounds(268, 306, 106, 20);
		txtTelefoneDois.setColumns(10);
		panel.add(txtTelefoneDois);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(258, 331, 116, 20);
		txtEmail.setColumns(10);
		panel.add(txtEmail);
		
		JButton btnSairCadastro = new JButton("");
		btnSairCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSairCadastro.setBounds(737, 11, 33, 23);
		panel.add(btnSairCadastro);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(38, 194, 46, 14);
		panel.add(lblSexo);
		
		JLabel lblCadastroDeClientes = new JLabel("CADASTRO DE CLIENTES");
		lblCadastroDeClientes.setBounds(265, 0, 223, 32);
		contentPane.add(lblCadastroDeClientes);
		lblCadastroDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		setUndecorated(true);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane}));
	}
}
