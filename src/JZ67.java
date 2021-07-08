package src;

public class JZ67 {
    public int strToInt(String str) {
        int res = 0, bndry = Integer.MAX_VALUE / 10;
        int i = 0, sign = 1, length = str.length();
        if(length == 0) 
            return 0;


        // # 删除首尾空格
        while(str.charAt(i) == ' '){
            if(++i == length) 
                return 0;
        }
            
        
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            if(str.charAt(i) == '-')
                sign = -1;
            i++; //若无符号位，从第一个字符开始数字拼接

        }
        for(int j = i; j < length; j++) {
            if(str.charAt(j) < '0' || str.charAt(j) > '9') 
                break;// 遇到非数字的字符则跳出
            if(res > bndry || res == bndry && str.charAt(j) >= '8')//tr.charAt(j) >= '8' 这里处理很巧妙
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;//数字越界处理（Integer.MIN_VALUE 算越界,Integer.MAX_VAULE不算越界）
            res = res * 10 + (str.charAt(j) - '0');// 数字拼接
        }
        return sign * res;
    }
}
