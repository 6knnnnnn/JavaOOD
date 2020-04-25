package 设计模式.模板.etlJobs;

public abstract class AbstractETL {

    public void etlJob() {
        extractData();
        transformData();
        loadData();
        System.out.println("ETL job done.");
    }

    protected abstract void extractData();
    protected abstract void transformData();
    protected abstract void loadData();

}
