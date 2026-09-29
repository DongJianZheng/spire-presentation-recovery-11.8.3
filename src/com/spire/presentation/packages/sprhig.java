/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlya;
import com.spire.presentation.packages.sprquo;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;

public class sprhig
extends RuntimeException {
    public final ClassLoader cfr_renamed_0;
    public final String cfr_renamed_1;
    public final Locale cfr_renamed_2;
    private String cfr_renamed_3;
    public final String cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 1 << 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    public Locale cfr_renamed_2525() {
        return this.cfr_renamed_2;
    }

    public String cfr_renamed_1521() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_2526() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = sprlya.cfr_renamed_9("wgZ&Zi@&RoZb\u0014cZrF\u007f\u0014") + this.cfr_renamed_1 + sprquo.cfr_renamed_9("\u0004FJ\u000fVJW@Q]GJ\u0004IMCA\u000f") + this.cfr_renamed_4 + sprlya.cfr_renamed_9("&RiF&@nQ&XiWgXc\u0014") + this.cfr_renamed_2 + ".";
            if (this.cfr_renamed_0 instanceof URLClassLoader) {
                int n;
                URL[] uRLArray = ((URLClassLoader)this.cfr_renamed_0).getURLs();
                this.cfr_renamed_3 = this.cfr_renamed_3 + sprquo.cfr_renamed_9("\u000fpGA\u000fB@HCKXMAC\u000fAAP]MJW\u000fMA\u0004[LJ\u0004LHNW\\TNPG\u0004XA]A\u000fWJE]GGAK\u001e\u000f");
                int n2 = n = 0;
                while (n2 != uRLArray.length) {
                    StringBuilder stringBuilder = new StringBuilder().append(this.cfr_renamed_3).append(uRLArray[n]);
                    this.cfr_renamed_3 = stringBuilder.append(" ").toString();
                    n2 = ++n;
                }
            }
        }
        return this.cfr_renamed_3;
    }

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprhig(String string, Throwable throwable, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhig sprhig2 = this;
        sprhig sprhig3 = this;
        super((String)arg0, (Throwable)arg1);
        sprhig3.cfr_renamed_4 = arg2;
        sprhig3.cfr_renamed_1 = arg3;
        sprhig2.cfr_renamed_2 = arg4;
        sprhig2.cfr_renamed_0 = classLoader;
    }

    /*
     * WARNING - void declaration
     */
    public sprhig(String string, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhig sprhig2 = this;
        sprhig sprhig3 = this;
        super((String)arg0);
        sprhig3.cfr_renamed_4 = arg1;
        sprhig3.cfr_renamed_1 = arg2;
        sprhig2.cfr_renamed_2 = arg3;
        sprhig2.cfr_renamed_0 = classLoader;
    }

    public String cfr_renamed_2524() {
        return this.cfr_renamed_4;
    }
}

