package work2;

public interface ReportGenerator {
    String generateXml();

    String generateJson();
}
/**
 * Нарушен принцип разделения интерфейса, из-за чего класс AccountReportGenerator должен реализовывать класс,
 * который ему не нужен.
 * Для исправления необходимо интерфейс ReportGenerator переименовать в ReportGeneratorXml
 * и оставить в нем метод String generateXml().
 * Далее создать второй интерфейс ReportGeneratorJson и создать внутри метод String generateJson().
 * В таком случе класс DocumentReportGenerator будет наследовать оба интерфеса ReportGeneratorXml и ReportGeneratorJson,
 * а класс AccountReportGenerator - только интерфейс ReportGeneratorJson.
 */