package ru.netology.domain.attachment;

public class Price {
    private int amount;
    private CurrencyInfo currency;
    private String text;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CurrencyInfo getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyInfo currency) {
        this.currency = currency;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
