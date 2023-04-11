public class T4 {
    public static void main(String[] args) {
        System.out.println(PoiskBukv.countChars("Ben", 'b'));
    }
}

class PoiskBukv{
    public static int countChars (String str,char ch) {
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if(Character.toLowerCase(ch) == Character.toLowerCase(str.charAt(i))){
                count += 1;
            }
            i++;
        }
        return count;
    }
}
