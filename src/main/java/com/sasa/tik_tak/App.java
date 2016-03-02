package com.sasa.tik_tak;

import org.eclipse.jface.window.*;
import org.eclipse.swt.widgets.*;

import com.sasa.tik_tak.gui.MainWindow;

import org.eclipse.swt.*;
/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
		MainWindow mainWindows = new MainWindow(null);
		mainWindows.setBlockOnOpen(true);
		mainWindows.open();
		Display.getCurrent().dispose();
    }
}
