
package baitapbuoiso2;
import java.util.Scanner;
import java.util.Arrays;
public class BaiTapBuoiSo2 {
    static void NhapMang(int[] a)// câu a
    {
        Scanner banphim = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "]=");
            a[i] = banphim.nextInt();
        }
    }
    
    static void XuatMang(int []a){  //câu b
        System.out.println("Mang vua nhap la:");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    
    static int TimKiem(int  []a, int x){ // câu c
        for(int i = 0; i < a.length; i++){
            if(a[i] == x)
                return i;
        }
        return -1;
    }
    
    static int GiaTriMax(int []a){  // câu d
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    
    static int GiaTriMin(int []a){  // câu e
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
        
    static int ViTriLonNhat(int []a){  // câu f
        int vtmax = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[vtmax])
                vtmax = i;
        }
        return vtmax;
    }
    
    static void SapXepTangDan(int []a){
        Arrays.sort(a);
    }
        
    public static void main(String[] args) {
        final int n = 4;
        int []a = new int[n];
        NhapMang(a); //Câu a
        XuatMang(a); //Câu b
        int x;  //Câu c
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap phan tu x can tim:");
        x = sc.nextInt();
        int vt = TimKiem(a, x);
        if(vt != -1)
            System.out.println("Tim thay x tai vi tri: " + vt);
        else
            System.out.println("Khong tim thay vi tri x!! ");
        int max = GiaTriMax(a);  //Câu d
        System.out.println("Gia tri lon nhat trong mang la:" + max);
        int min = GiaTriMin(a);  //Câu e
        System.out.println("Gia tri nho nhat trong mang la:" + min);
        int vtmax = ViTriLonNhat(a); //Câu f
        System.out.println("Vi tri phan tu co gia tri lon nhat trong mang la:" + vtmax);
        System.out.println("Sap xep mang tang dan ");
        SapXepTangDan(a);
        XuatMang(a);
    }
}
