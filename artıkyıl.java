import java.util.Scanner;
public class artıkyıl {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yılı girin");
        int yil=input.nextInt();
        if(yil%400==0){
            
            System.out.println(yil+":bir artık yildir");
        }
        else{
            System.out.println(yil+":bir artık yil degildir");
        }
    }
    
}
