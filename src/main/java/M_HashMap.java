import java.util.HashMap;
import java.util.Map;

/**
 * Created by BFD-308 on 2016/10/24.
 */
public class M_HashMap {
    public static void main(String[] arg) {
    }

    public static void Travel1() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public static void Travel2() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //遍历map中的键
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }
        //遍历map中的值
        for (Integer value : map.values()) {
            System.out.println("Value = " + value);
        }
    }

    public static void Travel3() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer key : map.keySet()) {
            // 从键取值是耗时的
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
