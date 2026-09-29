/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprpgp;
import com.spire.presentation.packages.sprzra;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class sprkfe {
    private byte[] cfr_renamed_4;

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

    public byte[] cfr_renamed_4572() {
        return this.cfr_renamed_4;
    }

    public sprkfe(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        sprkfe sprkfe2 = this;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprhql.cfr_renamed_9("^|jHCa\u0000_\u0000"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprpgp.cfr_renamed_9("\u001d")));
        sprkfe2.cfr_renamed_4 = sprkfe2.cfr_renamed_4689(simpleDateFormat2.format(arg0));
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

    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    public sprkfe(String string) {
        sprkfe sprkfe2 = this;
        sprkfe2.cfr_renamed_4 = sprkfe2.cfr_renamed_4689(string);
    }

    public sprkfe(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        sprkfe sprkfe2 = this;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprhql.cfr_renamed_9("^|jHCa\u0000_\u0000"));
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprpgp.cfr_renamed_9("\u001d")));
        sprkfe2.cfr_renamed_4 = sprkfe2.cfr_renamed_4689(simpleDateFormat2.format(arg0));
    }

    public sprkfe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprkfe)) {
            return false;
        }
        sprkfe sprkfe2 = (sprkfe)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprkfe2.cfr_renamed_4);
    }

    public Date cfr_renamed_110() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sprhql.cfr_renamed_9("|^|^HjaC"));
        return simpleDateFormat.parse(sprpgp.cfr_renamed_9("\u0000w") + this.toString());
    }
}

