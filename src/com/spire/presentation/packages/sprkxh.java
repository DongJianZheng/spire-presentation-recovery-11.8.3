/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcse;
import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprrbm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;

public class sprkxh
extends sprjth {
    private InputStream cfr_renamed_4 = null;

    private /* synthetic */ sprcse cfr_renamed_2144(InputStream arg0) throws IOException, CertificateParsingException {
        sprrbm sprrbm2 = sprrbm.cfr_renamed_23((sprszm)new sprrzm(arg0).cfr_renamed_24());
        return new sprcse(sprrbm2);
    }

    @Override
    public void cfr_renamed_138(InputStream arg0) {
        this.cfr_renamed_4 = arg0;
        if (!this.cfr_renamed_4.markSupported()) {
            sprkxh sprkxh2 = this;
            this.cfr_renamed_4 = new BufferedInputStream(this.cfr_renamed_4);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_139() throws sprese {
        try {
            sprkxh sprkxh2 = this;
            sprkxh2.cfr_renamed_4.mark(10);
            int n = sprkxh2.cfr_renamed_4.read();
            if (n == -1) {
                return null;
            }
        }
        catch (Exception exception) {
            throw new sprese(exception.toString(), exception);
        }
        {
            sprkxh sprkxh3 = this;
            sprkxh3.cfr_renamed_4.reset();
            return sprkxh3.cfr_renamed_2144(sprkxh3.cfr_renamed_4);
        }
    }

    @Override
    public Collection cfr_renamed_140() throws sprese {
        sprcse sprcse2;
        ArrayList<sprcse> arrayList = new ArrayList<sprcse>();
        sprkxh sprkxh2 = this;
        while ((sprcse2 = (sprcse)sprkxh2.cfr_renamed_139()) != null) {
            sprkxh2 = this;
            arrayList.add(sprcse2);
        }
        return arrayList;
    }
}

