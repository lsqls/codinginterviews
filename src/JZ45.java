package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JZ45 {
    public String minNumber(int[] nums) {
        // x “小于” y 代表：排序完成后，数组中 x 应在 y 左边；“大于” 则反之。
        List<String> numsList=new ArrayList<>();
        for(int value:nums){
            numsList.add(String.valueOf(value));
        }
        Comparator<String> comp=new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
                return (str1+str2).compareTo(str2+str1);
                
            }
        };
        Collections.sort(numsList,comp);
     

        StringBuilder ret=new StringBuilder();
        for(String str:numsList){
            ret.append(str);
        }
        return ret.toString();
    }
}
