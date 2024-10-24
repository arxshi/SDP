package template.generator;

public class PlainTextReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Generating Plain Text Report Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Generating Plain Text Report Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Generating Plain Text Report Footer...");
    }
}

