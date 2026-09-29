/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprcwr;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprgpk;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprvsz;
import com.spire.presentation.packages.sprzkm;
import com.spire.presentation.packages.sprzo;
import java.io.IOException;
import java.io.OutputStream;

public class sprzik {
    private sprzkm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_9827(sprzo arg0) throws sprbjk {
        try {
            sprzo sprzo2 = arg0;
            OutputStream outputStream = sprzo2.cfr_renamed_470();
            sprzik sprzik2 = this;
            outputStream.write(sprzik2.cfr_renamed_4.cfr_renamed_2573().cfr_renamed_104("DER"));
            outputStream.close();
            return sprzo2.cfr_renamed_1435(sprzik2.cfr_renamed_4.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprbjk(new StringBuilder().insert(0, sprvsz.cfr_renamed_9("zDnHcO/^`\n\u007fX`IjY|\n|ChDn^zXj\u0010/")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprzkm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprzik(sprzkm sprzkm2) {
        this.cfr_renamed_4 = sprzkm2;
    }

    public sprzik(byte[] arg0) throws IOException {
        this(sprzik.cfr_renamed_1443(arg0));
    }

    public sprfnm cfr_renamed_2572() {
        return this.cfr_renamed_4.cfr_renamed_2573().cfr_renamed_1157();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprzkm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprzkm.cfr_renamed_23(arg0);
        }
        catch (ClassCastException classCastException) {
            throw new sprgpk(new StringBuilder().insert(0, sprcwr.cfr_renamed_9("a]`ZcNaYh\u001ch]x]6\u001c")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprgpk(new StringBuilder().insert(0, sprvsz.cfr_renamed_9("GnFiE}GjN/Nn^n\u0010/")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (sprhbn sprhbn2) {
            if (sprhbn2.getCause() instanceof IOException) {
                throw (IOException)sprhbn2.getCause();
            }
            throw new sprgpk(new StringBuilder().insert(0, sprcwr.cfr_renamed_9("a]`ZcNaYh\u001ch]x]6\u001c")).append(sprhbn2.getMessage()).toString(), sprhbn2);
        }
    }
}

