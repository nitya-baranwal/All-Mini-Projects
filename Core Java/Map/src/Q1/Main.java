package Q1;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static <k> void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("India", "New Delhi");
        hm.put("UP", "Lucknow");
        hm.put("TN", "Chennai");
        hm.put("Goa", "Panaji");
        hm.put("MH", "Mumbai");


//        to print all the keys and values using hm.get(key)

        Set<String> k = hm.keySet();

        for(String key : k) {
            System.out.println(key + "-k-" + hm.get(key));
        }
        System.out.println(k); //[Goa, TN, UP, MH, India]



//        to print all the values

        Collection<String> v = hm.values();

        for(String val : v) {
            System.out.println(val);
        }
        System.out.println(v); //[Panaji, Chennai, Lucknow, Mumbai, New Delhi]



        //to print all the key-value pairs

        Set<Map.Entry<String,String>> keyValue= hm.entrySet();

        for(Map.Entry<String,String> me: keyValue){
            System.out.println(me.getKey()+"-->"+me.getValue());
        }

        System.out.println(keyValue); //[Goa=Panaji, TN=Chennai, UP=Lucknow, MH=Mumbai, India=New Delhi]
    }
}
