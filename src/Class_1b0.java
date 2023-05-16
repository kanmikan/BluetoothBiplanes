import java.util.Vector;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class Class_1b0 implements DiscoveryListener {

   public Vector var_7a;
   private final Class_140 var_a3;


   private Class_1b0(Class_140 var1) {
      this.var_a3 = var1;
      this.var_7a = new Vector();
   }

   public void deviceDiscovered(RemoteDevice var1, DeviceClass var2) {
      this.var_7a.addElement(var1);
   }

   public void inquiryCompleted(int var1) {
      synchronized(this) {
         this.notify();
      }
   }

   public void servicesDiscovered(int var1, ServiceRecord[] var2) {}

   public void serviceSearchCompleted(int var1, int var2) {}

   public Class_1b0(Class_140 var1, Class_1f4 var2) {
      this(var1);
   }
}
