/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sprslg;
import com.spire.presentation.packages.sprtl;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class sprqog {
    public ClassLoader cfr_renamed_112;
    public sprtl cfr_renamed_119;
    public sprslg cfr_renamed_91;
    public final String cfr_renamed_0;
    public sprslg cfr_renamed_1;
    public final String cfr_renamed_2;
    public String cfr_renamed_3;
    public static final String cfr_renamed_4 = "ISO-8859-1";

    public Object[] cfr_renamed_2534() {
        return this.cfr_renamed_1.cfr_renamed_2534();
    }

    public void cfr_renamed_2535(Object arg0) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        this.cfr_renamed_291(objectArray);
    }

    public sprtl cfr_renamed_2530() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprqog(String string, String string2, String string3, Object[] objectArray) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg3;
        void arg1;
        sprqog sprqog2 = this;
        sprqog sprqog3 = this;
        sprqog3.cfr_renamed_3 = cfr_renamed_4;
        sprqog3.cfr_renamed_91 = null;
        sprqog2.cfr_renamed_119 = null;
        sprqog2.cfr_renamed_112 = null;
        if (string == null || arg1 == null || arg3 == null) {
            throw new NullPointerException();
        }
        sprqog sprqog4 = this;
        sprqog4.cfr_renamed_0 = arg1;
        sprqog4.cfr_renamed_2 = arg0;
        sprqog sprqog5 = this;
        this.cfr_renamed_1 = new sprslg((Object[])arg3);
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprdkg.cfr_renamed_9("\u000b\u0006:N:\u0000<\u0001;\u00071\t\u007fL")).append((String)arg2).append(sprabl.cfr_renamed_9("\t|B/\u000b2D(\u000b/^,[3Y(N8\u0005")).toString());
        }
        this.cfr_renamed_3 = arg2;
    }

    public void cfr_renamed_2533(ClassLoader arg0) {
        this.cfr_renamed_112 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 2 << 3;
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

    public void cfr_renamed_7255(sprtl arg0) {
        sprqog sprqog2 = this;
        sprqog2.cfr_renamed_1.cfr_renamed_7255(arg0);
        if (sprqog2.cfr_renamed_91 != null) {
            this.cfr_renamed_91.cfr_renamed_7255(arg0);
        }
        this.cfr_renamed_119 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprqog(String string, String string2, Object[] objectArray) throws NullPointerException {
        void arg0;
        void arg2;
        void arg1;
        sprqog sprqog2 = this;
        sprqog sprqog3 = this;
        sprqog3.cfr_renamed_3 = cfr_renamed_4;
        sprqog3.cfr_renamed_91 = null;
        sprqog2.cfr_renamed_119 = null;
        sprqog2.cfr_renamed_112 = null;
        if (string == null || arg1 == null || arg2 == null) {
            throw new NullPointerException();
        }
        sprqog sprqog4 = this;
        sprqog4.cfr_renamed_0 = arg1;
        sprqog4.cfr_renamed_2 = arg0;
        sprqog sprqog5 = this;
        this.cfr_renamed_1 = new sprslg((Object[])arg2);
    }

    public Object[] cfr_renamed_2537() {
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        return this.cfr_renamed_91.cfr_renamed_2534();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String cfr_renamed_2521(String arg0, Locale arg1, TimeZone arg2) throws sprhig {
        String string = this.cfr_renamed_0;
        if (arg0 != null) {
            string = new StringBuilder().insert(0, string).append(".").append(arg0).toString();
        }
        try {
            ResourceBundle resourceBundle;
            ResourceBundle resourceBundle2;
            String string2 = (this.cfr_renamed_112 == null ? (resourceBundle2 = ResourceBundle.getBundle(this.cfr_renamed_2, arg1)) : (resourceBundle = ResourceBundle.getBundle(this.cfr_renamed_2, arg1, this.cfr_renamed_112))).getString(string);
            if (!this.cfr_renamed_3.equals(cfr_renamed_4)) {
                string2 = new String(string2.getBytes(cfr_renamed_4), this.cfr_renamed_3);
            }
            if (this.cfr_renamed_1.cfr_renamed_29()) return this.cfr_renamed_2531(string2, arg1);
            sprqog sprqog2 = this;
            string2 = sprqog2.cfr_renamed_2536(string2, sprqog2.cfr_renamed_1.cfr_renamed_2532(arg1), arg1, arg2);
            return this.cfr_renamed_2531(string2, arg1);
        }
        catch (MissingResourceException missingResourceException) {
            ClassLoader classLoader;
            String string3 = new StringBuilder().insert(0, sprdkg.cfr_renamed_9("->\u0000x\u001a\u007f\b6\u0000;N:\u0000+\u001c&N")).append(string).append(sprabl.cfr_renamed_9("|B2\u000b.N/D)Y?N|M5G9\u000b")).append(this.cfr_renamed_2).append(".").toString();
            sprqog sprqog3 = this;
            if (this.cfr_renamed_112 != null) {
                classLoader = sprqog3.cfr_renamed_112;
                throw new sprhig(string3, this.cfr_renamed_2, string, arg1, classLoader);
            }
            classLoader = sprqog3.cfr_renamed_2523();
            throw new sprhig(string3, this.cfr_renamed_2, string, arg1, classLoader);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public String cfr_renamed_2531(String arg0, Locale arg1) {
        if (this.cfr_renamed_91 != null) {
            int n;
            StringBuffer stringBuffer = new StringBuffer(arg0);
            Object[] objectArray = this.cfr_renamed_91.cfr_renamed_2532(arg1);
            int n2 = n = 0;
            while (n2 < objectArray.length) {
                stringBuffer.append(objectArray[n++]);
                n2 = n;
            }
            arg0 = stringBuffer.toString();
        }
        return arg0;
    }

    public void cfr_renamed_291(Object[] arg0) {
        if (arg0 != null) {
            this.cfr_renamed_91 = new sprslg(arg0);
            this.cfr_renamed_91.cfr_renamed_7255(this.cfr_renamed_119);
            return;
        }
        this.cfr_renamed_91 = null;
    }

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_112;
    }

    public String cfr_renamed_2536(String arg0, Object[] arg1, Locale arg2, TimeZone arg3) {
        MessageFormat messageFormat;
        MessageFormat messageFormat2 = messageFormat = new MessageFormat(" ");
        messageFormat2.setLocale(arg2);
        messageFormat2.applyPattern(arg0);
        if (!arg3.equals(TimeZone.getDefault())) {
            int n;
            Format[] formatArray = messageFormat.getFormats();
            int n2 = n = 0;
            while (n2 < formatArray.length) {
                if (formatArray[n] instanceof DateFormat) {
                    DateFormat dateFormat = (DateFormat)formatArray[n];
                    dateFormat.setTimeZone(arg3);
                    messageFormat.setFormat(n, dateFormat);
                }
                n2 = ++n;
            }
        }
        return messageFormat.format(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprqog(String string, String string2) throws NullPointerException {
        void arg0;
        void arg1;
        sprqog sprqog2 = this;
        sprqog sprqog3 = this;
        sprqog3.cfr_renamed_3 = cfr_renamed_4;
        sprqog3.cfr_renamed_91 = null;
        sprqog2.cfr_renamed_119 = null;
        sprqog2.cfr_renamed_112 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprqog sprqog4 = this;
        sprqog4.cfr_renamed_0 = arg1;
        sprqog4.cfr_renamed_2 = arg0;
        sprqog sprqog5 = this;
        this.cfr_renamed_1 = new sprslg();
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_2524() {
        return this.cfr_renamed_2;
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer.append(sprdkg.cfr_renamed_9("<:\u001d0\u001b-\r:T\u007fL")).append(this.cfr_renamed_2);
        stringBuffer2.append(sprabl.cfr_renamed_9("\t|b8\u0011|\t")).append(this.cfr_renamed_0).append(sprdkg.cfr_renamed_9("L"));
        stringBuffer2.append(sprabl.cfr_renamed_9("|j.L)F9E(Xf\u000b")).append(this.cfr_renamed_1.cfr_renamed_2534().length).append(sprdkg.cfr_renamed_9("N1\u0001-\u0003>\u0002"));
        if (this.cfr_renamed_91 != null && this.cfr_renamed_91.cfr_renamed_2534().length > 0) {
            stringBuffer.append(sprabl.cfr_renamed_9("p\u000b")).append(this.cfr_renamed_91.cfr_renamed_2534().length).append(sprdkg.cfr_renamed_9("\u007f\u000b'\u001a-\u000f"));
        }
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer3.append(sprabl.cfr_renamed_9("\u000b\u0019E?D8B2Lf\u000b")).append(this.cfr_renamed_3);
        stringBuffer.append(sprdkg.cfr_renamed_9("\u007f-3\u000f,\u001d\u0013\u0001>\n:\u001ceN")).append(this.cfr_renamed_112);
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprqog(String string, String string2, String string3) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg1;
        sprqog sprqog2 = this;
        sprqog sprqog3 = this;
        sprqog3.cfr_renamed_3 = cfr_renamed_4;
        sprqog3.cfr_renamed_91 = null;
        sprqog2.cfr_renamed_119 = null;
        sprqog2.cfr_renamed_112 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprqog sprqog4 = this;
        sprqog4.cfr_renamed_0 = arg1;
        sprqog4.cfr_renamed_2 = arg0;
        sprqog sprqog5 = this;
        this.cfr_renamed_1 = new sprslg();
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprabl.cfr_renamed_9("\bC9\u000b9E?D8B2L|\t")).append((String)arg2).append(sprdkg.cfr_renamed_9("L\u007f\u0007,N1\u0001+N,\u001b/\u001e0\u001c+\u000b;@")).toString());
        }
        this.cfr_renamed_3 = arg2;
    }
}

