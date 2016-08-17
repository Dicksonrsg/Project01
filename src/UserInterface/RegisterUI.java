
package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
                
                jcMS1 = new JCheckBox("07:20 - 09:20"); jcMS1.setEnabled(false);
                jcMS2 = new JCheckBox("09:30 - 11:30"); jcMS2.setEnabled(false);
                jcMS3 = new JCheckBox("13:30 - 15:30"); jcMS3.setEnabled(false);
                jcMS4 = new JCheckBox("15:40 - 17:40"); jcMS4.setEnabled(false);
                jcMS5 = new JCheckBox("18:00 - 20:00"); jcMS5.setEnabled(false);
                jcMS6 = new JCheckBox("20:00 - 22:00"); jcMS6.setEnabled(false);
                
                jcTS1 = new JCheckBox("07:20 - 09:20"); jcTS1.setEnabled(false);
                jcTS2 = new JCheckBox("09:30 - 11:30"); jcTS2.setEnabled(false);
                jcTS3 = new JCheckBox("13:30 - 15:30"); jcTS3.setEnabled(false);
                jcTS4 = new JCheckBox("15:40 - 17:40"); jcTS4.setEnabled(false);
                jcTS5 = new JCheckBox("18:00 - 20:00"); jcTS5.setEnabled(false);
                jcTS6 = new JCheckBox("20:00 - 22:00"); jcTS6.setEnabled(false);
                
                jcWS1 = new JCheckBox("07:20 - 09:20"); jcWS1.setEnabled(false);
                jcWS2 = new JCheckBox("09:30 - 11:30"); jcWS2.setEnabled(false);
                jcWS3 = new JCheckBox("13:30 - 15:30"); jcWS3.setEnabled(false);
                jcWS4 = new JCheckBox("15:40 - 17:40"); jcWS4.setEnabled(false);
                jcWS5 = new JCheckBox("18:00 - 20:00"); jcWS5.setEnabled(false);
                jcWS6 = new JCheckBox("20:00 - 22:00"); jcWS6.setEnabled(false);
                
                jcThS1 = new JCheckBox("07:20 - 09:20"); jcThS1.setEnabled(false);
                jcThS2 = new JCheckBox("09:30 - 11:30"); jcThS2.setEnabled(false);
                jcThS3 = new JCheckBox("13:30 - 15:30"); jcThS3.setEnabled(false);
                jcThS4 = new JCheckBox("15:40 - 17:40"); jcThS4.setEnabled(false);
                jcThS5 = new JCheckBox("18:00 - 20:00"); jcThS5.setEnabled(false);
                jcThS6 = new JCheckBox("20:00 - 22:00"); jcThS6.setEnabled(false);              
		
                jcFS1 = new JCheckBox("07:20 - 09:20"); jcFS1.setEnabled(false);
                jcFS2 = new JCheckBox("09:30 - 11:30"); jcFS2.setEnabled(false);
                jcFS3 = new JCheckBox("13:30 - 15:30"); jcFS3.setEnabled(false);
                jcFS4 = new JCheckBox("15:40 - 17:40"); jcFS4.setEnabled(false);
                jcFS5 = new JCheckBox("18:00 - 20:00"); jcFS5.setEnabled(false);
                jcFS6 = new JCheckBox("20:00 - 22:00"); jcFS6.setEnabled(false);
                
                jcSatS = new JCheckBox("08:00 - 12:00"); jcSatS.setEnabled(false);
                
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
                
                jcTS1.setBounds(120, 145, 100, 20);
                jcTS2.setBounds(120, 170, 100, 20);
                jcTS3.setBounds(120, 195, 100, 20);
                jcTS4.setBounds(120, 220, 100, 20);
                jcTS5.setBounds(120, 245, 100, 20);
                jcTS6.setBounds(120, 270, 100, 20);  
                
                jcWS1.setBounds(230, 145, 100, 20);
                jcWS2.setBounds(230, 170, 100, 20);
                jcWS3.setBounds(230, 195, 100, 20);
                jcWS4.setBounds(230, 220, 100, 20);
                jcWS5.setBounds(230, 245, 100, 20);
                jcWS6.setBounds(230, 270, 100, 20);
                
                jcThS1.setBounds(340, 145, 100, 20);
                jcThS2.setBounds(340, 170, 100, 20);
                jcThS3.setBounds(340, 195, 100, 20);
                jcThS4.setBounds(340, 220, 100, 20);
                jcThS5.setBounds(340, 245, 100, 20);
                jcThS6.setBounds(340, 270, 100, 20);
                
                jcFS1.setBounds(450, 145, 100, 20);
                jcFS2.setBounds(450, 170, 100, 20);
                jcFS3.setBounds(450, 195, 100, 20);
                jcFS4.setBounds(450, 220, 100, 20);
                jcFS5.setBounds(450, 245, 100, 20);
                jcFS6.setBounds(450, 270, 100, 20);
                
                jcSatS.setBounds(560, 145, 100, 20);
		
		add(jlRnumber); add(jlName); add(jlLanguage); add(jlPhone);
		
		add(tfName); add(tfRnumber); add(tfLanguage); add(tfPhone);
		
		add(rbMon); add(rbTue); add(rbWed); add(rbThu); add(rbFri); add(rbSat);
                
                add(jcMS1); add(jcMS2); add(jcMS3); add(jcMS4); add(jcMS5); add(jcMS6);
                
                add(jcTS1); add(jcTS2); add(jcTS3); add(jcTS4); add(jcTS5); add(jcTS6);
                
                add(jcWS1); add(jcWS2); add(jcWS3); add(jcWS4); add(jcWS5); add(jcWS6);
                
                add(jcThS1); add(jcThS2); add(jcThS3); add(jcThS4); add(jcThS5); add(jcThS6);
		
                add(jcFS1); add(jcFS2); add(jcFS3); add(jcFS4); add(jcFS5); add(jcFS6);
                
                add(jcSatS);
	}
	
	private void setEvents() {
	rbMon.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcMS1.setEnabled(true);
                jcMS2.setEnabled(true);
                jcMS3.setEnabled(true);
                jcMS4.setEnabled(true);
                jcMS5.setEnabled(true);
                jcMS6.setEnabled(true);
            }
        });
        
	rbTue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcTS1.setEnabled(true);
                jcTS2.setEnabled(true);
                jcTS3.setEnabled(true);
                jcTS4.setEnabled(true);
                jcTS5.setEnabled(true);
                jcTS6.setEnabled(true);
            }
        });
        
	rbWed.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcWS1.setEnabled(true);
                jcWS2.setEnabled(true);
                jcWS3.setEnabled(true);
                jcWS4.setEnabled(true);
                jcWS5.setEnabled(true);
                jcWS6.setEnabled(true);
            }
        }); 
        
	rbThu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcThS1.setEnabled(true);
                jcThS2.setEnabled(true);
                jcThS3.setEnabled(true);
                jcThS4.setEnabled(true);
                jcThS5.setEnabled(true);
                jcThS6.setEnabled(true);
            }
        });        
	
	rbFri.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcFS1.setEnabled(true);
                jcFS2.setEnabled(true);
                jcFS3.setEnabled(true);
                jcFS4.setEnabled(true);
                jcFS5.setEnabled(true);
                jcFS6.setEnabled(true);
            }
        });
        
	rbSat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jcSatS.setEnabled(true);
            }
        });        
	}
        
}
