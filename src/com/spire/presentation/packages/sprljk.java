/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprqgo;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;

public class sprljk
extends RuntimeException {
    public final ClassLoader cfr_renamed_0;
    public final String cfr_renamed_1;
    public final String cfr_renamed_2;
    public final Locale cfr_renamed_3;
    private String cfr_renamed_4;

    public String cfr_renamed_2524() {
        return this.cfr_renamed_1;
    }

    public Locale cfr_renamed_2525() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprljk(String string, Throwable throwable, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprljk sprljk2 = this;
        sprljk sprljk3 = this;
        super((String)arg0, (Throwable)arg1);
        sprljk3.cfr_renamed_1 = arg2;
        sprljk3.cfr_renamed_2 = arg3;
        sprljk2.cfr_renamed_3 = arg4;
        sprljk2.cfr_renamed_0 = classLoader;
    }

    public String cfr_renamed_1521() {
        return this.cfr_renamed_2;
    }

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprljk(String string, String string2, String string3, Locale locale, ClassLoader classLoader) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprljk sprljk2 = this;
        sprljk sprljk3 = this;
        super((String)arg0);
        sprljk3.cfr_renamed_1 = arg1;
        sprljk3.cfr_renamed_2 = arg2;
        sprljk2.cfr_renamed_3 = arg3;
        sprljk2.cfr_renamed_0 = classLoader;
    }

    public String cfr_renamed_2526() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprfvca.cfr_renamed_9("n3CrC=YrK;C6\r7C&_+\r") + this.cfr_renamed_2 + sprqgo.cfr_renamed_9("8\u000bvBj\u0007k\rm\u0010{\u00078\u0004q\u000e}B") + this.cfr_renamed_1 + sprfvca.cfr_renamed_9("rK=_rY:HrA=N3A7\r") + this.cfr_renamed_3 + ".";
            if (this.cfr_renamed_0 instanceof URLClassLoader) {
                int n;
                URL[] uRLArray = ((URLClassLoader)this.cfr_renamed_0).getURLs();
                this.cfr_renamed_4 = this.cfr_renamed_4 + sprqgo.cfr_renamed_9("BL\n}B~\rt\u000ew\u0015q\f\u007fB}\fl\u0010q\u0007kBq\f8\u0016p\u00078\u0001t\u0003k\u0011h\u0003l\n8\u0015}\u0010}Bk\u0007y\u0010{\n}\u0006\"B");
                int n2 = n = 0;
                while (n2 != uRLArray.length) {
                    StringBuilder stringBuilder = new StringBuilder().append(this.cfr_renamed_4).append(uRLArray[n]);
                    this.cfr_renamed_4 = stringBuilder.append(" ").toString();
                    n2 = ++n;
                }
            }
        }
        return this.cfr_renamed_4;
    }
}

