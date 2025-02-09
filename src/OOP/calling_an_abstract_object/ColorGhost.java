package OOP.calling_an_abstract_object;

import java.util.Random;

public class ColorGhost {
    private String color;

    public ColorGhost() {
        this.color = getRandomColor();
    }

    public String getColor() {
        return color;
    }

    private String getRandomColor() {
        String[] colors = { "red", "white", "purple", "yellow"};

        return colors[new Random().nextInt(colors.length)];
    }

    // Охуеть!!!
    /*  static String getColor() {
    return of("white", "yellow", "purple", "red").get(new Random().nextInt(4));
  }*/
}
