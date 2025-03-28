package Bonus;

public class Animal {
    private String name;
    private final String kind;
    private String stay;
    private String feed;

    public Animal(String name, String kind, String stay, String feed) {
        this.name = name;
        this.kind = kind;
        this.stay = stay;
        this.feed = feed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind(){
        return kind;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getStay() {
        return stay;
    }

    public void setStay(String stay) {
        this.stay = stay;
    }

}
