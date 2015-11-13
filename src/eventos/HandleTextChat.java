package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javafx.scene.input.KeyCode;

public class HandleTextChat implements KeyListener{

	@Override
	public void keyPressed(KeyEvent cosa) {	}

	@Override
	public void keyReleased(KeyEvent cosa) {
		if(cosa.getKeyCode() == cosa.VK_ENTER){
			
		}
	}

	@Override
	public void keyTyped(KeyEvent cosa) {}

}
