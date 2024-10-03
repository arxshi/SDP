package factory;

import model.Button;
import model.DarkThemeButton;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }
}
