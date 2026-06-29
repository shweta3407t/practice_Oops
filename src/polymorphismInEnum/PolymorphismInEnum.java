package polymorphismInEnum;

public class PolymorphismInEnum {
    public static void main(String[] args) {
        Direction d=Direction.east;
        d.move();

        //values()   --> iterate in enum
        Direction[] d1=Direction.values();
        for(Direction direction : d1){
            System.out.println(direction);
        }

        //valueOf() -->convert string in enum constant
        //name()
        Direction d2=Direction .valueOf("east");
        System.out.println(d2.name());

        //ordinal()




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

