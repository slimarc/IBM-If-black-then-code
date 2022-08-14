
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class cadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campo_nome;
	private JTextField campo_email;
	private JFormattedTextField campo_cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroCliente frame = new cadastroCliente();
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
	public cadastroCliente() {
		
		Sistema executar = new Sistema();
		executar.conectar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome_cliente = new JLabel("Nome: ");
		nome_cliente.setBounds(10, 11, 46, 14);
		contentPane.add(nome_cliente);
		
		JLabel cpf_cliente = new JLabel("CPF:");
		cpf_cliente.setBounds(10, 70, 46, 14);
		contentPane.add(cpf_cliente);
		
		JLabel tel_cliente = new JLabel("Tel.:");
		tel_cliente.setBounds(10, 98, 46, 14);
		contentPane.add(tel_cliente);
		
		JLabel email_cliente = new JLabel("Email:");
		email_cliente.setBounds(10, 42, 46, 14);
		contentPane.add(email_cliente);
		
		campo_nome = new JTextField();
		campo_nome.setBounds(57, 8, 183, 20);
		contentPane.add(campo_nome);
		campo_nome.setColumns(10);
		
		campo_email = new JTextField();
		campo_email.setColumns(10);
		campo_email.setBounds(57, 39, 183, 20);
		contentPane.add(campo_email);
		
		campo_cpf = new JFormattedTextField();
		campo_cpf.setBounds(57, 67, 183, 20);
		contentPane.add(campo_cpf);
		
		JFormattedTextField campo_tel = new JFormattedTextField("## #####-####");
		campo_tel.setBounds(57, 95, 183, 20);
		contentPane.add(campo_tel);
	
				
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executar.inserirClientes(campo_nome.getText(),campo_cpf.getText(),campo_tel.getText(),campo_email.getText());
				if(campo_nome.getText().trim().equals("") || campo_cpf.getText().trim().equals("") || campo_tel.getText().trim().equals("") || campo_email.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(btnCadastro, "Preencha todos os campos obrigatórios!");
				}else {
					JOptionPane.showMessageDialog(btnCadastro, "Cliente cadastrado!");
				}
			}
		
		});
		
		btnCadastro.setBounds(91, 137, 118, 23);
		contentPane.add(btnCadastro);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(335, 227, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				executar.listaClientes();
			}
		});
		btnImprimir.setBounds(103, 181, 89, 23);
		contentPane.add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel("*");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(250, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(250, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(250, 70, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("*");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(250, 98, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
