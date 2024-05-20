public class forthree {
  public static void main(String[] args) {
    int number = 123456;
    while (number>0) {
      int lst = number % 10;
      System.out.print( lst);
      number /= 10;
    }
    System.out.println();
  }
}
