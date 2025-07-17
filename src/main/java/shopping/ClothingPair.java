package shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
public class ClothingPair<E extends Object & Sized & Colored> extends Pair<E> {
//  String s = "Hello";
  java.lang.String s = "Hello";

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public <F> void doStuff(E e, F f1, F f2) {}

  public boolean matches() {
    return this.getLeft().getSize() == this.getRight().getSize()
        && this.getLeft().getColor().equals(this.getRight().getColor());
  }
}
