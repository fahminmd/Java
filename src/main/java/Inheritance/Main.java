package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from Inheritance!");
        var lbs = new UnitConverter(30);
      //  lbs.setKilogram(30);
        System.out.println("converted to KG : "+lbs.kiloToPound());

        var gram = new UnitConverter(20);
     //   gram.setKilogram(20);
        System.out.println("Converted to Gram : "+gram.kiloTogram());

        var ounce = new ExtendedUnitConverter(50);
        ounce.setKilogram(50);
        System.out.println("Converted to Ounce : "+ounce.kiloToOunce());





    }
}