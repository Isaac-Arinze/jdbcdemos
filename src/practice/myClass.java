package practice;
import java.awt.*;

public class myClass extends java.applet.Applet{



    Font f = new Font("TimesRoman",Font.BOLD, 18);
    String name;
    public void init(){
            this.name=getParameter("name");
            if (this.name == null)
                this.name="Skytech";

            this.name = "Hello " + this.name + "! ";
    }

    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Hello Again", 5, 50);
    }
}
