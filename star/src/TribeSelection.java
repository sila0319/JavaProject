import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;

class TribeSelection extends JFrame implements ActionListener
{
	JFrame LoadingFrame;
	JPanel LoadingPanel;
	JPanel panel;
	JLabel LoadingLB;

	JComboBox UserTribe;
	JComboBox ComTribe;
	JButton Start;
	JLabel UserLB;
	JLabel ComLB;
	
	StarUI User, Com;
	
	TribeSelection(int n){
		User = new StarUI(0, "User");
		User.setBounds(0, 58, 640, 650);
		User.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		TribeSelection start = new TribeSelection(10);
		start.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
