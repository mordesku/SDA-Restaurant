package pl.mordesku.sda.restaurant;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2018-02-07
 * Time: 19:13
 */
@Component
@Scope("singleton")
public class DishesModel {
    private List<String> dishes = Arrays.asList("zupa","bu³ka", "kotlet");

    public List<String> getDishes() {
        return dishes;
    }
}
