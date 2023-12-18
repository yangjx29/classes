
public class RiderDemo {
    public static void main(String[] args) {
        Rider rider1 = new 	Rider();
        rider1.m_Order = Order.getInstance();
        if(rider1.m_Order.acceptOrder(1)) {
            System.out.println("骑手接收订单1！");
        }
        rider1.m_Order.setDeliverStatus(false);
        rider1.m_Order.finishOrder(1);
        if(!rider1.m_Order.m_consumer.checkAddress(rider1.m_Order.m_consumer.consumerAddress)) {
            System.out.println("骑手未送达指定地点");
        }else if(!rider1.m_Order.checkTime("30")) {
            System.out.println("骑手已超时");
            rider1.m_Order.setDeliverStatus(true);
            rider1.m_Order.setDeliverTime();
        }else {
            System.out.println("骑手在规定时间内送达指定地点");
            rider1.m_Order.setDeliverStatus(true);
            rider1.m_Order.setDeliverTime();
        }
        if(rider1.addOrderNum()) {
            System.out.println("骑手完成订单加一");
        }

        viewCommentDemo vcd = new viewCommentDemo();
        System.out.println("得到的评价如下：");
        vcd.main(null);
    }



}