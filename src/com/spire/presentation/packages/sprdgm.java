/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcxz;
import com.spire.presentation.packages.sprhdm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjaa;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprdgm
extends sprqqe {
    private final sprktm cfr_renamed_0;
    private final sprktm cfr_renamed_1;
    private final sprhdm cfr_renamed_2;
    private final sprktm cfr_renamed_3;
    private final sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdgm(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, sprhdm sprhdm2) {
        void arg4;
        sprdgm sprdgm2;
        void arg3;
        void arg0;
        void arg2;
        void arg1;
        if (bigInteger == null) {
            throw new IllegalArgumentException(sprxjaa.cfr_renamed_9("L?Lo\b.\u0005!\u0004;K-\u000eo\u0005:\u0007#"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprcxz.cfr_renamed_9("4q46pw}x|b3tv6}c\u007fz"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprxjaa.cfr_renamed_9("L>Lo\b.\u0005!\u0004;K-\u000eo\u0005:\u0007#"));
        }
        sprdgm sprdgm3 = this;
        sprdgm3.cfr_renamed_0 = new sprktm((BigInteger)arg0);
        sprdgm sprdgm4 = this;
        sprdgm4.cfr_renamed_1 = new sprktm((BigInteger)arg1);
        sprdgm3.cfr_renamed_3 = new sprktm((BigInteger)arg2);
        if (arg3 != null) {
            sprdgm2 = this;
            this.cfr_renamed_4 = new sprktm((BigInteger)arg3);
        } else {
            sprdgm2 = this;
            this.cfr_renamed_4 = null;
        }
        sprdgm2.cfr_renamed_2 = arg4;
    }

    public static sprdgm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprdgm) {
            return (sprdgm)arg0;
        }
        if (arg0 != null) {
            return new sprdgm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_0.cfr_renamed_162();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdgm(sprszm sprszm2) {
        sprco sprco2;
        Enumeration enumeration;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 3 || arg0.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcxz.cfr_renamed_9("Trr3evgfs}uv6`\u007fis)6")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        sprdgm sprdgm2 = this;
        sprdgm2.cfr_renamed_0 = sprktm.cfr_renamed_23(enumeration.nextElement());
        sprdgm2.cfr_renamed_1 = sprktm.cfr_renamed_23(enumeration.nextElement());
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(enumeration2.nextElement());
        sprco sprco3 = sprdgm.cfr_renamed_4443(enumeration2);
        if (sprco3 != null && sprco3 instanceof sprktm) {
            this.cfr_renamed_4 = sprktm.cfr_renamed_23(sprco3);
            sprco2 = sprco3 = sprdgm.cfr_renamed_4443(enumeration);
        } else {
            this.cfr_renamed_4 = null;
            sprco2 = sprco3;
        }
        if (sprco2 != null) {
            this.cfr_renamed_2 = sprhdm.cfr_renamed_23(sprco3.cfr_renamed_119());
            return;
        }
        this.cfr_renamed_2 = null;
    }

    public static sprdgm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprdgm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_2616() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_162();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        sprdgm sprdgm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1);
        sprrvm2.cfr_renamed_5004(sprdgm2.cfr_renamed_3);
        if (sprdgm2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    private static /* synthetic */ sprco cfr_renamed_4443(Enumeration arg0) {
        if (arg0.hasMoreElements()) {
            return (sprco)arg0.nextElement();
        }
        return null;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    public sprhdm cfr_renamed_9456() {
        return this.cfr_renamed_2;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_1.cfr_renamed_162();
    }
}

