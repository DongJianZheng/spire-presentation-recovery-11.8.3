/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.spruqr;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;

public class sprqbd
extends RuntimeException {
    public final String cfr_renamed_0;
    public final Locale cfr_renamed_1;
    private String cfr_renamed_2;
    public final String cfr_renamed_3;
    public final ClassLoader cfr_renamed_4;

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_2524() {
        return this.cfr_renamed_0;
    }

    public Locale cfr_renamed_2525() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_1521() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqbd(String string, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqbd sprqbd2 = this;
        sprqbd sprqbd3 = this;
        super((String)arg0);
        sprqbd3.cfr_renamed_0 = arg1;
        sprqbd3.cfr_renamed_3 = arg2;
        sprqbd2.cfr_renamed_1 = arg3;
        sprqbd2.cfr_renamed_4 = classLoader;
    }

    public String cfr_renamed_2526() {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = sprctl.cfr_renamed_9("\u0014o9.9a#.1g9jwk9z%ww") + this.cfr_renamed_3 + spruqr.cfr_renamed_9("*\u0018dQx\u0014y\u001e\u007f\u0003i\u0014*\u0017c\u001doQ") + this.cfr_renamed_0 + sprctl.cfr_renamed_9(".1a%.#f2.;a4o;kw") + this.cfr_renamed_1 + ".";
            if (this.cfr_renamed_4 instanceof URLClassLoader) {
                int n;
                URL[] uRLArray = ((URLClassLoader)this.cfr_renamed_4).getURLs();
                this.cfr_renamed_2 = this.cfr_renamed_2 + spruqr.cfr_renamed_9("Q^\u0019oQl\u001ef\u001de\u0006c\u001fmQo\u001f~\u0003c\u0014yQc\u001f*\u0005b\u0014*\u0012f\u0010y\u0002z\u0010~\u0019*\u0006o\u0003oQy\u0014k\u0003i\u0019o\u00150Q");
                int n2 = n = 0;
                while (n2 != uRLArray.length) {
                    StringBuilder stringBuilder = new StringBuilder().append(this.cfr_renamed_2).append(uRLArray[n]);
                    this.cfr_renamed_2 = stringBuilder.append(" ").toString();
                    n2 = ++n;
                }
            }
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqbd(String string, Throwable throwable, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqbd sprqbd2 = this;
        sprqbd sprqbd3 = this;
        super((String)arg0, (Throwable)arg1);
        sprqbd3.cfr_renamed_0 = arg2;
        sprqbd3.cfr_renamed_3 = arg3;
        sprqbd2.cfr_renamed_1 = arg4;
        sprqbd2.cfr_renamed_4 = classLoader;
    }
}

