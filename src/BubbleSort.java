import java.util.List;

public class BubbleSort extends SortBase implements Sort {
    private List<Integer> list;
    public BubbleSort(){}
    public BubbleSort(List<Integer> list){
        this.list=list;
    }
    @Override
    public int[] sort() {
        int[] array=init(list);
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    paint(array);
                }
            }
        }
        return array;
    }
    public void paint(int[] array){

    }

}
