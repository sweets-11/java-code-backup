public class Objects_classes{
    public static void main(String[] args) {
        // pen ka actual object banane k lie sabse pehele hum class ka name likhte he Pen then pen ka name p1 = new iss se hum memory me space bana re h jaha Pen ki saari properties store hogi Pen() and this is called constructor
        Pen p1 = new Pen();
        p1.setColor("Blue"); // use . operator to class function
        System.out.println(p1.color);
        

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "red"; // change the val. of color
        System.out.println("updated color " + p1.color);
    }
}


// blueprint

class Pen{
    String color;
    int tip;

    // functions

    void setColor(String newColor) {
        color = newColor;
    }


    void setTip(int newTip) {
        tip = newTip;
    }
}