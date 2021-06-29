package src;

import java.util.PriorityQueue;

public class JZ41 {
    //大小顶堆
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
    PriorityQueue<Integer> lheap,sheap;


    public MedianFinder() {

        //小顶堆存大于等于中位数的数
        sheap=new PriorityQueue<>();
        //大顶堆存小于等于中位数的数
        lheap=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        
        //由上可知，小顶堆中的数一定是大于等于大顶堆中的数
        //保证两个堆顶是中位数
        //小顶堆的大小m和大顶堆的大小n的约束关系：m==n或m-n==1
    }
    
    public void addNum(int num) {
        
        // 当 m 1= n：需向 小顶堆 添加一个元素。实现方法：将新元素 num 插入至 大顶堆 ，再将 大顶堆堆顶元素插入至 小顶堆 ；
        // 当 m-n==1：需向 大顶堆 添加一个元素。实现方法：将新元素 num 插入至 小顶堆 ，再将 小顶堆 堆顶元素插入至 大顶堆 ；



        if(sheap.size()==lheap.size()){
            lheap.add(num);
            sheap.add(lheap.poll());
        }
        else{
            sheap.add(num);
            lheap.add(sheap.poll());
        }



    }
    
    public double findMedian() {

        return sheap.size()==lheap.size()?(double)(sheap.peek()+lheap.peek())/2.0:sheap.peek();
        
    }
}
