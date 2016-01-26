package io.zipcoder;

import io.zipcoder.BoringThing;
import io.zipcoder.ColorfulThing;

/**
 * Created by roberthitchens3 on 1/20/16.
 */
public class InitializationLab1 {
    public static void main(String[] args){
        BoringThing bor1 = new BoringThing();
        BoringThing bor2 = new BoringThing();
        BoringThing bor3 = new BoringThing();
        BoringThing bor4 = new BoringThing();
        BoringThing bor5 = new BoringThing();
        ColorfulThing col1 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing col2 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing col3 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing col4 = new ColorfulThing(ColorfulThing.Color.CYAN);
        ColorfulThing col5 = new ColorfulThing(ColorfulThing.Color.YELLOW);

        System.out.println("color " + col1.getColor());
        System.out.println("color " + col2.getColor());
        System.out.println("color " + col3.getColor());
        System.out.println("color " + col4.getColor());
        System.out.println("color " + col5.getColor());
        //io.zipcoder.ColorfulThing col6  = new io.zipcoder.ColorfulThing();



    }
}
