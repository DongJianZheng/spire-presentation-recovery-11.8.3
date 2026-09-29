/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprwgn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxro;
import com.spire.presentation.packages.sprzwm;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprgen
extends sprxgf {
    public static final sprqbn cfr_renamed_3 = new sprzwm(sprgen.class, 23);
    public final byte[] cfr_renamed_4;

    public static sprgen cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprgen)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    public static sprgen cfr_renamed_11295(byte[] arg0) {
        return new sprgen(arg0);
    }

    public sprgen(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprxro.cfr_renamed_9("`\fT8}\u0011Q=t\u0018j\u0006>/>"), sprwgn.cfr_renamed_4);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, SaveToPdfOption.cfr_renamed_9("4")));
        this.cfr_renamed_4 = sprkoe.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    public Date cfr_renamed_110() throws ParseException {
        return new SimpleDateFormat(sprxro.cfr_renamed_9("`\fT8}\u0011Q=t\u0018j\u0006c"), sprwgn.cfr_renamed_4).parse(this.cfr_renamed_2147());
    }

    public String toString() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_4);
    }

    public String cfr_renamed_4476() {
        String string = this.cfr_renamed_2147();
        if (string.charAt(0) < '5') {
            return new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("w^")).append(string).toString();
        }
        return new StringBuilder().insert(0, sprxro.cfr_renamed_9("D ")).append(string).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgen(String string) {
        this.cfr_renamed_4 = sprkoe.cfr_renamed_433(string);
        try {
            this.cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("\u0007+\u0018$\u0002,\ne\n$\u001a N6\u001a7\u0007+\t\u007fN")).append(parseException.getMessage()).toString());
        }
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 23, this.cfr_renamed_4);
    }

    public String cfr_renamed_2147() {
        String string = sprkoe.cfr_renamed_184(this.cfr_renamed_4);
        if (string.indexOf(45) < 0 && string.indexOf(43) < 0) {
            if (string.length() == 11) {
                return new StringBuilder().insert(0, string.substring(0, 10)).append(sprxro.cfr_renamed_9(")E^8M^)E#E)")).toString();
            }
            return new StringBuilder().insert(0, string.substring(0, 12)).append(SaveToPdfOption.cfr_renamed_9(")\b:n^uTu^")).toString();
        }
        int n = string.indexOf(45);
        if (n < 0) {
            n = string.indexOf(43);
        }
        String string2 = string;
        if (n == string.length() - 3) {
            string2 = new StringBuilder().insert(0, string2).append(sprxro.cfr_renamed_9("E)")).toString();
        }
        if (n == 10) {
            return new StringBuilder().insert(0, string2.substring(0, 10)).append(SaveToPdfOption.cfr_renamed_9("^u)\b:")).append(string2.substring(10, 13)).append(":").append(string2.substring(13, 15)).toString();
        }
        return new StringBuilder().insert(0, string2.substring(0, 12)).append(sprxro.cfr_renamed_9("^8M")).append(string2.substring(12, 15)).append(":").append(string2.substring(15, 17)).toString();
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprgen)) {
            return false;
        }
        return sproze.cfr_renamed_92(this.cfr_renamed_4, ((sprgen)arg0).cfr_renamed_4);
    }

    @Override
    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static sprgen cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprgen) {
            return (sprgen)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprgen) {
            return (sprgen)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprgen)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("\u000b+\r*\n,\u0000\"N \u001c7\u00017N,\u0000e\t \u001a\f\u00006\u001a$\u0000&\u000b\u007fN")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxro.cfr_renamed_9("p\u0019u\u0010~\u0014uUv\u0017s\u0010z\u00019\u001cwU~\u0010m<w\u0006m\u0014w\u0016|O9")).append(arg0.getClass().getName()).toString());
    }

    public sprgen(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(SaveToPdfOption.cfr_renamed_9("\u0017<#\b\n!&\r\u0003(\u001d6I\u001fI"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprxro.cfr_renamed_9("C")));
        this.cfr_renamed_4 = sprkoe.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    public Date cfr_renamed_4475() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(SaveToPdfOption.cfr_renamed_9("\u0017<\u0017<#\b\n!&\r\u0003(\u001d6\u0014"), sprwgn.cfr_renamed_4);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprxro.cfr_renamed_9("C")));
        return simpleDateFormat2.parse(this.cfr_renamed_4476());
    }

    /*
     * WARNING - void declaration
     */
    public sprgen(byte[] byArray) {
        void arg0;
        if (byArray.length < 2) {
            throw new IllegalArgumentException(SaveToPdfOption.cfr_renamed_9("\u0010:\u0006:,\u0003 N6\u001a7\u0007+\te\u001a*\u0001e\u001d-\u00017\u001a"));
        }
        this.cfr_renamed_4 = arg0;
        if (!this.cfr_renamed_11469(0) || !this.cfr_renamed_11469(1)) {
            throw new IllegalArgumentException(sprxro.cfr_renamed_9("\u001cu\u0019|\u0012x\u00199\u0016q\u0014k\u0014z\u0001|\u0007jUp\u001b9 M6M\u001ct\u00109\u0006m\u0007p\u001b~"));
        }
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    private /* synthetic */ boolean cfr_renamed_11469(int arg0) {
        return this.cfr_renamed_4.length > arg0 && this.cfr_renamed_4[arg0] >= 48 && this.cfr_renamed_4[arg0] <= 57;
    }
}

