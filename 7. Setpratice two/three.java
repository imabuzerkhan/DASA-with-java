public class three {
  public static void main(String[] args){
    int x, y, z;
    x = y = z = 2;
    x += y; // 4
    y -= z; //0
    z /= (x + y); //0 z becomes 2 / 4 = 0 (integer division, so the result is truncated to 0).

    System.out.println(x + " " + y + " " + z);
    }
    }

