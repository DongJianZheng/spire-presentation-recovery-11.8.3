/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprugm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprzim
extends sprqqe {
    private sprqhm cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private String cfr_renamed_1;
    private sprugm cfr_renamed_2;
    private sprqhm cfr_renamed_3;
    private sprjfn cfr_renamed_4;

    public sprjfn cfr_renamed_4478() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprzim(sprugm sprugm2, BigInteger bigInteger, sprjfn sprjfn2, sprqhm sprqhm2, String string, sprqhm sprqhm3) {
        void arg5;
        void arg1;
        void arg4;
        void arg2;
        void arg0;
        sprzim sprzim2 = this;
        sprzim sprzim3 = this;
        sprzim sprzim4 = this;
        sprzim4.cfr_renamed_2 = arg0;
        sprzim4.cfr_renamed_4 = arg2;
        sprzim3.cfr_renamed_1 = arg4;
        sprzim3.cfr_renamed_0 = arg1;
        sprzim2.cfr_renamed_91 = arg5;
        sprzim2.cfr_renamed_3 = sprqhm2;
    }

    public sprqhm cfr_renamed_4479() {
        return this.cfr_renamed_91;
    }

    public sprqhm cfr_renamed_4483() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprzim(sprszm sprszm2) {
        sprnvm sprnvm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjvm.cfr_renamed_9("$C\u0002\u0002\u0015G\u0017W\u0003L\u0005GFQ\u000fX\u0003\u0018F")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        this.cfr_renamed_2 = sprugm.cfr_renamed_23(enumeration.nextElement());
        block7: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_0 = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_97();
                    continue block7;
                }
                case 1: {
                    this.cfr_renamed_4 = sprjfn.cfr_renamed_5085(sprnvm2, false);
                    continue block7;
                }
                case 2: {
                    this.cfr_renamed_3 = sprqhm.cfr_renamed_5085(sprnvm2, true);
                    continue block7;
                }
                case 3: {
                    this.cfr_renamed_1 = sprpfn.cfr_renamed_5085(sprnvm2, false).cfr_renamed_314();
                    continue block7;
                }
                case 4: {
                    this.cfr_renamed_91 = sprqhm.cfr_renamed_5085(sprnvm2, true);
                    continue block7;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdcz.cfr_renamed_9("i\u0010OQ_\u0010LQE\u0004F\u0013N\u0003\u0011Q")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public sprugm cfr_renamed_4481() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_4480() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprzim sprzim2 = this;
        sprrvm2.cfr_renamed_5004(sprzim2.cfr_renamed_2);
        if (sprzim2.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprktm(this.cfr_renamed_0)));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)new sprldn(this.cfr_renamed_1, true)));
        }
        if (this.cfr_renamed_91 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 4, (sprco)this.cfr_renamed_91));
        }
        return new sprcen(sprrvm2);
    }

    public String cfr_renamed_4482() {
        return this.cfr_renamed_1;
    }

    public static sprzim cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprzim) {
            return (sprzim)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprzim((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprjvm.cfr_renamed_9("\u000fN\nG\u0001C\n\u0002\t@\fG\u0005VFK\b\u0002\u0001G\u0012k\bQ\u0012C\bA\u0003\u0018F")).append(arg0.getClass().getName()).toString());
    }
}

