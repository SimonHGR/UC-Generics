package patternmatch;

import java.util.List;

public class UseInstanceof {
  public static void main(String[] args) {
    Object stuff = List.of("Hello");

//    if (stuff instanceof List<String>) {
    if (stuff instanceof List) {
      System.out.println("it's a list");
    }

    if (stuff instanceof List l) {
//    if (stuff instanceof List<String> l) {
      String s = (String)l.get(0); // if you're lucky!!!
    }

    Iterable<String> is = List.of("Fred");
    if (is instanceof List<String> ls) {
      String s = ls.get(0);
      System.out.println(s);
    }
  }
}
