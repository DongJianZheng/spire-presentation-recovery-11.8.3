/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprd;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprheb;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprobb;
import com.spire.presentation.packages.sprogb;
import com.spire.presentation.packages.sproqa;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpqa;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwor;
import com.spire.presentation.packages.sprwua;
import com.spire.presentation.packages.spryeb;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprpab
implements sprh {
    private SecureRandom cfr_renamed_0;
    private sprheb cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprobb cfr_renamed_3;
    private spryeb cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_523(byte[] arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        System.arraycopy(arg0, 0, byArray, 0, arg1 < arg0.length ? arg1 : arg0.length);
        return byArray;
    }

    public sprama cfr_renamed_1330(sprama arg0, sprd arg1, sprama arg2) {
        sprama sprama2;
        sprama sprama3 = sprama2 = arg1.cfr_renamed_728(arg2, this.cfr_renamed_1.cfr_renamed_272);
        sprama3.cfr_renamed_765(arg0, this.cfr_renamed_1.cfr_renamed_272);
        sprama3.cfr_renamed_766(this.cfr_renamed_1.cfr_renamed_272);
        return sprama3;
    }

    private /* synthetic */ byte[] cfr_renamed_1331(byte[] arg0, spryeb arg1) throws sprpjd {
        sprama sprama2;
        sprama sprama3;
        sprama sprama4;
        spryeb spryeb2 = arg1;
        sprk sprk2 = spryeb2.cfr_renamed_2;
        sprama sprama5 = spryeb2.cfr_renamed_3;
        sprama sprama6 = spryeb2.cfr_renamed_4;
        sprpab sprpab2 = this;
        int n = sprpab2.cfr_renamed_1.cfr_renamed_119;
        int n2 = sprpab2.cfr_renamed_1.cfr_renamed_272;
        int n3 = sprpab2.cfr_renamed_1.cfr_renamed_31;
        int n4 = sprpab2.cfr_renamed_1.cfr_renamed_91;
        int n5 = sprpab2.cfr_renamed_1.cfr_renamed_107;
        int n6 = sprpab2.cfr_renamed_1.cfr_renamed_79;
        int n7 = sprpab2.cfr_renamed_1.spr\ufe34;
        boolean bl = sprpab2.cfr_renamed_1.cfr_renamed_88;
        byte[] byArray = sprpab2.cfr_renamed_1.cfr_renamed_96;
        if (n4 > 255) {
            throw new sprjkd(sprwor.cfr_renamed_9(";Z.v%\\\u001a^8y/O3HvM7W#^%\u001b4R1\\3IvO>Z8\u001bd\u000ec\u001b7I3\u001b8T\"\u001b%N&K9I\"^2"));
        }
        int n8 = n3 / 8;
        sprama sprama7 = sprama.cfr_renamed_768(arg0, n, n2);
        sprama sprama8 = this.cfr_renamed_1332(sprama7, sprk2, sprama5);
        if (sprama8.cfr_renamed_780(-1) < n5) {
            throw new sprpjd(sprseo.cfr_renamed_9("\u00197&!u&=3;r1?er6=043;6;0<!!u7$'4>u\u007fd"));
        }
        if (sprama8.cfr_renamed_780(0) < n5) {
            throw new sprpjd(sprwor.cfr_renamed_9("w3H%\u001b\"S7Uv_;\u000bvX9^0]?X?^8O%\u001b3J#Z:\u001bf"));
        }
        if (sprama8.cfr_renamed_780(1) < n5) {
            throw new sprpjd(sprseo.cfr_renamed_9("\u001e0!&r!:4<u68bu1:734<1<7;&&r0# 39rd"));
        }
        sprama sprama9 = sprama4 = (sprama)sprama7.clone();
        sprama9.cfr_renamed_753(sprama8);
        sprama9.cfr_renamed_762(n2);
        sprama sprama10 = sprama3 = (sprama)sprama9.clone();
        sprama10.cfr_renamed_762(4);
        byte[] byArray2 = sprama10.cfr_renamed_783(4);
        sprama sprama11 = this.cfr_renamed_1333(byArray2, n, n7, bl);
        sprama sprama12 = sprama8;
        sprama12.cfr_renamed_753(sprama11);
        sprama12.cfr_renamed_756();
        byte[] byArray3 = sprama12.cfr_renamed_775();
        byte[] byArray4 = new byte[n8];
        System.arraycopy(byArray3, 0, byArray4, 0, n8);
        int n9 = byArray3[n8] & 0xFF;
        if (n9 > n4) {
            throw new sprpjd(new StringBuilder().insert(0, sprwor.cfr_renamed_9("v3H%Z1^vO9TvW9U1\u0001v")).append(n9).append(">").append(n4).toString());
        }
        byte[] byArray5 = new byte[n9];
        System.arraycopy(byArray3, n8 + 1, byArray5, 0, n9);
        byte[] byArray6 = new byte[byArray3.length - (n8 + 1 + n9)];
        System.arraycopy(byArray3, n8 + 1 + n9, byArray6, 0, byArray6.length);
        if (!sprzra.cfr_renamed_92(byArray6, new byte[byArray6.length])) {
            throw new sprpjd(sprseo.cfr_renamed_9("\u0001:0r87&!450r<!u<:&u4:>9=\"71r7+u(0 :7&"));
        }
        byte[] byArray7 = sprama6.cfr_renamed_783(n2);
        sprpab sprpab3 = this;
        byte[] byArray8 = sprpab3.cfr_renamed_523(byArray7, n6 / 8);
        sprama sprama13 = sprama2 = sprpab3.cfr_renamed_1334(sprpab3.cfr_renamed_1335(byArray, byArray5, n9, byArray4, byArray8), byArray5).cfr_renamed_723(sprama6);
        sprama13.cfr_renamed_762(n2);
        if (!sprama13.equals(sprama4)) {
            throw new sprpjd(sprwor.cfr_renamed_9("r8M7W?_vV3H%Z1^v^8X9_?U1"));
        }
        return byArray5;
    }

    private /* synthetic */ int[] cfr_renamed_1316(sprogb arg0, int arg1) {
        int n;
        int[] nArray = new int[this.cfr_renamed_1.cfr_renamed_119];
        int n2 = n = -1;
        while (n2 <= 1) {
            int n3 = 0;
            while (n3 < arg1) {
                int n4 = arg0.cfr_renamed_1336();
                if (nArray[n4] != 0) continue;
                ++n3;
                nArray[n4] = n;
            }
            n2 = n += 2;
        }
        return nArray;
    }

    private /* synthetic */ byte[] cfr_renamed_1335(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, byte[] arg4) {
        byte[] byArray = new byte[arg0.length + arg2 + arg3.length + arg4.length];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(arg1, 0, byArray, arg0.length, arg1.length);
        System.arraycopy(arg3, 0, byArray, arg0.length + arg1.length, arg3.length);
        System.arraycopy(arg4, 0, byArray, arg0.length + arg1.length + arg3.length, arg4.length);
        return byArray;
    }

    @Override
    public byte[] cfr_renamed_1337(byte[] arg0, int arg1, int arg2) throws sprpjd {
        byte[] byArray = new byte[arg2];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        if (this.cfr_renamed_2) {
            sprpab sprpab2 = this;
            return sprpab2.cfr_renamed_1338(byArray, sprpab2.cfr_renamed_3);
        }
        return this.cfr_renamed_1331(byArray, this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_1339() {
        sprpab sprpab2 = this;
        return (this.cfr_renamed_1.cfr_renamed_119 * sprpab2.cfr_renamed_1340(sprpab2.cfr_renamed_1.cfr_renamed_272) + 7) / 8;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2) {
            sprpab sprpab2;
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprpab sprpab3 = this;
                sprpab3.cfr_renamed_0 = spraed2.cfr_renamed_1295();
                sprpab3.cfr_renamed_3 = (sprobb)spraed2.cfr_renamed_284();
                sprpab2 = this;
            } else {
                this.cfr_renamed_0 = new SecureRandom();
                this.cfr_renamed_3 = (sprobb)arg1;
                sprpab2 = this;
            }
            sprpab2.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_284();
            return;
        }
        this.cfr_renamed_4 = (spryeb)arg1;
        this.cfr_renamed_1 = this.cfr_renamed_4.cfr_renamed_284();
    }

    public sprama cfr_renamed_1332(sprama arg0, sprk arg1, sprama arg2) {
        sprama sprama2;
        sprama sprama3;
        sprama sprama4;
        if (this.cfr_renamed_1.cfr_renamed_3) {
            sprama sprama5 = sprama4 = arg1.cfr_renamed_728(arg0, this.cfr_renamed_1.cfr_renamed_272);
            sprama3 = sprama5;
            sprama5.cfr_renamed_751(3);
            sprama5.cfr_renamed_730(arg0);
        } else {
            sprama3 = sprama4 = arg1.cfr_renamed_728(arg0, this.cfr_renamed_1.cfr_renamed_272);
        }
        sprama3.cfr_renamed_767(this.cfr_renamed_1.cfr_renamed_272);
        sprama4.cfr_renamed_756();
        sprama sprama6 = sprama2 = this.cfr_renamed_1.cfr_renamed_3 ? sprama4 : new sprwua(sprama4).cfr_renamed_728(arg2, 3);
        sprama6.cfr_renamed_767(3);
        return sprama6;
    }

    private /* synthetic */ sprama cfr_renamed_1333(byte[] arg0, int arg1, int arg2, boolean arg3) {
        Object object;
        int n;
        sprlc sprlc2 = this.cfr_renamed_1.cfr_renamed_145;
        int n2 = sprlc2.cfr_renamed_1218();
        byte[] byArray = new byte[arg2 * n2];
        byte[] byArray2 = arg3 ? this.cfr_renamed_1341(sprlc2, arg0) : arg0;
        int n3 = n = 0;
        while (n3 < arg2) {
            sprlc2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprpab sprpab2 = this;
            sprpab2.cfr_renamed_1342(sprlc2, n);
            byte[] byArray3 = sprpab2.cfr_renamed_1343(sprlc2);
            object = byArray3;
            System.arraycopy(byArray3, 0, byArray, n++ * n2, n2);
            n3 = n;
        }
        object = new sprama(arg1);
        while (true) {
            int n4;
            int n5 = 0;
            int n6 = n4 = 0;
            while (n6 != byArray.length) {
                int n7 = byArray[n4] & 0xFF;
                if (n7 < 243) {
                    int n8;
                    int n9 = n8 = 0;
                    while (n9 < 4) {
                        int n10 = n7 % 3;
                        ((sprama)object).cfr_renamed_1[n5++] = n10 - 1;
                        if (n5 == arg1) {
                            return object;
                        }
                        n7 = (n7 - n10) / 3;
                        n9 = ++n8;
                    }
                    ((sprama)object).cfr_renamed_1[n5++] = n7 - 1;
                    if (n5 == arg1) {
                        return object;
                    }
                }
                n6 = ++n4;
            }
            if (n5 >= arg1) {
                return object;
            }
            sprlc2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprpab sprpab3 = this;
            sprpab3.cfr_renamed_1342(sprlc2, n);
            ++n;
            byte[] byArray4 = sprpab3.cfr_renamed_1343(sprlc2);
            byArray = byArray4;
        }
    }

    private /* synthetic */ int cfr_renamed_1340(int arg0) {
        if (arg0 == 2048) {
            return 11;
        }
        throw new IllegalStateException(sprseo.cfr_renamed_9(">:5gr;=!r3'9>,r<?%>0?0<!71"));
    }

    @Override
    public int cfr_renamed_1344() {
        return this.cfr_renamed_1.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_1342(sprlc sprlc2, int n) {
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = arg1;
        arg0.cfr_renamed_1221((byte)(arg1 >> 24));
        arg0.cfr_renamed_1221((byte)(v1 >> 16));
        v0.cfr_renamed_1221((byte)(v1 >> 8));
        v0.cfr_renamed_1221((byte)n);
    }

    private /* synthetic */ byte[] cfr_renamed_1343(sprlc arg0) {
        sprlc sprlc2 = arg0;
        byte[] byArray = new byte[sprlc2.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    private /* synthetic */ byte[] cfr_renamed_1341(sprlc arg0, byte[] arg1) {
        sprlc sprlc2 = arg0;
        byte[] byArray = new byte[sprlc2.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1197(arg1, 0, arg1.length);
        arg0.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    private /* synthetic */ sprk cfr_renamed_1334(byte[] arg0, byte[] arg1) {
        sprogb sprogb2 = new sprogb(arg0, this.cfr_renamed_1);
        if (this.cfr_renamed_1.cfr_renamed_1 == 1) {
            sprpab sprpab2 = this;
            sproqa sproqa2 = new sproqa(sprpab2.cfr_renamed_1316(sprogb2, sprpab2.cfr_renamed_1.cfr_renamed_2));
            sprpab sprpab3 = this;
            sproqa sproqa3 = new sproqa(sprpab3.cfr_renamed_1316(sprogb2, sprpab3.cfr_renamed_1.cfr_renamed_185));
            sprpab sprpab4 = this;
            sproqa sproqa4 = new sproqa(sprpab4.cfr_renamed_1316(sprogb2, sprpab4.cfr_renamed_1.cfr_renamed_93));
            return new sprpqa(sproqa2, sproqa3, sproqa4);
        }
        sprpab sprpab5 = this;
        int n = sprpab5.cfr_renamed_1.cfr_renamed_102;
        boolean bl = sprpab5.cfr_renamed_1.cfr_renamed_126;
        int[] nArray = this.cfr_renamed_1316(sprogb2, n);
        if (bl) {
            return new sproqa(nArray);
        }
        return new sprwua(nArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte[] cfr_renamed_1338(byte[] arg0, sprobb arg1) {
        sprama sprama2 = arg1.cfr_renamed_4;
        sprpab sprpab2 = this;
        int n = sprpab2.cfr_renamed_1.cfr_renamed_119;
        int n2 = sprpab2.cfr_renamed_1.cfr_renamed_272;
        int n3 = sprpab2.cfr_renamed_1.cfr_renamed_91;
        int n4 = sprpab2.cfr_renamed_1.cfr_renamed_31;
        int n5 = sprpab2.cfr_renamed_1.cfr_renamed_152;
        int n6 = sprpab2.cfr_renamed_1.cfr_renamed_107;
        int n7 = sprpab2.cfr_renamed_1.cfr_renamed_79;
        int n8 = sprpab2.cfr_renamed_1.spr\ufe34;
        boolean bl = sprpab2.cfr_renamed_1.cfr_renamed_88;
        byte[] byArray = sprpab2.cfr_renamed_1.cfr_renamed_96;
        int n9 = arg0.length;
        if (n3 > 255) {
            throw new IllegalArgumentException(sprwor.cfr_renamed_9(":W3UvM7W#^%\u001b4R1\\3IvO>Z8\u001bg\u001b7I3\u001b8T\"\u001b%N&K9I\"^2"));
        }
        if (n9 > n3) {
            throw new sprjkd(new StringBuilder().insert(0, sprseo.cfr_renamed_9("\u001f0!&327u&:=u>:<2hu")).append(n9).append(">").append(n3).toString());
        }
        int n10 = n4;
        while (true) {
            sprama sprama3;
            byte[] byArray2 = new byte[n10 / 8];
            this.cfr_renamed_0.nextBytes(byArray2);
            byte[] byArray3 = new byte[n3 + 1 - n9];
            byte[] byArray4 = new byte[n5 / 8];
            System.arraycopy(byArray2, 0, byArray4, 0, byArray2.length);
            byArray4[byArray2.length] = (byte)n9;
            System.arraycopy(arg0, 0, byArray4, byArray2.length + 1, arg0.length);
            System.arraycopy(byArray3, 0, byArray4, byArray2.length + 1 + arg0.length, byArray3.length);
            sprama sprama4 = sprama.cfr_renamed_776(byArray4, n);
            byte[] byArray5 = sprama2.cfr_renamed_783(n2);
            sprpab sprpab3 = this;
            byte[] byArray6 = sprpab3.cfr_renamed_523(byArray5, n7 / 8);
            sprama sprama5 = sprpab3.cfr_renamed_1334(sprpab3.cfr_renamed_1335(byArray, arg0, n9, byArray2, byArray6), byArray4).cfr_renamed_728(sprama2, n2);
            sprama sprama6 = sprama3 = (sprama)sprama5.clone();
            sprama6.cfr_renamed_762(4);
            byte[] byArray7 = sprama6.cfr_renamed_783(4);
            sprama sprama7 = this.cfr_renamed_1333(byArray7, n, n8, bl);
            sprama sprama8 = sprama4;
            sprama8.cfr_renamed_730(sprama7);
            sprama8.cfr_renamed_756();
            if (sprama8.cfr_renamed_780(-1) < n6) {
                n10 = n4;
                continue;
            }
            if (sprama4.cfr_renamed_780(0) < n6) {
                n10 = n4;
                continue;
            }
            if (sprama4.cfr_renamed_780(1) >= n6) {
                sprama sprama9 = sprama5;
                int n11 = n2;
                sprama5.cfr_renamed_765(sprama4, n2);
                sprama9.cfr_renamed_766(n11);
                return sprama9.cfr_renamed_783(n11);
            }
            n10 = n4;
        }
    }
}

