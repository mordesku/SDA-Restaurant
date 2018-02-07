package pl.mordesku.sda.restaurant;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2018-02-07
 * Time: 19:10
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
public class UserModel implements IUserModel {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
