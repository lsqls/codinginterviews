package src;

public class JZ5 {
    public String replaceSpace(String s) {

        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<s.length();i++){


            char ch=s.charAt(i);
            if(ch==' ')
                stringBuffer.append("%20");
            else
                stringBuffer.append(ch);
        }


        return stringBuffer.toString();


         

    }
}
