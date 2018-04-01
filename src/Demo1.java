import java.util.*;

/**
 * Created by Lenovo on 2018/4/1.
 */
public class Demo1 {
    public enum Color{
        red,yellow
    }
    public static void main(String[] args) {

        Color c1=Color.red;
        System.out.println(c1);
        Collection c=new ArrayList();
        c.add("hello");
        c.add(12);
        System.out.println(c.size());
        System.out.println(c);

        Collection<String> ce=new ArrayList<String>();
        ce.add("hello");
//        ce.add(12);
        System.out.println(ce.size());
        System.out.println("ce:"+ce);

        Iterator i=c.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
            if (i.next().toString().length()<3) {
                i.remove();
            }
        }

        c.add("weqw we");
        c.add("wewd");
        c.add(34);
        for (Object o :c) {
            System.out.println(o);

        }

        Set s=new HashSet();
        s.add("we");
        s.add("we");
        System.out.println(s);

        List list=new LinkedList();
        for (int j = 0; j <6 ; j++) {
            list.add("a"+j);
        }
        System.out.println(list);
        list.add(4,"8");
        System.out.println(list.indexOf("a4"));
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,"a0"));

        Map m=new HashMap();
        m.put("1","erer");
        m.put("2",3434);
        m.put(3,"fewe");
        m.put("2","change");

        System.out.println(m.get(3));
        System.out.println(m);

        Map<Double,String> me=new HashMap<Double, String>();
        me.put(2.8,"erer");
        me.put(1.3,"3434");
        me.put(3.0,"fewe");
        me.put(5.11,"change");

        System.out.println(me.get(3));
        System.out.println(me);
    }
}

