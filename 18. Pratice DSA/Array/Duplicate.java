// Contains Duplicate
public class Duplicate {
  public static boolean DuplicateNum(int Duplicate[]){
    for(int i=0; i<Duplicate.length; i++){
    //  inner loop
    for(int j=i+1; j<Duplicate.length; j++){
      if (Duplicate[i] == Duplicate[j]){
        return true ;
      }
    }
    }
    return false;
  }
  public static void main (String args[]){
    int Duplicate[] = {1,4,1,6,5,2,3};
   System.out.println( DuplicateNum(Duplicate));
  }
}
