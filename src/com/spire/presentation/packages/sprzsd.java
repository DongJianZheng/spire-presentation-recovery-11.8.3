/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprltd;
import com.spire.presentation.packages.spro;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.sprvva;
import java.util.ArrayList;
import java.util.Enumeration;

public class sprzsd {
    private sprrve cfr_renamed_4;

    public sprzsd(sprrve sprrve2) {
        this.cfr_renamed_4 = sprrve2;
    }

    public spro cfr_renamed_633() {
        sprere sprere2 = this.cfr_renamed_4.cfr_renamed_633();
        if (sprere2 != null) {
            ArrayList<spreud> arrayList = new ArrayList<spreud>(sprere2.cfr_renamed_84());
            Enumeration enumeration = sprere2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof sprbne)) continue;
                arrayList.add(new spreud(sproje.cfr_renamed_23(sprvva2)));
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public spro cfr_renamed_617() {
        sprere sprere2 = this.cfr_renamed_4.cfr_renamed_617();
        if (sprere2 != null) {
            ArrayList<sprcyd> arrayList = new ArrayList<sprcyd>(sprere2.cfr_renamed_84());
            Enumeration enumeration = sprere2.cfr_renamed_329();
            while (enumeration.hasMoreElements()) {
                sprvva sprvva2 = ((spra)enumeration.nextElement()).cfr_renamed_119();
                if (!(sprvva2 instanceof sprbne)) continue;
                arrayList.add(new sprcyd(sprcge.cfr_renamed_23(sprvva2)));
            }
            return new sprltd(arrayList);
        }
        return new sprltd(new ArrayList());
    }

    public sprrve cfr_renamed_568() {
        return this.cfr_renamed_4;
    }
}

