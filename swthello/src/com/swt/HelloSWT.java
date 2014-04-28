package com.swt;

import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloSWT {
	private Shell shell;

	public HelloSWT() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		setShell(shell);
		RowLayout layout = new RowLayout();
		shell.setLayout(layout);
		shell.setText("Event demo");
		Button button = new Button(shell, SWT.PUSH | SWT.CENTER);
		button.setText("Click me!");
		button.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				handleSelectionEvent();
			}

			public void widgetDefaultSelected(SelectionEvent event) {
			}
		});
		shell.setBounds(200, 300, 100, 100);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	protected void handleSelectionEvent() {
		MessageBox dialog = new MessageBox(getShell(), SWT.OK
				| SWT.ICON_INFORMATION);
		dialog.setText("Hello");
		dialog.setMessage("Hello,world!");
		dialog.open();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloSWT eventdemo = new HelloSWT();
	}

	/**
	 * @return Returns the _shell.
	 */
	public Shell getShell() {
		return shell;
	}

	/**
	 * @param _shell
	 *            The _shell to set.
	 */
	public void setShell(Shell shell) {
		this.shell = shell;
	}
}