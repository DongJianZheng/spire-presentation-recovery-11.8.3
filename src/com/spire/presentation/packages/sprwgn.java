/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprinh;
import com.spire.presentation.packages.sprtwe;
import com.spire.presentation.packages.sprwlp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class sprwgn {
    private static final Map cfr_renamed_3 = new HashMap();
    public static Locale cfr_renamed_4 = sprwgn.cfr_renamed_11209();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Date cfr_renamed_11210(Date arg0) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return arg0;
        }
        Map map = cfr_renamed_3;
        synchronized (map) {
            block6: {
                Long l = (Long)cfr_renamed_3.get(locale);
                if (l == null) {
                    l = sprwgn.cfr_renamed_11211(new SimpleDateFormat(sprwlp.cfr_renamed_9("v\rv\rB9k\u0010G<b\u0019|\u0007u")).parse(sprinh.cfr_renamed_9("kxmqjpjpjqjqjq\u001d\f\u000ejjq`qj")).getTime());
                    cfr_renamed_3.put(locale, l);
                }
                if (l == 0L) break block6;
                return new Date(arg0.getTime() - l);
            }
            return arg0;
        }
    }

    private static /* synthetic */ Long cfr_renamed_11211(long arg0) {
        return sprtwe.cfr_renamed_5187(arg0);
    }

    private static /* synthetic */ Locale cfr_renamed_11209() {
        int n;
        if ("en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            return Locale.getDefault();
        }
        Locale[] localeArray = Locale.getAvailableLocales();
        int n2 = n = 0;
        while (n2 != localeArray.length) {
            if ("en".equalsIgnoreCase(localeArray[n].getLanguage())) {
                return localeArray[n];
            }
            n2 = ++n;
        }
        return Locale.getDefault();
    }
}

