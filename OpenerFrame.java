import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.11.2021
 * @720Florian
 */

public class OpenerFrame extends JFrame {
  // Anfang Attribute
  private JLabel skin_Name = new JLabel();
  private JLabel zustandlabel = new JLabel();
  private JButton bOpen = new JButton();
  private JLabel bild = new JLabel();
  private JLabel lCaseOpener = new JLabel();
  private JLabel lKisteAuswaehlen = new JLabel();
  private JComboBox<String> kistenauswahl = new JComboBox<String>();
  private DefaultComboBoxModel<String> kistenauswahlModel = new DefaultComboBoxModel<String>();
  private JLabel kistenbild = new JLabel();
  private ArrayList<Item> kiste = new ArrayList<>();
  private static ArrayList<Item> inventar = new ArrayList<>();
  
  
  private JButton bInventar = new JButton();
  // Ende Attribute
  
  public OpenerFrame() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1479; 
    int frameHeight = 744;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Case Opener ");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    skin_Name.setBounds(616, 456, 310, 36);
    skin_Name.setText("");
    skin_Name.setBackground(Color.WHITE);
    skin_Name.setOpaque(true);
    skin_Name.setHorizontalAlignment(SwingConstants.CENTER);
    skin_Name.setHorizontalTextPosition(SwingConstants.CENTER);
    skin_Name.setEnabled(true);
    skin_Name.setFont(new Font("Dialog", Font.BOLD, 10));
    cp.add(skin_Name);
    cp.setBackground(Color.GRAY);
    zustandlabel.setBounds(617, 510, 310, 36);
    zustandlabel.setText("");
    zustandlabel.setBackground(Color.WHITE);
    zustandlabel.setOpaque(true);
    zustandlabel.setHorizontalTextPosition(SwingConstants.CENTER);
    zustandlabel.setHorizontalAlignment(SwingConstants.CENTER);
    zustandlabel.setFont(new Font("Dialog", Font.BOLD, 10));
    cp.add(zustandlabel);
    bOpen.setBounds(662, 571, 203, 49);
    bOpen.setText("Open");
    bOpen.setMargin(new Insets(2, 2, 2, 2));
    bOpen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bOpen_ActionPerformed(evt);
      }
    });
    bOpen.setFont(new Font("Dialog", Font.BOLD, 10));
    bOpen.setVisible(false);
    cp.add(bOpen);
    bild.setBounds(506, 134, 500, 300);
    bild.setText("");
    bild.setFont(new Font("Dialog", Font.BOLD, 10));
    cp.add(bild);
    setUndecorated(false);
    lCaseOpener.setBounds(656, 34, 182, 68);
    lCaseOpener.setText("Case Opener");
    lCaseOpener.setForeground(Color.BLUE);
    lCaseOpener.setHorizontalTextPosition(SwingConstants.CENTER);
    lCaseOpener.setHorizontalAlignment(SwingConstants.CENTER);
    lCaseOpener.setFont(new Font("@Microsoft YaHei UI", Font.BOLD + Font.ITALIC, 18));
    cp.add(lCaseOpener);
    
    
    
    lKisteAuswaehlen.setBounds(16, 56, 152, 29);
    lKisteAuswaehlen.setText("Kiste Auswählen");
    lKisteAuswaehlen.setHorizontalAlignment(SwingConstants.CENTER);
    lKisteAuswaehlen.setForeground(Color.BLUE);
    lKisteAuswaehlen.setFont(new Font("@Malgun Gothic", Font.BOLD, 10));
    cp.add(lKisteAuswaehlen);
    kistenauswahl.setModel(kistenauswahlModel);
    kistenauswahl.setBounds(16, 96, 222, 52);
    kistenauswahlModel.addElement("Bitte auswählen");
    kistenauswahlModel.addElement("Riptide Case");
    kistenauswahlModel.addElement("Snakebite Case");
    kistenauswahl.addItemListener(new ItemListener() { 
      public void itemStateChanged(ItemEvent evt) { 
        kistenauswahl_ItemStateChanged(evt);
      }
    });
    kistenauswahl.setFont(new Font("Dialog", Font.BOLD, 10));
    cp.add(kistenauswahl);
    kistenbild.setBounds(24, 160, 280, 200);
    kistenbild.setText("");
    
    cp.add(kistenbild);
    bInventar.setBounds(264, 574, 115, 49);
    bInventar.setText("Inventar");
    bInventar.setMargin(new Insets(2, 2, 2, 2));
    bInventar.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bInventar_ActionPerformed(evt);
      }
    });
    cp.add(bInventar);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public OpenerFrame     
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new OpenerFrame();
  } // end of main
  
  public void bOpen_ActionPerformed(ActionEvent evt) {
    
    if (inventar.size() <=8) {
      Item zspeicher = Algo();
      Item zs = new Item(zspeicher.getname(), zspeicher.getBild(), zspeicher.getWahrscheinlichkeit()); 
      inventar.add(zs);
      
      String zustandspeicher = rdmzustaende();
      
      skin_Name.setText(zs.getname());
      
      ImageIcon bildIcon = new ImageIcon(zs.getBild());
      bild.setIcon(bildIcon);
      zs.setZustand(zustandspeicher);
      
      zustandlabel.setText(zs.getZustand());
    }else {
      bOpen.setEnabled(false);
      JOptionPane.showMessageDialog(null, "Inventar voll","Ruf Monte an , die Sonne lacht",JOptionPane.INFORMATION_MESSAGE);
      return;
    }   
    
  } // end of bOpen_ActionPerformed
  
  
  
  
  public void kistenauswahl_ItemStateChanged(ItemEvent evt) {
    
    String auswahl = kistenauswahl.getSelectedItem().toString();
    switch (auswahl) {
      case "Riptide Case":
        kiste.clear();
        bOpen.setVisible(true);
        kistenbild.setIcon(null);
        ImageIcon bildriptideCase = new ImageIcon("images/riptideCase.png"); 
        kistenbild.setIcon(bildriptideCase);
        Kiste riptideCase = new Kiste("Riptidecase");
        kiste = riptideCase.fillRiptideCase();
        break;
      case "Snakebite Case": 
        kiste.clear();
        bOpen.setVisible(true);
        kistenbild.setIcon(null); 
        ImageIcon bildsnakebitecase = new ImageIcon("images/snakebitecase.png"); 
        kistenbild.setIcon(bildsnakebitecase);
        Kiste snakebitecase = new Kiste("Snakebite Case");
        kiste = snakebitecase.fillSnakebiteCase();
        break;  
      default: 
        bOpen.setVisible(false);
        skin_Name.setText("");
        zustandlabel.setText("");
        bild.setIcon(null);
        kistenbild.setIcon(null);
    } // end of switch
    
  } // end of kistenauswahl_ItemStateChanged
  
  public Item Algo(){
    double prozent = Math.round(100*Math.random()*100)/100;
    Item nico = new Item("404", "Error Algo", 0.0);
    double test = 0.0;
    
    for (Item item : kiste ) {
      test+= item.getWahrscheinlichkeit();
      
      
      if (prozent <= test) {
        return item;
      } // end of if
      
      
    } // end of for
    
    return nico;
  }
  public String rdmzustaende() {
    ArrayList<String> zustaende = new ArrayList<>();
    zustaende.add("Factory-New");
    zustaende.add("Minimal-Wear");
    zustaende.add("Field-Tested");
    zustaende.add("Well-Worn");
    zustaende.add("Battle-Scared");
    
    return zustaende.get((int)(Math.random() * zustaende.size()));
  }
  public void bInventar_ActionPerformed(ActionEvent evt) {
    new Inventar();
  } // end of bInventar_ActionPerformed
  
  public static ArrayList<Item> getList() {
    return inventar;
  }
  // Ende Methoden
} // end of class OpenerFrame
