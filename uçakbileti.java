import java.util.Scanner;
public class uçakbileti 
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        label:
        System.out.println("km girin");
        int km=input.nextInt();
        System.out.println("yaşinizi girin");
        int yas=input.nextInt();
        System.out.println("yolculuk tipinizi giriniz 1: tek yön \n 2: gidiş dönüş");
        int tip=input.nextInt();
        double indirim;
        if(tip ==1 || tip ==2)
        {
            System.out.println("seciminiz yapılmıstır");
        }
        else
        {
            System.out.println("Hatali Veri Girdiniz !");
            
        }
        if(km<0 || yas<0)
        {
            System.out.println("Hatali Veri Girdiniz !");
        }
        double islem=km*0.10;
        if(yas<12)
        {
        indirim=islem*0.5;
        islem=islem-indirim;
        }
        else if (yas>12 && yas<24)
        { 
            indirim=islem*0.10;
            islem=islem-indirim;
        }
        else
        {
            indirim=islem*0.30;
            islem=islem-indirim;
        }
        if(tip==2)
        {
        islem=islem-islem*0.20;
        }
    System.out.println("toplam indirim:"+indirim);
    System.out.println("toplam tuTAR="+islem);
    }


}
    

