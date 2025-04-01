import java.util.HashMap;

public class Hashmap {



            public static void main(String[] args) {

                HashMap<String, String> capitalCities = new HashMap<String, String>();


                capitalCities.put("England", "London");
                capitalCities.put("Germany", "Berlin");
                capitalCities.put("Norway", "Oslo");
                capitalCities.put("USA", "Washington DC");

                System.out.println(capitalCities.get("England"));



                System.out.println(capitalCities);

                for(String key : capitalCities.keySet()) {
                    System.out.println(key + ": " + capitalCities.get(key));
                }
                for(String city : capitalCities.values()) {
                    System.out.println(city);
                }
            }







}
