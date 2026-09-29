/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprbva;
import com.spire.presentation.packages.sprcae;
import com.spire.presentation.packages.sprdve;
import com.spire.presentation.packages.sprdwe;
import com.spire.presentation.packages.spreqe;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmna;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnsa;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprqre;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprhoa
extends sprmna {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnsa cfr_renamed_699(sprbva arg0, InputStream arg1) throws sprlqd {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (arg1 != null) {
            try {
                sprbsa.cfr_renamed_472(arg1, byteArrayOutputStream);
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sproqr.cfr_renamed_9("\u0000\u0017\u0006\n\u0015\u001b\f\u0000\u000bO\u0000\u0001\u0006\u000e\u0015\u001c\u0010\u0003\u0004\u001b\f\u0001\u0002O\u0006\u0000\u000b\u001b\u0000\u0001\u0011UE")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        sprnle sprnle2 = null;
        if (byteArrayOutputStream.size() != 0) {
            sprnle2 = new sprnle(byteArrayOutputStream.toByteArray());
        }
        sprdwe sprdwe2 = new sprdwe(arg0.cfr_renamed_637().cfr_renamed_568());
        sprcae sprcae2 = null;
        if (this.cfr_renamed_3 != null) {
            sprcae2 = new sprcae(this.cfr_renamed_3.toString());
        }
        return new sprnsa(new sprnte(sprgl.cfr_renamed_93, new sprdve(sprcae2, this.cfr_renamed_4, sprnle2, new sprqre(new spreqe(sprdwe2)))));
    }

    public sprnsa cfr_renamed_700(sprbva arg0, byte[] arg1) throws sprlqd {
        return this.cfr_renamed_699(arg0, new ByteArrayInputStream(arg1));
    }

    public sprnsa cfr_renamed_701(sprbva arg0) throws sprlqd {
        return this.cfr_renamed_699(arg0, null);
    }
}

