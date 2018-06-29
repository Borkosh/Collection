import java.util.*;


/**
 * Created by Ilgiz on 29.06.2018.
 */
public class HashMapTest {
    public HashMapTest() {
        createMap();
        showMap(hashTest);
        checkKeyHashMapArr(5);
        checkValueHashMapArr(15);
    }

    Map<Integer,Integer> hashTest = new HashMap();

    //For
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

    //Поменять местами наибольший и наименьший элементы массива
    public void replacePlaceMinMax(){
        int maxKey = Collections.max(hashTest.entrySet(), Map.Entry.comparingByValue()).getKey();
        int minKey = Collections.min(hashTest.entrySet(), Map.Entry.comparingByValue()).getKey();

        int maxValue=hashTest.get(maxKey);
        int minValue=hashTest.get(minKey);

        hashTest.put(minKey,maxValue);
        hashTest.put(maxKey, minValue);
    }

    //Выведите список всех значений
    public void showAllValue(){
        for(Map.Entry<Integer,Integer> item: hashTest.entrySet()){
            System.out.println("Value = "+item.getValue());
        }
    }

    //Выведите список всех ключей
    public void showAllKey(){
        for(Map.Entry<Integer,Integer> item: hashTest.entrySet()){
            System.out.println("Key = "+item.getKey());
        }

    }

    //Скопируйте массив хэшмэп в другой массив
    public void copyHashMapArr(){
        hashTestDoundle.clear();
        hashTestDoundle.putAll(hashTest);

    }
    //Проверьте есть ли определенный ключ в хэшмэпе
    public void checkKeyHashMapArr(int key){
        if (hashTest.containsKey(key)){
            System.out.println("Array have this key");
        }else{
            System.out.println("Array not have this key");
        }

    }

    //Проверьте есть ли определенное значение в хэшмэпе
    public void checkValueHashMapArr(int value){
        if (hashTest.containsValue(value)){
            System.out.println("Array have this value");
        }else{
            System.out.println("Array not have this value");
        }

    }





}
