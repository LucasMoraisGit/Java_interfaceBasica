package Interface;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Informa_dados extends JFrame implements ActionListener {
	Dados_contribuinte ClienteA = new Dados_contribuinte();

	JLabel L1, L2, L3, L4, L5;
	JButton B1;
	JTextField T1, T2, T3, T4;
	JCheckBox C1, C2;

	boolean j1, j2;
	String a, b, c, d;

	public static void main(String[] args) {

		JFrame janela = new Informa_dados();
		janela.show();
		WindowListener x = new WindowAdapter() {
			public void windowClosing(WindowEvent fecha) {
				System.exit(0);
			}
		};
		janela.addWindowListener(x);
	}

	Informa_dados() {
		setTitle("PROTÓTIPO DE PROGRAMAÇÃO ORIENTADA A OBJETOS");
		setSize(800, 400);

		getContentPane().setBackground(new Color(0, 0, 0));
		getContentPane().setLayout(new GridLayout(6, 2));

		L1 = new JLabel("Identificação");
		L1.setForeground(Color.white);
		L1.setFont(new Font("", Font.BOLD, 16));

		L2 = new JLabel("CPF");
		L2.setForeground(Color.white);
		L2.setFont(new Font("", Font.BOLD, 16));

		L3 = new JLabel("CNPJ");
		L3.setForeground(Color.white);
		L3.setFont(new Font("", Font.BOLD, 16));

		L4 = new JLabel("CARTÃO");
		L4.setForeground(Color.white);
		L4.setFont(new Font("", Font.BOLD, 16));

		L5 = new JLabel("");

		T1 = new JTextField();
		T1.setBackground(Color.white);
		T1.setForeground(Color.black);

		T2 = new JTextField();
		T2.setBackground(Color.white);
		T2.setForeground(Color.black);

		T3 = new JTextField();
		T3.setBackground(Color.white);
		T3.setForeground(Color.black);

		T4 = new JTextField();
		T4.setBackground(Color.white);
		T4.setForeground(Color.black);

		C1 = new JCheckBox("Pessoa Fisica");
		C2 = new JCheckBox("Pessoa Juridica");
		B1 = new JButton("Enviar (Leitura de dados)");
		B1.setForeground(Color.white);
		B1.setBackground(Color.black);
		B1.addActionListener(this);

		getContentPane().add(T1);
		getContentPane().add(L1);
		getContentPane().add(T2);
		getContentPane().add(L2);
		getContentPane().add(T3);
		getContentPane().add(L3);
		getContentPane().add(T4);
		getContentPane().add(L4);
		getContentPane().add(C1);
		getContentPane().add(C2);
		getContentPane().add(B1);
		getContentPane().add(L5);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == B1) {
			a = T1.getText();
			b = T2.getText();
			c = T3.getText();
			d = T4.getText();
			j1 = C1.isSelected();
			j2 = C2.isSelected();

			informa_dados();
		}
	}

	public void informa_dados() {
		ClienteA.setNome(a);
		ClienteA.setCpf(b);
		ClienteA.setCnpj(c);
		ClienteA.setCartao(d);
		System.out.println("Identificacao do Cliente: " + ClienteA.getNome());
		System.out.println("Cartao do Cliente: " + ClienteA.getCartao());

		if (j1 == true) {
			System.out.println("CPF do Cliente: " + ClienteA.getCpf());
		} else {
			System.out.println("CNPJ do Cliente: " + ClienteA.getCnpj());
		}
	}
}
