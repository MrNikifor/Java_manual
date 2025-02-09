package Stream_api.oop.average_level.qwen.transaction2;

import java.time.LocalDate;

class Transaction {
    double amount;
    String currency;
    LocalDate date;

    public Transaction(double amount, String currency, LocalDate date) {
        this.amount = amount;
        this.currency = currency;
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", date=" + date +
                '}';
    }
}
