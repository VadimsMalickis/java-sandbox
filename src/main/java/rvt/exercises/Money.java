package rvt.exercises;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        
        if (newCents >= 100) {
            newCents -= 100;
            newEuros++;
        }
        Money newMoney = new Money(newEuros, newCents); // create a new Money object that has the correct worth
        return newMoney;
    }

    public Money minus(Money decreaser) {
        if (this.euros - decreaser.euros <= 0
            && this.cents - decreaser.cents <= 0) {
            return new Money(0, 0);
        }
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.cents < compared.cents && this.euros <= compared.euros) {
            return true;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " EUR";
    }
}
