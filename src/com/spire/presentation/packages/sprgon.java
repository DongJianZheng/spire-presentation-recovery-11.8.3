/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprckn;
import com.spire.presentation.packages.sprdrn;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprfpn;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprmpn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprrqn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprumn;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprgon {
    private static /* synthetic */ String cfr_renamed_13142(float[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            sprghha.cfr_renamed_12279(stringBuilder, sprebp.cfr_renamed_13083(arg0[n3]));
            if (n3 < arg0.length - 1) {
                sprghha.cfr_renamed_12279(stringBuilder, " ");
            }
            n2 = ++n;
        }
        if (arg0.length % 2 == 1) {
            sprghha.cfr_renamed_12279(stringBuilder, sprfke.cfr_renamed_9("\u001a{"));
        }
        return stringBuilder.toString();
    }

    private static /* synthetic */ float cfr_renamed_13143(double arg0) {
        return (float)arg0 * 72.0f / 96.0f;
    }

    /*
     * Unable to fully structure code
     */
    @sprtea
    public static boolean cfr_renamed_13144(sprrqn arg0, sprmpn arg1, sprxln arg2, boolean arg3) {
        if (arg3) {
            var5_4 = new sprdrn();
            v0 = var4_5 = var5_4.cfr_renamed_13145(arg2, false);
        } else {
            var5_4 = new sprfpn();
            v0 = var4_5 = var5_4.cfr_renamed_13146(arg2);
        }
        if (sprznp.cfr_renamed_12328(v0)) ** GOTO lbl13
        if (arg2.cfr_renamed_12551() != null && arg2.cfr_renamed_12551() instanceof sprgdp) {
            var4_5 = sprawha.cfr_renamed_9("\u007f.\u0003/\u0002#~2\u001e3\u0012O\u0003/\u0003#~.\u0003/\u0003#h");
            v1 = arg0;
        } else {
            return false;
lbl13:
            // 1 sources

            v1 = arg0;
        }
        v1.cfr_renamed_12423(sprfke.cfr_renamed_9("j*N#"));
        if (arg2.cfr_renamed_12571() != null) {
            v2 = arg0;
            v2.cfr_renamed_12405(sprawha.cfr_renamed_9("aw@lYffk[`YmWpA"), sprckn.cfr_renamed_13147(arg2.cfr_renamed_12571().cfr_renamed_1942()));
            v3 = arg2;
            v2.cfr_renamed_12405(sprfke.cfr_renamed_9("i?H$Q.v\"T.p$S%"), sprckn.cfr_renamed_13148(v3.cfr_renamed_12571().cfr_renamed_12576()));
            if (v3.cfr_renamed_12571().cfr_renamed_12576() == 0 || arg2.cfr_renamed_12571().cfr_renamed_12576() == 3) {
                arg0.cfr_renamed_13085(sprawha.cfr_renamed_9("PFq]hWN[wWq~j_jF"), arg2.cfr_renamed_12571().cfr_renamed_13149());
            }
            arg0.cfr_renamed_12405(sprfke.cfr_renamed_9("i?H$Q.i?[9N\u0007S%_\b[;"), sprckn.cfr_renamed_13150(arg2.cfr_renamed_12571().cfr_renamed_13151()));
            arg0.cfr_renamed_12405(sprawha.cfr_renamed_9("PFq]hWF\\g~j\\fqbB"), sprckn.cfr_renamed_13150(arg2.cfr_renamed_12571().cfr_renamed_13152()));
            if (arg2.cfr_renamed_12571().cfr_renamed_13153() != 0) {
                v4 = arg0;
                arg0.cfr_renamed_13085(sprfke.cfr_renamed_9("i?H$Q.~*I#u-\\8_?"), arg2.cfr_renamed_12571().cfr_renamed_13154());
                v4.cfr_renamed_12405(sprawha.cfr_renamed_9("aw@lYfvbAkqbB"), sprckn.cfr_renamed_13155(arg2.cfr_renamed_12571().cfr_renamed_13156()));
                v4.cfr_renamed_12405(sprfke.cfr_renamed_9("\u0018N9U _\u000f[8R\nH9[2"), sprgon.cfr_renamed_13142(arg2.cfr_renamed_12571().cfr_renamed_13157()));
            }
        }
        if (arg2.cfr_renamed_13094() != null) {
            arg0.cfr_renamed_13089(sprawha.cfr_renamed_9("`f\\gWqfqSmAe]q_"), arg2.cfr_renamed_13094());
        }
        arg0.cfr_renamed_12405(sprfke.cfr_renamed_9("~*N*"), var4_5);
        if (arg2.cfr_renamed_12590() == null) ** GOTO lbl40
        if (arg3) {
            var5_4 = new sprdrn();
            v5 = arg2;
            arg0.cfr_renamed_12405(sprawha.cfr_renamed_9("@^jB"), var5_4.cfr_renamed_13145(arg2.cfr_renamed_12590(), false));
        } else {
            var5_4 = new sprfpn();
            arg0.cfr_renamed_12405(sprfke.cfr_renamed_9("y'S;"), var5_4.cfr_renamed_13146(arg2.cfr_renamed_12590()));
lbl40:
            // 2 sources

            v5 = arg2;
        }
        if (v5.cfr_renamed_12551() != null) {
            sprgon.cfr_renamed_13158(arg0, arg1, arg2.cfr_renamed_12551());
        }
        if (arg2.cfr_renamed_12571() != null) {
            sprgon.cfr_renamed_13159(arg0, arg1, arg2.cfr_renamed_12571());
        }
        return true;
    }

    @sprtea
    public static void cfr_renamed_13160(sprwin arg0) {
        arg0.cfr_renamed_12439();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 3;
        int cfr_ignored_0 = 4 << 3 ^ 4;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    private static /* synthetic */ sprsuja cfr_renamed_13161(sprsuja arg0) {
        return new sprsuja(sprgon.cfr_renamed_13143(arg0.cfr_renamed_1980()), sprgon.cfr_renamed_13143(arg0.spr\u3181()));
    }

    @sprtea
    public static void cfr_renamed_13159(sprrqn arg0, sprmpn arg1, sprtbp arg2) {
        if (arg2.cfr_renamed_12551() != null) {
            sprrqn sprrqn2 = arg0;
            sprrqn2.cfr_renamed_12423(sprawha.cfr_renamed_9("bbFk\u001cPFq]hW"));
            sprumn.cfr_renamed_13162(sprrqn2, arg1, arg2.cfr_renamed_12551());
            sprrqn2.cfr_renamed_12439();
            return;
        }
        sprrqn sprrqn3 = arg0;
        sprrqn sprrqn4 = arg0;
        arg0.cfr_renamed_12423(sprfke.cfr_renamed_9("\u001b[?Rei?H$Q."));
        sprrqn4.cfr_renamed_12423(sprawha.cfr_renamed_9("al^jV@]o]qpqGpZ"));
        sprrqn3.cfr_renamed_12405("Color", sprckn.cfr_renamed_13163(arg2.cfr_renamed_12553()));
        sprrqn4.cfr_renamed_12439();
        sprrqn3.cfr_renamed_12439();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public static void cfr_renamed_13158(sprrqn sprrqn2, sprmpn sprmpn2, sprpln sprpln2) {
        void arg2;
        sprrqn arg0;
        sprrqn sprrqn3 = arg0;
        sprrqn3.cfr_renamed_12423(sprfke.cfr_renamed_9("\u001b[?Re|\"V'"));
        sprumn.cfr_renamed_13162(sprrqn3, sprmpn2, (sprpln)arg2);
        sprrqn3.cfr_renamed_12439();
    }
}

