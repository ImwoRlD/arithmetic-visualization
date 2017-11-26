import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainJFrame extends JFrame{
    private MyPanel jpanel;
    private int[] array=new int[50];
    public int[] getArray(){
        return this.array;
    }

    public MyPanel getJpanel() {
        return jpanel;
    }

    public void setJpanel(MyPanel jpanel) {
        this.jpanel = jpanel;
    }
    public static void main(String[] args){
        MainJFrame main=new MainJFrame();
        main.init();
    }

    public void init(){
        JPanel jPanel=new JPanel();
        JPanel view=new JPanel();
        JLabel label=new JLabel("排序方法：");
        JButton jButton=new JButton("生成数组");
        JComboBox comboBox=new JComboBox();
        comboBox.addItem("快速排序");
        comboBox.addItem("冒泡排序");
        comboBox.addItem("插入排序");
        JButton start=new JButton("Start");
        jPanel.add(label);
        jPanel.add(comboBox);
        jPanel.add(jButton);
        jPanel.add(start);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand=new Random();
                for(int i=0;i<50;i++){
                    array[i]=rand.nextInt(100)+100;
                }
            }
        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start(comboBox.getSelectedItem().toString(),array);
            }
        });
        this.setContentPane(jPanel);
        this.setVisible(true);
        this.setSize(900,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jPanel);
    }
    public void start(String method,int[] array){
        Sort sort;
        switch (method){
            case "快速排序":
                sort=new QuickSort();
                break;
            case "冒泡排序":
                sort=new BubbleSort();
                break;
            default:
                sort=new BubbleSort();
                break;
        }
        sort.panit(array);
    }
    public

}
