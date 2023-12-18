/***********************************************************************
 * Module:  Consumer.java
 * Author:  yjx
 * Purpose: Defines the Class Consumer
 ***********************************************************************/

import java.util.*;

/** @pdOid 385722f2-bdac-4090-aed2-c3a4ac7b8570 */
public class Consumer extends User {
   /** @pdOid c03309b4-47db-4d4d-8072-ff721ea4e98b */
   protected Integer consumerPhone;
   
   /** @pdOid 14a99ef2-0a64-44fb-9634-0e2cae61313c */
   public String consumerAddress;
   /** @pdOid cda670e7-76b5-46dc-84a5-032c042167b0 */
   public String consumerName;
   
   /** @pdRoleInfo migr=no name=Order assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order> order;
   /** @pdRoleInfo migr=no name=ViewCommentDemo assc=association11 */
   public ViewCommentDemo viewCommentDemo;
   
   /** @param addr
    * @pdOid ff2c9ad7-c593-430c-9f75-5b8b934f63ed */
   public boolean checkAddress(String addr) {
      // TODO: implement
      return addr == consumerAddress;
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