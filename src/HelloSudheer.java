class CarInfo{
    String Model;
    String Color;
    int Year;

    void accelerate()
    {
        System.out.println("my car model is " + Model + " my car color is " + Color + " this is made in the year " + Year);

    }
}
class CarMain{
    public static void main(String[] args)
    {
        CarInfo obj = new CarInfo();
        obj.Model = "Audi";
        obj.Color = "White";
        obj.Year = 2020;
        obj.accelerate();
    }
}
