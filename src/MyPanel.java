import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
    private int[] array;
    public MyPanel(){
        this.setBackground(Color.white);
    }
    public void setArray(int[] array){
        this.array=array;
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        repaint();
        graphics.setColor(Color.BLACK);
        for(int i=0;i<array.length;i++){
            graphics.fillRect(10+i*40,500-array[i],10,array[i]);
        }
    }
}
