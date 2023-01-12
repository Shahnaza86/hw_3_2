public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }


    public void deposit(double sum){
        amount =amount+sum;
    };

    public void withDraw(int sum)throws LimitExeption{
        if (sum>amount){
            throw new LimitExeption("Çàïðàøèâàåìàÿ ñóììà íà ñíÿòèå, ïðåâûøàåò òåêóùèé ñ÷åò",amount);
        }
        System.out.println("Âû ñíÿëè ñî ñ÷åòà:  "+ sum);
        amount=amount-sum;
    }

}
