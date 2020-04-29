package 设计模式.创建者.构造函数参数过多;

public class Client {

    private static void case1() {
        Query.QueryBuilder builder = new Query.QueryBuilder();

        Query query = builder.addColumnName("price")
                .addTableName("service").setDbName("finance").setWhereCondition("productID = 1")
                .build();
        System.out.println(query);
    }

    private static void case2() {
        Query.QueryBuilder builder = new Query.QueryBuilder();

        Query query = builder.addColumnName("price, productName")
                .addTableName("service").setDbName("finance")
                .setWhereCondition("country = 'USCAN'")
                .setHavingCondition("AVG(price) >= 100 GROUP BY productName")
                .build();
        System.out.println(query);
    }

    private static void case3() {
//        // counter example
//        SimpleQuery sq = new SimpleQuery();
//        sq.setDbName("finance");
//        sq.setColumnNames(Arrays.asList("price, productName"));
//        sq.setTableNames(Arrays.asList("service"));
//        System.out.println(sq);
//        // "USE finance; SELECT price, productName FROM service"
//
//        // inconsistent state
//        sq.setWhereCondition("AVG(price) >= 100 GROUP BY productName");
//        System.out.println(sq);
//        // "USE finance; SELECT price, productName FROM service WHERE AVG(price) >= 100 GROUP BY productName"
    }


    public static void main(String[] args) {
        case1();
        case2();
//        case3();
    }
}
