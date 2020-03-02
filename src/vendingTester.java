public class vendingTester {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        Product candy1 = new Product("candy", 0.25);
        Product cookie1 = new Product("cookie", 0.5);
        Product chip1 = new Product("chip", 0.75);

        machine.addItem(candy1);
        machine.addItem(cookie1);
        machine.addItem(chip1);

        System.out.println(machine);

        machine.addMoney(0.75);
        machine.addMoney(0.25);
        System.out.println("add money into machine: " + machine.getMoney());

        //System.out.println("clear: " + machine.clearAccount());
        System.out.println("money after: " + machine.getMoney());

        System.out.println("verifying money: " + machine.verifyMoney(0));

        System.out.println("removing: " + machine.removeItem(1));
        System.out.println("after removing: " + machine);

        System.out.println(machine.getMoney());
        machine.removeMoney(0.10);
        System.out.println(machine.getMoney());
    }
}
