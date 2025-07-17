package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleList {

  public static void breakAList(List l) {
    l.add(0, 99);
  }

  public static void main(String[] args) {
//    List<String> names = new ArrayList<String>(List.of(0, "Albert"));
//    List<String> names = new ArrayList(List.of(0, "Albert"));
//    List<String> names = new ArrayList<>(List.of(0, "Albert"));
    List<String> names = new ArrayList<>(List.of("Ari", "Albert"));
//    names = Collections.checkedList(names, String.class);

    names.add("Inaya");
    names.add("Hua");
    names.add("Ari");
//    names.add(99);

//    breakAList(names);
//    String n0 = (String)names.get(0);
    String n0 = names.get(0);
    System.out.println(n0);
  }
}
