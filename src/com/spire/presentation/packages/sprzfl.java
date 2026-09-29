/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprnyq;
import com.spire.presentation.packages.spryhl;
import com.spire.presentation.packages.sprzdaa;

public class sprzfl
extends spryhl {
    public sprzfl(spriil arg0) {
        this(256, arg0);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprzdaa.cfr_renamed_9("1`#\u001bO")).append(this.cfr_renamed_1).toString();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        void arg1;
        sprzfl sprzfl2 = this;
        sprzfl2.cfr_renamed_10486(2, 2);
        return super.cfr_renamed_1219(byArray, (int)arg1);
    }

    public sprzfl() {
        this(256, spriil.cfr_renamed_0);
    }

    @Override
    public int cfr_renamed_10487(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg3 < 0 || arg3 > 7) {
            throw new IllegalArgumentException(sprnyq.cfr_renamed_9("\u0018\t^\u000bK\u0010^\u0015}\u0010K\n\u0018YR\fL\r\u001f\u001bZYV\u0017\u001f\rW\u001c\u001f\u000b^\u0017X\u001c\u001f\"\u000fU\b$"));
        }
        int n = arg2 & (1 << arg3) - 1 | 2 << arg3;
        int n2 = arg3 + 2;
        if (n2 >= 8) {
            n2 -= 8;
            this.cfr_renamed_10485((byte)n);
            n >>>= 8;
        }
        return super.cfr_renamed_10487(arg0, arg1, (byte)n, n2);
    }

    public sprzfl(int arg0) {
        super(sprzfl.cfr_renamed_10483(arg0), spriil.cfr_renamed_0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_10483(int arg0) {
        switch (arg0) {
            case 224: 
            case 256: 
            case 384: 
            case 512: {
                return arg0;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzdaa.cfr_renamed_9("\u000f\u0000A\u0016d\u0007F\u0005\\\n\u000fB")).append(arg0).append(sprnyq.cfr_renamed_9("\u001f\u0017P\r\u001f\nJ\tO\u0016M\rZ\u001d\u001f\u001fP\u000b\u001f*w8\u0012J")).toString());
    }

    public sprzfl(int arg0, spriil arg1) {
        super(sprzfl.cfr_renamed_10483(arg0), arg1);
    }

    public sprzfl(sprzfl arg0) {
        super(arg0);
    }
}

