public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(10_000, true);

        boolean passed = expected == actual;

        System.out.println(passed);
    }
}