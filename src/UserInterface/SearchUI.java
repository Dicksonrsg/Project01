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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.Days;
import model.Phone;
import model.Teacher;

public class SearchUI extends JPanel {
	
	private JLabel lName, lLang, lRNum;
	private JFormattedTextField ftRnumber;
	private JTextField tfName, tfLang;
	private JCheckBox ckS1, ckS2, ckS3, ckS4, ckS5, ckS6;
	private JRadioButton rbMon, rbTue, rbWed, rbThu, rbFri, rbSat, rbNope;
        private ButtonGroup group;
	private JButton bSearch, bCancel;
	private MaskFormatter mask;
	private DefaultTableModel model;
        private JTable tbAva;
        private JScrollPane scroll;

    public SearchUI(){
        startComponents();
        setEvents();
    }

    private void startComponents() {
	setLayout(null);
	
        lName = new JLabel("Nome");
        lName.setBounds(10, 40, 45, 20);
        add(lName);
        
        tfName = new JTextField();
        tfName.setBounds(70, 40, 300, 20);
        add(tfName);
        
        tfLang = new JTextField();
        tfLang.setBounds(70, 65, 150, 20);
        add(tfLang);
        
        lLang = new JLabel("Lingua");
        lLang.setBounds(10, 65, 45, 20);
        add(lLang);
        
        lRNum = new JLabel("Matricula");
        lRNum.setBounds(10, 15, 60, 20);
        add(lRNum);
                
        try{
            mask = new MaskFormatter("####");
            ftRnumber = new JFormattedTextField(mask);
            }catch(ParseException error){
                System.out.println("Error: " + error.toString());
            }finally{
            ftRnumber.setBounds(70, 15, 50, 20);
            add(ftRnumber);
            }  
        
        model = new DefaultTableModel(
                new Object[]{
                    "Matricula", "Nome", "Telefone", "Lingua", "Dia", "Horario" 
                
                },0
        );
        
        tbAva = new JTable(model);
        tbAva.setRowHeight(30);
        
        DefaultTableCellRenderer rightalignment = new DefaultTableCellRenderer();
        rightalignment.setHorizontalAlignment(SwingConstants.RIGHT);
        DefaultTableCellRenderer centeralignment = new DefaultTableCellRenderer();
        centeralignment.setHorizontalAlignment(SwingConstants.CENTER);
        
        tbAva.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbAva.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbAva.getColumnModel().getColumn(2).setPreferredWidth(60);
        tbAva.getColumnModel().getColumn(3).setPreferredWidth(50);
        tbAva.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbAva.getColumnModel().getColumn(5).setPreferredWidth(50);
        
        tbAva.getColumnModel().getColumn(0).setCellRenderer(centeralignment);
        tbAva.getColumnModel().getColumn(3).setCellRenderer(centeralignment);
        tbAva.getColumnModel().getColumn(4).setCellRenderer(centeralignment);
        tbAva.getColumnModel().getColumn(5).setCellRenderer(centeralignment);
        
        tbAva.getTableHeader().setReorderingAllowed(false);
        
        scroll = new JScrollPane();
        scroll.setViewportView(tbAva);
        scroll.setBounds(10, 180, 700, 280);
        add(scroll);
        
        group = new ButtonGroup();
        
	rbMon = new JRadioButton("Segunda");
        rbMon.setBounds(10, 120, 80, 20);
        group.add(rbMon);
        add(rbMon);
        
        rbTue = new JRadioButton("Terça");
        rbTue.setBounds(120, 120, 80, 20);
        group.add(rbTue);
        add(rbTue);
        
	rbWed = new JRadioButton("Quarta");
        rbWed.setBounds(230, 120, 80, 20);
        group.add(rbWed);
        add(rbWed);
        
	rbThu = new JRadioButton("Quinta");
        rbThu.setBounds(340, 120, 80, 20);
        group.add(rbThu);
        add(rbThu);
        
	rbFri = new JRadioButton("Sexta");
        rbFri.setBounds(450, 120, 80, 20);
        group.add(rbFri);
        add(rbFri);
        
	rbSat = new JRadioButton("Sabado");
        rbSat.setBounds(560, 120, 80, 20);
        group.add(rbSat);
        add(rbSat);
        
        rbNope = new JRadioButton("Nenhuma opção");
        rbNope.setBounds(670, 120, 80, 20);
        group.add(rbNope);
        add(rbNope);
        
        ckS1 = new JCheckBox("07:20 - 09:20");
        ckS1.setBounds(10, 145, 100, 20);
        ckS1.setEnabled(false);
        add(ckS1);
        
        ckS2 = new JCheckBox("09:30 - 11:30");
        ckS2.setBounds(120, 145, 100, 20);
        ckS2.setEnabled(false);
        add(ckS2);
        
        ckS3 = new JCheckBox("13:30 - 15:30");
        ckS3.setBounds(230, 145, 100, 20);
        ckS3.setEnabled(false);
        add(ckS3);
        
        ckS4 = new JCheckBox("15:40 - 17:40");
        ckS4.setBounds(340, 145, 100, 20);
        ckS4.setEnabled(false);
        add(ckS4);
        
        ckS5 = new JCheckBox("18:00 - 20:00");
        ckS5.setBounds(450, 145, 100, 20);
        ckS5.setEnabled(false);
        add(ckS5);
        
        ckS6 = new JCheckBox("20:00 - 22:00");
        ckS6.setBounds(560, 145, 100, 20);
        ckS6.setEnabled(false);
        add(ckS6);
        
        bSearch = new JButton("Pesquisar");
        bSearch.setBounds(400, 65, 100, 30);
        add(bSearch);
        
        bCancel = new JButton("Cancelar");
        bCancel.setBounds(510, 65, 100, 30);
        add(bCancel);
	}

	TeacherCtrl tctrl = new TeacherCtrl();
	PhoneCtrl pctrl = new PhoneCtrl();
	DaysCtrl dctrl = new DaysCtrl();
	Masker m3 = new Masker();	

	private void loadTable(String filter){
            Masker m4 = new Masker();
            model.setRowCount(0);
            for(Teacher teacher : new TeacherCtrl().list(filter)){
                int id = teacher.getId();
                for(Phone phone : pctrl.list(id)){ 
                    for(Days day : dctrl.list(id)){
                        if(day.getName().equals("Sabado")){
                           model.addRow(new Object[] {teacher.getRg(), teacher.getName(), m4.format(phone.getPhone()) , teacher.getLangauge(), day.getName(), "08:00 - 12:00"});
                        }else{
                            model.addRow(new Object[] {teacher.getRg(), teacher.getName(), m4.format(phone.getPhone()) , teacher.getLangauge(), day.getName(), m4.wizard(day.getShift())});
                        }
                    }
                }
            }
	}
	
	private void enableCK(){
            ckS1.setEnabled(true);
            ckS2.setEnabled(true);
            ckS3.setEnabled(true);
            ckS4.setEnabled(true);
            ckS5.setEnabled(true);
            ckS6.setEnabled(true);
	}
	
	private void nonoCK(){
            ckS1.setEnabled(false);
            ckS2.setEnabled(false);
            ckS3.setEnabled(false);
            ckS4.setEnabled(false);
            ckS5.setEnabled(false);
            ckS6.setEnabled(false);
            ckS1.setSelected(false);
            ckS2.setSelected(false);
            ckS3.setSelected(false);
            ckS4.setSelected(false);
            ckS5.setSelected(false);
            ckS6.setSelected(false);
	}
        
        private void cleanTable(){
            model.setRowCount(0);
        }
	
	private void fillTableDS(String dayN, int shift){
            for(Days day : dctrl.findByDS(dayN, shift)){
		String filter = day.getTeacher().getName();
		for(Teacher teacher : new TeacherCtrl().list(filter)){
                    int id = teacher.getId();
                    for(Phone phone : pctrl.list(id)){
			model.addRow(new Object[] {teacher.getRg(), teacher.getName(), m3.format(phone.getPhone()) , teacher.getLangauge(), day.getName(), m3.wizard(day.getShift())});
                    }
		}
            }		
	}
	
	private void defineDay(int shift){
            String name = "";
            if(rbMon.isSelected()){
		name = "Segunda";
		fillTableDS(name, shift);
            }else if(rbTue.isSelected()){
                    name = "Terca";
                    fillTableDS(name, shift);
            }else if(rbWed.isSelected()){
                    name = "Quarta";
                    fillTableDS(name, shift);
            }else if(rbThu.isSelected()){
                    name = "Quinta";
                    fillTableDS(name, shift);
            }else if(rbFri.isSelected()){
                    name = "Sexta";
                    fillTableDS(name, shift);
            }else{
		JOptionPane.showMessageDialog(null, "Something went wrong");
            }
	}

    private void setEvents() {
		
    bSearch.addActionListener(new ActionListener() {
			
	@Override
	public void actionPerformed(ActionEvent e) {
            
            if(ftRnumber.getText().trim().equals("") && tfName.getText().equals("") && tfLang.getText().equals("")){
		JOptionPane.showMessageDialog(null, "Preencha um dos campos a esquerda!");
                }else if(ftRnumber.getText().trim().equals("") == false){
                    if(ftRnumber.getText().trim().length() < 4){
                        JOptionPane.showMessageDialog(null, "Matricula deve conter 4 números sem espaços.");
                    }else{
                        int rg = Integer.parseInt(ftRnumber.getText());
                        Teacher teach = new Teacher();
                        teach = tctrl.FindByRG(rg);

                        int id = teach.getId();
                        for(Days day : dctrl.list(id)){
                            for(Phone phone : pctrl.list(id)){
                                model.setRowCount(0);
                                model.addRow(new Object[] {teach.getRg(), teach.getName(), m3.format(phone.getPhone()), teach.getLangauge(), day.getName(), m3.wizard(day.getShift())});                        
                            }
                        }
                    }
		}else if(tfName.getText().equals("") == false){
                    String filn = tfName.getText();
                    loadTable(filn);
                }else if(tfLang.getText().equals("") == false){
                    String fill = tfLang.getText();
                    loadTable(fill);
                } 				
	}
    });	
    
    bCancel.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            ftRnumber.setText("");
            tfLang.setText("");
            tfName.setText("");
            cleanTable();
            nonoCK();
        }
    });
    
    rbMon.addItemListener(new ItemListener() {
		
	@Override
	public void itemStateChanged(ItemEvent e) {
            if(rbMon.isSelected()){
		enableCK();
            }else{
		nonoCK();
            }			
            }
    });
    
    rbTue.addItemListener(new ItemListener() {
		
	@Override
	public void itemStateChanged(ItemEvent e) {
            if(rbTue.isSelected()){
		enableCK();
            }else{
                nonoCK();
            }
            }
    });
    
    rbWed.addItemListener(new ItemListener() {
		
	@Override
        public void itemStateChanged(ItemEvent e) {
            if(rbWed.isSelected()){
		enableCK();
		}else{
                    nonoCK();
            }			
            }
    });
    
    rbThu.addItemListener(new ItemListener() {
		
	@Override
	public void itemStateChanged(ItemEvent e) {
            if(rbThu.isSelected()){
		enableCK();
            }else{
		nonoCK();
		}			
            }
    });
    
    rbFri.addItemListener(new ItemListener() {
		
	@Override
	public void itemStateChanged(ItemEvent e) {
            if(rbFri.isSelected()){
		enableCK();
		}else{
                    nonoCK();
		}
            }
	});
    
    rbSat.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            String day = "Sabado";
            int shift = 7;
            fillTableDS(day, shift);            
        }
    });
    
    rbNope.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            cleanTable();
            nonoCK();
        }
    });
    
    ckS1.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 1;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    
    ckS2.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 2;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    
    ckS3.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 3;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    
    ckS4.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 4;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    
    ckS5.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 5;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    
    ckS6.addFocusListener(new FocusListener() {

        @Override
        public void focusGained(FocusEvent e) {
            int shift = 6;
            defineDay(shift);
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
    });
    }	
}
