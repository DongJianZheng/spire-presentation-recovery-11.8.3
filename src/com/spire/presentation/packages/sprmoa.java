/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprnla;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprxra;
import com.spire.presentation.packages.sprzsr;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;

public class sprmoa
implements spro {
    private sprwlb cfr_renamed_3;
    private Provider cfr_renamed_4;

    @Override
    public Collection cfr_renamed_152(sprb arg0) {
        return this.cfr_renamed_3.cfr_renamed_150(arg0);
    }

    public Provider cfr_renamed_144() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmoa(Provider provider, sprwlb sprwlb2) {
        void arg0;
        sprmoa sprmoa2 = this;
        sprmoa2.cfr_renamed_4 = arg0;
        sprmoa2.cfr_renamed_3 = sprwlb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprmoa cfr_renamed_153(String arg0, sprw arg1) throws sprxra {
        try {
            sprnla sprnla2 = sprjra.cfr_renamed_117(sprzsr.cfr_renamed_9("T:<6_{c}i"), arg0);
            return sprmoa.cfr_renamed_154(sprnla2, arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprxra(noSuchAlgorithmException.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprmoa cfr_renamed_155(String arg0, sprw arg1, Provider arg2) throws sprxra {
        try {
            sprnla sprnla2 = sprjra.cfr_renamed_115(sprraja.cfr_renamed_9("vd\u001eh}%A#K"), arg0, arg2);
            return sprmoa.cfr_renamed_154(sprnla2, arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprxra(noSuchAlgorithmException.getMessage());
        }
    }

    public static sprmoa cfr_renamed_156(String arg0, sprw arg1, String arg2) throws sprxra, NoSuchProviderException {
        return sprmoa.cfr_renamed_155(arg0, arg1, sprjra.cfr_renamed_121(arg2));
    }

    private static /* synthetic */ sprmoa cfr_renamed_154(sprnla arg0, sprw arg1) {
        sprwlb sprwlb2 = (sprwlb)arg0.cfr_renamed_143();
        sprwlb2.cfr_renamed_151(arg1);
        return new sprmoa(arg0.cfr_renamed_144(), sprwlb2);
    }
}

