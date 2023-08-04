package Personal;

import java.util.Map;
import java.util.TreeMap;

public class MapExample
{
    public static void main(String[] args)
    {
        Map<Integer, Object> sampleMap = new TreeMap<Integer, Object>();
        sampleMap.put(1, null);
        sampleMap.put(4, null);
        sampleMap.put(3, null);
        sampleMap.put(2, null);
        //sampleMap.put(null, null);

        System.out.println(sampleMap);
    }
}