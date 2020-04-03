package com.payou;


	
	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Observable;
	import java.util.Observer;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JTextField;
	import javax.swing.JRadioButton;
	import javax.swing.ButtonGroup;
	import javax.swing.JLabel;
	import javax.swing.JButton;
	public class Vue extends JFrame implements ActionListener, Observer {
		private JPanel contentPane;
		private JTextField txtNom;
		private JTextField txtPre;
		private JRadioButton rdBtF;
		private JRadioButton rdBtH;
		private JButton btn;
		private JLabel lblAttente;
		private Controller controleur;
		private Model modele;
		private final ButtonGroup btGrp = new ButtonGroup();
		/**
		 * Launch the application.
		 */
		/*public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Vue frame = new Vue();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}*/
		/**
		 * Create the frame.
		 */
		public Vue(Controller controleur, Model modele) {
			this.controleur = controleur;
			this.modele = modele;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
			setContentPane(contentPane);
			rdBtF = new JRadioButton("F");
			rdBtH = new JRadioButton("H");
			btn = new JButton("Valider");
			lblAttente = new JLabel("En attente...");
			JPanel panel = new JPanel();
			contentPane.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			txtNom = new JTextField();
			txtNom.setBounds(251, 47, 96, 19);
			panel.add(txtNom);
			txtNom.setColumns(10);
			txtPre = new JTextField();
			txtPre.setBounds(251, 82, 96, 19);
			panel.add(txtPre);
			txtPre.setColumns(10);
			btGrp.add(rdBtH);
			rdBtH.setBounds(251, 130, 103, 21);
			panel.add(rdBtH);
			btGrp.add(rdBtF);
			rdBtF.setBounds(251, 153, 103, 21);
			panel.add(rdBtF);
			JLabel lblNom = new JLabel("Nom");
			lblNom.setBounds(174, 50, 45, 13);
			panel.add(lblNom);
			JLabel lblPrenom = new JLabel("Prenom");
			lblPrenom.setBounds(174, 85, 45, 13);
			panel.add(lblPrenom);
			lblAttente.setBounds(95, 138, 45, 13);
			panel.add(lblAttente);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn.setBounds(209, 197, 85, 21);
			panel.add(btn);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if ((e.getSource()) == btn) {
				String sexe;
				if (rdBtH.isSelected()) {
					sexe = "H";
				} else {
					sexe = "F";
				}
				controleur.setJoueur(txtNom.getText(), txtPre.getText(), sexe);
			}
		}
		@Override
		public void update(Observable o, Object arg) {
			// TODO Auto-generated method stub
			if(modele.isJoueurajouter()) {
				lblAttente.setText("Joueur ajouté");
			}
		}
		public JButton getBtn() {
			return btn;
		}
	}