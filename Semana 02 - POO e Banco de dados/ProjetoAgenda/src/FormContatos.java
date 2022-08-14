import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormContatos extends JFrame{
	private JPanel contentPane;
	private JTextField nome_contato;
	private JLabel lblNewLabel;
	private JButton Adicionar;
	private JButton btnSair;
	private JTextField id_contato;
	private JButton imprime_lista;
	private JTextField impressao;
	private JLabel areaImpressao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormContatos frame = new FormContatos();
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
	public FormContatos() {
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.conectar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id_contato = new JTextField();
		id_contato.setColumns(40);
		id_contato.setBounds(10, 36, 154, 20);
		contentPane.add(id_contato);
		
		nome_contato = new JTextField();
		nome_contato.setBounds(10, 90, 154, 20);
		contentPane.add(nome_contato);
		nome_contato.setColumns(40);
		
		lblNewLabel = new JLabel("Nome do contato");
		lblNewLabel.setBounds(10, 65, 133, 14);
		contentPane.add(lblNewLabel);
		
		Adicionar = new JButton("Adicionar");
		Adicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sintaxeBanco.inserirContatos(nome_contato.getText());
			}
		});
		
		JButton atualizar_contato = new JButton("Atualizar");
		atualizar_contato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sintaxeBanco.updateContato(id_contato.getText(),nome_contato.getText());
			}
		});
		
		atualizar_contato.setBounds(403, 35, 89, 23);
		contentPane.add(atualizar_contato);
		
		JButton delete_contato = new JButton("Deletar");
		delete_contato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sintaxeBanco.deleteContato(id_contato.getText());
			}
		});
		
		delete_contato.setBounds(292, 69, 89, 23);
		contentPane.add(delete_contato);
		
		imprime_lista = new JButton("Imprimir");
		imprime_lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sintaxeBanco.listaContatos();
				
			}
		});
		
		imprime_lista.setBounds(403, 69, 89, 23);
		contentPane.add(imprime_lista);
		
		
		Adicionar.setBounds(292, 35, 89, 23);
		contentPane.add(Adicionar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnSair.setBounds(522, 46, 89, 23);
		contentPane.add(btnSair);
		
		JLabel textFieldid = new JLabel("Id do contato");
		textFieldid.setBounds(10, 11, 109, 14);
		contentPane.add(textFieldid);
		
		areaImpressao = new JLabel();
		areaImpressao.setBackground(Color.WHITE);
		areaImpressao.setBounds(32, 134, 579, 209);
		contentPane.add(areaImpressao);
		
		
	
	}
}
