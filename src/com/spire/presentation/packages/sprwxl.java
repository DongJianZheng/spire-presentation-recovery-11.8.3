/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhjea;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprimm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpy;
import com.spire.presentation.packages.sprqzz;
import java.io.IOException;
import java.io.InputStream;

public class sprwxl
implements sprjn {
    private sprimm cfr_renamed_3;
    private sprlvm cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_10812(sprlj arg0) throws sprlyl {
        try {
            sprlvm sprlvm2 = this.cfr_renamed_3.cfr_renamed_2589();
            sprjj sprjj2 = arg0.cfr_renamed_5279(this.cfr_renamed_3.cfr_renamed_410());
            sprjj2.cfr_renamed_470().write(((sproug)sprlvm2.cfr_renamed_480()).cfr_renamed_186());
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_580(), sprjj2.cfr_renamed_580());
        }
        catch (sprhjg sprhjg2) {
            throw new sprlyl(new StringBuilder().insert(0, sprqzz.cfr_renamed_9(",\u00018\r5\ny\u001b6O:\u001d<\u000e-\ny\u000b0\b<\u001c-O:\u000e5\f,\u00038\u001b6\u001dcO")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprhjea.cfr_renamed_9("\u001b/\u000f#\u0002$N1\u001c.\r$\u001d2N\"\u0001/\u001a$\u00005Ta")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprwxl(sprlvm sprlvm2) throws sprlyl {
        this.cfr_renamed_4 = sprlvm2;
        try {
            void arg0;
            this.cfr_renamed_3 = sprimm.cfr_renamed_23(arg0.cfr_renamed_480());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprqzz.cfr_renamed_9("\u0014\u000e5\t6\u001d4\n=O:\u00007\u001b<\u0001-A"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(sprhjea.cfr_renamed_9("# \u0002'\u00013\u0003$\na\r.\u00005\u000b/\u001ao"), illegalArgumentException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprpy cfr_renamed_4181() throws sprlyl {
        sprlvm sprlvm2 = this.cfr_renamed_3.cfr_renamed_2589();
        try {
            return new spraql(sprlvm2.cfr_renamed_696(), ((sproug)sprlvm2.cfr_renamed_480()).cfr_renamed_186());
        }
        catch (Exception exception) {
            throw new sprlyl(sprqzz.cfr_renamed_9("<\u0017:\n)\u001b0\u00007O+\n8\u000b0\u0001>O=\u0006>\n*\u001b<\u000by\u001c-\u001d<\u000e4A"), exception);
        }
    }

    public sprwxl(InputStream arg0) throws sprlyl {
        this(spreul.cfr_renamed_4104(arg0));
    }

    public sprwxl(byte[] arg0) throws sprlyl {
        this(spreul.cfr_renamed_4106(arg0));
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_4.cfr_renamed_696();
    }

    public sprddm cfr_renamed_410() {
        return this.cfr_renamed_3.cfr_renamed_410();
    }
}

