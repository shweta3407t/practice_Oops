package EnumInjava;

public class Enum {
    public static void main(String[] args) {
        Direction d = Direction.EAST;
        System.out.println(d.getDegree());

        Direction1 d1=Direction1.EAST;
        System.out.println(d1.getDegree());
    }
}
//enumerated type
enum Direction {
    EAST(90),
    WEST(270),
    NORTH(0),
    SOUTH(180);

    private int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    int getDegree() {
        return degree;
    }
}
//normal class
class Direction1{
    private   int degree;
    public  static  final Direction1  EAST=new Direction1(90);
    public  static  final Direction1  WEST=new Direction1(180);
    public  static  final Direction1  NORTH=new Direction1(0);
    public  static  final Direction1  SOUTH=new Direction1(270);

    Direction1(int degree){
        this.degree=degree;
    }
    public int getDegree(){
        return degree;
    }

}