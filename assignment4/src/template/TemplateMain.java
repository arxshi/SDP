package template;

import template.generator.HTMLReportGenerator;
import template.generator.PDFReportGenerator;
import template.generator.PlainTextReportGenerator;
import template.generator.ReportGenerator;

public class TemplateMain {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        ReportingSystem pdfReportingSystem = new ReportingSystem(pdfReport);
        System.out.println("Generating PDF Report:");
        pdfReportingSystem.generateReport();

        System.out.println();

        ReportGenerator htmlReport = new HTMLReportGenerator();
        ReportingSystem htmlReportingSystem = new ReportingSystem(htmlReport);
        System.out.println("Generating HTML Report:");
        htmlReportingSystem.generateReport();

        System.out.println();

        ReportGenerator plainTextReport = new PlainTextReportGenerator();
        ReportingSystem plainTextReportingSystem = new ReportingSystem(plainTextReport);
        System.out.println("Generating Plain Text Report:");
        plainTextReportingSystem.generateReport();
    }
}

