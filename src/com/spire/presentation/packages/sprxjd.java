/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprlsy;
import com.spire.presentation.packages.sproah;
import java.security.SecureRandom;

public class sprxjd
extends sprccb {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_3349() {
        return this.cfr_renamed_2;
    }

    public sprxjd(SecureRandom arg0, int arg1, int arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprxjd(SecureRandom secureRandom, int n, int n2, int n3, boolean bl) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxjd sprxjd2 = this;
        super((SecureRandom)arg0, (int)arg1);
        sprxjd2.cfr_renamed_3 = false;
        sprxjd2.cfr_renamed_4 = arg2;
        if (n3 % 2 == 1) {
            throw new IllegalArgumentException(sproah.cfr_renamed_9("?\u000b(61\u00040\t\f\u00175\b9\u0016|\b)\u0016(E>\u0000|\u0004|\b)\t(\f,\t9E3\u0003|W"));
        }
        if (arg3 < 30) {
            throw new IllegalArgumentException(sprlsy.cfr_renamed_9("\u001bG\fz\u0015H\u0014E([\u0011D\u001dZXD\rZ\f\t\u001aLX\u0017E\tK\u0019XO\u0017[XZ\u001dJ\r[\u0011]\u0001\t\nL\u0019Z\u0017G\u000b"));
        }
        this.cfr_renamed_2 = arg3;
        this.cfr_renamed_3 = arg4;
    }

    public boolean cfr_renamed_3350() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3341() {
        return this.cfr_renamed_4;
    }
}

