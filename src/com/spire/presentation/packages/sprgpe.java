/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprfkba;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvnd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprgpe
extends sprvva {
    private byte[] cfr_renamed_4;

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprgpe)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, ((sprgpe)arg0).cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public Date cfr_renamed_4475() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprvnd.cfr_renamed_9("D\u0013D\u0013p'Y\u000eu\"P\u0007N\u0019G"));
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprfkba.cfr_renamed_9("\u0018")));
        return simpleDateFormat2.parse(this.cfr_renamed_4476());
    }

    public String toString() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprgpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprgpe) {
            return (sprgpe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfkba.cfr_renamed_9("+\u000e.\u0007%\u0003.B-\u0000(\u0007!\u0016b\u000b,B%\u00076+,\u00116\u0003,\u0001'Xb")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprgpe)sprgpe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvnd.cfr_renamed_9("X\u0004^\u0005Y\u0003S\r\u001d\u000fO\u0018R\u0018\u001d\u0003SJZ\u000fI#S\u0019I\u000bS\tXP\u001d")).append(exception.toString()).toString());
        }
    }

    public static sprgpe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprgpe) {
            return sprgpe.cfr_renamed_23(sprvva2);
        }
        return new sprgpe(((sprxue)sprvva2).cfr_renamed_186());
    }

    public sprgpe(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprvnd.cfr_renamed_9("D\u0013p'Y\u000eu\"P\u0007N\u0019\u001a0\u001a"));
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprfkba.cfr_renamed_9("\u0018")));
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    public String cfr_renamed_4476() {
        String string = this.cfr_renamed_2147();
        if (string.charAt(0) < '5') {
            return new StringBuilder().insert(0, sprvnd.cfr_renamed_9("X\r")).append(string).toString();
        }
        return new StringBuilder().insert(0, sprfkba.cfr_renamed_9("S{")).append(string).toString();
    }

    public Date cfr_renamed_110() throws ParseException {
        return new SimpleDateFormat(sprvnd.cfr_renamed_9("D\u0013p'Y\u000eu\"P\u0007N\u0019G")).parse(this.cfr_renamed_2147());
    }

    public sprgpe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgpe(String string) {
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(string);
        try {
            this.cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfkba.cfr_renamed_9("+\f4\u0003.\u000b&B&\u00036\u0007b\u00116\u0010+\f%Xb")).append(parseException.getMessage()).toString());
        }
    }

    public String cfr_renamed_2147() {
        String string = sprywa.cfr_renamed_184(this.cfr_renamed_4);
        if (string.indexOf(45) < 0 && string.indexOf(43) < 0) {
            if (string.length() == 11) {
                return new StringBuilder().insert(0, string.substring(0, 10)).append(sprvnd.cfr_renamed_9("\rZz'iA\rZ\u0007Z\r")).toString();
            }
            return new StringBuilder().insert(0, string.substring(0, 12)).append(sprfkba.cfr_renamed_9("\u0005/\u0016IrRxRr")).toString();
        }
        int n = string.indexOf(45);
        if (n < 0) {
            n = string.indexOf(43);
        }
        String string2 = string;
        if (n == string.length() - 3) {
            string2 = new StringBuilder().insert(0, string2).append(sprvnd.cfr_renamed_9("Z\r")).toString();
        }
        if (n == 10) {
            return new StringBuilder().insert(0, string2.substring(0, 10)).append(sprfkba.cfr_renamed_9("rR\u0005/\u0016")).append(string2.substring(10, 13)).append(":").append(string2.substring(13, 15)).toString();
        }
        return new StringBuilder().insert(0, string2.substring(0, 12)).append(sprvnd.cfr_renamed_9("z'i")).append(string2.substring(12, 15)).append(":").append(string2.substring(15, 17)).toString();
    }

    public sprgpe(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprfkba.cfr_renamed_9(";\u001b\u000f/&\u0006\n*/\u000f1\u0011e8e"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprvnd.cfr_renamed_9("g")));
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_4613(sprope sprope2) throws IOException {
        int n;
        void arg0;
        arg0.cfr_renamed_4787(23);
        int n2 = this.cfr_renamed_4.length;
        arg0.cfr_renamed_4782(n2);
        int n3 = n = 0;
        while (n3 != n2) {
            arg0.cfr_renamed_4787(this.cfr_renamed_4[n++]);
            n3 = n;
        }
    }

    @Override
    public int cfr_renamed_4616() {
        int n = this.cfr_renamed_4.length;
        return 1 + sprcme.cfr_renamed_4586(n) + n;
    }
}

