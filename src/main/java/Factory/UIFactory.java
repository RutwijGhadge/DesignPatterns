package Factory;

import Factory.Components.Dropdown.DropDown;
import Factory.Components.Menu.Menu;

public interface UIFactory {
    Object CreateButton();
    Menu CreateMenu();
    DropDown CreateDropDown();

}
