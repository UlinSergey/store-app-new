package pro.sky.storeapp.servise;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> ids);


    List<Integer> getItems();
}
