package Stream_api.oop.average_level.qwen.transaction;

class Transaction {
    double amount;
    String currency;
    String country;

    public Transaction(double amount, String currency, String country) {
        this.amount = amount;
        this.currency = currency;
        this.country = country;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCountry() {
        return country;
    }
}
