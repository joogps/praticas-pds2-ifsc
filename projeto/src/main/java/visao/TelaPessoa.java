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
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(152, 14, 45, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(25, 14, 25, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Inserir");
		btnNewButton.setBounds(308, 10, 89, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String nome = textField_1.getText();
				
				Pessoa p = new Pessoa();
				p.setIdPessoa(Integer.valueOf(id));
				p.setPrimeiroNome(nome);
				
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
