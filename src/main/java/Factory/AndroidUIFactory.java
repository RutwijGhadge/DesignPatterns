package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Button.button;
import Factory.Components.Dropdown.AndroidDropdown;
import Factory.Components.Dropdown.DropDown;
import Factory.Components.Menu.AndroidMenu;
import Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown CreateDropDown() {
        return new AndroidDropdown();
    }
}
