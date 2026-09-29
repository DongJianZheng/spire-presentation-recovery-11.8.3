/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprebaa;
import com.spire.presentation.packages.sprfj;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprvtb;
import com.spire.presentation.packages.sprxg;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class sprakg {
    private sprllm cfr_renamed_4;

    public byte[] cfr_renamed_1446() {
        return this.cfr_renamed_4.cfr_renamed_1446();
    }

    public sprddm cfr_renamed_1445() {
        return this.cfr_renamed_4.cfr_renamed_1445();
    }

    public sprakg(sprllm sprllm2) {
        this.cfr_renamed_4 = sprllm2;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public sprllm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprllm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprllm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprdkg(new StringBuilder().insert(0, sprebaa.cfr_renamed_9("#I\"N!Z#M*\b*I:It\b")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprdkg(new StringBuilder().insert(0, sprvtb.cfr_renamed_9("W(V/U;W,^i^(N(\u0000i")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprcom cfr_renamed_7358(sprxg arg0) throws sprhng {
        try {
            sprfj sprfj2 = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_1445());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.cfr_renamed_4.cfr_renamed_1446());
            return sprcom.cfr_renamed_23(sprkqe.cfr_renamed_471(sprfj2.cfr_renamed_1447(byteArrayInputStream)));
        }
        catch (Exception exception) {
            throw new sprhng(new StringBuilder().insert(0, sprebaa.cfr_renamed_9("] I,D+\b:GnZ+I*\b+F-Z7X:M*\b*I:It\b")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprakg(byte[] arg0) throws IOException {
        this(sprakg.cfr_renamed_1443(arg0));
    }
}

