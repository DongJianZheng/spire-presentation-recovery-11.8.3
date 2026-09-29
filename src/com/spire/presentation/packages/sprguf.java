/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprncg;
import com.spire.presentation.packages.sprouf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprweg;
import com.spire.presentation.packages.sprydg;
import java.util.LinkedList;

public class sprguf {
    public sprncg cfr_renamed_4;

    public byte[] cfr_renamed_6001(sprweg[] arg0, byte[] arg1, byte[] arg2, sprydg arg3) {
        sprydg sprydg2;
        int n;
        byte[][] byArrayArray = new byte[2][];
        byte[][] byArrayArray2 = new byte[this.cfr_renamed_4.cfr_renamed_152][];
        int n2 = this.cfr_renamed_4.cfr_renamed_86;
        int[] nArray = sprguf.cfr_renamed_6042(arg1, this.cfr_renamed_4.cfr_renamed_152, this.cfr_renamed_4.cfr_renamed_93);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_152) {
            int n4;
            int n5 = nArray[n];
            byte[] byArray = arg0[n].cfr_renamed_6012();
            int n6 = n;
            sprydg sprydg3 = arg3;
            sprydg3.cfr_renamed_6015(0);
            sprydg3.cfr_renamed_6016(n6 * n2 + n5);
            byArrayArray[0] = this.cfr_renamed_4.cfr_renamed_5994(arg2, arg3, byArray);
            byte[][] byArray2 = arg0[n6].cfr_renamed_1415();
            arg3.cfr_renamed_6016(n * n2 + n5);
            int n7 = n4 = 0;
            while (n7 < this.cfr_renamed_4.cfr_renamed_93) {
                byte[][] byArrayArray3;
                arg3.cfr_renamed_6015(n4 + 1);
                if (n5 / (1 << n4) % 2 == 0) {
                    byArrayArray3 = byArrayArray;
                    sprydg sprydg4 = arg3;
                    sprydg4.cfr_renamed_6016(sprydg4.cfr_renamed_5744() / 2);
                    byArrayArray[1] = this.cfr_renamed_4.cfr_renamed_6009(arg2, arg3, byArrayArray[0], byArray2[n4]);
                } else {
                    sprydg sprydg5 = arg3;
                    sprydg5.cfr_renamed_6016((sprydg5.cfr_renamed_5744() - 1) / 2);
                    byArrayArray3 = byArrayArray;
                    byArrayArray[1] = this.cfr_renamed_4.cfr_renamed_6009(arg2, arg3, byArray2[n4], byArrayArray[0]);
                }
                byArrayArray3[0] = byArrayArray[1];
                n7 = ++n4;
            }
            byArrayArray2[n++] = byArrayArray[0];
            n3 = n;
        }
        sprydg sprydg6 = sprydg2 = new sprydg(arg3);
        sprydg6.cfr_renamed_5986(4);
        sprydg6.cfr_renamed_5987(arg3.cfr_renamed_5988());
        return this.cfr_renamed_4.cfr_renamed_5993(arg2, sprydg2, sproze.cfr_renamed_1120(byArrayArray2));
    }

    public static int[] cfr_renamed_6042(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = 0;
        int[] nArray = new int[arg1];
        int n3 = n = 0;
        while (n3 < arg1) {
            int n4;
            nArray[n] = 0;
            int n5 = n4 = 0;
            while (n5 < arg2) {
                int n6 = n;
                int n7 = nArray[n6] ^ (arg0[n2 >> 3] >> (n2 & 7) & 1) << n4;
                ++n2;
                nArray[n6] = n7;
                n5 = ++n4;
            }
            n3 = ++n;
        }
        return nArray;
    }

    public sprguf(sprncg sprncg2) {
        this.cfr_renamed_4 = sprncg2;
    }

    public byte[] cfr_renamed_5657(byte[] arg0, int arg1, int arg2, byte[] arg3, sprydg arg4) {
        int n;
        LinkedList<sprouf> linkedList = new LinkedList<sprouf>();
        if (arg1 % (1 << arg2) != 0) {
            return null;
        }
        sprydg sprydg2 = new sprydg(arg4);
        int n2 = n = 0;
        while (n2 < 1 << arg2) {
            sprydg sprydg3 = sprydg2;
            sprydg sprydg4 = sprydg2;
            sprydg2.cfr_renamed_5986(6);
            sprydg4.cfr_renamed_5987(arg4.cfr_renamed_5988());
            sprydg4.cfr_renamed_6015(0);
            sprydg3.cfr_renamed_6016(arg1 + n);
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5991(arg3, arg0, sprydg2);
            sprydg3.cfr_renamed_6043(3);
            byte[] byArray2 = this.cfr_renamed_4.cfr_renamed_5994(arg3, sprydg2, byArray);
            sprydg3.cfr_renamed_6015(1);
            LinkedList<sprouf> linkedList2 = linkedList;
            while (!linkedList2.isEmpty() && ((sprouf)linkedList.get((int)0)).cfr_renamed_3 == sprydg2.cfr_renamed_5747()) {
                sprydg sprydg5 = sprydg2;
                sprydg5.cfr_renamed_6016((sprydg5.cfr_renamed_5744() - 1) / 2);
                sprouf sprouf2 = (sprouf)linkedList.remove(0);
                byArray2 = this.cfr_renamed_4.cfr_renamed_6009(arg3, sprydg2, sprouf2.cfr_renamed_4, byArray2);
                linkedList2 = linkedList;
                sprydg sprydg6 = sprydg2;
                sprydg6.cfr_renamed_6015(sprydg6.cfr_renamed_5747() + 1);
            }
            linkedList.add(0, new sprouf(byArray2, sprydg2.cfr_renamed_5747()));
            n2 = ++n;
        }
        return ((sprouf)linkedList.get((int)0)).cfr_renamed_4;
    }

    public sprweg[] cfr_renamed_5985(byte[] arg0, byte[] arg1, byte[] arg2, sprydg arg3) {
        int n;
        sprydg sprydg2 = new sprydg(arg3);
        int[] nArray = sprguf.cfr_renamed_6042(arg0, this.cfr_renamed_4.cfr_renamed_152, this.cfr_renamed_4.cfr_renamed_93);
        sprweg[] sprwegArray = new sprweg[this.cfr_renamed_4.cfr_renamed_152];
        int n2 = this.cfr_renamed_4.cfr_renamed_86;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.cfr_renamed_152) {
            int n4;
            int n5 = nArray[n];
            sprydg sprydg3 = sprydg2;
            sprydg sprydg4 = sprydg2;
            sprydg2.cfr_renamed_5986(6);
            sprydg4.cfr_renamed_5987(arg3.cfr_renamed_5988());
            sprydg4.cfr_renamed_6015(0);
            sprydg3.cfr_renamed_6016(n * n2 + n5);
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_5991(arg2, arg1, sprydg2);
            sprydg3.cfr_renamed_6043(3);
            byte[][] byArrayArray = new byte[this.cfr_renamed_4.cfr_renamed_93][];
            int n6 = n4 = 0;
            while (n6 < this.cfr_renamed_4.cfr_renamed_93) {
                int n7 = n5 / (1 << n4) ^ 1;
                int n8 = n4;
                byte[] byArray2 = this.cfr_renamed_5657(arg1, n * n2 + n7 * (1 << n4), n4, arg2, sprydg2);
                byArrayArray[n8] = byArray2;
                n6 = ++n4;
            }
            sprwegArray[n++] = new sprweg(byArray, byArrayArray);
            n3 = n;
        }
        return sprwegArray;
    }
}

