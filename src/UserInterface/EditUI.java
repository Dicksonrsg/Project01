
package UserInterface;

import CTRL.DaysCtrl;
import CTRL.Masker;
import CTRL.PhoneCtrl;
import CTRL.TeacherCtrl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import model.Days;
import model.Phone;
import model.Teacher;

public class EditUI extends JPanel{
    
   /*tfRnumber to campo de texto para matricula, jlRNumber to label matricula*/
       
    private JTextField tfName, tfLanguage;
    private JFormattedTextField tfPhone, tfRnumber;
    private JButton jbUpdate, jbClean;
    private JLabel jlName, jlRnumber,jlPhone, jlLanguage; 
    private JCheckBox jcMS1, jcMS2, jcMS3, jcMS4, jcMS5, jcMS6;
    private JCheckBox jcTS1, jcTS2, jcTS3, jcTS4, jcTS5, jcTS6;
    private JCheckBox jcWS1, jcWS2, jcWS3, jcWS4, jcWS5, jcWS6;
    private JCheckBox jcThS1, jcThS2, jcThS3, jcThS4, jcThS5, jcThS6;
    private JCheckBox jcFS1, jcFS2, jcFS3, jcFS4, jcFS5, jcFS6;
    private JCheckBox jcSatS, ckMon, ckTue, ckWed, ckThu, ckFri, ckSat;
    private MaskFormatter mask, maskr;

    public EditUI(){
        startComponents();
        setEvents();
        cleanCheckBox();

    }
    
	private void startComponents() {
		setLayout(null);
		
		tfName = new JTextField();
		tfLanguage = new JTextField();
                
                try{
                    mask = new MaskFormatter("(##) ####-####");
                    tfPhone = new JFormattedTextField(mask);
                }catch(ParseException error){
                    System.out.println("Error: " + error.toString());
                }finally{
                    tfPhone.setBounds(70, 90, 150, 20);
                    add(tfPhone);
                }
                
                try{
                    maskr = new MaskFormatter("####");
                    tfRnumber = new JFormattedTextField(maskr);
                }catch(ParseException error){
                    System.out.println("Error: " + error.toString());
                }finally{
                    tfRnumber.setBounds(70, 15, 50, 20);
                    add(tfRnumber);
                }                
                               
                tfName.setBounds(70, 40, 300, 20);
                tfLanguage.setBounds(70, 65, 150, 20);
                 
                
		add(tfName); add(tfLanguage);                
		
		jbUpdate = new JButton("Salvar");
		jbClean = new JButton("Cancelar");
                
                jbUpdate.setBounds(120, 340, 100, 30);
                jbClean.setBounds(230, 340, 100, 30);
                
                add(jbUpdate); add(jbClean);
                
		jlRnumber = new JLabel("Matricula");
		jlName = new JLabel("Nome");
		jlPhone = new JLabel("Telefone");
		jlLanguage = new JLabel("Lingua");
                
		jlRnumber.setBounds(10, 15, 60, 20);
		jlName.setBounds(10, 40, 45, 20);
		jlLanguage.setBounds(10, 65, 45, 20);
		jlPhone.setBounds(10, 90, 50, 20);
                
		add(jlRnumber); add(jlName); add(jlLanguage); add(jlPhone);                
                
		ckMon = new JCheckBox("Segunda");
		ckTue = new JCheckBox("Terça");
		ckWed = new JCheckBox("Quarta");
		ckThu = new JCheckBox("Quinta");
		ckFri = new JCheckBox("Sexta");
		ckSat = new JCheckBox("Sabado");
                
                ckMon.setBounds(10, 120, 80, 20);
                ckTue.setBounds(120, 120, 80, 20);
                ckWed.setBounds(230, 120, 80, 20);
                ckThu.setBounds(340, 120, 80, 20);
                ckFri.setBounds(450, 120, 80, 20);
                ckSat.setBounds(560, 120, 80, 20);
                
		add(ckMon); add(ckTue); add(ckWed); add(ckThu); add(ckFri); add(ckSat);                
                
                jcMS1 = new JCheckBox("07:20 - 09:20"); jcMS1.setEnabled(false);
                jcMS2 = new JCheckBox("09:30 - 11:30"); jcMS2.setEnabled(false);
                jcMS3 = new JCheckBox("13:30 - 15:30"); jcMS3.setEnabled(false);
                jcMS4 = new JCheckBox("15:40 - 17:40"); jcMS4.setEnabled(false);
                jcMS5 = new JCheckBox("18:00 - 20:00"); jcMS5.setEnabled(false);
                jcMS6 = new JCheckBox("20:00 - 22:00"); jcMS6.setEnabled(false);
                                               
                jcMS1.setBounds(10, 145, 100, 20);
                jcMS2.setBounds(10, 170, 100, 20);
                jcMS3.setBounds(10, 195, 100, 20);
                jcMS4.setBounds(10, 220, 100, 20);
                jcMS5.setBounds(10, 245, 100, 20);
                jcMS6.setBounds(10, 270, 100, 20);
                
                add(jcMS1); add(jcMS2); add(jcMS3); add(jcMS4); add(jcMS5); add(jcMS6);                
                
                jcTS1 = new JCheckBox("07:20 - 09:20"); jcTS1.setEnabled(false);
                jcTS2 = new JCheckBox("09:30 - 11:30"); jcTS2.setEnabled(false);
                jcTS3 = new JCheckBox("13:30 - 15:30"); jcTS3.setEnabled(false);
                jcTS4 = new JCheckBox("15:40 - 17:40"); jcTS4.setEnabled(false);
                jcTS5 = new JCheckBox("18:00 - 20:00"); jcTS5.setEnabled(false);
                jcTS6 = new JCheckBox("20:00 - 22:00"); jcTS6.setEnabled(false);
                
                jcTS1.setBounds(120, 145, 100, 20);
                jcTS2.setBounds(120, 170, 100, 20);
                jcTS3.setBounds(120, 195, 100, 20);
                jcTS4.setBounds(120, 220, 100, 20);
                jcTS5.setBounds(120, 245, 100, 20);
                jcTS6.setBounds(120, 270, 100, 20);
                
                add(jcTS1); add(jcTS2); add(jcTS3); add(jcTS4); add(jcTS5); add(jcTS6);                
                
                jcWS1 = new JCheckBox("07:20 - 09:20"); jcWS1.setEnabled(false);
                jcWS2 = new JCheckBox("09:30 - 11:30"); jcWS2.setEnabled(false);
                jcWS3 = new JCheckBox("13:30 - 15:30"); jcWS3.setEnabled(false);
                jcWS4 = new JCheckBox("15:40 - 17:40"); jcWS4.setEnabled(false);
                jcWS5 = new JCheckBox("18:00 - 20:00"); jcWS5.setEnabled(false);
                jcWS6 = new JCheckBox("20:00 - 22:00"); jcWS6.setEnabled(false);
                
                jcWS1.setBounds(230, 145, 100, 20);
                jcWS2.setBounds(230, 170, 100, 20);
                jcWS3.setBounds(230, 195, 100, 20);
                jcWS4.setBounds(230, 220, 100, 20);
                jcWS5.setBounds(230, 245, 100, 20);
                jcWS6.setBounds(230, 270, 100, 20);
                
                add(jcWS1); add(jcWS2); add(jcWS3); add(jcWS4); add(jcWS5); add(jcWS6);                
                
                jcThS1 = new JCheckBox("07:20 - 09:20"); jcThS1.setEnabled(false);
                jcThS2 = new JCheckBox("09:30 - 11:30"); jcThS2.setEnabled(false);
                jcThS3 = new JCheckBox("13:30 - 15:30"); jcThS3.setEnabled(false);
                jcThS4 = new JCheckBox("15:40 - 17:40"); jcThS4.setEnabled(false);
                jcThS5 = new JCheckBox("18:00 - 20:00"); jcThS5.setEnabled(false);
                jcThS6 = new JCheckBox("20:00 - 22:00"); jcThS6.setEnabled(false);
                
                jcThS1.setBounds(340, 145, 100, 20);
                jcThS2.setBounds(340, 170, 100, 20);
                jcThS3.setBounds(340, 195, 100, 20);
                jcThS4.setBounds(340, 220, 100, 20);
                jcThS5.setBounds(340, 245, 100, 20);
                jcThS6.setBounds(340, 270, 100, 20);
                
                add(jcThS1); add(jcThS2); add(jcThS3); add(jcThS4); add(jcThS5); add(jcThS6);
		
                jcFS1 = new JCheckBox("07:20 - 09:20"); jcFS1.setEnabled(false);
                jcFS2 = new JCheckBox("09:30 - 11:30"); jcFS2.setEnabled(false);
                jcFS3 = new JCheckBox("13:30 - 15:30"); jcFS3.setEnabled(false);
                jcFS4 = new JCheckBox("15:40 - 17:40"); jcFS4.setEnabled(false);
                jcFS5 = new JCheckBox("18:00 - 20:00"); jcFS5.setEnabled(false);
                jcFS6 = new JCheckBox("20:00 - 22:00"); jcFS6.setEnabled(false);
                
                jcFS1.setBounds(450, 145, 100, 20);
                jcFS2.setBounds(450, 170, 100, 20);
                jcFS3.setBounds(450, 195, 100, 20);
                jcFS4.setBounds(450, 220, 100, 20);
                jcFS5.setBounds(450, 245, 100, 20);
                jcFS6.setBounds(450, 270, 100, 20);
                
                add(jcFS1); add(jcFS2); add(jcFS3); add(jcFS4); add(jcFS5); add(jcFS6);                
                
                jcSatS = new JCheckBox("08:00 - 12:00"); jcSatS.setEnabled(false);                                                                                                                                                               
                jcSatS.setBounds(560, 145, 100, 20);
						                                                              		                
                add(jcSatS);
	}
        
	private void cleanCheckBox(){
            ckMon.setSelected(false);
            ckTue.setSelected(false);
            ckWed.setSelected(false);
            ckThu.setSelected(false);
            ckFri.setSelected(false);
            ckSat.setSelected(false);
        }
        private void boxChecker(String d, int s){
            switch(d){
                case "Segunda": case "segunda":
                    ckMon.setSelected(true);
                    switch(s){
                        case 1:
                            jcMS1.setSelected(true);
                            break;
                        case 2:
                            jcMS2.setSelected(true);
                            break;
                        case 3:    
                            jcMS3.setSelected(true);
                            break;
                        case 4:    
                            jcMS4.setSelected(true);
                            break;
                        case 5:    
                            jcMS5.setEnabled(true);
                            break;
                        case 6:
                            jcMS6.setEnabled(true);
                            break;
                    };
                    break;
                    
                case "Terca":
                    ckTue.setSelected(true);
                    switch(s){
                        case 1:
                            jcTS1.setSelected(true);
                            break;
                        case 2:
                            jcTS2.setSelected(true);
                            break;
                        case 3:    
                            jcTS3.setSelected(true);
                            break;
                        case 4:    
                            jcTS4.setSelected(true);
                            break;
                        case 5:    
                            jcTS5.setEnabled(true);
                            break;
                        case 6:
                            jcTS6.setEnabled(true);
                            break;                        
                    };
                    break;
                    
                case "Quarta":
                    ckWed.setSelected(true);
                    switch(s){
                        case 1:
                            jcWS1.setSelected(true);
                            break;
                        case 2:
                            jcWS2.setSelected(true);
                            break;
                        case 3:    
                            jcWS3.setSelected(true);
                            break;
                        case 4:    
                            jcWS4.setSelected(true);
                            break;
                        case 5:    
                            jcWS5.setEnabled(true);
                            break;
                        case 6:
                            jcWS6.setEnabled(true);
                            break;
                    };
                    break;
                    
                case "Quinta":
                    ckThu.setSelected(true);
                    switch(s){
                        case 1:
                            jcThS1.setSelected(true);
                            break;
                        case 2:
                            jcThS2.setSelected(true);
                            break;
                        case 3:    
                            jcThS3.setSelected(true);
                            break;
                        case 4:    
                            jcThS4.setSelected(true);
                            break;
                        case 5:    
                            jcThS5.setEnabled(true);
                            break;
                        case 6:
                            jcThS6.setEnabled(true);
                            break;
                    };
                    break;
                    
                case "Sexta":
                    ckFri.setSelected(true);
                    switch(s){
                        case 1:
                            jcFS1.setSelected(true);
                            break;
                        case 2:
                            jcFS2.setSelected(true);
                            break;
                        case 3:    
                            jcFS3.setSelected(true);
                            break;
                        case 4:    
                            jcFS4.setSelected(true);
                            break;
                        case 5:    
                            jcFS5.setEnabled(true);
                            break;
                        case 6:
                            jcFS6.setEnabled(true);
                            break;
                    };
                    break;
                case "Sabado":
                    ckSat.setSelected(true);
                    break;
            };
        }
   
	private void setEvents() {
            TeacherCtrl tctrl = new TeacherCtrl();
            PhoneCtrl pctrl = new PhoneCtrl();
            DaysCtrl dctrl = new DaysCtrl();
            Masker m2 = new Masker();
            
	ckMon.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckMon.isSelected()){
                    jcMS1.setEnabled(true); 
                    jcMS2.setEnabled(true);
                    jcMS3.setEnabled(true);
                    jcMS4.setEnabled(true);
                    jcMS5.setEnabled(true);
                    jcMS6.setEnabled(true);
                }else{
                    jcMS1.setEnabled(false); jcMS1.setSelected(false);
                    jcMS2.setEnabled(false); jcMS2.setSelected(false);
                    jcMS3.setEnabled(false); jcMS3.setSelected(false);
                    jcMS4.setEnabled(false); jcMS4.setSelected(false);
                    jcMS5.setEnabled(false); jcMS5.setSelected(false);
                    jcMS6.setEnabled(false); jcMS6.setSelected(false);
                }
            }
        });
        
	ckTue.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckTue.isSelected()){
                    jcTS1.setEnabled(true);
                    jcTS2.setEnabled(true);
                    jcTS3.setEnabled(true);
                    jcTS4.setEnabled(true);
                    jcTS5.setEnabled(true);
                    jcTS6.setEnabled(true);
                }else{
                    jcTS1.setEnabled(false); jcTS1.setSelected(false);
                    jcTS2.setEnabled(false); jcTS2.setSelected(false);
                    jcTS3.setEnabled(false); jcTS3.setSelected(false);
                    jcTS4.setEnabled(false); jcTS4.setSelected(false);
                    jcTS5.setEnabled(false); jcTS5.setSelected(false);
                    jcTS6.setEnabled(false); jcTS6.setSelected(false);
                }
            }
        });
        
	ckWed.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckWed.isSelected()){
                    jcWS1.setEnabled(true); 
                    jcWS2.setEnabled(true);
                    jcWS3.setEnabled(true);
                    jcWS4.setEnabled(true);
                    jcWS5.setEnabled(true);
                    jcWS6.setEnabled(true);
                }else{
                    jcWS1.setEnabled(false); jcWS1.setSelected(false);
                    jcWS2.setEnabled(false); jcWS2.setSelected(false);
                    jcWS3.setEnabled(false); jcWS3.setSelected(false);
                    jcWS4.setEnabled(false); jcWS4.setSelected(false);
                    jcWS5.setEnabled(false); jcWS5.setSelected(false);
                    jcWS6.setEnabled(false); jcWS6.setSelected(false);
                }
            }
        }); 
        
	ckThu.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckThu.isSelected()){
                    jcThS1.setEnabled(true); 
                    jcThS2.setEnabled(true);
                    jcThS3.setEnabled(true);
                    jcThS4.setEnabled(true);
                    jcThS5.setEnabled(true);
                    jcThS6.setEnabled(true);
                }else{
                    jcThS1.setEnabled(false); jcThS1.setSelected(false);
                    jcThS2.setEnabled(false); jcThS2.setSelected(false);
                    jcThS3.setEnabled(false); jcThS3.setSelected(false);
                    jcThS4.setEnabled(false); jcThS4.setSelected(false);
                    jcThS5.setEnabled(false); jcThS5.setSelected(false);
                    jcThS6.setEnabled(false); jcThS6.setSelected(false);
                }
            }
        });        
	
	ckFri.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckFri.isSelected()){
                    jcFS1.setEnabled(true);
                    jcFS2.setEnabled(true);
                    jcFS3.setEnabled(true);
                    jcFS4.setEnabled(true);
                    jcFS5.setEnabled(true);
                    jcFS6.setEnabled(true);
                }else{
                    jcFS1.setEnabled(false); jcFS1.setSelected(false);
                    jcFS2.setEnabled(false); jcFS2.setSelected(false);
                    jcFS3.setEnabled(false); jcFS3.setSelected(false);
                    jcFS4.setEnabled(false); jcFS4.setSelected(false);
                    jcFS5.setEnabled(false); jcFS5.setSelected(false);
                    jcFS6.setEnabled(false); jcFS6.setSelected(false);
                }
            }
        }); 
        
	ckSat.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ckSat.isSelected()){
                    jcSatS.setEnabled(true);
                    jcSatS.setSelected(true);
                }else{
                    jcSatS.setEnabled(false);
                    jcSatS.setSelected(false);
                }
            }
        });
        
        jbClean.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfName.setText("");
                tfRnumber.setText("");
                tfLanguage.setText("");
                tfPhone.setText("");
                cleanCheckBox();
            }
        });
        
        tfRnumber.addFocusListener(new FocusListener() {

                @Override
                public void focusGained(FocusEvent e) {

                }

                @Override
                public void focusLost(FocusEvent e) {
                    Teacher tea = new Teacher();
                    if(tfRnumber.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "Digite a matricula do professor!");
                    }else if(tfRnumber.getText().trim().length() < 4){
                        JOptionPane.showMessageDialog(null, "Matricula deve conter 4 números sem espaços.");
                    }else{    
                        try{
                        int rg = Integer.parseInt(tfRnumber.getText());
                        tea = tctrl.FindByRG(rg);
                        tfName.setText(tea.getName());
                        tfLanguage.setText(tea.getLangauge());
                        }catch(NumberFormatException error){
                            System.out.println(error.toString());
                        }catch(NullPointerException error1){
                            System.out.println(error1.toString());
                        }

                        int id = tea.getId();
                        for(Phone phone : pctrl.list(id)){
                            tfPhone.setText(phone.getPhone());
                        }

                        for(Days day : dctrl.list(id)){
                            String da = day.getName();
                            int sh = day.getShift();
                            boxChecker(da, sh);
                        }                        
                    }                    
                }
            });
        
        jbUpdate.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Teacher teac = new Teacher();
                    
                    int rg = Integer.parseInt(tfRnumber.getText());
                    String newn = tfName.getText();
                    String newl = tfLanguage.getText();
                    teac = tctrl.FindByRG(rg);
                    int id = teac.getId();
                    tctrl.update(id, rg, newn, newl);
                    
                    String npho = m2.clear(tfPhone.getText());
                    pctrl.update(id, npho);
                    
                    int q = JOptionPane.showConfirmDialog(null, "Nova edição?", "Cadastro editado com sucesso!", JOptionPane.YES_NO_OPTION);
                    if(q == 0){
                        tfName.setText("");
                        tfRnumber.setText("");
                        tfLanguage.setText("");
                        tfPhone.setText("");
                        cleanCheckBox();                                                    
                    }else{
                        
                    }
                }
            });
    }
}
