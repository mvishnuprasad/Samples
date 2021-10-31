import java.util.Scanner;
class sort{
public static void main(String[] args) {
    int [] arr={4,3,5,1,2,11,34,54,999};
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        }
    }
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }
}
}