/***********************************************************************
 * Module:  Cultivation.java
 * Author:  yjx
 * Purpose: Defines the Class Cultivation
 ***********************************************************************/

import java.util.*;

/** @pdOid ebd2d734-c3b8-4ac0-896a-d9f5334e9641 */
public class Cultivation {
   /** @pdOid 13f1a831-d3a9-4f6e-bb05-b98bb7eb25ae */
   public int cultivationId;
   /** @pdOid ecd67769-b965-4660-b91b-b5afff1cbf77 */
   public String majory;
   /** @pdOid d6569d92-20ec-4600-b2d2-e2719dcb9b64 */
   public int grade;
   /** @pdOid 0150c15f-3695-41e3-b6a2-4d5dd8e6fe13 */
   public int credits;
   /** @pdOid 2c1a63d9-c0ee-4967-964c-504d41173439 */
   public String detail;
   /** @pdOid 37b57682-a1d2-4b72-9b74-ac85f87b0049 */
   public int version;
   
   /** @pdRoleInfo migr=no name=CultivationItem assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<CultivationItem> cultivationItem;
   /** @pdRoleInfo migr=no name=CultivationDB assc=association13 mult=1..1 */
   public CultivationDB cultivationDB;
   
   /** @pdOid 473688e7-3a30-4fad-8596-01dc739cbae4 */
   public String showCultivation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 550f7fc2-21e3-4890-bed0-814d091b390a */
   public String getDetails() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid a2ed9be5-94d2-44dc-b712-f501c0d8a51b */
   public String operateCultivation() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CultivationItem> getCultivationItem() {
      if (cultivationItem == null)
         cultivationItem = new java.util.HashSet<CultivationItem>();
      return cultivationItem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivationItem() {
      if (cultivationItem == null)
         cultivationItem = new java.util.HashSet<CultivationItem>();
      return cultivationItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivationItem */
   public void setCultivationItem(java.util.Collection<CultivationItem> newCultivationItem) {
      removeAllCultivationItem();
      for (java.util.Iterator iter = newCultivationItem.iterator(); iter.hasNext();)
         addCultivationItem((CultivationItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivationItem */
   public void addCultivationItem(CultivationItem newCultivationItem) {
      if (newCultivationItem == null)
         return;
      if (this.cultivationItem == null)
         this.cultivationItem = new java.util.HashSet<CultivationItem>();
      if (!this.cultivationItem.contains(newCultivationItem))
         this.cultivationItem.add(newCultivationItem);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivationItem */
   public void removeCultivationItem(CultivationItem oldCultivationItem) {
      if (oldCultivationItem == null)
         return;
      if (this.cultivationItem != null)
         if (this.cultivationItem.contains(oldCultivationItem))
            this.cultivationItem.remove(oldCultivationItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivationItem() {
      if (cultivationItem != null)
         cultivationItem.clear();
   }

}