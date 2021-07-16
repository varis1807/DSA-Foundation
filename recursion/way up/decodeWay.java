public class decodeWay {
    public static int decode(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        char ch=str.charAt(0);
        if(ch=='0')
        return 0;
        count+=decode(str.substring(1), ans+(char)('a'+ch-'1'));
        if(str.length()>1){
            int num=(ch-'0')*10+(str.charAt(1)-'0');
            if(num<=26)
            count+=decode(str.substring(2), ans+(char)('a'+num-1));
        }
        return count;
    }           
    public static void main(String[] args) {
        System.out.println(decode("12213", ""));
    }
}
