import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.microedition.io.StreamConnectionNotifier;

import javax.bluetooth.BluetoothStateException;
import java.io.IOException;

public class Class_140 implements Runnable {

   private static final UUID var_44 = new UUID("6252233F8F1E4beb85DBEB178C94826D", false);
   public DataInputStream var_83 = null;
   public DataOutputStream var_d8 = null;
   public static boolean var_e5 = false;
   public int var_122 = 0;
   public Thread var_17d = null;
   public StreamConnection var_1b2 = null;


   public void sub_1b(boolean var1) {
      var_e5 = var1;
      this.var_122 = 1;
      this.var_17d = new Thread(this);
      this.var_17d.start();
   }

   public void sub_46(int var1, byte[] var2) {
      try {
         this.var_d8.writeInt(var1);
         this.var_d8.writeInt(var2.length);
         this.var_d8.write(var2);
         this.var_d8.flush();
      } catch (Exception var4) {
         ;
      }

   }

   public void sub_89() {
      this.sub_46(-254, new byte[0]);
   }

   public void sub_c2() throws IOException {
      int var1 = this.var_83.readInt();
	  
	  //leo el int que envié?
	  //int posicion_y = this.var_83.readInt();
	  //Class_61.debugme(posicion_y, "POSICION_Y");
	  
      switch(var1) {
      case -255:
         this.sub_ef();
         Class_61.sub_25(false);
         this.var_122 = 4;
         break;
      case -254:
         this.sub_46(-255, new byte[0]);

         try {
            Thread.sleep(2000L);
         } catch (Exception var3) {
            ;
         }

         this.sub_ef();
         Class_61.sub_25(true);
         this.var_122 = 4;
         break;
      default:
         Class_61.sub_ce(var1, this.var_83);
      }

   }

   private void sub_ef() {
      try {
         if(this.var_83 != null) {
            this.var_83.close();
         }

         this.var_83 = null;
      } catch (Exception var5) {
         ;
      }

      try {
         if(this.var_d8 != null) {
            this.var_d8.close();
         }

         this.var_d8 = null;
      } catch (Exception var4) {
         ;
      }

      try {
         if(this.var_1b2 != null) {
            this.var_1b2.close();
         }

         this.var_1b2 = null;
      } catch (Exception var3) {
         ;
      }

      try {
         LocalDevice.getLocalDevice().setDiscoverable(0);
      } catch (Exception var2) {
         ;
      }

   }

   public boolean sub_148() throws Exception {
      LocalDevice var1 = LocalDevice.getLocalDevice();
      DiscoveryAgent var2 = var1.getDiscoveryAgent();
      if(!var_e5) {
         Class_61.sub_7c(Class_61.var_1031[40]);
         var1.setDiscoverable(10390272);
         String var3 = "btspp://localhost:6252233F8F1E4beb85DBEB178C94826D;name=BIPLANES";
         StreamConnectionNotifier var4 = (StreamConnectionNotifier)Connector.open(var3);

         try {
            this.var_1b2 = var4.acceptAndOpen();
            this.var_83 = new DataInputStream(this.var_1b2.openInputStream());
            this.var_d8 = new DataOutputStream(this.var_1b2.openOutputStream());
         } catch (Exception var14) {
            ;
         }

         var1.setDiscoverable(0);
         Class_61.sub_7c(Class_61.var_1031[41]);
      } else {
         Class_61.sub_7c(Class_61.var_1031[42]);
         var1.setDiscoverable(0);
         Class_1b0 var15 = new Class_1b0(this, (Class_1f4)null);
         synchronized(var15) {
            var2.startInquiry(10390272, var15);
            var15.wait();
         }

         if(var15.var_7a.size() == 0) {
            return false;
         }

         Enumeration var6 = var15.var_7a.elements();
         Class_1bd var7 = new Class_1bd(this, (Class_1f4)null);
         boolean var8 = false;
         RemoteDevice var9 = null;

         while(var6.hasMoreElements()) {
            var9 = (RemoteDevice)var6.nextElement();
            synchronized(var7) {
               var2.searchServices(new int[]{256}, new UUID[]{var_44}, var9, var7);
               var7.wait();
            }
         }

         if(var7.var_3d.size() == 0) {
            Class_61.sub_7c(Class_61.var_1031[43]);
            return false;
         }

         ServiceRecord var10 = (ServiceRecord)var7.var_3d.elementAt(0);
         String var11 = var10.getConnectionURL(0, false);
         this.var_1b2 = (StreamConnection)Connector.open(var11);
         this.var_83 = new DataInputStream(this.var_1b2.openInputStream());
         this.var_d8 = new DataOutputStream(this.var_1b2.openOutputStream());
         Class_61.sub_7c(Class_61.var_1031[41]);
      }

      return true;
   }

   public void run() {
      while(true) {
         try {
            if(this.var_122 != 4) {
               switch(this.var_122) {
               case 0:
                  Thread.yield();
                  continue;
               case 1:
                  if(Class_61.sub_ec(this.sub_148())) {
                     this.var_122 = 2;
                  } else {
                     this.var_122 = 4;
                  }

                  Thread.sleep((long)Class_61.var_52b);
                  continue;
               case 2:
                  this.sub_c2();
                  Thread.sleep((long)Class_61.var_52b);
               default:
                  continue;
               }
            }
         } catch (Exception var2) {
            this.var_122 = 4;
         }

         return;
      }
   }

}
