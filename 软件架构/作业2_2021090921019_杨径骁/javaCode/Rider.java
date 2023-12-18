/***********************************************************************
 * Module:  Rider.java
 * Author:  yjx
 * Purpose: Defines the Class Rider
 ***********************************************************************/

import java.util.*;

/** @pdOid b226a808-a8d5-42ae-8b90-496d89d74eaa */
public class Rider extends User {
   /** @pdOid 288704bb-f8be-460d-b2d7-a64b9923ba2e */
   protected int riderOrderNum;
   
   /** @pdRoleInfo migr=no name=Order assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order> order;
   /** @pdRoleInfo migr=no name=ViewCommentDemo assc=1 */
   public ViewCommentDemo viewCommentDemo;
   
   /** @param num
    * @pdOid 4694e9ed-88e2-4dc8-a7cc-85942879d0ba */
   public boolean addOrderNum(int num) {
      // TODO: implement
      this.riderOrderNum = num;
      return treu;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Order> getOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOrder() {
      if (order == null)
         order = new java.util.HashSet<Order>();
      return order.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOrder */
   public void setOrder(java.util.Collection<Order> newOrder) {
      removeAllOrder();
      for (java.util.Iterator iter = newOrder.iterator(); iter.hasNext();)
         addOrder((Order)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOrder */
   public void addOrder(Order newOrder) {
      if (newOrder == null)
         return;
      if (this.order == null)
         this.order = new java.util.HashSet<Order>();
      if (!this.order.contains(newOrder))
         this.order.add(newOrder);
   }
   
   /** @pdGenerated default remove
     * @param oldOrder */
   public void removeOrder(Order oldOrder) {
      if (oldOrder == null)
         return;
      if (this.order != null)
         if (this.order.contains(oldOrder))
            this.order.remove(oldOrder);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOrder() {
      if (order != null)
         order.clear();
   }

}