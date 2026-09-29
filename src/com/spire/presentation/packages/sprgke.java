/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbqy;
import com.spire.presentation.packages.sprcce;
import com.spire.presentation.packages.sprfjo;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvae;
import com.spire.presentation.packages.sprvva;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprgke
extends sprvae {
    private int cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private static int cfr_renamed_2 = 1;
    private static int cfr_renamed_3 = 2;
    private sprtzd cfr_renamed_4;

    @Override
    public sprtzd cfr_renamed_2567() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprgke(sprbne sprbne2) {
        sprgke sprgke2 = this;
        sprgke2.cfr_renamed_91 = 0;
        Enumeration enumeration = sprbne2.cfr_renamed_329();
        sprgke2.cfr_renamed_4 = sprtzd.cfr_renamed_23(enumeration.nextElement());
        block4: while (enumeration.hasMoreElements()) {
            sprcce sprcce2 = sprcce.cfr_renamed_23(enumeration.nextElement());
            switch (sprcce2.cfr_renamed_312()) {
                case 1: {
                    this.cfr_renamed_4687(sprcce2);
                    continue block4;
                }
                case 2: {
                    this.cfr_renamed_4688(sprcce2);
                    continue block4;
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfjo.cfr_renamed_9("{[E[AB@\u0015jp|aORIPJzL_KVZ\u0015\u0014")).append(sprcce2.cfr_renamed_312()).append(sprbqy.cfr_renamed_9("~xs(<2s'=f\u001a5<qkwe\u0014\u0000\u0007\u000331*:%\u0018#*\u0015'4&%'3!#")).toString());
        }
        if (this.cfr_renamed_91 != 3) {
            throw new IllegalArgumentException(sprfjo.cfr_renamed_9("C\\]FG[I\u0015OGI@CP@A\u000e\u0018\u0010\u0015@ZZ\u0015O[\u000e|]Z\u0019\r\u001f\u0003|foe[WB\\M~KL}A\\@MA[GK"));
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprcce(1, this.cfr_renamed_2295()));
        sprlre2.cfr_renamed_49(new sprcce(2, this.cfr_renamed_2296()));
        return new sprpse(sprlre2);
    }

    private /* synthetic */ void cfr_renamed_4687(sprcce arg0) {
        if ((this.cfr_renamed_91 & cfr_renamed_2) == 0) {
            this.cfr_renamed_91 |= cfr_renamed_2;
            this.cfr_renamed_0 = arg0.cfr_renamed_97();
            return;
        }
        throw new IllegalArgumentException(sprbqy.cfr_renamed_9("\u000b<\"&*&5s'?46'7?s562"));
    }

    public BigInteger cfr_renamed_2296() {
        return this.cfr_renamed_1;
    }

    public BigInteger cfr_renamed_2295() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_4688(sprcce arg0) {
        if ((this.cfr_renamed_91 & cfr_renamed_3) == 0) {
            this.cfr_renamed_91 |= cfr_renamed_3;
            this.cfr_renamed_1 = arg0.cfr_renamed_97();
            return;
        }
        throw new IllegalArgumentException(sprfjo.cfr_renamed_9("pVEA[K[Z\u0015OY\\POQW\u0015]PZ"));
    }

    /*
     * WARNING - void declaration
     */
    public sprgke(sprtzd sprtzd2, BigInteger bigInteger, BigInteger bigInteger2) {
        void arg1;
        void arg0;
        sprgke sprgke2 = this;
        sprgke sprgke3 = this;
        sprgke3.cfr_renamed_91 = 0;
        sprgke3.cfr_renamed_4 = arg0;
        sprgke2.cfr_renamed_0 = arg1;
        sprgke2.cfr_renamed_1 = bigInteger2;
    }
}

