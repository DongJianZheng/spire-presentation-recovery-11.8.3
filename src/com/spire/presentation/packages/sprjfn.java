/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.sprgho;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkxm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprwgn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzzm;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class sprjfn
extends sprxgf {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprzzm(sprjfn.class, 24);

    private /* synthetic */ boolean cfr_renamed_11469(int arg0) {
        return this.cfr_renamed_3.length > arg0 && this.cfr_renamed_3[arg0] >= 48 && this.cfr_renamed_3[arg0] <= 57;
    }

    @Override
    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    public static sprjfn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprjfn) {
            return (sprjfn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprjfn) {
            return (sprjfn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprjfn)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprfto.cfr_renamed_9("4j2k5m?cqa#v>vqm?$6a%M?w%e?g4>q")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprgho.cfr_renamed_9("}\u0005x\fs\bxI{\u000b~\fw\u001d4\u0000zIs\f` z\u001a`\bz\nqS4")).append(arg0.getClass().getName()).toString());
    }

    public sprjfn(Date arg0, Locale arg1) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019L<i\"wv^v"), arg1);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprgho.cfr_renamed_9("N")));
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    private /* synthetic */ String cfr_renamed_4941(int arg0) {
        if (arg0 < 10) {
            return new StringBuilder().insert(0, "0").append(arg0).toString();
        }
        return Integer.toString(arg0);
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprjfn)) {
            return false;
        }
        return sproze.cfr_renamed_92(this.cfr_renamed_3, ((sprjfn)arg0).cfr_renamed_3);
    }

    public boolean cfr_renamed_11306() {
        return this.cfr_renamed_11469(12) && this.cfr_renamed_11469(13);
    }

    public String cfr_renamed_4939() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ String cfr_renamed_11510(String arg0) {
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
            SimpleDateFormat simpleDateFormat;
            if (!timeZone.useDaylightTime()) return new StringBuilder().insert(0, sprgho.cfr_renamed_9("S$@")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
            if (this.cfr_renamed_4940()) {
                arg0 = this.cfr_renamed_11511(arg0);
            }
            if (!timeZone.inDaylightTime((simpleDateFormat = this.cfr_renamed_11512()).parse(arg0 + sprfto.cfr_renamed_9("\u0016I\u0005") + string + this.cfr_renamed_4941(n2) + ":" + this.cfr_renamed_4941(n3)))) return new StringBuilder().insert(0, sprgho.cfr_renamed_9("S$@")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
            return new StringBuilder().insert(0, sprgho.cfr_renamed_9("S$@")).append(string).append(this.cfr_renamed_4941(n2 += string.equals("+") ? 1 : -1)).append(":").append(this.cfr_renamed_4941(n3)).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        return new StringBuilder().insert(0, sprgho.cfr_renamed_9("S$@")).append(string).append(this.cfr_renamed_4941(n2)).append(":").append(this.cfr_renamed_4941(n3)).toString();
    }

    private /* synthetic */ SimpleDateFormat cfr_renamed_11512() {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3;
        if (this.cfr_renamed_4940()) {
            simpleDateFormat2 = simpleDateFormat3 = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019L<i\"w\u007fW\u0002W+"));
        } else if (this.cfr_renamed_11306()) {
            simpleDateFormat2 = simpleDateFormat3 = new SimpleDateFormat(sprgho.cfr_renamed_9("m\u0010m\u0010Y$p\r\\!y\u0004g\u001an"));
        } else if (this.cfr_renamed_11305()) {
            simpleDateFormat = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019L<i+"));
            simpleDateFormat2 = simpleDateFormat3 = simpleDateFormat;
        } else {
            simpleDateFormat = new SimpleDateFormat(sprgho.cfr_renamed_9("m\u0010m\u0010Y$p\r\\!n"));
            simpleDateFormat2 = simpleDateFormat3 = simpleDateFormat;
        }
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprfto.cfr_renamed_9("\u000b")));
        return simpleDateFormat3;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 24, this.cfr_renamed_3);
    }

    public boolean cfr_renamed_4940() {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            if (this.cfr_renamed_3[n] == 46 && n == 14) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        return new sprkxm(this.cfr_renamed_3);
    }

    public boolean cfr_renamed_11305() {
        return this.cfr_renamed_11469(10) && this.cfr_renamed_11469(11);
    }

    public String cfr_renamed_2147() {
        String string = sprkoe.cfr_renamed_184(this.cfr_renamed_3);
        if (string.charAt(string.length() - 1) == 'Z') {
            String string2 = string;
            return new StringBuilder().insert(0, string2.substring(0, string2.length() - 1)).append(sprgho.cfr_renamed_9("S$@B$Y.Y$")).toString();
        }
        String string3 = string;
        int n = string3.length() - 6;
        char c = string3.charAt(n);
        if ((c == '-' || c == '+') && string.indexOf(sprfto.cfr_renamed_9("\u0016I\u0005")) == n - 3) {
            return string;
        }
        String string4 = string;
        n = string4.length() - 5;
        c = string4.charAt(n);
        if (c == '-' || c == '+') {
            int n2 = n;
            return new StringBuilder().insert(0, string.substring(0, n)).append(sprgho.cfr_renamed_9("S$@")).append(string.substring(n2, n2 + 3)).append(":").append(string.substring(n + 3)).toString();
        }
        String string5 = string;
        n = string5.length() - 3;
        c = string5.charAt(n);
        if (c == '-' || c == '+') {
            return new StringBuilder().insert(0, string.substring(0, n)).append(sprfto.cfr_renamed_9("\u0016I\u0005")).append(string.substring(n)).append(sprgho.cfr_renamed_9(".Y$")).toString();
        }
        return new StringBuilder().insert(0, string).append(this.cfr_renamed_11510(string)).toString();
    }

    public Date cfr_renamed_110() throws ParseException {
        sprjfn sprjfn2;
        SimpleDateFormat simpleDateFormat;
        String string;
        String string2 = string = sprkoe.cfr_renamed_184(this.cfr_renamed_3);
        if (string.endsWith(sprfto.cfr_renamed_9("\u000b"))) {
            SimpleDateFormat simpleDateFormat2;
            SimpleDateFormat simpleDateFormat3;
            if (this.cfr_renamed_4940()) {
                simpleDateFormat3 = simpleDateFormat = new SimpleDateFormat(sprgho.cfr_renamed_9("m\u0010m\u0010Y$p\r\\!y\u0004g\u001a::G:333"), sprwgn.cfr_renamed_4);
            } else if (this.cfr_renamed_11306()) {
                simpleDateFormat3 = simpleDateFormat = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019L<i\"wv^v"), sprwgn.cfr_renamed_4);
            } else if (this.cfr_renamed_11305()) {
                simpleDateFormat2 = new SimpleDateFormat(sprgho.cfr_renamed_9("m\u0010m\u0010Y$p\r\\!y\u0004333"), sprwgn.cfr_renamed_4);
                simpleDateFormat3 = simpleDateFormat = simpleDateFormat2;
            } else {
                simpleDateFormat2 = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019Lv^v"), sprwgn.cfr_renamed_4);
                simpleDateFormat3 = simpleDateFormat = simpleDateFormat2;
            }
            simpleDateFormat3.setTimeZone(new SimpleTimeZone(0, sprgho.cfr_renamed_9("N")));
            sprjfn2 = this;
        } else if (string.indexOf(45) > 0 || string.indexOf(43) > 0) {
            sprjfn sprjfn3 = this;
            sprjfn2 = sprjfn3;
            string2 = sprjfn3.cfr_renamed_2147();
            simpleDateFormat = sprjfn3.cfr_renamed_11512();
        } else {
            SimpleDateFormat simpleDateFormat4;
            SimpleDateFormat simpleDateFormat5;
            if (this.cfr_renamed_4940()) {
                simpleDateFormat5 = simpleDateFormat = new SimpleDateFormat(sprfto.cfr_renamed_9("}(}(I\u001c`5L\u0019i<w\"*\u0002W\u0002"));
            } else if (this.cfr_renamed_11306()) {
                simpleDateFormat5 = simpleDateFormat = new SimpleDateFormat(sprgho.cfr_renamed_9("\u0010m\u0010m$Y\rp!\\\u0004y\u001ag"));
            } else if (this.cfr_renamed_11305()) {
                simpleDateFormat4 = new SimpleDateFormat(sprfto.cfr_renamed_9("}(}(I\u001c`5L\u0019i<"));
                simpleDateFormat5 = simpleDateFormat = simpleDateFormat4;
            } else {
                simpleDateFormat4 = new SimpleDateFormat(sprgho.cfr_renamed_9("\u0010m\u0010m$Y\rp!\\"));
                simpleDateFormat5 = simpleDateFormat = simpleDateFormat4;
            }
            simpleDateFormat5.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
            sprjfn2 = this;
        }
        if (sprjfn2.cfr_renamed_4940()) {
            string2 = this.cfr_renamed_11511(string2);
        }
        return simpleDateFormat.parse(string2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjfn(byte[] byArray) {
        void arg0;
        if (byArray.length < 4) {
            throw new IllegalArgumentException(sprfto.cfr_renamed_9("C4j4v0h8~4`\u0005m<aqw%v8j6$%k>$\"l>v%"));
        }
        this.cfr_renamed_3 = arg0;
        if (!(this.cfr_renamed_11469(0) && this.cfr_renamed_11469(1) && this.cfr_renamed_11469(2) && this.cfr_renamed_11469(3))) {
            throw new IllegalArgumentException(sprgho.cfr_renamed_9("\u0000x\u0005q\u000eu\u00054\n|\bf\bw\u001dq\u001bgI}\u00074.q\u0007q\u001bu\u0005}\u0013q\r@\u0000y\f4\u001a`\u001b}\u0007s"));
        }
    }

    public static sprjfn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprjfn)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    public sprjfn(Date arg0) {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat = new SimpleDateFormat(sprfto.cfr_renamed_9("(}(}\u001cI5`\u0019L<i\"wv^v"), sprwgn.cfr_renamed_4);
        SimpleDateFormat simpleDateFormat3 = simpleDateFormat;
        simpleDateFormat2.setTimeZone(new SimpleTimeZone(0, sprgho.cfr_renamed_9("N")));
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(simpleDateFormat2.format(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjfn(String string) {
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(string);
        try {
            this.cfr_renamed_110();
            return;
        }
        catch (ParseException parseException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfto.cfr_renamed_9("8j'e=m5$5e%aqw%v8j6>q")).append(parseException.getMessage()).toString());
        }
    }

    private /* synthetic */ String cfr_renamed_11511(String arg0) {
        int n;
        int n2;
        String string;
        block5: {
            char c;
            string = arg0.substring(14);
            int n3 = n2 = 1;
            while (n3 < string.length() && '0' <= (c = string.charAt(n2))) {
                if (c > '9') {
                    n = n2;
                    break block5;
                }
                n3 = ++n2;
            }
            n = n2;
        }
        if (n - 1 > 3) {
            string = new StringBuilder().insert(0, string.substring(0, 4)).append(string.substring(n2)).toString();
            arg0 = new StringBuilder().insert(0, arg0.substring(0, 14)).append(string).toString();
            return arg0;
        }
        if (n2 - 1 == 1) {
            string = new StringBuilder().insert(0, string.substring(0, n2)).append(sprgho.cfr_renamed_9("Y$")).append(string.substring(n2)).toString();
            arg0 = new StringBuilder().insert(0, arg0.substring(0, 14)).append(string).toString();
            return arg0;
        }
        if (n2 - 1 == 2) {
            string = new StringBuilder().insert(0, string.substring(0, n2)).append("0").append(string.substring(n2)).toString();
            arg0 = new StringBuilder().insert(0, arg0.substring(0, 14)).append(string).toString();
        }
        return arg0;
    }

    public static sprjfn cfr_renamed_11295(byte[] arg0) {
        return new sprjfn(arg0);
    }
}

