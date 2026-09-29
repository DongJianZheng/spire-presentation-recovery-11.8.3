/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbnb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprlmb;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprozd;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryte;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;

public class sprjtb
extends sprlmb {
    private sprere cfr_renamed_1;
    private InputStream cfr_renamed_2;
    private static final sprjmb cfr_renamed_3 = new sprjmb("CERTIFICATE");
    private int cfr_renamed_4;

    @Override
    public Collection cfr_renamed_140() throws sprpna {
        Certificate certificate;
        ArrayList<Certificate> arrayList = new ArrayList<Certificate>();
        sprjtb sprjtb2 = this;
        while ((certificate = (Certificate)sprjtb2.cfr_renamed_139()) != null) {
            sprjtb2 = this;
            arrayList.add(certificate);
        }
        return arrayList;
    }

    @Override
    public Object cfr_renamed_139() throws sprpna {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_1 == null) break block6;
                    sprjtb sprjtb2 = this;
                    if (sprjtb2.cfr_renamed_4 == sprjtb2.cfr_renamed_1.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2141();
                }
                catch (Exception exception) {
                    throw new sprpna(exception.toString(), exception);
                }
            }
            this.cfr_renamed_1 = null;
            this.cfr_renamed_4 = 0;
            return null;
        }
        sprjtb sprjtb3 = this;
        sprjtb3.cfr_renamed_2.mark(10);
        int n = sprjtb3.cfr_renamed_2.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            sprjtb sprjtb4 = this;
            sprjtb4.cfr_renamed_2.reset();
            return sprjtb4.cfr_renamed_2142(sprjtb4.cfr_renamed_2);
        }
        sprjtb sprjtb5 = this;
        sprjtb5.cfr_renamed_2.reset();
        return sprjtb5.cfr_renamed_2143(sprjtb5.cfr_renamed_2);
    }

    private /* synthetic */ Certificate cfr_renamed_2142(InputStream arg0) throws IOException, CertificateParsingException {
        sprbne sprbne2 = cfr_renamed_3.cfr_renamed_2129(arg0);
        if (sprbne2 != null) {
            return new sprbnb(sprcge.cfr_renamed_23(sprbne2));
        }
        return null;
    }

    private /* synthetic */ Certificate cfr_renamed_2141() throws CertificateParsingException {
        block2: {
            if (this.cfr_renamed_1 != null) {
                spra spra2;
                do {
                    sprjtb sprjtb2 = this;
                    if (sprjtb2.cfr_renamed_4 >= sprjtb2.cfr_renamed_1.cfr_renamed_84()) break block2;
                } while (!((spra2 = this.cfr_renamed_1.cfr_renamed_85(this.cfr_renamed_4++)) instanceof sprbne));
                return new sprbnb(sprcge.cfr_renamed_23(spra2));
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_1 = null;
        this.cfr_renamed_4 = 0;
        if (!this.cfr_renamed_2.markSupported()) {
            sprjtb sprjtb2 = this;
            this.cfr_renamed_2 = new BufferedInputStream(this.cfr_renamed_2);
        }
    }

    private /* synthetic */ Certificate cfr_renamed_2143(InputStream arg0) throws IOException, CertificateParsingException {
        sprbne sprbne2 = (sprbne)new sprgle(arg0).cfr_renamed_24();
        if (sprbne2.cfr_renamed_84() > 1 && sprbne2.cfr_renamed_85(0) instanceof sprtzd && sprbne2.cfr_renamed_85(0).equals(sprm.cfr_renamed_1397)) {
            sprjtb sprjtb2 = this;
            sprjtb2.cfr_renamed_1 = new sprozd(sprbne.cfr_renamed_341((spryte)sprbne2.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprbnb(sprcge.cfr_renamed_23(sprbne2));
    }

    public sprjtb() {
        sprjtb sprjtb2 = this;
        this.cfr_renamed_1 = null;
        sprjtb2.cfr_renamed_4 = 0;
        sprjtb2.cfr_renamed_2 = null;
    }
}

