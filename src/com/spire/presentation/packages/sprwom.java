/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class sprwom
extends sprqqe {
    private Object[] cfr_renamed_4;

    public static sprwom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwom) {
            return (sprwom)arg0;
        }
        if (arg0 != null) {
            return new sprwom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwom(sprszm sprszm2) {
        void arg0;
        Enumeration enumeration;
        int n = 0;
        this.cfr_renamed_4 = new Object[sprszm2.cfr_renamed_84()];
        Enumeration enumeration2 = enumeration = arg0.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(enumeration.nextElement());
            if (sprnvm2.cfr_renamed_312() == 0) {
                int n2;
                sprszm sprszm3 = sprszm.cfr_renamed_5085(sprnvm2, true);
                sprujm[] sprujmArray = new sprujm[sprszm3.cfr_renamed_84()];
                int n3 = n2 = 0;
                while (n3 != sprujmArray.length) {
                    int n4 = n2++;
                    sprujmArray[n4] = sprujm.cfr_renamed_23(sprszm3.cfr_renamed_85(n4));
                    n3 = n2;
                }
                this.cfr_renamed_4[n] = sprujmArray;
            } else if (sprnvm2.cfr_renamed_312() == 1) {
                this.cfr_renamed_4[n] = sprkim.cfr_renamed_23(sprszm.cfr_renamed_5085(sprnvm2, true));
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprqed.cfr_renamed_9("F\u0006C\u000fH\u000bCJ[\u000bHP\u000f")).append(sprnvm2.cfr_renamed_312()).toString());
            }
            ++n;
            enumeration2 = enumeration;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwom(sprkim sprkim2) {
        void arg0;
        this.cfr_renamed_4 = new Object[1];
        this.cfr_renamed_4[0] = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm(this.cfr_renamed_4.length);
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n] instanceof sprujm[]) {
                sprrvm2.cfr_renamed_5004(new sprycn(0, new sprcen((sprujm[])this.cfr_renamed_4[n])));
            } else {
                sprrvm2.cfr_renamed_5004(new sprycn(1, (sprkim)this.cfr_renamed_4[n]));
            }
            n2 = ++n;
        }
        return new sprcen(sprrvm2);
    }

    public Object[] cfr_renamed_205() {
        Object[] objectArray = new Object[this.cfr_renamed_4.length];
        System.arraycopy(this.cfr_renamed_4, 0, objectArray, 0, objectArray.length);
        return objectArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprwom(sprujm[] sprujmArray) {
        void arg0;
        this.cfr_renamed_4 = new Object[1];
        this.cfr_renamed_4[0] = arg0;
    }
}

