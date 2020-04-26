package 设计模式.观察者.抽象类;

import 设计模式.观察者.News;
import 设计模式.观察者.抽象类.publish.FinanceNewsPublisher;
import 设计模式.观察者.抽象类.publish.SportNewsPublisher;
import 设计模式.观察者.抽象类.subscribe.FinanceSubscriber;
import 设计模式.观察者.抽象类.subscribe.SportSubscriber;

public class Client {

    private static void case1() {
        // only subscribe to one publish
        FinanceNewsPublisher pubWSJ = new FinanceNewsPublisher("WSJ");
        FinanceSubscriber finSubKen = new FinanceSubscriber(pubWSJ, "Kenneth");

        pubWSJ.attach(finSubKen);

        pubWSJ.updateLatestNews(new News("Buffet", 12345, "Don't invest on Zoom"));
        pubWSJ.updateLatestNews(new News("XYZ", 12346, "Risky stocks..."));
        pubWSJ.updateMostPopularNews(new News("Allen", 1234689, "COVID 19 news"));

        pubWSJ.detach(finSubKen);

        pubWSJ.updateMostPopularNews(new News("ABC Author", 1234689, "COVID 19 Toronto"));
    }

    private static void case2() {
        SportNewsPublisher pubNBA = new SportNewsPublisher("NBA中国");
        SportNewsPublisher pubBD = new SportNewsPublisher("字节跳动");

        pubBD.attach(new SportSubscriber(pubBD, "Peter"));
        pubNBA.attach(new SportSubscriber(pubNBA, "Kenneth"));

        pubBD.updateLatestNews(new News("杨毅", 12345, "2020 NBA全明星回顾"));
        pubBD.updateLatestNews(new News("苏群", 12345789, "2020 扣篮大赛"));

        News newsTmac = new News("T-Mac", 12345, "7 times all star");
        pubNBA.updateLatestNews(newsTmac);
        pubNBA.updateMostPopularNews(new News("Tim Duncan", 12345, "NBA champions"));
        pubNBA.updateLatestNews(newsTmac); // should not print anything on subscriber side
    }


    public static void main(String[] args) {
//        case1();
        case2();
    }
}
