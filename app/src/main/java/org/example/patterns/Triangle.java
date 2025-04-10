package org.example.patterns;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("tri")
public class Triangle implements Pattern{

    private String solidRow(int width) {
        return "*".repeat(width);
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
