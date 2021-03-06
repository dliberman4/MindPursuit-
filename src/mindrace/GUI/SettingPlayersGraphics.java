package mindrace.GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import mindrace.model.Category;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

/**
 * This class creates a playerGraphics with an image and a name.
 * The class saves the names and the images of the other players so that to players
 * can't have the same name or image.
 * After the player is done choosing the class calls the view with the respective method. 
 * Note: After pressing the button the class will close.
 * @author Agustin Lavarello
 *
 */
public class SettingPlayersGraphics {

	private JFrame frame;
	private ImageIcon img;
	private JTextField nombreDelJugador;
	private View view;
	private boolean isColorChosen;
	private JButton btnColorChosen;
	private JLabel lblChosenColor;
	private static Set<String> names = new HashSet<String>();
	private static Set<String> colors = new HashSet<String>();
	
/*
 * this is the cunstructor
 */
	public SettingPlayersGraphics(View view) {
		this.view = view;
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Timer closingTimer = new Timer();
		TimerTask closingTask = new TimerTask() {

			@Override
			public void run() {
				frame.dispose();
				
			}
			
		};
		
		nombreDelJugador = new JTextField();
		nombreDelJugador.setBounds(159, 27, 214, 31);
		frame.getContentPane().add(nombreDelJugador);
		nombreDelJugador.setColumns(10);
		
		lblChosenColor = new JLabel("");
		lblChosenColor.setOpaque(true);
		lblChosenColor.setBounds(383, 27, 51, 31);
		frame.getContentPane().add(lblChosenColor);
		
		JLabel lblNombreDelJugador = new JLabel("Nombre del Jugador");
		lblNombreDelJugador.setBounds(22, 21, 154, 42);
		frame.getContentPane().add(lblNombreDelJugador);
		
		JButton green = new JButton();
		green.setText("Verde");
		green.setForeground(new Color(102, 204, 102));
		green.setOpaque(true);
		green.setBorderPainted(false);
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("pieceGreen.png");
				isColorChosen = true;
				btnColorChosen = green;
				lblChosenColor.setBackground(new Color(102, 204, 102));
			}
		});
		green.setBounds(22, 113, 89, 23);
		green.setBackground(new Color(102, 204, 102));
		frame.getContentPane().add(green);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(22, 88, 46, 14);
		frame.getContentPane().add(lblColor);
		
		JButton black = new JButton();
		black.setText("Negro");
		black.setForeground(new Color(0, 0, 0));
		black.setOpaque(true);
		black.setBorderPainted(false);
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("pieceBlack.png");
				isColorChosen = true;
				btnColorChosen = black;
				lblChosenColor.setBackground(new Color(0, 0, 0));
			}
		});
		black.setBackground(new Color(0, 0, 0));
		black.setBounds(169, 113, 89, 23);
		frame.getContentPane().add(black);
		
		JButton blue = new JButton();
		blue.setText("Azul");
		blue.setForeground(new Color(0, 0, 204));
		blue.setOpaque(true);
		blue.setBorderPainted(false);
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("pieceBlue.png");
				isColorChosen = true;
				btnColorChosen = blue;
				lblChosenColor.setBackground(new Color(0, 0, 204));
			}
		});
		blue.setBackground(new Color(0, 0, 204));
		blue.setBounds(313, 113, 89, 23);
		frame.getContentPane().add(blue);
		
		JButton purple = new JButton();
		purple.setText("Violeta");
		purple.setForeground(new Color(102, 0, 102));
		purple.setOpaque(true);
		purple.setBorderPainted(false);
		purple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("piecePurple.png");
				isColorChosen = true;
				btnColorChosen = purple;
				lblChosenColor.setBackground(new Color(102, 0, 102));
			}
		});
		purple.setBackground(new Color(102, 0, 102));
		purple.setBounds(22, 187, 89, 23);
		frame.getContentPane().add(purple);
		
		JButton red = new JButton();
		red.setText("Rojo");
		red.setForeground(new Color(255, 0, 0));
		red.setOpaque(true);
		red.setBorderPainted(false);
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("pieceRed.png");
				isColorChosen = true;
				btnColorChosen = red;
				lblChosenColor.setBackground(new Color(255, 0, 0));
			}
		});
		red.setBackground(new Color(255, 0, 0));
		red.setBounds(169, 187, 89, 23);
		frame.getContentPane().add(red);
		
		JButton yellow = new JButton();
		yellow.setText("Amarillo");
		yellow.setForeground(new Color(255, 255, 0));
		yellow.setOpaque(true);
		yellow.setBorderPainted(false);
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				img = new ImageIcon("pieceYellow.png");
				isColorChosen = true;
				btnColorChosen = yellow;
				lblChosenColor.setBackground(new Color(255, 255, 0));
				
			}
		});
		yellow.setBackground(new Color(255, 255, 0));
		yellow.setBounds(313, 187, 89, 23);
		frame.getContentPane().add(yellow);
		
		JButton btnAcceptar = new JButton("Aceptar");
		btnAcceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isColorChosen && !names.contains(nombreDelJugador.getText()) && !colors.contains(btnColorChosen.getText())){	
				names.add(nombreDelJugador.getText());
				colors.add(btnColorChosen.getText());
				view.addPlayersGraphics(creatPlayersGraphics());
				try {
					view.enteringNames();
				} catch (IOException | ParserConfigurationException | SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				closingTimer.schedule(closingTask, 1000);
				} else {
					JOptionPane.showMessageDialog(frame, "Nombre/Color inv�lido!");
				}
			}	
		});
		btnAcceptar.setBounds(345, 239, 89, 23);
		frame.getContentPane().add(btnAcceptar);
		
		
	}

	/**
	 * This method creates a new playerGraphics
	 * @return PlayerGraphics
	 */
	public PlayerGraphics creatPlayersGraphics() {
		return new PlayerGraphics(img, nombreDelJugador.getText());
	}
}
