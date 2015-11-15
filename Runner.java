import java.applet.*;
import java.awt.*;

public class Runner extends Applet{
    public void paint(Graphics g){//runs other classes
        Background.Sky(g);
        Background.Stars(g);
        Background.Earth(g);
        
        Foreground.Mars(g);
        Foreground.Martian(g);
        Foreground.face(g);
        Foreground.Stupid(g);
        Foreground.Juliana(g);
    }
}