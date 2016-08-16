
package UserInterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterUI extends JFrame{
    
    /*tfRnumber to campo de texto para matricula, jlRNumber to label matricula*/
       
    private JTextField tfName, tfRnumber, tfLanguage, tfPhone;
    private JButton jbInserir, jbClean;
    private JLabel jlName, jlRnumber,jlPhone, jlLanguage, jlMon, jlTue, jlWed, jlThu, jlFri, jlSat; 

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
		
		jlName = new JLabel("Nome");
		jlRnumber = new JLabel("Matricula");
		jlPhone = new JLabel("Telefone");
		jlLanguage = new JLabel("Lingua");
		jlMon = new JLabel("Segunda");
		jlTue = new JLabel("Terça");
		jlWed = new JLabel("Quarta");
		jlThu = new JLabel("Quinta");
		jlFri = new JLabel("Sexta");
		jlSat = new JLabel("Sabado");
		
		jlRnumber.setBounds(10, 15, 40, 20);
		jlName.setBounds(10, 40, 45, 20);
		jlLanguage.setBounds(10, 65, 45, 20);
		jlPhone.setBounds(10, 90, 50, 20);
		
		add(jlRnumber); add(jlName); add(jlLanguage); add(jlPhone);
		
/*		add(); add();
		
		add(); add(); add(); add(); add(); add(); add(); add(); add(); add();*/
		
	}
	
	private void setEvents() {
		
		
	}
        
}
