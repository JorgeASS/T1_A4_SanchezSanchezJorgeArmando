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
			btnPorc, btnRaiz, btnCuad, btnUnoSx,
			btnCE, btnC, btnDel, btnDiv,
			btn7, btn8, btn9, btnX,
			btn4, btn5, btn6, btnRes,
			btn1, btn2, btn3, btnSum,
			btnmm, btn0, btnP, btnIgual;
	
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
		gbc.fill = GridBagConstraints.HORIZONTAL;
		bgcGrid(boxRes, 0, 1, 6, 1);
		
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
		//Fila 4 ----------------------------------------
		
		btnCE = new JButton("CE");
		bgcGrid(btnCE, 0, 4, 1, 1);
		
		btnC = new JButton("C");
		bgcGrid(btnC, 1, 4, 1, 1);
		
		btnDel = new JButton("Del");
		bgcGrid(btnDel, 2, 4, 1, 1);
		
		btnDiv = new JButton("÷");
		bgcGrid(btnDiv, 3, 4, 1, 1);
		
		//-----------------------------------------------
		//Fila 5 ----------------------------------------
		
		btn7 = new JButton("7");
		bgcGrid(btnPorc, 0, 5, 1, 1);
		
		btn8 = new JButton("8");
		bgcGrid(btnRaiz, 1, 5, 1, 1);
		
		btn9 = new JButton("9");
		bgcGrid(btnCuad, 2, 5, 1, 1);
		
		btnX = new JButton("X");
		bgcGrid(btnUnoSx, 3, 5, 1, 1);
		
		//-----------------------------------------------
		//Fila 6 ----------------------------------------
		
		btn4 = new JButton("4");
		bgcGrid(btn4, 0, 6, 1, 1);
		
		btn5 = new JButton("5");
		bgcGrid(btn5, 1, 6, 1, 1);
		
		btn6 = new JButton("6");
		bgcGrid(btn6, 2, 6, 1, 1);
		
		btnRes = new JButton("-");
		bgcGrid(btnRes, 3, 6, 1, 1);
		
		//-----------------------------------------------
		//Fila 7 ----------------------------------------
		
		btn1 = new JButton("1");
		bgcGrid(btn1, 0, 7, 1, 1);
		
		btn2 = new JButton("2");
		bgcGrid(btn2, 1, 7, 1, 1);
		
		btn3 = new JButton("3");
		bgcGrid(btn3, 2, 7, 1, 1);
		
		btnSum = new JButton("+");
		bgcGrid(btnSum, 3, 7, 1, 1);
		
		//-----------------------------------------------
		//Fila 8 ----------------------------------------
		
		btnmm = new JButton("±");
		bgcGrid(btnPorc, 0, 8, 1, 1);
		
		btn0 = new JButton("0");
		bgcGrid(btnRaiz, 1, 8, 1, 1);
		
		btnP = new JButton(".");
		bgcGrid(btnCuad, 2, 8, 1, 1);
		
		btnIgual = new JButton("=");
		bgcGrid(btnUnoSx, 3, 8, 1, 1);
		
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
