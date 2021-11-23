import java.util.ArrayList;

public class Kiste{
  
  // Anfang Attribute
  private String name;
  private ArrayList<Item> itemList = new ArrayList<>();
  // Ende Attribute
                      
  public Kiste(String name){
    this.name = name;
  }
  
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    name = name;
  }
  
  public ArrayList fillRiptideCase(){
    Item glock18 = new Item("Glock-18 | Snack Attack", "images/Riptide_case/glock-18_snack-attak.jpg", 3.0); 
    Item ak47 = new Item("AK-47 | Leet Museo", "images/Riptide_case/ak47_leetmueso.jpg", 1.0);
    Item desertEagle = new Item("Desert Eagle | Ocean Drive","images/Riptide_case/dessert-eagle_ocean-drive.jpg", 1.0);
    Item sSG08 = new Item("SSG 08 | Turbo Peek","images/Riptide_case/ssg08_turbopeek.jpg", 3.0);
    Item mac10 = new Item("MAC-10 | Toybox","images/Riptide_case/mac-10_toybox.jpg", 3.0);
    Item m4a4 = new Item("M4A4 | Spider Lily","images/Riptide_case/m4a4_spiderl-illy.jpg", 4.0);
    Item famas = new Item("FAMAS | ZX Spectron","images/Riptide_case/famas_zx-spectron.jpg", 4.0);
    Item mp9 = new Item("MP9 | Mount Fuji","images/Riptide_case/mp9_mount-fuji.jpg", 4.0);
    Item fiveseven = new Item("Five-SeveN | Boost Protocol","images/Riptide_case/five-seven_boost-protokol.jpg", 4.0);
    Item mag7 = new Item("MAG-7 | BI83 Spectrum","images/Riptide_case/mag-7_bi83-spectrum.jpg", 4.0);
    Item usps = new Item("USP-S | Black Lotus","images/Riptide_case/usp-s_black-lotus.jpg", 8.0);
    Item xm1014 = new Item("XM1014 | Watchdog","images/Riptide_case/xm1014_watchdog.jpg", 9.0);
    Item dualberettas = new Item("Dual Berettas | Tread","images/Riptide_case/daul-berettas_tread.jpg", 9.0);
    Item aug = new Item("AUG | Plague","images/Riptide_case/aug_plague.jpg", 16.0);
    Item mp7 = new Item("MP7 | Guerrilla","images/Riptide_case/mp7_guerilla.jpg", 9.0);
    Item ppbizon = new Item("PP-Bizon | Lumen","images/Riptide_case/pp-bizon_lumen.jpg", 9.0);
    Item g3sg1 = new Item("G3SG1 | Keeping Tabs","images/Riptide_case/g3sg1_keeping-tabs.jpg", 9.0);
    
                                                                    
    itemList.add(glock18); 
    itemList.add(ak47);
    itemList.add(desertEagle);
    itemList.add(sSG08);
    itemList.add(mac10);
    itemList.add(m4a4);
    itemList.add(famas);
    itemList.add(mp9);
    itemList.add(fiveseven);
    itemList.add(mag7);
    itemList.add(usps);
    itemList.add(xm1014);
    itemList.add(dualberettas);
    itemList.add(aug);
    itemList.add(mp7);
    itemList.add(ppbizon);
    itemList.add(g3sg1);
    
    return itemList;
  }
  
  public ArrayList fillSnakebiteCase(){
    Item usps = new Item("USP-S | The Traitor", "images/SmartSelect_20211117-075819_Samsung Internet.jpg", 50.0); 
    Item m4a4 = new Item("M4A4 | In Living Color", "images/SmartSelect_20211117-080657_Samsung Internet.jpg", 50.0);
    
    itemList.add(usps);
    itemList.add(m4a4);
    return itemList;
  
}
  }

