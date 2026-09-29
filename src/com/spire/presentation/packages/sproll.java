/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproel;
import com.spire.presentation.packages.sprrgl;
import com.spire.presentation.packages.sprrmy;
import com.spire.presentation.packages.sprud;

public class sproll
implements sprud,
sprgf {
    private final int cfr_renamed_0;
    private static final byte[] cfr_renamed_1 = sprkoe.cfr_renamed_433(sprrmy.cfr_renamed_9("\u0005+!24\u00160-9"));
    private final int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private final sproel cfr_renamed_4;

    @Override
    public int cfr_renamed_3248() {
        return this.cfr_renamed_4.cfr_renamed_3248();
    }

    /*
     * WARNING - void declaration
     */
    public sproll(int n, byte[] byArray, int n2) {
        void arg1;
        void arg0;
        sproll sproll2 = this;
        sproll2.cfr_renamed_4 = new sproel((int)arg0, cfr_renamed_1, (byte[])arg1);
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_0 = (n2 + 7) / 8;
        this.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_10475(int arg0) {
        byte[] byArray = sprrgl.cfr_renamed_10112((long)arg0 * 8L);
        this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_3 = false;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        byte[] byArray = sprrgl.cfr_renamed_502(arg0, arg1, arg2);
        this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprbva.cfr_renamed_9("GWcNvjrQ{")).append(this.cfr_renamed_4.cfr_renamed_1315().substring(6)).toString();
    }

    public sproll(int arg0, byte[] arg1) {
        int n = arg0;
        this(n, arg1, n * 2);
    }

    /*
     * WARNING - void declaration
     */
    public sproll(sproll sproll2) {
        void arg0;
        this.cfr_renamed_4 = new sproel(arg0.cfr_renamed_4);
        this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_1;
        this.cfr_renamed_0 = this.cfr_renamed_2 * 2 / 8;
        this.cfr_renamed_3 = sproll2.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_1199(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_3) {
            sproll sproll2 = this;
            sproll2.cfr_renamed_10475(sproll2.cfr_renamed_1218());
        }
        sproll sproll3 = this;
        int n = sproll3.cfr_renamed_4.cfr_renamed_1199(arg0, arg1, arg2);
        sproll3.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
        this.cfr_renamed_3 = true;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        byte[] byArray = sprrgl.cfr_renamed_10471(arg0);
        this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_3) {
            sproll sproll2 = this;
            sproll2.cfr_renamed_10475(sproll2.cfr_renamed_1218());
        }
        sproll sproll3 = this;
        int n = sproll3.cfr_renamed_4.cfr_renamed_1199(arg0, arg1, this.cfr_renamed_1218());
        sproll3.cfr_renamed_41();
        return n;
    }

    @Override
    public int cfr_renamed_6410(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_3) {
            this.cfr_renamed_10475(0);
        }
        return this.cfr_renamed_4.cfr_renamed_6410(arg0, arg1, arg2);
    }
}

