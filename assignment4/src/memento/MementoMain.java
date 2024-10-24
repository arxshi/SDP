package memento;

public class MementoMain {
    public static void main(String[] args) {
        Document document = new Document("Version 1: Initial Content");
        VersionControl versionControl = new VersionControl();

        versionControl.saveVersion(document);

        document.editContent("Version 2: Added more content");
        versionControl.saveVersion(document);

        document.editContent("Version 3: Final content changes");
        versionControl.saveVersion(document);

        versionControl.listVersions();

        versionControl.restoreVersion(document, 1); // restore to version 2
        System.out.println("Current Document Content: " + document.getContent());

        versionControl.restoreVersion(document, 0); // restore to version 1
        System.out.println("Current Document Content: " + document.getContent());
    }
}

