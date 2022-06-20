public class fracture{
  private int zNuminator;
  private int zDenominator;  
  public fracture(int pNuminator, int pDenominator){
    zNuminator = pNuminator;
    zDenominator = pDenominator;
  }
  
  public void setNuminator(int pNuminator){
    zNuminator = pNuminator;
  }
  
  public void setDenominator(int pDenominator){
    zDenominator = pDenominator;
  }
  
  public int getNuminator(){
    return zNuminator;
  }
  
  public int getDenominator(){
    return zDenominator;
  }
  
  public void expand(int pFactor){
    zNuminator = zNuminator*pFactor;
    zDenominator = zDenominator*pFactor;
  }
  
  public void shorten(int pDividor){
     if(zNuminator%pDividor == 0 && zDenominator%pDividor == 0){
      zNuminator = zNuminator/pDividor;
      zDenominator = zDenominator/pDividor;
    }
  }
  
  public double getDecimal(){
    return (double)zNuminator/(double)zDenominator;
  }
  
  public void reciprocal(){
    int lHelp = zNuminator;
    zNuminator = zDenominator;
    zDenominator = lHelp;
  }
  
  public void shorten_completly() {
    this.shorten(this.getGGT(zNuminator,zDenominator));
  }
 
  public int getGGT(int pNumber1, int pNumber2){
    int lZahl;
    if (pNumber1<pNumber2) {
      lZahl = pNumber1; 
     } else {
      lZahl = pNumber2; 
     } // end of if-else
     
     while (!(pNumber2%lZahl == 0 && pNumber1%lZahl == 0)){
      lZahl = lZahl - 1;
      }
    return lZahl;
  }
 
  public int getGGTEuklid(int pZahl1, int pZahl2){
    
    while (pZahl1*pZahl2 !=0) { 
      //System.out.println(pZahl1 +"    "+    pZahl2);
          if (pZahl1>pZahl2) {
              pZahl1 = pZahl1%pZahl2;
          } else {
             pZahl2 = pZahl2%pZahl1;
      }  
    } 
    
    return pZahl1+pZahl2;
    
   }

   public void shorten_completlyEuklid() {
    this.shorten(this.getGGTEuklid(zNuminator,zDenominator));
  }
  
  

}
