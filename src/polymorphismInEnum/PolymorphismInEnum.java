package polymorphismInEnum;

public class PolymorphismInEnum {
    public static void main(String[] args) {
        Direction d=Direction.east;
        d.move();

    }
}
enum  Direction {
    east {
        @Override
        public void move(){
            System.out.println("move right (x+1)");
        }
    },
    west {
        @Override
        public void move(){
            System.out.println("move left (x-1)");
        }
    },
    north {
        @Override
        public void move(){
            System.out.println("move right (y+1)");
        }
    },
    south {
        @Override
        public void move(){
            System.out.println("move right (y-1)");
        }
    };

    abstract public   void  move();
}

