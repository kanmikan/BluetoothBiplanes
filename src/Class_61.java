import com.nokia.mid.ui.DeviceControl;
import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;
import java.io.IOException;


import java.lang.StringBuffer;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.media.MediaException;
import javax.microedition.lcdui.Image;
import com.encoder.jpg.*;

public final class Class_61 extends FullCanvas implements Runnable {

   public static int var_c;
   public static boolean var_42;
   public static boolean var_7d;
   public static boolean var_b8;
   public static boolean var_eb;
   public static boolean var_11b;
   public static boolean var_164;
   public static boolean var_1af;
   public static boolean var_1bd;
   public static boolean var_1f2;
   public static boolean var_234;
   public static boolean var_296;
   public static boolean var_2a8;
   public static boolean var_2ba;
   public static int var_2d9;
   public static int var_33a;
   public static int var_34b;
   public static int var_364;
   public static int var_392;
   public static int var_3e6;
   public static int var_3f5;
   public static final int[] var_42f = new int[]{239, 16};
   public static Random var_450;
   public static int var_4a3;
   public static int var_4d9 = 10;
   public static int var_52b;
   public static int[] var_556;
   public static int[] var_5ad;
   public static int[] var_5fc;
   public static int[] var_60f;
   public static boolean[] var_66a;
   public static boolean[] var_680;
   public static boolean[] var_6b2;
   public static long var_6fc;
   public static int var_71a;
   public static int var_746;
   public static int var_7a2;
   public static int var_7e4;
   public static int var_809;
   public static int var_866;
   public static int var_8b0;
   public static int var_8da;
   public static int var_934;
   public static int var_964;
   public static int var_9aa;
   public static int var_9e2;
   public static int var_9f5;
   public static int var_a36;
   public static int var_a87;
   public static int var_abf;
   public static int var_b07;
   public static int var_b19;
   public static int var_b73;
   public static int var_bb9;
   public static int var_c10;
   public static int var_c71;
   public static int var_ccf;
   public static DataInputStream var_cfd;
   public static Class_bd[] var_d3e;
   public static Image[] var_d4f;
   public static Image[] var_d93;
   public static Image[] var_dac;
   public static Image var_def;
   public static Image var_dfe;
   public static Image var_e36;
   public static Image var_e4c;
   public static Image var_e7c;
   public static Image var_ed8;
   public static Graphics var_f29;
   public static Graphics var_f5a;
   public static Graphics var_fa3;
   public static Graphics var_fd9;
   public static String[] var_1031;
   public static String[] var_107b;
   public static Class_71 var_10de;
   public static Class_71 var_1136;
   public static Class_71 var_115c;
   public static String var_11af;
   public static Class_140 var_120a;
   
   public static byte[] var_1230;
   
   public static byte[] var_125d;
   public static byte var_12be;
   public static Class_8e[] var_12cc;
   public static BluetoothBiplanes var_12ea;
   public static Class_bd var_12fb;
   public static Class_bd var_1326;
   public static Class_bd var_1388;
   public static Class_bd var_13aa;
   public static int var_13f0;
   public static int var_142b;
   public Thread var_147f;
   public static final int[] var_14b2 = new int[]{9578383, 2593407, 281486};
   public static final int[] var_1508 = new int[]{16776704, 16768512, 16757760, 16711937};
   public static int[] var_155e;
   public static int[] var_15af;
   public static int var_15cd;
   public static int var_15e3;
   public static int var_160c;
   public static int var_1653;
   public static int var_166d;
   public static int var_168c;
   public static int var_16c9;
   public static int var_1720;
   public static int var_1751;
   public static int var_1793;
   public static Image var_17f1;
   public static Image var_182b;
   public static Image var_187b;
   public static Image var_1887;
   public static Image var_18eb;
   public static Image var_194b;
   public static Graphics var_198c;
   public static Graphics var_1996;
   public static final String[] var_19a3 = new String[]{"Engine Sleep", "Engine Latency", "Bluetooth Sleep"};
   public static int var_19b4;
   public static int var_1a11 = 12;
   public static int var_1a56 = 5;
   public static int var_1a78 = 0;
   public static int var_1a82 = 0;
   public static int var_1a9f = 13;
   public static int var_1ab0 = 15;
   public static int var_1ac1 = 7;
   public static int var_1ae1;
   public static int var_1b0e;
   public static int var_1b26;
   public static int var_1b6d;
   public static String var_1b8b;
   public static int var_1bcc;
   public static int var_1bd9;
   public static int var_1c28;
   public static boolean var_1c3f;
   public static boolean var_1c5a;
   public static int var_1c97;
   public static int[] var_1ccb;
   public static int var_1ce1;
   public static int var_1d03;
   private static int var_1d23 = 43;
   public static String[] var_1d67 = new String[40];
   private static byte[] var_1d80 = new byte[8];
   private static byte[] var_1da0;
   private static byte[] var_1db0 = new byte[12];
   private static byte[] var_1def = new byte[15];
   private static byte[] var_1e0b = new byte[4];
   private static int[] var_1e39 = new int[256];
   private static boolean var_1e94 = false;
   private static final int[] var_1ef5 = new int[]{0, 2, 4, 7, 9, 11, 13, 16, 18, 20, 22, 24, 27, 29, 31, 33, 35, 37, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 73, 75, 77, 79, 81, 82, 84, 86, 87, 89, 91, 92, 94, 95, 97, 98, 99, 101, 102, 104, 105, 106, 107, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 119, 120, 121, 122, 122, 123, 124, 124, 125, 125, 126, 126, 126, 127, 127, 127, 128, 128, 128, 128, 128};
   private static final byte[][] var_1f2e = new byte[][]{{(byte)45, (byte)27, (byte)18, (byte)14, (byte)11, (byte)9, (byte)8, (byte)7, (byte)6, (byte)6}, {(byte)63, (byte)45, (byte)34, (byte)27, (byte)22, (byte)18, (byte)16, (byte)14, (byte)13, (byte)11}, {(byte)72, (byte)56, (byte)45, (byte)37, (byte)31, (byte)27, (byte)23, (byte)21, (byte)18, (byte)17}, {(byte)76, (byte)63, (byte)53, (byte)45, (byte)39, (byte)34, (byte)30, (byte)27, (byte)24, (byte)22}, {(byte)79, (byte)68, (byte)59, (byte)51, (byte)45, (byte)40, (byte)36, (byte)32, (byte)29, (byte)27}, {(byte)81, (byte)72, (byte)63, (byte)56, (byte)50, (byte)45, (byte)41, (byte)37, (byte)34, (byte)31}, {(byte)82, (byte)74, (byte)67, (byte)60, (byte)54, (byte)49, (byte)45, (byte)41, (byte)38, (byte)35}, {(byte)83, (byte)76, (byte)69, (byte)63, (byte)58, (byte)53, (byte)49, (byte)45, (byte)42, (byte)39}, {(byte)84, (byte)77, (byte)72, (byte)66, (byte)61, (byte)56, (byte)52, (byte)48, (byte)45, (byte)42}, {(byte)84, (byte)79, (byte)73, (byte)68, (byte)63, (byte)59, (byte)55, (byte)51, (byte)48, (byte)45}};
   private static int var_1f3f;
   private static int var_1f82;
   private static int var_1f9f;
   private static int var_1fff;
   private static int var_200b;
   private static int var_2049;
   private static int var_209a;
   private static int var_20e6;
   private static int var_2143;
   private static int var_2169;
   private static StringBuffer[] var_21b4;
   private static int[] var_21c4;
   private static int[] var_2225;
   private static int[] var_2256;
   private static int[] var_2260;
   private static int[] var_2280;
   private static long var_22aa;
   private static long var_22e0;
   private static long var_2301;
   private static boolean var_2349;
   private static int var_237c;
   private static final char[][] var_23c2 = new char[][]{{'0', '_'}, {'1', '-', '@'}, {'A', 'B', 'C', '2', 'a', 'b', 'c'}, {'D', 'E', 'F', '3', 'd', 'e', 'f'}, {'G', 'H', 'I', '4', 'g', 'h', 'i'}, {'J', 'K', 'L', '5', 'j', 'k', 'l'}, {'M', 'N', 'O', '6', 'm', 'n', 'o'}, {'P', 'Q', 'R', 'S', '7', 'p', 'q', 'r', 's'}, {'T', 'U', 'V', '8', 't', 'u', 'v'}, {'W', 'X', 'Y', 'Z', '9', 'w', 'x', 'y', 'z'}};
   
   public static int altura = 265; //original: 180
   public static int constante_168 = 248;

   public Class_61(BluetoothBiplanes var1) {
      var_12ea = var1;
      var_364 = this.getWidth();
      var_392 = this.getHeight();
	  
      if(var_364 == 128) {
         var_4a3 = 50;
      } else {
         var_4a3 = 25;
      }

      var_1f3f = 5;
      var_1f82 = var_1f3f + 3;
      var_209a = var_364 - 3;
      var_2049 = var_209a - 2;
      var_1fff = var_2049 - 6;
      var_1f9f = var_2049 - 8;
      var_200b = 0;
      var_2349 = false;
      var_2301 = System.currentTimeMillis();
      var_237c = 500;
      var_2225 = new int[]{2, 11};
      var_2256 = new int[]{10, 11};
      var_2260 = new int[]{var_392 - 48, var_392 - 28};
      var_2280 = new int[]{1, 0};
      var_21b4 = new StringBuffer[2];
      var_21c4 = new int[2];
      int var2 = 2;

      while(true) {
         --var2;
         if(var2 < 0) {
            var_142b = 666;
            var_1230 = new byte[18];
            var_450 = new Random();
            var_11af = "";
            DeviceControl.setLights(0, 100);
            var_164 = true;
            sub_1da();
            this.sub_2fb();
            var_1bd = true;
            return;
         }

         var_21b4[var2] = new StringBuffer();
      }
   }

   public static void sub_25(boolean var0) {}

   public static void sub_7c(String var0) {
      var_11af = var0;
   }

   public static void sub_ce(int var0, DataInputStream var1) { //bluetooth entrada
      try {
         var_866 = var0;
         Class_bd var2 = var_d3e[1];
         Class_bd var3 = var_d3e[0];
         var1.readFully(var_1230);
         byte var4 = 0;
         int var10 = var4 + 1;
         var2.var_5f = var_1230[var4]; //0
         if(var2.var_5f == 2) {
            var2.var_325 = 0;
         }

         var2.var_f6 = var_1230[var10++] & 255; //1
         
		 int data_y = var_1230[var10++]; //2 (posicion_y enviado como byte?)
		 var2.var_144 = data_y & 255;
		 
		 //debugme(data_y, "DATA_Y");
		 //debugme(data_y & 255, "DATA_Y & 255");
		 
         var2.var_96 = var2.var_f6 << 6;
         var2.var_e8 = var2.var_144 << 6;
         var2.var_154 = var_1230[var10++]; //3
         var3.var_325 = var_1230[var10++]; //4
         int var6 = 2;

         while(true) {
			
            --var6;
            if(var6 < 0) {
               for(int var7 = var_934; var7 < var_964; ++var7) {
                  var_556[var7] = (var_1230[var10++] & 255) * 2; //5
                  var_5ad[var7] = (var_1230[var10++] & 255) * 2; //6
               }

               var2.var_496 = var_1230[var10++]; //7
               if(var2.var_496 != 0) {
                  var2.var_4c4 = (var_1230[var10++] & 255) << 6; //8
                  var2.var_50d = (var_1230[var10++] & 255) << 6; //9
                  var2.var_5bb = var_1230[var10++]; //10
                  var2.var_65e = var_1230[var10++]; //11
               }

               if(var_866 > 1) {
                  var2.sub_5c(var_1230[var10++]); //12
               } else {
                  var2.var_6c3 = var_1230[var10++]; //13
               }

               byte var8 = var_1230[var10++]; //14
               if((var8 & 1) != 0) {
                  --var2.var_29f;
                  if(var2.var_29f < 0) {
                     var2.var_29f = 0;
                  }

                  sub_464(var3);
                  sub_634(var2);
               }

               if((var8 & 2) != 0) {
                  var2.sub_250();
               }

               if((var8 & 4) != 0) {
                  --var2.var_29f;
                  if(var2.var_29f < 0) {
                     var2.var_29f = 0;
                  }

                  sub_634(var2);
                  sub_464(var3);
               }

               if((var8 & 8) != 0) {
                  var3.var_496 = 3;
                  var3.var_5bb = 0;
                  var2.var_29f += 2;
                  sub_634(var2);
                  sub_464(var2);
               }

               if((var8 & 16) != 0) {
                  var2.var_8c3.var_496 = 5;
               }

               if((var8 & 32) != 0) {
                  var3.sub_250();
                  if(var3.var_496 == 0) {
                     var3.var_496 = 3;
                     var3.var_5bb = 0;
                     ++var2.var_29f;
                     sub_634(var2);
                     sub_464(var2);
                     var_12be = (byte)(var_12be + 64);
                  }
               }

               if((var8 & 64) != 0) {
                  ++var3.var_29f;
                  sub_634(var3);
                  sub_464(var3);
               }

               if((var8 & 128) != 0) {
                  sub_419();
               }
               break;
            }

            Class_ec var5 = var2.var_a3e[var6];
            var5.var_5e = var_1230[var10++] & 255;
            var5.var_ac = var_1230[var10++] & 255;
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public static boolean sub_ec(boolean var0) {
      var_b8 = var0;
      if(var_b8) {
         var_d3e[1].var_8de = true;
         if(var_d3e[0] == var_1326) {
            var_2d9 = 1;
         } else {
            var_2d9 = 2;
         }
      } else {
         var_11af = var_1031[44];
      }

      return var_b8;
   }

   public void sub_147() {
      switch(var_c) {
      case 7:
         if(var_9aa == 1 || var_1388 != var_12fb) {
            var_c = 2;
            return;
         }

         var_c = 8;
         if(!var_2a8) {
            this.sub_147();
         }
         break;
      case 8:
         var_c = 9;
         if(!var_2ba) {
            this.sub_147();
         }
         break;
      case 9:
         var_c = 10;
         if(!var_296) {
            this.sub_147();
         }
         break;
      case 10:
         var_c = 2;
      }

      this.sub_2fb();
   }

   private static void sub_18a(int var0) {
      var_680[var0] = true;
      sub_1ba();
   }

   private static void sub_1ba() {
      try {
         Class_f6.var_187 = sub_a0a("/tm"); //strings - menú
         int var0 = 3;

         while(true) {
            --var0;
            if(var0 < 0) {
               break;
            }

            if(!var_680[var0]) {
               Class_f6.var_187[4 + var0] = var_1031[5];
               Class_f6.var_187[27 + var0] = var_1031[5];
               Class_f6.var_187[38 + var0] = var_1031[5];
               Class_f6.var_187[43 + var0] = var_1031[5];
            }
         }
      } catch (Exception var1) {
         var1.printStackTrace();
      }

   }

   private static void sub_1da() {
      try {
         var_10de = new Class_71("/f"); //fuente - abecedario
         var_1136 = new Class_71("/fzr"); //fuente - numeros
         var_115c = new Class_71("/fzb"); //fuente - numeros 2
         var_1031 = sub_a0a("/tg"); //strings - interfaz
         var_107b = sub_a0a("/tt"); //strings - frases
         var_155e = new int[3];
         var_15af = new int[3];
         var_5fc = new int[4];
         var_60f = new int[4];
         int var0 = 4;

         while(true) {
            --var0;
            if(var0 < 0) {
               var_6b2 = new boolean[4];
               var_680 = new boolean[3];
               var_164 = true;
               var_1bd = true;
               if(!sub_22b()) {
                  sub_206(true);
               }

               var_16c9 = var_10de.sub_59(var_1031[11] + " 100% "); //crea un grafico del texto
               var_18eb = Image.createImage(var_16c9, 15);
               var_194b = Image.createImage(var_16c9, 15);
               var_198c = var_18eb.getGraphics();
               var_1996 = var_194b.getGraphics(); 
			   
               sub_1ba();
			   
               //var_7a2 = 255 - var_364; // 255 - width(240) : 15
               //var_7e4 = 208 - var_392; // 208 - height(320) : -112
               var_7a2 = 0;
			   var_7e4 = 0;
			   
			   
			   var_12cc = new Class_8e[50];
               int var1 = 50;
			   

               while(true) {
                  --var1;
                  if(var1 < 0) {
                     var_556 = new int[2];
                     var_5ad = new int[2];
                     var_66a = new boolean[2];
                     int var2 = 2;

                     while(true) {
                        --var2;
                        if(var2 < 0) {
                           var_b07 = sub_822(255) << 6;
                           var_b19 = sub_822(104);
                           var_d3e = new Class_bd[2];
                           int var3 = 2;

                           while(true) {
                              --var3;
                              if(var3 < 0) {
                                 var_d3e[0].var_8c3 = var_d3e[1];
                                 var_d3e[1].var_8c3 = var_d3e[0];
                                 var_cfd = new DataInputStream(var_d3e.getClass().getResourceAsStream("/r"));
                                 byte[] var4 = sub_a38();
                                 var_4a3 = var4[0];
                                 var_52b = var4[1];
                                 var_125d = sub_a38();
                                 byte[] var5 = sub_a38();
                                 Class_f6.sub_238(var5);
                                 sub_864();
                                 var_d4f = sub_8e4(32);
                                 var_def = sub_939();
                                 var_dfe = sub_939();
                                 Image var6 = sub_939();
                                 var_3e6 = var6.getWidth();
                                 var_3f5 = var6.getHeight();
                                 var_e36 = Image.createImage(var_3e6, var_3f5);
                                 var_f29 = var_e36.getGraphics();
                                 var_f29.drawImage(var6, 0, 0, 20);
                                 var_e4c = Image.createImage(26, 9);
                                 var_f5a = var_e4c.getGraphics();
                                 var_d93 = sub_8e4(72);
                                 var_dac = sub_96d(1);
                                 int var7 = var_d93[69].getWidth();
                                 int var8 = var_d93[69].getHeight();
                                 var_e7c = Image.createImage(var7, var8);
                                 var_fa3 = var_e7c.getGraphics();
                                 var_ed8 = Image.createImage(128, 100);
                                 var_fd9 = var_ed8.getGraphics();
                                 Class_107.sub_3a(var_cfd);
                                 var_cfd.close();
                                 var_cfd = null;
                                 System.gc();
                                 var_1ae1 = -1;
                                 var_c = 13;
                                 return;
                              }

                              var_d3e[var3] = new Class_bd(var3 == 0);
                           }
                        }

                        var_556[var2] = sub_822(255);
                        var_5ad[var2] = sub_822(104);
                        var_66a[var2] = sub_822(2) == 0;
                     }
                  }

                  var_12cc[var1] = new Class_8e();
               }
            }

            var_60f[var0] = 10;
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   public static void sub_206(boolean var0) {
      try {
         var_234 = true;
         RecordStore var1 = RecordStore.openRecordStore("s", true);
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         DataOutputStream var3 = new DataOutputStream(var2);
         if(var1.getSizeAvailable() >= 600) {
            for(int var4 = 0; var4 < 3; ++var4) {
               var3.writeBoolean(var_680[var4]);
            }

            for(int var5 = 0; var5 < 4; ++var5) {
               var3.writeByte((byte)var_5fc[var5]);
               var3.writeBoolean(var_6b2[var5]);
               var3.writeByte((byte)var_60f[var5]);
            }

            var3.writeBoolean(var_164);
            var3.writeBoolean(var_1bd);
            byte[] var6 = var2.toByteArray();
            if(var0) {
               var1.addRecord(var6, 0, var6.length);
            } else {
               var1.setRecord(1, var6, 0, var6.length);
            }

            var_234 = false;
         }

         var1.closeRecordStore();
         var3.close();
         var2.close();
      } catch (Exception var7) {
         var7.printStackTrace();
         var_234 = true;
      }

   }

   public static boolean sub_22b() {
      try {
         System.gc();
         RecordStore var0 = RecordStore.openRecordStore("s", true);
         if(var0.getNumRecords() > 0) {
            byte[] var1 = var0.getRecord(1);
            ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
            DataInputStream var3 = new DataInputStream(var2);

            for(int var4 = 0; var4 < 3; ++var4) {
               var_680[var4] = var3.readBoolean();
            }

            for(int var5 = 0; var5 < 4; ++var5) {
               var_5fc[var5] = var3.readByte();
               var_6b2[var5] = var3.readBoolean();
               var_60f[var5] = var3.readByte();
            }

            var_164 = var3.readBoolean();
            var_1bd = var3.readBoolean();
            var0.closeRecordStore();
            var3.close();
            var2.close();
            return true;
         }

         var0.closeRecordStore();
      } catch (Exception var6) {
         ;
      }

      return false;
   }

   public static void sub_24c(int var0, int var1) {
      try {
         if(var_164) {
            Class_107.sub_93(var0, var1);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void sub_295(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var10 = 50;

      while(true) {
         --var10;
         if(var10 < 0) {
            return;
         }

         if(var_12cc[var10].var_45 == -1) {
            int var8 = var4 - var3;
            int var7 = sub_822(var8) + var3;
            var8 = var6 - var5;
            int var9 = sub_822(var8) + var5;
            var_12cc[var10].sub_57(var1, var2, var7, var9);
            --var0;
            if(var0 == 0) {
               return;
            }
         }
      }
   }

   public static void sub_2d2(Class_bd var0) {
      if(var_9aa == 1) {
         if(Class_140.var_e5) {
            var0.sub_154(0, var_42f[1], altura, 3);
         } else {
            var0.sub_154(0, var_42f[0], altura, 2);
         }
      } else if(var_9aa == 0) {
         if(var0 == var_d3e[0]) {
            var0.sub_154(0, var_42f[1], altura, 3);
         } else {
            var0.sub_154(0, var_42f[0], altura, 2);
         }
      }

   }

   public void run() {
      var_7d = false;

      while(!var_7d) {
         DeviceControl.setLights(0, 100);

         try {
            long var1 = System.currentTimeMillis() - var_6fc;
            long var3 = (long)var_4a3 - var1;
            if(var3 > (long)var_4d9) {
               Thread.sleep(var3);
            }

            var_6fc = System.currentTimeMillis();
            this.sub_3c4();
            if(var_1ae1 >= 0) {
               this.sub_2fb();
            } else {
               switch(var_c) {
               case 0:
                  if(++var_c10 > 120) {
                     var_c = 2;
                  }
                  break;
               case 1:
               case 4:
                  if(var_9aa == 0) {
                     var_eb = true;
                  } else if(var_9aa == 1) {
                     var_eb = !var_b8 || var_809 - var_866 < 2;
                  }

                  if(!var_eb) {
                     ++var_ccf;
                     if(var_ccf > 50) {
                        if(var_1ae1 == -1) {
                           sub_69d(var_1031[18], 0);
                        }

                        var_ccf = 0;
                     }
                  } else {
                     var_ccf = 0;
                  }

                  if(var_eb && var_b8 && var_9aa == 1) {
                     Class_bd var5 = var_d3e[0];
                     byte var6 = 0;
                     int var11 = var6 + 1;
                     var_1230[var6] = (byte)var5.var_5f; //0
                     var_1230[var11++] = (byte)var5.var_f6; //1 (posicion x?)
                     var_1230[var11++] = (byte)var5.var_144; //2 (posicion y?)
                     int var7 = var5.var_154;
                     if(var5.var_1dd == 3) {
                        var7 += 16;
                     }

                     var_1230[var11++] = (byte)var7; //3
                     var_1230[var11++] = (byte)var5.var_8c3.var_325; //4
                     if(var5.var_8c3.var_325 > 2) {
                        var5.var_8c3.var_325 = 0;
                     }

                     int var8 = 2;

                     while(true) {
                        --var8;
                        if(var8 < 0) {
                           for(int var9 = var_8b0; var9 < var_8da; ++var9) {
                              var_1230[var11++] = (byte)(var_556[var9] / 2); //5
                              var_1230[var11++] = (byte)(var_5ad[var9] / 2); //6
                           }

                           var_1230[var11++] = (byte)var5.var_496; //7
                           if(var5.var_496 != 0) {
                              var_1230[var11++] = (byte)(var5.var_4c4 >> 6); //8
                              var_1230[var11++] = (byte)(var5.var_50d >> 6); //9
                              var_1230[var11++] = (byte)var5.var_5bb; //10
                              var_1230[var11++] = (byte)var5.var_65e; //11
                           }

                           if(var_809 > 1) {
                              var_1230[var11++] = (byte)var5.var_711; //12
                           } else {
                              var_1230[var11++] = (byte)var5.var_6c3; //13
                           }

                           var_1230[var11++] = var_12be; //14
						   
						   //for (int i=0; i < var_1230.length; i++){
						   //   System.out.print("(" + var_1230[i] + ")");
						   //}
						   
                           var_12be = 0;
                           var_120a.var_d8.writeInt(var_809); //bluetooth
						   
						   //envio la posicion original como INT aparte..
						   //var_120a.var_d8.writeInt(var5.var_144);
						   
                           var_120a.var_d8.write(var_1230);
                           var_120a.var_d8.flush();
						   
                           ++var_809;
                           break;
                        }

                        var_1230[var11++] = (byte)var5.var_a3e[var8].var_5e;
                        var_1230[var11++] = (byte)var5.var_a3e[var8].var_ac;
                     }
                  }

                  this.sub_2fb();
                  break;
               case 2:
                  this.sub_2fb();
                  break;
               case 3:
                  this.sub_2fb();
                  break;
               case 5:
               case 6:
               case 7:
                  this.sub_2fb();
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               default:
                  break;
               case 13:
                  if(var_c10 == 0) {
                     sub_24c(0, 1);
                  }

                  if(++var_c10 > 120) {
                     var_c10 = 0;
                     var_c = 0;
                     this.sub_2fb();
                  }
                  break;
               case 14:
                  ++var_33a;
                  if(var_33a == 50) {
                     var_33a = 0;
                     ++var_34b;
                     if(var_34b == 3) {
                        var_12ea.destroyApp(true);
                        var_12ea.notifyDestroyed();
                     } else {
                        this.sub_2fb();
                     }
                  }
               }
            }
         } catch (Exception var10) {
            var10.printStackTrace();
         }
      }

   }

   public void sub_2fb() {
      this.serviceRepaints();
      this.repaint();
      Thread.yield();
   }

   public static void sub_309() {
      var_12fb.var_8de = true;
      var_1326.var_8de = true;
	  
      if(var_2d9 == 1) {
         var_d3e[0].sub_126(0, var_42f[0], altura, 2);
         var_d3e[1].sub_126(0, var_42f[1], altura, 3);
      } else {
         var_d3e[0].sub_126(0, var_42f[1], altura, 3);
         var_d3e[1].sub_126(0, var_42f[0], altura, 2);
      }

      var_809 = 0;
      var_866 = 0;
      var_ccf = 0;
      var_9aa = 1;
      var_c = 1;
   }

   public static void sub_360(int var0) {
      switch(var0) {
		  case 0:
		  case 1:
		  case 2:
		  case 3:
			 if(var0 != 0 && !var_680[var0 - 1]) {
				sub_69d(var_1031[8], 0);
			 } else {
				var_d3e[0].var_6c3 = 35 + var0;
				Class_f6.sub_121(25);
			 }
			 break;
		  case 4:
			 Class_f6.sub_121(36);
			 break;
		  case 5:
			 Class_f6.sub_121(41);
			 break;
		  case 6:
			 sub_69d(var_1031[36], 0);
			 break;
		  case 7:
			 var_c = 11;
			 break;
		  case 8:
			 var_1bd = true;
			 sub_206(false);
			 break;
		  case 9:
			 var_1bd = false;
			 sub_206(false);
			 break;
		  case 10:
			 var_164 = true;
			 sub_206(false);
			 break;
		  case 12:
		  case 15:
		  case 11:
			 var_164 = false;
			 sub_206(false);
			 break;
		  case 13:
			 var_c = 12;
			 var_9e2 = 0;
			 break;
		  case 14:
			 var_def = null;
			 var_dfe = null;
			 System.gc();
			 var_c = 14;
			 var_33a = 0;
			 var_34b = -1;
			 break;
		  case 16:
		  case 17:
		  case 18:
		  case 19:
			 if(var0 - 16 != 0 && !var_680[var0 - 16 - 1]) {
				sub_69d(var_1031[8], 0);
			 } else {
				var_d3e[1].var_6c3 = 39 + var0 - 16;
				var_d3e[1].var_43d = var0 - 16;
				
				var_d3e[0].sub_126(0, var_42f[1], altura, 3);
				var_d3e[1].sub_126(0, var_42f[0], altura, 2);
				var_9aa = 0;
				Class_f6.sub_121(33);
			 }
			 break;
		  case 20:
			 var_c = 1;
			 break;
		  case 21:
			 if(var_9aa == 1) {
				var_120a.sub_89();
				var_11af = "";
				var_2d9 = 0;
				var_b8 = false;
			 }
			 break;
		  case 22:
			 var_1f2 = false;
			 var_c = 1;
			 var_9f5 = 30;
			 break;
		  case 23:
			 var_1f2 = true;
			 var_c = 1;
			 var_9f5 = 30;
			 break;
		  case 24:
		  case 25:
		  case 26:
		  case 27:
			 if(var0 != 24 && !var_680[var0 - 1 - 24]) {
				sub_69d(var_1031[8], 0);
				Class_f6.sub_121(0);
			 } else {
				var_120a = null;
				System.gc();
				var_120a = new Class_140();
				var_120a.sub_1b(false);
				var_b8 = false;
				var_1326 = var_d3e[0];
				var_12fb = var_d3e[1];
				var_d3e[1].var_6c3 = -1;
		
				var_d3e[0].sub_126(0, var_42f[0], altura, 2);
				var_d3e[1].sub_126(0, var_42f[1], altura, 3);
				var_12fb.var_8de = false;
				var_809 = 0;
				var_866 = 0;
				var_ccf = 0;
				var_934 = 0;
				var_964 = 1;
				var_8b0 = 1;
				var_8da = 2;
				var_9aa = 1;
				var_d3e[0].var_6c3 = 39 + var0 - 24;
				var_c = 1;
				var_9f5 = 30;
			 }
			 break;
		  case 28:
		  case 29:
		  case 30:
		  case 31:
			 if(var0 != 28 && !var_680[var0 - 1 - 28]) {
				sub_69d(var_1031[8], 0);
				Class_f6.sub_121(0);
			 } else {
				var_120a = null;
				System.gc();
				var_120a = new Class_140();
				var_120a.sub_1b(true);
				var_b8 = false;
				var_12fb = var_d3e[0];
				var_1326 = var_d3e[1];
		
				var_d3e[0].sub_126(0, var_42f[1], altura, 3);
				var_d3e[1].sub_126(0, var_42f[0], altura, 2);
				var_1326.var_8de = false;
				var_d3e[1].var_6c3 = -1;
				sub_634(var_1326);
				var_809 = 0;
				var_866 = 0;
				var_ccf = 0;
				var_8b0 = 0;
				var_8da = 1;
				var_934 = 1;
				var_964 = 2;
				var_9aa = 1;
				var_d3e[0].var_6c3 = 35 + var0 - 28;
				var_c = 1;
				var_9f5 = 30;
			 }
			 break;
		  case 32:
			 sub_309();
			 break;
		  case 33:
			 sub_69d(var_1031[37], 0);
			 break;
		  default:
			 break;
      }

   }

   public void sub_3c4() {
      if(var_13f0 > 0) {
         --var_13f0;
      } else {
         int var1 = Class_12c.sub_168();
         if(var_1ae1 >= 0) {
            switch(var1) {
            case 10:
               sub_78a(1);
               var_1b0e = 0;
               break;
            case 11:
               sub_78a(2);
               var_1b0e = 0;
               break;
            case 16:
               if(var_1c5a) {
                  var_1ae1 = -1;
                  this.sub_2fb();
               } else {
                  sub_78a(2);
                  var_1b0e = 0;
               }
            }

         } else {
            switch(var_c) {
            case 1:
            case 4:
               if(Class_12c.sub_140(10)) {
                  if(var_11b) {
                     --var_19b4;
                     if(var_19b4 < 0) {
                        var_19b4 = 2;
                     }

                     var_13f0 = 3;
                     return;
                  }

                  var_d3e[0].sub_1de();
               }

               if(Class_12c.sub_140(11)) {
                  if(var_11b) {
                     ++var_19b4;
                     var_13f0 = 3;
                     if(var_19b4 == 3) {
                        var_19b4 = 0;
                     }

                     return;
                  }

                  var_d3e[0].sub_208();
               }

               if(Class_12c.sub_140(12)) {
                  if(var_11b) {
                     switch(var_19b4) {
                     case 0:
                        --var_4a3;
                        if(var_4a3 < 0) {
                           var_4a3 = 0;
                        }
                        break;
                     case 1:
                        --var_4d9;
                        if(var_4d9 < 0) {
                           var_4d9 = 0;
                        }
                        break;
                     case 2:
                        --var_52b;
                        if(var_52b < 0) {
                           var_52b = 0;
                        }
                     }

                     return;
                  }

                  var_d3e[0].sub_183(2);
               }

               if(Class_12c.sub_140(13)) {
                  if(var_11b) {
                     switch(var_19b4) {
                     case 0:
                        ++var_4a3;
                        break;
                     case 1:
                        ++var_4d9;
                        break;
                     case 2:
                        ++var_52b;
                     }

                     return;
                  }

                  var_d3e[0].sub_183(3);
               }

               if(Class_12c.sub_140(14)) {
                  var_d3e[0].sub_46();
               }

               switch(var1) {
               case 16:
                  Class_f6.sub_121(30);
                  var_c = 2;
                  return;
               case 17:
                  var_d3e[0].sub_fa();
                  return;
               default:
                  return;
               }
            case 2:
               switch(var1) {
               case 10:
                  Class_f6.sub_175(0);
                  break;
               case 11:
                  Class_f6.sub_175(1);
               case 12:
               case 13:
               default:
                  break;
               case 14:
               case 15:
                  Class_f6.sub_175(2);
                  break;
               case 16:
                  if(Class_f6.var_2c != 66 && Class_f6.var_2c != 50) {
                     Class_f6.sub_121(0);
                  }
               }

               this.sub_2fb();
               break;
            case 3:
               switch(var1) {
               case 15:
                  var_1af = false;
                  var_c = 2;
                  break;
               case 16:
                  String var2 = var_1031[3] + var_21b4[0].toString();
                  var2 = var2 + var_1031[4];
                  this.sub_bb8(var_21b4[1].toString(), var2);
                  var_1af = false;
                  var_c = 2;
               }

               if(var1 == -66) {
                  return;
               }

               boolean var3 = false;
               int var4 = 666;

               for(int var5 = 0; var5 != 10; ++var5) {
                  if(var1 == var5) {
                     var4 = var5;
                     var3 = true;
                     break;
                  }
               }

               var_22aa = System.currentTimeMillis() - var_22e0;
               var_22e0 = System.currentTimeMillis();
               short var6 = 1050;
               if(!var3) {
                  if(var1 == 19) {
                     var4 = 19;
                  } else {
                     if(var1 == 20 && var_2169 > 0) {
                        sub_bc4(var_2169 - 1);
                        var_142b = var4;
                        return;
                     }

                     if(var1 == 21 && var_2169 < 1) {
                        sub_bc4(var_2169 + 1);
                        var_142b = var4;
                        return;
                     }
                  }
               }

               if(var4 == 666) {
                  return;
               }

               if(var_21b4[var_2169].length() >= var_2256[var_2169] && (!var3 || var_22aa >= (long)var6 || var_142b != var4 || var_2280[var_2169] == 0)) {
                  if(var3) {
                     return;
                  }

                  if(var1 != 19) {
                     return;
                  }
               }

               int var7 = var_2280[var_2169];
               if(var7 == 0) {
                  if(var3) {
                     var_21b4[var_2169].append(var4);
                     ++var_20e6;
                  } else if(var1 == 19) {
                     --var_20e6;
                     if(var_20e6 < 0) {
                        var_20e6 = 0;
                     } else {
                        var_21b4[var_2169].deleteCharAt(var_20e6);
                     }
                  }
               } else if(var3) {
                  if(var_22aa < (long)var6 && var_142b == var4) {
                     var_2349 = false;
                     var_2301 = System.currentTimeMillis() + (long)var_237c;
                     --var_20e6;
                     ++var_2143;
                     if(var_2143 >= var_23c2[var4].length) {
                        var_2143 = 0;
                     }

                     var_21b4[var_2169].setCharAt(var_20e6, var_23c2[var4][var_2143]);
                     ++var_20e6;
                  } else {
                     var_2143 = 0;
                     var_21b4[var_2169].append(var_23c2[var4][var_2143]);
                     ++var_20e6;
                  }
               } else if(var1 == 19) {
                  --var_20e6;
                  if(var_20e6 < 0) {
                     var_20e6 = 0;
                  } else {
                     var_21b4[var_2169].deleteCharAt(var_20e6);
                  }
               }

               var_142b = var4;
               break;
            case 5:
               if(var1 != -66) {
                  var_c = 7;
                  var_bb9 = Math.max(var_364, var_392) >> 1;
               }
            case 6:
            case 7:
            default:
               break;
            case 8:
            case 9:
            case 10:
               if(var1 == 16) {
                  this.sub_147();
                  return;
               }
               break;
            case 11:
               if(var1 == 16) {
                  var_c = 2;
                  var_1af = false;
               }

               if(var1 == 15) {
                  sub_69d(var_1031[21], 0);
               }
               break;
            case 12:
               if(var1 == 16) {
                  var_c = 2;
                  var_1af = false;
               }

               if(var1 == 15) {
                  ++var_9e2;
                  if(var_9e2 == 3) {
                     var_9e2 = 0;
                  }

                  this.sub_2fb();
               }
            }

         }
      }
   }

   public void sub_3d0() {
      if(this.var_147f == null) {
         this.var_147f = new Thread(this);
         this.var_147f.start();
      }

      var_42 = false;
   }

   public void keyPressed(int var1) {
      Class_12c.sub_59(var1);
   }

   public void keyReleased(int var1) {
      Class_12c.sub_e0(var1);
   }

   //VIEW: canvas del juego... probablemente.
   public void sub_3e1(Graphics var1) throws Exception {
      if(var_d3e[0].var_496 == 0) {
         var_71a = var_d3e[0].var_f6 - (var_364 >> 1);
         var_746 = var_d3e[0].var_144 - (var_392 >> 1);
      } else {
         var_71a = (var_d3e[0].var_4c4 >> 6) - (var_364 >> 1);
         var_746 = (var_d3e[0].var_50d >> 6) - (var_392 >> 1);
      }

      var_71a = var_71a < 0?0:(var_71a > var_7a2?var_7a2:var_71a);
      var_746 = var_746 < 0?0:(var_746 > var_7e4?var_7e4:var_746);
	  
      //byte var2 = 124;
	  int var2 = 204;
	  
      var1.setColor('\uccff');
      
	  //var1.fillRect(0, 0, var_364, var2);
	  var1.fillRect(0, 0, 240, 320); //limpiar canvas con un color de pantalla completa.
	  
	  var1.setColor(0x8F6D47);
	  var1.fillRect(0, var2, 240, 500); //dibujar suelo para rellenar el espacio sobrante.
	  
      var1.translate(-var_71a, -var_746);

      for(int var3 = 0; var3 < 255; var3 += 128) {
         var1.drawImage(var_def, var3, var2, 20); //fondo dentro de un juego parte de abajo
         var1.drawImage(var_dfe, var3, 0, 20); //parte de arriba del fondo
      }
	  
      int var4 = var_b07 >> 6;
      var1.drawImage(var_d93[57], var4, var_b19, 20); //zeppeling
	  var1.drawImage(var_e4c, var4 + var_1ab0, var_b19 + var_1ac1, 20); //puntuacion en el zeppeling
	  
	  //movimiento del zeppeling
      if(var_eb) {
         var_b07 += 16;
         if(var4 > 255) {
            var_b07 = -3200;
            var_b19 = sub_822(104);
         }
      }
	  //

      int var5 = 2;
	  //height: var_392

      while(true) {
         --var5;
         if(var5 < 0) {
            var1.drawImage(var_d93[1], 109, constante_168, 20); //granero
            int var7 = 2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  int var8 = 50;

                  while(true) {
                     --var8;
                     if(var8 < 0) {
                        var1.translate(var_71a, var_746);
                        if(var_392 < 208) {
                           int var9 = var_364 * var_364 / 255;
                           int var10 = var_71a * var9 / var_7a2;
                           var1.setColor(6684672);
                           var1.fillRect(0, var_392 - 2, var_364, 2);
                           var1.setColor(16711680);
                           var1.fillRect(var10, var_392 - 2, var9, 2);
                        }

                        if(var_c == 1 && (var_9aa == 0 || var_b8)) {
                           Class_bd var16;
                           if(var_9aa == 0) {
                              var16 = var_1326;
                           } else {
                              var16 = var_d3e[1];
                           }

                           int var11 = var16.var_f6;
                           int var12 = var16.var_144;
                           if(!sub_3fd(var11 - 8, var12 - 8, 16, 16)) {
                              Class_bd var17 = var16.var_8c3;
                              int var13 = sub_b39(var17.var_f6, var17.var_144, var11, var12);
                              int var14;
                              if(var13 >= 45 && var13 < 135) {
                                 var14 = var12 - var_746;
                                 if(var14 < 4) {
                                    var14 = 4;
                                 } else if(var14 > var_392 - 4) {
                                    var14 = var_392 - 4;
                                 }
                                 var1.drawImage(var_d93[63], var_364, var14, 10); //flecha derecha
                              } else if(var13 >= 135 && var13 < 225) {
                                 var14 = var11 - var_71a;
                                 if(var14 < 4) {
                                    var14 = 4;
                                 } else if(var14 > var_364 - 4) {
                                    var14 = var_364 - 4;
                                 }

                                 var1.drawImage(var_d93[61], var14, var_392, 33);
								 //printme(var_d93[61], "var_d93[61]");
								 
                              } else if(var13 >= 225 && var13 < 315) {
                                 var14 = var12 - var_746;
                                 if(var14 < 4) {
                                    var14 = 4;
                                 } else if(var14 > var_392 - 4) {
                                    var14 = var_392 - 4;
                                 }

                                 var1.drawImage(var_d93[62], 0, var14, 6);
								 //printme(var_d93[62], "var_d93[62]");
								 
                              } else if(var13 > 315 || var13 < 45) {
                                 var14 = var11 - var_71a;
                                 if(var14 < 4) {
                                    var14 = 4;
                                 } else if(var14 > var_364 - 4) {
                                    var14 = var_364 - 4;
                                 }

                                 var1.drawImage(var_d93[60], var14, 0, 17); //flecha arriba
                              }
                           }
                        }
						
                        if(var_a87 > 0) {
                           if(var_1bd && (var_9aa == 0 || var_b8)) {
                              if(var_abf == 3) {
                                 var1.drawImage(var_e36, 2, 2, 20); //cartel al ganar un punto.
                              } else {
                                 var1.drawImage(var_e36, var_364 - 2, 2, 24);
                              }
                           }

                           --var_a87;
                           if(var_a87 == 0) {
                              sub_419();
                           }
                        }

                        if(var_9f5 > 0) {
                           sub_66c(var1, var_1031[38], false);
                           --var_9f5;
                        }

                        return;
                     }

                     if(var_12cc[var8].var_45 != -1) {
                        var_12cc[var8].sub_c(var1);
                     }
                  }
               }

               boolean var15 = false;
               var1.drawImage(var_dac[0], var_556[var7], var_5ad[var7], 3); //nube
               if(var_9aa == 1) {
                  if(Class_140.var_e5 && var7 < var_8da || !Class_140.var_e5 && var7 >= var_8b0) {
                     var15 = true;
                  }
               } else {
                  var15 = true;
               }

               if(var15 && var_eb && sub_822(3) == 0) {
                  if(var_66a[var7]) {
                     var_556[var7] -= 2;
                     if(var_556[var7] < -32) {
                        var_556[var7] = 287;
                        var_5ad[var7] = sub_822(104);
                     }
                  } else {
                     var_556[var7] += 2;
                     if(var_556[var7] > 287) {
                        var_556[var7] = -32;
                        var_5ad[var7] = sub_822(104);
                     }
                  }
               }
            }
         }

         Class_bd var6 = var_d3e[var5];
         if(var6.var_8de) {
            if(var_9aa == 0 && var5 == 1) {
               var6.sub_218();
            }

            var6.sub_2b0(var1, var_eb && (var_9aa == 0 || var5 == 0));
         }
      }
   }

   public static boolean sub_3fd(int var0, int var1, int var2, int var3) {
      return var0 >= var_71a - var2 && var0 <= var_71a + var_364 && var1 >= var_746 - var3 && var1 <= var_746 + var_392;
   }

   public static void sub_419() {
      if(var_9aa == 0 && !var_1f2) {
         if(var_d3e[0].var_29f >= 10) {
            var_1388 = var_d3e[0];
            var_13aa = var_d3e[1];
            var_296 = false;
            var_2a8 = false;
            boolean var0 = false;
            var_2ba = var_1388.var_9a4;
            var_c71 = var_d3e[1].var_43d;
            if(var_13aa.var_29f < var_60f[var_c71]) {
               var_60f[var_c71] = var_13aa.var_29f;
               var0 = true;
            }

            if(var_1388.var_711 > var_5fc[var_c71]) {
               var_5fc[var_c71] = var_1388.var_711;
               var_2a8 = true;
            }

            if(var_2ba) {
               var_6b2[var_c71] = true;
            }

            if(var_c71 < 3 && !var_680[var_c71]) {
               sub_18a(var_c71);
               var_296 = true;
            }

            if(var_296 || var_2a8 || var_2ba || var0) {
               sub_206(false);
            }

            Class_f6.sub_121(0);
            var_c = 4;
            if(var_9aa == 1) {
               var_12be = (byte)(var_12be + 128);
            }
         } else if(var_d3e[1].var_29f >= 10) {
            Class_f6.sub_121(0);
            var_c = 4;
            var_1388 = var_d3e[1];
            var_13aa = var_d3e[0];
         }
      } else if(var_9aa == 1) {
         if(var_d3e[0].var_29f >= 10) {
            var_1388 = var_d3e[0];
            var_13aa = var_d3e[1];
            Class_f6.sub_121(0);
            var_c = 4;
         } else if(var_d3e[1].var_29f >= 10) {
            var_13aa = var_d3e[0];
            var_1388 = var_d3e[1];
            Class_f6.sub_121(0);
            var_c = 4;
         }
      }

      if(var_c == 4) {
         var_bb9 = Math.max(var_364, var_392) >> 1;
      }

   }

   public static void sub_464(Class_bd var0) {
      var_a87 = 45;
      if(var_1bd && (var_9aa != 1 || var_b8) && var0.var_6c3 != -1) {
         var_a36 = var0.var_6c3;
         var_abf = var0.var_1dd;
         int var1 = (var_a36 - 35) * 4;
         if(var0.var_29f < var0.var_8c3.var_29f) {
            var1 += 2;
         }

         var1 += sub_822(2);
         String[] var2 = var_10de.sub_23(var_107b[var1], var_3e6 - 12 - 32);
         var_f29.setColor(16777215);
         var_f29.fillRect(4, 2, var_3e6 - 8 + 1, var_3f5 - 4);
         Image var3 = var_d93[var_a36]; //avatar del enemigo.
         if(var_abf == 3) {
            var_f29.drawImage(var3, 4, 4, 20);
            var_10de.sub_11d(var_f29, var2, 40, 4, 20);
         } else {
            var_f29.drawImage(var3, var_3e6 - 4, 4, 24);
            var_10de.sub_11d(var_f29, var2, var_3e6 - 8 - 32, 4, 24);
         }

      }
   }

   //VIEW: "YOUR RECORDS"
   public static void sub_4c4(Graphics var0) {
      var0.setColor('\uccff');
      var0.fillRect(0, 0, var_364, var_392);
      var_fa3.setColor(16751203);
      var_fa3.fillRect(2, 2, 103, 78);
      var_fa3.drawImage(var_d93[69], 0, 0, 20);
      var_fa3.fillRect(11, 58, 77, 18);
      int var1 = 8;
		
	  for(int var3 = 0; var3 < 4; ++var3) {
         var_fa3.setColor(var_1508[var3]);
         var_fa3.fillRect(4, var1, 96, 13);
         Image var2 = var_d93[47 + var3];
         if(var3 > 0 && !var_680[var3 - 1]) {
            var2 = var_d93[52];
         }

         var_fa3.drawImage(var2, 7, var1 - 1, 20);
         var_10de.sub_137(var_fa3, var_5fc[var3] + "%", 65, var1 + 7, 6);
         if(var_60f[var3] < 10) {
            var_10de.sub_137(var_fa3, "10-" + var_60f[var3], 26, var1 + 7, 6);
         }

         if(var_6b2[var3]) {
            var_fa3.drawImage(var_d93[71], 87, var1 - 1, 20);
			//printme(var_d93[71], "var_d93[71]");
         }

         var1 += 17;
      }

      var_fa3.drawImage(var_d93[70], 50, 8, 20); //parte del menu "your records"
	  //printme(var_d93[70], "var_d93[70]"); 
	  
      int var4 = var_364 >> 1;
      int var5 = var_392 >> 1;
      var0.drawImage(var_e7c, var4, var5, 3); //menu "your records" tambien..
	  //printme(var_e7c, "var_e7c");
	  
      var_10de.sub_137(var0, var_1031[19], var4 - (var_e7c.getWidth() >> 1) + 8, var5 - (var_e7c.getHeight() >> 1) - 4, 20);
      sub_66c(var0, var_1031[7], false);
      sub_66c(var0, var_1031[20], true);
   }

   //VIEW: "HELP"
   public static void sub_4fe(Graphics var0) {
      var0.setColor('\uccff');
      var0.fillRect(0, 0, var_364, var_392);
      var_fd9.setColor(15466636);
      var_fd9.fillRect(0, 0, 128, 100);
      var_fd9.setColor(16751203);
      var_fd9.fillRect(2, 2, 124, 96);
      var_fd9.setColor(16776960);
      var_fd9.fillRect(57, 7, 12, 60);
      var_fd9.fillRect(7, 34, 114, 12);
      if(var_9e2 == 0) {
         var_fd9.fillRect(5, 68, 12, 10);
      }

      if(var_9e2 != 2) {
         var_fd9.fillRect(5, 80, 12, 10);
      }

      String[] var1;
      switch(var_9e2) {
      case 0:
         var_fd9.drawImage(var_d4f[17], 63, 39, 3);
         var_10de.sub_137(var_fd9, var_1031[22], 62, 14, 3);
         var_10de.sub_137(var_fd9, var_1031[23], 62, 60, 3);
         var1 = var_10de.sub_23(var_1031[25], 46);
         var_10de.sub_11d(var_fd9, var1, 4, 32, 20);
         var1 = var_10de.sub_23(var_1031[24], 46);
         var_10de.sub_11d(var_fd9, var1, 124, 32, 24);
         var_10de.sub_137(var_fd9, "#", 11, 73, 3);
         var_10de.sub_137(var_fd9, "*", 11, 85, 3);
         var_10de.sub_137(var_fd9, var_1031[26], 20, 73, 6);
         var_10de.sub_137(var_fd9, var_1031[27], 20, 85, 6);
         var_10de.sub_137(var_fd9, var_1031[23], 62, 60, 3);
         break;
      case 1:
         var_fd9.drawImage(var_d93[21], 63, 42, 3);
         var_fd9.drawImage(var_d93[28], 63, 32, 3);
         var1 = var_10de.sub_23(var_1031[28], 46);
         var_10de.sub_11d(var_fd9, var1, 4, 32, 20);
         var1 = var_10de.sub_23(var_1031[29], 46);
         var_10de.sub_11d(var_fd9, var1, 124, 32, 24);
         var_10de.sub_137(var_fd9, "*", 11, 85, 3);
         var_10de.sub_137(var_fd9, var_1031[30], 20, 85, 6);
         break;
      case 2:
         var_fd9.setClip(46, 40, 33, 16);
         var_fd9.drawImage(var_def, 0, 60, 36);
         var_fd9.setClip(0, 0, 128, 100);
         var_fd9.drawImage(var_d93[23], 63, 37, 3);
         var1 = var_10de.sub_23(var_1031[28], 46);
         var_10de.sub_11d(var_fd9, var1, 4, 32, 20);
         var1 = var_10de.sub_23(var_1031[29], 46);
         var_10de.sub_11d(var_fd9, var1, 124, 32, 24);
         var_10de.sub_137(var_fd9, var_1031[31], 5, 87, 6);
      }

      sub_66c(var0, var_1031[7], false);
      sub_66c(var0, var_1031[6], true);
      var0.drawImage(var_ed8, var_364 >> 1, var_392 >> 1, 3);
   }

   public static void sub_55f(Graphics var0) {
      var0.setColor('\uccff');
      var0.fillRect(0, 0, var_364, var_392);
      var_fa3.setColor(var_14b2[var_c - 8]);
      var_fa3.fillRect(2, 2, 103, 78);
      var_fa3.drawImage(var_d93[69], 0, 0, 20);
      var_fa3.setColor(16777215);
      var_fa3.fillRect(13, 60, 62, 14);
      var_fa3.drawImage(var_d93[var_1388.var_6c3 + 8], 6, 6, 20);
	  //printme(var_d93[var_1388.var_6c3 + 8], "var_d93[var_1388.var_6c3 + 8]");
	  
      int var1 = var_13aa.var_6c3 + 8;
      if(var_c == 10) {
         var1 = 48 + var_c71;
      }

      var_fa3.drawImage(var_d93[var1], 85, 60, 20);
      var_10de.sub_137(var_fa3, var_1031[12 + var_c - 8], 41, 66, 3);
      String[] var2 = var_10de.sub_23(var_1031[15 + var_c - 8], 78);
      var_10de.sub_11d(var_fa3, var2, 25, 6, 20);
      if(var_c == 9) {
         var_fa3.drawImage(var_d93[68], 6, 23, 20);
		 //printme(var_d93[68], "var_d93[68]");
      }

      var0.drawImage(var_e7c, var_364 >> 1, var_392 >> 1, 3); //menu "your records"
	  //printme(var_e7c, "var_e7c");
	  
      sub_66c(var0, var_1031[7], false);
   }


   //VIEW: PANTALLA DE VICTORIA
   public static void sub_5a8(Graphics var0) {
      int var1 = 240; // byte 124
      var0.setColor('\uccff');
      var0.fillRect(0, 0, var_364, var1);
      var0.translate(-var_1720, 0);

      for(int var2 = 0; var2 < 255 + var_1720; var2 += 128) {
         var0.drawImage(var_def, var2, var1, 20);
         var0.drawImage(var_dfe, var2, 0, 20);
      }
	  
      var0.translate(var_1720, 0);
      var_1720 += 2;
      if(var_1720 > 128) {
         var_1720 = 0;
      }

      int var3 = 3;

      while(true) {
         --var3;
         int var4;
         if(var3 < 0) {
            var4 = var_15cd >> 6;
            int var5 = var_160c >> 6;
            int var6 = var_15e3 >> 6;
            int var7 = var_166d >> 6;
            var0.drawImage(var_d93[64], var4, 20, 10);
            var0.drawImage(var_187b, var4 - 25, 17, 10);
			
            int var8 = sub_822(3);
            int var9 = var_1653 >> 6;
            var0.drawImage(var_d93[64], var5, 80 + var8 + var9, 10);
            var0.drawImage(var_1887, var5 - 25, 77 + var8 + var9, 10);
            var0.drawImage(var_d93[14 + sub_822(3)], var5 - 56, 75 + var9, 3);
            var0.drawImage(var_d93[14 + sub_822(3)], var5 - 14, 85 + var9, 3);
            var0.drawImage(var_d93[14 + sub_822(3)], var5 - 38, 93 + var9, 3);
            if(var_1751 - 32 - (var_16c9 >> 1) < var_364 >> 1) {
               var_1751 = var6;
            }

            var0.drawImage(var_d93[65], var_1751 - 24, 50, 10);
            var0.drawImage(var_18eb, var_1751 - 32, 50, 10);
            var0.drawImage(var_d93[66], var_1751 - 32 - var_16c9, 50, 10);
            var0.drawImage(var_17f1, var6, 50, 10);
            if(var_1793 - 32 - (var_16c9 >> 1) < var_364 >> 1) {
               var_1793 = var7;
            }

            var0.drawImage(var_d93[65], var_1793 - 24, 110, 10);
            var0.drawImage(var_194b, var_1793 - 32, 110, 10);
            var0.drawImage(var_d93[66], var_1793 - 32 - var_16c9, 110, 10);
            var0.drawImage(var_182b, var7, 110, 10);
            ++var_168c;
            if(var_168c > 350) {
               var_c = 7;
            }

            if(var_168c > 0 && (var_15cd >> 6 < (var_364 >> 1) + (var_364 >> 2) || var_168c > 300)) {
               var_15cd += 50;
            }

            if(var_168c > 70) {
               var_15e3 += 120;
            }

            if(var_168c > 100) {
               if(var_160c >> 6 < (var_364 >> 1) + (var_364 >> 2) || var_168c > 300) {
                  var_160c += 50;
               }

               if(var5 > (var_364 >> 1) + (var_364 >> 2)) {
                  var_1653 += 60;
               }
            }

            if(var_168c > 170) {
               var_166d += 120;
            }

            return;
         }

         var_155e[var3] -= 1 + var3;
         var0.drawImage(var_dac[0], var_155e[var3], var_15af[var3], 3);
		 //printme(var_dac[0], "var_dac[0]");
		 
         if(var_155e[var3] < -32) {
            var4 = var_392 / 3;
            var_15af[var3] = var4 * var3 + sub_822(var4);
            var_155e[var3] = var_364 + 32;
         }
      }
   }

   public static void sub_5bd(Class_bd var0, Class_bd var1) {
      var_c = 6;
      var_bb9 = 0;
      var_1793 = 0;
      var_1751 = 0;
      var_168c = 0;
      var_1653 = 0;
      var_166d = 0;
      var_160c = 0;
      var_15e3 = 0;
      var_15cd = 1024;
      if(var0.var_1dd == 3) {
         var_17f1 = var_d4f[16];
      } else {
         var_17f1 = var_d93[67];
      }

      if(var1.var_1dd == 3) {
         var_182b = var_d4f[16];
      } else {
         var_182b = var_d93[67];
      }

      var_187b = var_d93[var0.var_6c3 + 8];
      var_1887 = var_d93[var1.var_6c3 + 8];
      var_198c.setColor(16514043);
      var_198c.fillRect(0, 0, var_16c9, 15);
      var_198c.setColor(4671303);
      var_198c.drawLine(0, 0, var_16c9, 0);
      var_198c.drawLine(0, 14, var_16c9, 14);
      var_1996.setColor(16514043);
      var_1996.fillRect(0, 0, var_16c9, 15);
      var_1996.setColor(4671303);
      var_1996.drawLine(0, 0, var_16c9, 0);
      var_1996.drawLine(0, 14, var_16c9, 14);
      var_10de.sub_137(var_198c, var_1031[11] + var_1388.var_8aa, var_16c9 >> 1, 7, 3);
      var_10de.sub_137(var_1996, var_1031[11] + var_13aa.var_8aa, var_16c9 >> 1, 7, 3);
      int var2 = 3;

      while(true) {
         --var2;
         if(var2 < 0) {
            if(var_9aa == 1) {
               var_120a.sub_89();
               var_11af = "";
               var_2d9 = 0;
               var_b8 = false;
            }

            sub_24c(4, 0);
            return;
         }

         var_155e[var2] = sub_822(var_364);
         int var3 = var_392 / 3;
         var_15af[var2] = var3 * var2 + sub_822(var3);
      }
   }

   public static void sub_5f4(Graphics var0) {
      byte var1 = 5;
      short var2 = 130;
      byte var3 = 40;
      byte var4 = 20;
      byte var5 = 10;
      byte var6 = 20;
      var0.setColor(3355545);
      var0.fillRect(var1 - var5, var3 - var5 - var6, var_364 - (var1 << 1) + (var5 << 1), var4 * 3 + (var5 << 1) + var6);
      var0.setColor(16777215);
      String var7 = "MASTER";
      if(!Class_140.var_e5) {
         var7 = "SLAVE";
      }

      var0.drawString(var7, var1, var3 - var6, 20);

      for(int var8 = 0; var8 < 3; ++var8) {
         if(var8 == var_19b4) {
            var0.fillRect(var1 - 10, var3 + var8 * var4, 8, 10);
         }

         var0.drawString(var_19a3[var8], var1, var3 + var8 * var4, 20);
         String var9 = "";
         switch(var8) {
         case 0:
            var9 = Integer.toString(var_4a3);
            break;
         case 1:
            var9 = Integer.toString(var_4d9);
            break;
         case 2:
            var9 = Integer.toString(var_52b);
         }

         var0.drawString(var9, var2, var3 + var8 * var4, 20);
      }

   }

   public static void sub_634(Class_bd var0) {
      if(var_c != 4) {
         int var1 = var_1a78;
         if(var0.var_1dd == 2) {
            var1 = var_1a9f;
         }

         var_f5a.setColor(15131619);
         var_f5a.fillRect(var1, var_1a82, var_1a11, var_1a56);
         var_f5a.setColor(16777215);
         var_f5a.fillRect(var1, var_1a82 + var_1a56, var_1a11, var_1a56);
         Class_71 var2 = var_1136;
         if(var0 == var_12fb) {
            var2 = var_115c;
         }

         String var3 = Integer.toString(var0.var_29f);
         if(var3.length() == 1) {
            var3 = "0" + var3;
         }

         var2.sub_137(var_f5a, var3, var1 + 2, var_1a82, 20);
         var_b73 = 30;
      }
   }

   public static void sub_66c(Graphics var0, String var1, boolean var2) {
      int var3 = var_10de.sub_59(var1) + 4;
      int var4 = var_10de.var_24 + 4;
      int var5 = 0;
      if(!var2) {
         var5 = var_364 - var3;
      }

      var0.setColor(6488245);
      var0.fillRect(var5, var_392 - var4, var3, var4);
      var0.setColor(16776960);
      var0.fillRect(var5 + 1, var_392 - var4 + 1, var3 - 2, var4 - 2);
      var_10de.sub_137(var0, var1, var5 + 2, var_392 - var4 + 2, 20);
   }

   public void paint(Graphics var1) {
      try {
         if(var_1ae1 >= 0) {
            sub_6df(var1);
            String var8 = var_1031[6];
            if(var_1c5a) {
               var8 = var_1031[7];
            }

            sub_66c(var1, var8, false);
            return;
         }

         int var4;
         int var5;
         switch(var_c) {
         case 0:
            var1.drawImage(var_d93[0], 0, 0, 20); //este es el logo
            break;
         case 1: //fondo de menu, y creo que tambien del juego.
            this.sub_3e1(var1);
            if(var_11b) {
               sub_5f4(var1);
            }

            if(var_b73 > 0) {
               --var_b73;
               String var6 = var_12fb.var_29f + " - " + var_1326.var_29f;
               var_10de.sub_137(var1, var6, var_364 >> 1, var_392 >> 1, 3);
            }
            break;
         case 2:
            if(!var_1af) {
               var_eb = false;
               this.sub_3e1(var1);
               var_1af = true;
            }

            Class_f6.sub_61(var1, var_364, var_392, var_364, 1, 2, 4, Class_f6.var_2c != 14 && Class_f6.var_2c != 60 && Class_f6.var_2c != 92 && Class_f6.var_2c != 82?var_10de.var_24 + 4:16, var_10de);
            if(Class_f6.var_2c != 66 && Class_f6.var_2c != 50) {
               sub_66c(var1, var_1031[1], false);
            }

            sub_66c(var1, var_1031[39], true);
         case 3:
         default:
            break;
         case 4:
            var1.setColor(0);
            var1.fillRect(0, 0, var_364, var_392);
            var4 = var_12fb.var_f6 - var_71a;
            var5 = var_12fb.var_144 - var_746;
            var1.setClip(var4 - var_bb9, var5 - var_bb9, var_bb9 << 1, var_bb9 << 1);
            var_bb9 -= 8;
            if(var_bb9 <= 0) {
               sub_5bd(var_1388, var_13aa);
            }

            this.sub_3e1(var1);
            break;
         case 5:
            sub_5a8(var1);
            break;
         case 6:
         case 7:
            var1.setColor(0);
            var1.fillRect(0, 0, var_364, var_392);
            var4 = var_364 >> 1;
            var5 = var_392 >> 1;
            var1.setClip(var4 - var_bb9, var5 - var_bb9, var_bb9 << 1, var_bb9 << 1);
            sub_5a8(var1);
            if(var_c == 6) {
               var_bb9 += 8;
               if(var_bb9 > var_364 << 1) {
                  var_c = 5;
               }
            } else {
               var_bb9 -= 8;
               if(var_bb9 < 0) {
                  this.sub_147();
                  this.sub_2fb();
               }
            }
            break;
         case 8:
         case 9:
         case 10:
            sub_55f(var1);
            break;
         case 11:
            sub_4c4(var1);
            break;
         case 12:
            sub_4fe(var1);
            break;
         case 13:
            int var2 = var_10de.var_24 + 2;
            int var3 = var_392 - (var2 << 2) >> 1;
            var1.setColor('\u9aef');
            var1.fillRect(0, 0, var_364, var_392);
            var_10de.sub_137(var1, var_1031[32], var_364 >> 1, var3, 17);
            var_10de.sub_137(var1, var_1031[33], var_364 >> 1, var3 + var2, 17);
            var_10de.sub_137(var1, var_1031[34], var_364 >> 1, var3 + (var2 << 1), 17);
            var_10de.sub_137(var1, var_1031[35], var_364 >> 1, var3 + var2 * 3, 17);
            var1.drawImage(var_d4f[1], var_364 - 4, var_392 + 2, 40); //avion rojo del menu principal
            break;
         case 14:
            if(var_34b == -1) {
               var1.setColor('\u9aef');
               var1.fillRect(0, 0, var_364, var_392);
               var_10de.sub_137(var1, var_1031[45], var_364 >> 1, var_392 >> 1, 3);
            } else {
               var_def = Image.createImage("/ad" + var_34b + ".png");
               var1.drawImage(var_def, 0, 0, 20);
            }
         }

         if(!var_b8 && var_c == 1) {
            var_10de.sub_137(var1, var_11af, var_364 >> 1, 0, 17);
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public static void sub_69d(String var0, int var1) {
      var_1ae1 = var1;
      if(var_1b8b == var0) {
         if(var1 >= 0) {
            var_1b0e = 0;
         } else {
            var_1b0e = 2;
         }

         var_1c97 = 0;
      } else {
         var_1b8b = var0;
         int var2 = var_10de.sub_59(var0);
         if(var2 > 94) {
            sub_723(var0, 94, 58);
            var_1b26 = 100;
         } else {
            var_1b26 = var2 + 4 + 2;
            sub_723(var0, var2, 58);
         }

         var_1b6d = var_1bd9 + 4 + 2;
         var_1b0e = 2;
      }
   }

   public static void sub_6df(Graphics var0) {
      if(var_1b0e > -1) {
         boolean var1 = sub_7e7() != 0;
         int var2 = var_1b26;
         int var3 = var_1b6d;
         var2 >>= var_1b0e;
         var3 >>= var_1b0e;
         int var4 = var_364 - var2 >> 1;
         int var5;
         if(var_7e4 - var_746 < var_1b6d) {
            var5 = (var_392 >> 1) - var3 + var_10de.var_24 + 8;
         } else {
            var5 = var_392 - var3 - var_10de.var_24 - 8;
         }

         var0.setColor(6724044);
         int var6 = var2;
         if(var1) {
            var6 = var2 + 9;
         }

         var0.fillRect(var4, var5, var6, var3 + 1);
         ++var4;
         ++var5;
         var0.setColor(6488245);
         int var7 = var4 + var2 - 2;
         int var8 = var3 - 2;
         var0.drawRect(var4, var5, var7 - var4, var8);
         if(var1) {
            var0.drawRect(var7, var5, 8, var8);
         }

         if(var_1b0e == 0) {
            var4 += 2;
            var5 += 2;
            sub_74a(var0, var4, var5);
            var0.setColor(16777215);
            int var9 = var4 + var2 - 2;
            if((sub_7e7() & 1) != 0) {
               var0.drawImage(var_d93[58], var9, var5, 20);
			   printme(var_d93[58], "var_d93[58]");
            }

            if((sub_7e7() & 2) != 0) {
               var0.drawImage(var_d93[59], var9, var5 + var3 - 1 - 2 - 5, 20);
			   printme(var_d93[59], "var_d93[59]");
            }
         }

         --var_1b0e;
      }

   }

   public void showNotify() {
      Class_12c.sub_1bf();
      if(var_c == 1) {
         Class_f6.sub_121(30);
         var_c = 2;
         var_1af = false;
         Class_f6.var_1cb = 2;
      }

      Class_f6.var_1cb = 2;
   }

   public static void sub_723(String var0, int var1, int var2) {
      var_1c97 = 0;
      var_1bcc = var1;
      var_1bd9 = var2;
      var_1d03 = 0;
      boolean var3 = true;
      char[] var4 = var0.toCharArray();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;

      boolean var19;
      for(boolean var11 = false; !var10; ++var5) {
         char var12 = var4[var5];
         if(var12 == 32) {
            var8 += var_10de.var_46;
            var6 = var5;
            var9 = 0;
         } else if(var12 == 10) {
            var11 = true;
            var6 = var5;
            var9 = 0;
         } else {
            int var10000 = var_10de.sub_ca(var12);
            Class_71 var10001 = var_10de;
            int var13 = var10000 + 0;
            var9 += var13;
            var8 += var13;
            if(var8 > var1) {
               var11 = true;
            }
         }

         if(var5 == var4.length - 1) {
            var6 = var5 + 1;
            var11 = true;
            var10 = true;
            if(var7 > var5) {
               continue;
            }
         }

         if(var11) {
            var19 = var6 <= var7;
            if(var19) {
               var6 = var5;
            }

            var_1d67[var_1d03] = new String(var4, var7, var6 - var7);
            if(var19) {
               var7 = var6;
               var8 = 0;
            } else {
               var7 = var6 + 1;
               var8 = var9;
            }

            var11 = false;
            ++var_1d03;
         }
      }

      var_1ccb = new int[12];
      int var18 = 0;
      var19 = false;
      var_1c28 = 0;
      int var14 = 0;

      for(int var15 = 0; var14 < var_1d03; ++var14) {
         String var20 = var_1d67[var14];
         boolean var17 = false;
         int var21 = var_10de.var_24 + 1;
         if(var21 + var15 > var_1bd9) {
            var19 = true;
         }

         var15 += var21;
         if((var19 || var14 == var_1d03 - 1) && var15 > var_1c28) {
            var_1c28 = var15;
         }

         if(var19) {
            var_1ccb[var18++] = var14;
            var15 = var21;
            var19 = false;
         }
      }

      var_1ce1 = var18;
      var_1ccb[var18++] = var_1d03;
      if(var_1ce1 > 0) {
         var_1c28 -= var_10de.var_24 + 1;
      }

      var_1bd9 = var_1c28;
      var_1c5a = var_1ce1 == 0;
   }

   public static void sub_74a(Graphics var0, int var1, int var2) {
      var_1c3f = true;
      int var3 = 0;
      int var4 = 0;

      while(true) {
         if(var3 == var_1ccb[var4]) {
            ++var4;
            if(var4 > var_1c97) {
               return;
            }
         }

         String var5 = var_1d67[var3];
         if(var4 == var_1c97) {
            var_10de.sub_137(var0, var5, var1, var2, 20);
            var2 += var_10de.var_24 + 1;
         }

         ++var3;
      }
   }

   public static void sub_78a(int var0) {
      if(var0 == 2) {
         if(var_1c97 < var_1ce1) {
            ++var_1c97;
         }

         if(var_1c97 == var_1ce1) {
            var_1c5a = true;
         }
      } else if(var0 == 1 && var_1c97 > 0) {
         --var_1c97;
      }

      var_1c3f = false;
   }

   public static int sub_7e7() {
      int var0 = 0;
      if(var_1c97 > 0) {
         var0 |= 1;
      }

      if(var_1c97 < var_1ce1) {
         var0 |= 2;
      }

      return var0;
   }

   public static int sub_822(int var0) { //devuelve un numero random en un max como input?
      return Math.abs(var_450.nextInt() % var0);
   }

   public static void sub_864(){
	   try {
		  var_cfd.readFully(var_1d80);
		  var_cfd.readFully(var_1def);
		  var_cfd.readFully(var_1e0b);
		  var_1da0 = new byte[(var_cfd.readShort() & '\uffff') + 13];
		  var_cfd.readFully(var_1da0);
		  var_cfd.readFully(var_1db0);
	   } catch (IOException e){
		  ;
	   }
   }

   public static byte[] sub_8ae() throws IOException {
      int var0 = var_cfd.readShort() & '\uffff';
      byte[] var1 = new byte[var0];
      var_cfd.readFully(var1);
      int var2 = var_1da0.length;
      byte[] var3 = new byte[33 + var_1da0.length + var0 + 12 + 12];
      byte var4 = 0;
      System.arraycopy(var_1d80, 0, var3, var4, 8);
      var4 = 8;
      int var5 = var4 + 3;
      System.arraycopy(var_1def, 0, var3, var5, 15);
      var4 = 8;
      var5 = var4 + 10;
      var3[var5++] = var_cfd.readByte();
      var3[var5++] = var_cfd.readByte();
      var5 += 2;
      var3[var5++] = var_cfd.readByte();
      var3[var5++] = var_cfd.readByte();
      sub_9cf(var3, 12, 17);
      var4 = 33;
      System.arraycopy(var_1da0, 0, var3, var4, var2);
      var5 = var4 + var2;
      var5 += 2;
      var3[var5++] = (byte)(var0 >> 8);
      var3[var5++] = (byte)var0;
      System.arraycopy(var_1e0b, 0, var3, var5, 4);
      var5 += 4;
      System.arraycopy(var1, 0, var3, var5, var0);
      sub_9cf(var3, var5 - 4, var0 + 4);
      var5 += var0 + 4;
      System.arraycopy(var_1db0, 0, var3, var5, 12);
	  	  
      return var3;
   }

   public static Image[] sub_8e4(int var0) throws Exception {
      Image[] var1 = new Image[var0];

      for(int var3 = 0; var3 < var0; ++var3) {
         var1[var3] = sub_939();
      }

      return var1;
   }

   public static Image sub_939() throws Exception {
      byte[] var0 = sub_8ae();
      Image var1 = Image.createImage(var0, 0, var0.length);
	  //imagePrint(var1); //stdout de todas las imagenes en memoria.
      return var1;
   }
   
   /////////////PROPIO///////////////////////////////////////////
   
   public static void debugme(int data, String id){
	   System.out.println("[" + id + "]: " + Integer.toString(data));
   }
   
   public static void printme(Image image, String id){
	   System.out.println("[Imagen de la variable]: " + id);
	   imagePrint(image);
   }
   
   //imprime el binario de los objetos Image, para ser leidas via STDOUT.
   public static void imagePrint(Image image){
	  //byte[] rawBytes = getBinaryData(var1);
	  StringBuffer hexString = new StringBuffer();
	  JPGEncoder encoder = new JPGEncoder();
	  int quality = 100;
	  byte[] encodedImage = encoder.encode(image, quality);
	  
	  System.out.println("--------------");
	  for (int i = 0; i < encodedImage.length; i++) {
			String hex = Integer.toHexString(encodedImage[i] & 0xFF);
			if (hex.length() < 2) {
				hexString.append("0");
			}
			hexString.append(hex);
		}
      System.out.println(hexString.toString());
	  System.out.println("--------------");
   }

	///////////////////////////////////////////////////////////////

   public static Image[] sub_96d(int var0) {
      Image[] var1 = new Image[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = sub_a23();
      }

      return var1;
   }

   public static void sub_9cf(byte[] var0, int var1, int var2) {
      long var3 = 4294967295L;
      if(!var_1e94) {
         int var7 = 256;

         while(true) {
            --var7;
            if(var7 < 0) {
               var_1e94 = true;
               break;
            }

            long var5 = (long)var7;

            for(int var8 = 0; var8 < 8; ++var8) {
               if((var5 & 1L) != 0L) {
                  var5 = 3988292384L ^ var5 >> 1;
               } else {
                  var5 >>= 1;
               }
            }

            var_1e39[var7] = (int)var5;
         }
      }

      for(int var9 = 0; var9 < var2; ++var9) {
         var3 = (long)var_1e39[(int)((var3 ^ (long)(var0[var1 + var9] & 255)) & 255L)] & 4294967295L ^ var3 >> 8;
      }

      var3 ^= 4294967295L;
      var1 += var2;
      var0[var1] = (byte)((int)(var3 >> 24));
      var0[var1 + 1] = (byte)((int)(var3 >> 16));
      var0[var1 + 2] = (byte)((int)(var3 >> 8));
      var0[var1 + 3] = (byte)((int)var3);
   }

   public static String[] sub_a0a(String var0) throws IOException {
      DataInputStream var1 = new DataInputStream(var0.getClass().getResourceAsStream(var0));
      int var2 = var1.readInt();
      String[] var3 = new String[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.readUTF();
      }

      return var3;
   }

   public static Image sub_a23() {
      try {
         int var0 = var_cfd.readInt();
         byte[] var1 = new byte[var0];
         var_cfd.readFully(var1);
         return Image.createImage(var1, 0, var0);
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static byte[] sub_a38() {
      try {
         int var0 = var_cfd.readInt();
         byte[] var1 = new byte[var0];
         var_cfd.readFully(var1);
         return var1;
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }

   public static int sub_a6a(int var0) {
      try {
         var0 = sub_acd(var0 + 90);
         return sub_aee(var0);
      } catch (Exception var2) {
         System.out.println("cos: " + var2);
         return 0;
      }
   }

   public static int sub_acd(int var0) {
      return var0 < 0?360 + var0:(var0 > 359?var0 - 360:var0);
   }

   public static int sub_aee(int var0) {
	   
	  //debugme(var0, "var0 (sub_aee)");
	   
      try {
         return var0 < 90?var_1ef5[var0]:(var0 == 90?128:(var0 < 180?var_1ef5[180 - var0]:(var0 == 180?0:(var0 < 270?-var_1ef5[var0 - 180]:(var0 == 270?-128:(var0 < 360?-var_1ef5[360 - var0]:1))))));
      } catch (Exception var2) {
         System.out.println("sin: " + var2);
         return 1;
      }
   }

   public static int sub_b39(int var0, int var1, int var2, int var3) {
      boolean var4 = true;
      boolean var5 = true;
      int var6 = var0 - var2;
      int var7 = var1 - var3;
      if(var7 < 0) {
         var5 = false;
      }

      if(var6 < 0) {
         var4 = false;
      }

      if(var6 == 0) {
         return var7 >= 0?0:180;
      } else if(var7 == 0) {
         return var6 >= 0?270:90;
      } else {
         var6 = Math.abs(var6);
         var7 = Math.abs(var7);
         int var8 = var6 + var7;
         var6 = var6 * 10 / var8;
         var7 = var7 * 10 / var8;
         return !var4 && var5?var_1f2e[var6][var7]:(!var4 && !var5?90 + var_1f2e[var7][var6]:(var4 && !var5?180 + var_1f2e[var6][var7]:(var4 && var5?270 + var_1f2e[var7][var6]:-1)));
      }
   }

   public static int sub_b8a(int var0, int var1) {
      if(Math.abs(var0 - var1) <= Class_bd.var_b36) {
         return 0;
      } else {
         int var2;
         int var3;
         if(var1 >= var0) {
            var2 = var1 - var0;
            var3 = 360 - var1 + var0;
            return var2 <= var3?3:2;
         } else {
            var2 = var0 - var1;
            var3 = 360 - var0 + var1;
            return var2 <= var3?2:3;
         }
      }
   }

   public void sub_bb8(String var1, String var2) {}

   public static void sub_bc4(int var0) {
      var_20e6 = var_21b4[var0].length();
      var_2143 = 0;
      var_2349 = true;
      var_2301 = System.currentTimeMillis() + (long)var_237c;
      var_2169 = var0;
      var_20e6 = var_21b4[var_2169].length();
      var_2143 = 0;
   }

}
