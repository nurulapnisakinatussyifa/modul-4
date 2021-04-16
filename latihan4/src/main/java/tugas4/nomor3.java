
package tugas4;
public class nomor3 {
      public static void selectionSort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        //index of smallest element in the sublist
        for (pass = 0; pass < n - 1; pass++) { //pass=0; 0<4-->True
                                                //0//dengan data yang dibandingan adalah yang indeks lebih dari[1]
                                                //j=1;1<5//j=2; 2<5
                                                //A[1]<A[0]-6<10=T//A[2]<A[1]-8<6=T
            //mencari data yang paling kecil dari data setelah pointer//
            smallindex = pass;//smallindeks=pointer//Ssmall indeks = 0
            for (j = pass + 1; j < n; j++) {//variabel pass dan j
                if (A[j] < A[smallindex]) {//jika yang dibandingkan misal 3 lebih dari 25(pointer) maka akan terjadi pertukaran
                    smallindex = j; //1 //2
                }
            }
            temp = A[pass];//digunakan untuk solusi pada pertukaran data atau tempat pertikaran sementara //
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    //Tukar nilai terkecil dengan array[pass]
    public static void tampil(int data[]) {//cara menampilkan data oada array//
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args ) {
        int A[] = { 25 , 7 , 9 , 13 , 3 };
        nomor3.tampil(A);
        nomor3.selectionSort(A);
        nomor3.tampil(A);
        
         System.out.println();
       System.out.println("NURUL APNI SAKINATUS SYIFA"); 
}
}
    

