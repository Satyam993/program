import java.util.Scanner;
class table{
  public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
     
     System.out.println("enter a number:");
     int a= scanner.nextInt();
     
      for(int i=1;i<=10;i++){
	int mul=a*i;
        System.out.println(+a+ "*" +i+ "=" +mul);
	}
	
   

 }
}