/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprgpk;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprhqm;
import com.spire.presentation.packages.spryky;
import com.spire.presentation.packages.sprzo;
import java.io.IOException;
import java.io.OutputStream;

public class spralk {
    private sprhqm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprhqm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprhqm.cfr_renamed_23(arg0);
        }
        catch (ClassCastException classCastException) {
            throw new sprgpk(new StringBuilder().insert(0, sprbgp.cfr_renamed_9("!# $#0!'(b(#8#vb")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprgpk(new StringBuilder().insert(0, spryky.cfr_renamed_9("\u00103\u00114\u0012 \u00107\u0019r\u00193\t3Gr")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (sprhbn sprhbn2) {
            if (sprhbn2.getCause() instanceof IOException) {
                throw (IOException)sprhbn2.getCause();
            }
            throw new sprgpk(new StringBuilder().insert(0, sprbgp.cfr_renamed_9("!# $#0!'(b(#8#vb")).append(sprhbn2.getMessage()).toString(), sprhbn2);
        }
    }

    public spralk(byte[] arg0) throws IOException {
        this(spralk.cfr_renamed_1443(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_9826(sprzo arg0) throws sprbjk {
        try {
            sprzo sprzo2 = arg0;
            OutputStream outputStream = sprzo2.cfr_renamed_470();
            spralk spralk2 = this;
            outputStream.write(spralk2.cfr_renamed_4.cfr_renamed_2570().cfr_renamed_104("DER"));
            outputStream.close();
            return sprzo2.cfr_renamed_1435(spralk2.cfr_renamed_4.cfr_renamed_2571());
        }
        catch (Exception exception) {
            throw new sprbjk(new StringBuilder().insert(0, spryky.cfr_renamed_9("'\u00133\u001f>\u0018r\t=]\"\u000f=\u001e7\u000e!]!\u00145\u00133\t'\u000f7Gr")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprfnm cfr_renamed_2572() {
        return this.cfr_renamed_4.cfr_renamed_1157();
    }

    public sprhqm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public spralk(sprhqm sprhqm2) {
        this.cfr_renamed_4 = sprhqm2;
    }
}

