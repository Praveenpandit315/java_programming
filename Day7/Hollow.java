public class Hallow{
  public static void main(String[] args){
    int i, j, space, stars,n;
      n=5;
      space = n -1;
      stars =n;
      for(i=1; i<=n;i++){
        for (j =1; j <= stars; j++){
          if(i == 1 || i == n || j == 1 || j == stars ){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        //   stars ++;
        //   space --;

        }
        System.out.println();
      }
    }
}
