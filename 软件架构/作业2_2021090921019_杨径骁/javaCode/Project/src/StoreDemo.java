public class StoreDemo {
    public static void main(String[] args) {

        Store store=Store.getInstance();
        store.m_Order = Order.getInstance();


        boolean button = true;
        if(button) {
            if(store.m_Order.acceptOrder(1)) {
                System.out.println("商家接受订单1！");
                store.m_Order.setFoodStatus(false);
            }
        }else {
            if(store.m_Order.refuseOrder(1)) {
                System.out.println("商家拒绝订单1！");
                return;
            }
        }
        store.m_Order.finishOrder(1);
        store.m_Order.setFoodStatus(true);
        store.m_Order.setFoodTime();
        if(store.addOrderNum()) {
            System.out.println("商家完成订单加一");
        }

        System.out.println("得到的评价如下：");
        viewCommentDemo vcd = new viewCommentDemo();
        vcd.main(null);
    }
}
