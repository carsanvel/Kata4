package Controller;

import View.MailHistogramBuilder;
import View.HistogramDisplay;
import Model.Mail;
import Model.Histogram;
import View.MailListReaderBD;
import java.util.List;


public class Kata5 {

    public static void main(String[] args) {
        List<Mail> mailList = MailListReaderBD.read("kata5.db");
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
