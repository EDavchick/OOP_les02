public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human ivan = new Human("Ivan");
        Human peter = new Human("Peter");
        market.acceptToMarket(ivan);
        market.acceptToMarket(peter);
        market.update();
    }
}