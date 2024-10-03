package factory;

import model.Button;
import model.LightThemeButton;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }
}
