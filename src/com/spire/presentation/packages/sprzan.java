/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprayca;
import com.spire.presentation.packages.sprdzm;
import com.spire.presentation.packages.sprer;
import com.spire.presentation.packages.sprigp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrw;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprtz;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprvp;

@sprtea
public class sprzan
extends sprdzm
implements sprer {
    private sprthn cfr_renamed_4;

    private /* synthetic */ float cfr_renamed_12483(sprrw arg0) {
        return (float)arg0.cfr_renamed_12484().cfr_renamed_12485();
    }

    private static /* synthetic */ void cfr_renamed_12486(String arg0) {
    }

    /*
     * WARNING - void declaration
     */
    public sprzan(sprrw sprrw2, String string, byte[] byArray, int n, double d, spralq spralq2, double d2, int n2, double d3, double d4, sprvp sprvp2, boolean bl, boolean bl2, sprigp sprigp2, boolean bl3) {
        super((sprrw)arg0, (String)arg1, (byte[])arg2, (int)arg3, (double)arg4, (spralq)arg5, (double)arg6, (int)arg7, (double)arg9, (sprvp)arg10, (boolean)arg11, (boolean)arg12, (sprigp)arg13);
        float f;
        boolean bl4;
        sprtz sprtz2;
        void arg13;
        void arg12;
        void arg11;
        void arg10;
        void arg9;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        if (bl2) {
            return;
        }
        if (arg0 == null) {
            throw new NullPointerException("layer");
        }
        if (arg2 == null) {
            throw new NullPointerException(sprayca.cfr_renamed_9("4u\"i%"));
        }
        sprtz sprtz3 = (sprtz)arg0.cfr_renamed_12484().cfr_renamed_12099();
        if (sprtz2.cfr_renamed_12485() < 0.0) {
            sprtz sprtz4 = sprtz3;
            sprtz4.cfr_renamed_12487(Math.abs(sprtz4.cfr_renamed_12485()));
        }
        float f2 = this.cfr_renamed_12483((sprrw)arg0);
        boolean bl5 = bl4 = f < 0.0f;
        if (bl4) {
            f2 = Math.abs(f2);
        }
    }

    private /* synthetic */ double cfr_renamed_12488(double arg0, sprrw arg1) {
        return arg0 * (double)arg1.cfr_renamed_12484().cfr_renamed_12489().cfr_renamed_1778() * (double)arg1.cfr_renamed_12490().cfr_renamed_12491().cfr_renamed_1778();
    }

    @sprtea
    public static void cfr_renamed_12492() {
    }

    private /* synthetic */ sprsuja cfr_renamed_12493(sprrw arg0) {
        return new sprsuja(0.0f, 0.0f);
    }

    @Override
    public String toString() {
        Object[] objectArray = new Object[5];
        objectArray[0] = this.cfr_renamed_314();
        objectArray[1] = this.cfr_renamed_12494();
        objectArray[2] = this.cfr_renamed_12495();
        objectArray[3] = Float.valueOf(this.cfr_renamed_12489().cfr_renamed_3688());
        objectArray[4] = Float.valueOf(this.cfr_renamed_12489().cfr_renamed_5958());
        return sprraia.cfr_renamed_11562(sprvnd.cfr_renamed_9("9I\u0018T\u0004ZP\u001dHFZ@H\u0006Ji\u000fE\u001ej\u0003Y\u001eUP\u001d\u0011\f\u0017\u0006Ji\u000fE\u001eu\u000fT\rU\u001e\u0007JFX@Q\u001d\u0005[\fN\u000fI2\u0007\u0011\u000e\u0017\u0006JR\f[\u0019X\u001edPF^@"), objectArray);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4;
    }
}

