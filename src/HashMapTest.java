import java.util.*;


/**
 * Created by Ilgiz on 29.06.2018.
 */
public class HashMapTest {
    public HashMapTest() {
        createMap();
        showMap(hashTest);
        replacePlaceMinMax();
        showMap(hashTest);
        showAllKey();
        showAllValue();
        copyHashMapArr();
        showMap(hashTestDoundle);
    }

    Map<Integer,Integer> hashTest = new HashMap();
    Map<Integer,Integer> hashTestDoundle = new HashMap();

    public void createMap(){
        for (int i = 0; i < 20; i++) {
            int number =i;
            hashTest.put(i,number*3);
        }
    }

    public void showMap(Map maparr){
        System.out.println(maparr);
    }

    public void replacePlaceMinMax(){
        int maxKey = Collections.max(hashTest.entrySet(), Map.Entry.comparingByValue()).getKey();
        int minKey = Collections.min(hashTest.entrySet(), Map.Entry.comparingByValue()).getKey();

        int maxValue=hashTest.get(maxKey);
        int minValue=hashTest.get(minKey);

        hashTest.put(minKey,maxValue);
        hashTest.put(maxKey, minValue);
    }

    public void showAllValue(){
        for(Map.Entry<Integer,Integer> item: hashTest.entrySet()){
            System.out.println("Value = "+item.getValue());
        }
    }

    public void showAllKey(){
        for(Map.Entry<Integer,Integer> item: hashTest.entrySet()){
            System.out.println("Key = "+item.getKey());
        }

    }

    public void copyHashMapArr(){
        hashTestDoundle.clear();
        hashTestDoundle.putAll(hashTest);
    }



}
