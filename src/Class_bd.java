import javax.microedition.lcdui.Graphics;

public class Class_bd {

   public int var_5f;
   public int var_96;
   public int var_e8;
   public int var_f6;
   public int var_144;
   public int var_154;
   public int var_190;
   public int var_1d1;
   public int var_1dd;
   public int var_1e8;
   public int var_221;
   public int var_269;
   public int var_29f;
   public int var_2c7;
   public int var_311;
   public int var_325;
   public int var_33c;
   public int var_376;
   public int var_3b0;
   public int var_405;
   public int var_43d;
   public int var_496;
   public int var_4c4;
   public int var_50d;
   public int var_560;
   public int var_590;
   public int var_5bb;
   public int var_618;
   public int var_65e;
   public int var_673;
   public int var_6c3;
   public int var_711;
   public int var_76f;
   public int var_7a1;
   public int var_7ab;
   public int var_7b7;
   public int var_7d6;
   public int var_807;
   public int var_850;
   public String var_8aa = "";
   public Class_bd var_8c3;
   public boolean var_8de;
   public boolean var_8e9;
   public boolean var_925;
   public boolean var_976;
   public boolean var_9a4;
   public boolean var_9f0;
   public Class_ec[] var_a3e = new Class_ec[2];
   public int[] var_a62;
   public int[] var_a7b;
   public int[] var_a8e;
   public static final int[] var_ada = new int[32];
   public static final int var_b36 = 22;


   public Class_bd(boolean var1) {
      int var2 = 2;

      while(true) {
         --var2;
         if(var2 < 0) {
            this.var_a62 = new int[6];
            this.var_a7b = new int[6];
            this.var_a8e = new int[6];
            int var3 = 6;

            while(true) {
               --var3;
               if(var3 < 0) {
                  this.var_8de = false;
                  this.var_8e9 = var1;
                  return;
               }

               this.var_a62[var3] = -1;
            }
         }

         this.var_a3e[var2] = new Class_ec(this);
      }
   }

   public void sub_46() {
      if(this.var_221 <= 0 && this.var_496 == 0) {
         if(this.var_5f == 1) {
            int var1 = 2;

            while(true) {
               --var1;
               if(var1 < 0) {
                  break;
               }

               if(this.var_a3e[var1].var_ac == 255) {
                  this.var_a3e[var1].sub_58(this.var_96, this.var_e8, this.var_1d1);
                  this.var_221 = 10;
                  return;
               }
            }
         }

      }
   }

   public void sub_5c(int var1) {
      this.var_711 = var1;
      this.var_8aa = Integer.toString(var1) + "%";
   }

   public void sub_a7(boolean var1) {
      ++this.var_2c7;
      if(var1) {
         ++this.var_311;
      }

      this.var_711 = this.var_311 * 100 / this.var_2c7;
      this.var_8aa = Integer.toString(this.var_711) + "%";
   }

   public void sub_fa() {
      if(this.var_5f != 2) {
         if(this.var_5f == 1 && this.var_496 == 0) {
            Class_61.sub_24c(5, 1);
            this.var_4c4 = this.var_96;
            this.var_50d = this.var_e8;
            this.var_496 = 1;
            int var1;
            if(this.var_1dd == 2) {
               var1 = Class_61.sub_acd(this.var_1d1 + 90);
            } else {
               var1 = Class_61.sub_acd(this.var_1d1 - 90);
            }

            this.var_560 = Class_61.sub_aee(var1) * 300 >> 7;
            this.var_590 = -(Class_61.sub_a6a(var1) * 300) >> 7;
         } else {
            if(this.var_496 == 1) {
               this.var_590 += -60;
               if(this.var_590 < 20) {
                  this.var_590 = 20;
               }

               this.var_496 = 2;
               this.var_65e = 1;
            }

         }
      }
   }

   public void sub_126(int var1, int var2, int var3, int var4) {
      this.var_1dd = var4;
      if(var4 == 3) {
         Class_61.var_12fb = this;
      } else {
         Class_61.var_1326 = this;
      }

      this.var_29f = 0;
      this.var_2c7 = 0;
      this.var_311 = 0;
      this.var_711 = 0;
      this.var_8aa = "000%";
      Class_61.sub_634(this);
      this.var_9a4 = true;
      int var5 = this.var_43d * 7;
      this.var_76f = Class_61.var_125d[var5++];
      this.var_7a1 = Class_61.var_125d[var5++];
      this.var_7ab = Class_61.var_125d[var5++];
      this.var_7b7 = Class_61.var_125d[var5++];
      this.var_7d6 = Class_61.var_125d[var5++];
      this.var_807 = Class_61.var_125d[var5++];
      this.var_850 = Class_61.var_125d[var5++];
      this.sub_154(var1, var2, var3, var4);
      this.var_f6 = var2;
      this.var_144 = var3;
   }

   public void sub_154(int var1, int var2, int var3, int var4) {
      this.var_5f = var1;
      this.var_96 = var2 << 6;
      this.var_e8 = var3 << 6;
      this.var_190 = 0;
      this.var_325 = 0;
      this.var_376 = 255;
      this.var_3b0 = 0;
      switch(var1) {
      case 0:
         this.var_154 = 1;
         if(var4 == 2) {
            this.var_1d1 = 270;
         } else {
            this.var_1d1 = 90;
         }
      default:
         this.var_9f0 = false;
         this.var_8de = true;
         this.var_925 = false;
         this.var_976 = false;
         this.var_496 = 0;
         int var5 = 6;

         while(true) {
            --var5;
            if(var5 < 0) {
               int var6 = 2;

               while(true) {
                  --var6;
                  if(var6 < 0) {
                     return;
                  }

                  this.var_a3e[var6].var_ac = 255;
               }
            }

            this.var_a62[var5] = -1;
         }
      }
   }

   public void sub_183(int var1) {
      if(this.var_1e8 <= 0 && this.var_496 == 0) {
         if(this.var_5f != 0) {
            if((this.var_1dd != 2 || var1 != 2) && (this.var_1dd != 3 || var1 != 3)) {
               ++this.var_154;
               if(this.var_154 == 16) {
                  this.var_154 = 0;
               }
            } else {
               --this.var_154;
               if(this.var_154 < 0) {
                  this.var_154 = 15;
               }
            }

            if(this.var_1dd == 2) {
               this.var_1d1 = var_ada[this.var_154];
            } else {
               this.var_1d1 = var_ada[this.var_154 + 16];
            }

            this.var_1e8 = 2;
         }
      } else {
         switch(this.var_496) {
         case 2:
            if(var1 == 2) {
               this.var_560 -= 10;
               if(this.var_560 < -45) {
                  this.var_560 = -45;
               }

               this.var_65e = 0;
            } else {
               this.var_560 += 10;
               if(this.var_560 > 45) {
                  this.var_560 = 45;
               }

               this.var_65e = 2;
            }
            break;
         case 4:
            if(var1 == 2) {
               this.var_4c4 -= 100;
               if(this.var_5bb == 2) {
                  this.var_5bb = 3;
               } else {
                  this.var_5bb = 2;
               }
            } else {
               this.var_4c4 += 100;
               if(this.var_5bb == 4) {
                  this.var_5bb = 5;
               } else {
                  this.var_5bb = 4;
               }
            }

            int var2 = this.var_4c4 >> 6;
            if(var2 > 109 && var2 < 145) {
               Class_61.sub_2d2(this);
            }
         }

      }
   }

   public void sub_1de() {
      if(this.var_496 == 0) {
         this.var_976 = true;
         switch(this.var_5f) {
         case 0:
            this.var_190 += 16;
            if(this.var_154 == 1 && this.var_190 > 125) {
               this.var_e8 -= 128;
               this.var_154 = 0;
            }

            if(this.var_190 > 250) {
               this.var_e8 -= 64;
               this.var_190 = 250;
               this.var_5f = 1;
               this.var_976 = false;
            }
            break;
         case 1:
            if(this.var_190 > 250) {
               return;
            }

            this.var_190 += Math.abs(Class_61.sub_aee(this.var_1d1)) * 8 >> 7;
            if(this.var_190 > 250) {
               this.var_190 = 250;
            }
         }

      }
   }

   public void sub_208() {
      if(this.var_496 == 0) {
         this.var_976 = false;
         switch(this.var_5f) {
         case 1:
            this.var_190 -= 8;
            if(this.var_190 < 0) {
               this.var_190 = 0;
            }
         default:
         }
      }
   }

   public void sub_218() {
      switch(this.var_5f) {
      case 0:
         this.sub_1de();
         if(this.var_190 >= 250 && this.var_154 < 2) {
            this.sub_183(3);
         }
         break;
      case 1:
         if(this.var_190 < 250) {
            this.sub_1de();
         }

         boolean var1 = false;
         if((this.var_144 > 182 - this.var_7a1 || this.var_f6 > 109 - this.var_7a1 && this.var_f6 < 145 + this.var_7a1 && this.var_144 > 168 - this.var_7a1) && (this.var_850 == 0 || Class_61.sub_822(this.var_850) == 0)) {
            if(this.var_154 < 4) {
               this.sub_183(3);
            } else if(this.var_154 > 4 && this.var_154 < 12) {
               this.sub_183(2);
            } else if(this.var_154 > 11) {
               this.sub_183(3);
            }

            var1 = true;
         }

         if(this.var_144 < this.var_807) {
            if(this.var_154 < 5) {
               this.sub_183(2);
            } else if(this.var_154 > 4 && this.var_154 < 9) {
               this.sub_183(3);
            }

            var1 = true;
         }

         int var3;
         if(!var1 && (this.var_76f == 0 || Class_61.sub_822(this.var_76f) == 0)) {
            int var2;
            if(this.var_8c3.var_496 == 0) {
               var2 = Class_61.sub_b39(this.var_96, this.var_e8, this.var_8c3.var_96, this.var_8c3.var_e8);
            } else {
               var2 = Class_61.sub_b39(this.var_96, this.var_e8, this.var_8c3.var_4c4, this.var_8c3.var_50d);
            }

            var3 = Class_61.sub_b8a(this.var_1d1, var2);
            if(var3 >= 2) {
               this.sub_183(var3);
            } else {
               this.sub_46();
            }
         }

         if(this.var_496 == 0 && this.var_325 == 2) {
            int var5 = 2;

            while(true) {
               --var5;
               if(var5 < 0) {
                  break;
               }

               Class_ec var7 = this.var_8c3.var_a3e[var5];
               if(var7.var_ac != 255 && this.var_8c3.var_8de) {
                  var3 = Math.abs(var7.var_5e - this.var_f6);
                  int var4 = Math.abs(var7.var_ac - this.var_144);
                  int var6 = var3 * var3 + var4 * var4;
                  if(var6 < 80 + this.var_7ab) {
                     this.var_925 = true;
                  }
               }
            }
         }

         if(this.var_925 && (this.var_154 > 12 || this.var_154 < 4)) {
            this.sub_fa();
         }
      }

      switch(this.var_496) {
      case 1:
         if(Class_61.sub_822(this.var_7b7) == 0) {
            this.sub_fa();
         }
         break;
      case 2:
         if(this.var_405 >= 2) {
            this.sub_183(this.var_405);
         }

         if(Class_61.sub_822(this.var_7d6) == 0) {
            this.var_405 = Class_61.sub_822(4);
         }
      case 3:
      default:
         break;
      case 4:
         if(this.var_4c4 >> 6 < 127) {
            this.sub_183(3);
         } else {
            this.sub_183(2);
         }
      }

   }

   public void sub_250() {
      Class_61.sub_24c(3, 1);
      this.var_5f = 2;
      this.var_154 = 0;
      this.var_9a4 = false;
      this.var_9f0 = false;
      this.var_325 = 0;
      int var1 = Class_61.sub_aee(this.var_1d1) >> 1;
      Class_61.sub_295(25, this.var_f6, this.var_144, var1 - 100, var1 + 100, -270, -50);
   }

   public void sub_2b0(Graphics var1, boolean var2) {
      int var4;
      int var5;
      int var6;
      if(var2 && !this.var_9f0) {
         if(this.var_976) {
            this.sub_1de();
         }

         switch(this.var_5f) {
         case 0:
            if(this.var_1dd == 2) {
               this.var_96 -= this.var_190;
            } else {
               this.var_96 += this.var_190;
            }
            break;
         case 1:
            this.var_96 += Class_61.sub_aee(this.var_1d1) * this.var_190 >> 7;
            int var3 = 0;
            var4 = Class_61.sub_a6a(this.var_1d1) * this.var_190 >> 7;
            this.var_e8 -= var4;
            if(this.var_154 > 1 && this.var_154 < 7) {
               this.var_190 -= Class_61.sub_a6a(this.var_1d1) >> 5;
               if(this.var_190 < 0) {
                  this.var_190 = 0;
               }
            } else if(this.var_154 > 9 && this.var_154 < 15) {
               this.var_190 -= Class_61.sub_a6a(this.var_1d1) >> 5;
               if(this.var_190 > 350) {
                  this.var_190 = 350;
               }
            }

            if(this.var_190 < 230) {
               var3 = 250 * (230 - this.var_190) / 230;
               this.var_e8 += var3;
            }

            if(var3 > var4) {
               this.var_976 = false;
            }
         case 2:
         default:
            break;
         case 3:
            ++this.var_269;
            if(this.var_269 > 50) {
               this.var_269 = 0;
               if(this.var_496 == 0) {
                  Class_61.sub_2d2(this);
               }
            }
         }

         switch(this.var_496) {
         case 1:
         case 5:
            this.var_4c4 += this.var_560;
            this.var_50d += this.var_590;
            this.var_590 += 10;
            if(this.var_560 > 8) {
               this.var_560 -= 8;
            } else if(this.var_560 < -8) {
               this.var_560 += 8;
            }

            if(this.var_5bb == 0) {
               this.var_5bb = 1;
            } else {
               this.var_5bb = 0;
            }
            break;
         case 2:
            this.var_4c4 += this.var_560;
            this.var_50d += this.var_590;
            ++this.var_673;
            if(this.var_673 > 1) {
               this.var_673 = 0;
               this.var_590 += -15;
               if(this.var_590 < 70) {
                  this.var_590 = 70;
               }
            }

            if(this.var_560 > 8) {
               this.var_560 -= 8;
            } else if(this.var_560 < -8) {
               this.var_560 += 8;
            } else {
               this.var_65e = 1;
            }

            ++this.var_618;
            if(this.var_618 > 3) {
               this.var_618 = 0;
               if(this.var_5bb == 0) {
                  this.var_5bb = 1;
               } else {
                  this.var_5bb = 0;
               }
            }
            break;
         case 3:
            this.var_50d -= 30;
            if(this.var_5bb != 3) {
               ++this.var_618;
               if(this.var_618 > 1) {
                  this.var_618 = 0;
                  ++this.var_5bb;
                  if(this.var_5bb == 3) {
                     this.var_5bb = 0;
                  }
               }

               ++this.var_673;
               if(this.var_673 == 40) {
                  this.var_673 = 0;
                  this.var_5bb = 3;
               }
            } else {
               ++this.var_673;
               if(this.var_673 > 3) {
                  this.var_673 = 0;
                  Class_61.sub_2d2(this);
               }
            }
         case 4:
         }

         if(this.var_1e8 > 0) {
            --this.var_1e8;
         }

         if(this.var_221 > 0) {
            --this.var_221;
         }

         this.var_f6 = this.var_96 >> 6;
         this.var_144 = this.var_e8 >> 6;
         var5 = this.var_4c4 >> 6;
         var6 = this.var_50d >> 6;
         if(this.var_5f < 2 && (this.var_144 > 182 || this.var_144 > 164 && this.var_f6 > 104 && this.var_f6 < 150)) {
            this.sub_250();
            Class_61.var_12be = (byte)(Class_61.var_12be + 2);
            if(this.var_496 == 0) {
               ++Class_61.var_12be;
               --this.var_29f;
               if(this.var_29f < 0) {
                  this.var_29f = 0;
               }

               Class_61.sub_634(this);
            }
         }

         if((this.var_496 == 1 || this.var_496 == 2 || this.var_496 == 5) && var6 > 185) {
            this.var_50d = 11840;
            if(this.var_590 > 160) {
               Class_61.var_12be = (byte)(Class_61.var_12be + 4);
               this.var_496 = 3;
               --this.var_29f;
               if(this.var_29f < 0) {
                  this.var_29f = 0;
               }

               Class_61.sub_464(this.var_8c3);
               Class_61.sub_634(this);
            } else {
               this.var_496 = 4;
               if(var5 > 109 && var5 < 145) {
                  Class_61.sub_2d2(this);
               }
            }
         }

         if(this.var_496 != 0 && this.var_1e8 == 0) {
            if(this.var_154 >= 5 && this.var_154 <= 12) {
               if(this.var_154 > 4 && this.var_154 < 12) {
                  ++this.var_154;
               }
            } else {
               --this.var_154;
               if(this.var_154 == -1) {
                  this.var_154 = 15;
               }
            }

            if(this.var_1dd == 2) {
               this.var_1d1 = var_ada[this.var_154];
            } else {
               this.var_1d1 = var_ada[this.var_154 + 16];
            }

            this.var_1e8 = 5;
         }

         if(this.var_f6 < 0) {
            this.var_f6 = 255;
            this.var_96 = this.var_f6 << 6;
         } else if(this.var_f6 > 255) {
            this.var_f6 = 0;
            this.var_96 = this.var_f6 << 6;
         }

         if(var5 < 0) {
            short var14 = 255;
            this.var_4c4 = var14 << 6;
         } else if(var5 > 255) {
            byte var15 = 0;
            this.var_4c4 = var15 << 6;
         }

         if(this.var_144 < 0) {
            this.var_144 = 0;
            this.var_e8 = this.var_144 << 6;
            this.var_190 -= 10;
         } else if(this.var_144 > 208) {
            this.var_144 = 0;
            this.var_e8 = this.var_144 << 6;
         }
      }

      if(this.var_376 != 255) {
         var1.drawImage(Class_61.var_d93[30 + this.var_3b0], this.var_376, 189, 33);
         ++this.var_3b0;
         if(this.var_3b0 == 5) {
            this.var_376 = 255;
            this.var_3b0 = 0;
         }
      }

      var4 = this.var_8c3.var_96 >> 6;
      var5 = this.var_8c3.var_e8 >> 6;
      var6 = 0;
      int var8 = this.var_8c3.var_4c4 >> 6;
      int var9 = this.var_8c3.var_50d >> 6;
      int var10 = 2;

      while(true) {
         --var10;
         int var11;
         if(var10 < 0) {
            switch(this.var_5f) {
            case 0:
            case 1:
               var11 = this.var_154;
               if(this.var_1dd == 3 && this.var_8e9) {
                  var11 += 16;
               }

               var1.drawImage(Class_61.var_d4f[var11], this.var_f6, this.var_144, 3);
               break;
            case 2:
               if(this.var_154 < 7) {
                  var1.drawImage(Class_61.var_d93[this.var_154 + 2], this.var_f6, this.var_144, 3);
                  ++this.var_154;
               } else {
                  this.var_5f = 3;
                  if(this.var_496 == 0) {
                     Class_61.sub_464(this.var_8c3);
                  }
               }
            }

            switch(this.var_496) {
            case 2:
               var1.drawImage(Class_61.var_d93[27 + this.var_65e], this.var_4c4 >> 6, (this.var_50d >> 6) - 10, 3);
            case 1:
            case 4:
            case 5:
               var1.drawImage(Class_61.var_d93[21 + this.var_5bb], this.var_4c4 >> 6, this.var_50d >> 6, 3);
               break;
            case 3:
               var1.drawImage(Class_61.var_d93[17 + this.var_5bb], this.var_4c4 >> 6, this.var_50d >> 6, 3);
            }

            if(this.var_5f < 2 && this.var_325 > 0) {
               if(this.var_325 == 2) {
                  var1.drawImage(Class_61.var_d93[14 + this.var_33c], this.var_f6, this.var_144, 3);
                  ++this.var_33c;
                  if(this.var_33c > 2) {
                     this.var_33c = 0;
                  }
               }

               int var12 = 6;

               while(true) {
                  --var12;
                  if(var12 < 0) {
                     break;
                  }

                  if(this.var_a62[var12] == -1) {
                     if(Class_61.sub_822(12) < this.var_325 * 2) {
                        this.var_a62[var12] = this.var_96 >> 6;
                        this.var_a7b[var12] = this.var_e8 >> 6;
                        this.var_a8e[var12] = 0;
                        return;
                     }
                  } else {
                     var1.drawImage(Class_61.var_d93[this.var_a8e[var12] + 9], this.var_a62[var12], this.var_a7b[var12], 3);
                     ++this.var_a8e[var12];
                     if(this.var_a8e[var12] > 4) {
                        this.var_a62[var12] = -1;
                     }
                  }
               }
            }

            return;
         }

         Class_ec var13 = this.var_a3e[var10];
         var13.sub_76(var1, var2);
         if((Class_61.var_9aa == 1 && this.var_8e9 || Class_61.var_9aa == 0) && var13.var_ac != 255 && this.var_8c3.var_8de) {
            int var7;
            if(this.var_8c3.var_5f < 2) {
               var6 = Math.abs(var13.var_5e - var4);
               var7 = Math.abs(var13.var_ac - var5);
               var11 = var6 * var6 + var7 * var7;
               if(var11 < 80) {
                  ++this.var_8c3.var_325;
                  this.var_8c3.var_9a4 = false;
                  if(this.var_8c3.var_325 > 2) {
                     this.var_8c3.sub_250();
                     if(this.var_8c3.var_496 == 0) {
                        if(Class_61.var_9aa == 0) {
                           ++this.var_29f;
                           System.out.println("updating score.. now = " + this.var_29f);
                           Class_61.sub_634(this);
                        } else {
                           Class_61.var_12be = (byte)(Class_61.var_12be + 32);
                        }
                     }
                  } else {
                     Class_61.sub_24c(2, 1);
                  }

                  var13.sub_6a(true);
               }
            }

            if(this.var_8c3.var_496 > 0 && this.var_8c3.var_496 != 3) {
               var6 = Math.abs(var13.var_5e - var8);
               var7 = Math.abs(var13.var_ac - var9);
               var11 = var6 * var6 + var7 * var7;
               if(var11 < 30) {
                  Class_61.var_12be = (byte)(Class_61.var_12be + 8);
                  this.var_8c3.var_496 = 3;
                  this.var_8c3.var_5bb = 0;
                  var13.sub_6a(true);
                  Class_61.sub_464(this);
                  this.var_29f += 2;
                  Class_61.sub_634(this);
               }
            }

            if(this.var_8c3.var_496 == 2) {
               var7 = Math.abs(var13.var_ac - (var9 - 10));
               if(var6 < 10 && var7 < 5) {
                  this.var_8c3.var_496 = 5;
                  Class_61.var_12be = (byte)(Class_61.var_12be + 16);
               }
            }
         }
      }
   }

   static {
      int var1 = 16;

      while(true) {
         --var1;
         if(var1 < 0) {
            var_ada[16] = var_ada[8];
            var_ada[17] = var_ada[7];
            var_ada[18] = var_ada[6];
            var_ada[19] = var_ada[5];
            var_ada[20] = var_ada[4];
            var_ada[21] = var_ada[3];
            var_ada[22] = var_ada[2];
            var_ada[23] = var_ada[1];
            var_ada[24] = var_ada[0];
            var_ada[25] = var_ada[15];
            var_ada[26] = var_ada[14];
            var_ada[27] = var_ada[13];
            var_ada[28] = var_ada[12];
            var_ada[29] = var_ada[11];
            var_ada[30] = var_ada[10];
            var_ada[31] = var_ada[9];
            break;
         }

         int var0 = var1 - 12;
         if(var0 < 0) {
            var0 += 16;
         }

         var_ada[var0] = 360 * var1 / 16;
      }
   }
}
