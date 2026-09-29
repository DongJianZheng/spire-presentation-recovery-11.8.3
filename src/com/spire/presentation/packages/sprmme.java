/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sproue;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.spruqe;
import com.spire.presentation.packages.spruym;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzhn;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprmme
extends sprkra
implements sprkj {
    public sprvva cfr_renamed_4;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Date cfr_renamed_110() {
        try {
            if (!(this.cfr_renamed_4 instanceof sprgpe)) return ((sprrpe)this.cfr_renamed_4).cfr_renamed_110();
            return ((sprgpe)this.cfr_renamed_4).cfr_renamed_4475();
        }
        catch (ParseException parseException) {
            throw new IllegalStateException(new StringBuilder().insert(0, spruym.cfr_renamed_9("\u001fA\u0000N\u001aF\u0012\u000f\u0012N\u0002JV\\\u0002]\u001fA\u0011\u0015V")).append(parseException.getMessage()).toString());
        }
    }

    public sprmme(Date arg0, Locale arg1) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprzhn.cfr_renamed_9("\u001f"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(spruym.cfr_renamed_9("V\u000fV\u000fb;K\u0012g>B\u001b\\\u0005"), arg1);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprzhn.cfr_renamed_9("\u001f")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new spruqe(string);
            return;
        }
        this.cfr_renamed_4 = new sproue(string.substring(2));
    }

    public String cfr_renamed_2147() {
        if (this.cfr_renamed_4 instanceof sprgpe) {
            return ((sprgpe)this.cfr_renamed_4).cfr_renamed_4476();
        }
        return ((sprrpe)this.cfr_renamed_4).cfr_renamed_2147();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprmme(Date arg0) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, spruym.cfr_renamed_9(","));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprzhn.cfr_renamed_9("\u000b<\u000b<?\b\u0016!:\r\u001f(\u00016"));
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(spruym.cfr_renamed_9(",")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new spruqe(string);
            return;
        }
        this.cfr_renamed_4 = new sproue(string.substring(2));
    }

    public static sprmme cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprmme) {
            return (sprmme)arg0;
        }
        if (arg0 instanceof sprgpe) {
            return new sprmme((sprgpe)arg0);
        }
        if (arg0 instanceof sprrpe) {
            return new sprmme((sprrpe)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzhn.cfr_renamed_9("0\u001c.\u001c*\u0005+R*\u0010/\u0017&\u0006e\u001b+R#\u0013&\u0006*\u0000<He")).append(arg0.getClass().getName()).toString());
    }

    public static sprmme cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprmme.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    /*
     * WARNING - void declaration
     */
    public sprmme(sprvva sprvva2) {
        void arg0;
        if (!(sprvva2 instanceof sprgpe) && !(arg0 instanceof sprrpe)) {
            throw new IllegalArgumentException(spruym.cfr_renamed_9("\u0003A\u001dA\u0019X\u0018\u000f\u0019M\u001cJ\u0015[V_\u0017\\\u0005J\u0012\u000f\u0002@V{\u001fB\u0013"));
        }
        this.cfr_renamed_4 = arg0;
    }
}

