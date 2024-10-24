package memento;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void editContent(String newContent) {
        this.content = newContent;
        System.out.println("Document updated: " + this.content);
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion save() {
        System.out.println("Saving version: " + content);
        return new DocumentVersion(content);
    }

    public void restore(DocumentVersion version) {
        this.content = version.getContent();
        System.out.println("Restored to version: " + this.content);
    }
}

