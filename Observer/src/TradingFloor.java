/** This is the main where you trade stocks*/
public class TradingFloor {
    public static void main(String[] args) {
        Stock apple = new Stock("APPL");
        Stock google = new Stock("GOOG");

        Trader jane = new Trader("Jane");
        Trader mitsuba = new Trader("Mitsuba");
        Trader Otae = new Trader("Otae");

        apple.addObserver(jane);
        apple.addObserver(mitsuba);
        apple.addObserver(Otae);
        apple.addLatestTrade(new Trade(jane, "buy", 200, apple));

        System.out.println("");
        apple.removeObserver(Otae);
        apple.addLatestTrade(new Trade(mitsuba, "sell", 420, apple));

        System.out.println("");
        google.addObserver(jane);
        google.addObserver(Otae);
        google.addLatestTrade(new Trade(Otae, "sell", 340, google));

    }
}
