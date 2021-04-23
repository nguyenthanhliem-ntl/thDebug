import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhap a: " );
        int so1 = a.nextInt();
        System.out.println("nhap b: ");
        int so2 = a.nextInt();

        if(so1 == 0 ) {
            System.out.println("pt vo nghiem ");
        }else if(so1!=0) {
                if(so2 ==0) {
                    System.out.println("pt vo so nghiem");
                }else if(so2 !=0) {
                    System.out.println("pt cos 1 nghiem duy nhat : "+ so2/so1);
                }
            }

        }
    }


