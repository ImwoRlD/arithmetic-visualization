import java.util.List;

public class SortBase {
    public int[] init(List<Integer> list){
        int[] array=new int[list.size()];
        for (int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        return array;
    }
}
