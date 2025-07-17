package coconfuncts;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example {
  public static void main(String[] args) {
    List<String> names = List.of("Joe", "Ari", "Toby");

    List<String> ucNames = mapper(names, s -> s.toUpperCase());
    System.out.println(ucNames);

    List<CharSequence> lcs = List.of("Joe", "Ari", "Toby");
    Function<CharSequence, Integer> getLen = c -> c.length();
    List<Number> lens = mapper(names, getLen);
    List<Number> moreLens = mapper(lcs, getLen);
    System.out.println("lens> " + lens);
    System.out.println("moreLens> " + moreLens);

  }

  public static <E, F> List<F> mapper(List<E> le, Function<? super E, ? extends F> op) {
    List<F> results = new ArrayList<>();

    for (E e : le) {
      F f = op.apply(e);
      results.add(f);
    }
    return results;
  }
}
