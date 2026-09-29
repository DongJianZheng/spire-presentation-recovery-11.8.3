/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwor;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprypk;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprwpe
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprwpe)) {
            return false;
        }
        sprwpe sprwpe2 = (sprwpe)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprwpe2.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(27, this.cfr_renamed_4);
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static sprwpe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprwpe) {
            return sprwpe.cfr_renamed_23(sprvva2);
        }
        return new sprwpe(((sprxue)sprvva2).cfr_renamed_186());
    }

    public sprwpe(String string) {
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprwpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprwpe) {
            return (sprwpe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprypk.cfr_renamed_9("e\u0000`\tk\r`Lc\u000ef\to\u0018,\u0005bLk\tx%b\u001fx\rb\u000fiV,")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprwpe)sprwpe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwor.cfr_renamed_9("3U5T2R8\\v^$I9IvR8\u001b1^\"r8H\"Z8X3\u0001v")).append(exception.toString()).toString());
        }
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public sprwpe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }
}

