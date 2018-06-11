
import com.sun.javafx.tools.packager.CreateBSSParams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //ArrayList arrayList = new ArrayList();
        //arrayList.add("hua");
        //arrayList.add("afa");
        //arrayList.add(343);
        //arrayList.add(2,"15");
        //System.out.println(arrayList.get(0));
        //System.out.println(arrayList.get(2));

        //ArrayList arrayList1 = new ArrayList();
        //arrayList1.addAll(arrayList);
        //System.out.println(arrayList1.get(1));
        //System.out.println(arrayList1.get(3));
        //arrayList.remove(3);
        //for (int i=0;i<arrayList.size();i++){
         //   System.out.println(arrayList.get(i));
        //}

        //LinkedList linkedList = new LinkedList();
        //linkedList.addFirst(100);

        //练习  去除ArrayList集合中的重复元素（使用两种方法）
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("tom");
        arrayList.add("peter");
        arrayList.add("lihua");
        arrayList.add("tom");
        arrayList.add("micheal");

        //ArrayList<String> arrayList1 = new ArrayList<String>();

        //for (String s : arrayList){
        //    if (arrayList1.contains(s) == false)
        //        arrayList1.add(s);
        //}
        //for (String s : arrayList1){
        //    System.out.println(s);
        //}

        HashSet hash = new HashSet();
        for (Object hashSet : arrayList){
            hash.add(hashSet);
        }
        System.out.println(hash);
    }
}
