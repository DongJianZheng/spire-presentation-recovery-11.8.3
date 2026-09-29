/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgep;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprudp;
import com.spire.presentation.packages.spryqo;

@sprtea
public class sprugp
extends sprudp {
    private sprrpp cfr_renamed_2;
    private byte[] cfr_renamed_3;
    @sprtea
    public static final int cfr_renamed_4 = Integer.MAX_VALUE;

    @sprtea
    public sprugp(byte[] arg0, spryqo arg1) {
        super(arg0.length, arg1);
        int n;
        sprugp sprugp2 = this;
        sprugp sprugp3 = this;
        sprugp2.cfr_renamed_2 = new sprrpp();
        sprugp2.cfr_renamed_3 = new byte[7168 + arg0.length];
        System.arraycopy(this.cfr_renamed_19101(), 0, this.cfr_renamed_3, 0, this.cfr_renamed_19101().length);
        System.arraycopy(arg0, 0, this.cfr_renamed_3, 7168, arg0.length);
        int n2 = n = 1;
        while (n2 < 7168) {
            this.cfr_renamed_19102(n++);
            n2 = n;
        }
    }

    @sprtea
    public void cfr_renamed_19103(int arg0, sprgep arg1, sprgep arg2) {
        sprgep sprgep2;
        sprgep sprgep3;
        if (this.cfr_renamed_19104().cfr_renamed_576(arg0) == arg2) {
            sprgep3 = arg2;
            this.cfr_renamed_19104().cfr_renamed_16275(arg0);
        } else {
            if (arg1 != null) {
                arg1.cfr_renamed_19105(null);
            }
            sprgep3 = arg2;
        }
        sprgep sprgep4 = sprgep2 = sprgep3;
        while (sprgep4 != null) {
            sprgep sprgep5 = sprgep2;
            sprgep4 = sprgep5.cfr_renamed_12446();
            sprgep5.cfr_renamed_19105(null);
        }
    }

    @sprtea
    public sprrpp cfr_renamed_19104() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public int cfr_renamed_19106(int arg0) {
        int n = this.cfr_renamed_3[arg0] & 0xFF;
        n <<= 8;
        return n |= this.cfr_renamed_3[arg0 + 1] & 0xFF;
    }

    @sprtea
    public byte cfr_renamed_19107(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    @sprtea
    public void cfr_renamed_19102(int arg0) {
        if (arg0 < 1) {
            return;
        }
        sprugp sprugp2 = this;
        byte by = sprugp2.cfr_renamed_3[arg0];
        int n = (sprugp2.cfr_renamed_3[arg0 - 1] & 0xFF & 0xFFFF) << 8 | by & 0xFF;
        sprgep sprgep2 = new sprgep(arg0 - 1, (sprgep)this.cfr_renamed_19104().cfr_renamed_576(n));
        this.cfr_renamed_19104().cfr_renamed_12962(n, sprgep2);
    }

    @sprtea
    public int cfr_renamed_19108(int arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            byte by = this.cfr_renamed_3[arg0];
            ++arg0;
            byte by2 = this.cfr_renamed_3[arg1];
            ++arg1;
            if (by != by2) {
                return n;
            }
            n2 = ++n;
        }
        return n;
    }
}

