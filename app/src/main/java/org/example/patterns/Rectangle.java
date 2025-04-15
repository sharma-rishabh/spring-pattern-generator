package org.example.patterns;

import org.example.symbolLoader.SymbolLoader;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component("rect")
public class Rectangle implements Pattern{
    private final SymbolLoader symbolLoader;
    public Rectangle(SymbolLoader symbolLoader) {
        this.symbolLoader = symbolLoader;
    }
    private String symbol() {
        return this.symbolLoader.getSymbol();
    }

    private String solidRow(int width) {
        return symbol().repeat(width);
    }

    private String hollowRow(int width) {
        return symbol() + " ".repeat(width - 2) + symbol();
    }
    @Override
    public List<String> generatePattern() {
        int height = 5;
        int width = 5;

        List<String> result= new  ArrayList<String>();
        for(int i = 0; i < height; i++) {
            boolean isBounding = i == 0 || i == height -1;
            result.add(isBounding ? solidRow(width) : hollowRow(width));
        }
        return result;
    }
}
