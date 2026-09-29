/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.sprhxo;
import com.spire.presentation.packages.spriho;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwro;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprazo {
    public static void cfr_renamed_13285(sprhxo arg0, boolean arg1) {
        sprhxo sprhxo2 = arg0;
        sprazo.cfr_renamed_17124(sprhxo2, sprhxo2.cfr_renamed_13276(), "", arg1);
        sprwvn sprwvn2 = new sprwvn();
        for (sprqyo sprqyo2 : sprhxo2.cfr_renamed_13274()) {
            if (sprqyo2.cfr_renamed_13276().cfr_renamed_11861() <= 0) continue;
            sprovja.cfr_renamed_11658(sprwvn2, sprqyo2);
        }
        Iterator iterator = sprwvn2.iterator();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            sprqyo sprqyo2;
            sprqyo2 = (sprqyo)iterator.next();
            iterator2 = iterator;
            sprazo.cfr_renamed_17124(arg0, sprqyo2.cfr_renamed_13276(), sprqyo2.cfr_renamed_313(), arg1);
        }
    }

    private /* synthetic */ sprazo() {
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int cfr_ignored_0 = (2 ^ 5) << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4 << 3;
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

    private static /* synthetic */ void cfr_renamed_17124(sprhxo arg0, sprdso arg1, String arg2, boolean arg3) {
        Iterator iterator;
        sprwin sprwin2;
        sprqyo sprqyo2 = new sprqyo(sprazo.cfr_renamed_17125(arg2), "application/vnd.openxmlformats-package.relationships+xml");
        sprwin sprwin3 = sprwin2 = new sprwin(sprqyo2.cfr_renamed_13232(), arg3);
        sprwin3.cfr_renamed_12458("Relationships");
        sprwin3.cfr_renamed_12405("xmlns", "http://schemas.openxmlformats.org/package/2006/relationships");
        Iterator iterator2 = iterator = arg1.iterator();
        while (iterator2.hasNext()) {
            sprwro sprwro2 = (sprwro)iterator.next();
            sprwin sprwin4 = sprwin2;
            sprwin2.cfr_renamed_12423("Relationship");
            sprwin4.cfr_renamed_12405("Id", sprwro2.cfr_renamed_19());
            sprwin4.cfr_renamed_12405("Type", sprwro2.cfr_renamed_324());
            sprwro sprwro3 = sprwro2;
            sprwin4.cfr_renamed_12405("Target", sprwro3.cfr_renamed_4750());
            if (sprwro3.cfr_renamed_17126()) {
                sprwin2.cfr_renamed_12405("TargetMode", "External");
            }
            sprwin2.cfr_renamed_12439();
            iterator2 = iterator;
        }
        sprwin2.cfr_renamed_12453();
        arg0.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
    }

    public static String cfr_renamed_17125(String arg0) {
        String string = arg0;
        int n = string.lastIndexOf(47);
        String string2 = string.substring(0, 0 + (n + 1));
        String string3 = string.substring(n + 1);
        Object[] objectArray = new Object[3];
        objectArray[0] = string2.startsWith("/") ? "" : "/";
        objectArray[1] = string2;
        objectArray[2] = string3;
        return sprraia.cfr_renamed_11562(spriho.cfr_renamed_9("B>Du\bsf|\\bJ!B<D KkU}"), objectArray);
    }
}

