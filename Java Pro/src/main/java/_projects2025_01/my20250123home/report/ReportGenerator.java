package my20250123home.report;

import java.util.Map;

class ReportGenerator {
    private static final Map<String, ReportGeneratorStrategy> STRATEGY_MAP = Map.of(
            "PDF", new PDFStrategy(),
            "CSV", new CSVStrategy()
    );


    public void generateReport(String format) {
        STRATEGY_MAP.getOrDefault(format, format1 -> System.out.println("Неизвестный формат")).generateReport(format);
    }
}

