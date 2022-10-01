import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.𝜋 sayısını = 3.14 alınız.
                Formül : (𝜋 * (r*r) * 𝛼) / 360*\  */
        Scanner scanner=new Scanner(System.in);
        double yaricap,aci;
        System.out.println("Yarıçap giriniz:");
        yaricap=scanner.nextDouble();
        System.out.println("Aci giriniz:");
        aci= scanner.nextDouble();
        double pi=3.14;
        double formul=(pi*(yaricap*yaricap)*aci)*360;
        System.out.println("Alan:"+formul);

    }
}