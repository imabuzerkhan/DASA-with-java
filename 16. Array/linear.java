public class linear {

public static int LinearSearch(int Numbers[], int key){
for(int i=0; i<Numbers.length; i++){

  if(Numbers[i]==key){
return i ;
  }
}


  return -1;
}


  public static void main (String args[]){
    int Numbers[] = {2,3,4,5,6,7,8,9,10,12,13,16,17,18,29,34,36,47,34};
    int key = 10;

int index = LinearSearch(Numbers, key);
if(index == -1){
  System.out.println(" Sorry number not found");
}else{
  System.out.println("The Index of key is " + index);
}

  }
}