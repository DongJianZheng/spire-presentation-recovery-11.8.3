/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqbd;
import com.spire.presentation.packages.sprwbd;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

public class spryvc
extends sprwbd {
    public static final String cfr_renamed_119 = "details";
    public static final String cfr_renamed_91 = "summary";

    public String cfr_renamed_2542(Locale arg0) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_91, arg0, TimeZone.getDefault());
    }

    public spryvc(String arg0, String arg1) throws NullPointerException {
        super(arg0, arg1);
    }

    public String cfr_renamed_2543(Locale arg0, TimeZone arg1) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_91, arg0, arg1);
    }

    public spryvc(String arg0, String arg1, String arg2, Object[] arg3) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2, arg3);
    }

    public spryvc(String arg0, String arg1, String arg2) throws NullPointerException, UnsupportedEncodingException {
        super(arg0, arg1, arg2);
    }

    public spryvc(String arg0, String arg1, Object[] arg2) throws NullPointerException {
        super(arg0, arg1, arg2);
    }

    public String cfr_renamed_2544(Locale arg0) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_119, arg0, TimeZone.getDefault());
    }

    public String cfr_renamed_2545(Locale arg0, TimeZone arg1) throws sprqbd {
        return this.cfr_renamed_2521(cfr_renamed_119, arg0, arg1);
    }
}

