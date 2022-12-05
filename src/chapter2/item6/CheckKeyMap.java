package chapter2.item6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckKeyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("이국준", 25);
        map.put("임희영", 24);
        map.put("서동권", 23);

        Set<String> set = map.keySet();

        set.forEach(System.out::println);

        map.remove("서동권");

        System.out.println();
        set.forEach(System.out::println);

        // keySet Method 로 만든 Set 은 새로 만들어지는 것이 아니라, 지금 가지고 있는 Map 이 만들어 둔 keySet 을 그냥 가져오는 것.
    }
}
