/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhaj;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvmp;
import java.util.Hashtable;

public class sprfwk
implements spraq {
    private static final byte cfr_renamed_86 = 92;
    private int cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private static final byte cfr_renamed_119 = 54;
    private sprgf cfr_renamed_91;
    private sprhx cfr_renamed_0;
    private static Hashtable cfr_renamed_1 = new Hashtable();
    private int cfr_renamed_2;
    private sprhx cfr_renamed_3;
    private byte[] cfr_renamed_4;

    static {
        cfr_renamed_1.put(sprvmp.cfr_renamed_9("\u0001\u0013\u0015\buhwm"), spruaf.cfr_renamed_279(32));
        cfr_renamed_1.put(sprhaj.cfr_renamed_9("$5["), spruaf.cfr_renamed_279(16));
        cfr_renamed_1.put(sprvmp.cfr_renamed_9("\u0011\u0002h"), spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("MD5", spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put(sprhaj.cfr_renamed_9(";894$5XCQ"), spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("RIPEMD160", spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("SHA-1", spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("SHA-224", spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("SHA-256", spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put("SHA-384", spruaf.cfr_renamed_279(128));
        cfr_renamed_1.put("SHA-512", spruaf.cfr_renamed_279(128));
        cfr_renamed_1.put(sprvmp.cfr_renamed_9("\b/;#."), spruaf.cfr_renamed_279(64));
        cfr_renamed_1.put(sprhaj.cfr_renamed_9(">\u0019\u0000\u0003\u0005\u0001\u0006\u001e\u0005"), spruaf.cfr_renamed_279(64));
    }

    private static /* synthetic */ int cfr_renamed_10115(sprgf arg0) {
        if (arg0 instanceof sprpl) {
            return ((sprpl)arg0).cfr_renamed_3248();
        }
        Integer n = (Integer)cfr_renamed_1.get(arg0.cfr_renamed_1315());
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvmp.cfr_renamed_9(")(7(312f8/;#/2|6=5/#8||")).append(arg0.cfr_renamed_1315()).toString());
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

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_91.cfr_renamed_1315()).append(sprhaj.cfr_renamed_9("F9$0*")).toString();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_91.cfr_renamed_1221(arg0);
    }

    public sprgf cfr_renamed_3069() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        void arg1;
        void arg0;
        sprfwk sprfwk2;
        sprfwk sprfwk3 = this;
        sprfwk sprfwk4 = this;
        sprfwk3.cfr_renamed_91.cfr_renamed_1219(sprfwk3.cfr_renamed_4, sprfwk4.cfr_renamed_2);
        if (sprfwk4.cfr_renamed_3 != null) {
            ((sprhx)((Object)this.cfr_renamed_91)).cfr_renamed_5183(this.cfr_renamed_3);
            sprfwk sprfwk5 = this;
            sprfwk sprfwk6 = this;
            sprfwk2 = sprfwk6;
            sprfwk5.cfr_renamed_91.cfr_renamed_1197(sprfwk5.cfr_renamed_4, sprfwk6.cfr_renamed_2, this.cfr_renamed_91.cfr_renamed_1218());
        } else {
            sprfwk sprfwk7 = this;
            sprfwk7.cfr_renamed_91.cfr_renamed_1197(sprfwk7.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprfwk2 = this;
        }
        int n3 = sprfwk2.cfr_renamed_91.cfr_renamed_1219((byte[])arg0, (int)arg1);
        int n4 = n2 = this.cfr_renamed_2;
        while (n4 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n2++] = 0;
            n4 = n2;
        }
        sprfwk sprfwk8 = this;
        if (this.cfr_renamed_0 != null) {
            ((sprhx)((Object)sprfwk8.cfr_renamed_91)).cfr_renamed_5183(this.cfr_renamed_0);
            return n3;
        }
        sprfwk8.cfr_renamed_91.cfr_renamed_1197(this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        return n3;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_91.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_0 != null) {
            ((sprhx)((Object)this.cfr_renamed_91)).cfr_renamed_5183(this.cfr_renamed_0);
            return;
        }
        sprfwk sprfwk2 = this;
        sprfwk2.cfr_renamed_91.cfr_renamed_41();
        sprfwk2.cfr_renamed_91.cfr_renamed_1197(this.cfr_renamed_112, 0, this.cfr_renamed_112.length);
    }

    @Override
    public void cfr_renamed_5692(sprbj sprbj2) {
        int n;
        int n2;
        this.cfr_renamed_91.cfr_renamed_41();
        byte[] byArray = ((sprtpk)sprbj2).cfr_renamed_1521();
        int n3 = byArray.length;
        if (n3 > this.cfr_renamed_2) {
            sprfwk sprfwk2 = this;
            sprfwk2.cfr_renamed_91.cfr_renamed_1197(byArray, 0, n3);
            sprfwk2.cfr_renamed_91.cfr_renamed_1219(this.cfr_renamed_112, 0);
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
        sprfwk sprfwk3 = this;
        System.arraycopy(sprfwk3.cfr_renamed_112, 0, this.cfr_renamed_4, 0, this.cfr_renamed_2);
        sprfwk sprfwk4 = this;
        sprfwk.cfr_renamed_3475(sprfwk3.cfr_renamed_112, sprfwk4.cfr_renamed_2, (byte)54);
        sprfwk.cfr_renamed_3475(sprfwk4.cfr_renamed_4, this.cfr_renamed_2, (byte)92);
        if (sprfwk3.cfr_renamed_91 instanceof sprhx) {
            this.cfr_renamed_3 = ((sprhx)((Object)this.cfr_renamed_91)).cfr_renamed_461();
            ((sprgf)((Object)this.cfr_renamed_3)).cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_2);
        }
        sprfwk sprfwk5 = this;
        sprfwk5.cfr_renamed_91.cfr_renamed_1197(sprfwk5.cfr_renamed_112, 0, this.cfr_renamed_112.length);
        if (this.cfr_renamed_91 instanceof sprhx) {
            this.cfr_renamed_0 = ((sprhx)((Object)this.cfr_renamed_91)).cfr_renamed_461();
        }
    }

    public sprfwk(sprgf arg0) {
        sprgf sprgf2 = arg0;
        this(sprgf2, sprfwk.cfr_renamed_10115(sprgf2));
    }

    private /* synthetic */ sprfwk(sprgf arg0, int arg1) {
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_152 = this.cfr_renamed_91.cfr_renamed_1218();
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_112 = new byte[this.cfr_renamed_2];
        this.cfr_renamed_4 = new byte[this.cfr_renamed_2 + this.cfr_renamed_152];
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_152;
    }
}

