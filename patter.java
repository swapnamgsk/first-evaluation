public class patter{
  public static void main(String[] args){
      int num=4;
      for( int i=1;i<=num;i++){
        String bag=" ";
        for(int j=1;j<=num;j++){
        if(i%3==0){
        bag+="*"+" "+" ";
        }
        else if(i%2==0|| i%2==1){
        bag+="-"+" "+"*";
        }
        }
        System.out.println(bag);
        }
      }  
   }
