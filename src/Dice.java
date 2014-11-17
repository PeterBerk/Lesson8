import java.net.URL;
import javax.swing.ImageIcon;

public class Dice {
    private int number;
    private ImageIcon picture;
    public Dice(){
        // Internal initialization is almost identical to an external call, so we'll just do that.
        roll();
    }
    public int roll(){
        number = (int)(Math.random()*6)+1;
        URL file = getClass().getResource("d" + number + ".JPG");
        picture = new ImageIcon(file);
        return number;
    }
    public int readRoll(){
        return number;
    }
    public ImageIcon getPicture(){
        return picture;
    }

}

