/***********************************************************************
 * Module:  User.java
 * Author:  yjx
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 1cb7354a-4894-49da-960f-13396b43cc2d */
public class User {
   /** @pdRoleInfo migr=no name=Account assc=association4 mult=1..1 */
   public Account account;
   
   /** @pdOid 7eefa416-4f64-4614-aa9e-5f9782e2cd7a */
   public boolean login() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 190dbf86-06f9-4278-be80-8ec6eca287cb */
   public String viewLog() {
      // TODO: implement
      return null;
   }

}