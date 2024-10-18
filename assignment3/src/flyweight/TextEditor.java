package flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {

    private CharacterFactory characterFactory;
    private List<TextPosition> charactersInDocument;

    public TextEditor(CharacterFactory factory) {
        this.characterFactory = factory;
        this.charactersInDocument = new ArrayList<>();
    }

    public void insertCharacter(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        charactersInDocument.add(new TextPosition(character, x, y));
    }

    public void renderDocument() {
        for (TextPosition textPosition : charactersInDocument) {
            textPosition.render();
        }
    }

    private class TextPosition {
        private Character character;
        private int x, y;

        public TextPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }

}
