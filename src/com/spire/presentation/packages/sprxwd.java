/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakia;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprbho;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprxqd;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzsd;
import java.io.IOException;
import java.io.InputStream;

public class sprxwd {
    public spryxd cfr_renamed_0;
    private sprzsd cfr_renamed_1;
    public sprnte cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprere cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_3956(spra arg0) throws IOException {
        if (arg0 != null) {
            return arg0.cfr_renamed_119().cfr_renamed_91();
        }
        return null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_91();
    }

    public sprije cfr_renamed_4173() {
        return this.cfr_renamed_3;
    }

    public sprvte cfr_renamed_4175() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return new sprvte(this.cfr_renamed_4);
    }

    public sprnte cfr_renamed_568() {
        return this.cfr_renamed_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_3697() {
        try {
            sprxwd sprxwd2 = this;
            return sprxwd2.cfr_renamed_3956(sprxwd2.cfr_renamed_3.cfr_renamed_284());
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprakia.cfr_renamed_9("P\u0011V\fE\u001d\\\u0006[IR\fA\u001d\\\u0007RIP\u0007V\u001bL\u0019A\u0000Z\u0007\u0015\u0019T\u001bT\u0004P\u001dP\u001bFI")).append(exception).toString());
        }
    }

    public sprxwd(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public sprxwd(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxwd(sprnte sprnte2) throws sprlqd {
        this.cfr_renamed_2 = sprnte2;
        try {
            void arg0;
            sprase sprase2 = sprase.cfr_renamed_23(arg0.cfr_renamed_480());
            if (sprase2.cfr_renamed_4170() != null) {
                sprxwd sprxwd2 = this;
                sprxwd2.cfr_renamed_1 = new sprzsd(sprase2.cfr_renamed_4170());
            }
            sprase sprase3 = sprase2;
            sprere sprere2 = sprase3.cfr_renamed_4171();
            spreoe spreoe2 = sprase3.cfr_renamed_4172();
            sprxwd sprxwd3 = this;
            sprxwd3.cfr_renamed_3 = spreoe2.cfr_renamed_4173();
            sprard sprard2 = new sprard(spreoe2.cfr_renamed_4178().cfr_renamed_186());
            sprxqd sprxqd2 = new sprxqd(this.cfr_renamed_3, sprard2);
            sprxwd3.cfr_renamed_0 = sprhqd.cfr_renamed_4157(sprere2, this.cfr_renamed_3, sprxqd2);
            this.cfr_renamed_4 = sprase2.cfr_renamed_4176();
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprbho.cfr_renamed_9("\u000e^/Y,M.Z'\u001f P-K&Q7\u0011"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlqd(sprakia.cfr_renamed_9("x\bY\u000fZ\u001bX\fQIV\u0006[\u001dP\u0007AG"), illegalArgumentException);
        }
    }

    public sprzsd cfr_renamed_4170() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_3959() {
        return this.cfr_renamed_3.cfr_renamed_593().cfr_renamed_19();
    }

    public spryxd cfr_renamed_4171() {
        return this.cfr_renamed_0;
    }
}

