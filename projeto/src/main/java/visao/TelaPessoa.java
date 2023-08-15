package visao;

import javax.swing.JFrame;
import javax.swing.JTextField;

import controle.PessoaDAO;
import modelo.Pessoa;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaPessoa extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public TelaPessoa() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 11, 86, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(333, 11, 86, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(143, 14, 45, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(293, 14, 45, 14);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(25, 14, 25, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setBounds(25, 43, 89, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String nome = textField_1.getText();
				String email = textField_2.getText();
				
				Pessoa p = new Pessoa();
				p.setId(Integer.valueOf(id));
				p.setNome(nome);
				p.setEmail(email);
				
				PessoaDAO dao = new PessoaDAO();
				dao.inserir(p);
			}
		});
	}
	
	public static void main(String[] args) {
		TelaPessoa tela = new TelaPessoa();
		tela.show();
	}
}
