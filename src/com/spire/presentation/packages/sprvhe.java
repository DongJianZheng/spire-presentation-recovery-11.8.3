/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbly;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcce;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprvhe
extends sprvae {
    private static final int cfr_renamed_137 = 4;
    private static final int cfr_renamed_79 = 2;
    private static final int cfr_renamed_107 = 1;
    private BigInteger cfr_renamed_132;
    private int cfr_renamed_102;
    private BigInteger cfr_renamed_93;
    private static final int cfr_renamed_86 = 16;
    private static final int cfr_renamed_152 = 64;
    private sprtzd cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private static final int cfr_renamed_91 = 8;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private byte[] cfr_renamed_4;

    public sprlre cfr_renamed_4695(sprtzd arg0, boolean arg1) {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(arg0);
        if (!arg1) {
            sprlre sprlre3 = sprlre2;
            sprlre3.cfr_renamed_49(new sprcce(1, this.cfr_renamed_2558()));
            sprlre2.cfr_renamed_49(new sprcce(2, this.cfr_renamed_2559()));
            sprlre3.cfr_renamed_49(new sprcce(3, this.cfr_renamed_2560()));
            sprlre3.cfr_renamed_49(new sprhse(false, 4, new sprlqe(this.cfr_renamed_2561())));
            sprlre3.cfr_renamed_49(new sprcce(5, this.cfr_renamed_2562()));
        }
        sprlre2.cfr_renamed_49(new sprhse(false, 6, new sprlqe(this.cfr_renamed_2565())));
        if (!arg1) {
            sprlre2.cfr_renamed_49(new sprcce(7, this.cfr_renamed_2563()));
        }
        return sprlre2;
    }

    @Override
    public sprtzd cfr_renamed_2567() {
        return this.cfr_renamed_112;
    }

    private /* synthetic */ void cfr_renamed_4696(sprxue arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 0x20) == 0) {
            this.cfr_renamed_102 |= 0x20;
            this.cfr_renamed_119 = arg0.cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(spraqe.cfr_renamed_9("Y]kD`K)xfAg\\)q)IeZlImQ)[l\\"));
    }

    private /* synthetic */ void cfr_renamed_4697(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 0x10) == 0) {
            this.cfr_renamed_102 |= 0x10;
            this.cfr_renamed_132 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprbly.cfr_renamed_9("\u001b&01&t;2t65'1t$;=: t\u0006t58&150-t'1 "));
    }

    public BigInteger cfr_renamed_2559() {
        if ((this.cfr_renamed_102 & 2) != 0) {
            return this.cfr_renamed_93;
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprvhe sprvhe2 = this;
        return new sprpse(sprvhe2.cfr_renamed_4695(sprvhe2.cfr_renamed_112, false));
    }

    public BigInteger cfr_renamed_2560() {
        if ((this.cfr_renamed_102 & 4) != 0) {
            return this.cfr_renamed_2;
        }
        return null;
    }

    public byte[] cfr_renamed_2561() {
        if ((this.cfr_renamed_102 & 8) != 0) {
            return this.cfr_renamed_4;
        }
        return null;
    }

    public BigInteger cfr_renamed_2563() {
        if ((this.cfr_renamed_102 & 0x40) != 0) {
            return this.cfr_renamed_1;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhe(sprtzd sprtzd2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] byArray, BigInteger bigInteger4, byte[] byArray2, int n) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvhe sprvhe2 = this;
        sprvhe sprvhe3 = this;
        this.cfr_renamed_112 = arg0;
        this.cfr_renamed_4698((BigInteger)arg1);
        sprvhe3.cfr_renamed_4699((BigInteger)arg2);
        sprvhe3.cfr_renamed_4700((BigInteger)arg3);
        sprvhe sprvhe4 = this;
        sprvhe3.cfr_renamed_4701(new sprlqe((byte[])arg4));
        sprvhe2.cfr_renamed_4697((BigInteger)arg5);
        sprvhe2.cfr_renamed_4696(new sprlqe((byte[])arg6));
        sprvhe2.cfr_renamed_4702(BigInteger.valueOf(n));
    }

    private /* synthetic */ void cfr_renamed_4700(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 4) == 0) {
            this.cfr_renamed_102 |= 4;
            this.cfr_renamed_2 = arg0;
            return;
        }
        throw new IllegalArgumentException(spraqe.cfr_renamed_9("{lKfFm\bJGlN)j)IeZlImQ)[l\\"));
    }

    private /* synthetic */ void cfr_renamed_4701(sprxue arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 8) == 0) {
            this.cfr_renamed_102 |= 8;
            this.cfr_renamed_4 = arg0.cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(sprbly.cfr_renamed_9("\u00165'1t\u0004;=: t\u0013t58&150-t'1 "));
    }

    public byte[] cfr_renamed_2565() {
        if ((this.cfr_renamed_102 & 0x20) != 0) {
            return this.cfr_renamed_119;
        }
        return null;
    }

    public BigInteger cfr_renamed_2558() {
        if ((this.cfr_renamed_102 & 1) != 0) {
            return this.cfr_renamed_0;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhe(sprtzd sprtzd2, byte[] byArray) throws IllegalArgumentException {
        void arg1;
        sprvhe sprvhe2 = this;
        sprvhe2.cfr_renamed_112 = sprtzd2;
        sprvhe sprvhe3 = this;
        sprvhe2.cfr_renamed_4696(new sprlqe((byte[])arg1));
    }

    private /* synthetic */ void cfr_renamed_4698(BigInteger arg0) {
        if ((this.cfr_renamed_102 & 1) == 0) {
            this.cfr_renamed_102 |= 1;
            this.cfr_renamed_0 = arg0;
            return;
        }
        throw new IllegalArgumentException(spraqe.cfr_renamed_9("x{AdM)efL|D|[)x)IeZlImQ)[l\\"));
    }

    private /* synthetic */ void cfr_renamed_4699(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 2) == 0) {
            this.cfr_renamed_102 |= 2;
            this.cfr_renamed_93 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprbly.cfr_renamed_9("\u0012=&' t\u0017;12t\u0015t58&150-t'1 "));
    }

    private /* synthetic */ void cfr_renamed_4702(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_102 & 0x40) == 0) {
            this.cfr_renamed_102 |= 0x40;
            this.cfr_renamed_1 = arg0;
            return;
        }
        throw new IllegalArgumentException(spraqe.cfr_renamed_9("JGoIj\\fZ)n)IeZlImQ)[l\\"));
    }

    public boolean cfr_renamed_2557() {
        return this.cfr_renamed_0 != null;
    }

    public BigInteger cfr_renamed_2562() {
        if ((this.cfr_renamed_102 & 0x10) != 0) {
            return this.cfr_renamed_132;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprvhe(sprbne sprbne2) throws IllegalArgumentException {
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        this.cfr_renamed_112 = sprtzd.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_102 = 0;
        block9: while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (!(e instanceof spryte)) {
                throw new IllegalArgumentException(spraqe.cfr_renamed_9("\\FbFf_g\bFJcMj\\)amMg\\`N`M{\t"));
            }
            spryte spryte2 = (spryte)e;
            switch (spryte2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4698(sprcce.cfr_renamed_23(spryte2).cfr_renamed_97());
                    continue block9;
                }
                case 2: {
                    this.cfr_renamed_4699(sprcce.cfr_renamed_23(spryte2).cfr_renamed_97());
                    continue block9;
                }
                case 3: {
                    this.cfr_renamed_4700(sprcce.cfr_renamed_23(spryte2).cfr_renamed_97());
                    continue block9;
                }
                case 4: {
                    this.cfr_renamed_4701(sprxue.cfr_renamed_341(spryte2, false));
                    continue block9;
                }
                case 5: {
                    this.cfr_renamed_4697(sprcce.cfr_renamed_23(spryte2).cfr_renamed_97());
                    continue block9;
                }
                case 6: {
                    this.cfr_renamed_4696(sprxue.cfr_renamed_341(spryte2, false));
                    continue block9;
                }
                case 7: {
                    this.cfr_renamed_4702(sprcce.cfr_renamed_23(spryte2).cfr_renamed_97());
                    continue block9;
                }
            }
            this.cfr_renamed_102 = 0;
            throw new IllegalArgumentException(sprbly.cfr_renamed_9("\u0001:?:;#:t\u001b6>17 t\u001d01: =2=1&u"));
        }
        if (this.cfr_renamed_102 != 32 && this.cfr_renamed_102 != 127) {
            throw new IllegalArgumentException(sprbly.cfr_renamed_9("\u001588t;$ =;:'t9!' t61t1= <1&t$&1'1: t;&t56'1: u"));
        }
    }
}

