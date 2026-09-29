/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sproog;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

public class sprxlg
extends sproog {
    public static final String cfr_renamed_112 = "details";
    public static final String cfr_renamed_119 = "summary";

    public String cfr_renamed_2543(Locale arg0, TimeZone arg1) throws sprhig {
        return this.cfr_renamed_2521(cfr_renamed_119, arg0, arg1);
    }

    public sprxlg(String arg0, String arg1, String arg2) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2);
    }

    public sprxlg(String arg0, String arg1, String arg2, Object[] arg3) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2, arg3);
    }

    public String cfr_renamed_2545(Locale arg0, TimeZone arg1) throws sprhig {
        return this.cfr_renamed_2521(cfr_renamed_112, arg0, arg1);
    }

    public sprxlg(String arg0, String arg1, Object[] arg2) throws NullPointerException {
        super(arg0, arg1, arg2);
    }

    public sprxlg(String arg0, String arg1) throws NullPointerException {
        super(arg0, arg1);
    }

    public String cfr_renamed_2542(Locale arg0) throws sprhig {
        return this.cfr_renamed_2521(cfr_renamed_119, arg0, TimeZone.getDefault());
    }

    public String cfr_renamed_2544(Locale arg0) throws sprhig {
        return this.cfr_renamed_2521(cfr_renamed_112, arg0, TimeZone.getDefault());
    }
}

