/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbs;
import com.spire.presentation.packages.sprcx;
import com.spire.presentation.packages.sprhwo;
import com.spire.presentation.packages.sprkr;
import com.spire.presentation.packages.sprlso;
import com.spire.presentation.packages.sprmu;
import com.spire.presentation.packages.sprnap;
import com.spire.presentation.packages.sprnz;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;
import com.spire.presentation.packages.sprvuo;
import com.spire.presentation.packages.sprwqo;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprwz;

@sprtea
public class sprfvo {
    private sprcx cfr_renamed_3;
    private sprwvn cfr_renamed_4;

    private /* synthetic */ sprkr cfr_renamed_17087(sprwz arg0) {
        sprfvo sprfvo2;
        sprkr sprkr2;
        switch (arg0.cfr_renamed_16767()) {
            case 0: 
            case 3: {
                sprkr2 = new sprvuo();
                sprfvo2 = this;
                break;
            }
            case 1: {
                sprkr2 = new sprnap();
                sprfvo2 = this;
                break;
            }
            case 2: {
                sprkr2 = new sprhwo();
                sprfvo2 = this;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        sprovja.cfr_renamed_11658(sprfvo2.cfr_renamed_4, sprkr2);
        return sprkr2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = 3 << 3 ^ 2;
        int n4 = n2;
        int n5 = 5 << 3 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprwvn cfr_renamed_17088(spruq spruq2) {
        sprfvo sprfvo2 = this;
        sprfvo2.cfr_renamed_4 = new sprwvn();
        for (sprbs sprbs2 : spruq2.cfr_renamed_12635()) {
            if (sprbs2 instanceof sprmu) {
                this.cfr_renamed_17089((sprmu)sprbs2);
                continue;
            }
            if (!(sprbs2 instanceof sprnz)) continue;
            this.cfr_renamed_17090();
        }
        return this.cfr_renamed_4;
    }

    public sprfvo(sprcx sprcx2) {
        this.cfr_renamed_3 = sprcx2;
    }

    private /* synthetic */ void cfr_renamed_17089(sprmu arg0) {
        sprkr sprkr2 = null;
        if (this.cfr_renamed_4.size() > 0) {
            sprfvo sprfvo2 = this;
            sprkr2 = (sprkr)sprfvo2.cfr_renamed_4.get(sprfvo2.cfr_renamed_4.size() - 1);
        }
        for (sprwz sprwz2 : new sprlso(this.cfr_renamed_3).cfr_renamed_17091(arg0)) {
            if (sprfvo.cfr_renamed_17092(sprwz2, sprkr2)) {
                sprkr2 = this.cfr_renamed_17087(sprwz2);
            }
            if (!(sprkr2 instanceof sprwqo)) continue;
            ((sprwqo)sprkr2).cfr_renamed_16776(sprwz2);
        }
    }

    private /* synthetic */ void cfr_renamed_17090() {
        sprovja.cfr_renamed_11658(this.cfr_renamed_4, new sprhwo());
    }

    private static /* synthetic */ boolean cfr_renamed_17092(sprwz arg0, sprkr arg1) {
        if (arg1 == null) {
            return true;
        }
        if (arg1.cfr_renamed_324() == 2) {
            return true;
        }
        if (arg1.cfr_renamed_324() == 0 && arg0.cfr_renamed_16767() != 0) {
            return true;
        }
        return arg1.cfr_renamed_324() == 1 && arg0.cfr_renamed_16767() != 1;
    }
}

