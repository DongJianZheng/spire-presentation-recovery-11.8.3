/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.sprifg;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlok;
import com.spire.presentation.packages.sprmq;
import com.spire.presentation.packages.spronb;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprplk;
import com.spire.presentation.packages.sprpwk;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.io.OutputStream;

public class sprikk
implements sprmq {
    private final byte[] cfr_renamed_119;
    private final sprzuk cfr_renamed_91;
    private final sprddm cfr_renamed_0;
    private final sprlem cfr_renamed_1;
    private final sprgf cfr_renamed_2;
    private final spryhk cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public spryhk cfr_renamed_614() {
        return this.cfr_renamed_3;
    }

    @Override
    public OutputStream cfr_renamed_470() {
        return new sprpwk(this.cfr_renamed_2);
    }

    @Override
    public byte[] cfr_renamed_79() {
        sprikk sprikk2 = this;
        byte[] byArray = new byte[sprikk2.cfr_renamed_2.cfr_renamed_1218()];
        sprikk2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        sprlok sprlok2 = new sprlok(new sprplk(), this.cfr_renamed_2);
        sprlok2.cfr_renamed_5535(true, this.cfr_renamed_91);
        sprlok2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprlok2.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
        return sprlok2.cfr_renamed_1329();
    }

    /*
     * Unable to fully structure code
     */
    public sprikk(sprzuk var1_1, spryhk var2_2) {
        block6: {
            block5: {
                block4: {
                    v0 = this;
                    super();
                    v0.cfr_renamed_91 = arg0;
                    v0.cfr_renamed_1 = ((sprxrk)var1_1.cfr_renamed_284()).cfr_renamed_313();
                    this.cfr_renamed_3 = arg1;
                    if (!this.cfr_renamed_1.cfr_renamed_5078(sprhr.cfr_renamed_1)) break block4;
                    v1 = this;
                    this.cfr_renamed_0 = new sprddm(sprwr.cfr_renamed_1226);
                    ** GOTO lbl-1000
                }
                if (!this.cfr_renamed_1.cfr_renamed_5078(spris.cfr_renamed_96)) break block5;
                v1 = this;
                this.cfr_renamed_0 = new sprddm(sprwr.cfr_renamed_1226);
                ** GOTO lbl-1000
            }
            if (!this.cfr_renamed_1.cfr_renamed_5078(spris.cfr_renamed_93)) break block6;
            v1 = this;
            this.cfr_renamed_0 = new sprddm(sprwr.cfr_renamed_112);
            ** GOTO lbl-1000
        }
        throw new IllegalArgumentException(spronb.cfr_renamed_9("\u0010M\u000eM\nT\u000b\u0003\u000eF\u001c\u0003\u0011Z\u0015F"));
lbl-1000:
        // 3 sources

        {
            v1.cfr_renamed_2 = sprifg.cfr_renamed_3.cfr_renamed_5279(this.cfr_renamed_0);
        }
        if (arg1 != null) {
            try {
                v2 = this;
                v2.cfr_renamed_119 = arg1.cfr_renamed_91();
                v2.cfr_renamed_4 = new byte[v2.cfr_renamed_2.cfr_renamed_1218()];
                v2.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_119, 0, this.cfr_renamed_119.length);
                v3 = this;
                v3.cfr_renamed_2.cfr_renamed_1219(v3.cfr_renamed_4, 0);
                return;
            }
            catch (IOException var3_3) {
                throw new IllegalStateException(new StringBuilder().insert(0, spronb.cfr_renamed_9("\u0016J\u0002M\u0000QE@\u0000Q\u0011J\u0003J\u0006B\u0011FEF\u000b@\nG\fM\u0002\u0003\u0003B\fO\u0000G_\u0003")).append(var3_3.getMessage()).toString());
            }
        }
        v4 = this;
        v4.cfr_renamed_119 = null;
        v4.cfr_renamed_4 = new byte[v4.cfr_renamed_2.cfr_renamed_1218()];
        v4.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_4, 0);
    }

    public sprikk(sprzuk arg0) {
        this(arg0, null);
    }

    @Override
    public sprlem cfr_renamed_9515() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_0;
    }

    @Override
    public byte[] cfr_renamed_9517() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_9516() {
        return this.cfr_renamed_119 == null;
    }
}

