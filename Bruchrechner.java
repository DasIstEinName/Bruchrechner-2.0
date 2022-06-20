public class Bruchrechner {
  
  // Anfang Attribute
  private fracture kenntBruch1;
  private fracture kenntBruch2;
  // Ende Attribute
  
  public Bruchrechner() {
    
  }
  // Anfang Methoden

  public fracture getSumme() {
    fracture lBruch = new fracture(1,1);
    kenntBruch1.expand(this.getKGV()/kenntBruch1.getDenominator());
    kenntBruch2.expand(this.getKGV()/kenntBruch2.getDenominator());
    lBruch.setNuminator(kenntBruch1.getNuminator()+kenntBruch2.getNuminator());
    lBruch.setDenominator(this.getKGV());
    lBruch.shorten_completlyEuklid();
    return lBruch;
  }

  public fracture getDifferenz() {
    fracture lBruch = new fracture(1,1);
    kenntBruch1.expand(this.getKGV()/kenntBruch1.getDenominator());
    kenntBruch2.expand(this.getKGV()/kenntBruch2.getDenominator());
    lBruch.setNuminator(kenntBruch1.getNuminator()-kenntBruch2.getNuminator());
    lBruch.setDenominator(this.getKGV());
    lBruch.shorten_completlyEuklid();
    return lBruch;
  }

  public fracture getProdukt() {
    fracture lBruch = new fracture(1,1);
    lBruch.setNuminator(kenntBruch1.getNuminator()*kenntBruch2.getNuminator());
    lBruch.setDenominator(kenntBruch2.getDenominator()*kenntBruch2.getDenominator());
    lBruch.shorten_completlyEuklid();
    return lBruch;
  }

  public fracture getQuotient() {
    fracture lBruch = new fracture(1,1);
    kenntBruch2.reciprocal();
    lBruch.setNuminator(kenntBruch1.getNuminator()*kenntBruch2.getNuminator());
    lBruch.setDenominator(kenntBruch1.getDenominator()*kenntBruch2.getDenominator());
    kenntBruch2.reciprocal();
    lBruch.shorten_completlyEuklid();
    return lBruch;
  }

  public void lerneBruch1kennen(fracture pBruch) {
    kenntBruch1 = pBruch;
  }

  public void lerneBruch2kennen(fracture pBruch) {
    kenntBruch2 = pBruch;
  }
  
  private int getKGV(){
    int lHelp = 1;
    while (!(lHelp%kenntBruch1.getDenominator() == 0 && lHelp%kenntBruch2.getDenominator() == 0)) { 
      lHelp = lHelp + 1;
    }  
    return lHelp;
  }
  
  
  

  // Ende Methoden
} // end of Bruchrechner

