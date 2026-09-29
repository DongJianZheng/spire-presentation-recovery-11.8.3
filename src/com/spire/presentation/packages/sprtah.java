/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjtg;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprmbh;
import com.spire.presentation.packages.sprtada;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvd;
import com.spire.presentation.packages.sprvl;
import java.security.SecureRandom;

public class sprtah
implements sprvd {
    private int cfr_renamed_91;
    private SecureRandom cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprtah(int arg0) {
        sprtah sprtah2 = this;
        this.cfr_renamed_4 = true;
        sprtah2.cfr_renamed_1 = true;
        sprtah2.cfr_renamed_2 = -1;
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3 == 0) {
            throw new IllegalArgumentException(sprtada.cfr_renamed_9(".A,X`W)D(Q2\u00143D%W)R)Q$"));
        }
    }

    public sprtah cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    @Override
    public sprtah cfr_renamed_7906(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @Override
    public SecureRandom cfr_renamed_2794() {
        if (this.cfr_renamed_0 == null) {
            sprtah sprtah2 = this;
            sprtah2.cfr_renamed_0 = new SecureRandom();
        }
        return this.cfr_renamed_0;
    }

    @Override
    public sprtah cfr_renamed_7904() {
        this.cfr_renamed_1 = false;
        return this;
    }

    @Override
    public sprtah cfr_renamed_7907() {
        this.cfr_renamed_1 = true;
        return this;
    }

    @Override
    public int cfr_renamed_593() {
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ boolean cfr_renamed_8019(sprtah arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ int cfr_renamed_8020(sprtah arg0) {
        return arg0.cfr_renamed_91;
    }

    @Override
    public boolean cfr_renamed_7862() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprtah cfr_renamed_7905(int arg0, int arg1) {
        if (this.cfr_renamed_3 != 7 && this.cfr_renamed_3 != 8 && this.cfr_renamed_3 != 9) {
            throw new IllegalStateException(sprlbd.cfr_renamed_9("7\u00017\u0000V%\u001a#\u00196\u001f0\u001e)\u0005d\u0015%\u0018d\u0019*\u001a=V&\u0013d\u00037\u0013 V3\u001f0\u001ed7\u0001%"));
        }
        if (arg1 < 6) {
            throw new IllegalArgumentException(sprtada.cfr_renamed_9("Y)Z)Y5Y`W(A._\u0013]:Q`]3\u0014v"));
        }
        sprtah sprtah2 = this;
        sprtah2.cfr_renamed_2 = arg0;
        sprtah2.cfr_renamed_91 = arg1 - 6;
        return this;
    }

    @Override
    public int cfr_renamed_7855() {
        return this.cfr_renamed_2;
    }

    public static /* synthetic */ int cfr_renamed_8021(sprtah arg0) {
        return arg0.cfr_renamed_3;
    }

    public static /* synthetic */ int cfr_renamed_8022(sprtah arg0) {
        return arg0.cfr_renamed_2;
    }

    @Override
    public sprvl cfr_renamed_2588(byte[] arg0) throws sprtqg {
        if (this.cfr_renamed_2 > 0) {
            return new sprjtg(this, arg0);
        }
        return new sprmbh(this, arg0);
    }

    @Override
    public int cfr_renamed_7864() {
        return this.cfr_renamed_91;
    }
}

