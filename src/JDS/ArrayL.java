package JDS;

import java.util.ArrayList;

public class ArrayL {

    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(4);
        myNumbers.add(5);
        myNumbers.add(6);
        myNumbers.add(7);
        System.out.println(myNumbers.get(0));
        myNumbers.set(0,5);

        for(int i=myNumbers.size()-1;i>=0;i--){
            System.out.println(myNumbers.get(i));
        }

    }
}
