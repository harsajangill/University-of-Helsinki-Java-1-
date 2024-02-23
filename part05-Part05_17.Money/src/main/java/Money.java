 
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents+addition.cents);
        
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        int totalOne = (this.euros*100) + this.cents;
        int totalTwo = (compared.euros*100) + compared.cents;
        
        if (totalOne < totalTwo) {
            return true;
        }

        return false;

    }

    public Money minus(Money decreaser) {
       int differenceEuros = this.euros - decreaser.euros;
       int differenceCents = this.cents - decreaser.cents;

       if (differenceEuros < 0) {
        Money newMoney = new Money(0,0);
        return newMoney;
       } 

       if (differenceEuros == 0 && differenceCents < 0) {
        Money newMoney = new Money(0,0);
        return newMoney;
       }

        if (differenceCents < 0) {
            differenceCents += 100;
            differenceEuros -= 1;
        }

        Money newMoney = new Money(differenceEuros, differenceCents);
        return newMoney;
       
    }

}
