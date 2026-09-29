/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprgom;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrbfa;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprkqm
extends sprfnm {
    private int cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private static int cfr_renamed_1 = 1;
    private static int cfr_renamed_2 = 2;
    private sprlem cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_11230(sprgom arg0) {
        if ((this.cfr_renamed_91 & cfr_renamed_1) == 0) {
            this.cfr_renamed_91 |= cfr_renamed_1;
            this.cfr_renamed_4 = arg0.cfr_renamed_97();
            return;
        }
        throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("?Z\u0016@\u001e@\u0001\u0015\u0013Y\u0000P\u0013Q\u000b\u0015\u0001P\u0006"));
    }

    /*
     * WARNING - void declaration
     */
    public sprkqm(sprlem sprlem2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        sprkqm sprkqm2 = this;
        sprkqm sprkqm3 = this;
        sprkqm3.cfr_renamed_91 = 0;
        sprkqm3.cfr_renamed_3 = arg0;
        sprkqm2.cfr_renamed_4 = arg1;
        sprkqm2.cfr_renamed_0 = bigInteger2;
    }

    @Override
    public sprlem cfr_renamed_2567() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_11231(sprgom arg0) {
        if ((this.cfr_renamed_91 & cfr_renamed_2) == 0) {
            this.cfr_renamed_91 |= cfr_renamed_2;
            this.cfr_renamed_0 = arg0.cfr_renamed_97();
            return;
        }
        throw new IllegalArgumentException(sprfvca.cfr_renamed_9("\u0017U\"B<H<YrL>_7L6Tr^7Y"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprkqm(sprszm sprszm2) {
        sprkqm sprkqm2 = this;
        sprkqm2.cfr_renamed_91 = 0;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        sprkqm2.cfr_renamed_3 = sprlem.cfr_renamed_23(enumeration.nextElement());
        block4: while (enumeration.hasMoreElements()) {
            sprgom sprgom2 = sprgom.cfr_renamed_23(enumeration.nextElement());
            switch (sprgom2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_11230(sprgom2);
                    continue block4;
                }
                case 2: {
                    this.cfr_renamed_11231(sprgom2);
                    continue block4;
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrbfa.cfr_renamed_9("'[\u0019[\u001dB\u001c\u00156P\u0000a\u0013R\u0015P\u0016z\u0010_\u0017V\u0006\u0015H")).append(sprgom2.cfr_renamed_312()).append(sprfvca.cfr_renamed_9("\u007f\u0013rC=YrL<\r\u001b^=\u001aj\u001cd\u007f\u0001l\u0002X0A;N\u0019H+~&_'N&X H")).toString());
        }
        if (this.cfr_renamed_91 != 3) {
            throw new IllegalArgumentException(sprrbfa.cfr_renamed_9("\u001f\\\u0001F\u001b[\u0015\u0015\u0013G\u0015@\u001fP\u001cAR\u0018L\u0015\u001cZ\u0006\u0015\u0013[R|\u0001ZE\rC\u0003 f3e\u0007W\u001e\\\u0011~\u0017L!A\u0000@\u0011A\u0007G\u0017"));
        }
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprgom(1, this.cfr_renamed_2295()));
        sprrvm2.cfr_renamed_5004(new sprgom(2, this.cfr_renamed_2296()));
        return new sprcen(sprrvm2);
    }
}

