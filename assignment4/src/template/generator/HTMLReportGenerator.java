package template.generator;

public class HTMLReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Generating HTML Report Header...");
    }

    @Override
    protected void formatBody() {
        System.out.println("Generating HTML Report Body...");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Generating HTML Report Footer...");
    }
}

