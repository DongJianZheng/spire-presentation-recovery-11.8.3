/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprmnja;
import com.spire.presentation.packages.sprnuf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqdg;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprttf;
import com.spire.presentation.packages.sprutf;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprxag;
import com.spire.presentation.packages.sprycg;

public class sprqxf {
    private static final short cfr_renamed_119 = -32640;
    private static final int cfr_renamed_91 = 23;
    private static final int cfr_renamed_0 = 22;
    public static final int cfr_renamed_1 = -3;
    public static final short cfr_renamed_2 = -32383;
    public static final int cfr_renamed_3 = 32;
    private static final int cfr_renamed_4 = 20;

    public static sprqdg cfr_renamed_6443(sprxag arg0) {
        byte[] byArray = sprqxf.cfr_renamed_6444(arg0.cfr_renamed_6445(), arg0.cfr_renamed_6439(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_2667());
        return new sprqdg(arg0.cfr_renamed_6445(), arg0.cfr_renamed_6439(), arg0.cfr_renamed_1604(), byArray);
    }

    public static sprycg cfr_renamed_6446(sprxag arg0, byte[] arg1, byte[] arg2) {
        int n;
        sprxag sprxag2 = arg0;
        sprsuf sprsuf2 = sprxag2.cfr_renamed_6445();
        int n2 = sprsuf2.cfr_renamed_1146();
        int n3 = sprsuf2.cfr_renamed_1155();
        int n4 = sprsuf2.cfr_renamed_1438();
        byte[] byArray = new byte[n3 * n2];
        sprgf sprgf2 = sprieg.cfr_renamed_6447(sprsuf2);
        sprnuf sprnuf2 = sprxag2.cfr_renamed_6448();
        byte[] byArray2 = arg1;
        int n5 = sprqxf.cfr_renamed_6449(byArray2, n2, sprsuf2);
        arg1[n2] = (byte)(n5 >>> 8 & 0xFF);
        byArray2[n2 + 1] = (byte)n5;
        byte[] byArray3 = sprutf.cfr_renamed_5939().cfr_renamed_6450(arg0.cfr_renamed_6439()).cfr_renamed_5940(arg0.cfr_renamed_1604()).cfr_renamed_6451(0, 23 + n2).cfr_renamed_1451();
        sprnuf2.cfr_renamed_6440(0);
        int n6 = n = 0;
        while (n6 < n3) {
            int n7;
            sprpxe.cfr_renamed_5179((short)n, byArray3, 20);
            sprnuf2.cfr_renamed_6438(byArray3, n < n3 - 1, 23);
            int n8 = sprqxf.cfr_renamed_6452(arg1, n, n4);
            int n9 = n7 = 0;
            while (n9 < n8) {
                byArray3[22] = (byte)n7;
                sprgf sprgf3 = sprgf2;
                sprgf3.cfr_renamed_1197(byArray3, 0, 23 + n2);
                sprgf3.cfr_renamed_1219(byArray3, 23);
                n9 = ++n7;
            }
            System.arraycopy(byArray3, 23, byArray, n2 * n++, n2);
            n6 = n;
        }
        return new sprycg(sprsuf2, arg2, byArray);
    }

    public static byte[] cfr_renamed_6453(sprqdg arg0, sprycg arg1, byte[] arg2) {
        sprvcg sprvcg2;
        sprvcg sprvcg3 = sprvcg2 = arg0.cfr_renamed_6454(arg1);
        sprpag.cfr_renamed_6455(arg2, sprvcg3);
        return sprqxf.cfr_renamed_6456(sprvcg3);
    }

    public static boolean cfr_renamed_6457(sprqdg arg0, sprycg arg1, byte[] arg2, boolean arg3) throws sprttf {
        if (!arg1.cfr_renamed_324().equals(arg0.cfr_renamed_6445())) {
            throw new sprttf(sprmnja.cfr_renamed_9("(\u0013:\n1\u0005x\r=\u001fx\u00076\u0002x\u00151\u00016\u0007,\u0013*\u0003x\t,\u0015x\u0012!\u0016=\u0015x\u00027F6\t,F5\u0007,\u00050"));
        }
        return sproze.cfr_renamed_92(sprqxf.cfr_renamed_6453(arg0, arg1, arg2), arg0.cfr_renamed_1150());
    }

    public static byte[] cfr_renamed_6444(sprsuf arg0, byte[] arg1, int arg2, byte[] arg3) {
        int n;
        sprnuf sprnuf2;
        sprgf sprgf2 = sprieg.cfr_renamed_6447(arg0);
        byte[] byArray = sprutf.cfr_renamed_5939().cfr_renamed_6450(arg1).cfr_renamed_5940(arg2).cfr_renamed_6458(-32640).cfr_renamed_6451(0, 22).cfr_renamed_1451();
        sprgf2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprsuf sprsuf2 = arg0;
        sprgf sprgf3 = sprieg.cfr_renamed_6447(sprsuf2);
        byte[] byArray2 = sprutf.cfr_renamed_5939().cfr_renamed_6450(arg1).cfr_renamed_5940(arg2).cfr_renamed_6451(0, 23 + sprgf3.cfr_renamed_1218()).cfr_renamed_1451();
        sprnuf sprnuf3 = sprnuf2 = new sprnuf(arg1, arg3, sprieg.cfr_renamed_6447(arg0));
        sprnuf3.cfr_renamed_6442(arg2);
        sprnuf3.cfr_renamed_6440(0);
        int n2 = sprsuf2.cfr_renamed_1155();
        int n3 = sprsuf2.cfr_renamed_1146();
        int n4 = (1 << arg0.cfr_renamed_1438()) - 1;
        int n5 = n = 0;
        while (n5 < n2) {
            int n6;
            sprnuf2.cfr_renamed_6438(byArray2, n < n2 - 1, 23);
            sprpxe.cfr_renamed_5179((short)n, byArray2, 20);
            int n7 = n6 = 0;
            while (n7 < n4) {
                byArray2[22] = (byte)n6;
                sprgf3.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprgf3.cfr_renamed_1219(byArray2, 23);
                n7 = ++n6;
            }
            sprgf2.cfr_renamed_1197(byArray2, 23, n3);
            n5 = ++n;
        }
        sprgf sprgf4 = sprgf2;
        byte[] byArray3 = new byte[sprgf4.cfr_renamed_1218()];
        sprgf4.cfr_renamed_1219(byArray3, 0);
        return byArray3;
    }

    public static int cfr_renamed_6452(byte[] arg0, int arg1, int arg2) {
        int n = arg1 * arg2 / 8;
        int n2 = 8 / arg2;
        int n3 = arg2 * (~arg1 & n2 - 1);
        int n4 = (1 << arg2) - 1;
        return arg0[n] >>> n3 & n4;
    }

    public static byte[] cfr_renamed_6456(sprvcg arg0) {
        int n;
        byte[] byArray;
        sprsuf sprsuf2;
        sprycg sprycg2;
        sprvcg sprvcg2 = arg0;
        sprqdg sprqdg2 = sprvcg2.cfr_renamed_1157();
        sprsuf sprsuf3 = sprqdg2.cfr_renamed_6445();
        Object object = sprvcg2.cfr_renamed_79();
        if (object instanceof sprlyf) {
            sprycg2 = ((sprlyf)object).cfr_renamed_6459();
            sprsuf2 = sprsuf3;
        } else {
            sprycg2 = (sprycg)object;
            sprsuf2 = sprsuf3;
        }
        int n2 = sprsuf2.cfr_renamed_1146();
        sprsuf sprsuf4 = sprsuf3;
        int n3 = sprsuf3.cfr_renamed_1438();
        int n4 = sprsuf4.cfr_renamed_1155();
        byte[] byArray2 = byArray = arg0.cfr_renamed_1604();
        int n5 = sprqxf.cfr_renamed_6449(byArray2, n2, sprsuf3);
        byArray[n2] = (byte)(n5 >>> 8 & 0xFF);
        byArray2[n2 + 1] = (byte)n5;
        byte[] byArray3 = sprqdg2.cfr_renamed_6439();
        int n6 = sprqdg2.cfr_renamed_1604();
        sprgf sprgf2 = sprieg.cfr_renamed_6447(sprsuf4);
        sprpag.cfr_renamed_6455(byArray3, sprgf2);
        sprpag.cfr_renamed_6460(n6, sprgf2);
        sprpag.cfr_renamed_6461((short)-32640, sprgf2);
        byte[] byArray4 = sprutf.cfr_renamed_5939().cfr_renamed_6450(byArray3).cfr_renamed_5940(n6).cfr_renamed_6451(0, 23 + n2).cfr_renamed_1451();
        int n7 = (1 << n3) - 1;
        byte[] byArray5 = sprycg2.spr\u3181();
        sprgf sprgf3 = sprieg.cfr_renamed_6447(sprsuf4);
        int n8 = n = 0;
        while (n8 < n4) {
            sprpxe.cfr_renamed_5179((short)n, byArray4, 20);
            int n9 = n;
            System.arraycopy(byArray5, n9 * n2, byArray4, 23, n2);
            int n10 = sprqxf.cfr_renamed_6452(byArray, n9, n3);
            while (n10 < n7) {
                int n11;
                byArray4[22] = (byte)n11;
                sprgf sprgf4 = sprgf3;
                sprgf4.cfr_renamed_1197(byArray4, 0, 23 + n2);
                sprgf4.cfr_renamed_1219(byArray4, 23);
                n10 = ++n11;
            }
            sprgf2.cfr_renamed_1197(byArray4, 23, n2);
            n8 = ++n;
        }
        byte[] byArray6 = new byte[n2];
        sprgf2.cfr_renamed_1219(byArray6, 0);
        return byArray6;
    }

    public static int cfr_renamed_6449(byte[] arg0, int arg1, sprsuf arg2) {
        int n;
        int n2 = 0;
        int n3 = arg2.cfr_renamed_1438();
        int n4 = (1 << n3) - 1;
        int n5 = n = 0;
        while (n5 < arg1 * 8 / arg2.cfr_renamed_1438()) {
            n2 = n2 + n4 - sprqxf.cfr_renamed_6452(arg0, n++, arg2.cfr_renamed_1438());
            n5 = n;
        }
        return n2 << arg2.cfr_renamed_6462();
    }

    public static sprycg cfr_renamed_6463(sprgzf arg0, sprxag arg1, byte[][] arg2, byte[] arg3, boolean arg4) {
        sprxag sprxag2;
        byte[] byArray;
        byte[] byArray2 = new byte[34];
        if (!arg4) {
            sprvcg sprvcg2 = arg1.cfr_renamed_6464(arg0, arg2);
            sprpag.cfr_renamed_6465(arg3, 0, arg3.length, sprvcg2);
            sprvcg sprvcg3 = sprvcg2;
            byArray = sprvcg3.cfr_renamed_3369();
            byArray2 = sprvcg3.cfr_renamed_1604();
            sprxag2 = arg1;
        } else {
            sprxag sprxag3 = arg1;
            sprxag2 = sprxag3;
            int n = sprxag3.cfr_renamed_6445().cfr_renamed_1146();
            byArray = new byte[n];
            System.arraycopy(arg3, 0, byArray2, 0, n);
        }
        return sprqxf.cfr_renamed_6446(sprxag2, byArray2, byArray);
    }
}

