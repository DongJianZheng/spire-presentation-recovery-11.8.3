/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spresl;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhol;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnpl;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtqm;
import com.spire.presentation.packages.sprvwl;
import java.io.IOException;
import java.io.InputStream;

public class sprxpl
implements sprjn {
    private byte[] cfr_renamed_119;
    public sprbyl cfr_renamed_91;
    private spridn cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private sprnpl cfr_renamed_2;
    public sprlvm cfr_renamed_3;
    private spridn cfr_renamed_4;

    public sprxpl(InputStream arg0) throws sprlyl {
        this(spreul.cfr_renamed_4104(arg0));
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprjpm cfr_renamed_4190() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return new sprjpm(this.cfr_renamed_4);
    }

    public sprxpl(sprlvm arg0) throws sprlyl {
        this.cfr_renamed_3 = arg0;
        sprtqm sprtqm2 = sprtqm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_480());
        if (sprtqm2.cfr_renamed_4170() != null) {
            sprxpl sprxpl2 = this;
            sprxpl2.cfr_renamed_2 = new sprnpl(sprtqm2.cfr_renamed_4170());
        }
        sprtqm sprtqm3 = sprtqm2;
        spridn spridn2 = sprtqm3.cfr_renamed_4171();
        sprnum sprnum2 = sprtqm3.cfr_renamed_4189();
        sprxpl sprxpl3 = this;
        sprxpl3.cfr_renamed_1 = sprnum2.cfr_renamed_4173();
        this.cfr_renamed_119 = sprtqm2.cfr_renamed_1472().cfr_renamed_186();
        sprhol sprhol2 = new sprhol(this, sprnum2);
        sprxpl3.cfr_renamed_4 = sprtqm2.cfr_renamed_4190();
        this.cfr_renamed_0 = sprtqm2.cfr_renamed_4191();
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_91 = sprvwl.cfr_renamed_10799(spridn2, this.cfr_renamed_1, sprhol2, new spresl(this));
            return;
        }
        this.cfr_renamed_91 = sprvwl.cfr_renamed_10801(spridn2, this.cfr_renamed_1, sprhol2);
    }

    public byte[] cfr_renamed_1472() {
        return sproze.cfr_renamed_158(this.cfr_renamed_119);
    }

    public sprxpl(byte[] arg0) throws sprlyl {
        this(spreul.cfr_renamed_4106(arg0));
    }

    public static /* synthetic */ spridn cfr_renamed_10826(sprxpl arg0) {
        return arg0.cfr_renamed_4;
    }

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public sprnpl cfr_renamed_4170() {
        return this.cfr_renamed_2;
    }

    public sprbyl cfr_renamed_4171() {
        return this.cfr_renamed_91;
    }

    public static /* synthetic */ byte[] cfr_renamed_10827(sprxpl arg0) {
        return arg0.cfr_renamed_119;
    }

    public sprjpm cfr_renamed_4191() {
        if (this.cfr_renamed_0 == null) {
            return null;
        }
        return new sprjpm(this.cfr_renamed_0);
    }
}

