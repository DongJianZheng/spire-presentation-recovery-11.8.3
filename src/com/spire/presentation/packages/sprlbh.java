/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprgyg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprrtg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvah;
import com.spire.presentation.packages.sprvd;
import com.spire.presentation.packages.sprvl;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprxmaa;
import com.spire.presentation.packages.spryql;
import java.security.Provider;
import java.security.SecureRandom;

public class sprlbh
implements sprvd {
    private final int cfr_renamed_112;
    private boolean cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprcyg cfr_renamed_1;
    private int cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprvah cfr_renamed_4;

    @Override
    public int cfr_renamed_7855() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprlbh cfr_renamed_7904() {
        this.cfr_renamed_0 = false;
        return this;
    }

    @Override
    public int cfr_renamed_593() {
        return this.cfr_renamed_112;
    }

    public static /* synthetic */ int cfr_renamed_7941(sprlbh arg0) {
        return arg0.cfr_renamed_91;
    }

    @Override
    public boolean cfr_renamed_7862() {
        return this.cfr_renamed_0;
    }

    public static /* synthetic */ int cfr_renamed_7942(sprlbh arg0) {
        return arg0.cfr_renamed_112;
    }

    @Override
    public sprvl cfr_renamed_2588(byte[] arg0) throws sprtqg {
        if (this.cfr_renamed_2 > 0) {
            return new sprrtg(this, arg0);
        }
        return new sprgyg(this, arg0);
    }

    @Override
    public sprlbh cfr_renamed_7905(int arg0, int arg1) {
        if (this.cfr_renamed_112 != 7 && this.cfr_renamed_112 != 8 && this.cfr_renamed_112 != 9) {
            throw new IllegalStateException(spryql.cfr_renamed_9("c5c4\u0002\u0011N\u0017M\u0002K\u0004J\u001dQPA\u0011LPM\u001eN\t\u0002\u0012GPW\u0003G\u0014\u0002\u0007K\u0004JPc5q"));
        }
        if (arg1 < 6) {
            throw new IllegalArgumentException(sprxmaa.cfr_renamed_9("\u001d_\u001e_\u001dC\u001d\u0016\u0013^\u0005X\u001be\u0019L\u0015\u0016\u0019EP\u0000"));
        }
        sprlbh sprlbh2 = this;
        sprlbh2.cfr_renamed_2 = arg0;
        sprlbh2.cfr_renamed_91 = arg1 - 6;
        return this;
    }

    @Override
    public int cfr_renamed_7864() {
        return this.cfr_renamed_91;
    }

    public static /* synthetic */ sprvah cfr_renamed_7943(sprlbh arg0) {
        return arg0.cfr_renamed_4;
    }

    @Override
    public SecureRandom cfr_renamed_2794() {
        if (this.cfr_renamed_3 == null) {
            sprlbh sprlbh2 = this;
            sprlbh2.cfr_renamed_3 = new SecureRandom();
        }
        return this.cfr_renamed_3;
    }

    public static /* synthetic */ int cfr_renamed_7944(sprlbh arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprlbh cfr_renamed_1498(Provider arg0) {
        sprlbh sprlbh2 = this;
        this.cfr_renamed_1 = new sprcyg(new sprkhi(arg0));
        sprlbh2.cfr_renamed_4 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    public static /* synthetic */ boolean cfr_renamed_7945(sprlbh arg0) {
        return arg0.cfr_renamed_119;
    }

    public sprlbh cfr_renamed_1499(String arg0) {
        sprlbh sprlbh2 = this;
        this.cfr_renamed_1 = new sprcyg(new sprxil(arg0));
        sprlbh2.cfr_renamed_4 = new sprvah(this.cfr_renamed_1);
        return this;
    }

    @Override
    public sprlbh cfr_renamed_7906(boolean arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprlbh(int arg0) {
        sprlbh sprlbh2 = this;
        sprlbh sprlbh3 = this;
        sprlbh sprlbh4 = this;
        sprlbh3.cfr_renamed_1 = new sprcyg(new sprrul());
        sprlbh3.cfr_renamed_4 = new sprvah(this.cfr_renamed_1);
        sprlbh3.cfr_renamed_119 = true;
        sprlbh2.cfr_renamed_2 = -1;
        sprlbh2.cfr_renamed_0 = true;
        this.cfr_renamed_112 = arg0;
        if (this.cfr_renamed_112 == 0) {
            throw new IllegalArgumentException(spryql.cfr_renamed_9("L\u0005N\u001c\u0002\u0013K\u0000J\u0015PPQ\u0000G\u0013K\u0016K\u0015F"));
        }
    }

    @Override
    public sprlbh cfr_renamed_7907() {
        this.cfr_renamed_0 = true;
        return this;
    }

    public sprlbh cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public static /* synthetic */ sprcyg cfr_renamed_7946(sprlbh arg0) {
        return arg0.cfr_renamed_1;
    }
}

