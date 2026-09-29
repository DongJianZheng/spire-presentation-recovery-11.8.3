/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgp;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzna;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprlwe
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    public sprlwe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    public static boolean cfr_renamed_4793(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            char c = arg0.charAt(n);
            if (c > '\u007f') {
                return false;
            }
            if (('0' > c || c > '9') && c != ' ') {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprlwe(String string, boolean bl) {
        void arg0;
        if (bl && !sprlwe.cfr_renamed_4793((String)arg0)) {
            throw new IllegalArgumentException(sprcgp.cfr_renamed_9(",?-\"1,\u007f(0%+*6%,k6'3.8*3k<#>9>(+.-8"));
        }
        this.cfr_renamed_4 = sprywa.cfr_renamed_433((String)arg0);
    }

    public sprlwe(String arg0) {
        this(arg0, false);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public static sprlwe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprlwe) {
            return sprlwe.cfr_renamed_23(sprvva2);
        }
        return new sprlwe(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprlwe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprlwe) {
            return (sprlwe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcgp.cfr_renamed_9("\"3':,>'\u007f$=!:(+k6%\u007f,:?\u0016%,?>%<.ek")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprlwe)sprlwe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzna.cfr_renamed_9("lejdmbgl)n{yfy)bg+nn}Bgx}jghl1)")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprlwe)) {
            return false;
        }
        sprlwe sprlwe2 = (sprlwe)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprlwe2.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(18, this.cfr_renamed_4);
    }
}

