package arraylist;

import java.util.*;


public class Temporal {
    public static void main(String[] args) {
List<String> list1 = new ArrayList<String>();
		 list1.add("Peter");
		 list1.add("Edward");
		 list1.add("Tommy");
		 list1.add("Bill");
		 list1.add("Richard");
//		 list1.add("TOM");
        System.out.println(list1.size());
for (int i = 1; i <list1.size(); i++)
{
     list1.remove(i);
}
        System.out.println(list1);
    }
}
