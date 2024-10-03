package factory.button;

import model.button.Button;
import model.button.LightThemeButton;

public class LightThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightThemeButton();
    }
}
