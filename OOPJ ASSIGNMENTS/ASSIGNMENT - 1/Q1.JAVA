import java.lang.*;

class Ass1Q1 {
    public static void main(String args[]) {
        double len = 8.0, brd = 6.0, hgt = 2.0;

        double vRectangle = len * brd * hgt;
        double vCube = len * len * len;
        double aSquare = len * len;

        System.out.println("Volume of Rectangle: " + vRectangle);
        System.out.println("Volume of Cube: " + vCube);
        System.out.println("Area of Square: " + aSquare);
    }
}