import java.util.HashMap;

public class Hash1 {


    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        }
        for (String word : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(word);
            System.out.println(word + " : " + frequency);
        }

    }
}
