package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain{
    public static void main(String[]args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String b="bardzo";

        poemBeautifier.beautify(b,(a -> "Lubie pizze "+a+" i burgerki tez lubie"));
        poemBeautifier.beautify(b,(a ->a.toUpperCase()));
        poemBeautifier.beautify(b,(a->a.replace('r','x')));
        poemBeautifier.beautify(b,(a->b.substring(3)));
    }
}
