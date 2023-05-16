import com.nokia.mid.sound.Sound;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Timer;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.StopTimeControl;

public class Class_107 {

   private static byte[] var_f;
   private static int[] var_5a;
   private static int var_69;
   private static int var_8c;
   private static Player var_e4;
   private static StopTimeControl var_12a;
   private static Player var_18d;
   private static StopTimeControl var_1ab;
   private static Sound[] var_1d3;
   private static Timer var_202 = new Timer();
   public static final String[] var_252 = new String[]{"audio/midi", "audio/x-wav"};


   public static void sub_3a(DataInputStream var0) throws Exception {
      byte var1 = var0.readByte();
      int var5 = var1;

      while(true) {
         --var5;
         if(var5 < 0) {
            var_69 = var0.readShort();
            var_f = new byte[var_69];
            var0.readFully(var_f);
            var_5a = new int[var_69 << 1];

            for(int var9 = 0; var9 < var_69; ++var9) {
               var_5a[var9 << 1] = var0.readInt();
               var_5a[(var9 << 1) + 1] = var0.readInt();
            }

            return;
         }

         byte var2 = var0.readByte();
         System.out.println("type = " + var2);
         int var3;
         byte[] var4;
         switch(var2) {
         case 0:
         case 1:
            var3 = var0.readInt();
            var4 = new byte[var3];
            var0.readFully(var4);
            ByteArrayInputStream var6 = new ByteArrayInputStream(var4);
            if(var2 == 0) {
               System.out.println("midi file..");
               var_e4 = Manager.createPlayer(var6, var_252[var2]);
               var_e4.realize();
               var_e4.prefetch();
               System.out.println("loaded midi file " + var3);
            } else {
               var_18d = Manager.createPlayer(var6, var_252[var2]);
               var_18d.realize();
               var_18d.prefetch();
            }
            break;
         case 2:
            byte var7 = var0.readByte();
            var_1d3 = new Sound[var7];

            for(int var8 = 0; var8 < var7; ++var8) {
               var3 = var0.readInt();
               var4 = new byte[var3];
               var0.readFully(var4);
               var_1d3[var8] = new Sound(var4, 1);
            }
         }
      }
   }

   public static void sub_93(int var0, int var1) throws Exception {
      byte var2 = var_f[var0];
      if(var2 != -1) {
         if(var2 == 2) {
            var_1d3[var_5a[var0 << 1]].play(var1);
         } else {
            Player var3 = var_e4;
            StopTimeControl var4 = var_12a;
            switch(var2) {
            case 1:
               var3 = var_18d;
               var4 = var_1ab;
            }

            if(var3.getState() == 400) {
               if(var_8c != 1 || var0 == 1) {
                  return;
               }

               var3.stop();
            }

            var_8c = var0;
            var3.setMediaTime((long)var_5a[var0 << 1]);
            System.out.println("start time = " + var_5a[var0 << 1]);
            int var5 = var_5a[var0 << 1];
            int var6 = var_5a[(var0 << 1) + 1];
            System.out.println("end time = " + var6);
            var_202.schedule(new Class_177(var3), (long)((var6 - var5) / 1000));
            var3.start();
         }
      }
   }

}
