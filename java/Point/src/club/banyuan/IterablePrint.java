package club.banyuan;

import java.util.Iterator;

public class IterablePrint {
    public static <T extends Iterable> void Print(T t){
        Iterator iterator = t.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+",");

        }

    }
}
