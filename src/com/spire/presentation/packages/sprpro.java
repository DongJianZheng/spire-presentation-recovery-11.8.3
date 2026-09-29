/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprtea;
import java.util.ArrayList;

@sprtea
public class sprpro {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1 << 1;
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

    public static ArrayList<String> cfr_renamed_17427(String arg0, boolean arg1) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (arg1) {
            ArrayList<String> arrayList2 = arrayList;
            sprpro.cfr_renamed_17428(arrayList2, arg0);
            return arrayList2;
        }
        ArrayList<String> arrayList3 = arrayList;
        sprovja.cfr_renamed_17429(arrayList3, sprsyia.cfr_renamed_11683(arg0));
        return arrayList3;
    }

    private static /* synthetic */ void cfr_renamed_17428(ArrayList<String> arg0, String arg1) {
        int n;
        String string = arg1;
        sprovja.cfr_renamed_17429(arg0, sprsyia.cfr_renamed_11683(string));
        String[] stringArray = sprsyia.cfr_renamed_11686(string);
        int n2 = stringArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string2 = stringArray[n];
            sprpro.cfr_renamed_17428(arg0, string2);
            n3 = ++n;
        }
    }

    private /* synthetic */ sprpro() {
    }
}

