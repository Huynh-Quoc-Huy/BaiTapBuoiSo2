
package baitapbuoiso2;
import java.util.Scanner;
import java.util.Arrays;
public class BaiTapBuoiSo2 {
    // a.Nhập mảng một chiều các số nguyên
    static void NhapMang(int[] a)
    {
        Scanner banphim = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            System.out.print("a[" + i + "]=");
            a[i] = banphim.nextInt();
        }
    }
    // b.Xuất các ptu mảng ra cửa sổ xuất chuẩn
    static void XuatMang(int []a){  //câu b
        System.out.println("Cac phan tu trong mang :");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }
    // c.Tìm vị trí của một số nguyên x trong mảng
    static int TimKiem(int  []a, int x){ // câu c
        for(int i = 0; i < a.length; i++){
            if(a[i] == x)
                return i;
        }
        return -1;
    }
    // d.Tìm giá trị lớn nhất trong mảng
    static int GiaTriMax(int []a){  // câu d
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    // e.Tìm giá trị nhỏ nhất trong mảng
    static int GiaTriMin(int []a){  // câu e
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
    // f.Tìm vị trí phần tử có giá trị lớn nhất trong mảng    
    static int ViTriLonNhat(int []a){  // câu f
        int vtmax = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[vtmax])
                vtmax = i;
        }
        return vtmax;
    }
    // g.Sắp xếp mảng tăng dần
    static void SapXepTangDan(int []a){
        Arrays.sort(a);
    }
        
    public static void main(String[] args) {
        final int n = 4;
        int []a = new int[n];
        //Câu a
        NhapMang(a);
        //Câu b
        XuatMang(a); 
        //Câu c
        int x;  
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap phan tu x can tim:");
        x = sc.nextInt();
        int vt = TimKiem(a, x);
        if(vt != -1)
            System.out.println("Tim thay x tai vi tri: " + vt);
        else
            System.out.println("Khong tim thay vi tri x!! ");
         //Câu d
        int max = GiaTriMax(a); 
        System.out.println("Gia tri lon nhat trong mang la:" + max);
        //Câu e
        int min = GiaTriMin(a);  
        System.out.println("Gia tri nho nhat trong mang la:" + min);
        //Câu f
        int vtmax = ViTriLonNhat(a); 
        System.out.println("Vi tri phan tu co gia tri lon nhat trong mang la:" + vtmax);
        //Câu g
        System.out.println("Sap xep mang tang dan ");
        SapXepTangDan(a);
        XuatMang(a);
    }
}
