package Inheritance;

public class UnitConverter {
    protected int kilogram;

    public void setKilogram(int kilogram) {

    }


  public UnitConverter(int kg) {
    this.kilogram = kg;
   }

    public int kiloToPound() {
        int pound = (int) (kilogram*2.20462);
        return pound;
    }
    public int kiloTogram() {
        int gram = (int) (kilogram*1000);
        return gram;
    }


}
