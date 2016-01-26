package io.zipcoder.tests; /**
 * Created by roberthitchens3 on 1/20/16.
 */
import io.zipcoder.ColorfulThing;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColorfulThingTest {
    @Test
    public void getColorTest(){
        ColorfulThing color = new ColorfulThing(ColorfulThing.Color.BLUE);
        assertEquals("Should return correct color: ", ColorfulThing.Color.BLUE, color.getColor());
    }
}
