package Personal;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
 
class TestClass {
    public static void main(String args[]) throws Exception {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // Number of songs in the playlist
 
        if (N == 0) {
            System.out.println(0); // Empty playlist, no favorite singers
            return;
        }
 
        String[] singerArray = br.readLine().split(" ");
        Map<String, Integer> mapOfSingerCount = new HashMap<>();
        int maxCount = 0, count = 0;
 
        for (String singer : singerArray) {
            if (mapOfSingerCount.containsKey(singer)) {
                mapOfSingerCount.put(singer, mapOfSingerCount.get(singer) + 1);
            } else {
                mapOfSingerCount.put(singer, 1);
            }
        }
 
        for (int value : mapOfSingerCount.values()) {
            if (maxCount < value) {
                maxCount = value;
                count = 1;
            } else if (maxCount == value) {
                count++;
            }
        }
 
        System.out.println(count);
    }
}