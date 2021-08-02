package src;

import java.util.Arrays;

public class JZ40 {
    //快排
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ret=new int[k];
        int length=arr.length;
        if(length==0||k==0)
            return ret;
        int start=0,end=length-1,index=start;
        while(start<=end){
            index=partition(arr, start, end);
            if(index==k-1)
                break;
            else if(index>k-1)
                end=index-1;
            else
                start=index+1;
        }
        ret=Arrays.copyOfRange(arr, 0, index+1);
        return ret;

    }
    public int partition(int[] arr,int start,int end){
        int compareVal=arr[end];
        int smallIndex=start;
        for(int i=start;i<end;i++){
            if(arr[i]<compareVal){
                swap(arr, i, smallIndex);
                smallIndex++;
            }
        }
        swap(arr, end, smallIndex);
        return smallIndex;
    }
    public void swap(int []arr,int i,int j){
        if(i==j)
            return;
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
