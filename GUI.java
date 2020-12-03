import java.awt.BorderLayout;

import java.awt.Color;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class GUI{
	private JPanel panel;
	private JFrame frame;
	private JFileChooser chooser;
	private File file;

	
	public GUI() {
		frame = new JFrame();
		chooser = new JFileChooser(System.getProperty("user.dir"));
		panel = new JPanel();
		panel.add(chooser);
		chooser.showSaveDialog(null);
		chooser.setDialogTitle("Select a image file to be processed");
		int selectedFile = chooser.showSaveDialog(frame);
		if (selectedFile == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			System.out.println("Path of File " + file.getAbsolutePath());
		}
		
		if (file != null) {
			JButton button1 = new JButton("Opiton 1");
			JButton button2 = new JButton("Option 2");

		}
		
	}

	public static void main(String[] args) {
		new GUI();

	}
	
	

}
