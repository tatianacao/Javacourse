package datastructure;

import datatypes.nonprimitive.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first name", "john");
        map.put("last name", "snow");
        map.put("phone number", "917");
        map.put("state", "California");
        //^ this is the method you want to use to put in the string key and string value
        //you need to put the data type of the key & data type of the value
        System.out.println(map.get("last name"));
        //and just in case you need to grab the value
        System.out.println(map);
        //^^ this prints the whole thing, key and its value (this is not usually done)
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());

            //convert map to entry set and you can access the key AND value both
        }
        map.entrySet();
        //you can convert it to entry set, you can not have access to the key
        //if the map is the whole thing,
        List<String> statesOfUSA = new ArrayList<>();
        statesOfUSA.add("NY");
        statesOfUSA.add("NJ");
        statesOfUSA.add("PA");

        List<String> citiesofCanada = new ArrayList<>();
        citiesofCanada.add ("TO");
        citiesofCanada.add ("MO");
        citiesofCanada.add ("OT");

        List<String> citiesofAustralia = new ArrayList<>();
        citiesofAustralia.add("SY");
        citiesofAustralia.add("ME");
        citiesofAustralia.add("PE");
//create map object vv
        Map<String, List<String>> myMap = new HashMap<>();
        myMap.put("USA",statesOfUSA);
        myMap.put("canada", citiesofCanada);
        myMap.put("Australia", citiesofAustralia);

        System.out.println(myMap.get("USA"));
        for (Map.Entry<String, List<String>> entry: myMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}


