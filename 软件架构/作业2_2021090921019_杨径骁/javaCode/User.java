/***********************************************************************
 * Module:  User.java
 * Author:  yjx
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** 杨径骁
 * 1.0
 * @pdOid 18573961-ff05-4501-90fe-fdab9ffb2fa0 */
public class User {
   /** @pdOid 0aeac0ae-1e63-4d17-908e-d1bb697553cb */
   private Integer password;
   /** @pdOid 466d20a4-710a-4b6b-9a6e-8b11a03b766c */
   private Integer accountTele;
   
   /** @pdOid 7291562b-c141-4f30-be5f-66ae751cef23 */
   public int accountid;
   /** @pdOid 746ad015-837e-4a88-a5a6-0f7c9b61db0d */
   public String accountname;
   
   /** @pdOid 756efeed-bdf6-48c7-97a1-ff96de37eea2 */
   public int getAccountId() {
      // TODO: implement
      return this.accountid;
   }
   
   /** @pdOid bc4d95ac-4111-4c64-b692-658783a92714 */
   public static final String getAccountTele() {
      // TODO: implement
      return this.accountTele;
   }

}