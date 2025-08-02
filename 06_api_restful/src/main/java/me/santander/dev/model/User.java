package me.santander.dev.model;

public class User {

    private Long id;
    private Account account;
    private Feature[] features;
    private Card card;
    private News[] news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public News[] getNews() {
        return news;
    }

    public void setNews(News[] news) {
        this.news = news;
    }
}
