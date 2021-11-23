import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;
                                 
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.11.2021
 * @720Florian 
 */

public class Inventar extends JFrame {
  // Anfang Attribute
  private JButton bZurueck = new JButton();
  private ArrayList<Item> inventar = new ArrayList<>();
  private ArrayList<JLabel> slots = new ArrayList<>();
  private ArrayList<JLabel> namem = new ArrayList<>();
  private ArrayList<JLabel> zustaende = new ArrayList<>();
  private JLabel skin_Name = new JLabel();
  private JLabel zustand_Name1 = new JLabel();
  private JLabel zustand_Name2 = new JLabel();
  private JLabel skin_Name2 = new JLabel();
  private JLabel zustand_Name3 = new JLabel();
  private JLabel skin_Name3 = new JLabel();
  private JLabel zustand_Name4 = new JLabel();
  private JLabel skin_Name4 = new JLabel();
  private JLabel zustand_Name5 = new JLabel();
  private JLabel skin_Name5 = new JLabel();
  private JLabel zustand_Name6 = new JLabel();
  private JLabel skin_Name6 = new JLabel();
  private JLabel zustand_Name7 = new JLabel();
  private JLabel skin_Name7 = new JLabel();
  private JLabel skin_Name8 = new JLabel();
  private JLabel zustand_Name8 = new JLabel();
  private JLabel skin_Name9 = new JLabel();
  private JLabel zustand_Name9 = new JLabel();
  private JLabel platz1 = new JLabel();
  private JLabel platz2 = new JLabel();
  private JLabel platz3 = new JLabel();
  private JLabel platz4 = new JLabel();
  private JLabel platz5 = new JLabel();
  private JLabel platz6 = new JLabel();
  private JLabel platz7 = new JLabel();
  private JLabel platz8 = new JLabel();
  private JLabel platz9 = new JLabel();
  // Ende Attribute
  
  public Inventar() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1755; 
    int frameHeight = 1365;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Inventar");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    inventar = OpenerFrame.getList();
    
    
    bZurueck.setBounds(24, 1112, 1699, 201);
    bZurueck.setText("Zurück");
    bZurueck.setMargin(new Insets(2, 2, 2, 2));
    bZurueck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZurueck_ActionPerformed(evt);
      }
    });
    cp.add(bZurueck);
    skin_Name.setBounds(24, 336, 254, 36);
    skin_Name.setText("");
    cp.add(skin_Name);
    zustand_Name1.setBounds(272, 336, 262, 36);
    zustand_Name1.setText("");
    cp.add(zustand_Name1);
    zustand_Name2.setBounds(896, 336, 262, 36);
    skin_Name2.setBounds(648, 336, 254, 36);
    zustand_Name2.setText("");
    cp.add(zustand_Name2);
    skin_Name2.setText("");
    cp.add(skin_Name2);
    zustand_Name3.setBounds(1448, 336, 262, 36);
    skin_Name3.setBounds(1200, 336, 254, 36);
    zustand_Name3.setText("");
    cp.add(zustand_Name3);
    skin_Name3.setText("");
    cp.add(skin_Name3);
    zustand_Name4.setBounds(272, 696, 262, 36);
    skin_Name4.setBounds(24, 696, 254, 36);
    zustand_Name4.setText("");
    cp.add(zustand_Name4);
    skin_Name4.setText("");
    cp.add(skin_Name4);
    zustand_Name5.setBounds(888, 688, 262, 36);
    skin_Name5.setBounds(640, 688, 254, 36);
    zustand_Name5.setText("");
    cp.add(zustand_Name5);
    skin_Name5.setText("");
    cp.add(skin_Name5);
    zustand_Name6.setBounds(1430, 680, 262, 36);
    skin_Name6.setBounds(1224, 680, 254, 36);
    zustand_Name6.setText("");
    cp.add(zustand_Name6);
    skin_Name6.setText("");
    cp.add(skin_Name6);
    zustand_Name7.setBounds(272, 1032, 262, 36);
    skin_Name7.setBounds(24, 1032, 254, 36);
    zustand_Name7.setText("");
    cp.add(zustand_Name7);
    skin_Name7.setText("");
    cp.add(skin_Name7);
    skin_Name8.setBounds(640, 1024, 254, 36);
    zustand_Name8.setBounds(888, 1024, 262, 36);
    skin_Name8.setText("");
    cp.add(skin_Name8);
    zustand_Name8.setText("");
    cp.add(zustand_Name8);
    skin_Name9.setBounds(1208, 1032, 254, 36);
    zustand_Name9.setBounds(1456, 1032, 262, 36);
    skin_Name9.setText("");
    cp.add(skin_Name9);
    zustand_Name9.setText("");
    cp.add(zustand_Name9);
    platz1.setBounds(32, 32, 500, 300);
    platz1.setText("");
    cp.add(platz1);
    platz2.setBounds(648, 40, 500, 300);
    platz2.setText("");
    cp.add(platz2);
    platz3.setBounds(1208, 40, 500, 300);
    platz3.setText("");
    cp.add(platz3);
    platz4.setBounds(24, 408, 500, 300);
    platz4.setText("");
    cp.add(platz4);
    platz5.setBounds(648, 384, 500, 300);
    platz5.setText("");
    cp.add(platz5);
    platz6.setBounds(1216, 376, 500, 300);
    platz6.setText("");
    cp.add(platz6);
    platz7.setBounds(16, 736, 500, 300);
    platz7.setText("");
    cp.add(platz7);
    platz8.setBounds(648, 728, 500, 300);
    platz8.setText("");
    cp.add(platz8);
    platz9.setBounds(1216, 720, 500, 300);
    platz9.setText("");
    cp.add(platz9);
    // Ende Komponenten
    fillInventar();
    setVisible(true);
    
  } // end of public Inventar
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Inventar();
  } // end of main
  
  public void bZurueck_ActionPerformed(ActionEvent evt) {
    setVisible(false);
    
    
  } // end of bZurueck_ActionPerformed
  
  public void fillInventar(){
    slots.add(platz1);
    slots.add(platz2);
    slots.add(platz3);
    slots.add(platz4);
    slots.add(platz5);
    slots.add(platz6);
    slots.add(platz7);
    slots.add(platz8);
    slots.add(platz9);
    
    namem.add(skin_Name);
    namem.add(skin_Name2);
    namem.add(skin_Name3);
    namem.add(skin_Name4);
    namem.add(skin_Name5);
    namem.add(skin_Name6);
    namem.add(skin_Name7);
    namem.add(skin_Name8);
    namem.add(skin_Name9);
    
    zustaende.add(zustand_Name1);
    zustaende.add(zustand_Name2);
    zustaende.add(zustand_Name3);
    zustaende.add(zustand_Name4);
    zustaende.add(zustand_Name5);
    zustaende.add(zustand_Name6);
    zustaende.add(zustand_Name7);
    zustaende.add(zustand_Name8);
    zustaende.add(zustand_Name9);
    
    
    
    for (int i=0;i< inventar.size() ;i++) {
      ImageIcon Icon = new ImageIcon(inventar.get(i).getBild());
      slots.get(i).setIcon(Icon);    
      namem.get(i).setText(inventar.get(i).getname());
      zustaende.get(i).setText(inventar.get(i).getZustand());
    } // end of for
    
  }
  // Ende Methoden
} // end of class Inventar
