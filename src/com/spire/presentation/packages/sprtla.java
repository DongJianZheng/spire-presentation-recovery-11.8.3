/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbra;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprlmb;
import com.spire.presentation.packages.sprnla;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprtaca;
import com.spire.presentation.packages.sprv;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;

public class sprtla
implements sprv {
    private sprlmb cfr_renamed_3;
    private Provider cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprtla cfr_renamed_141(String arg0) throws sprbra {
        try {
            sprnla sprnla2 = sprjra.cfr_renamed_117(sprnsc.cfr_renamed_9("\u0004Pl\\\u000f\u0011.\u0000=\b\f\u0004.\u00169\u0017"), arg0);
            return sprtla.cfr_renamed_142(sprnla2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprbra(noSuchAlgorithmException.getMessage());
        }
    }

    private static /* synthetic */ sprtla cfr_renamed_142(sprnla arg0) {
        sprlmb sprlmb2 = (sprlmb)arg0.cfr_renamed_143();
        return new sprtla(arg0.cfr_renamed_144(), sprlmb2);
    }

    public Provider cfr_renamed_144() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtla(Provider provider, sprlmb sprlmb2) {
        void arg0;
        sprtla sprtla2 = this;
        sprtla2.cfr_renamed_4 = arg0;
        sprtla2.cfr_renamed_3 = sprlmb2;
    }

    @Override
    public Collection cfr_renamed_145() throws sprpna {
        return this.cfr_renamed_3.cfr_renamed_140();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprtla cfr_renamed_146(String arg0, Provider arg1) throws sprbra {
        try {
            sprnla sprnla2 = sprjra.cfr_renamed_115(sprtaca.cfr_renamed_9("\u001f\u0003w\u000f\u0014B5S&[\u0017W5E\"D"), arg0, arg1);
            return sprtla.cfr_renamed_142(sprnla2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprbra(noSuchAlgorithmException.getMessage());
        }
    }

    public static sprtla cfr_renamed_147(String arg0, String arg1) throws sprbra, NoSuchProviderException {
        return sprtla.cfr_renamed_146(arg0, sprjra.cfr_renamed_121(arg1));
    }

    public void cfr_renamed_148(byte[] arg0) {
        this.cfr_renamed_3.cfr_renamed_138(new ByteArrayInputStream(arg0));
    }

    @Override
    public Object cfr_renamed_137() throws sprpna {
        return this.cfr_renamed_3.cfr_renamed_139();
    }

    public void cfr_renamed_149(InputStream arg0) {
        this.cfr_renamed_3.cfr_renamed_138(arg0);
    }
}

