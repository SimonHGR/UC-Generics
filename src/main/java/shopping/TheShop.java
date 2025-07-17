package shopping;

import javax.naming.ldap.SortKey;

public class TheShop {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Sock", "Other sock");

    String left = p.getLeft();
    System.out.println(left);

    ClothingPair<Sock> ps1 = new ClothingPair(new Sock(10, "Red"), new Sock(10, "Green"));
    System.out.println(ps1);

    ClothingPair<Sock> ps2 = new ClothingPair(new Sock(11, "Blue"), new Sock(10, "Blue"));
    System.out.println(ps2);

    System.out.println("ps1 matches? " + ps1.matches());
    System.out.println("ps2 matches? " + ps2.matches());

    System.out.println("does the proposal match? " + ClothingPair.<Sock>match(new Sock(11, "Blue"), new Sock(10, "Blue")));
  }
}
