import java.util.*;

public class FindDuplicate {

    ArrayList<Integer> findDuplicates(ArrayList<Integer> arr) {
        int n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicate.add(entry.getKey());
            }
        }

        Collections.sort(duplicate);
        return duplicate;
    }

    public static void main(String[] args) {
        FindDuplicate findDuplicate = new FindDuplicate();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3));

        ArrayList<Integer> answer = findDuplicate.findDuplicates(arr);
        System.out.println(answer);
    }
}
