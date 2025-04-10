package org.example.patterns;

import java.util.ArrayList;
import java.util.List;


public class Rectangle implements Pattern{

    private String solidRow(int width) {
        return "*".repeat(width);
    }

    private String hollowRow(int width) {
        return "*" + " ".repeat(width - 2) + "*";
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
