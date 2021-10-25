//SWING
//this program lets you select multiple things if you hold shift

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class TestClass extends JFrame {
	
	public static void main(String[] args) {
		TestClass frame = new TestClass();
		frame.setTitle("Homework 5");
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());

		JLabel label1 = new JLabel("Change Selection Mode");
		label1.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		frame.add(label1);
		
		String[] boxChoices = {"Single", "Multiple"};
		JComboBox comboBox = new JComboBox(boxChoices);
		comboBox.setSelectedIndex(0);
		frame.add(comboBox,BorderLayout.NORTH);
		
		String[] choices = {"USA ","Mexico ","Canada ","Cuba ","Bahams ","Guatemala ","Belize ","Honduras "};
		JList list = new JList(choices);
		list.setSelectedIndex(0);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		frame.add(list,BorderLayout.WEST);
		
		JLabel label2 = new JLabel("You Have selected:");
		label2.setFont(new Font("Source Sans Pro", Font.BOLD, 14));
		frame.add(label2,BorderLayout.SOUTH);
		
		JLabel label3 = new JLabel("");
		label3.setFont(new Font("Source Sans Pro", Font.BOLD, 12));
		frame.add(label3,BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//end setup
		
		//begin event listeners
			class ListListener implements ListSelectionListener{
				@Override
				public void valueChanged(ListSelectionEvent e) {
					// TODO Auto-generated method stub
					String country = "";
					if(list.getValueIsAdjusting() == true) {
						System.out.println("list is being run");
						
						System.out.println(list.getSelectionModel().toString());
						if(list.getSelectionMode() == 0) {
							//selection mode is SINGLE
							country = list.getSelectedValue().toString();
							label3.setText("["+country+"]");
						}else {
							//selection mode is MULTIPLE_INTERVAL
							country = list.getSelectedValuesList().toString();
							label3.setText(country);
						}
					}
				}
			}
			
			class ComboListener implements ActionListener{
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
						System.out.println("combobox is being run");
						label3.setText("");
						int selection = comboBox.getSelectedIndex();
						if (selection == 1) 
							list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
							else  list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					
				}
			}
		//end event listeners
			
		list.addListSelectionListener(new ListListener());
		comboBox.addActionListener(new ComboListener());
		
	}
	
}
