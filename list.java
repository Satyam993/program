import java.util.Scanner;
import java.util.ArrayList;
class list{
  public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
     ArrayList<String> L = new ArrayList<>();

     System.out.println("enter size of list:");
     int a= scanner.nextInt();
     
     for(int i=1;i<=a;i++){
      System.out.println("enter element of list:");
      L.add(scanner.next());
     }
     
	System.out.println("list is :"+L);
     
     for(int j=0;j<a;j++){
        System.out.println("element is=" +L.get(j));
   
   }
 }
}