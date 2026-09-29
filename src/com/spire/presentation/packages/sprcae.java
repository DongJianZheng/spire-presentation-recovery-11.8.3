/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprefd;
import com.spire.presentation.packages.sprfxd;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprcae
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcae(String string, boolean bl) {
        void arg0;
        void arg1;
        if (string == null) {
            throw new NullPointerException(sprfxd.cfr_renamed_9("jCk^wP9TxYwXm\u0017{R9Yl[u"));
        }
        if (arg1 != false && !sprcae.cfr_renamed_4794((String)arg0)) {
            throw new IllegalArgumentException(sprefd.cfr_renamed_9("U~TcHm\u0006iIdRkOdU*OfJoAkJ*EbGxGiRoTy"));
        }
        this.cfr_renamed_4 = sprywa.cfr_renamed_433((String)arg0);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public sprcae(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprcae)) {
            return false;
        }
        sprcae sprcae2 = (sprcae)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprcae2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    public static sprcae cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprcae) {
            return sprcae.cfr_renamed_23(sprvva2);
        }
        return new sprcae(((sprxue)sprvva2).cfr_renamed_186());
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(22, this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static boolean cfr_renamed_4794(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            if (arg0.charAt(n) > '\u007f') {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprcae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprcae) {
            return (sprcae)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprefd.cfr_renamed_9("cJfCmGf\u0006eD`CiR*Od\u0006mC~odU~GdEo\u001c*")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprcae)sprcae.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfxd.cfr_renamed_9("|YzX}^wP9RkEvE9^w\u0017~Rm~wDmVwT|\r9")).append(exception.toString()).toString());
        }
    }

    public sprcae(String arg0) {
        this(arg0, false);
    }
}

