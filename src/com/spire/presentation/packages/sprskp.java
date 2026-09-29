/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprbso;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spribp;
import com.spire.presentation.packages.spriro;
import com.spire.presentation.packages.sprjip;
import com.spire.presentation.packages.sprllp;
import com.spire.presentation.packages.sprojp;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprwap;
import java.util.Iterator;

@sprtea
public class sprskp
extends spriro {
    private static Object cfr_renamed_0 = new Object();
    public sprvrx cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprvrx cfr_renamed_3;
    public static final String cfr_renamed_4 = "GPOS";

    public static spribp[] cfr_renamed_18881(sprujo arg0, int arg1) {
        int n;
        spribp[] spribpArray = new spribp[arg1];
        int n2 = n = 0;
        while (n2 < arg1) {
            spribpArray[n++] = spribp.cfr_renamed_18882(arg0);
            n2 = n;
        }
        return spribpArray;
    }

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_4;
    }

    public void cfr_renamed_18883(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @Override
    public void cfr_renamed_18869(sprujo arg0, long arg1) {
        sprrzo.cfr_renamed_18367(sprald.cfr_renamed_9("\u0000\u007f\b|gI\"N3Z5JgY&].N3F(A4"), new Object[0]);
    }

    public sprskp() {
        sprskp sprskp2 = this;
        sprskp2.cfr_renamed_1 = new sprvrx();
    }

    public boolean cfr_renamed_18884() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_18878(sprujo arg0, long arg1, int arg2, int arg3, int[] arg4, int arg5) {
        int n;
        sprojp sprojp2 = new sprojp(arg3, arg5);
        sprbso[] sprbsoArray = new sprbso[arg4.length];
        sprojp2.cfr_renamed_18885(sprbsoArray);
        int n2 = n = 0;
        while (n2 < arg4.length) {
            sprbso sprbso2 = sprojp.cfr_renamed_18880(arg2 & 0xFFFF, arg0, arg1 + (long)(arg4[n] & 0xFFFF));
            sprbso2.cfr_renamed_4 = this;
            sprbsoArray[n] = sprbso2;
            if ((arg2 & 0xFFFF) == 9) {
                this.cfr_renamed_18883(true);
            }
            n2 = ++n;
        }
        this.cfr_renamed_18857().cfr_renamed_12808(sprojp2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void cfr_renamed_18886() {
        if (this.cfr_renamed_3 != null) {
            return;
        }
        Object object = cfr_renamed_0;
        synchronized (object) {
            sprvrx<sprbso> sprvrx2 = new sprvrx<sprbso>();
            Iterator iterator = this.cfr_renamed_18857().iterator();
            while (iterator.hasNext()) {
                int n;
                sprbso[] sprbsoArray = ((sprojp)iterator.next()).cfr_renamed_18863();
                int n2 = sprbsoArray.length;
                int n3 = n = 0;
                while (n3 < n2) {
                    sprbso sprbso2 = sprbsoArray[n];
                    if (sprbso2 instanceof sprjip || sprbso2 instanceof sprllp) {
                        sprvrx2.add(sprbso2);
                    }
                    n3 = ++n;
                }
            }
            this.cfr_renamed_3 = sprvrx2;
            return;
        }
    }

    public sprdz cfr_renamed_18857() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_18536(int n, int n2) {
        sprskp sprskp2 = this;
        sprskp2.cfr_renamed_18886();
        int n3 = 0;
        Iterator iterator = sprskp2.cfr_renamed_3.iterator();
        while (iterator.hasNext()) {
            void arg1;
            void arg0;
            n3 = ((sprbso)iterator.next()).cfr_renamed_18536((int)arg0, (int)arg1);
            if (n3 == 0) continue;
            return n3;
        }
        return n3;
    }

    public static sprwap[] cfr_renamed_18887(long arg0, int[] arg1, sprujo arg2) {
        int n;
        int n2 = arg1.length;
        sprwap[] sprwapArray = new sprwap[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            sprwap sprwap2 = sprwap.cfr_renamed_18689(arg2, arg0 + (long)(arg1[n] & 0xFFFF));
            sprwapArray[n4] = sprwap2;
            n3 = ++n;
        }
        return sprwapArray;
    }
}

