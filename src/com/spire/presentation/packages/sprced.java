/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprgvda;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprko;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import java.util.Hashtable;

public class sprced
implements spruc {
    private static Hashtable cfr_renamed_86 = new Hashtable();
    private int cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private sprrj cfr_renamed_119;
    private static final byte cfr_renamed_91 = 54;
    private static final byte cfr_renamed_0 = 92;
    private sprrj cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_152;
    }

    @Override
    public void cfr_renamed_1524(sprt sprt2) {
        int n;
        int n2;
        this.cfr_renamed_3.cfr_renamed_41();
        byte[] byArray = ((sprnld)sprt2).cfr_renamed_1521();
        int n3 = byArray.length;
        if (n3 > this.cfr_renamed_4) {
            sprced sprced2 = this;
            sprced2.cfr_renamed_3.cfr_renamed_1197(byArray, 0, n3);
            sprced2.cfr_renamed_3.cfr_renamed_1219(this.cfr_renamed_112, 0);
            n3 = this.cfr_renamed_152;
            n2 = n3;
        } else {
            System.arraycopy(byArray, 0, this.cfr_renamed_112, 0, n3);
            n2 = n3;
        }
        int n4 = n = n2;
        while (n4 < this.cfr_renamed_112.length) {
            this.cfr_renamed_112[n++] = 0;
            n4 = n;
        }
        sprced sprced3 = this;
        System.arraycopy(sprced3.cfr_renamed_112, 0, this.cfr_renamed_2, 0, this.cfr_renamed_4);
        sprced sprced4 = this;
        sprced.cfr_renamed_3475(sprced3.cfr_renamed_112, sprced4.cfr_renamed_4, (byte)54);
        sprced.cfr_renamed_3475(sprced4.cfr_renamed_2, this.cfr_renamed_4, (byte)92);
        if (sprced3.cfr_renamed_3 instanceof sprrj) {
            this.cfr_renamed_1 = ((sprrj)((Object)this.cfr_renamed_3)).cfr_renamed_461();
            ((sprlc)((Object)this.cfr_renamed_1)).cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_4);
        }
        sprced sprced5 = this;
        sprced5.cfr_renamed_3.cfr_renamed_1197(sprced5.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        if (this.cfr_renamed_3 instanceof sprrj) {
            this.cfr_renamed_119 = ((sprrj)((Object)this.cfr_renamed_3)).cfr_renamed_461();
        }
    }

    private static /* synthetic */ int cfr_renamed_3476(sprlc arg0) {
        if (arg0 instanceof sprko) {
            return ((sprko)arg0).cfr_renamed_3248();
        }
        Integer n = (Integer)cfr_renamed_86.get(arg0.cfr_renamed_1315());
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgvda.cfr_renamed_9("a\b\u007f\b{\u0011zFp\u000fs\u0003g\u00124\u0016u\u0015g\u0003p\\4")).append(arg0.cfr_renamed_1315()).toString());
        }
        return n;
    }

    private static /* synthetic */ void cfr_renamed_3475(byte[] arg0, int arg1, byte arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1) {
            int n3 = n++;
            arg0[n3] = (byte)(arg0[n3] ^ arg2);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        void arg1;
        void arg0;
        sprced sprced2;
        sprced sprced3 = this;
        sprced sprced4 = this;
        sprced3.cfr_renamed_3.cfr_renamed_1219(sprced3.cfr_renamed_2, sprced4.cfr_renamed_4);
        if (sprced4.cfr_renamed_1 != null) {
            ((sprrj)((Object)this.cfr_renamed_3)).cfr_renamed_462(this.cfr_renamed_1);
            sprced sprced5 = this;
            sprced sprced6 = this;
            sprced2 = sprced6;
            sprced5.cfr_renamed_3.cfr_renamed_1197(sprced5.cfr_renamed_2, sprced6.cfr_renamed_4, this.cfr_renamed_3.cfr_renamed_1218());
        } else {
            sprced sprced7 = this;
            sprced7.cfr_renamed_3.cfr_renamed_1197(sprced7.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            sprced2 = this;
        }
        int n3 = sprced2.cfr_renamed_3.cfr_renamed_1219((byte[])arg0, (int)arg1);
        int n4 = n2 = this.cfr_renamed_4;
        while (n4 < this.cfr_renamed_2.length) {
            this.cfr_renamed_2[n2++] = 0;
            n4 = n2;
        }
        sprced sprced8 = this;
        if (this.cfr_renamed_119 != null) {
            ((sprrj)((Object)sprced8.cfr_renamed_3)).cfr_renamed_462(this.cfr_renamed_119);
            return n3;
        }
        sprced8.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        return n3;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_1221(arg0);
    }

    static {
        cfr_renamed_86.put(sprbyfa.cfr_renamed_9("\n\u001d\u001e\u0006~f|c"), spriwa.cfr_renamed_279(32));
        cfr_renamed_86.put(sprgvda.cfr_renamed_9("Y\"&"), spriwa.cfr_renamed_279(16));
        cfr_renamed_86.put(sprbyfa.cfr_renamed_9("\u001f\tf"), spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("MD5", spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put(sprgvda.cfr_renamed_9("F/D#Y\"%T,"), spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("RIPEMD160", spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("SHA-1", spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("SHA-224", spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("SHA-256", spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put("SHA-384", spriwa.cfr_renamed_279(128));
        cfr_renamed_86.put("SHA-512", spriwa.cfr_renamed_279(128));
        cfr_renamed_86.put(sprbyfa.cfr_renamed_9("\u0006$5( "), spriwa.cfr_renamed_279(64));
        cfr_renamed_86.put(sprgvda.cfr_renamed_9("C\u000e}\u0014x\u0016{\tx"), spriwa.cfr_renamed_279(64));
    }

    public sprced(sprlc arg0) {
        sprlc sprlc2 = arg0;
        this(sprlc2, sprced.cfr_renamed_3476(sprlc2));
    }

    private /* synthetic */ sprced(sprlc arg0, int arg1) {
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_152 = this.cfr_renamed_3.cfr_renamed_1218();
        this.cfr_renamed_4 = arg1;
        this.cfr_renamed_112 = new byte[this.cfr_renamed_4];
        this.cfr_renamed_2 = new byte[this.cfr_renamed_4 + this.cfr_renamed_152];
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_1315()).append(sprbyfa.cfr_renamed_9("}\u0005\u001f\f\u0011")).toString();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_1197(arg0, arg1, arg2);
    }

    public sprlc cfr_renamed_3069() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_41() {
        sprced sprced2 = this;
        sprced2.cfr_renamed_3.cfr_renamed_41();
        sprced2.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
    }
}

