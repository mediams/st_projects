package my20250123home.report;

public class Main {
    public static void main(String[] args) {
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport("PDF");
        generator.generateReport("CSV");
        generator.generateReport("JSON"); // Новый формат не поддерживается!
    }
}
