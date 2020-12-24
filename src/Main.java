public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int amount = service.calculate(500);
        System.out.println(amount);

    }
}
