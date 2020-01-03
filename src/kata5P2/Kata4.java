package kata5P2;

import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "emails.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
