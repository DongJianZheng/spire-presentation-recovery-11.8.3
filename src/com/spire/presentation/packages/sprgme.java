/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprgme
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprgme)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, ((sprgme)arg0).cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgme cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgme) {
            return (sprgme)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnwj.cfr_renamed_9("z!\u007f(t,\u007fm|/y(p93$}mt(g\u0004}>g,}.vw3")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprgme)sprgme.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprraja.cfr_renamed_9("K?M>J8@6\u000e4\\#A#\u000e8@qI4Z\u0018@\"Z0@2Kk\u000e")).append(exception.toString()).toString());
        }
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public static sprgme cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprgme) {
            return sprgme.cfr_renamed_23(sprvva2);
        }
        return new sprgme(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprgme(String arg0) {
        this(sprywa.cfr_renamed_433(arg0));
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(20, this.cfr_renamed_4);
    }

    public sprgme(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }
}

