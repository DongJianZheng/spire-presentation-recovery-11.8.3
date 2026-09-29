/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbul;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprcsl;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpvl;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtck;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxil;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprtvl
extends sprbul {
    private sprpvl cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtvl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprpvl(new sprxil((String)arg0));
        return this;
    }

    public sprtvl(sprbul arg0) {
        this(arg0.cfr_renamed_568());
    }

    /*
     * WARNING - void declaration
     */
    public sprtvl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprpvl(new sprkhi((Provider)arg0));
        return this;
    }

    public sprtvl(sprbvm sprbvm2) {
        super(sprbvm2);
        sprtvl sprtvl2 = this;
        sprtvl2.cfr_renamed_4 = new sprpvl(new sprrul());
    }

    public PublicKey cfr_renamed_1157() throws sprcsl {
        sprvhm sprvhm2 = this.cfr_renamed_4351().cfr_renamed_1157();
        if (sprvhm2 != null) {
            return this.cfr_renamed_4.cfr_renamed_10966(sprvhm2);
        }
        return null;
    }

    public sprtvl(byte[] arg0) {
        this(sprbvm.cfr_renamed_23(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X500Principal cfr_renamed_4353() {
        sprnbm sprnbm2 = this.cfr_renamed_4351().cfr_renamed_1485();
        if (sprnbm2 == null) {
            return null;
        }
        try {
            return new X500Principal(sprnbm2.cfr_renamed_104("DER"));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprtck.cfr_renamed_9("\"z6v;qw`844{9g#f\"w#4\u0013Q\u000542z4{3}9sw{149u:qm4")).append(iOException.getMessage()).toString());
        }
    }
}

