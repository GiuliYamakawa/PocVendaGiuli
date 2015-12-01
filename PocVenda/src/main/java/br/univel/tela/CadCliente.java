package br.univel.tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.univel.dao.ClienteDAO;
import br.univel.enums.Estados;
import br.univel.enums.Genero;
import br.univel.model.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadCliente extends JFrame {

	private static final long serialVersionUID = -413658732955104121L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtEmail;
	private JPanel panel;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnMasculino;
	private JComboBox<String> cbEstado;
	private JPanel panel_1;
	private JButton btnSalvar;
	private JButton btnDeletar;
	private JScrollPane scrollPane;
	private JTable table;
	private ClienteDAO dao = new ClienteDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCliente frame = new CadCliente();
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
	public CadCliente() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setAlwaysOnTop(true);
		setBounds(100, 100, 543, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 165, 202, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblId = new JLabel("ID");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.WEST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		contentPane.add(lblId, gbc_lblId);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.gridwidth = 2;
		gbc_txtID.insets = new Insets(0, 0, 5, 0);
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 1;
		gbc_txtID.gridy = 0;
		contentPane.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		contentPane.add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 2;
		gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		contentPane.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.WEST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 2;
		contentPane.add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.gridwidth = 2;
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 2;
		contentPane.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblEn = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblEn = new GridBagConstraints();
		gbc_lblEn.anchor = GridBagConstraints.WEST;
		gbc_lblEn.insets = new Insets(0, 0, 5, 5);
		gbc_lblEn.gridx = 0;
		gbc_lblEn.gridy = 3;
		contentPane.add(lblEn, gbc_lblEn);
		
		txtEndereco = new JTextField();
		GridBagConstraints gbc_txtEndereco = new GridBagConstraints();
		gbc_txtEndereco.gridwidth = 2;
		gbc_txtEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_txtEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEndereco.gridx = 1;
		gbc_txtEndereco.gridy = 3;
		contentPane.add(txtEndereco, gbc_txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.WEST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		contentPane.add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.gridwidth = 2;
		gbc_txtCidade.insets = new Insets(0, 0, 5, 0);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 4;
		contentPane.add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.WEST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 0;
		gbc_lblEstado.gridy = 5;
		contentPane.add(lblEstado, gbc_lblEstado);
		
		cbEstado = new JComboBox<String>();
		GridBagConstraints gbc_cbEstado = new GridBagConstraints();
		gbc_cbEstado.gridwidth = 2;
		gbc_cbEstado.insets = new Insets(0, 0, 5, 0);
		gbc_cbEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbEstado.gridx = 1;
		gbc_cbEstado.gridy = 5;
		
		String[] estados = Estados.names();
		for(int i=0; i<estados.length; i++){
			cbEstado.addItem(estados[i]);
		}
		contentPane.add(cbEstado, gbc_cbEstado);
		
		JLabel lblEnail = new JLabel("E-mail");
		GridBagConstraints gbc_lblEnail = new GridBagConstraints();
		gbc_lblEnail.anchor = GridBagConstraints.WEST;
		gbc_lblEnail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnail.gridx = 0;
		gbc_lblEnail.gridy = 6;
		contentPane.add(lblEnail, gbc_lblEnail);
		
		txtEmail = new JTextField();
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 6;
		contentPane.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		GridBagConstraints gbc_lblGnero = new GridBagConstraints();
		gbc_lblGnero.anchor = GridBagConstraints.WEST;
		gbc_lblGnero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGnero.gridx = 0;
		gbc_lblGnero.gridy = 7;
		contentPane.add(lblGnero, gbc_lblGnero);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 7;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		rdbtnFeminino = new JRadioButton("Feminino");
		panel.add(rdbtnFeminino);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		panel.add(rdbtnMasculino);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.anchor = GridBagConstraints.EAST;
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 7;
		contentPane.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente c = new Cliente();
				c.setNome(txtNome.getText());
				c.setCidade(txtCidade.getText());
				c.setEmail(txtEmail.getText());
				if(rdbtnFeminino.isSelected()){
					c.setGenero(Genero.FEMININO);
				} else {
					c.setGenero(Genero.MASCULINO);
				}
				c.setEstado(Estados.valueOf(cbEstado.getSelectedItem().toString()));
				c.setTelefone(txtTelefone.getText());
				dao.inserir(c);
			}
		});
		panel_1.add(btnSalvar);
		
		btnDeletar = new JButton("Deletar");
		panel_1.add(btnDeletar);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 8;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
