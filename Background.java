import java.applet.*;
import java.util.*;
import java.awt.*;

public class Background extends Applet
{
   public void paint(Graphics g){
      Sky(g);
      Stars(g); 
      Earth(g);
   }
   
   public static void Earth(Graphics g)//draws the Earth and Moon in the background
   {
      Expo.setColor(g,Expo.blue);
      Expo.fillCircle(g,100,60,50);
      Expo.setColor(g,Expo.gray);
      Expo.fillCircle(g,175,35,15);
      Expo.setColor(g,Expo.darkGreen);
      Expo.fillPolygon(g,100,10,140,90,60,90);
      Expo.setColor(g,Expo.white);
      Expo.fillOval(g,100,60,20,10);
      Expo.setColor(g, Expo.black);
      Expo.fillCircle(g,100,60,10);
      
    }
    public static void Stars(Graphics g){//draws the stars
      Expo.setColor(g,Expo.white);
      for(int count = 1; count <= 50; count++){
        int x = Expo.random(0,1000);
        int y = Expo.random(0,400);
        Expo.fillCircle(g, x, y, 2);
    }
    }   
    public static void Sky(Graphics g){//changes the background to black
       Expo.setBackground(g, Expo.black);
    }
}
