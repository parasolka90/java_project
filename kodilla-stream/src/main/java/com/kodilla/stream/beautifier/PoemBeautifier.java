package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(a));
    }
}
