package memento;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(Document document) {
        versions.add(document.save());
    }

    public void listVersions() {
        System.out.println("Available document versions:");
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public void restoreVersion(Document document, int versionIndex) {
        if (versionIndex >= 0 && versionIndex < versions.size()) {
            document.restore(versions.get(versionIndex));
        } else {
            System.out.println("Invalid version index.");
        }
    }
}

