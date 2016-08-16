
package UserInterface;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegisterUI extends JPanel{
    
    /*tfRnumber to campo de texto para matricula, jlRNumber to label matricula*/
       
    private JTextField tfName, tfRnumber, tfLanguage, tfPhone;
    private JButton jbInserir, jbClean;
    private JLabel jlName, jlRnumber,jlPhone, jlLanguage; 
    private JRadioButton rbMon, rbTue, rbWed, rbThu, rbFri, rbSat;
    private JCheckBox jcMS1, jcMS2, jcMS3, jcMS4, jcMS5, jcMS6;
    private JCheckBox jcTS1, jcTS2, jcTS3, jcTS4, jcTS5, jcTS6;
    private JCheckBox jcWS1, jcWS2, jcWS3, jcWS4, jcWS5, jcWS6;
    private JCheckBox jcThS1, jcThS2, jcThS3, jcThS4, jcThS5, jcThS6;
    private JCheckBox jcFS1, jcFS2, jcFS3, jcFS4, jcFS5, jcFS6;
    private JCheckBox jcSatS;

    public RegisterUI(){
        startComponents();
        setEvents();    	
    }
    
	private void startComponents() {
		setLayout(null);
		
		tfName = new JTextField();
		tfRnumber = new JTextField();
		tfLanguage = new JTextField();
		tfPhone = new JTextField();
		
		jbInserir = new JButton("Cadastrar");
		jbClean = new JButton("Limpar");
                
		jlRnumber = new JLabel("Matricula");
		jlName = new JLabel("Nome");
		jlPhone = new JLabel("Telefone");
		jlLanguage = new JLabel("Lingua");
		rbMon = new JRadioButton("Segunda");
		rbTue = new JRadioButton("Terça");
		rbWed = new JRadioButton("Quarta");
		rbThu = new JRadioButton("Quinta");
		rbFri = new JRadioButton("Sexta");
		rbSat = new JRadioButton("Sabado");
                
                jcMS1 = new JCheckBox("07:20 - 09:20"); 
                jcMS2 = new JCheckBox("09:30 - 11:30");
                jcMS3 = new JCheckBox("13:30 - 15:30");
                jcMS4 = new JCheckBox("15:40 - 17:40");
                jcMS5 = new JCheckBox("18:00 - 20:00");
                jcMS6 = new JCheckBox("20:00 - 22:00");
		
		jlRnumber.setBounds(10, 15, 60, 20);
		jlName.setBounds(10, 40, 45, 20);
		jlLanguage.setBounds(10, 65, 45, 20);
		jlPhone.setBounds(10, 90, 50, 20);
                
                rbMon.setBounds(10, 120, 80, 20);
                rbTue.setBounds(120, 120, 80, 20);
                rbWed.setBounds(230, 120, 80, 20);
                rbThu.setBounds(340, 120, 80, 20);
                rbFri.setBounds(450, 120, 80, 20);
                rbSat.setBounds(560, 120, 80, 20);
                
                
                tfRnumber.setBounds(70, 15, 50, 20);
                tfName.setBounds(70, 40, 300, 20);
                tfLanguage.setBounds(70, 65, 150, 20);
                tfPhone.setBounds(70, 90, 150, 20);
                
                jcMS1.setBounds(10, 145, 100, 20);
                jcMS2.setBounds(10, 170, 100, 20);
                jcMS3.setBounds(10, 195, 100, 20);
                jcMS4.setBounds(10, 220, 100, 20);
                jcMS5.setBounds(10, 245, 100, 20);
                jcMS6.setBounds(10, 270, 100, 20);
		
		add(jlRnumber); add(jlName); add(jlLanguage); add(jlPhone);
		
		add(tfName); add(tfRnumber); add(tfLanguage); add(tfPhone);
		
		add(rbMon); add(rbTue); add(rbWed); add(rbThu); add(rbFri); add(rbSat);
                
                add(jcMS1); add(jcMS2); add(jcMS3); add(jcMS4); add(jcMS5); add(jcMS6);
		
	}
	
	private void setEvents() {
		
		
	}
        
}
