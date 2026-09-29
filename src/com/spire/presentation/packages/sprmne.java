/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprcxe;
import com.spire.presentation.packages.sprjan;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class sprmne
extends sprvva
implements sprx {
    private char[] cfr_renamed_4;

    public static sprmne cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprmne) {
            return sprmne.cfr_renamed_23(sprvva2);
        }
        return new sprmne(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprmne cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprmne) {
            return (sprmne)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjan.cfr_renamed_9("\u0012n\u0017g\u001cc\u0017\"\u0014`\u0011g\u0018v[k\u0015\"\u001cg\u000fK\u0015q\u000fc\u0015a\u001e8[")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprmne)sprmne.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcxe.cfr_renamed_9("\u0018]\u001e\\\u0019Z\u0013T]V\u000fA\u0012A]Z\u0013\u0013\u001aV\tz\u0013@\tR\u0013P\u0018\t]")).append(exception.toString()).toString());
        }
    }

    public sprmne(String string) {
        this.cfr_renamed_4 = string.toCharArray();
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public String cfr_renamed_314() {
        return new String(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprmne)) {
            return false;
        }
        sprmne sprmne2 = (sprmne)arg0;
        return sprzra.cfr_renamed_561(this.cfr_renamed_4, sprmne2.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length * 2) + this.cfr_renamed_4.length * 2;
    }

    public sprmne(char[] cArray) {
        this.cfr_renamed_4 = cArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_4613(sprope sprope2) throws IOException {
        int n;
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_4787(30);
        v0.cfr_renamed_4782(this.cfr_renamed_4.length * 2);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            char c = this.cfr_renamed_4[n];
            void v2 = arg0;
            v2.cfr_renamed_4787((byte)(c >> 8));
            v2.cfr_renamed_4787((byte)c);
            n2 = ++n;
        }
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_544(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprmne(byte[] byArray) {
        int n;
        char[] cArray = new char[byArray.length / 2];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            void arg0;
            int n3 = n;
            char c = (char)(arg0[2 * n3] << 8 | arg0[2 * n + 1] & 0xFF);
            cArray[n3] = c;
            n2 = ++n;
        }
        this.cfr_renamed_4 = cArray;
    }
}

