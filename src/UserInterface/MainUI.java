
package UserInterface;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MainUI extends JFrame{
    
    private Container contentPane;
    private JMenuBar mnBar;
    private JMenu mnMenu, mnRegister, mnEdit, mnDelete, mnSearch, mnExit;
    
    public MainUI(){
        startComponents();
        setEvents();
    }

    private void startComponents() {
        setTitle("Agenda Substituições");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        
        mnBar = new JMenuBar();
        mnMenu = new JMenu("Menu");
        mnRegister = new JMenu("Cadastrar");
        mnEdit = new JMenu("Editar");
        mnDelete = new JMenu("Apagar");
        mnSearch = new JMenu("Pesquisar");
        mnExit = new JMenu("Sair");
        
        mnMenu.setMnemonic('M');
        mnRegister.setMnemonic('C');
        mnEdit.setMnemonic('E');
        mnDelete.setMnemonic('A');
        mnSearch.setMnemonic('P');
        mnExit.setMnemonic('S');
        
        mnBar.add(mnRegister);
        mnBar.add(mnEdit);        
        mnBar.add(mnDelete);
        mnBar.add(mnSearch);
        mnBar.add(mnExit);

        setJMenuBar(mnBar);
        
    }    
    
    private void setEvents() {
      mnExit.addMouseListener(new MouseListener() {

          @Override
          public void mouseClicked(MouseEvent e) {
          }

          @Override
          public void mousePressed(MouseEvent e) {
              System.exit(0);
          }

          @Override
          public void mouseReleased(MouseEvent e) {
              
          }

          @Override
          public void mouseEntered(MouseEvent e) {
              
          }

          @Override
          public void mouseExited(MouseEvent e) {
              
          }
      });
        
    }
    
    public static void main(String[] args) {
        MainUI frame = new MainUI();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension window = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (window.width - frame.getSize().width) / 2;
        int y = (window.height - frame.getSize().height) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
    }

}
