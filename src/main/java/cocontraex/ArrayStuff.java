package cocontraex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayStuff {

//  public static <E> E[] makeArray(List<E> le, Class<E> cl) {
  public static <E extends F, F> E[] makeArray(List<E> le, Class<F> cl) {
//    E [] rv = (E[])new Object[le.size()];
    E [] rv = (E[]) Array.newInstance(cl, le.size());
    for (int idx = 0; idx < le.size(); idx++) {
      rv[idx] = le.get(idx);
    }
    return rv;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Ayo", "Inaya", "Tony");

//    Object [] namesArray = makeArray(names, String.class);
//    namesArray[0] = new Object();
//    String [] namesArray = makeArray(names, String.class);
    CharSequence [] namesArray = makeArray(names, CharSequence.class);
    namesArray[0] = new StringBuilder("Whooot!");

    System.out.println("type of array is " + namesArray.getClass());
    System.out.println("> " + Arrays.toString(namesArray));

//    Class<Object[]> cl = (Class<Object[]>)namesArray.getClass();
    Class<?> cl = namesArray.getClass();
    System.out.println(cl);
  }
}
