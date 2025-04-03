import java.util.HashMap;

public class Hash2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 4;
        a[1] = 10;
        a[2] = 8;
        a[3] = 9;
        a[4] = 8;

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i :a){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        System.out.println(hm);

        for(var j : hm.entrySet()){
            if(j.getValue()>1){
                System.out.println(j.getKey());
            }

        }

    }
}
