public class T10 {
    public static void main(String[] args) {
        System.out.print("Привет, ");
        System.out.print(NameRedactor.Change("аНнА"));
        System.out.println("!");
    }
}

class NameRedactor{
    public static String Change(String name) {
        char firstSymbolHigh = Character.toUpperCase(name.charAt(0));
        name = name.substring(1);
        name = firstSymbolHigh + name.toLowerCase();

        return name;
    }
}
