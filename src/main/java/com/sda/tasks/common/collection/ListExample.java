package com.sda.tasks.common.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExample {

  public static void main(String[] args) {

    // CRUD test
    int[] integers = {2,3,4,1,5};
    //Create or Insert "7" with Array
    System.out.println(integers.length);
//    int[] integersExtended = {2,3,4,1,5,7};
    int[] integersExtended2 = new int[integers.length+1];
    integersExtended2[5] = 7;

    // Create or Insert with ArrayList
    List<Integer> integersList = new ArrayList<>();
    integersList.add(2);
    integersList.add(3);
    integersList.add(4);
    integersList.add(1);
    integersList.add(5);
    integersList.add(7);
    // 2,3,4,1,5,7
    integersList.add(0, 9);

    //Create or Insert with Map<Key, Value>
    Map<String, Integer> integerMap = new HashMap<>();
    integerMap.put("FirstKey", 2);
    integerMap.put("SecondKey", 3);

    //Create or insert with Set
    Set<Integer> integerSet = new HashSet<>();
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(2);

    System.out.println("Number of elements in Set");
    System.out.println(integerSet.size());

    //Read from array
    System.out.println(integers[3]);
    //Read from list
    System.out.println(integersList.get(3));
    //Read from Map
    System.out.println(integerMap.get("FirstKey"));
    //Read from Set
    Object[] ints = integerSet.toArray();
    System.out.println(ints[0]);

    //Update array
    integers[2] = 17;
    //Update list
    integersList.add(2, 17);
    //Update map
    integerMap.put("SecondKey", 17);
    for(String s : integerMap.keySet()){
      System.out.println("*********");
      System.out.println(s);
    }
    //Update set
    Object[] intExtendSet = integerSet.toArray();
    intExtendSet[1] = 17;

    // Delete from array
    //{2,3,4,1,5} delete 4
//    integers[2] = 0;
    // 2,3,17,1
    System.out.println("Values currently:");
    for(int i=0; i<integers.length; i++){
      System.out.println(integers[i]);
    }

    int[] integersWithout4 = new int[integers.length-1];
    for(int i=0, j=0; i<integersWithout4.length; i++, j++){
      if(integers[i]!=17){
        integersWithout4[i] = integers[i];
      }
    }
    integers = integersWithout4;
    //2,3,1,5
    System.out.println("Values Updated:");
    for(int i=0; i<integers.length; i++){
      System.out.println(integers[i]);
    }
    // Delete from list
    integersList.remove(1);
    // Delete from Map
    integerMap.remove("FirstKey");
    // Delete from set
    integerSet.remove(2);


  }
}
