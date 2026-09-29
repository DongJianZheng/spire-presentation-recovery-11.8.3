/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprxvr;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;

public class spraoe
extends sprvva
implements sprx {
    private byte[] cfr_renamed_4;

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof spraoe)) {
            return false;
        }
        spraoe spraoe2 = (spraoe)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, spraoe2.cfr_renamed_4);
    }

    public spraoe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public static spraoe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof spraoe) {
            return spraoe.cfr_renamed_23(sprvva2);
        }
        return new spraoe(sprxue.cfr_renamed_23(sprvva2).cfr_renamed_186());
    }

    public byte[] cfr_renamed_186() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spraoe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spraoe) {
            return (spraoe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdgb.cfr_renamed_9("eP`Yk]`\u001cc^fYoH,Ub\u001ckYxubOx]b_i\u0006,")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (spraoe)spraoe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxvr.cfr_renamed_9("\bS\u000eR\tT\u0003ZMX\u001fO\u0002OMT\u0003\u001d\nX\u0019t\u0003N\u0019\\\u0003^\b\u0007M")).append(exception.toString()).toString());
        }
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public String cfr_renamed_314() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public spraoe(String arg0) {
        this(arg0, false);
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public static boolean cfr_renamed_4449(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            char c = arg0.charAt(n);
            if (c > '\u007f') {
                return false;
            }
            if (!('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9')) {
                switch (c) {
                    case ' ': 
                    case '\'': 
                    case '(': 
                    case ')': 
                    case '+': 
                    case ',': 
                    case '-': 
                    case '.': 
                    case '/': 
                    case ':': 
                    case '=': 
                    case '?': {
                        break;
                    }
                    default: {
                        return false;
                    }
                }
            }
            n2 = --n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public spraoe(String string, boolean bl) {
        void arg0;
        if (bl && !spraoe.cfr_renamed_4449((String)arg0)) {
            throw new IllegalArgumentException(sprxvr.cfr_renamed_9("N\u0019O\u0004S\n\u001d\u000eR\u0003I\fT\u0003NMT\u0001Q\bZ\fQM^\u0005\\\u001f\\\u000eI\bO\u001e"));
        }
        this.cfr_renamed_4 = sprywa.cfr_renamed_433((String)arg0);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(19, this.cfr_renamed_4);
    }
}

