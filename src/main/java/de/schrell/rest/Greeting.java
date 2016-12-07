package de.schrell.rest;

public class Greeting {

    private long id;
    private String content;

    // needed for json
    public Greeting() {
    }

    public Greeting(final long id, final String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
