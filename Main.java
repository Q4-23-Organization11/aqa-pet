public class Main {
    public static void main(String[] args) {
        System.out.println("Hello ItHillel");

        int CelsiusValue = 28;
        double FahrenheitValue = (CelsiusValue * 9.0 / 5.0) + 32.0;
        double KelvinValue = CelsiusValue + 273.16;
        System.out.println(CelsiusValue + " Celsius; " + FahrenheitValue + " Fahrenheit; " + KelvinValue + " Kelvin");

        int Length = 26;
        int Height = 29;
        double Square = 0.5 * Length * Height;
        System.out.printf(" Square " + Square);


    }
}