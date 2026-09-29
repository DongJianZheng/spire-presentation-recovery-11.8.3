/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprmcd;
import com.spire.presentation.packages.sprqbd;
import com.spire.presentation.packages.sprqc;
import com.spire.presentation.packages.sprtks;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class sprktc {
    public static final String cfr_renamed_112 = "ISO-8859-1";
    public ClassLoader cfr_renamed_119;
    public sprqc cfr_renamed_91;
    public String cfr_renamed_0;
    public final String cfr_renamed_1;
    public sprmcd cfr_renamed_2;
    public final String cfr_renamed_3;
    public sprmcd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprktc(String string, String string2, String string3) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg1;
        sprktc sprktc2 = this;
        sprktc sprktc3 = this;
        sprktc3.cfr_renamed_0 = cfr_renamed_112;
        sprktc3.cfr_renamed_2 = null;
        sprktc2.cfr_renamed_91 = null;
        sprktc2.cfr_renamed_119 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprktc sprktc4 = this;
        sprktc4.cfr_renamed_1 = arg1;
        sprktc4.cfr_renamed_3 = arg0;
        sprktc sprktc5 = this;
        this.cfr_renamed_4 = new sprmcd(this);
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprdyg.cfr_renamed_9("d\u001aURU\u001cS\u001dT\u001b^\u0015\u0010P")).append((String)arg2).append(sprtks.cfr_renamed_9("05{f2{}a2fgebz`awq<")).toString());
        }
        this.cfr_renamed_0 = arg2;
    }

    public void cfr_renamed_291(Object[] arg0) {
        if (arg0 != null) {
            this.cfr_renamed_2 = new sprmcd(this, arg0);
            this.cfr_renamed_2.cfr_renamed_2529(this.cfr_renamed_91);
            return;
        }
        this.cfr_renamed_2 = null;
    }

    public sprqc cfr_renamed_2530() {
        return this.cfr_renamed_91;
    }

    public String cfr_renamed_2531(String arg0, Locale arg1) {
        if (this.cfr_renamed_2 != null) {
            int n;
            StringBuffer stringBuffer = new StringBuffer(arg0);
            Object[] objectArray = this.cfr_renamed_2.cfr_renamed_2532(arg1);
            int n2 = n = 0;
            while (n2 < objectArray.length) {
                stringBuffer.append(objectArray[n++]);
                n2 = n;
            }
            arg0 = stringBuffer.toString();
        }
        return arg0;
    }

    public void cfr_renamed_2533(ClassLoader arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_119;
    }

    public Object[] cfr_renamed_2534() {
        return this.cfr_renamed_4.cfr_renamed_2534();
    }

    /*
     * WARNING - void declaration
     */
    public sprktc(String string, String string2) throws NullPointerException {
        void arg0;
        void arg1;
        sprktc sprktc2 = this;
        sprktc sprktc3 = this;
        sprktc3.cfr_renamed_0 = cfr_renamed_112;
        sprktc3.cfr_renamed_2 = null;
        sprktc2.cfr_renamed_91 = null;
        sprktc2.cfr_renamed_119 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprktc sprktc4 = this;
        sprktc4.cfr_renamed_1 = arg1;
        sprktc4.cfr_renamed_3 = arg0;
        sprktc sprktc5 = this;
        this.cfr_renamed_4 = new sprmcd(this);
    }

    public String cfr_renamed_2524() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_2535(Object arg0) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        this.cfr_renamed_291(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprktc(String string, String string2, String string3, Object[] objectArray) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg3;
        void arg1;
        sprktc sprktc2 = this;
        sprktc sprktc3 = this;
        sprktc3.cfr_renamed_0 = cfr_renamed_112;
        sprktc3.cfr_renamed_2 = null;
        sprktc2.cfr_renamed_91 = null;
        sprktc2.cfr_renamed_119 = null;
        if (string == null || arg1 == null || arg3 == null) {
            throw new NullPointerException();
        }
        sprktc sprktc4 = this;
        sprktc4.cfr_renamed_1 = arg1;
        sprktc4.cfr_renamed_3 = arg0;
        sprktc sprktc5 = this;
        this.cfr_renamed_4 = new sprmcd(this, (Object[])arg3);
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprdyg.cfr_renamed_9("d\u001aURU\u001cS\u001dT\u001b^\u0015\u0010P")).append((String)arg2).append(sprtks.cfr_renamed_9("05{f2{}a2fgebz`awq<")).toString());
        }
        this.cfr_renamed_0 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprktc(String string, String string2, Object[] objectArray) throws NullPointerException {
        void arg0;
        void arg2;
        void arg1;
        sprktc sprktc2 = this;
        sprktc sprktc3 = this;
        sprktc3.cfr_renamed_0 = cfr_renamed_112;
        sprktc3.cfr_renamed_2 = null;
        sprktc2.cfr_renamed_91 = null;
        sprktc2.cfr_renamed_119 = null;
        if (string == null || arg1 == null || arg2 == null) {
            throw new NullPointerException();
        }
        sprktc sprktc4 = this;
        sprktc4.cfr_renamed_1 = arg1;
        sprktc4.cfr_renamed_3 = arg0;
        sprktc sprktc5 = this;
        this.cfr_renamed_4 = new sprmcd(this, (Object[])arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String cfr_renamed_2521(String arg0, Locale arg1, TimeZone arg2) throws sprqbd {
        String string = this.cfr_renamed_1;
        if (arg0 != null) {
            string = new StringBuilder().insert(0, string).append(".").append(arg0).toString();
        }
        try {
            ResourceBundle resourceBundle;
            ResourceBundle resourceBundle2;
            String string2 = (this.cfr_renamed_119 == null ? (resourceBundle2 = ResourceBundle.getBundle(this.cfr_renamed_3, arg1)) : (resourceBundle = ResourceBundle.getBundle(this.cfr_renamed_3, arg1, this.cfr_renamed_119))).getString(string);
            if (!this.cfr_renamed_0.equals(cfr_renamed_112)) {
                string2 = new String(string2.getBytes(cfr_renamed_112), this.cfr_renamed_0);
            }
            if (this.cfr_renamed_4.cfr_renamed_29()) return this.cfr_renamed_2531(string2, arg1);
            sprktc sprktc2 = this;
            string2 = sprktc2.cfr_renamed_2536(string2, sprktc2.cfr_renamed_4.cfr_renamed_2532(arg1), arg1, arg2);
            return this.cfr_renamed_2531(string2, arg1);
        }
        catch (MissingResourceException missingResourceException) {
            ClassLoader classLoader;
            String string3 = new StringBuilder().insert(0, sprdyg.cfr_renamed_9("1Q\u001c\u0017\u0006\u0010\u0014Y\u001cTRU\u001cD\u0000IR")).append(string).append(sprtks.cfr_renamed_9("5{{2gwf}``vw5t|~p2")).append(this.cfr_renamed_3).append(".").toString();
            sprktc sprktc3 = this;
            if (this.cfr_renamed_119 != null) {
                classLoader = sprktc3.cfr_renamed_119;
                throw new sprqbd(string3, this.cfr_renamed_3, string, arg1, classLoader);
            }
            classLoader = sprktc3.cfr_renamed_2523();
            throw new sprqbd(string3, this.cfr_renamed_3, string, arg1, classLoader);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
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

    public String cfr_renamed_19() {
        return this.cfr_renamed_1;
    }

    public Object[] cfr_renamed_2537() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        return this.cfr_renamed_2.cfr_renamed_2534();
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer.append(sprdyg.cfr_renamed_9(" U\u0001_\u0007B\u0011UH\u0010P")).append(this.cfr_renamed_3);
        stringBuffer2.append(sprtks.cfr_renamed_9("05[q(50")).append(this.cfr_renamed_1).append(sprdyg.cfr_renamed_9("P"));
        stringBuffer2.append(sprtks.cfr_renamed_9("5Sgu`\u007fp|aa/2")).append(this.cfr_renamed_4.cfr_renamed_2534().length).append(sprdyg.cfr_renamed_9("R^\u001dB\u001fQ\u001e"));
        if (this.cfr_renamed_2 != null && this.cfr_renamed_2.cfr_renamed_2534().length > 0) {
            stringBuffer.append(sprtks.cfr_renamed_9("92")).append(this.cfr_renamed_2.cfr_renamed_2534().length).append(sprdyg.cfr_renamed_9("\u0010\u0017H\u0006B\u0013"));
        }
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer3.append(sprtks.cfr_renamed_9("2P|v}q{{u/2")).append(this.cfr_renamed_0);
        stringBuffer.append(sprdyg.cfr_renamed_9("\u00101\\\u0013C\u0001|\u001dQ\u0016U\u0000\nR")).append(this.cfr_renamed_119);
        return stringBuffer3.toString();
    }

    public void cfr_renamed_2529(sprqc arg0) {
        sprktc sprktc2 = this;
        sprktc2.cfr_renamed_4.cfr_renamed_2529(arg0);
        if (sprktc2.cfr_renamed_2 != null) {
            this.cfr_renamed_2.cfr_renamed_2529(arg0);
        }
        this.cfr_renamed_91 = arg0;
    }
}

