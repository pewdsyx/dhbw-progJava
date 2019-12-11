package AbstrakteKlassenUndInterface.appstore;

public class AppstoreTest {

    public static void main(String[] args) {
        Appstore appstore1 = new Appstore("AppStore");

        appstore1.addApp(new WasserwagenApp("testapp","Das ist ein Test",0.99));
    }

}
