/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzja;
import com.spire.presentation.packages.sproze;
import java.math.BigInteger;

public class sprqxk
implements sprck {
    private final BigInteger cfr_renamed_86;
    private final sprgxh cfr_renamed_152;
    private BigInteger cfr_renamed_112 = null;
    private final BigInteger cfr_renamed_119;
    private final byte[] cfr_renamed_3;
    private final spreuh cfr_renamed_4;

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public spreuh cfr_renamed_9984(spreuh arg0) {
        return sprqxk.cfr_renamed_9986(this.cfr_renamed_1769(), arg0);
    }

    public sprqxk(sprgxh arg0, spreuh arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    public sprqxk(sprhfm arg0) {
        this(arg0.cfr_renamed_1769(), arg0.cfr_renamed_1145(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1153(), arg0.cfr_renamed_2113());
    }

    public static spreuh cfr_renamed_9986(sprgxh arg0, spreuh arg1) {
        if (null == arg1) {
            throw new NullPointerException(sprnzja.cfr_renamed_9("FV\u007fWb\u0019uXxWyM6[s\u0019xLzU"));
        }
        if ((arg1 = sprmvh.cfr_renamed_8952(arg0, arg1).cfr_renamed_1775()).cfr_renamed_1952()) {
            throw new IllegalArgumentException(sprlny.cfr_renamed_9("?/\u0006.\u001b`\u000e4O)\u0001&\u0006.\u00064\u0016"));
        }
        if (!arg1.cfr_renamed_1974()) {
            throw new IllegalArgumentException(sprnzja.cfr_renamed_9("FV\u007fWb\u0019xVb\u0019yW6ZcK`\\"));
        }
        return arg1;
    }

    public BigInteger cfr_renamed_9985(BigInteger arg0) {
        if (null == arg0) {
            throw new NullPointerException(sprlny.cfr_renamed_9("<#\u000e,\u000e2O#\u000e.\u0001/\u001b`\r%O.\u001a,\u0003"));
        }
        if (arg0.compareTo(sprck.cfr_renamed_4) < 0 || arg0.compareTo(this.cfr_renamed_1146()) >= 0) {
            throw new IllegalArgumentException(sprnzja.cfr_renamed_9("EZwUwK6Pe\u0019xVb\u0019\u007fW6M~\\6PxMsK`Xz\u0019M\b:\u0019x\u0019;\u0019'd"));
        }
        return arg0;
    }

    public spreuh cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqxk(sprgxh sprgxh2, spreuh spreuh2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg4;
        void arg3;
        void arg1;
        void arg0;
        void arg2;
        if (sprgxh2 == null) {
            throw new NullPointerException("curve");
        }
        if (arg2 == null) {
            throw new NullPointerException("n");
        }
        sprqxk sprqxk2 = this;
        sprqxk sprqxk3 = this;
        sprqxk3.cfr_renamed_152 = arg0;
        sprqxk3.cfr_renamed_4 = sprqxk.cfr_renamed_9986((sprgxh)arg0, (spreuh)arg1);
        sprqxk2.cfr_renamed_86 = arg2;
        sprqxk2.cfr_renamed_119 = arg3;
        this.cfr_renamed_3 = sproze.cfr_renamed_158((byte[])arg4);
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_119;
    }

    public sprqxk(sprgxh arg0, spreuh arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, (BigInteger)((Object)cfr_renamed_4), null);
    }

    public synchronized BigInteger cfr_renamed_9987() {
        if (this.cfr_renamed_112 == null) {
            this.cfr_renamed_112 = sprhdf.cfr_renamed_5232(this.cfr_renamed_86, this.cfr_renamed_119);
        }
        return this.cfr_renamed_112;
    }

    public sprgxh cfr_renamed_1769() {
        return this.cfr_renamed_152;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (!(arg0 instanceof sprqxk)) {
            return false;
        }
        sprqxk sprqxk2 = (sprqxk)arg0;
        return this.cfr_renamed_152.cfr_renamed_8896(sprqxk2.cfr_renamed_152) && this.cfr_renamed_4.cfr_renamed_8927(sprqxk2.cfr_renamed_4) && this.cfr_renamed_86.equals(sprqxk2.cfr_renamed_86);
    }

    public int hashCode() {
        int n = 4;
        n = 4 * 257;
        n ^= this.cfr_renamed_152.hashCode();
        n *= 257;
        n ^= this.cfr_renamed_4.hashCode();
        n *= 257;
        return n ^= this.cfr_renamed_86.hashCode();
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_86;
    }
}

