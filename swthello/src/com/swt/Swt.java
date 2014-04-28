package com.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
//import org.eclipse.swt.graphics.Color;

public class Swt {
	private Label mylabel;
	private Shell shell;
	private Display display;
	private Button bu;
	private Tree tre;
	Point po = new Point(0, 0);

	public Swt() {

		super();

		po.x = 200;
		po.y = 200;
		display = new Display();
		shell = new Shell(display);
		shell.setSize(po);
		shell.setLayout(new FillLayout());
		// shell.setBackground(Color.RED);
		tre = new Tree(shell, SWT.CENTER);
		TreeItem item = new TreeItem(tre, SWT.CENTER);
		item.setText("水果");
		new TreeItem(item, SWT.NULL).setText("苹果");
		new TreeItem(item, SWT.NULL).setText("香蕉");
		TreeItem item1 = new TreeItem(tre, SWT.NONE);
		item1.setText("蔬菜");
		new TreeItem(item1, SWT.NULL).setText("黄瓜");
		new TreeItem(item1, SWT.NULL).setText("匾豆");

		/*
		 * mylabel =new Label(shell,SWT.NONE); bu=new Button(shell,SWT.NONE);
		 * bu.setBounds(40,66,50,24); /* System.out.println(bu.getBounds());
		 */
		/*
		 * bu.setText("确定"); mylabel.setBounds(38,21,50,18);
		 * mylabel.setText("Hello,word!");
		 */

	}

	public void start() {

		shell.open();
		while (!shell.isDisposed()) {

			if (!display.readAndDispatch()) {

				display.sleep();
			}
		}

		display.dispose();

	}

	public static void main(String[] args) {
		Swt swt = new Swt();
		swt.start();

	}
}
