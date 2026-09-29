/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprige;
import com.spire.presentation.packages.sprlzd;
import com.spire.presentation.packages.sprpje;
import com.spire.presentation.packages.sprspd;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.spryyd;
import java.util.Date;

public class sprvxd {
    private sprige cfr_renamed_4;

    public spryyd cfr_renamed_4276() {
        return new spryyd(this.cfr_renamed_4.cfr_renamed_4277());
    }

    public sprszd cfr_renamed_4278() {
        return this.cfr_renamed_4.cfr_renamed_4278();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 5;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
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

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_3().cfr_renamed_97().intValue() + 1;
    }

    public Date cfr_renamed_4279() {
        return sprlzd.cfr_renamed_4269(this.cfr_renamed_4.cfr_renamed_4279());
    }

    public sprspd[] cfr_renamed_4280() {
        int n;
        sprbne sprbne2 = this.cfr_renamed_4.cfr_renamed_4280();
        sprspd[] sprspdArray = new sprspd[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprspdArray.length) {
            int n3 = n;
            sprspd sprspd2 = new sprspd(sprpje.cfr_renamed_23(sprbne2.cfr_renamed_85(n)));
            sprspdArray[n3] = sprspd2;
            n2 = ++n;
        }
        return sprspdArray;
    }

    public sprvxd(sprige sprige2) {
        this.cfr_renamed_4 = sprige2;
    }
}

