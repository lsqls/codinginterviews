package src;

import java.util.ArrayList;
import java.util.List;

public class JZ41 {
    //二分查找+插入排序
    public static void main(String[] args) {
       MedianFinder medianFinder= new MedianFinder();
       medianFinder.addNum(1);
       medianFinder.addNum(4);
       medianFinder.addNum(0);
       medianFinder.addNum(3);
       medianFinder.addNum(1);
    }
    
}

class MedianFinder{
    List<Integer> iList;
    public MedianFinder() {
        iList=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int left=0,right=iList.size()-1;
    

        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(num<iList.get(mid)){
                right=mid-1; 
            }

            else if(num>iList.get(mid)){
                left=mid+1;
            }

            else{
                left=mid;
                break;
            }

            

            
        }
        iList.add(left, num);


    }
    
    public double findMedian() {
        int mid=iList.size()/2;
        return iList.size()%2==0?(double)(iList.get(mid)+iList.get(mid-1))/2.0:iList.get(mid);
    }
}
