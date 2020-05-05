public class RoachPal implements Payment{
    private String name;
    private String email;

    public RoachPal(){
        name = "John";
        email = "john@gmail.com";
    }

    public RoachPal(String roachName, String roachEmail){
        name = roachName;
        email = roachEmail;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment from RoachPal" + amount);
    }
}
