/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprava;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprlmb;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprrae;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;

public class sprrjb
extends sprlmb {
    private InputStream cfr_renamed_4 = null;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_139() throws sprpna {
        try {
            sprrjb sprrjb2 = this;
            sprrjb2.cfr_renamed_4.mark(10);
            int n = sprrjb2.cfr_renamed_4.read();
            if (n == -1) {
                return null;
            }
        }
        catch (Exception exception) {
            throw new sprpna(exception.toString(), exception);
        }
        {
            sprrjb sprrjb3 = this;
            sprrjb3.cfr_renamed_4.reset();
            return sprrjb3.cfr_renamed_2144(sprrjb3.cfr_renamed_4);
        }
    }

    private /* synthetic */ sprava cfr_renamed_2144(InputStream arg0) throws IOException, CertificateParsingException {
        sprrae sprrae2 = sprrae.cfr_renamed_23((sprbne)new sprgle(arg0).cfr_renamed_24());
        return new sprava(sprrae2);
    }

    @Override
    public Collection cfr_renamed_140() throws sprpna {
        sprava sprava2;
        ArrayList<sprava> arrayList = new ArrayList<sprava>();
        sprrjb sprrjb2 = this;
        while ((sprava2 = (sprava)sprrjb2.cfr_renamed_139()) != null) {
            sprrjb2 = this;
            arrayList.add(sprava2);
        }
        return arrayList;
    }

    @Override
    public void cfr_renamed_138(InputStream arg0) {
        this.cfr_renamed_4 = arg0;
        if (!this.cfr_renamed_4.markSupported()) {
            sprrjb sprrjb2 = this;
            this.cfr_renamed_4 = new BufferedInputStream(this.cfr_renamed_4);
        }
    }
}

