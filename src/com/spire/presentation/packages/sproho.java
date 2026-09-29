/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgho;
import com.spire.presentation.packages.sprgjy;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwjn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sproho {
    private int cfr_renamed_1;
    private StringBuilder cfr_renamed_2;
    private static final int cfr_renamed_3 = 2;
    private boolean cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_16828(int arg0) {
        this.cfr_renamed_1 = arg0;
        if (this.cfr_renamed_1 < 0) {
            this.cfr_renamed_1 = 0;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 5 << 4 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 1);
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

    @sprtea
    public sproho() {
        this(false);
    }

    private /* synthetic */ void cfr_renamed_16829() {
        boolean bl;
        boolean bl2 = bl = this.cfr_renamed_2.length() > 0;
        if (this.cfr_renamed_4) {
            if (bl) {
                sprghha.cfr_renamed_14118(this.cfr_renamed_2);
            }
            this.cfr_renamed_16830();
            return;
        }
        if (bl) {
            this.cfr_renamed_2.append(' ');
        }
    }

    @sprtea
    public sproho(boolean bl) {
        sproho sproho2 = this;
        this.cfr_renamed_2 = new StringBuilder();
        this.cfr_renamed_4 = bl;
    }

    @sprtea
    public void cfr_renamed_16831() {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16832();
        sproho2.cfr_renamed_16829();
        sprghha.cfr_renamed_12279(sproho2.cfr_renamed_2, "}");
    }

    private /* synthetic */ void cfr_renamed_16830() {
        sprghha.cfr_renamed_16833(this.cfr_renamed_2, '\t', this.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_16832() {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16828(sproho2.cfr_renamed_1 - 1);
    }

    @sprtea
    public void cfr_renamed_16834() {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16832();
        sproho2.cfr_renamed_16829();
        sprghha.cfr_renamed_12279(sproho2.cfr_renamed_2, "}");
    }

    @sprtea
    public void cfr_renamed_16835(String arg0, float arg1, float arg2, String arg3) {
        if (!spryxp.cfr_renamed_13682(arg1, arg2)) {
            this.cfr_renamed_16836(arg0, arg1, arg3);
        }
    }

    @sprtea
    public void cfr_renamed_14066(sprqgp arg0) {
        sprqgp sprqgp2;
        double d;
        double d2 = arg0.cfr_renamed_12599();
        if (!spryxp.cfr_renamed_15004(d2)) {
            this.cfr_renamed_16836("left", (float)d2, "pt");
        }
        if (!spryxp.cfr_renamed_15004(d = (double)arg0.cfr_renamed_12600())) {
            this.cfr_renamed_16836("top", (float)d, "pt");
        }
        if (!(sprqgp2 = new sprqgp(arg0.cfr_renamed_12595(), arg0.cfr_renamed_12596(), arg0.cfr_renamed_12597(), arg0.cfr_renamed_12598(), 0.0f, 0.0f)).cfr_renamed_13656()) {
            String string = sprwjn.cfr_renamed_13421(sprqgp2, 2);
            sproho sproho2 = this;
            sproho sproho3 = this;
            this.cfr_renamed_16837(sprgho.cfr_renamed_9("9\u001eq\u000b\u007f\u0000`D`\u001bu\u0007g\u000f{\u001by"), string);
            sproho3.cfr_renamed_16837(sprgjy.cfr_renamed_9("hw*`hn7{+i#u7w"), string);
            sproho3.cfr_renamed_16837(sprgho.cfr_renamed_9("9\u0004gD`\u001bu\u0007g\u000f{\u001by"), string);
            sproho2.cfr_renamed_16837(sprgjy.cfr_renamed_9("huhn7{+i#u7w"), string);
            sproho2.cfr_renamed_16837("transform", string);
        }
    }

    @sprtea
    public void cfr_renamed_16838(sprgeja arg0) {
        String string = sprwjn.cfr_renamed_13428(arg0, 2);
        this.cfr_renamed_16837("clip", string);
    }

    private /* synthetic */ void cfr_renamed_16839() {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16828(sproho2.cfr_renamed_1 + 1);
    }

    @sprtea
    public void cfr_renamed_16840(String arg0, String arg1) {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16829();
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = (!sprraia.cfr_renamed_11730(arg1, "") ? " " : "") + arg1;
        sprghha.cfr_renamed_12289(sproho2.cfr_renamed_2, sprgho.cfr_renamed_9("T\u0004q\r}\b4\u0012$\u0014oXi"), objectArray);
        sprghha.cfr_renamed_12279(this.cfr_renamed_2, sprgjy.cfr_renamed_9("ea"));
        this.cfr_renamed_16839();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_15106(sprphja sprphja2) {
        void arg0;
        sproho sproho2 = this;
        sproho2.cfr_renamed_16836("width", arg0.cfr_renamed_1942(), "pt");
        sproho2.cfr_renamed_16836("height", arg0.cfr_renamed_1452(), "pt");
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16841(sprsuja sprsuja2) {
        void arg0;
        sproho sproho2 = this;
        sproho2.cfr_renamed_16836("left", arg0.cfr_renamed_1980(), "pt");
        sproho2.cfr_renamed_16836("top", arg0.spr\u3181(), "pt");
    }

    @sprtea
    public void cfr_renamed_16842(String arg0) {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16829();
        sprghha.cfr_renamed_12279(sproho2.cfr_renamed_2, arg0);
        sprghha.cfr_renamed_12279(this.cfr_renamed_2, sprgho.cfr_renamed_9("Io"));
        this.cfr_renamed_16839();
    }

    private static /* synthetic */ String cfr_renamed_16843(int arg0, String arg1) {
        Object[] objectArray = new Object[2];
        objectArray[0] = sprebp.cfr_renamed_14063(arg0);
        objectArray[1] = arg1;
        return sprraia.cfr_renamed_11562(sprgjy.cfr_renamed_9(">*8atg"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16844(sprphja sprphja2) {
        void arg0;
        sproho sproho2 = this;
        sproho2.cfr_renamed_16845("width", sprnmp.cfr_renamed_13494(arg0.cfr_renamed_1942()), sprgho.cfr_renamed_9("\u0019l"));
        sproho2.cfr_renamed_16845("height", sprnmp.cfr_renamed_13494(arg0.cfr_renamed_1452()), sprgjy.cfr_renamed_9("5b"));
    }

    @sprtea
    public void cfr_renamed_16837(String arg0, String arg1) {
        sproho sproho2 = this;
        sproho2.cfr_renamed_16829();
        sprghha.cfr_renamed_12279(sproho2.cfr_renamed_2, arg0);
        this.cfr_renamed_2.append(':');
        sprghha.cfr_renamed_12279(this.cfr_renamed_2, arg1);
        this.cfr_renamed_2.append(';');
    }

    @sprtea
    public String cfr_renamed_16846(double arg0, String arg1) {
        Object[] objectArray = new Object[2];
        objectArray[0] = sprebp.cfr_renamed_13424(arg0, 2);
        objectArray[1] = arg1;
        return sprraia.cfr_renamed_11562(sprgho.cfr_renamed_9("\u0012$\u0014oXi"), objectArray);
    }

    @sprtea
    public void cfr_renamed_16847(String arg0, String arg1, String arg2) {
        if (!sprraia.cfr_renamed_11730(arg1, arg2)) {
            this.cfr_renamed_16837(arg0, arg1);
        }
    }

    public String toString() {
        return this.cfr_renamed_2.toString();
    }

    @sprtea
    public void cfr_renamed_16845(String arg0, int arg1, String arg2) {
        this.cfr_renamed_16837(arg0, sproho.cfr_renamed_16843(arg1, arg2));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16836(String string, float f, String string2) {
        void arg2;
        void arg1;
        sproho sproho2 = this;
        sproho2.cfr_renamed_16837(string, sproho2.cfr_renamed_16846((double)arg1, (String)arg2));
    }
}

