/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqn;
import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprlzia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;

@sprtea
public class sprqhn
extends sprcqn {
    private String cfr_renamed_119;
    private long cfr_renamed_91;
    private String cfr_renamed_0;
    private String cfr_renamed_1;
    private int cfr_renamed_2 = 47;
    private sprszca cfr_renamed_3;
    private sprlzia cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @sprtea
    public String cfr_renamed_12935() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public void cfr_renamed_12936(String arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    @sprtea
    public void cfr_renamed_12820(sprszca arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public void cfr_renamed_12937(sprlzia arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_119;
    }

    @sprtea
    public sprlzia cfr_renamed_12938() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public long cfr_renamed_12939() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_12816(spreen spreen2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(this.cfr_renamed_2), 0, 2);
        byte[] byArray = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12935());
        v0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length + 10), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray.length), 0, 4);
        arg0.cfr_renamed_4924(byArray, 0, byArray.length);
        void v1 = arg0;
        void v2 = arg0;
        v2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 4);
        v2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 2);
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(48), 0, 2);
        byte[] byArray2 = this.cfr_renamed_12805().cfr_renamed_11606(this.cfr_renamed_12940());
        v1.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray2.length + 30), 0, 4);
        arg0.cfr_renamed_4924(sprtzja.cfr_renamed_11602(byArray2.length), 0, 4);
        arg0.cfr_renamed_4924(byArray2, 0, byArray2.length);
        void v3 = arg0;
        void v4 = arg0;
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 4);
        v4.cfr_renamed_4924(sprtzja.cfr_renamed_11602(0), 0, 2);
        v3.cfr_renamed_4924(this.cfr_renamed_12938().cfr_renamed_954(), 0, 16);
        v3.cfr_renamed_4924(sprtzja.cfr_renamed_11787(this.cfr_renamed_12939()), 0, 4);
    }

    @sprtea
    public void cfr_renamed_12941(long arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    @sprtea
    public void cfr_renamed_12821(spreen arg0) {
        spreen spreen2 = arg0;
        spreen2.cfr_renamed_11548(spreen2.cfr_renamed_3274() + 4L);
        int n = (int)(sprddn.cfr_renamed_12161(spreen2) & 0xFFFFFFFFL);
        byte[] byArray = new byte[n];
        spreen2.cfr_renamed_11556(byArray, 0, n);
        sprqhn sprqhn2 = this;
        sprqhn2.cfr_renamed_12942(sprqhn2.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length));
        spreen spreen3 = arg0;
        spreen3.cfr_renamed_11548(spreen3.cfr_renamed_3274() + 6L);
        if ((sprddn.cfr_renamed_12168(spreen3) & 0xFFFF) == 22) {
            spreen spreen4 = arg0;
            n = (int)(sprddn.cfr_renamed_12161(spreen4) & 0xFFFFFFFFL);
            byArray = new byte[n];
            spreen4.cfr_renamed_11556(byArray, 0, n);
            sprqhn sprqhn3 = this;
            sprqhn3.cfr_renamed_11640(sprqhn3.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length));
            if ((sprddn.cfr_renamed_12168(arg0) & 0xFFFF) == 62) {
                spreen spreen5 = arg0;
                n = (int)(sprddn.cfr_renamed_12161(spreen5) & 0xFFFFFFFFL);
                spreen5.cfr_renamed_11548(spreen5.cfr_renamed_3274() + (long)(n + 2));
            }
        }
        spreen spreen6 = arg0;
        spreen6.cfr_renamed_11548(spreen6.cfr_renamed_3274() + 4L);
        n = (int)(sprddn.cfr_renamed_12161(spreen6) & 0xFFFFFFFFL);
        byArray = new byte[n];
        spreen6.cfr_renamed_11556(byArray, 0, n);
        this.cfr_renamed_0 = this.cfr_renamed_12805().cfr_renamed_11595(byArray, 0, byArray.length);
        spreen spreen7 = arg0;
        spreen7.cfr_renamed_11548(spreen7.cfr_renamed_3274() + 6L);
        byArray = new byte[16];
        spreen7.cfr_renamed_11556(byArray, 0, 16);
        sprqhn sprqhn4 = this;
        sprqhn sprqhn5 = this;
        sprqhn4.cfr_renamed_12937(new sprlzia(byArray));
        sprqhn4.cfr_renamed_12941(sprddn.cfr_renamed_12161(arg0));
    }

    @Override
    @sprtea
    public sprszca cfr_renamed_12805() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public String cfr_renamed_12940() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public void cfr_renamed_12942(String arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    public int cfr_renamed_19() {
        return this.cfr_renamed_2;
    }
}

