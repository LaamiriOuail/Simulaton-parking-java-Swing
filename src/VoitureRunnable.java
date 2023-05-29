import javax.swing.*;
import java.awt.*;

public class VoitureRunnable implements Runnable {

    private JLabel voiture;
    private int place ;
    private int tempsDepart;
    private int tempsSortie;
    public VoitureRunnable(Parking parking, String toolTip,int place,int tempDepart,int tempsSortie) {
        this.voiture = new JLabel();
        this.place=place;
        this.tempsDepart=tempDepart;
        this.tempsSortie=tempsSortie;
        this.voiture.setBounds(0,400,100,100);
        ImageIcon iconMobile1 = new ImageIcon(".\\image\\"+toolTip+".png");
        this.voiture.setIcon(new ImageIcon(iconMobile1.getImage().getScaledInstance(this.voiture.getWidth(), this.voiture.getHeight(), Image.SCALE_SMOOTH)));
        this.voiture.setToolTipText(toolTip);
        parking.add(voiture);
        parking.setComponentZOrder(voiture,0);
    }
    public int[] getTarget() {
        int []targets={};
        int place = this.place;
        if (place == 1) {
            targets= new int[]{95, 10};
        } else if (place == 8) {
            targets= new int[]{95, 280};
        } else if (place == 2) {
            targets= new int[]{194, 10};
        } else if (place == 9) {
            targets= new int[]{194, 280};
        } else if (place == 3) {
            targets= new int[]{280, 10};
        } else if (place == 10) {
            targets= new int[]{280, 280};
        } else if (place == 4) {
            targets= new int[]{375, 10};
        } else if (place == 11) {
            targets= new int[]{375, 280};
        } else if (place == 5) {
            targets= new int[]{465, 10};
        } else if (place == 12) {
            targets= new int[]{465, 280};
        } else if (place==6) {
            targets= new int[]{555, 10};
        } else if (place == 13) {
            targets= new int[]{555, 280};
        } else if (place==7) {
            targets= new int[]{645, 10};
        } else if (place == 14) {
            targets= new int[]{645, 280};
        }
        return targets;
    }
    public void toPort(){
        JLabel label = this.voiture;
        boolean inPort =false;
        while(!inPort) {
            if (label.getY() >= 140) {
                if (label.getY() > 140) {
                    label.setLocation(label.getX(), label.getY() - 1);
                    ImageIcon iconMobile = new ImageIcon(".\\image\\" + label.getToolTipText() + "haut.png");
                    label.setIcon(new ImageIcon(iconMobile.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                } else if (label.getY() == 140) {
                    ImageIcon iconMobile = new ImageIcon(".\\image\\" + label.getToolTipText() + ".png");
                    label.setIcon(new ImageIcon(iconMobile.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                    inPort=true;
                }
            }
            try {
                Thread.sleep(5); // Attends un peu avant de redéplacer la voiture
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toPlace(){
        JLabel label = this.voiture;
        boolean inPlace =false;
        int []targets=getTarget();
        int targetX=targets[0];
        int targetY=targets[1];
        while(!inPlace){
            if (label.getX() < targetX) {
                label.setLocation(label.getX() + 1, label.getY());
            }
            else if (label.getY() > targetY) {
                ImageIcon iconMobile = new ImageIcon(".\\image\\"+label.getToolTipText().substring(0,8)+"bas.png");
                label.setIcon(new ImageIcon(iconMobile.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                label.setLocation(label.getX(), label.getY() - 1);
            }else if (label.getY() < targetY) {
                ImageIcon iconMobile = new ImageIcon(".\\image\\" + label.getToolTipText().substring(0,8) + "haut.png");
                label.setIcon(new ImageIcon(iconMobile.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                label.setLocation(label.getX(), label.getY()+1);
            }else{
                inPlace=true;
            }
            try {
                Thread.sleep(5); // Attends un peu avant de redéplacer la voiture
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toSortie(){
        int targetX = 860;
        int targetY = 140;
        JLabel label=this.voiture;
        boolean sortie = false;
        while (!sortie){
            if (label.getY() < targetY) {
                label.setLocation(label.getX(), label.getY() + 1);
            } else if (label.getY() > targetY) {
                label.setLocation(label.getX(), label.getY() - 1);
            } else if (label.getX() < targetX) {
                ImageIcon iconMobile2 = new ImageIcon(".\\image\\"+label.getToolTipText()+".png");
                label.setIcon(new ImageIcon(iconMobile2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
                label.setLocation(label.getX() + 1, label.getY());
            }else{
                sortie=true;
            }
            try {
                Thread.sleep(5); // Attends un peu avant de redéplacer la voiture
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        try {
            Thread.sleep(this.tempsDepart); // Attends un peu avant de redéplacer la voiture
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toPort();
        toPlace();
        try {
            Thread.sleep(this.tempsSortie); // Attends un peu avant de redéplacer la voiture
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toSortie();
    }
}
