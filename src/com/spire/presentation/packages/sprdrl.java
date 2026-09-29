/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcol;
import com.spire.presentation.packages.sprfhi;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprlem;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprdrl
extends sprhql {
    private final sprco cfr_renamed_4;

    public sprco cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_4117() throws IOException {
        this.cfr_renamed_4.cfr_renamed_119();
    }

    /*
     * WARNING - void declaration
     */
    public sprdrl(sprlem sprlem2, sprco sprco2) throws IOException {
        super((sprlem)arg0);
        void arg0;
        this.cfr_renamed_4 = sprco2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream cfr_renamed_4004() {
        try {
            sprdrl sprdrl2 = this;
            return sprdrl2.cfr_renamed_10669(sprdrl2.cfr_renamed_4);
        }
        catch (IOException iOException) {
            throw new sprcol(new StringBuilder().insert(0, sprfhi.cfr_renamed_9("#_7S:TvE9\u00115^8G3C\"\u00115^8E3_\"\u0011\"^vB\"C3P;\u000bv")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    private /* synthetic */ InputStream cfr_renamed_10669(sprco arg0) throws IOException {
        byte[] byArray = arg0.cfr_renamed_119().cfr_renamed_104("DER");
        int n = 0;
        int n2 = byArray[n] & 0x1F;
        ++n;
        if (n2 == 31) {
            byte[] byArray2 = byArray;
            while (true) {
                int n3 = byArray2[n] & 0x80;
                ++n;
                if (n3 == 0) break;
                byArray2 = byArray;
            }
        }
        byte by = byArray[n];
        ++n;
        if ((by & 0x80) != 0) {
            n += by & 0x7F;
        }
        return new ByteArrayInputStream(byArray, n, byArray.length - n);
    }
}

