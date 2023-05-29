import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Window extends JFrame {
    Window(int width,int height,String title,String icon,boolean fixed){
        this.setTitle(title);
        //set Icon to
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            this.setIconImage(iconImage.getImage());
        }
        this.setSize(width,height);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        if(fixed){
            this.setResizable(false);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Frame newFrame(int left,int top,int width,int height,String backgroundColor){
        Frame frame = new Frame(left,top,width,height,backgroundColor);
        this.add(frame);
        return frame;
    }
    public void Show(){
        this.setVisible(true);
    }
    public void close(){
        this.setVisible(false);
    }

    public static void main(String[] args) {

    }
}
