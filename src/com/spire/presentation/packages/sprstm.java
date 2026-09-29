/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqz;
import com.spire.presentation.packages.sprdwm;
import com.spire.presentation.packages.sprgen;
import com.spire.presentation.packages.sprgur;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkxm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprwgn;
import com.spire.presentation.packages.sprxgf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprstm
extends sprqqe
implements sprlm {
    public sprxgf cfr_renamed_4;

    public String cfr_renamed_2147() {
        if (this.cfr_renamed_4 instanceof sprgen) {
            return ((sprgen)this.cfr_renamed_4).cfr_renamed_4476();
        }
        return ((sprjfn)this.cfr_renamed_4).cfr_renamed_2147();
    }

    public static sprstm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("yEuDyH:DnHw\rwXiY:O\u007f\r\u007fUjAsNsYvT:Y{J}H~"));
        }
        return sprstm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public sprstm(Date arg0) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprdqz.cfr_renamed_9("V"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprgur.cfr_renamed_9("TcTc`WI~eR@w^i"), sprwgn.cfr_renamed_4);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprdqz.cfr_renamed_9("V")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new sprkxm(string);
            return;
        }
        this.cfr_renamed_4 = new sprdwm(string.substring(2));
    }

    public sprstm(Date arg0, Locale arg1) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprgur.cfr_renamed_9("@"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprdqz.cfr_renamed_9("$u$u\u0010A9h\u0015D0a.\u007f"), arg1);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprgur.cfr_renamed_9("@")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new sprkxm(string);
            return;
        }
        this.cfr_renamed_4 = new sprdwm(string.substring(2));
    }

    public static sprstm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprstm) {
            return (sprstm)arg0;
        }
        if (arg0 instanceof sprgen) {
            return new sprstm((sprgen)arg0);
        }
        if (arg0 instanceof sprjfn) {
            return new sprstm((sprjfn)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdqz.cfr_renamed_9("y3g3c*b}c?f8o),4b}j<o)c/ug,")).append(arg0.getClass().getName()).toString());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprstm(sprxgf sprxgf2) {
        void arg0;
        if (!(sprxgf2 instanceof sprgen) && !(arg0 instanceof sprjfn)) {
            throw new IllegalArgumentException(sprgur.cfr_renamed_9("oCqCuZt\ruOpHyY:]{^iH~\rnB:ys@\u007f"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Date cfr_renamed_110() {
        try {
            if (!(this.cfr_renamed_4 instanceof sprgen)) return ((sprjfn)this.cfr_renamed_4).cfr_renamed_110();
            return ((sprgen)this.cfr_renamed_4).cfr_renamed_4475();
        }
        catch (ParseException parseException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprdqz.cfr_renamed_9("e3z<`4h}h<x8,.x/e3kg,")).append(parseException.getMessage()).toString());
        }
    }
}

