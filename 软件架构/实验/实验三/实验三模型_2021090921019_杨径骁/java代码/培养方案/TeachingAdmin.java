/***********************************************************************
 * Module:  TeachingAdmin.java
 * Author:  yjx
 * Purpose: Defines the Class TeachingAdmin
 ***********************************************************************/

import java.util.*;

/** @pdOid 7799437b-dbd2-46b7-b60b-133786558f3d */
public class TeachingAdmin extends User {
   /** @pdOid 565164f0-8666-484a-83d4-ce052a404bfb */
   private String name;
   /** @pdOid d8dcd659-c3ec-41c6-8471-1249bb782011 */
   private int account;
   /** @pdOid bdebdf22-5980-4dba-9c7d-66b27c66774b */
   private String password;
   
   /** @pdOid f6a0b2b9-b411-49a6-bfcb-74e0544b73d0 */
   public int id;
   /** @pdOid ba7c5b73-db3e-4fd5-8867-6c0704a13799 */
   public int department;
   
   /** @pdRoleInfo migr=no name=CultivationLog assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<CultivationLog> cultivationLog;
   /** @pdRoleInfo migr=no name=CultivationControl assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<CultivationControl> cultivationControl;
   /** @pdRoleInfo migr=no name=Cultivation assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Cultivation> cultivation;
   
   /** @pdOid 73ffc885-8f07-40db-b0a7-9dda3b17d373 */
   public boolean updateCultivation() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 6788bec6-b45a-4f21-b620-6b70f5cd4a96 */
   public boolean deleteCultivation() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 8b037350-3afe-4a41-9482-360523e398fa */
   public boolean addCultivation() {
      // TODO: implement
      return false;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CultivationLog> getCultivationLog() {
      if (cultivationLog == null)
         cultivationLog = new java.util.HashSet<CultivationLog>();
      return cultivationLog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivationLog() {
      if (cultivationLog == null)
         cultivationLog = new java.util.HashSet<CultivationLog>();
      return cultivationLog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivationLog */
   public void setCultivationLog(java.util.Collection<CultivationLog> newCultivationLog) {
      removeAllCultivationLog();
      for (java.util.Iterator iter = newCultivationLog.iterator(); iter.hasNext();)
         addCultivationLog((CultivationLog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivationLog */
   public void addCultivationLog(CultivationLog newCultivationLog) {
      if (newCultivationLog == null)
         return;
      if (this.cultivationLog == null)
         this.cultivationLog = new java.util.HashSet<CultivationLog>();
      if (!this.cultivationLog.contains(newCultivationLog))
         this.cultivationLog.add(newCultivationLog);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivationLog */
   public void removeCultivationLog(CultivationLog oldCultivationLog) {
      if (oldCultivationLog == null)
         return;
      if (this.cultivationLog != null)
         if (this.cultivationLog.contains(oldCultivationLog))
            this.cultivationLog.remove(oldCultivationLog);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivationLog() {
      if (cultivationLog != null)
         cultivationLog.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<CultivationControl> getCultivationControl() {
      if (cultivationControl == null)
         cultivationControl = new java.util.HashSet<CultivationControl>();
      return cultivationControl;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivationControl() {
      if (cultivationControl == null)
         cultivationControl = new java.util.HashSet<CultivationControl>();
      return cultivationControl.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivationControl */
   public void setCultivationControl(java.util.Collection<CultivationControl> newCultivationControl) {
      removeAllCultivationControl();
      for (java.util.Iterator iter = newCultivationControl.iterator(); iter.hasNext();)
         addCultivationControl((CultivationControl)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivationControl */
   public void addCultivationControl(CultivationControl newCultivationControl) {
      if (newCultivationControl == null)
         return;
      if (this.cultivationControl == null)
         this.cultivationControl = new java.util.HashSet<CultivationControl>();
      if (!this.cultivationControl.contains(newCultivationControl))
         this.cultivationControl.add(newCultivationControl);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivationControl */
   public void removeCultivationControl(CultivationControl oldCultivationControl) {
      if (oldCultivationControl == null)
         return;
      if (this.cultivationControl != null)
         if (this.cultivationControl.contains(oldCultivationControl))
            this.cultivationControl.remove(oldCultivationControl);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivationControl() {
      if (cultivationControl != null)
         cultivationControl.clear();
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