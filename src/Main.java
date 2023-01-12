public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitExeption e) {
                try{
                    bankAccount.withDraw((int) e.getRemainingAmount());
                } catch (LimitExeption ex) {
                }
                System.out.println("Âû ñíÿëè îñòàòîê " + e.getRemainingAmount());
                System.out.println("Âàø òåêóùèé ñ÷åò = "
                        + bankAccount.getAmount());
                break;
            }
}


    }



}