package sorting.problems;

import java.util.*;

public class GroupAnagrams {

    public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public int compare(String s1, String s2) {
        return sortChars(s1).compareTo(sortChars(s2));
    }

    static void sort(String[] arr) {
        HashMap<String, List<String>> mapList = new HashMap<String, List<String>>();

        for (String str : arr) {
            String key = sortChars(str);
            if (!mapList.containsKey(key)) {
                List<String> objList = new ArrayList<String>();
                mapList.put(key, objList);
            }
            List<String> val = mapList.get(key);
            mapList.get(key).add(str);
        }

        /* Convert hash table to array */
        int index = 0;
        for (String key : mapList.keySet()) {
            List<String> tempList = mapList.get(key);
            for (String str : tempList) {
                arr[index] = str;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        String[] strArr = new String[] {"add", "slabl", "dad", "balls", "dda"};
        sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }

}
