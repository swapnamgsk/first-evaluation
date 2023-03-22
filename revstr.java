public class revstr{
public static void main(String[] args){
   String str= "swa";
   String str2="aws";
   String bag="";
  for(int i=str.length()-1;i>=0;i--){
    bag+=str.charAt(i);
    }
    if(bag==str2){
     System.out.println("true");
     }else{
     System.out.println("flase");
     }
     
      } 
    }  
