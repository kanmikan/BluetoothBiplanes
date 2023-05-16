import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class BluetoothBiplanes extends MIDlet {

   private Class_61 var_39 = new Class_61(this);
   private Display var_63 = Display.getDisplay(this);


   public void startApp() {
      this.var_63.setCurrent(this.var_39);
      this.var_39.sub_3d0();
   }

   public void pauseApp() {}

   public void destroyApp(boolean var1) {}


   static {
      System.gc();
   }
}
