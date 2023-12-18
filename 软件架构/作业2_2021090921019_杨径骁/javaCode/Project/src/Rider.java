public class Rider {
    protected int riderOrderNum;
    public Order m_Order;
    public Comment m_Comment;

    public Rider(){

    }

    public void finalize() throws Throwable {
        super.finalize();
    }
    public boolean addOrderNum(){
        return false;
    }
}
