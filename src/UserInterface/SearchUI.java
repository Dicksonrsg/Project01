package UserInterface;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class SearchUI extends JPanel {
	
	private JLabel lName, lLang, lRNum;
	private JFormattedTextField ftRnumber;
	private JTextField tfName, tfLang;
	private JCheckBox ckMon, ckTue, ckWed, ckThu, ckFri, ckSat;
	private JCheckBox ckS1, ckS2, ckS3, ckS4, ckS5, ckS6;
	private JButton bSearch, bCancel;
	private MaskFormatter mask;
	private DefaultTableModel model;

    public SearchUI(){
        startComponents();
        setEvents();
    }

	private void startComponents() {
		setLayout(null);
		
		
	}

	private void setEvents() {
		
		
	}	
}
