/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprlmb;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprozd;
import com.spire.presentation.packages.sprpna;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spryte;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.util.ArrayList;
import java.util.Collection;

public class sprvlb
extends sprlmb {
    private static final sprjmb cfr_renamed_1 = new sprjmb(sprjxl.cfr_renamed_9("@3O"));
    private sprere cfr_renamed_2;
    private int cfr_renamed_3;
    private InputStream cfr_renamed_4;

    @Override
    public Collection cfr_renamed_140() throws sprpna {
        CRL cRL;
        ArrayList<CRL> arrayList = new ArrayList<CRL>();
        sprvlb sprvlb2 = this;
        while ((cRL = (CRL)sprvlb2.cfr_renamed_139()) != null) {
            sprvlb2 = this;
            arrayList.add(cRL);
        }
        return arrayList;
    }

    @Override
    public Object cfr_renamed_139() throws sprpna {
        block6: {
            block7: {
                try {
                    if (this.cfr_renamed_2 == null) break block6;
                    sprvlb sprvlb2 = this;
                    if (sprvlb2.cfr_renamed_3 == sprvlb2.cfr_renamed_2.cfr_renamed_84()) break block7;
                    return this.cfr_renamed_2126();
                }
                catch (Exception exception) {
                    throw new sprpna(exception.toString(), exception);
                }
            }
            this.cfr_renamed_2 = null;
            this.cfr_renamed_3 = 0;
            return null;
        }
        sprvlb sprvlb3 = this;
        sprvlb3.cfr_renamed_4.mark(10);
        int n = sprvlb3.cfr_renamed_4.read();
        if (n == -1) {
            return null;
        }
        if (n != 48) {
            sprvlb sprvlb4 = this;
            sprvlb4.cfr_renamed_4.reset();
            return sprvlb4.cfr_renamed_2127(sprvlb4.cfr_renamed_4);
        }
        sprvlb sprvlb5 = this;
        sprvlb5.cfr_renamed_4.reset();
        return sprvlb5.cfr_renamed_2128(sprvlb5.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_138(InputStream inputStream) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = null;
        this.cfr_renamed_3 = 0;
        if (!this.cfr_renamed_4.markSupported()) {
            sprvlb sprvlb2 = this;
            this.cfr_renamed_4 = new BufferedInputStream(this.cfr_renamed_4);
        }
    }

    private /* synthetic */ CRL cfr_renamed_2127(InputStream arg0) throws IOException, CRLException {
        sprbne sprbne2 = cfr_renamed_1.cfr_renamed_2129(arg0);
        if (sprbne2 != null) {
            return new sprgtb(sproje.cfr_renamed_23(sprbne2));
        }
        return null;
    }

    private /* synthetic */ CRL cfr_renamed_2126() throws CRLException {
        block3: {
            block2: {
                if (this.cfr_renamed_2 == null) break block2;
                sprvlb sprvlb2 = this;
                if (sprvlb2.cfr_renamed_3 < sprvlb2.cfr_renamed_2.cfr_renamed_84()) break block3;
            }
            return null;
        }
        return new sprgtb(sproje.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_85(this.cfr_renamed_3++)));
    }

    private /* synthetic */ CRL cfr_renamed_2128(InputStream arg0) throws IOException, CRLException {
        sprbne sprbne2 = (sprbne)new sprgle(arg0).cfr_renamed_24();
        if (sprbne2.cfr_renamed_84() > 1 && sprbne2.cfr_renamed_85(0) instanceof sprtzd && sprbne2.cfr_renamed_85(0).equals(sprm.cfr_renamed_1397)) {
            sprvlb sprvlb2 = this;
            sprvlb2.cfr_renamed_2 = new sprozd(sprbne.cfr_renamed_341((spryte)sprbne2.cfr_renamed_85(1), true)).cfr_renamed_633();
            return this.cfr_renamed_2126();
        }
        return new sprgtb(sproje.cfr_renamed_23(sprbne2));
    }

    public sprvlb() {
        sprvlb sprvlb2 = this;
        this.cfr_renamed_2 = null;
        sprvlb2.cfr_renamed_3 = 0;
        sprvlb2.cfr_renamed_4 = null;
    }
}

