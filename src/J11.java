package src;

public class J11 {
 

        // 二分法
        // 数组中的最后一个元素 x：在最小值右侧的元素，它们的值一定都小于等于 x；而在最小值左侧的元素，它们的值一定都大于等于 x。

        // 辅助工具：折线图
        // [3,4,5,1,2]、[1,1,2,1]

        public int minArray(int[] numbers) {
            int left = 0;
            int right = numbers.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                //第一种情况是 numbers[mid] < number[right]。如下图所示，这说明numbers[mid] 是最小值右侧的元素，因此我们可以忽略二分查找区间的右半部分。
                if (numbers[mid] < numbers[right]) {
                    right = mid;
                }
                //第二种情况是numbers[mid]>numbers[right]。如下图所示，这说明 numbers[mid] 是最小值左侧的元素，因此我们可以忽略二分查找区间的左半部分。
                else if (numbers[mid] > numbers[right]) {
                    left = mid + 1;
                }
                //第三种情况是 numbers[mid]==numbers[right]。如下图所示，由于重复元素的存在，我们并不能确定 numbers[mid] 究竟在最小值的左侧还是右侧，
                //因此我们不能莽撞地忽略某一部分的元素。我们唯一可以知道的是，由于它们的值相同，所以无论numbers[right] 是不是最小值，都有一个它的「替代品」numbers[mid]，因此我们可以忽略二分查找区间的右端点。
                else {
                    right -= 1;
                }
            }
            return numbers[left];
        }
    
    

}
