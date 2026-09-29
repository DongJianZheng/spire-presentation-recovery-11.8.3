/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgxc;
import com.spire.presentation.packages.sprhyc;
import com.spire.presentation.packages.sprjbd;
import com.spire.presentation.packages.sprjcd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqsc;
import com.spire.presentation.packages.sprrvc;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprwh;
import java.security.SecureRandom;

public class sprrsc {
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private final sprwh cfr_renamed_2;
    private final SecureRandom cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprrsc() {
        this(new SecureRandom(), false);
    }

    public sprrsc cfr_renamed_3291(byte[] arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrsc(SecureRandom secureRandom, boolean bl) {
        void arg1;
        sprrsc sprrsc2 = this;
        this.cfr_renamed_1 = 256;
        sprrsc2.cfr_renamed_0 = 256;
        sprrsc2.cfr_renamed_3 = secureRandom;
        sprrsc sprrsc3 = this;
        sprrsc2.cfr_renamed_2 = new sprrvc(this.cfr_renamed_3, (boolean)arg1);
    }

    public sprqad cfr_renamed_2952(spruc arg0, byte[] arg1, boolean arg2) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        return new sprqad(sprrsc2.cfr_renamed_3, sprrsc2.cfr_renamed_2.cfr_renamed_576(this.cfr_renamed_0), new sprjcd(arg0, arg1, sprrsc3.cfr_renamed_4, sprrsc3.cfr_renamed_1), arg2);
    }

    public sprrsc(sprwh sprwh2) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        sprrsc3.cfr_renamed_1 = 256;
        sprrsc3.cfr_renamed_0 = 256;
        sprrsc2.cfr_renamed_3 = null;
        sprrsc2.cfr_renamed_2 = sprwh2;
    }

    public sprqad cfr_renamed_3292(sprlc arg0, byte[] arg1, boolean arg2) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        return new sprqad(sprrsc2.cfr_renamed_3, sprrsc2.cfr_renamed_2.cfr_renamed_576(this.cfr_renamed_0), new sprjbd(arg0, arg1, sprrsc3.cfr_renamed_4, sprrsc3.cfr_renamed_1), arg2);
    }

    public sprrsc cfr_renamed_3293(int arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprqad cfr_renamed_3294(spratc[] arg0, sprlc arg1, byte[] arg2, boolean arg3) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        return new sprqad(sprrsc2.cfr_renamed_3, sprrsc2.cfr_renamed_2.cfr_renamed_576(this.cfr_renamed_0), new sprhyc(arg0, arg1, arg2, sprrsc3.cfr_renamed_4, sprrsc3.cfr_renamed_1), arg3);
    }

    public sprrsc cfr_renamed_3295(int arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprqad cfr_renamed_3296(sprlc arg0, byte[] arg1, boolean arg2) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        return new sprqad(sprrsc2.cfr_renamed_3, sprrsc2.cfr_renamed_2.cfr_renamed_576(this.cfr_renamed_0), new sprgxc(arg0, arg1, sprrsc3.cfr_renamed_4, sprrsc3.cfr_renamed_1), arg2);
    }

    public sprqad cfr_renamed_3297(sprff arg0, int arg1, byte[] arg2, boolean arg3) {
        sprrsc sprrsc2 = this;
        sprrsc sprrsc3 = this;
        return new sprqad(sprrsc2.cfr_renamed_3, sprrsc2.cfr_renamed_2.cfr_renamed_576(this.cfr_renamed_0), new sprqsc(arg0, arg1, arg2, sprrsc3.cfr_renamed_4, sprrsc3.cfr_renamed_1), arg3);
    }
}

