public class MasterRoach implements Payment{
    private String name;
    private String cvv;
    private String cardNum;
    private String dateOfExp;

    public MasterRoach(){
        name = "John";
        cvv = "123";
        cardNum = "987654321";
        dateOfExp = "05/23";
    }

    public MasterRoach(String roachName, String roachCVV, String roachCard, String roachDateExp){
        name = roachName;
        cvv = roachCVV;
        cardNum = roachCard;
        dateOfExp = roachDateExp;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment from MasterRoach credit card: " + amount);
    }
}
