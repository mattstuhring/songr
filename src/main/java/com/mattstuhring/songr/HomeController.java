package com.mattstuhring.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getRoot() {
        System.out.println("Somebody got hit the home route");
        return "home";
    }

    @GetMapping("/hello")
    public String getHelloWorld() {
        return "helloworld";
    }

    @GetMapping("/capitalize/{words}")
    public String getCapitalizeWords(@PathVariable String words, Model m) {
        m.addAttribute("words", capitalizeWords(words));
        return "capitalize";
    }

    @GetMapping("/reverse")
    public String getReversedWords(@RequestParam(required = false, defaultValue = "I like to program in Java") String words, Model m) {
        m.addAttribute("reversed", reverseOrderOfWords(words));
        return "reversed";
    }

    public static String capitalizeWords(String words) {
        return words.toUpperCase();
    }

    public static String reverseOrderOfWords(String words) {
        String[] wordArr = words.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (String w : wordArr) {
            reversedWords.insert(0, w + " ");
        }

        return reversedWords.toString().trim();
    }
}
