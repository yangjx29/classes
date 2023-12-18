/***********************************************************************
 * Module:  CultivationControl.java
 * Author:  yjx
 * Purpose: Defines the Class CultivationControl
 ***********************************************************************/

import java.util.*;

/** @pdOid 63552fba-9321-4d2a-8911-8f7cbd7c101d */
public class CultivationControl {
   /** @pdOid 73af5a23-91da-48e4-b870-cc6d6a972df3 */
   private int permission;
   
   /** @pdOid 07cef4e2-e201-4e2e-bad1-addde83bd6c2 */
   public int systemId;
   /** @pdOid 8a2fde1f-dfb9-46ad-9ad8-9cf59c5d910f */
   public int version;
   
   /** @pdRoleInfo migr=no name=Cultivation assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Cultivation> cultivation;
   
   /** @pdOid 0d9cd179-9292-4abc-b372-8846266bc5ce */
   public int judgePermission() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid ea42164a-1453-498e-8c2f-a4858a5a9b4d */
   public void operatorCourse() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Cultivation> getCultivation() {
      if (cultivation == null)
         cultivation = new java.util.HashSet<Cultivation>();
      return cultivation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivation() {
      if (cultivation == null)
         cultivation = new java.util.HashSet<Cultivation>();
      return cultivation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivation */
   public void setCultivation(java.util.Collection<Cultivation> newCultivation) {
      removeAllCultivation();
      for (java.util.Iterator iter = newCultivation.iterator(); iter.hasNext();)
         addCultivation((Cultivation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivation */
   public void addCultivation(Cultivation newCultivation) {
      if (newCultivation == null)
         return;
      if (this.cultivation == null)
         this.cultivation = new java.util.HashSet<Cultivation>();
      if (!this.cultivation.contains(newCultivation))
         this.cultivation.add(newCultivation);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivation */
   public void removeCultivation(Cultivation oldCultivation) {
      if (oldCultivation == null)
         return;
      if (this.cultivation != null)
         if (this.cultivation.contains(oldCultivation))
            this.cultivation.remove(oldCultivation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivation() {
      if (cultivation != null)
         cultivation.clear();
   }

}