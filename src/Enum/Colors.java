package Enum;

public enum Colors {
    RED, BLUE, GREEN, YELLOW, BLACK;

    public static void main(String[] args) {
        Colors[] color = Colors.values();
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }
}
