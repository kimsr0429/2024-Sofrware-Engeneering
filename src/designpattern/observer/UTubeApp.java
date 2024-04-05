package designpattern.observer;

public class UTubeApp {
    public static void main(String[] args) {
        LandCh landCh = new LandCh();
        KoreanSubscriber ks1 = new KoreanSubscriber("꼬부기", landCh);
        KoreanSubscriber ks2 = new KoreanSubscriber("리자몽", landCh);

        landCh.setPrice(300000000);

        Subscriber ks3 = new KoreanSubscriber("피카츄", landCh);

        landCh.setPrice(290000000);
        landCh.removeSubscriber(ks2);
        landCh.setPrice(200000000);
    }
}
