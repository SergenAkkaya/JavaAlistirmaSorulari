public class AlistirmaSorulari_3 {
    public static void main(String[] args) {
        int N1 = 4;
        for (int i = 0; i < N1; i++) {
            System.out.println(i*i*i +",");
        }
        System.out.println("-----------");
        int N2 = 5;
        int faktoriyel=1;
        for (int i = 1; i < N2; i++) {
            faktoriyel *=i;
            System.out.print(i+"! :");
            System.out.println(faktoriyel);
        }
        System.out.println("-----------");

        int N3 = 3;
        for (int i = 1; i <=10; i++) {
            int carpim = N3 * i;
            System.out.println(i + " * " + N3 + " : " + carpim);
        }
        System.out.println("-----------");

        int baslangicS = 1;
        int bitisS=10;
        int toplam1=0;
        int ortalama1=0;
        for (int i = baslangicS; i <=bitisS; i++) {
            toplam1+=i;
        }
        ortalama1= toplam1/bitisS;
        System.out.println("Toplam :  " + toplam1 +" Ortalaması : " + ortalama1);
        System.out.println("-----------");
    }
}
