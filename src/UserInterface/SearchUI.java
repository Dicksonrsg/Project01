package UserInterface;

import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
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
        /*loadTable();*/
        
        tbAva = new JTable(model);
        tbAva.setRowHeight(30);
        
        DefaultTableCellRenderer rightalignment = new DefaultTableCellRenderer();
        rightalignment.setHorizontalAlignment(SwingConstants.RIGHT);
        tbAva.getColumnModel().getColumn(2).setCellRenderer(rightalignment);
        
        
        
	ckMon = new JCheckBox("Segunda");
        ckMon.setBounds(10, 120, 80, 20);
        add(ckMon);
        
        ckTue = new JCheckBox("Terça");
        ckTue.setBounds(120, 120, 80, 20);
        add(ckTue);
        
	ckWed = new JCheckBox("Quarta");
        ckWed.setBounds(230, 120, 80, 20);
        add(ckWed);
        
	ckThu = new JCheckBox("Quinta");
        ckThu.setBounds(340, 120, 80, 20);
        add(ckThu);
        
	ckFri = new JCheckBox("Sexta");
        ckFri.setBounds(450, 120, 80, 20);
        add(ckFri);
        
	ckSat = new JCheckBox("Sabado");
        ckSat.setBounds(560, 120, 80, 20);
        add(ckSat);
        
        ckS1 = new JCheckBox("07:20 - 09:20");
        ckS1.setBounds(10, 145, 100, 20);
        add(ckS1);
        
        ckS2 = new JCheckBox("09:30 - 11:30");
        ckS2.setBounds(120, 145, 100, 20);
        add(ckS2);
        
        ckS3 = new JCheckBox("13:30 - 15:30");
        ckS3.setBounds(230, 145, 100, 20);
        add(ckS3);
        
        ckS4 = new JCheckBox("15:40 - 17:40");
        ckS4.setBounds(340, 145, 100, 20);
        add(ckS4);
        
        ckS5 = new JCheckBox("18:00 - 20:00");
        ckS5.setBounds(450, 145, 100, 20);
        add(ckS5);
        
        ckS6 = new JCheckBox("20:00 - 22:00");
        ckS6.setBounds(560, 145, 100, 20);
        add(ckS6);
        
        bSearch = new JButton("Pesquisar");
        bSearch.setBounds(400, 65, 100, 30);
        add(bSearch);
        
        bCancel = new JButton("Cancelar");
        bCancel.setBounds(510, 65, 100, 30);
        add(bCancel);
	}

    private void setEvents() {
		
		
	}	
}
