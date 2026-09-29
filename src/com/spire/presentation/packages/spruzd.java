/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprexl;
import com.spire.presentation.packages.sprgpe;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sproue;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.spruqe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywc;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class spruzd
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
            throw new IllegalStateException(new StringBuilder().insert(0, sprywc.cfr_renamed_9("\u001fz\u0000u\u001a}\u00124\u0012u\u0002qVg\u0002f\u001fz\u0011.V")).append(parseException.getMessage()).toString());
        }
    }

    public static spruzd cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruzd) {
            return (spruzd)arg0;
        }
        if (arg0 instanceof sprgpe) {
            return new spruzd((sprgpe)arg0);
        }
        if (arg0 instanceof sprrpe) {
            return new spruzd((sprrpe)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprexl.cfr_renamed_9("[|E|Ae@2ApDwMf\u000e{@2HsMfA`W(\u000e")).append(arg0.getClass().getName()).toString());
    }

    public String cfr_renamed_2147() {
        if (this.cfr_renamed_4 instanceof sprgpe) {
            return ((sprgpe)this.cfr_renamed_4).cfr_renamed_4476();
        }
        return ((sprrpe)this.cfr_renamed_4).cfr_renamed_2147();
    }

    public spruzd(Date arg0) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprywc.cfr_renamed_9(","));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprexl.cfr_renamed_9("kWkW_cvJZf\u007fCa]"));
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprywc.cfr_renamed_9(",")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new spruqe(string);
            return;
        }
        this.cfr_renamed_4 = new sproue(string.substring(2));
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public spruzd(Date arg0, Locale arg1) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprexl.cfr_renamed_9("t"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprywc.cfr_renamed_9("m\u000fm\u000fY;p\u0012\\>y\u001bg\u0005"), arg1);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprexl.cfr_renamed_9("t")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new spruqe(string);
            return;
        }
        this.cfr_renamed_4 = new sproue(string.substring(2));
    }

    public String toString() {
        return this.cfr_renamed_2147();
    }

    /*
     * WARNING - void declaration
     */
    public spruzd(sprvva sprvva2) {
        void arg0;
        if (!(sprvva2 instanceof sprgpe) && !(arg0 instanceof sprrpe)) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("\u0003z\u001dz\u0019c\u00184\u0019v\u001cq\u0015`Vd\u0017g\u0005q\u00124\u0002{V@\u001fy\u0013"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public static spruzd cfr_renamed_341(spryte arg0, boolean arg1) {
        return spruzd.cfr_renamed_23(arg0.cfr_renamed_2456());
    }
}

