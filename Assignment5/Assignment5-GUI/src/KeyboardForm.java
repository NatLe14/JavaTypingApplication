/**
* KeyboardForm Class File
* 
* This class will create a virtual keyboard GUI for touch type application
* Override methods to run key events so the virtual keyboard keys will be highlighted when pressed
* To give user visualization on screen what they are typing on the keyboard
*
* @author Nathan Le
* @version 1.0
* @since 2019-10-12
*/

import java.awt.Color;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class KeyboardForm extends JFrame implements KeyListener {
	
	// Two labels that display information on top part of panel
	JLabel label;
	JLabel label2;
	
	
	
	//26 letter keys
	JButton buttonA; JButton buttonB; JButton buttonC; JButton buttonD; JButton buttonE; JButton buttonF;
	JButton buttonG; JButton buttonH; JButton buttonI; JButton buttonJ; JButton buttonK; JButton buttonL;
	JButton buttonM; JButton buttonN; JButton buttonO; JButton buttonP; JButton buttonQ; JButton buttonR;
	JButton buttonS; JButton buttonT; JButton buttonU; JButton buttonV; JButton buttonW; JButton buttonX;
	JButton buttonY; JButton buttonZ; 
	
	// 14 buttons (top row; numbers and symbols)
	JButton button1; JButton button2; JButton button3; JButton button4; JButton button5; JButton button6;
	JButton button7; JButton button8; JButton button9; JButton button0; JButton buttonTilde; JButton buttonMinus; JButton buttonPlus; JButton buttonBackSpc;

	// 17 buttons ( more special and symbol keys)
	JButton buttonTab; JButton buttonShift; JButton buttonCaps; JButton buttonLeftBracket; JButton buttonRightBracket; JButton buttonBackSlash;
	JButton buttonSemicolon; JButton buttonQuotation; JButton buttonEnter; JButton buttonComma; JButton buttonPeriod; JButton buttonForwardSlash;
	JButton buttonSpace; JButton buttonUp; JButton buttonDown; JButton buttonLeft; JButton buttonRight; JButton buttonQuestion;

	// Create the panel for the GUI
	JPanel panel;
	// Create text area that displays what the user types
	JTextArea textArea;
	
	// Color of keys before highlight
	Color cc = new JButton().getBackground();
	// Border 
	Border border = BorderFactory.createLineBorder(Color.BLACK);
	// To get key code of keyboard
	int keycode;
	
	/**
	 * Constructor, create the virtual keyboard GUI, JFrame
	 * 
	 * @param none
	 * 
	 * @return none
	 */
	KeyboardForm()
	{
		super("Typing Application");
		this.setSize(910,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel
		panel = new JPanel();
		panel.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10,10,10,10)));
		panel.setLayout(null);
		
		// JLabels
		label = new JLabel();
		label.setText("Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.");
		label.setBounds(40,40,800,20);
		panel.add(label);
		label2 = new JLabel();
		label2.setText("Note: Clicking the buttons with your mouse will not perform any action.");
		label2.setBounds(40,60,500,20);
		panel.add(label2);
		
		// JTextArea
		textArea = new JTextArea(5,10); 
		textArea.setBounds(40,80,800,200);
		textArea.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10,10,10,10)));
		textArea.addKeyListener(this);
		panel.add(textArea);
		
		textArea.requestFocusInWindow();
		
		// Background color of panel
		panel.setBackground(new Color(212,212,212));
		
		//JButtons to represent virtual keyboard on panel
		//First Row of keyboard created
		buttonTilde = new JButton("~");
		buttonTilde.setBounds(40,300,50,50);
		panel.add(buttonTilde);
		
		button1 = new JButton("1");
		button1.setBounds(95,300,50,50);;
		panel.add(button1);
		
		button2 = new JButton("2");
		button2.setBounds(150,300,50,50);
		panel.add(button2);
		
		button3 = new JButton("3");
		button3.setBounds(205,300,50,50);
		panel.add(button3);
		
		button4 = new JButton("4");
		button4.setBounds(260,300,50,50);
		panel.add(button4);
		
		button5 = new JButton("5");
		button5.setBounds(315,300,50,50);
		panel.add(button5);
		
		button6 = new JButton("6");
		button6.setBounds(370,300,50,50);
		panel.add(button6);
		
		button7 = new JButton("7");
		button7.setBounds(425,300,50,50);
		panel.add(button7);
		
		button8 = new JButton("8");
		button8.setBounds(480,300,50,50);
		panel.add(button8);
		
		button9 = new JButton("9");
		button9.setBounds(535,300,50,50);
		panel.add(button9);
		
		button0 = new JButton("0");
		button0.setBounds(590,300,50,50);
		panel.add(button0);
		
		buttonMinus = new JButton("-");
		buttonMinus.setBounds(645,300,50,50);
		panel.add(buttonMinus);
		
		buttonPlus = new JButton("+");
		buttonPlus.setBounds(700,300,50,50);
		panel.add(buttonPlus);
		
		buttonBackSpc = new JButton("Backspace");
		buttonBackSpc.setBounds(755,300,105,50);
		panel.add(buttonBackSpc);
		
		
		//Second Row of keyboard created
		buttonTab = new JButton("Tab");
		buttonTab.setBounds(40,355,80,50);
		panel.add(buttonTab);
		
		buttonQ = new JButton("Q");
		buttonQ.setBounds(125,355,50,50);
		panel.add(buttonQ);
		
		buttonW = new JButton("W");
		buttonW.setBounds(180,355,50,50);
		panel.add(buttonW);
		
		buttonE = new JButton("E");
		buttonE.setBounds(235,355,50,50);
		panel.add(buttonE);
		
		buttonR = new JButton("R");
		buttonR.setBounds(290,355,50,50);
		panel.add(buttonR);
		
		buttonT = new JButton("T");
		buttonT.setBounds(345,355,50,50);
		panel.add(buttonT);
		
		buttonY = new JButton("Y");
		buttonY.setBounds(400,355,50,50);
		panel.add(buttonY);
		
		buttonU = new JButton("U");
		buttonU.setBounds(455,355,50,50);
		panel.add(buttonU);
		
		buttonI = new JButton("I");
		buttonI.setBounds(510,355,50,50);
		panel.add(buttonI);
		
		buttonO = new JButton("O");
		buttonO.setBounds(565,355,50,50);
		panel.add(buttonO);
		
		buttonP = new JButton("P");
		buttonP.setBounds(620,355,50,50);
		panel.add(buttonP);
		
		buttonLeftBracket = new JButton("[");
		buttonLeftBracket.setBounds(675,355,50,50);
		panel.add(buttonLeftBracket);
		
		buttonRightBracket = new JButton("]");
		buttonRightBracket.setBounds(730,355,50,50);;
		panel.add(buttonRightBracket);
		
		buttonBackSlash = new JButton("\\");
		buttonBackSlash.setBounds(785,355,50,50);
		panel.add(buttonBackSlash);
		
		
		//Third row of keyboard created
		buttonCaps = new JButton("Caps");
		buttonCaps.setBounds(40,410,80,50);
		panel.add(buttonCaps);
		
		buttonA = new JButton("A");
		buttonA.setBounds(125,410,50,50);
		panel.add(buttonA);
		
		buttonS = new JButton("S");
		buttonS.setBounds(180,410,50,50);
		panel.add(buttonS);
		
		buttonD = new JButton("D");
		buttonD.setBounds(235,410,50,50);
		panel.add(buttonD);
		
		buttonF = new JButton("F");
		buttonF.setBounds(290,410,50,50);
		panel.add(buttonF);
		
		buttonG = new JButton("G");
		buttonG.setBounds(345,410,50,50);
		panel.add(buttonG);
		
		buttonH = new JButton("H");
		buttonH.setBounds(400,410,50,50);
		panel.add(buttonH);
		
		buttonJ = new JButton("J");
		buttonJ.setBounds(455,410,50,50);
		panel.add(buttonJ);
		
		buttonK = new JButton("K");
		buttonK.setBounds(510,410,50,50);
		panel.add(buttonK);
		
		buttonL = new JButton("L");
		buttonL.setBounds(565,410,50,50);
		panel.add(buttonL);
		
		buttonSemicolon = new JButton(";");
		buttonSemicolon.setBounds(620,410,50,50);
		panel.add(buttonSemicolon);
		
		buttonQuotation = new JButton("\"");
		buttonQuotation.setBounds(675,410,50,50);
		panel.add(buttonQuotation);
		
		buttonEnter = new JButton("Enter");
		buttonEnter.setBounds(730,410,105,50);
		panel.add(buttonEnter);
		
		
		//Fourth Row of keyboard created
		buttonShift = new JButton("Shift");
		buttonShift.setBounds(40,465,105,50);
		panel.add(buttonShift);
		
		buttonZ = new JButton("Z");
		buttonZ.setBounds(150,465,50,50);
		panel.add(buttonZ);
		
		buttonX = new JButton("X");
		buttonX.setBounds(205,465,50,50);
		panel.add(buttonX);
		
		buttonC = new JButton("C");
		buttonC.setBounds(260,465,50,50);
		panel.add(buttonC);
		
		buttonV = new JButton("V");
		buttonV.setBounds(315,465,50,50);
		panel.add(buttonV);
		
		buttonB = new JButton("B");
		buttonB.setBounds(370,465,50,50);
		panel.add(buttonB);
		
		buttonN = new JButton("N");
		buttonN.setBounds(425,465,50,50);
		panel.add(buttonN);
	
		buttonM = new JButton("M");
		buttonM.setBounds(480,465,50,50);
		panel.add(buttonM);
		
		buttonComma = new JButton(",");
		buttonComma.setBounds(535,465,50,50);
		panel.add(buttonComma);
		
		buttonPeriod = new JButton(".");
		buttonPeriod.setBounds(590,465,50,50);
		panel.add(buttonPeriod);
		
		buttonQuestion = new JButton("?");
		buttonQuestion.setBounds(645,465,50,50);
		panel.add(buttonQuestion);
		
		buttonUp = new JButton("\u2191");
		buttonUp.setBounds(730,465,50,50);
		panel.add(buttonUp);
		
		
		//Bottom row of keyboard created
		buttonSpace = new JButton("");
		buttonSpace.setBounds(260,520,325,50);
		panel.add(buttonSpace);
		
		buttonLeft = new JButton("\u2190");
		buttonLeft.setBounds(675,520,50,50);
		panel.add(buttonLeft);
		
		buttonDown = new JButton("\u2193");
		buttonDown.setBounds(730,520,50,50);
		panel.add(buttonDown);
		
		buttonRight = new JButton("\u2192");
		buttonRight.setBounds(785,520,50,50);
		panel.add(buttonRight);
		
		
		this.add(panel);
		
		
	}
	
	

	/**
	 * keyTyped, when a key is typed then do an action
	 * did not use this for the assignment
	 * 
	 * @param KeyEvent e
	 * 
	 * @return none
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
			
	}
	
	/**
	 * keyPressed, when a key is pressed then the key
	 * on the virtual keyboard is highlighted green
	 * 
	 * @param KeyEvent e
	 * 
	 * @return none
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == textArea)
		{
			keycode = e.getKeyCode();
			
			if(keycode == KeyEvent.VK_SPACE)
				buttonSpace.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_LEFT)
				buttonLeft.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_RIGHT)
				buttonRight.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_DOWN)
				buttonDown.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_UP)
				buttonUp.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_SLASH)
				buttonQuestion.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_PERIOD)
				buttonPeriod.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_COMMA)
				buttonComma.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_M)
				buttonM.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_N)
				buttonN.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_B)
				buttonB.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_V)
				buttonV.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_C)
				buttonC.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_X)
				buttonX.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_Z)
				buttonZ.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_SHIFT)
				buttonShift.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_ENTER)
				buttonEnter.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_QUOTE)
				buttonQuotation.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_SEMICOLON)
				buttonSemicolon.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_L)
				buttonL.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_K)
				buttonK.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_J)
				buttonJ.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_H)
				buttonH.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_G)
				buttonG.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_F)
				buttonF.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_D)
				buttonD.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_S)
				buttonS.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_A)
				buttonA.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_CAPS_LOCK)
				buttonCaps.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_BACK_SLASH)
				buttonBackSlash.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_CLOSE_BRACKET)
				buttonRightBracket.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_OPEN_BRACKET)
				buttonLeftBracket.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_P)
				buttonP.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_O)
				buttonO.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_I)
				buttonI.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_U)
				buttonU.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_Y)
				buttonY.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_T)
				buttonT.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_R)
				buttonR.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_E)
				buttonE.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_W)
				buttonW.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_Q)
				buttonQ.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_TAB)
				buttonTab.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_BACK_SPACE)
				buttonBackSpc.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_EQUALS)
				buttonPlus.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_MINUS)
				buttonMinus.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_0)
				button0.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_9)
				button9.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_8)
				button8.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_7)
				button7.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_6)
				button6.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_5)
				button5.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_4)
				button4.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_3)
				button3.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_2)
				button2.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_1)
				button1.setBackground(Color.green);
			
			else if(keycode == KeyEvent.VK_BACK_QUOTE)
				buttonTilde.setBackground(Color.green);
				
			
		}
	}

	/**
	 * keyReleased, when a key is released then the key
	 * on the virtual keyboard resumes back to original state
	 * 
	 * @param KeyEvent e
	 * 
	 * @return none
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == textArea)
		{
			keycode = e.getKeyCode();
			
			if(keycode == KeyEvent.VK_SPACE)
				buttonSpace.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_LEFT)
				buttonLeft.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_RIGHT)
				buttonRight.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_DOWN)
				buttonDown.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_UP)
				buttonUp.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_SLASH)
				buttonQuestion.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_PERIOD)
				buttonPeriod.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_COMMA)
				buttonComma.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_M)
				buttonM.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_N)
				buttonN.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_B)
				buttonB.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_V)
				buttonV.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_C)
				buttonC.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_X)
				buttonX.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_Z)
				buttonZ.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_SHIFT)
				buttonShift.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_ENTER)
				buttonEnter.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_QUOTE)
				buttonQuotation.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_SEMICOLON)
				buttonSemicolon.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_L)
				buttonL.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_K)
				buttonK.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_J)
				buttonJ.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_H)
				buttonH.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_G)
				buttonG.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_F)
				buttonF.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_D)
				buttonD.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_S)
				buttonS.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_A)
				buttonA.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_CAPS_LOCK)
				buttonCaps.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_BACK_SLASH)
				buttonBackSlash.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_CLOSE_BRACKET)
				buttonRightBracket.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_OPEN_BRACKET)
				buttonLeftBracket.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_P)
				buttonP.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_O)
				buttonO.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_I)
				buttonI.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_U)
				buttonU.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_Y)
				buttonY.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_T)
				buttonT.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_R)
				buttonR.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_E)
				buttonE.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_W)
				buttonW.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_Q)
				buttonQ.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_TAB)
				buttonTab.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_BACK_SPACE)
				buttonBackSpc.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_EQUALS)
				buttonPlus.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_MINUS)
				buttonMinus.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_0)
				button0.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_9)
				button9.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_8)
				button8.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_7)
				button7.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_6)
				button6.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_5)
				button5.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_4)
				button4.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_3)
				button3.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_2)
				button2.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_1)
				button1.setBackground(cc);
			
			else if(keycode == KeyEvent.VK_BACK_QUOTE)
				buttonTilde.setBackground(cc);
				
			
		}
	


	}
	
}
