package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField campo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> opcao = new JComboBox<>();
		opcao.setBounds(76, 27, 91, 22);
		String[] vetlol = { "Leona", "Miss Fortune", "Jhin", "Riven", "Lucian" };
		for (int i = 0; i < vetlol.length; i++) {
			opcao.addItem(vetlol[i]);
		}
		opcao.addItem("Leona");
		opcao.addItem("Miss Fortune");
		opcao.addItem("Jhin");
		opcao.addItem("Riven");
		opcao.addItem("Lucian");
		contentPane.add(opcao);

		campo = new JTextField();
		campo.setBounds(21, 61, 304, 117);
		contentPane.add(campo);
		campo.setColumns(10);

		JLabel lblNewLabel = new JLabel("Opções");
		lblNewLabel.setBounds(32, 31, 46, 14);
		contentPane.add(lblNewLabel);

		JButton botao = new JButton("ADICIONAR");
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valorSelect = (String) opcao.getSelectedItem();
				campo.setText(campo.getText() + valorSelect + ", ");
			}
		});

		botao.setBounds(206, 27, 100, 23);
		contentPane.add(botao);
	}
}
