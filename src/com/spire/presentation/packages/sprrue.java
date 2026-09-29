/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprcnx;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprrue
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static sprrue cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprrue) {
            return sprrue.cfr_renamed_23(sprvva2);
        }
        return new sprrue(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(26, this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprrue)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, ((sprrue)arg0).cfr_renamed_4);
    }

    public sprrue(String string) {
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(string);
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprrue cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrue) {
            return (sprrue)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhxa.cfr_renamed_9("\u0013[\u0016R\u001dV\u0016\u0017\u0015U\u0010R\u0019CZ^\u0014\u0017\u001dR\u000e~\u0014D\u000eV\u0014T\u001f\rZ")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprrue)sprrue.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9(" \"&#!%++e)7>*>e%+l\")1\u0005+?1-+/ ve")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    public sprrue(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }
}

