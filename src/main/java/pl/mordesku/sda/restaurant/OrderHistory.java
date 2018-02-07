package pl.mordesku.sda.restaurant;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2018-02-07
 * Time: 19:19
 */
@Component
@Scope("singleton")
public class OrderHistory {
    private Map<String, List<String>> orderHistory = new HashMap<>();

    public void addToHistory(String name, List<String> dishes) {
        if (!orderHistory.containsKey(name)) {
            orderHistory.put(name, new ArrayList<>());
        }
        orderHistory.get(name).addAll(dishes);
    }

    public List<String> getAllDishes() {
        List<String> all = new ArrayList<>();
        for (Map.Entry<String, List<String>> s : orderHistory.entrySet()) {
            all.addAll(s.getValue());
        }
        return all;
    }
}
