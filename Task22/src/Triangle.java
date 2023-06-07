public class Triangle {
    public static double square(int a, int b, int c){
        int perimetr = a+b+c;
        int p = perimetr / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
