import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class VentanaCalculadora extends JFrame implements ActionListener{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	JLabel txtTrRay, txtStand, txtCloock;
	JTextField boxRes;
	JButton btnMC, btnMR, btnMM, btnMm, btnMS, btnM,
			btnPorc, btnRaiz, btnCuad, btnUnoSx;
	
	public VentanaCalculadora() {
		
		//------------------------------Implementacion de ventana----------------------------------------
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		//------------------------------------------------------------------------------------------------
		
		//------------------------------Inicio de codigo----------------------------------------
		
		//Fila 0 ----------------------------------------
		
		txtTrRay = new JLabel("░░");
		bgcGrid(txtTrRay, 0, 0, 1, 1);
		
		txtStand = new JLabel("Estandar");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		bgcGrid(txtStand, 1, 0, 2, 1);
		
		txtCloock = new JLabel("└─");
		bgcGrid(txtCloock, 3, 0, 1, 1);
		
		//-----------------------------------------------
		//Fila 1 ----------------------------------------
		
		boxRes = new JTextField("0");
		bgcGrid(boxRes, 0, 1, 6, 1);
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		
		//-----------------------------------------------
		
		//Fila 2 ----------------------------------------
		
		btnMC = new JButton("MC");
		bgcGrid(btnMC, 0, 2, 1, 1);
		
		btnMR = new JButton("MR");
		bgcGrid(btnMR, 1, 2, 1, 1);
		
		btnMM = new JButton("M+");
		bgcGrid(btnMM, 2, 2, 1, 1);
		
		btnMm = new JButton("M-");
		bgcGrid(btnMm, 3, 2, 1, 1);
		
		btnMS = new JButton("MS");
		bgcGrid(btnMS, 4, 2, 1, 1);
		
		btnM = new JButton("M°");
		bgcGrid(btnM, 5, 2, 1, 1);
		
		//-----------------------------------------------
		
		//Fila 3 ----------------------------------------
		
		btnPorc = new JButton("%");
		bgcGrid(btnPorc, 0, 3, 1, 1);
		
		btnRaiz = new JButton("┬─");
		bgcGrid(btnRaiz, 1, 3, 1, 1);
		
		btnCuad = new JButton("x²");
		bgcGrid(btnCuad, 2, 3, 1, 1);
		
		btnUnoSx = new JButton("¹/×");
		bgcGrid(btnUnoSx, 3, 3, 1, 1);
		
		//-----------------------------------------------
		
		
		//--------------------------------------------------------------------------------------
		
		//-----------------------------------------Complemento de ventana---------------------------------
		pack();
		setLocationRelativeTo(null);		
		//------------------------------------------------------------------------------------------------
		
	}	
	
	//_______________________________________Controlador de dimensiones_____________________________________________
	
	public void bgcGrid (JComponent c, int x, int y, int w, int h) {
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	//______________________________________________________________________________________________________________
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaCalculadora();
			}
		});
	}

}
