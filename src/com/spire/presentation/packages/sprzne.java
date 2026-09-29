/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpgo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzgp;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprzne
extends sprqqe {
    public sproug cfr_renamed_2;
    public spraem cfr_renamed_3;
    public sprktm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzne(sprvhm sprvhm2, spraem spraem2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprzne sprzne2 = this;
        this.cfr_renamed_2 = null;
        sprzne2.cfr_renamed_3 = null;
        sprzne2.cfr_renamed_4 = null;
        sprwil sprwil2 = new sprwil();
        byte[] byArray = new byte[sprwil2.cfr_renamed_1218()];
        byte[] byArray2 = arg0.cfr_renamed_2314().cfr_renamed_81();
        sprwil2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprzne sprzne3 = this;
        sprwil2.cfr_renamed_1219(byArray, 0);
        sprzne sprzne4 = this;
        sprzne4.cfr_renamed_2 = new sprfvg(byArray);
        sprzne3.cfr_renamed_3 = arg1;
        sprzne3.cfr_renamed_4 = arg2 != null ? new sprktm((BigInteger)arg2) : null;
    }

    public spraem cfr_renamed_288() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprzne(sprszm sprszm2) {
        sprzne sprzne2 = this;
        this.cfr_renamed_2 = null;
        sprzne2.cfr_renamed_3 = null;
        sprzne2.cfr_renamed_4 = null;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sproug.cfr_renamed_5085(sprnvm2, false);
                    continue block5;
                }
                case 1: {
                    this.cfr_renamed_3 = spraem.cfr_renamed_5085(sprnvm2, false);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_4 = sprktm.cfr_renamed_5085(sprnvm2, false);
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(sprpgo.cfr_renamed_9("T~QwZsQ2IsZ"));
    }

    public sprzne(byte[] arg0) {
        this(arg0, null, null);
    }

    public static sprzne cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprzne.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprzne(byte[] byArray, spraem spraem2, BigInteger bigInteger) {
        void arg2;
        void arg1;
        void arg0;
        sprzne sprzne2 = this;
        sprzne sprzne3 = this;
        sprzne3.cfr_renamed_2 = null;
        sprzne3.cfr_renamed_3 = null;
        sprzne2.cfr_renamed_4 = null;
        sprzne2.cfr_renamed_2 = byArray != null ? new sprfvg(sproze.cfr_renamed_158((byte[])arg0)) : null;
        sprzne sprzne4 = this;
        sprzne4.cfr_renamed_3 = arg1;
        sprzne4.cfr_renamed_4 = arg2 != null ? new sprktm((BigInteger)arg2) : null;
    }

    public sprzne(spraem arg0, BigInteger arg1) {
        this((byte[])null, arg0, arg1);
    }

    public sprzne(sprvhm arg0) {
        this(arg0, null, null);
    }

    public String toString() {
        String string = this.cfr_renamed_2 != null ? sprfqe.cfr_renamed_503(this.cfr_renamed_2.cfr_renamed_186()) : "null";
        return new StringBuilder().insert(0, sprzgp.cfr_renamed_9("jM_PDJBLRsNAb\\NV_QMQNJ\u0011\u0018`]Rqo\u0010")).append(string).append(")").toString();
    }

    public static sprzne cfr_renamed_5322(sprhgm arg0) {
        return sprzne.cfr_renamed_23(sprhgm.cfr_renamed_11135(arg0, sprrdm.cfr_renamed_105));
    }

    public static sprzne cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzne) {
            return (sprzne)arg0;
        }
        if (arg0 != null) {
            return new sprzne(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_327() {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_186();
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_2));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_4));
        }
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_290() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_97();
        }
        return null;
    }
}

