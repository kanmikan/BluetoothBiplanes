import java.util.Vector;
import javax.bluetooth.DataElement;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class Class_1bd implements DiscoveryListener {

   public Vector var_3d;
   private final Class_140 var_6d;


   private Class_1bd(Class_140 var1) {
      this.var_6d = var1;
      this.var_3d = new Vector();
   }

   public void servicesDiscovered(int var1, ServiceRecord[] var2) {
      DataElement var3 = null;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         var3 = var2[var4].getAttributeValue(256);
         if(var3 != null && var3.getDataType() == 32 && ((String)var3.getValue()).equals("BIPLANES") && !this.var_3d.contains(var2[var4])) {
            this.var_3d.addElement(var2[var4]);
            break;
         }
      }

   }

   public void serviceSearchCompleted(int var1, int var2) {
      synchronized(this) {
         this.notify();
      }
   }

   public void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {}

   public void inquiryCompleted(int var1) {}

   public Class_1bd(Class_140 var1, Class_1f4 var2) {
      this(var1);
   }
}
