package ex1;

import java.util.ArrayList;
import java.util.List;

public class SimpleList {

  public static void main(String[] args) {
    List names = new ArrayList();

    names.add("Inaya");
    names.add("Hua");
    names.add("Ari");

    System.out.println(names.get(0));
  }
}
