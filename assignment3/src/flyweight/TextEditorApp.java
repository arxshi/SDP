package flyweight;

public class TextEditorApp {
    public static void main(String[] args) {

        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor editor = new TextEditor(characterFactory);

        editor.insertCharacter('H', "Arial", 12, 10, 10);
        editor.insertCharacter('e', "Arial", 12, 20, 10);
        editor.insertCharacter('l', "Arial", 12, 30, 10);
        editor.insertCharacter('l', "Arial", 12, 40, 10);
        editor.insertCharacter('o', "Arial", 12, 50, 10);
        editor.insertCharacter('W', "Arial", 12, 60, 10);
        editor.insertCharacter('o', "Arial", 12, 70, 10);
        editor.insertCharacter('r', "Arial", 12, 80, 10);
        editor.insertCharacter('l', "Arial", 12, 90, 10);
        editor.insertCharacter('d', "Arial", 12, 100, 10);

        editor.renderDocument();

        System.out.println("\nNumber of unique character objects: " + characterFactory.getCharacterPoolSize());
    }

}
