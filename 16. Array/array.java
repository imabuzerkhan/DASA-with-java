// 
// ? array . how to write a array 

public class array{
  public static void main(String[] args) {
    // example
// size intailize in java
int marks[] = new int[3];
marks[0] = 20 ;
marks[1] = 30;
marks[2] = 25;
// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);

// System.out.println(marks); // [I@24d46ca6 its return garbage value 

for ( int i =0; i<marks.length; i++){
System.out.println(marks[i]);
}
  }
}

