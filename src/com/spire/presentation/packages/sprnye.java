/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmye;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpaz;

public class sprnye {
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    public int[] cfr_renamed_1249() {
        return sproze.cfr_renamed_535(this.cfr_renamed_1);
    }

    public int[] cfr_renamed_1150() {
        return sproze.cfr_renamed_535(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprnye(int n, int[] nArray, int[] nArray2, int[] nArray3) throws IllegalArgumentException {
        void arg3;
        void arg2;
        void arg1;
        sprnye sprnye2 = this;
        sprnye2.cfr_renamed_1430(n, (int[])arg1, (int[])arg2, (int[])arg3);
    }

    private /* synthetic */ void cfr_renamed_1430(int arg0, int[] arg1, int[] arg2, int[] arg3) throws IllegalArgumentException {
        int n;
        boolean bl = true;
        String string = "";
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2 != arg2.length || this.cfr_renamed_2 != arg1.length || this.cfr_renamed_2 != arg3.length) {
            bl = false;
            string = sprpaz.cfr_renamed_9("\u0014J$\\1A\"P$@aT V I$P$V2A5\u0004'K3I P");
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            if (arg3[n] < 2 || (arg1[n] - arg3[n]) % 2 != 0) {
                bl = false;
                string = sprmye.cfr_renamed_9("\u0007=?!7o .\".=*$*\"o\u001box\u0004pqmobo1!4o\u0018b\u001bo595!p=5>%&\"*4fq");
            }
            if (arg1[n] < 4 || arg2[n] < 2) {
                bl = false;
                string = sprpaz.cfr_renamed_9("\u0016V.J&\u00041E3E,A5A3\u0004\t\u0004.VaSa\f\t\u0004\u007f\u0004r\u0004 J%\u00046\u0004\u007f\u0004p\u00043A0Q(V$@h\u0005");
            }
            n2 = ++n;
        }
        if (bl) {
            sprnye sprnye2 = this;
            this.cfr_renamed_1 = sproze.cfr_renamed_535(arg1);
            sprnye2.cfr_renamed_4 = sproze.cfr_renamed_535(arg2);
            sprnye2.cfr_renamed_3 = sproze.cfr_renamed_535(arg3);
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public int cfr_renamed_1140() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnye(int n) throws IllegalArgumentException {
        void arg0;
        if (n <= 10) {
            int[] nArray = new int[1];
            nArray[0] = 10;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[1];
            nArray3[0] = 3;
            int[] nArray4 = nArray3;
            int[] nArray5 = new int[1];
            nArray5[0] = 2;
            int[] nArray6 = nArray5;
            this.cfr_renamed_1430(nArray2.length, nArray2, nArray4, nArray6);
            return;
        }
        if (arg0 <= 20) {
            int[] nArray = new int[2];
            nArray[0] = 10;
            nArray[1] = 10;
            int[] nArray7 = nArray;
            int[] nArray8 = new int[2];
            nArray8[0] = 5;
            nArray8[1] = 4;
            int[] nArray9 = nArray8;
            int[] nArray10 = new int[2];
            nArray10[0] = 2;
            nArray10[1] = 2;
            int[] nArray11 = nArray10;
            this.cfr_renamed_1430(nArray7.length, nArray7, nArray9, nArray11);
            return;
        }
        int[] nArray = new int[4];
        nArray[0] = 10;
        nArray[1] = 10;
        nArray[2] = 10;
        nArray[3] = 10;
        int[] nArray12 = nArray;
        int[] nArray13 = new int[4];
        nArray13[0] = 9;
        nArray13[1] = 9;
        nArray13[2] = 9;
        nArray13[3] = 3;
        int[] nArray14 = nArray13;
        int[] nArray15 = new int[4];
        nArray15[0] = 2;
        nArray15[1] = 2;
        nArray15[2] = 2;
        nArray15[3] = 2;
        int[] nArray16 = nArray15;
        this.cfr_renamed_1430(nArray12.length, nArray12, nArray14, nArray16);
    }

    public int[] cfr_renamed_1250() {
        return sproze.cfr_renamed_535(this.cfr_renamed_4);
    }
}

