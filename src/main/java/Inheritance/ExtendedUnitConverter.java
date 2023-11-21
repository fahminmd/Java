package Inheritance;

public class ExtendedUnitConverter extends UnitConverter {

    public ExtendedUnitConverter(int kg) {
        super(kg);
    }

    public double kiloToOunce(){
        double ounce = this.kilogram*35.274;
        return ounce;
    }
}
