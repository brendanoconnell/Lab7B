import java.applet.*;
import java.awt.*;

public class Foreground extends Applet{
    public void paint(Graphics g){
        Mars(g);
        Martian(g);
        face(g);
        Stupid(g);
        Juliana(g);
    }
    
    public static void Mars(Graphics g){//draws the surface of Mars
        Expo.setColor(g,255,120,72);
        Expo.fillArc(g,500,700,1000,200,270,90);
    }
    
    public static void Martian(Graphics g){//draws Martian's body
        Expo.setColor(g, Expo.green);
        Expo.drawLine(g,500,420,500,520);
        Expo.drawLine(g,500,520,480,600);
        Expo.drawLine(g,500,520,520,600);
        Expo.drawLine(g,500,450,480,520);
        Expo.drawLine(g,500,450,520,520);
        Expo.drawLine(g,485,385,470,360);
        Expo.drawLine(g,515,385,530,360);
       
    }
    
    public static void face(Graphics g){//draws Martian's face
        Expo.setColor(g,255,250,177);
        Expo.fillCircle(g,500,400,30);
        Expo.setColor(g,Expo.white);
        Expo.fillOval(g,485,395,8,5);
        Expo.fillOval(g,515,395,8,5);
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,485,395,1);
        Expo.fillCircle(g,515,395,1);
        Expo.drawCircle(g,485,395,10);
        Expo.drawCircle(g,515,395,10);
        Expo.drawLine(g,495,395,505,395);
        Expo.drawLine(g,475,395,470,400);
        Expo.drawLine(g,525,395,530,400);
        Expo.fillOval(g,500,414,10,5);
    }
    
    public static void Stupid(Graphics g){//draws the dumb things Martian says
        Expo.setColor(g,Expo.white);
        Expo.fillCircle(g,540,400,5);
        Expo.fillCircle(g,545,370,5);
        Expo.fillCircle(g,543,340,5);
        Expo.fillOval(g,540,275,100,50);
        Expo.setColor(g,Expo.black);
        Expo.setFont(g,"Comic Sans",Font.PLAIN,16);
        Expo.drawString(g,"What do you mean I",460,260);
        Expo.drawString(g,"have to do the",480,280);
        Expo.drawString(g,"the 100 point version?",460,300);
    }
    
    public static void Juliana(Graphics g){
        //Juliana asked to please be in my project so she will be represented 
        //as a random dot rapidly changing colors
        for(int count = 1; count <= 200000; count++){
            Expo.setRandomColor(g);
            Expo.fillCircle(g,700,600,5);
           
        }
        Expo.setColor(g,Expo.white);
        Expo.fillOval(g,540,275,100,50);
        Expo.setColor(g,Expo.black);
        Expo.setFont(g,"Comic Sans",Font.PLAIN,36);
        Expo.drawString(g,"Wow",480,280);
    }
}
