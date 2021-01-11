import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) <= 0 || list.get(i) % 2 == 1) {
                list.remove(i);
                i--;
            }
        }
        Collections.sort(list);

        for(Integer l: list)
        System.out.println(l);
    }
}
