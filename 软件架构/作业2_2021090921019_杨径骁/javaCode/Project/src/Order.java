public class Order {
    public int orderId;
    public double orderPrice;
    public String orderTime;
    public String limitedTime;
    private String deliverStatus;
    private String foodStatus;
    public Discount m_Discount = new Discount();
    public Dish m_Dish=new Dish();
    public Comment m_Comment;
    public Consumer m_consumer=new Consumer();
    public Rider m_rider;
    public Store m_store;


    private static Order instance = new Order();

    public Order(){

    }

    public void finalize() throws Throwable {

    }

    //	饿汉单例模式
    public static Order getInstance() {
        return instance;
    }
    //	创建订单
    public void createOrder(){
        m_Dish.selectDish(m_Dish.dishName, m_Dish.dishNum);
        setOrderId();
        double price=setPrice(m_Dish);
    }

    public void setOrderId(){
        System.out.println("订单号为1！");
    }

    /**
     *
     * @param dish
     */
    public double setPrice(Dish dish){
        System.out.println("商品原价为100元！");
        return dish.dishPrice*dish.dishNum;
    }

    /**
     *
     * @param price
     */
    public boolean alterPrice(double price){
        return true;
    }

    /**
     *
     * @param price
     */
    public boolean payOrder(double price){
        if(m_Discount.useDiscount()) {
            System.out.println("成功使用优惠券！");
            if(alterPrice(price)) {
                System.out.println("实付80元");
            }
        }
        return false;
    }

    /**
     *
     * @param orderId
     */
    public boolean acceptOrder(int orderId){
        return true;
    }

    public boolean refuseOrder(int orderId){
        return true;
    }
    /**
     *
     * @param orderId
     */
    public void finishOrder(int orderId){
        System.out.println("请求完成订单"+orderId);
    }

    public boolean addOrderTime(){
        return false;
    }

    /**
     *
     * @param limitedTime
     */
    public boolean checkTime(String limitedTime){
        return true;
    }

    public void setDeliverStatus(boolean button){
        if(!button) {
            System.out.println("骑手配送中……");
        }else {
            System.out.println("骑手完成订单");
        }

    }

    public void setDeliverTime(){
        System.out.println("-------订单于 16：11pm 完成-------");
    }

    public void setFoodStatus(boolean button){
        if(!button) {
            System.out.println("商家备餐中……");
        }else {
            System.out.println("商家已出餐");
        }
    }
    public void setFoodTime(){
        System.out.println("-------备餐完成-------");
    }

    /**
     *
     * @param orderId
     */
    public Order viewOrder(int orderId){
        return null;
    }
}
