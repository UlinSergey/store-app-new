package pro.sky.storeapp.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Busket {
    private final List<Integer> items= new ArrayList<>();

    public List<Integer> addItems(List<Integer> ids){
        items.addAll(ids);
        return items;
    }

    public List<Integer> getItems() {
        return items;
    }
}
