package rvt.exercises;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.00;

    }

    public double eatAffordably(double payment) {
        double affordableMealPrice = 2.50;
        if (payment >= affordableMealPrice) {
            this.money += affordableMealPrice;
            this.affordableMeals++;
            return payment - affordableMealPrice;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        double heartyMealPrice = 4.30;
           if (payment >= heartyMealPrice) {
            this.money += heartyMealPrice;
            this.heartyMeals++;
            return payment - heartyMealPrice;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealPrice = 2.50;
        if (card.balance() >= affordableMealPrice) {
            this.affordableMeals++;
            return card.takeMoney(affordableMealPrice);
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealPrice = 4.30;
           if (card.balance() >= heartyMealPrice) {
            this.heartyMeals++;
            return card.takeMoney(heartyMealPrice);
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
