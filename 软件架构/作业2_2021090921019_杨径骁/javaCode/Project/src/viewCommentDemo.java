

public class viewCommentDemo {
    viewCommentDemo(){

    }
    public static void main(String[] args) {
        storeRole store=new storeRole();
        riderRole rider=new riderRole();
        System.out.println(store.getCommentRole(1));
        System.out.println(rider.getCommentRole(1));
    }

}

interface commentType{
    public String getCommentType(int commendId);
}

class Good implements commentType{
    public String getCommentType(int commendId) {
        return "Good";
    }
}

class Bad implements commentType{
    public String getCommentType(int commendId) {
        return "Bad";
    }
}

abstract class Comment{

    public int commentId;
    public String commentTime;
    public String commentType;
    String commentWord;
    public String commentRole;
    public commentType m_commentType = new Good();
    public commentType m_commentType1 = new Bad();

    public Comment(){

    }

    public abstract String getCommentRole(int commendId);


    public abstract String getCommentWord(int commendId);

    public abstract boolean giveComment(int commendId,String s);

}

class storeRole extends Comment{

    public String getCommentRole(int commendId) {
        return "对商家"+"的评价类型为"+m_commentType.getCommentType(1);
    }
    String s;
    public String getCommentWord(int commendId) {
        return s;
    }

    public boolean giveComment(int commendId,String s) {
        this.s= s;
        return true;
    }
}

class riderRole extends Comment{
    public String getCommentRole(int commendId) {
        return  "对骑手"+"的评价类型为"+m_commentType1.getCommentType(1);
    }
    String s;
    public  String getCommentWord(int commendId) {
        return s;
    }
    public boolean giveComment(int commendId,String s) {
        this.s=s;
        return true;
    }
}

