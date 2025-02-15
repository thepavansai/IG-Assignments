import java.util.Arrays;
class Swaping{
    static void swap(int x , int y){
        x=x+y;
        y=x-y;
        x=x-y;
    }
     static void swap(int []x,int []y){
        for(int i=0;i<x.length && i<y.length;i++){
            //swap(x[i],y[i]); doesnot work
            x[i]=x[i]+y[i];
            y[i]=x[i]-y[i];
            x[i]=x[i]-y[i];
        }
    }
    static void print(int []x){
        for(int y:x){
            System.out.print(y);
        }
        System.out.println();
    }
    public static void main(String []swappers){
        int y=10,x=25;
        System.out.println(x+" "+y);
        swap(x,y);
        System.out.println(x+" "+y);
        int []arr1={1,2,3,4,5};
        int []arr2={6,7,8,9,10};
        print(arr1);
        print(arr2);
        swap(arr1,arr2);
        print(arr1);
        print(arr2);
        
    }
}