/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqyl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprzth;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Collection;

public class sprfoh
extends sprjth {
    private int cfr_renamed_1;
    private static final sprcrh cfr_renamed_2 = new sprcrh("CERTIFICATE");
    private InputStream cfr_renamed_3;
    private spridn cfr_renamed_4;

    private /* synthetic */ Certificate cfr_renamed_2143(InputStream arg0) throws IOException, CertificateParsingException {
        sprszm sprszm2 = (sprszm)new sprrzm(arg0).cfr_renamed_24();
        if (sprszm2.cfr_renamed_84() > 1 && sprszm2.cfr_renamed_85(0) instanceof sprlem && sprszm2.cfr_renamed_85(0).equals(sprdl.cfr_renamed_128)) {
            sprfoh sprfoh2 = this;
            sprfoh2.cfr_renamed_4 = new sprqyl(sprszm.cfr_renamed_5085((sprnvm)sprszm2.cfr_renamed_85(1), true)).cfr_renamed_617();
            return this.cfr_renamed_2141();
        }
        return new sprzth(sprndm.cfr_renamed_23(sprszm2));
    }

    private /* synthetic */ Certificate cfr_renamed_2141() throws CertificateParsingException {
        block2: {
            if (this.cfr_renamed_4 != null) {
                sprco sprco2;
                do {
                    sprfoh sprfoh2 = this;
                    if (sprfoh2.cfr_renamed_1 >= sprfoh2.cfr_renamed_4.cfr_renamed_84()) break block2;
                } while (!((sprco2 = this.cfr_renamed_4.cfr_renamed_85(this.cfr_renamed_1++)) instanceof sprszm));
                return new sprzth(sprndm.cfr_renamed_23(sprco2));
            }
        }
        return null;
    }

    public sprfoh() {
        sprfoh sprfoh2 = this;
        this.cfr_renamed_4 = null;
        sprfoh2.cfr_renamed_1 = 0;
        sprfoh2.cfr_renamed_3 = null;
    }

    private /* synthetic */ Certificate cfr_renamed_2142(InputStream arg0) throws IOException, CertificateParsingException {
        sprszm sprszm2 = cfr_renamed_2.cfr_renamed_2129(arg0);
        if (sprszm2 != null) {
            return new sprzth(sprndm.cfr_renamed_23(sprszm2));
        }
        return null;
    }

    @Override
    public Object cfr_renamed_139() throws sprese {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_4 == null) break block6;
                    sprfoh sprfoh2 = this;
                    if (sprfoh2.cfr_renamed_1 == sprfoh2.cfr_renamed_4.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2141();
                }
                catch (Exception exception) {
                    throw new sprese(exception.toString(), exception);
                }
            }
            this.cfr_renamed_4 = null;
            this.cfr_renamed_1 = 0;
            return null;
        }
        sprfoh sprfoh3 = this;
        sprfoh3.cfr_renamed_3.mark(10);
        int n = sprfoh3.cfr_renamed_3.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            sprfoh sprfoh4 = this;
            sprfoh4.cfr_renamed_3.reset();
            return sprfoh4.cfr_renamed_2142(sprfoh4.cfr_renamed_3);
        }
        sprfoh sprfoh5 = this;
        sprfoh5.cfr_renamed_3.reset();
        return sprfoh5.cfr_renamed_2143(sprfoh5.cfr_renamed_3);
    }

    @Override
    public Collection cfr_renamed_140() throws sprese {
        Certificate certificate;
        ArrayList<Certificate> arrayList = new ArrayList<Certificate>();
        sprfoh sprfoh2 = this;
        while ((certificate = (Certificate)sprfoh2.cfr_renamed_139()) != null) {
            sprfoh2 = this;
            arrayList.add(certificate);
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = null;
        this.cfr_renamed_1 = 0;
        if (!this.cfr_renamed_3.markSupported()) {
            sprfoh sprfoh2 = this;
            this.cfr_renamed_3 = new BufferedInputStream(this.cfr_renamed_3);
        }
    }
}

