/***********************************************************************
 * Module:  User.java
 * Author:  yjx
 * Purpose: Defines the Class User
 ***********************************************************************/

import java.util.*;

/** @pdOid 8a135a89-fc8a-4220-8db1-d8da9d35de3b */
public class User {
   /** @pdRoleInfo migr=no name=Account assc=association4 mult=1..1 */
   public Account account;
   
   /** @pdOid 677719eb-6aea-4bb3-8599-4befb3656a9f */
   public boolean login() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 150fa2d3-be01-47e0-92de-3520b5758cdb */
   public String viewLog() {
      // TODO: implement
      return null;
   }

}