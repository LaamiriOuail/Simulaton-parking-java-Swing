import javax.swing.*;
import java.awt.*;

public class Parking extends Frame {
    public Parking(int left,int top,int width,int height,String backgroundColor,Window parent){
        super(left,top,width,height,backgroundColor);
        createPark();
        parent.add(this);
    }
    public void createPark(){
        int left = 100;
        for(int i=1;i<9;i++){
            if(i==1 || i==8){
                this.newButton(left,0,10,150,"","","",false,"","#ECEC05",0,"",false,false);
                this.newButton(left,230,10,150,"","","",false,"","#ECEC05",0,"",false,false);
            }else{
                this.newButton(left,0,10,100,"","","",false,"","#ECEC05",0,"",false,false);
                this.newButton(left,280,10,100,"","","",false,"","#ECEC05",0,"",false,false);
            }
            if(i!=8){
                this.newLabel(left+50,20,40,40,Integer.toString(i),"","",true, "#ffd400","",18,"",true,true);
                this.newLabel(left+50,280,40,40,Integer.toString(i+7),"","",true, "#ffd400","",18,"",true,true);
            }
            //frame.newButton(left+10,0,80,380,"","","",false,"","#959580",0,"",false,false);
            left+=90;
        }
        this.newButton(100,150,640,80,"","","",false,"","#181515",0,"",false,false);
        left = 120;
        for(int i=0;i<9;i++){
            this.setComponentZOrder(this.newButton(left,185,30,10,"","","",false,"","#FEFFFB",0,"",false,false),0);
            left+=70;
        }
        this.newButton(0,0,100,this.getHeight(),"","","",false,"","#181515",0,"",false,false);
        int top = 50;
        for(int i=0;i<9;i++){
            this.setComponentZOrder(this.newButton(45,top,10,30,"","","",false,"","#FEFFFB",0,"",false,false),0);
            top+=70;
        }
    }
}
