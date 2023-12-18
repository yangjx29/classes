/***********************************************************************
 * Module:  Store.java
 * Author:  yjx
 * Purpose: Defines the Class Store
 ***********************************************************************/

import java.util.*;

/** @pdOid 3e9f9948-06a0-4695-9ee9-b1c14d333a2a */
public class Store extends User {
   /** @pdOid ba675e6c-16a3-49cb-b397-0187c8b2d2a0 */
   private Integer hostIdCard;
   
   /** @pdOid 7d5213ff-7468-4237-8f48-566e3d31436d */
   protected String hostName;
   /** @pdOid c1530b9a-5c0d-4fa1-b459-640df54fa173 */
   protected Integer storeOrderNum;
   
   /** @pdOid 4d717746-053a-4189-88b8-3cdb1bef1176 */
   public String storeName;
   /** @pdOid 2a83cce4-9ec1-4dd7-a098-2405e7c2064b */
   public String storeAddress;
   /** @pdOid 6743cbe6-265a-44a5-b4e3-9c5a5ad68679 */
   public String storeOpeningHours;
   
   /** @pdRoleInfo migr=no name=Dish assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Dish> dish;
   /** @pdRoleInfo migr=no name=Order assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Order> order;
   /** @pdRoleInfo migr=no name=Store assc=association13 type=Aggregation */
   public Store storeB;
   /** @pdRoleInfo migr=no name=ViewCommentDemo assc=association16 */
   public ViewCommentDemo viewCommentDemo;
   
   /** @param num
    * @pdOid c8c6144f-29a6-4bb9-b9b1-d76d92b8500a */
   public boolean addOrderNum(int num) {
      // TODO: implement
      storeOrderNum = num;
      return true;
   }
   
   /** @pdOid 98f34743-c423-4b31-a505-1e8110008cf9 */
   public static final String searchStore() {
      // TODO: implement
      return storeAddress;
   }
   
   /** @pdOid d1986471-4767-41ec-b515-76dda75a5783 */
   public Strore getInstance() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Dish> getDish() {
      if (dish == null)
         dish = new java.util.HashSet<Dish>();
      return dish;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDish() {
      if (dish == null)
         dish = new java.util.HashSet<Dish>();
      return dish.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDish */
   public void setDish(java.util.Collection<Dish> newDish) {
      removeAllDish();
      for (java.util.Iterator iter = newDish.iterator(); iter.hasNext();)
         addDish((Dish)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDish */
   public void addDish(Dish newDish) {
      if (newDish == null)
         return;
      if (this.dish == null)
         this.dish = new java.util.HashSet<Dish>();
      if (!this.dish.contains(newDish))
         this.dish.add(newDish);
   }
   
   /** @pdGenerated default remove
     * @param oldDish */
   public void removeDish(Dish oldDish) {
      if (oldDish == null)
         return;
      if (this.dish != null)
         if (this.dish.contains(oldDish))
            this.dish.remove(oldDish);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDish() {
      if (dish != null)
         dish.clear();
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