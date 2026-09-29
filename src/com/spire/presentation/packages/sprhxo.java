/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazia;
import com.spire.presentation.packages.sprbty;
import com.spire.presentation.packages.sprdso;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprpto;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprusca;
import com.spire.presentation.packages.sprwmr;
import com.spire.presentation.packages.sprwro;
import com.spire.presentation.packages.sprwsia;
import com.spire.presentation.packages.sprznp;

@sprtea
public abstract class sprhxo {
    private sprdso cfr_renamed_152;
    private static String cfr_renamed_112;
    private sprpto cfr_renamed_119;
    private static final sprusca cfr_renamed_91;
    private static String cfr_renamed_0;
    private static String cfr_renamed_1;
    private static String cfr_renamed_2;
    private static String cfr_renamed_3;
    private static String cfr_renamed_4;

    public sprqyo cfr_renamed_17149(sprqyo arg0, String arg1) {
        return this.cfr_renamed_17150(arg0, arg1, false);
    }

    public static String cfr_renamed_17141(String arg0, String arg1) {
        int n;
        if (arg1.startsWith("/")) {
            return arg1;
        }
        if (sprznp.cfr_renamed_11766(arg1, sprbty.cfr_renamed_9("?\u001e=\u0007"))) {
            return "";
        }
        String string = sprhxo.cfr_renamed_17151(arg0);
        int n2 = 0;
        while ((n = arg1.indexOf(cfr_renamed_112, n2)) >= n2) {
            if (n > n2) {
                int n3 = n2;
                string = sprraia.cfr_renamed_11961(string, arg1.substring(n3, n3 + (n - n3)));
            }
            string = sprhxo.cfr_renamed_17151(string);
            n2 = n + cfr_renamed_112.length();
        }
        int n4 = n2;
        String string2 = arg1;
        string = sprraia.cfr_renamed_11961(string, string2.substring(n4, n4 + (string2.length() - n2)));
        return string;
    }

    public void cfr_renamed_11631(spreen arg0) throws Exception {
    }

    static {
        cfr_renamed_2 = "rels";
        cfr_renamed_1 = "/";
        cfr_renamed_112 = "../";
        Object[] objectArray = new Object[1];
        objectArray[0] = cfr_renamed_2;
        cfr_renamed_4 = sprraia.cfr_renamed_11562(sprwsia.cfr_renamed_9("<=\";"), objectArray);
        Object[] objectArray2 = new Object[2];
        objectArray2[0] = cfr_renamed_1;
        objectArray2[1] = cfr_renamed_2;
        cfr_renamed_3 = sprraia.cfr_renamed_11562("{0}_{1}", objectArray2);
        Object[] objectArray3 = new Object[2];
        objectArray3[0] = cfr_renamed_2;
        objectArray3[1] = cfr_renamed_1;
        cfr_renamed_0 = sprraia.cfr_renamed_11562(sprbty.cfr_renamed_9("\u0014\n{\f0@6"), objectArray3);
        String[] stringArray = new String[5];
        stringArray[0] = "Relationship";
        stringArray[1] = "Id";
        stringArray[2] = "Type";
        stringArray[3] = "Target";
        stringArray[4] = "TargetMode";
        cfr_renamed_91 = new sprusca(stringArray);
    }

    public sprqyo cfr_renamed_17152(String arg0) {
        sprqyo sprqyo2 = this.cfr_renamed_17153(arg0);
        if (sprqyo2 == null) {
            return null;
        }
        return sprqyo2;
    }

    public sprpto cfr_renamed_13274() {
        return this.cfr_renamed_119;
    }

    public static String cfr_renamed_17132(String arg0, String arg1) {
        int n;
        int n2;
        int n3;
        block6: {
            if (!arg1.startsWith("/")) {
                return arg1;
            }
            int n4 = 0;
            int n5 = sprrgga.cfr_renamed_12461(arg0.length(), arg1.length());
            int n6 = n3 = 0;
            while (n6 < n5) {
                if (arg0.charAt(n3) == '/') {
                    n4 = n3;
                }
                if (arg0.charAt(n3) != arg1.charAt(n3)) {
                    n2 = n4;
                    break block6;
                }
                n6 = ++n3;
            }
            n2 = n4;
        }
        n3 = n2 + 1;
        StringBuilder stringBuilder = new StringBuilder();
        int n7 = n = n3;
        while (n7 < arg0.length()) {
            if (arg0.charAt(n) == '/') {
                sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_112);
            }
            n7 = ++n;
        }
        StringBuilder stringBuilder2 = stringBuilder;
        int n8 = n3;
        String string = arg1;
        stringBuilder2.append(string, n8, n8 + (string.length() - n3));
        return stringBuilder2.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_17154(sprqyo arg0, sprdso arg1) {
        sprwmr sprwmr2 = new sprwmr(arg0.cfr_renamed_13232());
        block9: while (true) {
            sprwmr sprwmr3 = sprwmr2;
            block10: while (true) {
                if (!sprwmr3.cfr_renamed_12372("Relationships")) {
                    return;
                }
                switch (cfr_renamed_91.cfr_renamed_12854(sprwmr2.cfr_renamed_12286())) {
                    case 0: {
                        String string = null;
                        String string2 = null;
                        String string3 = null;
                        boolean bl = false;
                        while (sprwmr2.cfr_renamed_12287()) {
                            switch (cfr_renamed_91.cfr_renamed_12854(sprwmr2.cfr_renamed_12286())) {
                                case 1: {
                                    string = sprwmr2.cfr_renamed_97();
                                    break;
                                }
                                case 2: {
                                    string2 = sprwmr2.cfr_renamed_97();
                                    break;
                                }
                                case 3: {
                                    string3 = sprwmr2.cfr_renamed_97();
                                    break;
                                }
                                case 4: {
                                    bl = "External".equals(sprwmr2.cfr_renamed_97());
                                    break;
                                }
                            }
                        }
                        if (!sprznp.cfr_renamed_12328(string3)) continue block9;
                        sprwmr3 = sprwmr2;
                        arg1.cfr_renamed_17133(string, string2, string3, bl);
                        continue block10;
                    }
                }
                sprwmr sprwmr4 = sprwmr2;
                sprwmr3 = sprwmr4;
                sprwmr4.cfr_renamed_12353();
            }
            break;
        }
    }

    public sprqyo cfr_renamed_17150(sprqyo arg0, String arg1, boolean arg2) {
        sprwro sprwro2;
        boolean bl;
        String string;
        sprdso sprdso2;
        if (arg0 == null) {
            sprdso2 = this.cfr_renamed_152;
            string = cfr_renamed_1;
            bl = arg2;
        } else {
            sprqyo sprqyo2 = arg0;
            sprdso2 = sprqyo2.cfr_renamed_13276();
            string = sprqyo2.cfr_renamed_313();
            bl = arg2;
        }
        sprwro sprwro3 = sprwro2 = !bl ? sprdso2.cfr_renamed_17134(arg1) : sprdso2.cfr_renamed_17128(arg1);
        if (!arg2 && sprwro2 == null && arg1.contains("/")) {
            String string2 = arg1;
            String string3 = string2.substring(string2.lastIndexOf(47));
            sprwro2 = sprdso2.cfr_renamed_17128(string3);
        }
        if (sprwro2 != null) {
            return this.cfr_renamed_17153(sprhxo.cfr_renamed_17141(string, sprwro2.cfr_renamed_4750()));
        }
        return null;
    }

    public sprqyo cfr_renamed_17155(sprqyo arg0, String arg1, String arg2, String arg3) {
        String string = null;
        String[] stringArray = new String[1];
        stringArray[0] = string;
        String[] stringArray2 = stringArray;
        sprqyo sprqyo2 = this.cfr_renamed_17156(arg0, arg1, arg2, arg3, stringArray2);
        string = stringArray2[0];
        return sprqyo2;
    }

    public sprqyo cfr_renamed_17153(String arg0) {
        return this.cfr_renamed_119.cfr_renamed_1600(arg0);
    }

    private static /* synthetic */ String cfr_renamed_17151(String arg0) {
        int n;
        int n2;
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return arg0;
        }
        if (sprraia.cfr_renamed_11730(arg0, cfr_renamed_1)) {
            return arg0;
        }
        int n3 = n2 = (n = arg0.length() - 1);
        while (n3 >= 0) {
            if (arg0.charAt(n2) == '/' && n2 < n) {
                return arg0.substring(0, 0 + (n2 + 1));
            }
            n3 = --n2;
        }
        return "";
    }

    @sprtea
    public void cfr_renamed_17157() {
        for (sprqyo sprqyo2 : this.cfr_renamed_119) {
            String string;
            String string2 = sprazia.cfr_renamed_11887(sprqyo2.cfr_renamed_313());
            if (sprraia.cfr_renamed_11730(sprqyo2.cfr_renamed_4780(), cfr_renamed_2)) {
                string = sprqyo2.cfr_renamed_313().replace(cfr_renamed_3, "").replace(cfr_renamed_4, "");
                if (!sprraia.cfr_renamed_11730(string, cfr_renamed_1)) continue;
                sprhxo.cfr_renamed_17154(sprqyo2, this.cfr_renamed_152);
                continue;
            }
            if (!sprznp.cfr_renamed_12328(string2)) continue;
            String string3 = string2;
            String string4 = string2;
            string = sprqyo2.cfr_renamed_313().replace(string4, cfr_renamed_0 + string4 + cfr_renamed_4);
            if (!this.cfr_renamed_119.cfr_renamed_17136(string)) continue;
            sprhxo.cfr_renamed_17154(this.cfr_renamed_17152(string), sprqyo2.cfr_renamed_13276());
        }
    }

    public sprhxo() {
        sprhxo sprhxo2 = this;
        this.cfr_renamed_152 = new sprdso(cfr_renamed_1);
        sprhxo2.cfr_renamed_119 = new sprpto();
    }

    public sprqyo cfr_renamed_17156(sprqyo arg0, String arg1, String arg2, String arg3, String[] arg4) {
        if (arg0 != null) {
            arg1 = sprhxo.cfr_renamed_17141(arg0.cfr_renamed_313(), arg1);
        }
        sprqyo sprqyo2 = new sprqyo(arg1, arg2);
        this.cfr_renamed_119.cfr_renamed_13275(sprqyo2);
        sprdso sprdso2 = arg0 != null ? arg0.cfr_renamed_13276() : this.cfr_renamed_152;
        arg4[0] = sprdso2.cfr_renamed_13277(arg3, sprqyo2.cfr_renamed_313(), false);
        return sprqyo2;
    }

    public sprdso cfr_renamed_13276() {
        return this.cfr_renamed_152;
    }

    public sprqyo cfr_renamed_17158(sprqyo arg0, String arg1) {
        sprqyo sprqyo2 = this.cfr_renamed_17149(arg0, arg1);
        if (sprqyo2 == null && arg1.contains("/")) {
            String string = arg1;
            String string2 = string.substring(string.lastIndexOf(47));
            sprqyo2 = this.cfr_renamed_17150(arg0, string2, true);
        }
        if (sprqyo2 == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg1;
            throw new IllegalStateException(sprraia.cfr_renamed_11562(sprwsia.cfr_renamed_9("Q'|(}22 {(vff'`!w22)tf`#~'f/}(a.{62aivoa"), objectArray));
        }
        return sprqyo2;
    }

    public boolean cfr_renamed_11642(String arg0) {
        return this.cfr_renamed_152.cfr_renamed_17134(arg0) != null;
    }
}

