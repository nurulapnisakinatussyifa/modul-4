
package tugas4;
import java.util.Scanner;

public class nomor7 {
    public static void bubbleSort(int[] A){
        int i = 1, j, n = A.length;
        int temp;
        while (i<n){
            j = n - 1;
            while (j>=i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }    
    }
    
    public static void tampil(int data[]){
        for (int i = 0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {25, 7, 9, 13, 3};
        nomor2.tampil(A);
        nomor2.bubbleSort(A);
        nomor2.tampil(A);
        binarry(A);
    }
    public static void binarry(int[] A) {
         int cari;
        Scanner input = new Scanner(System.in);
     

        System.out.println("Masukkan data yang di cari : ");
        cari = input.nextInt();
        int ketemu = 0;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int point = 0;
        
        System.out.println("Data B Adalah : ");
            for (int i = 0; i<A.length; i++){
                System.out.print(A[i] + " ");
            }
        System.out.println(" ");
        System.out.println(" ");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir)/ 2;
            System.out.println("Indeks pointer : "+point);
                 if (cari == A [point]){
                     ketemu = 1;
                     System.out.println("Data "+
                     cari + " Telah ditemukan pada indeks ke "+ point);
                 }
                 else if (cari < A[point]){
                     System.out.println("Cari di kiri ");
                     IndeksAkhir = point-1;
                 }
                 else {
                     IndeksAwal = point+1;
                     System.out.println("Cari di kanan ");
                 }
        }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
    
    System.out.println();
       System.out.println("NURUL APNI SAKINATUS SYIFA"); 
    
}
    
}
