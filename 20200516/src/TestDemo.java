import java.util.*;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/16
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
    }



    public static void main4(String[] args) {
        Integer a = 10;//自动装箱

        int b = a;//自动拆箱
    }



    public static void main3(String[] args) {
        int i = 10;
        //装箱操作 新建一个Integer类型对象 将i的值放入对象的某个属性中
        Integer ii = Integer.valueOf(i);
        Integer ij = new Integer(i);


        //拆箱操作 将Integer对象中的值取出 放到一个基本的数据类型中
        int j = ii.intValue();
        double d = ii.doubleValue();
    }


    public static void main2(String[] args) {
        //哈希表在打印数据时 打印的顺序不一定是存储顺序
        Map<String ,String>map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("及时雨","宋江");

        System.out.println(map);
        String s = map.getOrDefault("及时雨1","lxy");
        System.out.println(s);

        System.out.println(map.containsKey("及时雨"));
        System.out.println(map.containsValue("宋江"));

        System.out.println("============");
        Set<Map.Entry<String,String >> set = map.entrySet();
        for (Map.Entry<String,String >entry : set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }



    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("bit");
        collection.add("java");
        collection.add("lxy");
        collection.add("ysm");
        collection.add("zy");

        System.out.println(collection);
//        collection.clear();
//        System.out.println(collection);

        System.out.println("==============");

        for (String s : collection) {
            System.out.println(s);
        }

        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);

        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
