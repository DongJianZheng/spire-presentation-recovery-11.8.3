/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprhpm;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkx;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprtmn;
import java.io.IOException;
import java.io.InputStream;

public class sprvnl
implements sprjn {
    public sprlvm cfr_renamed_3;
    public sprhpm cfr_renamed_4;

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_3.cfr_renamed_696();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprvnl(InputStream arg0) throws sprlyl {
        this(spreul.cfr_renamed_4104(arg0));
    }

    public sprvnl(byte[] arg0) throws sprlyl {
        this(spreul.cfr_renamed_4106(arg0));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvnl(sprlvm sprlvm2) throws sprlyl {
        this.cfr_renamed_3 = sprlvm2;
        try {
            void arg0;
            this.cfr_renamed_4 = sprhpm.cfr_renamed_23(arg0.cfr_renamed_480());
            return;
        }
        catch (ClassCastException classCastException) {
            throw new sprlyl(sprtmn.cfr_renamed_9("I+h,k8i/`jg%j>a$pd"), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprlyl(sprjaaa.cfr_renamed_9("\u0002\u0000#\u0007 \u0013\"\u0004+A,\u000e!\u0015*\u000f;O"), illegalArgumentException);
        }
    }

    public sprhql cfr_renamed_10818(sprkx arg0) {
        sprlvm sprlvm2 = this.cfr_renamed_4.cfr_renamed_2589();
        sproug sproug2 = (sproug)sprlvm2.cfr_renamed_480();
        InputStream inputStream = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_4187()).cfr_renamed_1447(sproug2.cfr_renamed_698());
        return new sprhql(sprlvm2.cfr_renamed_696(), inputStream);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_10816(sprkx arg0) throws sprlyl {
        sproug sproug2 = (sproug)this.cfr_renamed_4.cfr_renamed_2589().cfr_renamed_480();
        InputStream inputStream = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_4187()).cfr_renamed_1447(sproug2.cfr_renamed_698());
        try {
            return spreul.cfr_renamed_4002(inputStream);
        }
        catch (IOException iOException) {
            throw new sprlyl(sprtmn.cfr_renamed_9("a2g/t>m%jjv/e.m$cjg%i:v/w9a.$9p8a+id"), iOException);
        }
    }

    public sprlem cfr_renamed_10819() {
        return this.cfr_renamed_4.cfr_renamed_2589().cfr_renamed_696();
    }
}

