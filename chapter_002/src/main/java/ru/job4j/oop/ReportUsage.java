package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
       JSONReport report = new JSONReport();
       HtmlReport htmlReport = new HtmlReport();
       String text1 = htmlReport.generate("Report's name", "Report's body");
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println(text1);

    }
}
