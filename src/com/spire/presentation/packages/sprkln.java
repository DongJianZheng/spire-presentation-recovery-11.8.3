/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvmp;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class sprkln {
    private static sprdsp cfr_renamed_3 = new sprdsp();
    private sprvqo cfr_renamed_4;

    private static /* synthetic */ int[] cfr_renamed_13409(int arg0) {
        return (int[])cfr_renamed_3.cfr_renamed_576(arg0);
    }

    private /* synthetic */ void cfr_renamed_12819(int arg0) {
        int n = this.cfr_renamed_4.cfr_renamed_13308(arg0);
        int[] nArray = sprkln.cfr_renamed_13409(arg0);
        if (nArray != null) {
            int n2;
            int[] nArray2 = nArray;
            int n3 = nArray.length;
            int n4 = n2 = 0;
            while (n4 < n3) {
                this.cfr_renamed_13410(nArray2[n2++], n);
                n4 = n2;
            }
        }
    }

    @sprtea
    public sprvqo cfr_renamed_13411() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprkln(sprfzo sprfzo2) {
        boolean bl = true;
        this.cfr_renamed_4 = sprfzo2.cfr_renamed_13412(false, false, bl);
    }

    private /* synthetic */ void cfr_renamed_13410(int arg0, int arg1) {
        if (this.cfr_renamed_4.cfr_renamed_13261().cfr_renamed_13027().cfr_renamed_576(arg0) != null) {
            this.cfr_renamed_4.cfr_renamed_13308(arg0);
            return;
        }
        this.cfr_renamed_4.cfr_renamed_13326(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_13390(int arg0, boolean arg1) {
        boolean bl;
        if (arg0 == 3635) {
            sprkln sprkln2 = this;
            sprkln2.cfr_renamed_13390(3661, arg1);
            boolean bl2 = arg1;
            bl = bl2;
            sprkln2.cfr_renamed_13390(3634, bl2);
        } else {
            if (arg0 == 3763) {
                sprkln sprkln3 = this;
                sprkln3.cfr_renamed_13390(3789, arg1);
                sprkln3.cfr_renamed_13390(3762, arg1);
            }
            bl = arg1;
        }
        int n = bl && arg0 <= 65535 ? (int)sprvmp.cfr_renamed_13413((char)arg0) : arg0;
        this.cfr_renamed_12819(n);
    }

    static {
        int[] nArray = new int[3];
        nArray[0] = 63242;
        nArray[1] = 63237;
        nArray[2] = 63251;
        cfr_renamed_3.cfr_renamed_13414(3656, nArray);
        int[] nArray2 = new int[3];
        nArray2[0] = 63243;
        nArray2[1] = 63238;
        nArray2[2] = 63252;
        cfr_renamed_3.cfr_renamed_13414(3657, nArray2);
        int[] nArray3 = new int[3];
        nArray3[0] = 63244;
        nArray3[1] = 63239;
        nArray3[2] = 63253;
        cfr_renamed_3.cfr_renamed_13414(3658, nArray3);
        int[] nArray4 = new int[3];
        nArray4[0] = 63245;
        nArray4[1] = 63240;
        nArray4[2] = 63254;
        cfr_renamed_3.cfr_renamed_13414(3659, nArray4);
        int[] nArray5 = new int[3];
        nArray5[0] = 63246;
        nArray5[1] = 63241;
        nArray5[2] = 63255;
        cfr_renamed_3.cfr_renamed_13414(3660, nArray5);
        int[] nArray6 = new int[1];
        nArray6[0] = 63248;
        cfr_renamed_3.cfr_renamed_13414(3633, nArray6);
        int[] nArray7 = new int[1];
        nArray7[0] = 63233;
        cfr_renamed_3.cfr_renamed_13414(3636, nArray7);
        int[] nArray8 = new int[1];
        nArray8[0] = 63234;
        cfr_renamed_3.cfr_renamed_13414(3637, nArray8);
        int[] nArray9 = new int[1];
        nArray9[0] = 63235;
        cfr_renamed_3.cfr_renamed_13414(3638, nArray9);
        int[] nArray10 = new int[1];
        nArray10[0] = 63236;
        cfr_renamed_3.cfr_renamed_13414(3639, nArray10);
        int[] nArray11 = new int[1];
        nArray11[0] = 63250;
        cfr_renamed_3.cfr_renamed_13414(3655, nArray11);
        int[] nArray12 = new int[1];
        nArray12[0] = 63249;
        cfr_renamed_3.cfr_renamed_13414(3661, nArray12);
        int[] nArray13 = new int[1];
        nArray13[0] = 63256;
        cfr_renamed_3.cfr_renamed_13414(3640, nArray13);
        int[] nArray14 = new int[1];
        nArray14[0] = 63257;
        cfr_renamed_3.cfr_renamed_13414(3641, nArray14);
        int[] nArray15 = new int[1];
        nArray15[0] = 63258;
        cfr_renamed_3.cfr_renamed_13414(3642, nArray15);
        int[] nArray16 = new int[1];
        nArray16[0] = 63247;
        cfr_renamed_3.cfr_renamed_13414(3597, nArray16);
        int[] nArray17 = new int[1];
        nArray17[0] = 63232;
        cfr_renamed_3.cfr_renamed_13414(3600, nArray17);
    }
}

