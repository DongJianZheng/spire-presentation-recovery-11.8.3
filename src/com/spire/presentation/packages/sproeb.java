/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprlhb;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprodb;
import com.spire.presentation.packages.sprqra;
import com.spire.presentation.packages.sprreb;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprxta;
import com.spire.presentation.packages.sprzcb;

public final class sproeb {
    private /* synthetic */ sproeb() {
    }

    public static sprsma cfr_renamed_1243(sprodb arg0, sprsma arg1, sprsma arg2) {
        return (sprsma)arg0.cfr_renamed_1145().cfr_renamed_1102(arg1).cfr_renamed_804(arg2);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4;
        int n4 = n2;
        int n5 = 3 << 3 ^ (2 ^ 5);
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

    public static sprsma[] cfr_renamed_1244(sprlhb arg0, sprsma arg1) {
        sprlhb sprlhb2 = arg0;
        int n = sprlhb2.cfr_renamed_1150();
        sprkqa sprkqa2 = sprlhb2.cfr_renamed_1155();
        sprmpa sprmpa2 = sprlhb2.cfr_renamed_845();
        sprxta sprxta2 = sprlhb2.cfr_renamed_1147();
        sprjta sprjta2 = sprlhb2.cfr_renamed_1153();
        sprxta[] sprxtaArray = sprlhb2.cfr_renamed_1148();
        sprkqa sprkqa3 = sprkqa2.cfr_renamed_875();
        sprsma sprsma2 = (sprsma)arg1.cfr_renamed_807(sprkqa3);
        sprsma sprsma3 = sprqra.cfr_renamed_947((sprsma)sprjta2.cfr_renamed_880(sprsma2), sprmpa2, sprxta2, sprxtaArray);
        sprsma sprsma4 = (sprsma)sprsma2.cfr_renamed_804(sprsma3);
        sprsma4 = (sprsma)sprsma4.cfr_renamed_807(sprkqa2);
        sprsma3 = (sprsma)sprsma3.cfr_renamed_807(sprkqa2);
        sprsma sprsma5 = sprsma4.cfr_renamed_962(n);
        sprsma[] sprsmaArray = new sprsma[2];
        sprsmaArray[0] = sprsma5;
        sprsmaArray[1] = sprsma3;
        return sprsmaArray;
    }

    public static sprsma[] cfr_renamed_1245(sprreb arg0, sprsma arg1) {
        sprreb sprreb2 = arg0;
        int n = sprreb2.cfr_renamed_1150();
        sprkqa sprkqa2 = sprreb2.cfr_renamed_1155();
        sprmpa sprmpa2 = sprreb2.cfr_renamed_845();
        sprxta sprxta2 = sprreb2.cfr_renamed_1147();
        sprjta sprjta2 = sprreb2.cfr_renamed_1153();
        sprxta[] sprxtaArray = sprreb2.cfr_renamed_1148();
        sprkqa sprkqa3 = sprkqa2.cfr_renamed_875();
        sprsma sprsma2 = (sprsma)arg1.cfr_renamed_807(sprkqa3);
        sprsma sprsma3 = sprqra.cfr_renamed_947((sprsma)sprjta2.cfr_renamed_880(sprsma2), sprmpa2, sprxta2, sprxtaArray);
        sprsma sprsma4 = (sprsma)sprsma2.cfr_renamed_804(sprsma3);
        sprsma4 = (sprsma)sprsma4.cfr_renamed_807(sprkqa2);
        sprsma3 = (sprsma)sprsma3.cfr_renamed_807(sprkqa2);
        sprsma sprsma5 = sprsma4.cfr_renamed_962(n);
        sprsma[] sprsmaArray = new sprsma[2];
        sprsmaArray[0] = sprsma5;
        sprsmaArray[1] = sprsma3;
        return sprsmaArray;
    }

    public static sprsma cfr_renamed_1246(sprzcb arg0, sprsma arg1, sprsma arg2) {
        return (sprsma)arg0.cfr_renamed_1154().cfr_renamed_1102(arg1).cfr_renamed_804(arg2);
    }
}

