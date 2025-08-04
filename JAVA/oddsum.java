import java.util.Scanner;
class oddsum{
  public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
     
     System.out.println("enter first range:");
     int a= scanner.nextInt();
     
     System.out.println("enter last range:");
     int n= scanner.nextInt();
     
     int total=0;	
     for(int i=a;i<=n;i++){
      if(i%2!=0){
	total=total+i;
	}
	}
	System.out.println(+total);
	
   

 }
}