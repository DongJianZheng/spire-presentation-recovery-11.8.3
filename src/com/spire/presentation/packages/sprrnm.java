/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwlo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprrnm {
    private byte[] cfr_renamed_4;

    public sprrnm(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        sprrnm sprrnm2 = this;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprkqa.cfr_renamed_9("\u001fB+v\u0002_AaA"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprwlo.cfr_renamed_9("<")));
        sprrnm2.cfr_renamed_4 = sprrnm2.cfr_renamed_4689(simpleDateFormat2.format(arg0));
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprrnm)) {
            return false;
        }
        sprrnm sprrnm2 = (sprrnm)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprrnm2.cfr_renamed_4);
    }

    public String toString() {
        int n;
        char[] cArray = new char[this.cfr_renamed_4.length];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            int n3 = n++;
            cArray[n3] = (char)((this.cfr_renamed_4[n3] & 0xFF) + 48);
            n2 = n;
        }
        return new String(cArray);
    }

    public sprrnm(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        sprrnm sprrnm2 = this;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprkqa.cfr_renamed_9("\u001fB+v\u0002_AaA"));
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprwlo.cfr_renamed_9("<")));
        sprrnm2.cfr_renamed_4 = sprrnm2.cfr_renamed_4689(simpleDateFormat2.format(arg0));
    }

    private /* synthetic */ byte[] cfr_renamed_4689(String arg0) {
        int n;
        char[] cArray = arg0.toCharArray();
        byte[] byArray = new byte[6];
        int n2 = n = 0;
        while (n2 != 6) {
            int n3 = n++;
            byArray[n3] = (byte)(cArray[n3] - 48);
            n2 = n;
        }
        return byArray;
    }

    public byte[] cfr_renamed_4572() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public Date cfr_renamed_110() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprkqa.cfr_renamed_9("B\u001fB\u001fv+_\u0002"));
        return simpleDateFormat.parse(sprwlo.cfr_renamed_9("\u0010V") + this.toString());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 1;
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = 3 << 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprrnm(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public sprrnm(String string) {
        sprrnm sprrnm2 = this;
        sprrnm2.cfr_renamed_4 = sprrnm2.cfr_renamed_4689(string);
    }
}

