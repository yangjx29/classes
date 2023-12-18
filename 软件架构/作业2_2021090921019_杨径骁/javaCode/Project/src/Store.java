public class Store {
    public String storeName;
    public String storeAddress;
    public String storeOpeningHours;
    String hostName;
    private Integer hostIdCard;
    protected Integer storeOrderNum;
    public Order m_Order;
    public storeRole m_Comment=new storeRole();
    public Dish m_Dish = new Dish();


    private static Store instance = new Store();

    public Store(){
    }
    public static Store getInstance() {
        return instance;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
    public boolean addOrderNum(){
        return true;
    }

    /**
     *
     * @param name or dish
     */
    public Store searchStore(String keyword){
        System.out.println("找到商家1");
        m_Dish.SearchStore(keyword);
        return null;
    }
}
