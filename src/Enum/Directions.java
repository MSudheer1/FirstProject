package Enum;

public enum Directions {
    EAST,WEST,NORTH,SOUTH;

    public static void main(String[] args) {
        Directions[] directions = Directions.values();
        for (Directions d : directions){
            System.out.println(d);
        }
    }
}


