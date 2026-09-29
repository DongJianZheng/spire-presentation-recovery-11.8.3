/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcp;
import com.spire.presentation.packages.sprcx;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprqto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruq;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.spryr;

@sprtea
public class sprqqo {
    private spryr cfr_renamed_1;
    private sprcx cfr_renamed_2;
    private sprcp cfr_renamed_3;
    private sprqto[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_17082(spryr arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            spruq spruq2;
            sprqto sprqto2 = this.cfr_renamed_4[n];
            spruq spruq3 = spruq2 = sprqto2.cfr_renamed_17081();
            double d = spruq2.cfr_renamed_16758().cfr_renamed_16764().cfr_renamed_17073(spruq3);
            double d2 = spruq3.cfr_renamed_16758().cfr_renamed_16757().cfr_renamed_17073(spruq2);
            if (n != 0) {
                arg0.cfr_renamed_16738(d);
            }
            sprqto2.cfr_renamed_17082(arg0);
            if (n != this.cfr_renamed_4.length - 1) {
                arg0.cfr_renamed_16747(d2);
            }
            n2 = ++n;
        }
    }

    public void cfr_renamed_16730(sprcp arg0, sprcx arg1) {
        sprqqo sprqqo2 = this;
        sprqqo sprqqo3 = this;
        this.cfr_renamed_3 = arg0;
        sprqqo3.cfr_renamed_2 = arg1;
        sprqqo3.cfr_renamed_1 = arg1.cfr_renamed_16777();
        sprqqo sprqqo4 = this;
        sprqqo4.cfr_renamed_17121(sprqqo2.cfr_renamed_3, sprqqo4.cfr_renamed_1);
        sprqqo2.cfr_renamed_17082(sprqqo2.cfr_renamed_1);
        sprqqo2.cfr_renamed_1.cfr_renamed_16744(this.cfr_renamed_3.cfr_renamed_16756().cfr_renamed_16761());
    }

    private /* synthetic */ void cfr_renamed_17121(sprcp arg0, spryr arg1) {
        int n;
        sprwvn sprwvn2 = arg0.cfr_renamed_16760();
        this.cfr_renamed_4 = new sprqto[sprwvn2.size()];
        int n2 = n = 0;
        while (n2 < sprwvn2.size()) {
            spruq spruq2 = (spruq)sprwvn2.get(n);
            sprqto sprqto2 = new sprqto(spruq2, this.cfr_renamed_2);
            sprqto2.cfr_renamed_17080(arg1.cfr_renamed_16748());
            this.cfr_renamed_4[n++] = sprqto2;
            n2 = n;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 1;
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

    public sprmrn cfr_renamed_16731() {
        int n;
        sprmrn sprmrn2 = new sprmrn();
        sprqto[] sprqtoArray = this.cfr_renamed_4;
        int n2 = this.cfr_renamed_4.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprqto sprqto2 = sprqtoArray[n];
            sprmrn2.cfr_renamed_12507(sprqto2.cfr_renamed_16731());
            n3 = ++n;
        }
        return sprmrn2;
    }
}

