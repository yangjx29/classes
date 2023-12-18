public class User {

    public int accountId;
    public String accountName;
    Integer password;
    Integer accountTelephone;

    public User(){

    }

    public void finalize() throws Throwable {

    }
    public int getAccountId(){
        return 0;
    }

    /**
     *
     * @param accountId
     */
    public String getAccountTelephone(int accountId){
        return "";
    }
}//end User