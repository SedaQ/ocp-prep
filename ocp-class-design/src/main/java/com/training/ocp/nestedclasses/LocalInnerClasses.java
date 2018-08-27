package com.training.ocp.nestedclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * Local Inner classes have the following properties:
 * 
 * <ul>
 * <li>They do not have an access specifier</li>
 * <li>They cannot be declared static and cannot declare s tatic fields or
 * methods.</li>
 * <li>They have access to all fields and methods of the enclosing class.</li>
 * <li>They do not have access to local variables of a method unless those
 * variables are final or effectively final. More on this shortly.</li>
 * </ul>
 * 
 * Annonamous class is the same as Local Inner class except that Anonymous class
 * does not have name.
 * 
 * @author Pavel Seda
 *
 */
public class LocalInnerClasses {
	private int length = 5;

	public void calculate() {
		final int width = 20;

		int anotherField = 50;
		// anotherField = 40;
		class Inner {
			public void multiply() {
				System.out.println(length * width);
				System.out.println(anotherField); // must be final or effectively final
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		LocalInnerClasses outer = new LocalInnerClasses();
		outer.calculate();
	}
}

/**
 * Show replacement of anonymous inner classes with lambda functions
 * 
 * @author Pavel Seda
 *
 */
class UseGUI {

	void invokeGuiAction() {
		JButton button = new JButton("blue");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// handle the button click
			}
		});

		// rewrite with lambda expression
		button.addActionListener(actionListener -> {
			// handle the button click
		});
	}

}
