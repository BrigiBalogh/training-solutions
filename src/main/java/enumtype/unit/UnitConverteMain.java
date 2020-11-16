package enumtype.unit;

import java.math.BigDecimal;
import java.util.Arrays;

public class UnitConverteMain {

    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();

        System.out.println(unitConverter.convert(new BigDecimal(1000),LengthUnit.CENTIMETER,LengthUnit.METER ));
        System.out.println(unitConverter.convert(new BigDecimal(10),LengthUnit.CENTIMETER,LengthUnit.MILLIMETER ));
        System.out.println(unitConverter.convert(new BigDecimal(100),LengthUnit.CENTIMETER,LengthUnit.METER ));
        System.out.println(unitConverter.convert(new BigDecimal(1),LengthUnit.FOOT,LengthUnit.CENTIMETER ));
        System.out.println(unitConverter.convert(new BigDecimal(10),LengthUnit.INCH,LengthUnit.MILLIMETER));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(unitConverter.siUnits() );
    }
}
