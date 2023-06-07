public class Main {
    public static void main(String[] args) {
        System.out.println(numpadConverter(789));
    }
    public static String numpadConverter(int numbers){
        String str = String.valueOf(numbers);
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char num = str.charAt(i);
            if (num == '7'){
                newstr.append('1');
            } else if (num == '8') {
                newstr.append('2');
            } else if (num == '9') {
                newstr.append('3');
            } else if (num == '1') {
                newstr.append('7');
            } else if (num == '2') {
                newstr.append('8');
            } else if (num == '3') {
                newstr.append('9');
            } else{
                newstr.append(num);
            }
        }
        return newstr.toString();
    }
}