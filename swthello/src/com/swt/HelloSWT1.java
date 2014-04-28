package com.swt;

import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloSWT1 {
	Text logText;

	public HelloSWT1() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		shell.setLayout(layout);
		shell.setText("Event demo");
		Label label1 = new Label(shell, SWT.RIGHT);
		label1.setText("text1:");
		Text text1 = new Text(shell, SWT.NONE);
		text1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Text t = getLogText();
				String s = t.getText();
				t.setText(String.valueOf(e.character));
			}
		});
		Label label2 = new Label(shell, SWT.RIGHT);
		label2.setText("text2:");
		Text text2 = new Text(shell, SWT.NONE);
		text2.setEditable(false);
		text2.setBackground(new Color(display, 255, 255, 255));
		setLogText(text2);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloSWT1 demo2 = new HelloSWT1();
	}

	/**
	 * @return Returns the logText.
	 */
	public Text getLogText() {
		return logText;
	}

	/**
	 * @param logText
	 *            The logText to set.
	 */
	public void setLogText(Text logText) {
		this.logText = logText;
	}
}