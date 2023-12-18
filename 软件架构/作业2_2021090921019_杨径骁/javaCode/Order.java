/***********************************************************************
 * Module:  Order.java
 * Author:  yjx
 * Purpose: Defines the Class Order
 ***********************************************************************/

import java.util.*;

/** @pdOid e73384a4-2894-4505-80f5-64a3693ae64b */
public class Order {
   /** @pdOid 8ad12274-6b58-487d-824a-e6b734cc2e22 */
   private String deliverStatus;
   /** @pdOid 323350c1-5242-4b41-b305-8a5b1fd4af9c */
   private String foodStatus;
   /** @pdOid 3caaeb8a-eace-4c2b-9907-95a23b3d60f1 */
   private time orderTime;
   
   /** @pdOid 041ee3be-cbf3-4253-9883-4a492220faee */
   public int orderId;
   /** @pdOid 3ffb8a54-484b-438c-a7c4-955add513af6 */
   public money orderPrice;
   /** @pdOid 0c1f6c9d-58be-407a-a2c7-2e18d79e5fa2 */
   public time limitedTime;
   
   /** @pdRoleInfo migr=no name=Discount assc=association12 mult=0..1 type=Composition */
   public Discount discount;
   /** @pdRoleInfo migr=no name=Dish assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Aggregation */
   public java.util.Collection<Dish> dish;
   /** @pdRoleInfo migr=no name=Order assc=association14 type=Aggregation */
   public Order orderB;
   
   /** @pdOid 562f6a60-9b9f-4aef-8bf9-94f84c2cb84f */
   public Order createOrder() {
      // TODO: implement
      return Order();
   }
   
   /** @param id
    * @pdOid 12fe8a1f-a3dd-4629-b37f-8462a53db116 */
   public static final void setOderId(int id) {
      // TODO: implement
      this.order = id;
   }
   
   /** @param price
    * @pdOid 2f6ba5cb-2e49-4a63-976b-e1d419f40ad6 */
   public void setPrice(int price) {
      // TODO: implement
      this.orderPrice = price
      return;
   }
   
   /** @param price
    * @pdOid 6063960b-52e9-4e66-8b6d-44c798b72499 */
   public void alterPrice(int price) {
      // TODO: implement
      this.orderPrice = price;
      return;
   }
   
   /** @pdOid 3d3e8977-a40d-4164-84c5-2adc84fda7a2 */
   public boolean payOrder() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 25fc71c6-0da5-4db1-87f3-4fcf38512252 */
   public boolean acceptOrder() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 80dd5d74-ce35-4aea-8120-4a545c28a76b */
   public boolean refuseOrder() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid a49dcc4a-b892-4b49-833a-76cdda3198ed */
   public void finishOrder() {
      // TODO: implement
   }
   
   /** @param time
    * @pdOid a27c0963-51da-48d8-842a-28aa99a3e3d2 */
   public boolean addOrderTime(Date time) {
      // TODO: implement
      
      return false;
   }
   
   /** @pdOid aa5ff8b5-3af8-46fd-9e5f-2d8cb52de3f1 */
   public boolean checkTime() {
      // TODO: implement
      return false;
   }
   
   /** @param time
    * @pdOid 06180bcd-a87b-408e-9df5-cd83908ad911 */
   public void setDeliverTime(Date time) {
      // TODO: implement
   }
   
   /** @param status
    * @pdOid 65e3153b-f6ce-424d-a99f-67831fdf2582 */
   public boolean setFoodStatus(int status) {
      // TODO: implement
      return false;
   }
   
   /** @param time
    * @pdOid 8151e4d9-319e-469f-a65e-a04412664b57 */
   public void setFoodTime(Date time) {
      // TODO: implement
   }
   
   /** @pdOid 29f9b59e-272f-4a48-a294-a80aac3d469d */
   public Order viewOrder() {
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

}