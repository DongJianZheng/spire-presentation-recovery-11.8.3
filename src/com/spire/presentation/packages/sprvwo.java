/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbv;
import com.spire.presentation.packages.sprcxo;
import com.spire.presentation.packages.spreap;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfuo;
import com.spire.presentation.packages.sprfxo;
import com.spire.presentation.packages.sprhqo;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprjap;
import com.spire.presentation.packages.sprjt;
import com.spire.presentation.packages.sprkap;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprppo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrqo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxap;
import com.spire.presentation.packages.sprzeo;
import java.util.Iterator;

@sprtea
public class sprvwo {
    private sprjap cfr_renamed_112;
    private static final char cfr_renamed_119 = '`';
    private String cfr_renamed_91;
    private char cfr_renamed_0;
    private char[] cfr_renamed_1;
    private static final char cfr_renamed_2 = '|';
    private static final char cfr_renamed_3 = '\\';
    private String cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    @sprtea
    public String cfr_renamed_17345(sprcxo arg0) {
        var2_2 = "";
        var3_3 = "";
        for (sprjt var5_5 : arg0.cfr_renamed_17346()) {
            block19: {
                if (var5_5 instanceof sprhqo) {
                    var6_6 = spresca.cfr_renamed_11777(var5_5, sprhqo.class);
                    if (var6_6.cfr_renamed_17332().size() == 0) {
                        var3_3 = new StringBuilder().insert(0, var3_3).append(this.cfr_renamed_4).toString();
                        v0 = var6_6;
                    } else {
                        if (!sprraia.cfr_renamed_12280(var3_3)) {
                            var3_3 = sprraia.cfr_renamed_11961(var3_3, this.cfr_renamed_4 + this.cfr_renamed_4);
                        }
                        v0 = var6_6;
                    }
                    if (v0.cfr_renamed_17335() != null) {
                        var3_3 = sprraia.cfr_renamed_11961(var3_3, var6_6.cfr_renamed_17335().cfr_renamed_17347());
                    }
                    v1 = var6_6;
                    var2_2 = v1.cfr_renamed_17343((sprhqo)v1, var2_2);
                    var3_3 = sprraia.cfr_renamed_11961(var3_3, var2_2);
                    var2_2 = "";
                    if (v1.cfr_renamed_17333() != null) {
                        if (var6_6.cfr_renamed_17333().cfr_renamed_17313()) {
                            var2_2 = var6_6.cfr_renamed_17333().cfr_renamed_17314();
                            v2 = var3_3;
                        } else {
                            var2_2 = var6_6.cfr_renamed_17333().cfr_renamed_17315();
                            v2 = var3_3;
                        }
                        var3_3 = sprraia.cfr_renamed_11961(v2, var2_2);
                        var2_2 = "";
                    }
                    var2_2 = this.cfr_renamed_17348(var6_6.cfr_renamed_17332(), var2_2);
                    var3_3 = sprraia.cfr_renamed_11961(var3_3, var2_2);
                    var2_2 = "";
                    v3 = var7_7 = arg0.cfr_renamed_17346().indexOf(var6_6) + 1 < arg0.cfr_renamed_17346().size() ? arg0.cfr_renamed_17346().cfr_renamed_12151(arg0.cfr_renamed_17346().indexOf(var6_6) + 1) : null;
                    if (var7_7 instanceof sprppo && var6_6.cfr_renamed_17335() != null) {
                        var3_3 = sprraia.cfr_renamed_11961(var3_3, this.cfr_renamed_4);
                    }
                }
                if (var5_5 instanceof sprppo) {
                    var6_6 = spresca.cfr_renamed_11777(var5_5, sprppo.class);
                    if (sprraia.cfr_renamed_11730(var3_3, "")) {
                        v4 = new StringBuilder();
                        v5 = v4.insert(0, var3_3).append('|').toString();
                    } else {
                        v4 = new StringBuilder();
                        v5 = v4.insert(0, var3_3).append(this.cfr_renamed_4).append('|').toString();
                    }
                    var3_3 = v5;
                    var2_2 = this.cfr_renamed_17349((sprppo)var6_6, var2_2, var3_3);
                    var3_3 = sprraia.cfr_renamed_11961(var3_3, new StringBuilder().insert(0, var2_2).append(this.cfr_renamed_4).toString());
                    var2_2 = "";
                }
                if (!(var5_5 instanceof sprkap)) break block19;
                var6_6 = new sprkap();
                if (var3_3.endsWith(new StringBuilder().insert(0, this.cfr_renamed_4).append(this.cfr_renamed_4).toString())) ** GOTO lbl56
                v6 = var3_3;
                if (var3_3.endsWith(this.cfr_renamed_4)) {
                    v7 = var3_3 = sprraia.cfr_renamed_11961(v6, this.cfr_renamed_4);
                } else {
                    var3_3 = sprraia.cfr_renamed_11961(v6, new StringBuilder().insert(0, this.cfr_renamed_4).append(this.cfr_renamed_4).toString());
lbl56:
                    // 2 sources

                    v7 = var3_3;
                }
                var3_3 = sprraia.cfr_renamed_11961(v7, var6_6.cfr_renamed_17298());
            }
            if (!(var5_5 instanceof sprjap)) continue;
            this.cfr_renamed_112 = spresca.cfr_renamed_11777(var5_5, sprjap.class);
            if (this.cfr_renamed_112.cfr_renamed_17102().size() <= 0) continue;
            if (!sprraia.cfr_renamed_11730(var3_3, "")) {
                var3_3 = sprraia.cfr_renamed_11961(var3_3, this.cfr_renamed_4);
            }
            if (this.cfr_renamed_112.cfr_renamed_17350()) {
                for (String var7_7 : this.cfr_renamed_112.cfr_renamed_17102()) {
                    if (sprraia.cfr_renamed_11730(var7_7, "")) continue;
                    var2_2 = sprraia.cfr_renamed_11961(var2_2, new StringBuilder().insert(0, var7_7).append(this.cfr_renamed_4).toString());
                }
                var2_2 = new StringBuilder().insert(0, "```").append(this.cfr_renamed_4).append(var2_2).append("```").toString();
                var3_3 = sprraia.cfr_renamed_11961(var3_3, var2_2);
                var2_2 = "";
                continue;
            }
            var2_2 = sprraia.cfr_renamed_11961(var2_2, this.cfr_renamed_4);
            for (String var7_7 : this.cfr_renamed_112.cfr_renamed_17102()) {
                if (sprraia.cfr_renamed_11730(var7_7, "")) continue;
                var2_2 = sprraia.cfr_renamed_11961(var2_2, new StringBuilder().insert(0, "    ").append(var7_7).append(this.cfr_renamed_4).toString());
            }
            var3_3 = sprraia.cfr_renamed_11961(var3_3, var2_2);
            var2_2 = "";
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17351(String[] stringArray, String[] stringArray2, String[] stringArray3, sprxap sprxap2) {
        void arg1;
        void arg3;
        void arg0;
        char c;
        void arg2;
        void v0 = arg2;
        char c2 = v0[0].charAt(0);
        char c3 = v0[0].charAt(arg2[0].length() - 1);
        char c4 = c = !sprraia.cfr_renamed_11730(stringArray[0], "") ? arg0[0].charAt(arg0[0].length() - 1) : (char)'\u0000';
        if (this.cfr_renamed_91.contains(Character.toString(c2)) && !sprraia.cfr_renamed_11730((String)arg0[0], "") && c != ' ' && c != '\t' && !this.cfr_renamed_91.contains(Character.toString(c))) {
            void v2 = arg0;
            v2[0] = sprraia.cfr_renamed_11961((String)v2[0], " ");
        }
        void v3 = arg2;
        while (!(sprraia.cfr_renamed_11730((String)v3[0], "") || arg2[0].charAt(0) != ' ' && arg2[0].charAt(0) != '\t')) {
            arg0[0] = sprraia.cfr_renamed_17352((String)arg0[0], arg2[0].charAt(0));
            void v4 = arg2;
            v3 = v4;
            v4[0] = sprraia.cfr_renamed_12269((String)v4[0], 0, 1);
        }
        if (this.cfr_renamed_91.contains(Character.toString(c3)) && arg3 != null && !sprraia.cfr_renamed_11730(arg3.cfr_renamed_13030(), "") && !arg3.cfr_renamed_17301() && arg3.cfr_renamed_13030().charAt(0) != ' ' && arg3.cfr_renamed_13030().charAt(0) != '\t' && !this.cfr_renamed_91.contains(Character.toString(arg3.cfr_renamed_13030().charAt(0)))) {
            void v5 = arg1;
            v5[0] = sprraia.cfr_renamed_11961((String)v5[0], " ");
        }
        void v6 = arg2;
        while (!(sprraia.cfr_renamed_11730((String)v6[0], "") || arg2[0].charAt(arg2[0].length() - 1) != ' ' && arg2[0].charAt(arg2[0].length() - 1) != '\t')) {
            arg1[0] = sprraia.cfr_renamed_17352((String)arg1[0], arg2[0].charAt(arg2[0].length() - 1));
            void v7 = arg2;
            v6 = v7;
            v7[0] = sprraia.cfr_renamed_12269((String)v7[0], arg2[0].length() - 1, 1);
        }
        String string = "";
        void v8 = arg2;
        while (sprraia.cfr_renamed_17353((String)v8[0], this.cfr_renamed_1) != -1) {
            void v9 = arg2;
            v8 = v9;
            int n = sprraia.cfr_renamed_17353((String)v9[0], this.cfr_renamed_1);
            String string2 = string;
            string = sprraia.cfr_renamed_11961(string, arg2[0].substring(0, 0 + n) + "\\" + arg2[0].charAt(n));
            v9[0] = sprraia.cfr_renamed_12269((String)arg2[0], 0, n + 1);
        }
        arg2[0] = new StringBuilder().insert(0, string).append((String)arg2[0]).toString();
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ String cfr_renamed_17348(sprvrx<sprbv> arg0, String arg1) {
        var3_3 = arg1;
        arg1 = "";
        v0 = var4_4 = 0;
        while (v0 < arg0.size()) {
            block19: {
                block18: {
                    var5_5 = arg0.cfr_renamed_12151(var4_4);
                    if (!(var5_5 instanceof sprxap)) break block18;
                    var6_6 = spresca.cfr_renamed_11777(var5_5, sprxap.class);
                    arg1 = var6_6.cfr_renamed_13030();
                    var7_7 = "";
                    if (sprraia.cfr_renamed_11730(arg1, "") || sprign.cfr_renamed_9("@").equals(arg1)) ** GOTO lbl-1000
                    v1 = var8_8 = var4_4 + 1 < arg0.size() && arg0.cfr_renamed_12151(var4_4 + 1) instanceof sprxap != false ? spresca.cfr_renamed_11777(arg0.cfr_renamed_12151(var4_4 + 1), sprxap.class) : null;
                    if (!sprraia.cfr_renamed_12280(var6_6.cfr_renamed_13030())) {
                        v2 = new String[1];
                        v2[0] = var3_3;
                        var9_9 = v2;
                        v3 = new String[1];
                        v3[0] = var7_7;
                        var10_10 = v3;
                        v4 = new String[1];
                        v4[0] = arg1;
                        var11_11 = v4;
                        this.cfr_renamed_17351(var9_9, var10_10, var11_11, var8_8);
                        var3_3 = var9_9[0];
                        var7_7 = var10_10[0];
                        arg1 = var11_11[0];
                    }
                    if (var6_6.cfr_renamed_17302().cfr_renamed_17309()) {
                        arg1 = '`' + arg1 + '`';
                    }
                    if (var6_6.cfr_renamed_17302().cfr_renamed_15533()) {
                        arg1 = new StringBuilder().insert(0, "**").append(arg1).append("**").toString();
                    }
                    if (var6_6.cfr_renamed_17302().cfr_renamed_15526()) {
                        arg1 = new StringBuilder().insert(0, "*").append(arg1).append("*").toString();
                    }
                    if (var6_6.cfr_renamed_17302().cfr_renamed_17307()) {
                        arg1 = new StringBuilder().insert(0, "~~").append(arg1).append("~~").toString();
                    }
                    if (var6_6.cfr_renamed_17302().cfr_renamed_17310()) {
                        arg1 = new StringBuilder().insert(0, "<!--").append(arg1).append("-->").toString();
                    }
                    if (var6_6.cfr_renamed_17301()) {
                        arg1 = new StringBuilder().insert(0, Character.toString(this.cfr_renamed_0)).append('\\').append(this.cfr_renamed_4).toString();
                    }
                    switch (var6_6.cfr_renamed_17302().cfr_renamed_17312()) {
                        case 1: {
                            arg1 = new StringBuilder().insert(0, "<sup>").append(arg1).append("</sup>").toString();
                            v5 = var3_3;
                            break;
                        }
                        case 2: {
                            arg1 = new StringBuilder().insert(0, "<sub>").append(arg1).append("</sub>").toString();
                        }
                        default: lbl-1000:
                        // 2 sources

                        {
                            v5 = var3_3;
                        }
                    }
                    var3_3 = sprraia.cfr_renamed_11961(v5, new StringBuilder().insert(0, arg1).append(var7_7).toString());
                    arg1 = "";
                    break block19;
                }
                v6 = var5_5;
                if (var5_5 instanceof sprfxo) {
                    var6_6 = spresca.cfr_renamed_11777(v6, sprfxo.class);
                    arg1 = new StringBuilder().insert(0, "[").append(var6_6.cfr_renamed_17354()).append("]").append("(").append(var6_6.cfr_renamed_8433()).append(")").toString();
                    var3_3 = sprraia.cfr_renamed_11961(var3_3, arg1);
                    arg1 = "";
                } else if (v6 instanceof sprfuo) {
                    var6_6 = spresca.cfr_renamed_11777(var5_5, sprfuo.class);
                    arg1 = new StringBuilder().insert(0, sprzeo.cfr_renamed_9(")1")).append(var6_6.cfr_renamed_13930() != null ? var6_6.cfr_renamed_13930() : sprign.cfr_renamed_9("\u0019M*P<V,")).append("]").toString();
                    if (!sprraia.cfr_renamed_12280(var6_6.cfr_renamed_8433())) {
                        arg1 = sprraia.cfr_renamed_11961(arg1, "(" + var6_6.cfr_renamed_8433() + ")");
                        v7 = var3_3;
                    } else {
                        var7_7 = sprpkja.cfr_renamed_510(var6_6.cfr_renamed_12510());
                        arg1 = sprraia.cfr_renamed_11961(arg1, new StringBuilder().insert(0, sprzeo.cfr_renamed_9(" \u000ei\u001eiPa\u0007i\rmE")).append(sprraia.cfr_renamed_12280(var6_6.cfr_renamed_12767()) == false ? var6_6.cfr_renamed_12767() : "png").append(sprign.cfr_renamed_9("\u001f+E:A\u007f\u0010e")).append(var7_7).append(")").toString());
                        v7 = var3_3;
                    }
                    var3_3 = sprraia.cfr_renamed_11961(v7, arg1);
                    arg1 = "";
                }
            }
            v0 = ++var4_4;
        }
        v8 = var3_3;
        while (!sprraia.cfr_renamed_11730(v8, "") && var3_3.charAt(0) == '\t') {
            v8 = sprraia.cfr_renamed_12269(var3_3, 0, 1);
        }
        return var3_3;
    }

    private /* synthetic */ String cfr_renamed_17349(sprppo arg0, String arg1, String arg2) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_6328().size()) {
            sprrqo sprrqo2;
            spreap spreap2 = arg0.cfr_renamed_6328().cfr_renamed_12151(n);
            if (n == 0) {
                int n3;
                Iterator iterator = spreap2.cfr_renamed_17321().iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    sprrqo2 = (sprrqo)iterator2.next();
                    String string2 = arg1;
                    arg1 = sprraia.cfr_renamed_11961(string2, this.cfr_renamed_17348(sprrqo2.cfr_renamed_13978(), string2));
                    string = sprraia.cfr_renamed_11961(string, arg1 + '|');
                    arg1 = "";
                    iterator = iterator2;
                }
                string = sprraia.cfr_renamed_11961(string, this.cfr_renamed_4);
                arg1 = "";
                int n4 = n3 = 0;
                while (n4 < arg0.cfr_renamed_17323().cfr_renamed_11861()) {
                    if (arg0.cfr_renamed_17323().cfr_renamed_576(n3) == 0) {
                        arg1 = sprraia.cfr_renamed_11961(arg1, sprzeo.cfr_renamed_9("\u00162G%G"));
                    }
                    if (arg0.cfr_renamed_17323().cfr_renamed_576(n3) == 2) {
                        arg1 = sprraia.cfr_renamed_11961(arg1, sprign.cfr_renamed_9("Xs\td\ts"));
                    }
                    if (arg0.cfr_renamed_17323().cfr_renamed_576(n3) == 1) {
                        arg1 = sprraia.cfr_renamed_11961(arg1, sprzeo.cfr_renamed_9("\u0016%G%P"));
                    }
                    n4 = ++n3;
                }
                string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, arg1).append('|').toString());
                arg1 = "";
            } else {
                string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, this.cfr_renamed_4).append('|').toString());
                arg1 = "";
                Iterator iterator = spreap2.cfr_renamed_17321().iterator();
                while (iterator.hasNext()) {
                    Iterator iterator3;
                    sprrqo2 = (sprrqo)iterator3.next();
                    String string3 = arg1;
                    arg1 = sprraia.cfr_renamed_11961(string3, this.cfr_renamed_17348(sprrqo2.cfr_renamed_13978(), string3));
                    string = sprraia.cfr_renamed_11961(string, new StringBuilder().insert(0, arg1).append('|').toString());
                    arg1 = "";
                    iterator = iterator3;
                }
            }
            n2 = ++n;
        }
        return string;
    }

    public sprvwo() {
        sprvwo sprvwo2 = this;
        sprvwo sprvwo3 = this;
        sprvwo3.cfr_renamed_91 = "`~!@#$%^&*()_-+=|\\}{][:<>?';./,\"";
        char[] cArray = new char[12];
        cArray[0] = 35;
        cArray[1] = 45;
        cArray[2] = 42;
        cArray[3] = 96;
        cArray[4] = 126;
        cArray[5] = 61;
        cArray[6] = 43;
        cArray[7] = 62;
        cArray[8] = 60;
        cArray[9] = 38;
        cArray[10] = 91;
        cArray[11] = 92;
        sprvwo3.cfr_renamed_1 = cArray;
        sprvwo2.cfr_renamed_4 = "\r\n";
        sprvwo2.cfr_renamed_0 = (char)32;
    }
}

