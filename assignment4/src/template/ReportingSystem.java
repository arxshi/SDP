package template;

import template.generator.ReportGenerator;

public class ReportingSystem {

    private ReportGenerator reportGenerator;

    public ReportingSystem(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generateReport();
    }
}

