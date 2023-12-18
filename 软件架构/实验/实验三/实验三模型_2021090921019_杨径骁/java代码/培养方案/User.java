/***********************************************************************
 * Module:  User.java
 * Author:  yjx
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 24294a96-6029-4520-90af-f580376a237d */
public class User {
   /** @pdRoleInfo migr=no name=Account assc=association4 mult=1..1 */
   public Account account;
   
   /** @pdOid 7b149818-384b-47d7-a166-a0da5df3a08f */
   public boolean login() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 1f0ac684-58bd-473b-b4cf-af6b1ac47b82 */
   public String viewLog() {
      // TODO: implement
      return null;
   }

}