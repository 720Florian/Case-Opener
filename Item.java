public class Item {
  
  
  // Anfang Attribute
  private String name;
  private String bild;
  private double wahrscheinlichkeit;
  private String zustand;
  // Ende Attribute
  

  
  
  public Item (String name, String bild, double wahrscheinlichkeit){
    this.name = name;
    this.bild = bild;
    this.wahrscheinlichkeit = wahrscheinlichkeit;
    this.zustand = "";       
  }
  // Anfang Methoden
  
  
  
  public String getname(){
    return name;
  }
  
  public void setName(String name){
    this.name = name;
    
  }
  
  public String getBild(){
    return bild;
    
  }          
  
  public void setBild(String bild){
    this.bild = bild;
    
  }                   
  public double getWahrscheinlichkeit() {
    return wahrscheinlichkeit;
  }

  public void setWahrscheinlichkeit(double wahrscheinlichkeit) {
    wahrscheinlichkeit = wahrscheinlichkeit;
  }
  
  public String getZustand() {
    return zustand;
  }

  public void setZustand(String zustandNeu) {
    zustand = zustandNeu;
  }
  
  // Ende Methoden
  
  
}                                                          
