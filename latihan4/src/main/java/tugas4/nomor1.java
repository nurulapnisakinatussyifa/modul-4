package tugas4;
public class nomor1 {
     public static void insertionSort(int[] A) {
    for (int i = 1; i < A.length; i++) {
    int key = A[i]; 
    int j = i - 1;
    while (( j >= 0) && (A[j] > key)) {
        A[j + 1 ]=A[j];
        j--;}
    A[j + 1] = key;
}
}
public static void tampil(int data[]) {
    for (int i=0; i < data.length;i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
public static void main(String[] args ){
    int A[]= { 25 , 7 , 9 , 13 , 3 };
    nomor1.tampil(A);    //cara menamainya yaitu name class_name public static
    nomor1.insertionSort(A);
    nomor1.tampil(A);
  System.out.println();
       System.out.println("NURUL APNI SAKINATUS SYIFA");      
}
}

