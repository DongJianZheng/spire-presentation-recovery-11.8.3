/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprese;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprhyh;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqyl;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprywh;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.Collection;

public class sprivh
extends sprjth {
    private InputStream cfr_renamed_1;
    private static final sprcrh cfr_renamed_2 = new sprcrh(sprywh.cfr_renamed_9("Y\u0015V"));
    private int cfr_renamed_3;
    private spridn cfr_renamed_4;

    private /* synthetic */ CRL cfr_renamed_2128(InputStream arg0) throws IOException, CRLException {
        sprszm sprszm2 = (sprszm)new sprrzm(arg0).cfr_renamed_24();
        if (sprszm2.cfr_renamed_84() > 1 && sprszm2.cfr_renamed_85(0) instanceof sprlem && sprszm2.cfr_renamed_85(0).equals(sprdl.cfr_renamed_128)) {
            sprivh sprivh2 = this;
            sprivh2.cfr_renamed_4 = new sprqyl(sprszm.cfr_renamed_5085((sprnvm)sprszm2.cfr_renamed_85(1), true)).cfr_renamed_633();
            return this.cfr_renamed_2126();
        }
        return new sprhyh(sprffm.cfr_renamed_23(sprszm2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_4 = null;
        this.cfr_renamed_3 = 0;
        if (!this.cfr_renamed_1.markSupported()) {
            sprivh sprivh2 = this;
            this.cfr_renamed_1 = new BufferedInputStream(this.cfr_renamed_1);
        }
    }

    private /* synthetic */ CRL cfr_renamed_2126() throws CRLException {
        block3: {
            block2: {
                if (this.cfr_renamed_4 == null) break block2;
                sprivh sprivh2 = this;
                if (sprivh2.cfr_renamed_3 < sprivh2.cfr_renamed_4.cfr_renamed_84()) break block3;
            }
            return null;
        }
        return new sprhyh(sprffm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(this.cfr_renamed_3++)));
    }

    public sprivh() {
        sprivh sprivh2 = this;
        this.cfr_renamed_4 = null;
        sprivh2.cfr_renamed_3 = 0;
        sprivh2.cfr_renamed_1 = null;
    }

    @Override
    public Object cfr_renamed_139() throws sprese {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_4 == null) break block6;
                    sprivh sprivh2 = this;
                    if (sprivh2.cfr_renamed_3 == sprivh2.cfr_renamed_4.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2126();
                }
                catch (Exception exception) {
                    throw new sprese(exception.toString(), exception);
                }
            }
            this.cfr_renamed_4 = null;
            this.cfr_renamed_3 = 0;
            return null;
        }
        sprivh sprivh3 = this;
        sprivh3.cfr_renamed_1.mark(10);
        int n = sprivh3.cfr_renamed_1.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            sprivh sprivh4 = this;
            sprivh4.cfr_renamed_1.reset();
            return sprivh4.cfr_renamed_2127(sprivh4.cfr_renamed_1);
        }
        sprivh sprivh5 = this;
        sprivh5.cfr_renamed_1.reset();
        return sprivh5.cfr_renamed_2128(sprivh5.cfr_renamed_1);
    }

    @Override
    public Collection cfr_renamed_140() throws sprese {
        CRL cRL;
        ArrayList<CRL> arrayList = new ArrayList<CRL>();
        sprivh sprivh2 = this;
        while ((cRL = (CRL)sprivh2.cfr_renamed_139()) != null) {
            sprivh2 = this;
            arrayList.add(cRL);
        }
        return arrayList;
    }

    private /* synthetic */ CRL cfr_renamed_2127(InputStream arg0) throws IOException, CRLException {
        sprszm sprszm2 = cfr_renamed_2.cfr_renamed_2129(arg0);
        if (sprszm2 != null) {
            return new sprhyh(sprffm.cfr_renamed_23(sprszm2));
        }
        return null;
    }
}

