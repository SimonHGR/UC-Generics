package taxables;

import java.util.List;

public class TaxPreparer {
//  public static <E> void showAll(List<E> lt) {
//  public static <E extends Object> void showAll(List<E> lt) {
//  public static void showAll(List<? extends Object> lt) {
  public static void showAll(List<?> lt) {
    for (Object o : lt) {
      System.out.println("> " + o);
    }
  }

  public static void calculateTaxes(Taxable t) {
  }

//  public static void collectBobsClients(List<Individual> li) {
  public static void collectBobsClients(List<? super Individual> li) {
//    Individual i1 = li.get(0);
    li.add(new Individual());
    li.add(new Individual());
    li.add(new Retiree());
  }
//  public static void calculateBulkTaxes(List<Taxable> lt) {
//  public static <E extends Taxable> void calculateBulkTaxes(List<E> lt) {
  public static void calculateBulkTaxes(List<? extends Taxable> lt) {
//    lt.add(new Charity());
    for (Taxable t : lt) {
      calculateTaxes(t);
    }
  }

  public static void main(String[] args) {
    List<Taxable> clients = List.of(
        new Corporation(),
        new Charity(),
        new Individual(),
        new Corporation()
    );

    collectBobsClients(clients);
    calculateBulkTaxes(clients);

    List<Individual> bobsClients = List.<Individual>of(
        new Individual(),
        new Individual(),
        new Individual()/*,
        new Charity()*/

    );

    collectBobsClients(bobsClients);
    calculateBulkTaxes(bobsClients);
  }
}
