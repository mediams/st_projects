package my20250123home.report;

public class CSVStrategy implements ReportGeneratorStrategy{
    @Override
    public void generateReport(String format) {
        System.out.println("Генерация отчёта в CSV");
    }
}
