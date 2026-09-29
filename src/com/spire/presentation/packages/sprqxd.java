/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprgsd;
import com.spire.presentation.packages.sprmae;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmsd;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprpbe;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.spryfe;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

public class sprqxd
implements sprb {
    private final Date cfr_renamed_119;
    private final Collection cfr_renamed_91;
    private final BigInteger cfr_renamed_0;
    private final Collection cfr_renamed_1;
    private final sprgsd cfr_renamed_2;
    private final sproqd cfr_renamed_3;
    private final sprmsd cfr_renamed_4;

    public sprgsd cfr_renamed_93() {
        return this.cfr_renamed_2;
    }

    public sproqd cfr_renamed_201() {
        return this.cfr_renamed_3;
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        sprtie sprtie2;
        if (!(arg0 instanceof sproqd)) {
            return false;
        }
        sproqd sproqd2 = (sproqd)arg0;
        if (this.cfr_renamed_3 != null && !this.cfr_renamed_3.equals(sproqd2)) {
            return false;
        }
        if (this.cfr_renamed_0 != null && !sproqd2.cfr_renamed_114().equals(this.cfr_renamed_0)) {
            return false;
        }
        if (this.cfr_renamed_2 != null && !sproqd2.cfr_renamed_93().equals(this.cfr_renamed_2)) {
            return false;
        }
        if (this.cfr_renamed_4 != null && !sproqd2.cfr_renamed_102().equals(this.cfr_renamed_4)) {
            return false;
        }
        if (this.cfr_renamed_119 != null && !sproqd2.cfr_renamed_631(this.cfr_renamed_119)) {
            return false;
        }
        if (!(this.cfr_renamed_1.isEmpty() && this.cfr_renamed_91.isEmpty() || (sprtie2 = sproqd2.cfr_renamed_100(sprtie.cfr_renamed_86)) == null)) {
            int n;
            sprpbe[] sprpbeArray;
            spryfe spryfe2;
            int n2;
            boolean bl;
            sprmae sprmae2;
            try {
                sprmae2 = sprmae.cfr_renamed_23(sprtie2.cfr_renamed_372());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return false;
            }
            spryfe[] spryfeArray = sprmae2.cfr_renamed_187();
            if (!this.cfr_renamed_1.isEmpty()) {
                bl = false;
                int n3 = n2 = 0;
                while (n3 < spryfeArray.length) {
                    spryfe2 = spryfeArray[n2];
                    sprpbeArray = spryfe2.cfr_renamed_188();
                    int n4 = n = 0;
                    while (n4 < sprpbeArray.length) {
                        if (this.cfr_renamed_1.contains(sprmee.cfr_renamed_23(sprpbeArray[n].cfr_renamed_189()))) {
                            bl = true;
                            break;
                        }
                        n4 = ++n;
                    }
                    n3 = ++n2;
                }
                if (!bl) {
                    return false;
                }
            }
            if (!this.cfr_renamed_91.isEmpty()) {
                bl = false;
                int n5 = n2 = 0;
                while (n5 < spryfeArray.length) {
                    spryfe2 = spryfeArray[n2];
                    sprpbeArray = spryfe2.cfr_renamed_188();
                    int n6 = n = 0;
                    while (n6 < sprpbeArray.length) {
                        if (this.cfr_renamed_91.contains(sprmee.cfr_renamed_23(sprpbeArray[n].cfr_renamed_190()))) {
                            bl = true;
                            break;
                        }
                        n6 = ++n;
                    }
                    n5 = ++n2;
                }
                if (!bl) {
                    return false;
                }
            }
        }
        return true;
    }

    public Collection cfr_renamed_196() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    public sprqxd(sprgsd sprgsd2, sprmsd sprmsd2, BigInteger bigInteger, Date date, sproqd sproqd2, Collection collection, Collection collection2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqxd sprqxd2 = this;
        sprqxd sprqxd3 = this;
        sprqxd sprqxd4 = this;
        this.cfr_renamed_2 = arg0;
        sprqxd4.cfr_renamed_4 = arg1;
        sprqxd4.cfr_renamed_0 = arg2;
        sprqxd3.cfr_renamed_119 = arg3;
        sprqxd3.cfr_renamed_3 = arg4;
        sprqxd2.cfr_renamed_1 = arg5;
        sprqxd2.cfr_renamed_91 = collection2;
    }

    public sprmsd cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    @Override
    public Object clone() {
        sprqxd sprqxd2 = this;
        sprqxd sprqxd3 = this;
        sprqxd sprqxd4 = this;
        return new sprqxd(sprqxd2.cfr_renamed_2, sprqxd2.cfr_renamed_4, sprqxd3.cfr_renamed_0, sprqxd3.cfr_renamed_119, sprqxd4.cfr_renamed_3, sprqxd4.cfr_renamed_1, this.cfr_renamed_91);
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_0;
    }

    public Date cfr_renamed_195() {
        if (this.cfr_renamed_119 != null) {
            return new Date(this.cfr_renamed_119.getTime());
        }
        return null;
    }

    public Collection cfr_renamed_197() {
        return this.cfr_renamed_1;
    }
}

