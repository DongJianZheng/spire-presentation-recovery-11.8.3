/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasg;
import com.spire.presentation.packages.sprdjy;
import com.spire.presentation.packages.sprdwm;
import com.spire.presentation.packages.sprgen;
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

public class sprrcm
extends sprqqe
implements sprlm {
    public sprxgf cfr_renamed_4;

    public static sprrcm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprdjy.cfr_renamed_9("O5C4O8\f4X8A}A(_)\f?I}I%\\1E>E)@$\f)M:K8H"));
        }
        return sprrcm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public sprrcm(Date arg0, Locale arg1) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprasg.cfr_renamed_9("z"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprdjy.cfr_renamed_9("$U$U\u0010a9H\u0015d0A._"), arg1);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprasg.cfr_renamed_9("z")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new sprkxm(string);
            return;
        }
        this.cfr_renamed_4 = new sprdwm(string.substring(2));
    }

    public String toString() {
        return this.cfr_renamed_2147();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public sprrcm(Date arg0) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, sprdjy.cfr_renamed_9("v"));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprasg.cfr_renamed_9("CYCYwm^DrhWMIS"), sprwgn.cfr_renamed_4);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String string = new StringBuilder().insert(0, simpleDateFormat.format(arg0)).append(sprdjy.cfr_renamed_9("v")).toString();
        int n = Integer.parseInt(string.substring(0, 4));
        if (n < 1950 || n > 2049) {
            this.cfr_renamed_4 = new sprkxm(string);
            return;
        }
        this.cfr_renamed_4 = new sprdwm(string.substring(2));
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
            throw new IllegalStateException(new StringBuilder().insert(0, sprasg.cfr_renamed_9("ITV[LSD\u001aD[T_\u0000ITHITG\u0000\u0000")).append(parseException.getMessage()).toString());
        }
    }

    public static sprrcm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrcm) {
            return (sprrcm)arg0;
        }
        if (arg0 instanceof sprgen) {
            return new sprrcm((sprgen)arg0);
        }
        if (arg0 instanceof sprjfn) {
            return new sprrcm((sprjfn)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdjy.cfr_renamed_9("Y3G3C*B}C?F8O)\f4B}J<O)C/Ug\f")).append(arg0.getClass().getName()).toString());
    }

    public String cfr_renamed_2147() {
        if (this.cfr_renamed_4 instanceof sprgen) {
            return ((sprgen)this.cfr_renamed_4).cfr_renamed_4476();
        }
        return ((sprjfn)this.cfr_renamed_4).cfr_renamed_2147();
    }

    /*
     * WARNING - void declaration
     */
    public sprrcm(sprxgf sprxgf2) {
        void arg0;
        if (!(sprxgf2 instanceof sprgen) && !(arg0 instanceof sprjfn)) {
            throw new IllegalArgumentException(sprasg.cfr_renamed_9("UTKTOMN\u001aOXJ_CN\u0000JAIS_D\u001aTU\u0000nIWE"));
        }
        this.cfr_renamed_4 = arg0;
    }
}

