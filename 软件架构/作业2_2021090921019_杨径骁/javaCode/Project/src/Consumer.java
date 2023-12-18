public class Consumer extends User {

    public String consumerAddress;
    public String consumerName;
    Integer consumerPhone;
    public Order m_Order;
    public Comment m_Comment;

    public Consumer(){

    }

    public void finalize() throws Throwable {
        super.finalize();
    }
    /**
     *
     * @param address
     */
    public Boolean checkAddress(String address){
        return false;
    }
}
