package template.generator;

public abstract class ReportGenerator {

    // template method
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
    }

    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}

