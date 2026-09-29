/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprkkaa;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprxte
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(12, this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprxte cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprxte) {
            return (sprxte)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("\u0007)\u0002 \t$\u0002e\u0001'\u0004 \r1N,\u0000e\t \u001a\f\u00006\u001a$\u0000&\u000b\u007fN")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprxte)sprxte.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprkkaa.cfr_renamed_9("&B C'E-KcI1^,^cE-\f$I7e-_7M-O&\u0016c")).append(exception.toString()).toString());
        }
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_427(this.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_4616() throws IOException {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
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
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprxte)) {
            return false;
        }
        sprxte sprxte2 = (sprxte)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprxte2.cfr_renamed_4);
    }

    public static sprxte cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprxte) {
            return sprxte.cfr_renamed_23(sprvva2);
        }
        return new sprxte(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    public sprxte(String string) {
        this.cfr_renamed_4 = sprywa.cfr_renamed_431(string);
    }

    public sprxte(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }
}

