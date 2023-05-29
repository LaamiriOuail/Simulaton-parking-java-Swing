import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Window window = new Window(830, 418, "Simulation", "", true);
        Parking park =new Parking(0, 0, 830, 418, "#7e9458",window);
        Thread []thread= new  Thread[20];
        VoitureRunnable []voitures = new VoitureRunnable[20];
        int j;
        for(int i=0;i<14;i++){

            String voitureImage="";
            if(i==0 || i==4 || i==8 || i==12 || i==16){
                voitureImage="voiture4";
            } else if (i==1 || i==5 || i==9 || i==13 || i==17) {
                voitureImage="voiture0";
            }else if (i==2 || i==6 || i==10 || i==14 || i==18 ) {
                voitureImage="voiture1";
            }else{
                voitureImage="voiture0";
            }
            voitures[i]=new VoitureRunnable(park,voitureImage,i+1,20000*i,20000*(i+4));
            thread[i]=new Thread(voitures[i]);
            thread[i].start();
        }

        window.Show();

    }
}
