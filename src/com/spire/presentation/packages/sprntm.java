/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbho;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgom;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzyfa;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprntm
extends sprfnm {
    private BigInteger cfr_renamed_137;
    private static final int cfr_renamed_79 = 1;
    private int cfr_renamed_107;
    private static final int cfr_renamed_132 = 4;
    private static final int cfr_renamed_102 = 16;
    private BigInteger cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private sprlem cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private static final int cfr_renamed_119 = 64;
    private BigInteger cfr_renamed_91;
    private static final int cfr_renamed_0 = 8;
    private static final int cfr_renamed_1 = 2;
    private byte[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 32;
    private BigInteger cfr_renamed_4;

    public BigInteger cfr_renamed_2563() {
        if ((this.cfr_renamed_107 & 0x40) != 0) {
            return this.cfr_renamed_93;
        }
        return null;
    }

    public BigInteger cfr_renamed_2559() {
        if ((this.cfr_renamed_107 & 2) != 0) {
            return this.cfr_renamed_91;
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4698(BigInteger arg0) {
        if ((this.cfr_renamed_107 & 1) == 0) {
            this.cfr_renamed_107 |= 1;
            this.cfr_renamed_137 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("\u000f\u00196\u0006:K\u0012\u0004;\u001e3\u001e,K\u000fK>\u0007-\u000e>\u000f&K,\u000e+"));
    }

    public BigInteger cfr_renamed_2560() {
        if ((this.cfr_renamed_107 & 4) != 0) {
            return this.cfr_renamed_112;
        }
        return null;
    }

    public BigInteger cfr_renamed_2562() {
        if ((this.cfr_renamed_107 & 0x10) != 0) {
            return this.cfr_renamed_4;
        }
        return null;
    }

    public byte[] cfr_renamed_2561() {
        if ((this.cfr_renamed_107 & 8) != 0) {
            return sproze.cfr_renamed_158(this.cfr_renamed_2);
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_11232(sproug arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 0x20) == 0) {
            this.cfr_renamed_107 |= 0x20;
            this.cfr_renamed_86 = arg0.cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(sprbho.cfr_renamed_9("\u0013J!S*\\co,V-Kcfc^/M&^'FcL&K"));
    }

    private /* synthetic */ void cfr_renamed_4702(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 0x40) == 0) {
            this.cfr_renamed_107 |= 0x40;
            this.cfr_renamed_93 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("(0\r>\b+\u0004-K\u0019K>\u0007-\u000e>\u000f&K,\u000e+"));
    }

    /*
     * WARNING - void declaration
     */
    public sprntm(sprlem sprlem2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte[] byArray, BigInteger bigInteger4, byte[] byArray2, int n) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprntm sprntm2 = this;
        sprntm sprntm3 = this;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_4698((BigInteger)arg1);
        sprntm3.cfr_renamed_4699((BigInteger)arg2);
        sprntm3.cfr_renamed_4700((BigInteger)arg3);
        sprntm sprntm4 = this;
        sprntm3.cfr_renamed_11233(new sprfvg((byte[])arg4));
        sprntm2.cfr_renamed_4697((BigInteger)arg5);
        sprntm2.cfr_renamed_11232(new sprfvg((byte[])arg6));
        sprntm2.cfr_renamed_4702(BigInteger.valueOf(n));
    }

    public sprrvm cfr_renamed_11234(sprlem arg0, boolean arg1) {
        sprrvm sprrvm2 = new sprrvm(8);
        sprrvm2.cfr_renamed_5004(arg0);
        if (!arg1) {
            sprrvm sprrvm3 = sprrvm2;
            sprrvm3.cfr_renamed_5004(new sprgom(1, this.cfr_renamed_2558()));
            sprrvm2.cfr_renamed_5004(new sprgom(2, this.cfr_renamed_2559()));
            sprrvm3.cfr_renamed_5004(new sprgom(3, this.cfr_renamed_2560()));
            sprrvm3.cfr_renamed_5004(new sprycn(false, 4, (sprco)new sprfvg(this.cfr_renamed_2561())));
            sprrvm3.cfr_renamed_5004(new sprgom(5, this.cfr_renamed_2562()));
        }
        sprrvm2.cfr_renamed_5004(new sprycn(false, 6, (sprco)new sprfvg(this.cfr_renamed_2565())));
        if (!arg1) {
            sprrvm2.cfr_renamed_5004(new sprgom(7, this.cfr_renamed_2563()));
        }
        return sprrvm2;
    }

    public boolean cfr_renamed_2557() {
        return this.cfr_renamed_137 != null;
    }

    private /* synthetic */ void cfr_renamed_4697(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 0x10) == 0) {
            this.cfr_renamed_107 |= 0x10;
            this.cfr_renamed_4 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprbho.cfr_renamed_9("p1[&McP%\u001f!^0ZcO,V-Kcmc^/M&^'FcL&K"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprntm(sprszm sprszm2) throws IllegalArgumentException {
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        this.cfr_renamed_152 = sprlem.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_107 = 0;
        block9: while (enumeration.hasMoreElements()) {
            Object e = enumeration.nextElement();
            if (!(e instanceof sprnvm)) {
                throw new IllegalArgumentException(sprbho.cfr_renamed_9("\u0016Q(Q,H-\u001f\f])Z Kcv'Z-K*Y*Z1\u001e"));
            }
            sprnvm sprnvm2 = (sprnvm)e;
            switch (sprnvm2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4698(sprgom.cfr_renamed_23(sprnvm2).cfr_renamed_97());
                    continue block9;
                }
                case 2: {
                    this.cfr_renamed_4699(sprgom.cfr_renamed_23(sprnvm2).cfr_renamed_97());
                    continue block9;
                }
                case 3: {
                    this.cfr_renamed_4700(sprgom.cfr_renamed_23(sprnvm2).cfr_renamed_97());
                    continue block9;
                }
                case 4: {
                    this.cfr_renamed_11233(sproug.cfr_renamed_5085(sprnvm2, false));
                    continue block9;
                }
                case 5: {
                    this.cfr_renamed_4697(sprgom.cfr_renamed_23(sprnvm2).cfr_renamed_97());
                    continue block9;
                }
                case 6: {
                    this.cfr_renamed_11232(sproug.cfr_renamed_5085(sprnvm2, false));
                    continue block9;
                }
                case 7: {
                    this.cfr_renamed_4702(sprgom.cfr_renamed_23(sprnvm2).cfr_renamed_97());
                    continue block9;
                }
            }
            this.cfr_renamed_107 = 0;
            throw new IllegalArgumentException(sprzyfa.cfr_renamed_9(">1\u00001\u0004(\u0005\u007f$=\u0001:\b+K\u0016\u000f:\u0005+\u00029\u0002:\u0019~"));
        }
        if (this.cfr_renamed_107 != 32 && this.cfr_renamed_107 != 127) {
            throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("\u001e\u00073K0\u001b+\u00020\u0005,K2\u001e,\u001f\u007f\t:K:\u0002+\u0003:\u0019\u007f\u001b-\u000e,\u000e1\u001f\u007f\u0004-K>\t,\u000e1\u001f~"));
        }
    }

    private /* synthetic */ void cfr_renamed_11233(sproug arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 8) == 0) {
            this.cfr_renamed_107 |= 8;
            this.cfr_renamed_2 = arg0.cfr_renamed_186();
            return;
        }
        throw new IllegalArgumentException(sprbho.cfr_renamed_9("\u0001^0Zco,V-Kcxc^/M&^'FcL&K"));
    }

    public BigInteger cfr_renamed_2558() {
        if ((this.cfr_renamed_107 & 1) != 0) {
            return this.cfr_renamed_137;
        }
        return null;
    }

    @Override
    public sprlem cfr_renamed_2567() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    public sprntm(sprlem sprlem2, byte[] byArray) throws IllegalArgumentException {
        void arg1;
        sprntm sprntm2 = this;
        sprntm2.cfr_renamed_152 = sprlem2;
        sprntm sprntm3 = this;
        sprntm2.cfr_renamed_11232(new sprfvg((byte[])arg1));
    }

    private /* synthetic */ void cfr_renamed_4700(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 4) == 0) {
            this.cfr_renamed_107 |= 4;
            this.cfr_renamed_112 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprzyfa.cfr_renamed_9("\f\u000e<\u00041\u000f\u007f(0\u000e9K\u001dK>\u0007-\u000e>\u000f&K,\u000e+"));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprntm sprntm2 = this;
        return new sprcen(sprntm2.cfr_renamed_11234(this.cfr_renamed_152, !sprntm2.cfr_renamed_2557()));
    }

    public byte[] cfr_renamed_2565() {
        if ((this.cfr_renamed_107 & 0x20) != 0) {
            return sproze.cfr_renamed_158(this.cfr_renamed_86);
        }
        return null;
    }

    private /* synthetic */ void cfr_renamed_4699(BigInteger arg0) throws IllegalArgumentException {
        if ((this.cfr_renamed_107 & 2) == 0) {
            this.cfr_renamed_107 |= 2;
            this.cfr_renamed_91 = arg0;
            return;
        }
        throw new IllegalArgumentException(sprbho.cfr_renamed_9("\u0005V1L7\u001f\u0000P&Yc~c^/M&^'FcL&K"));
    }
}

