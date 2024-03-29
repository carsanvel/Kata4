package View;

import Model.Mail;
import Model.Histogram;
import java.util.List;

public class MailHistogramBuilder {

    public static Histogram build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }

    
}
