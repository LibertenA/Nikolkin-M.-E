import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Coordinates number = new Coordinates();
        int [] arr_1 = number.coordinates();
        int [] arr_2 = number.coordinates();
        int [] arr_3 = number.coordinates();
        Baricentr baricentr = new Baricentr(arr_1, arr_2, arr_3);
        System.out.println("Координаты барицентра(" + baricentr.getX() + ", " + baricentr.getY() + ")");
    }
}

class Coordinates{
    public int[] coordinates(){
        Scanner scanner = new Scanner(System.in);
        int[] arr_coordinate = new int[2];
        for (int i = 0; i < arr_coordinate.length; i++) {
            arr_coordinate[i] = scanner.nextInt();
        }
        return arr_coordinate;
    }
}

class Baricentr{
    private int [] arr_1;
    private int [] arr_2;
    private int [] arr_3;

    public Baricentr(int [] arr_1, int [] arr_2, int [] arr_3){
        this.arr_1 = arr_1;
        this.arr_2 = arr_2;
        this.arr_3 = arr_3;
    }

    public int getX(){
        return (arr_1[0] + arr_2[0] + arr_3[0]) / 3;
    }
    public int getY(){
        return (arr_1[1] + arr_2[1] + arr_3[1]) / 3;
    }
}
