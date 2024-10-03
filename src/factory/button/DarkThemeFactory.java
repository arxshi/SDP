package factory.button;

import factory.movie.UIFactory;
import model.button.Button;
import model.button.DarkThemeButton;

public class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }
}
