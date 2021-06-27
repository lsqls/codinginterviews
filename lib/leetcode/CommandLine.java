package lib.leetcode;

import java.util.Scanner;

public class CommandLine {


    static String intervalToArr(String intevalStr){
        return "new int[]"+intevalStr.replace('[','{').replace(']', '}');
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(intervalToArr(scanner.nextLine()));
        scanner.close();
    }
}
