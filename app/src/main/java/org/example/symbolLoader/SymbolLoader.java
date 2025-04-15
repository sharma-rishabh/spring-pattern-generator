package org.example.symbolLoader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SymbolLoader {
    private final String symbol;
    public SymbolLoader(@Value("${app.symbol.value}") String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
