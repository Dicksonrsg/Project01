package UserInterface;

import CTRL.TeacherCtrl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import javafx.scene.paint.Color;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import model.Teacher;

public class DeleteUI extends JPanel{
	
    private JLabel jlName, jlRNumber;
    private JFormattedTextField ftRnumber;
    private JTextField tfName;
    private JButton jbDelete, jbCancel;
    private MaskFormatter maskrn;
	
    public DeleteUI(){
    startComponents();
    setEvents();		
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

        tfName = new JTextField();
        tfName.setBounds(60, 40, 150, 20);
        tfName.setEditable(false);
        add(tfName);
        
        jbDelete = new JButton("Delete");
        jbCancel = new JButton("Cancelar");
        jbDelete.setBounds(60, 75, 100, 30);
        jbCancel.setBounds(170, 75, 100, 30);
        add(jbDelete); add(jbCancel);
    }
    
    private void setEvents() {
        TeacherCtrl tctrl = new TeacherCtrl();
        PhoneCtrl pctrl = new PhoneCtrl();
        DaysCtrl dctrl = new DaysCtrl();
        
        ftRnumber.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                    Teacher tea = new Teacher();

                    try{
                    int rg = Integer.parseInt(ftRnumber.getText());
                    tea = tctrl.FindByRG(rg);
                    tfName.setText(tea.getName());
                    }catch(NumberFormatException error){
                        System.out.println(error.toString());
                    }catch(NullPointerException error1){
                        System.out.println(error1.toString());
                    }
                    
                    tfName.setForeground(java.awt.Color.GREEN);
            }
        });
	
        jbDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(ftRnumber.equals("")){
                    JOptionPane.showMessageDialog(null, "Informe a matricula!");
                }else{
                    Teacher teac = new Teacher();
                    int rg = Integer.parseInt(ftRnumber.getText());
                    teac = tctrl.FindByRG(rg);
                    int id = teac.getId();
                    
                    pctrl.delete(id);
                    dctrl.delete(id);
                    tctrl.delete(id);
                }
            }
        });
    }
}
