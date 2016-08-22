package UserInterface;

import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class DeleteUI extends JPanel{
	
	private JLabel jlName, jlRNumber;
	private JFormattedTextField ftName, ftRnumber;
	private JButton jbDelete, jbCancel;
	private MaskFormatter maskrn, maskN;
	
	public DeleteUI(){
        startComponents();
        setEvents();		
	}

	private void setEvents() {
		
		
	}

	private void startComponents() {
		setLayout(null);
		
		jlName = new JLabel("Nome");
		jlRNumber = new JLabel("Matricula");
		jlName.setBounds(10, 40, 45, 20);
		jlRNumber.setBounds(10, 15, 60, 20);
		add(jlName); add(jlRNumber);
		
        try{
            maskrn = new MaskFormatter("####");
            ftRnumber = new JFormattedTextField(maskrn);
        }catch(ParseException error){
            System.out.println("Error: " + error.toString());
        }finally{
            ftRnumber.setBounds(70, 15, 50, 20);
            add(ftRnumber);
        } 		
	}

}
