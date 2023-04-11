public class T9 {
    public static void main(String[] args) {
        System.out.print(Proverka.End_of_Str("baka", "ka"));
    }
}

class Proverka{
    public static boolean End_of_Str(String slovo, String ovo){
        return slovo.substring(ovo.length()).equals(ovo);
    }
}