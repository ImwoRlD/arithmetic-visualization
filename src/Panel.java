import javax.swing.*;

public class Panel extends Thread{
    public int[] array={190,180,170,160,150,140,130,120};
    MyPanel myPanel=new MyPanel();
//    public static void main(String[] args){
//        Panel p=new Panel();
//        p.start();
//    }

    @Override
    public void run() {
        JFrame p=new JFrame();
        p.setVisible(true);
        p.setSize(900,500);
        p.setResizable(false);
        p.add(myPanel);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                for (int k=0;k<array.length;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
                myPanel.repaint();
                myPanel.setArray(array);
                try{
                    Thread.sleep(400);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Finished");
    }
}
