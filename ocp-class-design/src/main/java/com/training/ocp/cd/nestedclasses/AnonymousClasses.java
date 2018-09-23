package com.training.ocp.cd.nestedclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonymousClasses {
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

		// rewritten with lambda expression
		button.addActionListener(actionListener -> {
			// handle the button click
		});
	}

}
