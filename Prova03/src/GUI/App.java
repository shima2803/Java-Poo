package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		
		//JButton adicionar botao
		JButton botao = new JButton("Login");
		JLabel labelUsuario = new JLabel("Usuario");
		JLabel labelSenha = new JLabel("Senha");
		JTextField campoUsuario = new JTextField();
		JPasswordField senha = new JPasswordField();
		
		janela.add(labelSenha);
		janela.add(senha);
		janela.add(botao);
		janela.add(labelUsuario);
		janela.add(campoUsuario);
		
		janela.setLayout(null);
		
		labelUsuario.setBounds(175, 100, 300, 100);
		campoUsuario.setBounds(150, 170, 100, 30);
		labelSenha.setBounds(180, 200, 50, 50);
		senha.setBounds(150, 240, 100, 30);
		botao.setBounds(100,300, 200, 30);
		
		//Adicionar acao no botao 
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = campoUsuario.getText();
				String senhas = new String (senha.getPassword());
				System.out.printf("Usuario: %s\nSenha: %s", usuario, senhas);
				campoUsuario.setText("");
				senha.setText("");
			}
		});
				
		//tamanho da tela
		janela.setBounds(550,100,400,600);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
	
	}

}
