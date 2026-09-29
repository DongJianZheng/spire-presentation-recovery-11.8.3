/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprhpa;
import com.spire.presentation.packages.sprk;
import com.spire.presentation.packages.sprobb;
import com.spire.presentation.packages.sprpqa;
import com.spire.presentation.packages.sprpya;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprwua;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.spryeb;

public class sprbxa
implements spry {
    private sprpya cfr_renamed_4;

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_4 = (sprpya)arg0;
    }

    @Override
    public sprwnd cfr_renamed_1223() {
        sprama sprama2;
        int n;
        sprama sprama3;
        sprama sprama4;
        sprk sprk2;
        sprbxa sprbxa2 = this;
        int n2 = sprbxa2.cfr_renamed_4.cfr_renamed_84;
        int n3 = sprbxa2.cfr_renamed_4.cfr_renamed_133;
        int n4 = sprbxa2.cfr_renamed_4.cfr_renamed_119;
        int n5 = sprbxa2.cfr_renamed_4.cfr_renamed_723;
        int n6 = sprbxa2.cfr_renamed_4.cfr_renamed_953;
        int n7 = sprbxa2.cfr_renamed_4.cfr_renamed_112;
        int n8 = sprbxa2.cfr_renamed_4.cfr_renamed_724;
        boolean bl = sprbxa2.cfr_renamed_4.cfr_renamed_4;
        boolean bl2 = sprbxa2.cfr_renamed_4.cfr_renamed_145;
        sprama sprama5 = null;
        boolean bl3 = bl;
        while (true) {
            sprama sprama6;
            if (bl3) {
                sprk sprk3;
                if (this.cfr_renamed_4.cfr_renamed_132 == 0) {
                    int n9 = n4;
                    sprk3 = sprhpa.cfr_renamed_707(n2, n9, n9, bl2, this.cfr_renamed_4.cfr_renamed_1295());
                } else {
                    int n10 = n7;
                    sprk3 = sprpqa.cfr_renamed_734(n2, n5, n6, n10, n10, this.cfr_renamed_4.cfr_renamed_1295());
                }
                sprk2 = sprk3;
                sprama6 = sprama4 = sprk2.cfr_renamed_131();
                sprama4.cfr_renamed_751(3);
                sprama4.cfr_renamed_1[0] = sprama4.cfr_renamed_1[0] + 1;
            } else {
                sprk sprk4;
                int n11 = n2;
                if (this.cfr_renamed_4.cfr_renamed_132 == 0) {
                    int n12 = n4;
                    sprk4 = sprhpa.cfr_renamed_707(n11, n12, n12 - 1, bl2, this.cfr_renamed_4.cfr_renamed_1295());
                } else {
                    int n13 = n7;
                    sprk4 = sprpqa.cfr_renamed_734(n11, n5, n6, n13, n13 - 1, this.cfr_renamed_4.cfr_renamed_1295());
                }
                sprk2 = sprk4;
                sprama4 = sprk2.cfr_renamed_131();
                sprama5 = sprama4.cfr_renamed_761();
                if (sprama5 == null) {
                    bl3 = bl;
                    continue;
                }
                sprama6 = sprama4;
            }
            sprama3 = sprama6.cfr_renamed_778(n3);
            if (sprama3 != null) break;
            bl3 = bl;
        }
        if (bl) {
            sprama5 = new sprama(n2);
            sprama5.cfr_renamed_1[0] = 1;
        }
        do {
            n = n8;
        } while ((sprama4 = sprwua.cfr_renamed_708(n2, n, n - 1, this.cfr_renamed_4.cfr_renamed_1295())).cfr_renamed_778(n3) == null);
        sprama sprama7 = sprama2 = ((sprwua)sprama4).cfr_renamed_728(sprama3, n3);
        sprama7.cfr_renamed_770(n3);
        sprama7.cfr_renamed_766(n3);
        sprama4.cfr_renamed_722();
        sprama3.cfr_renamed_722();
        spryeb spryeb2 = new spryeb(sprama2, sprk2, sprama5, this.cfr_renamed_4.cfr_renamed_1346());
        sprobb sprobb2 = new sprobb(sprama2, this.cfr_renamed_4.cfr_renamed_1346());
        return new sprwnd(sprobb2, spryeb2);
    }
}

