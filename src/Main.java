/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız
dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan
daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz: ");
        a = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double daireAlani = (pi * (r*r) * a) / 360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Daire diliminin alanı: " + daireAlani);

    }
}