package pl.mordesku.sda.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2018-02-07
 * Time: 19:11
 */
@Controller
public class RestaurantController {
    @Autowired
    private IUserModel userModel;

    @Autowired
    private DishesModel dishesModel;

    @Autowired
    private OrderHistory orderHistory;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        if (userModel.getName() == null) {
            modelAndView.setViewName("login");
        } else {
            prepareMakeOrderView(modelAndView);
        }
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("name") String name) {
        userModel.setName(name);
        ModelAndView modelAndView = new ModelAndView();
        prepareMakeOrderView(modelAndView);
        return modelAndView;
    }

    @RequestMapping(value = "/makeOrder", method = RequestMethod.POST)
    public ModelAndView makeOrder(@RequestParam("dishes") List<String> dishes) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("confirmation");
        modelAndView.addObject("dishes", dishes);
        orderHistory.addToHistory(userModel.getName(), dishes);
        return modelAndView;
    }

    @RequestMapping(value = "/orderHistory", method = RequestMethod.GET)
    public ModelAndView orderHistory() {
        ModelAndView orderHistoryView = new ModelAndView("orderHistory");
        orderHistoryView.addObject("history", orderHistory.getAllDishes());
        return orderHistoryView;
    }

    private void prepareMakeOrderView(ModelAndView modelAndView) {
        modelAndView.setViewName("makeOrder");
        modelAndView.addObject("dishes", dishesModel.getDishes());
    }
}
