/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjcg;
import com.spire.presentation.packages.sprncg;
import com.spire.presentation.packages.sprouf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvyf;
import com.spire.presentation.packages.sprydg;
import java.util.LinkedList;

public class sprjxf {
    public sprncg cfr_renamed_0;
    public sprvyf cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    public byte[] cfr_renamed_6004(byte[] arg0, long arg1, int arg2) {
        int n;
        int n2;
        sprydg sprydg2;
        sprydg sprydg3 = sprydg2 = new sprydg();
        sprydg3.cfr_renamed_5999(0);
        sprydg3.cfr_renamed_6000(arg1);
        sprjxf sprjxf2 = this;
        sprjcg sprjcg2 = this.cfr_renamed_6013(arg0, sprjxf2.cfr_renamed_2, arg2, this.cfr_renamed_3, sprydg2);
        sprjcg[] sprjcgArray = new sprjcg[sprjxf2.cfr_renamed_0.cfr_renamed_0];
        sprydg sprydg4 = sprydg2;
        sprjcgArray[0] = sprjcg2;
        sprydg4.cfr_renamed_5999(0);
        sprydg4.cfr_renamed_6000(arg1);
        byte[] byArray = this.cfr_renamed_6014(arg2, sprjcg2, arg0, this.cfr_renamed_3, sprydg2);
        int n3 = n2 = 1;
        while (n3 < this.cfr_renamed_0.cfr_renamed_0) {
            arg2 = (int)(arg1 & (long)((1 << this.cfr_renamed_0.cfr_renamed_102) - 1));
            sprydg sprydg5 = sprydg2;
            sprydg5.cfr_renamed_5999(n2);
            sprydg5.cfr_renamed_6000(arg1 >>>= this.cfr_renamed_0.cfr_renamed_102);
            sprjxf sprjxf3 = this;
            sprjcg2 = sprjxf3.cfr_renamed_6013(byArray, sprjxf3.cfr_renamed_2, arg2, this.cfr_renamed_3, sprydg2);
            int n4 = n2;
            sprjcgArray[n4] = sprjcg2;
            if (n4 < this.cfr_renamed_0.cfr_renamed_0 - 1) {
                byArray = this.cfr_renamed_6014(arg2, sprjcg2, byArray, this.cfr_renamed_3, sprydg2);
            }
            n3 = ++n2;
        }
        byte[][] byArrayArray = new byte[sprjcgArray.length][];
        int n5 = n = 0;
        while (n5 != byArrayArray.length) {
            int n6 = n++;
            byArrayArray[n6] = sproze.cfr_renamed_543(sprjcgArray[n].cfr_renamed_4, sproze.cfr_renamed_1120(sprjcgArray[n6].cfr_renamed_3));
            n5 = n;
        }
        return sproze.cfr_renamed_1120(byArrayArray);
    }

    public byte[] cfr_renamed_5657(byte[] arg0, int arg1, int arg2, byte[] arg3, sprydg arg4) {
        int n;
        sprydg sprydg2 = new sprydg(arg4);
        LinkedList<sprouf> linkedList = new LinkedList<sprouf>();
        if (arg1 % (1 << arg2) != 0) {
            return null;
        }
        int n2 = n = 0;
        while (n2 < 1 << arg2) {
            sprydg sprydg3 = sprydg2;
            sprydg sprydg4 = sprydg2;
            sprydg2.cfr_renamed_5986(0);
            sprydg4.cfr_renamed_5987(arg1 + n);
            byte[] byArray = this.cfr_renamed_1.cfr_renamed_5992(arg0, arg3, sprydg2);
            sprydg3.cfr_renamed_5986(2);
            sprydg4.cfr_renamed_6015(1);
            sprydg3.cfr_renamed_6016(arg1 + n);
            LinkedList<sprouf> linkedList2 = linkedList;
            while (!linkedList2.isEmpty() && ((sprouf)linkedList.get((int)0)).cfr_renamed_3 == sprydg2.cfr_renamed_5747()) {
                sprydg sprydg5 = sprydg2;
                sprydg5.cfr_renamed_6016((sprydg5.cfr_renamed_5744() - 1) / 2);
                sprouf sprouf2 = (sprouf)linkedList.remove(0);
                byArray = this.cfr_renamed_0.cfr_renamed_6009(arg3, sprydg2, sprouf2.cfr_renamed_4, byArray);
                linkedList2 = linkedList;
                sprydg sprydg6 = sprydg2;
                sprydg6.cfr_renamed_6015(sprydg6.cfr_renamed_5747() + 1);
            }
            linkedList.add(0, new sprouf(byArray, sprydg2.cfr_renamed_5747()));
            n2 = ++n;
        }
        return ((sprouf)linkedList.get((int)0)).cfr_renamed_4;
    }

    public sprjcg cfr_renamed_6013(byte[] arg0, byte[] arg1, int arg2, byte[] arg3, sprydg arg4) {
        int n;
        sprydg sprydg2;
        byte[][] byArrayArray = new byte[this.cfr_renamed_0.cfr_renamed_102][];
        sprydg sprydg3 = sprydg2 = new sprydg(arg4);
        sprydg2.cfr_renamed_5986(2);
        sprydg3.cfr_renamed_5999(arg4.cfr_renamed_5734());
        sprydg3.cfr_renamed_6000(arg4.cfr_renamed_5736());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.cfr_renamed_102) {
            int n3 = arg2 / (1 << n) ^ 1;
            int n4 = n;
            byte[] byArray = this.cfr_renamed_5657(arg1, n3 * (1 << n), n, arg3, sprydg2);
            byArrayArray[n4] = byArray;
            n2 = ++n;
        }
        sprydg sprydg4 = sprydg2 = new sprydg(arg4);
        sprydg4.cfr_renamed_5986(1);
        sprydg4.cfr_renamed_5987(arg2);
        byte[] byArray = this.cfr_renamed_1.cfr_renamed_5985(arg0, arg1, arg3, sprydg2);
        return new sprjcg(byArray, byArrayArray);
    }

    /*
     * WARNING - void declaration
     */
    public byte[] cfr_renamed_6017(byte[] byArray, byte[] byArray2, sprydg sprydg2) {
        void arg2;
        void arg1;
        sprjxf sprjxf2 = this;
        return sprjxf2.cfr_renamed_5657(byArray, 0, sprjxf2.cfr_renamed_0.cfr_renamed_102, (byte[])arg1, (sprydg)arg2);
    }

    public byte[] cfr_renamed_6014(int arg0, sprjcg arg1, byte[] arg2, byte[] arg3, sprydg arg4) {
        int n;
        sprydg sprydg2 = new sprydg(arg4);
        sprjcg sprjcg2 = arg1;
        sprydg sprydg3 = sprydg2;
        sprydg2.cfr_renamed_5986(0);
        sprydg3.cfr_renamed_5987(arg0);
        byte[] byArray = sprjcg2.cfr_renamed_6011();
        byte[][] byArray2 = sprjcg2.cfr_renamed_6010();
        byte[] byArray3 = this.cfr_renamed_1.cfr_renamed_5995(byArray, arg2, arg3, sprydg2);
        byte[] byArray4 = null;
        sprydg3.cfr_renamed_5986(2);
        sprydg3.cfr_renamed_6016(arg0);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.cfr_renamed_102) {
            byte[] byArray5;
            sprydg2.cfr_renamed_6015(n + 1);
            if (arg0 / (1 << n) % 2 == 0) {
                sprydg sprydg4 = sprydg2;
                sprydg4.cfr_renamed_6016(sprydg4.cfr_renamed_5744() / 2);
                byArray5 = this.cfr_renamed_0.cfr_renamed_6009(arg3, sprydg2, byArray3, byArray2[n]);
            } else {
                sprydg sprydg5 = sprydg2;
                sprydg5.cfr_renamed_6016((sprydg5.cfr_renamed_5744() - 1) / 2);
                byArray5 = this.cfr_renamed_0.cfr_renamed_6009(arg3, sprydg2, byArray2[n], byArray3);
            }
            byArray3 = byArray5;
            n2 = ++n;
        }
        return byArray3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjxf(sprncg sprncg2, byte[] byArray, byte[] byArray2) {
        sprydg sprydg2;
        void arg0;
        void arg2;
        void arg1;
        sprjxf sprjxf2 = this;
        this.cfr_renamed_2 = arg1;
        sprjxf2.cfr_renamed_3 = arg2;
        sprjxf2.cfr_renamed_0 = sprncg2;
        sprjxf sprjxf3 = this;
        sprjxf2.cfr_renamed_1 = new sprvyf((sprncg)arg0);
        sprydg sprydg3 = sprydg2 = new sprydg();
        sprydg3.cfr_renamed_5999(arg0.cfr_renamed_0 - 1);
        sprydg3.cfr_renamed_6000(0L);
        if (arg1 != null) {
            this.cfr_renamed_4 = this.cfr_renamed_6017((byte[])arg1, (byte[])arg2, sprydg2);
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public boolean cfr_renamed_6002(byte[] arg0, sprjcg[] arg1, byte[] arg2, long arg3, int arg4, byte[] arg5) {
        int n;
        sprydg sprydg2 = new sprydg();
        sprjcg sprjcg2 = arg1[0];
        sprydg sprydg3 = sprydg2;
        sprydg3.cfr_renamed_5999(0);
        sprydg3.cfr_renamed_6000(arg3);
        byte[] byArray = this.cfr_renamed_6014(arg4, sprjcg2, arg0, arg2, sprydg2);
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_0.cfr_renamed_0) {
            arg4 = (int)(arg3 & (long)((1 << this.cfr_renamed_0.cfr_renamed_102) - 1));
            sprjcg2 = arg1[n];
            sprydg sprydg4 = sprydg2;
            sprydg4.cfr_renamed_5999(n);
            sprydg4.cfr_renamed_6000(arg3 >>>= this.cfr_renamed_0.cfr_renamed_102);
            byArray = this.cfr_renamed_6014(arg4, sprjcg2, byArray, arg2, sprydg2);
            n2 = ++n;
        }
        return sproze.cfr_renamed_92(arg5, byArray);
    }
}

