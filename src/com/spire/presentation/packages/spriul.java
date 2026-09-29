/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjm;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhwl;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprijm;
import com.spire.presentation.packages.sprkem;
import com.spire.presentation.packages.sprlpl;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprypl;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

public class spriul
implements sprhd {
    private final Collection cfr_renamed_119;
    private final Collection cfr_renamed_91;
    private final sprlpl cfr_renamed_0;
    private final Date cfr_renamed_1;
    private final BigInteger cfr_renamed_2;
    private final sprhwl cfr_renamed_3;
    private final sprypl cfr_renamed_4;

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public spriul(sprlpl sprlpl2, sprhwl sprhwl2, BigInteger bigInteger, Date date, sprypl sprypl2, Collection collection, Collection collection2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spriul spriul2 = this;
        spriul spriul3 = this;
        spriul spriul4 = this;
        this.cfr_renamed_0 = arg0;
        spriul4.cfr_renamed_3 = arg1;
        spriul4.cfr_renamed_2 = arg2;
        spriul3.cfr_renamed_1 = arg3;
        spriul3.cfr_renamed_4 = arg4;
        spriul2.cfr_renamed_91 = arg5;
        spriul2.cfr_renamed_119 = collection2;
    }

    public sprlpl cfr_renamed_93() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_132(Object arg0) {
        sprrdm sprrdm2;
        if (!(arg0 instanceof sprypl)) {
            return false;
        }
        sprypl sprypl2 = (sprypl)arg0;
        if (this.cfr_renamed_4 != null && !this.cfr_renamed_4.equals(sprypl2)) {
            return false;
        }
        if (this.cfr_renamed_2 != null && !sprypl2.cfr_renamed_114().equals(this.cfr_renamed_2)) {
            return false;
        }
        if (this.cfr_renamed_0 != null && !sprypl2.cfr_renamed_93().equals(this.cfr_renamed_0)) {
            return false;
        }
        if (this.cfr_renamed_3 != null && !sprypl2.cfr_renamed_102().equals(this.cfr_renamed_3)) {
            return false;
        }
        if (this.cfr_renamed_1 != null && !sprypl2.cfr_renamed_631(this.cfr_renamed_1)) {
            return false;
        }
        if (!(this.cfr_renamed_91.isEmpty() && this.cfr_renamed_119.isEmpty() || (sprrdm2 = sprypl2.cfr_renamed_5024(sprrdm.cfr_renamed_91)) == null)) {
            int n;
            sprijm[] sprijmArray;
            sprkem sprkem2;
            int n2;
            boolean bl;
            sprbjm sprbjm2;
            try {
                sprbjm2 = sprbjm.cfr_renamed_23(sprrdm2.cfr_renamed_372());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return false;
            }
            sprkem[] sprkemArray = sprbjm2.cfr_renamed_187();
            if (!this.cfr_renamed_91.isEmpty()) {
                bl = false;
                int n3 = n2 = 0;
                while (n3 < sprkemArray.length) {
                    sprkem2 = sprkemArray[n2];
                    sprijmArray = sprkem2.cfr_renamed_188();
                    int n4 = n = 0;
                    while (n4 < sprijmArray.length) {
                        if (this.cfr_renamed_91.contains(sprigm.cfr_renamed_23(sprijmArray[n].cfr_renamed_189()))) {
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
            if (!this.cfr_renamed_119.isEmpty()) {
                bl = false;
                int n5 = n2 = 0;
                while (n5 < sprkemArray.length) {
                    sprkem2 = sprkemArray[n2];
                    sprijmArray = sprkem2.cfr_renamed_188();
                    int n6 = n = 0;
                    while (n6 < sprijmArray.length) {
                        if (this.cfr_renamed_119.contains(sprigm.cfr_renamed_23(sprijmArray[n].cfr_renamed_190()))) {
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

    public sprhwl cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public sprypl cfr_renamed_201() {
        return this.cfr_renamed_4;
    }

    public Date cfr_renamed_195() {
        if (this.cfr_renamed_1 != null) {
            return new Date(this.cfr_renamed_1.getTime());
        }
        return null;
    }

    public Collection cfr_renamed_196() {
        return this.cfr_renamed_119;
    }

    public Collection cfr_renamed_197() {
        return this.cfr_renamed_91;
    }

    @Override
    public Object clone() {
        spriul spriul2 = this;
        spriul spriul3 = this;
        spriul spriul4 = this;
        return new spriul(spriul2.cfr_renamed_0, spriul2.cfr_renamed_3, spriul3.cfr_renamed_2, spriul3.cfr_renamed_1, spriul4.cfr_renamed_4, spriul4.cfr_renamed_91, this.cfr_renamed_119);
    }
}

