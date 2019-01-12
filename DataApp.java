public class DataApp {
    public static void main(String[] args) {
        DataPresenter dPres = new DataPresenter();
        //DataProvider dProvid = new SimpleDataProvider();
        DataProvider dProvid = new FileDataProvider();
        dPres.showData(dProvid);
    }
}
