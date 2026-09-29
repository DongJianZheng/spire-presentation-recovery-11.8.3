/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.spronm;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxyy;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzmm;
import java.util.Enumeration;

public class sprflm
extends sprqqe {
    private spronm cfr_renamed_2;
    private sprszm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    public sprffm[] cfr_renamed_4663() {
        int n;
        if (null == this.cfr_renamed_4) {
            return new sprffm[0];
        }
        sprffm[] sprffmArray = new sprffm[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprffmArray.length) {
            int n3 = n++;
            sprffmArray[n3] = sprffm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprffmArray;
    }

    public sprzmm[] cfr_renamed_4664() {
        int n;
        if (null == this.cfr_renamed_3) {
            return new sprzmm[0];
        }
        sprzmm[] sprzmmArray = new sprzmm[this.cfr_renamed_3.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < sprzmmArray.length) {
            int n3 = n++;
            sprzmmArray[n3] = sprzmm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprzmmArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprflm(sprszm sprszm2) {
        sprnvm sprnvm2;
        void arg0;
        if (sprszm2.cfr_renamed_84() > 3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxyy.cfr_renamed_9("rBT\u0003CFAVUMSF\u0010PYYU\u0019\u0010")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration = arg0.cfr_renamed_329();
        block5: while (true) {
            if (!enumeration.hasMoreElements()) {
                return;
            }
            sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 128);
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    sprszm sprszm3 = (sprszm)sprnvm2.cfr_renamed_8225();
                    Enumeration enumeration2 = sprszm3.cfr_renamed_329();
                    while (enumeration2.hasMoreElements()) {
                        Enumeration enumeration3;
                        Enumeration enumeration4 = enumeration3;
                        enumeration2 = enumeration4;
                        sprffm.cfr_renamed_23(enumeration4.nextElement());
                    }
                    this.cfr_renamed_4 = sprszm3;
                    continue block5;
                }
                case 1: {
                    sprszm sprszm4 = (sprszm)sprnvm2.cfr_renamed_8225();
                    Enumeration enumeration5 = sprszm4.cfr_renamed_329();
                    while (enumeration5.hasMoreElements()) {
                        Enumeration enumeration6;
                        Enumeration enumeration7 = enumeration6;
                        enumeration5 = enumeration7;
                        sprzmm.cfr_renamed_23(enumeration7.nextElement());
                    }
                    this.cfr_renamed_3 = sprszm4;
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2 = spronm.cfr_renamed_23(sprnvm2.cfr_renamed_8225());
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpgm.cfr_renamed_9("^EAJ[BS\u000bCJP\u0011\u0017")).append(sprnvm2.cfr_renamed_312()).toString());
    }

    public spronm cfr_renamed_4665() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprflm(sprffm[] sprffmArray, sprzmm[] sprzmmArray, spronm spronm2) {
        void arg2;
        void arg1;
        void arg0;
        if (null != arg0) {
            sprflm sprflm2 = this;
            sprflm2.cfr_renamed_4 = new sprcen((sprco[])arg0);
        }
        if (null != arg1) {
            this.cfr_renamed_3 = new sprcen((sprco[])arg1);
        }
        this.cfr_renamed_2 = arg2;
    }

    public static sprflm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprflm) {
            return (sprflm)arg0;
        }
        if (arg0 != null) {
            return new sprflm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (null != this.cfr_renamed_4) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_4));
        }
        if (null != this.cfr_renamed_3) {
            sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_3));
        }
        if (null != this.cfr_renamed_2) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)this.cfr_renamed_2.cfr_renamed_119()));
        }
        return new sprcen(sprrvm2);
    }
}

