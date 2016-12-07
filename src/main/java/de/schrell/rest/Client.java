package de.schrell.rest;

import org.springframework.web.client.RestTemplate;

public class Client {

    public static void main(final String args[]) {
        final RestTemplate restTemplate = new RestTemplate();
        for (int i=0; i<100; i++) {
            new Thread(() -> get(restTemplate)).start();
        }
    }

    private static void get(final RestTemplate restTemplate) {
        final Greeting g = restTemplate.getForObject("http://localhost:8080/greeting/as", Greeting.class);
        System.out.println(g.getId() + ": " + g.getContent());
    }

}