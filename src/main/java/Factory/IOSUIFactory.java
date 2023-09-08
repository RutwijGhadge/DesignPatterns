package Factory;

import Factory.Components.Button.IOSButton;
import Factory.Components.Dropdown.DropDown;
import Factory.Components.Dropdown.IOSDropdown;
import Factory.Components.Menu.IOSMenu;
import Factory.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton CreateButton() {
        return new IOSButton();
    }

    @Override
    public Menu CreateMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown CreateDropDown() {
        return new IOSDropdown();
    }
}
