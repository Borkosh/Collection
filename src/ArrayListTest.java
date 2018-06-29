import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * Created by Ilgiz on 29.06.2018.
 */
public class ArrayListTest{
    public ArrayListTest() {
        createList();
        showList();
        sortList();
        showList();
    }

    List<Integer> list = new ArrayList();

    public void createList(){
        for (int i = 0; i < 50; i++) {
            int number =i;
            list.add(number);
        }
    }

    public void showList(){
        System.out.println(list);
    }

    public  void sortList(){
        Collections.reverse(list);
    }
}
