/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprxzg
extends sprqqe {
    private static final BigInteger cfr_renamed_1;
    private final BigInteger cfr_renamed_2;
    private static final BigInteger cfr_renamed_3;
    private static final BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxzg(BigInteger bigInteger) {
        void arg0;
        if (!bigInteger.equals(cfr_renamed_1)) {
            if (arg0.compareTo(cfr_renamed_3) < 0) {
                throw new IllegalStateException(sprfke.cfr_renamed_9("T\"T.N2\u001a/_,H._kS%NkY*T%U?\u001a)_kV.I8\u001a?R*Tk\u0017r\n{\n{\n{\n{"));
            }
            if (arg0.compareTo(cfr_renamed_4) > 0) {
                throw new IllegalStateException(sprtma.cfr_renamed_9("c3c?y#->h=\u007f?hzd4yzn;c4b.-8hzj(h;y?\u007fzy2l4-c=j=j=j=j"));
            }
        }
        this.cfr_renamed_2 = arg0;
    }

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprxzg(sprktm arg0) {
        this(arg0.cfr_renamed_97());
    }

    static {
        cfr_renamed_3 = new BigInteger(sprfke.cfr_renamed_9("\u0017r\n{\n{\n{\n{"));
        cfr_renamed_4 = new BigInteger(sprtma.cfr_renamed_9("c=j=j=j=j"));
        cfr_renamed_1 = new BigInteger(sprfke.cfr_renamed_9("r\n{\n{\n{\nz"));
    }

    public sprxzg(long arg0) {
        this(BigInteger.valueOf(arg0));
    }

    public static sprxzg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxzg) {
            return (sprxzg)arg0;
        }
        if (arg0 != null) {
            return new sprxzg(sprktm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return new sprktm(this.cfr_renamed_2);
    }
}

