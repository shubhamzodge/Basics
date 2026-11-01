package General;

import java.util.ArrayList;

public class FirstLastElement {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        if(list.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        int first = list.get(0);
        int last = list.get(list.size()-1);
        System.out.println("First element: "+first);
        System.out.println("last element: "+last);
        //list.getFirst() & list.getLast() also be work
    }
}
