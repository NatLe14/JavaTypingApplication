/**
* Start Class File
* 
* This class is to start the type application
* Call KeyboardForm to create virtual keyboard GUI
*
* @author Nathan Le
* @version 1.0
* @since 2019-10-12
*/

public class Start {
	
	/**
	 * main, will start the type application
	 * 
	 * @param String [] args
	 * 
	 * @return none
	 */
	public static void main(String [] args)
	{
		//Create virtual keyboard gui
		KeyboardForm keyb = new KeyboardForm();
		keyb.setVisible(true);
		
		
	}
	
}
