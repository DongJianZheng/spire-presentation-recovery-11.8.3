/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktc;
import com.spire.presentation.packages.sprqbd;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

public class sprzzc
extends sprktc {
    public static final String cfr_renamed_4 = "text";

    public sprzzc(String arg0, String arg1, Object[] arg2) throws NullPointerException {
        super(arg0, arg1, arg2);
    }

    public sprzzc(String arg0, String arg1) throws NullPointerException {
        super(arg0, arg1);
    }

    public sprzzc(String arg0, String arg1, String arg2) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2);
    }

    public String cfr_renamed_2520(Locale arg0) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_4, arg0, TimeZone.getDefault());
    }

    public sprzzc(String arg0, String arg1, String arg2, Object[] arg3) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2, arg3);
    }

    public String cfr_renamed_2522(Locale arg0, TimeZone arg1) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_4, arg0, arg1);
    }
}

