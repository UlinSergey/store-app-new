package pro.sky.storeapp.conttroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.storeapp.servise.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService= orderService;
    }
    @GetMapping("/add")
    public List<Integer> addItems (@RequestPart List<Integer> ids){
        return orderService.addItems(ids);
    }

    @GetMapping("/get")
    public List<Integer> getItems (Object ids){
        return orderService.getItems();
    }
}
