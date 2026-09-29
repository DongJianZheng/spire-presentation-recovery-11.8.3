/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprjsg;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprtxca;
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
import java.util.TimeZone;

public class sprrpe
extends sprvva {
    private byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprrpe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprrpe) {
            return (sprrpe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtxca.cfr_renamed_9(".z+s w+6(t-s$bg\u007f)6 s3_)e3w)u\",g")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprrpe)sprrpe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjsg.cfr_renamed_9("4J2K5M?CqA#V>VqM?\u00046A%m?W%E?G4\u001eq")).append(exception.toString()).toString());
        }
    }

    public String cfr_renamed_4939() {
        return sprywa.cfr_renamed_184(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprrpe)) {
            return false;
        }
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, ((sprrpe)arg0).cfr_renamed_4);
    }

    public sprrpe(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprjsg.cfr_renamed_9("(](]\u001ci5@\u0019l<I\"Wv~v"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprtxca.cfr_renamed_9("\u001d")));
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrpe(String string) {
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(string);
        try {
            this.cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjsg.cfr_renamed_9("8J'E=M5\u00045E%AqW%V8J6\u001eq")).append(parseException.getMessage()).toString());
        }
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Date cfr_renamed_110() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        sprrpe sprrpe2;
        SimpleDateFormat simpleDateFormat2;
        String string;
        String string2 = string = sprywa.cfr_renamed_184(this.cfr_renamed_4);
        if (string.endsWith(sprtxca.cfr_renamed_9("\u001d"))) {
            (this.cfr_renamed_4940() ? (simpleDateFormat2 = new SimpleDateFormat(sprjsg.cfr_renamed_9("(](]\u001ci5@\u0019l<I\"W\u007fw\u0002wv~v"))) : (simpleDateFormat2 = new SimpleDateFormat(sprtxca.cfr_renamed_9(">o>o\n[#r\u000f^*{4e`L`")))).setTimeZone(new SimpleTimeZone(0, sprjsg.cfr_renamed_9("\u000b")));
            sprrpe2 = this;
        } else if (string.indexOf(45) > 0 || string.indexOf(43) > 0) {
            SimpleDateFormat simpleDateFormat3;
            SimpleDateFormat simpleDateFormat4;
            sprrpe sprrpe3 = this;
            string2 = sprrpe3.cfr_renamed_2147();
            if (sprrpe3.cfr_renamed_4940()) {
                simpleDateFormat4 = new SimpleDateFormat(sprtxca.cfr_renamed_9(">o>o\n[#r\u000f^*{4eiE\u0014E="));
                simpleDateFormat3 = simpleDateFormat2 = simpleDateFormat4;
            } else {
                simpleDateFormat4 = new SimpleDateFormat(sprjsg.cfr_renamed_9("(](]\u001ci5@\u0019l<I\"W+"));
                simpleDateFormat3 = simpleDateFormat2 = simpleDateFormat4;
            }
            simpleDateFormat3.setTimeZone(new SimpleTimeZone(0, sprtxca.cfr_renamed_9("\u001d")));
            sprrpe2 = this;
        } else {
            SimpleDateFormat simpleDateFormat5;
            SimpleDateFormat simpleDateFormat6;
            if (this.cfr_renamed_4940()) {
                simpleDateFormat6 = new SimpleDateFormat(sprjsg.cfr_renamed_9("](](i\u001c@5l\u0019I<W\"\n\u0002w\u0002"));
                simpleDateFormat5 = simpleDateFormat2 = simpleDateFormat6;
            } else {
                simpleDateFormat6 = new SimpleDateFormat(sprtxca.cfr_renamed_9("o>o>[\nr#^\u000f{*e4"));
                simpleDateFormat5 = simpleDateFormat2 = simpleDateFormat6;
            }
            simpleDateFormat5.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
            sprrpe2 = this;
        }
        if (sprrpe2.cfr_renamed_4940()) {
            int n;
            int n2;
            String string3;
            block14: {
                char c;
                string3 = string2.substring(14);
                int n3 = n2 = 1;
                while (n3 < string3.length() && '0' <= (c = string3.charAt(n2))) {
                    if (c > '9') {
                        n = n2;
                        break block14;
                    }
                    n3 = ++n2;
                }
                n = n2;
            }
            if (n - 1 > 3) {
                string3 = new StringBuilder().insert(0, string3.substring(0, 4)).append(string3.substring(n2)).toString();
                string2 = new StringBuilder().insert(0, string2.substring(0, 14)).append(string3).toString();
                simpleDateFormat = simpleDateFormat2;
                return simpleDateFormat.parse(string2);
            }
            if (n2 - 1 == 1) {
                string3 = new StringBuilder().insert(0, string3.substring(0, n2)).append(sprjsg.cfr_renamed_9("\u0014a")).append(string3.substring(n2)).toString();
                string2 = new StringBuilder().insert(0, string2.substring(0, 14)).append(string3).toString();
                simpleDateFormat = simpleDateFormat2;
                return simpleDateFormat.parse(string2);
            }
            if (n2 - 1 == 2) {
                string3 = new StringBuilder().insert(0, string3.substring(0, n2)).append("0").append(string3.substring(n2)).toString();
                string2 = new StringBuilder().insert(0, string2.substring(0, 14)).append(string3).toString();
            }
        }
        simpleDateFormat = simpleDateFormat2;
        return simpleDateFormat.parse(string2);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(24, this.cfr_renamed_4);
    }

    private /* synthetic */ String cfr_renamed_4941(int arg0) {
        if (arg0 < 10) {
            return new StringBuilder().insert(0, "0").append(arg0).toString();
        }
        return Integer.toString(arg0);
    }

    public String cfr_renamed_2147() {
        String string = sprywa.cfr_renamed_184(this.cfr_renamed_4);
        if (string.charAt(string.length() - 1) == 'Z') {
            String string2 = string;
            return new StringBuilder().insert(0, string2.substring(0, string2.length() - 1)).append(sprtxca.cfr_renamed_9("\u0000[\u0013=w&}&w")).toString();
        }
        String string3 = string;
        int n = string3.length() - 5;
        char c = string3.charAt(n);
        if (c == '-' || c == '+') {
            int n2 = n;
            return new StringBuilder().insert(0, string.substring(0, n)).append(sprjsg.cfr_renamed_9("\u0016i\u0005")).append(string.substring(n2, n2 + 3)).append(":").append(string.substring(n + 3)).toString();
        }
        String string4 = string;
        n = string4.length() - 3;
        c = string4.charAt(n);
        if (c == '-' || c == '+') {
            return new StringBuilder().insert(0, string.substring(0, n)).append(sprtxca.cfr_renamed_9("\u0000[\u0013")).append(string.substring(n)).append(sprjsg.cfr_renamed_9("k\u0014a")).toString();
        }
        return new StringBuilder().insert(0, string).append(this.cfr_renamed_4942()).toString();
    }

    @Override
    public int cfr_renamed_4616() {
        int n = this.cfr_renamed_4.length;
        return 1 + sprcme.cfr_renamed_4586(n) + n;
    }

    public static sprrpe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprrpe) {
            return sprrpe.cfr_renamed_23(sprvva2);
        }
        return new sprrpe(((sprxue)sprvva2).cfr_renamed_186());
    }

    public sprrpe(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprtxca.cfr_renamed_9(">o>o\n[#r\u000f^*{4e`L`"));
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprjsg.cfr_renamed_9("\u000b")));
        this.cfr_renamed_4 = sprywa.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    private /* synthetic */ boolean cfr_renamed_4940() {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            if (this.cfr_renamed_4[n] == 46 && n == 14) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public sprrpe(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_4942() {
        String string = "+";
        TimeZone timeZone = TimeZone.getDefault();
        int n = timeZone.getRawOffset();
        if (n < 0) {
            string = "-";
            n = -n;
        }
        int n2 = n / 3600000;
        int n3 = (n - n2 * 60 * 60 * 1000) / 60000;
        try {
            if (!timeZone.useDaylightTime()) return new StringBuilder().insert(0, sprtxca.cfr_renamed_9("\u0000[\u0013")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
            if (!timeZone.inDaylightTime(this.cfr_renamed_110())) return new StringBuilder().insert(0, sprtxca.cfr_renamed_9("\u0000[\u0013")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
            return new StringBuilder().insert(0, sprtxca.cfr_renamed_9("\u0000[\u0013")).append(string).append(this.cfr_renamed_4941(n2 += string.equals("+") ? 1 : -1)).append(":").append(this.cfr_renamed_4941(n3)).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        return new StringBuilder().insert(0, sprtxca.cfr_renamed_9("\u0000[\u0013")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
    }
}

