/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcma;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprhto {
    private static float[] cfr_renamed_0;
    private static float[] cfr_renamed_1;
    private static float[] cfr_renamed_2;
    private static float[] cfr_renamed_3;
    private static float[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static boolean cfr_renamed_14246(int arg0, int arg1) {
        switch (arg1) {
            case 0: {
                return arg0 == 0;
            }
            case 1: {
                return arg0 == 2;
            }
            case 2: {
                return arg0 == 1;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static boolean cfr_renamed_14243(int arg0, int arg1) {
        switch (arg1) {
            case 0: {
                return arg0 == 0;
            }
            case 1: {
                return arg0 == 2;
            }
        }
        return false;
    }

    private /* synthetic */ sprhto() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static int cfr_renamed_14124(sprtbp arg0) {
        switch (arg0.cfr_renamed_12576()) {
            case 2: {
                return 1;
            }
            case 1: {
                return 2;
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static float[] cfr_renamed_14125(sprtbp arg0, boolean arg1) {
        float[] fArray;
        float[] fArray2;
        switch (arg0.cfr_renamed_13153()) {
            case 0: {
                fArray = fArray2 = cfr_renamed_3;
                break;
            }
            case 1: {
                fArray = fArray2 = cfr_renamed_0;
                break;
            }
            case 2: {
                fArray = fArray2 = cfr_renamed_1;
                break;
            }
            case 3: {
                fArray = fArray2 = cfr_renamed_4;
                break;
            }
            case 4: {
                fArray = fArray2 = cfr_renamed_2;
                break;
            }
            case 5: {
                fArray = fArray2 = arg0.cfr_renamed_13157();
                break;
            }
            default: {
                throw new IllegalStateException(sprcma.cfr_renamed_9("\u0012\u0014,\u0014(\r)Z#\u001b4\u0012g\t3\u0003+\u001fi"));
            }
        }
        float[] fArray3 = new float[fArray.length];
        System.arraycopy(fArray2, 0, fArray3, 0, fArray2.length);
        sprhto.cfr_renamed_14244(arg0, fArray3, arg1);
        return fArray3;
    }

    private static /* synthetic */ void cfr_renamed_14244(sprtbp arg0, float[] arg1, boolean arg2) {
        int n;
        float[] fArray = new float[2];
        fArray[0] = 1.0f;
        fArray[1] = arg0.cfr_renamed_1942();
        float f = spryxp.cfr_renamed_17123(fArray);
        int n2 = n = 0;
        while (n2 < arg1.length) {
            float f2;
            if (spryxp.cfr_renamed_14245(n)) {
                f2 = arg1[n];
                if (arg2) {
                    f2 += 1.0f;
                }
                arg1[n] = f2 * f;
            } else {
                f2 = arg1[n];
                if (arg2) {
                    f2 -= 1.0f;
                }
                arg1[n] = f2 * f;
            }
            n2 = ++n;
        }
    }

    static {
        cfr_renamed_3 = new float[0];
        float[] fArray = new float[2];
        fArray[0] = 3.0f;
        fArray[1] = 1.0f;
        cfr_renamed_0 = fArray;
        float[] fArray2 = new float[2];
        fArray2[0] = 1.0f;
        fArray2[1] = 1.0f;
        cfr_renamed_1 = fArray2;
        float[] fArray3 = new float[4];
        fArray3[0] = 3.0f;
        fArray3[1] = 1.0f;
        fArray3[2] = 1.0f;
        fArray3[3] = 1.0f;
        cfr_renamed_4 = fArray3;
        float[] fArray4 = new float[6];
        fArray4[0] = 3.0f;
        fArray4[1] = 1.0f;
        fArray4[2] = 1.0f;
        fArray4[3] = 1.0f;
        fArray4[4] = 1.0f;
        fArray4[5] = 1.0f;
        cfr_renamed_2 = fArray4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static int cfr_renamed_14123(sprtbp arg0) {
        switch (arg0.cfr_renamed_13151()) {
            case 2: {
                return 1;
            }
            case 1: {
                return 2;
            }
        }
        switch (arg0.cfr_renamed_13152()) {
            case 2: {
                return 1;
            }
            case 1: {
                return 2;
            }
        }
        if (arg0.cfr_renamed_13153() != 0) {
            switch (arg0.cfr_renamed_13156()) {
                case 2: {
                    return 1;
                }
            }
        }
        return 0;
    }
}

