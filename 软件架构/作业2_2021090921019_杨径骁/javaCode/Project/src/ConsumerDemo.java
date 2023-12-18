import java.util.Scanner;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer consumer1 = new Consumer();
        System.out.println("成功创建顾客1！");
        consumer1.m_Order=Order.getInstance();
        Store store1=Store.getInstance();
        Scanner sc= new Scanner(System.in);
        String keyword = sc.next();


        System.out.println("顾客1查找商家：");
        store1.searchStore(keyword);
        System.out.println("顾客1查找商家结束");
        System.out.println("顾客1下单：");
        consumer1.m_Order.createOrder();
        consumer1.m_Order.payOrder(1);

        System.out.println("-----顾客1对订单1评价-----");
        boolean a=consumer1.m_Comment.giveComment(1, "好吃");
        if(a) {
            System.out.println(consumer1.m_Comment);
        }
    }


}