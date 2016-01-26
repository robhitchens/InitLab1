package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/20/16.
 */
public class ColorfulThing {

    public static enum Color {RED, GREEN, BLUE, MAGENTA, YELLOW, CYAN}

    private Color color;
    public ColorfulThing(Color str){
         this.color = str;
    }
    public Color getColor(){
        return color;
    }

}
