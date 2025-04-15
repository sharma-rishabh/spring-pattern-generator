package org.example.patterns;

import org.example.symbolLoader.SymbolLoader;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("tri")
public class Triangle implements Pattern{
    private final SymbolLoader symbolLoader;
    public Triangle(SymbolLoader symbolLoader) {
        this.symbolLoader = symbolLoader;
    }
    private String symbol() {
        return this.symbolLoader.getSymbol();
    }
    private String solidRow(int width) {
        return symbol().repeat(width);
    }
    @Override
    public List<String> generatePattern() {
        int height = 5;
        List<String> result= new ArrayList<String>();
        for(int i = 0; i < height; i++) {
            result.add(solidRow(i));
        }
        return result;
    }
}
