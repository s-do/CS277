/** This is the main where you trade stocks*/
public class StockMarketTester {
    public static void main(String[] args) {
        /*Stock apple = new Stock("APPL");
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
        google.addLatestTrade(new Trade(Otae, "sell", 340, google));*/

        Stock apple = new Stock("APPL");
        Stock google = new Stock("GOOG");
        Stock microsoft = new Stock("MSFT");
        System.out.println("Available Stock");
        System.out.println(apple);
        System.out.println(google);
        System.out.println(microsoft);
        System.out.println();

        Trader jane = new Trader("Jane");
        Trader mitsuba = new Trader("Mitsuba");
        Trader otae = new Trader("Otae");
        Trader amy = new Trader("Amy");

        apple.addObserver(jane);
        Trade buy = new Trade(jane, "buy", 200, apple);
        apple.addLatestTrade(buy);
        System.out.println();

        apple.addObserver(mitsuba);
        Trade buy2 = new Trade(mitsuba, "buy", 200, apple);
        apple.addLatestTrade(buy2);
        System.out.println();

        apple.addObserver(otae);
        Trade buy3 = new Trade(otae, "buy", 200, apple);
        apple.addLatestTrade(buy3);
        System.out.println();

        apple.addObserver(amy);
        Trade buy4 = new Trade(amy, "buy", 200, apple);
        apple.addLatestTrade(buy4);
        System.out.println();

        System.out.println("-----------");
        apple.removeObserver(otae);
        Trade sell = new Trade(otae, "sell", 420, apple);
        apple.addLatestTrade(sell);
        System.out.println();

        System.out.println("--------------");
        google.addObserver(otae);
        Trade buy5 = new Trade(otae, "buy", 340, google);
        google.addLatestTrade(buy5);
        System.out.println();

        google.addObserver(jane);
        Trade buy6 = new Trade(jane, "buy", 340, google);
        google.addLatestTrade(buy6);
        System.out.println();

        google.addObserver(amy);
        Trade buy7 = new Trade(amy, "buy", 340, google);
        google.addLatestTrade(buy7);
        System.out.println();

        apple.removeObserver(jane);
        Trade sell2 = new Trade(jane, "sell", 420, apple);
        apple.addLatestTrade(sell2);
        System.out.println();

        google.addObserver(mitsuba);
        Trade buy8 = new Trade(mitsuba, "buy", 540, google);
        google.addLatestTrade(buy8);
        System.out.println();

        microsoft.addObserver(mitsuba);
        Trade buy9 = new Trade(mitsuba, "buy", 640, google);
        microsoft.addLatestTrade(buy9);
        System.out.println();


        //should the commented removeObserver be in place #1 or 2
        //like when they are the only person who owns the stock should they be notified
        //that they sold the stock or should it just print nothing when there's nobody left who owns it
        // 1. microsoft.removeObserver(mitsuba);
        Trade sell3 = new Trade(mitsuba, "sell", 420, microsoft);
        microsoft.addLatestTrade(sell3);
        // 2. microsoft.removeObserver(mitsuba);
        System.out.println();
    }
}
