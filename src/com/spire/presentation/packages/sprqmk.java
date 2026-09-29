/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfjk;
import com.spire.presentation.packages.sprjvz;
import com.spire.presentation.packages.sprkaq;
import com.spire.presentation.packages.sprljk;
import com.spire.presentation.packages.sprnu;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class sprqmk {
    public sprfjk cfr_renamed_112;
    public sprnu cfr_renamed_119;
    public static final String cfr_renamed_91 = "ISO-8859-1";
    public ClassLoader cfr_renamed_0;
    public String cfr_renamed_1;
    public final String cfr_renamed_2;
    public final String cfr_renamed_3;
    public sprfjk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqmk(String string, String string2, Object[] objectArray) throws NullPointerException {
        void arg0;
        void arg2;
        void arg1;
        sprqmk sprqmk2 = this;
        sprqmk sprqmk3 = this;
        sprqmk3.cfr_renamed_1 = cfr_renamed_91;
        sprqmk3.cfr_renamed_4 = null;
        sprqmk2.cfr_renamed_119 = null;
        sprqmk2.cfr_renamed_0 = null;
        if (string == null || arg1 == null || arg2 == null) {
            throw new NullPointerException();
        }
        sprqmk sprqmk4 = this;
        sprqmk4.cfr_renamed_3 = arg1;
        sprqmk4.cfr_renamed_2 = arg0;
        sprqmk sprqmk5 = this;
        this.cfr_renamed_112 = new sprfjk((Object[])arg2);
    }

    public ClassLoader cfr_renamed_2523() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_9619(sprnu arg0) {
        sprqmk sprqmk2 = this;
        sprqmk2.cfr_renamed_112.cfr_renamed_9619(arg0);
        if (sprqmk2.cfr_renamed_4 != null) {
            this.cfr_renamed_4.cfr_renamed_9619(arg0);
        }
        this.cfr_renamed_119 = arg0;
    }

    public Object[] cfr_renamed_2537() {
        if (this.cfr_renamed_4 == null) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_2534();
    }

    public String cfr_renamed_2524() {
        return this.cfr_renamed_2;
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = stringBuffer = new StringBuffer();
        stringBuffer.append(sprjvz.cfr_renamed_9("{VZ\\\\AJV\u0013\u0013\u000b")).append(this.cfr_renamed_2);
        stringBuffer2.append(sprkaq.cfr_renamed_9("M9&}U9M")).append(this.cfr_renamed_3).append(sprjvz.cfr_renamed_9("\u000b"));
        stringBuffer2.append(sprkaq.cfr_renamed_9("9.k\bl\u0002|\u0001m\u001c#O")).append(this.cfr_renamed_112.cfr_renamed_2534().length).append(sprjvz.cfr_renamed_9("\t]FADRE"));
        if (this.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_2534().length > 0) {
            stringBuffer.append(sprkaq.cfr_renamed_9("5O")).append(this.cfr_renamed_4.cfr_renamed_2534().length).append(sprjvz.cfr_renamed_9("\u0013LK]AH"));
        }
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer3.append(sprkaq.cfr_renamed_9("O\\\u0001z\u0000}\u0006w\b#O")).append(this.cfr_renamed_1);
        stringBuffer.append(sprjvz.cfr_renamed_9("\u0013j_H@Z\u007fFRMV[\t\t")).append(this.cfr_renamed_0);
        return stringBuffer3.toString();
    }

    public Object[] cfr_renamed_2534() {
        return this.cfr_renamed_112.cfr_renamed_2534();
    }

    /*
     * WARNING - void declaration
     */
    public sprqmk(String string, String string2, String string3) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg1;
        sprqmk sprqmk2 = this;
        sprqmk sprqmk3 = this;
        sprqmk3.cfr_renamed_1 = cfr_renamed_91;
        sprqmk3.cfr_renamed_4 = null;
        sprqmk2.cfr_renamed_119 = null;
        sprqmk2.cfr_renamed_0 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprqmk sprqmk4 = this;
        sprqmk4.cfr_renamed_3 = arg1;
        sprqmk4.cfr_renamed_2 = arg0;
        sprqmk sprqmk5 = this;
        this.cfr_renamed_112 = new sprfjk();
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprkaq.cfr_renamed_9("M\u0007|O|\u0001z\u0000}\u0006w\b9M")).append((String)arg2).append(sprjvz.cfr_renamed_9("\u000b\u0013@@\t]FG\t@\\CY\\[GLW\u0007")).toString());
        }
        this.cfr_renamed_1 = arg2;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_291(Object[] arg0) {
        if (arg0 != null) {
            this.cfr_renamed_4 = new sprfjk(arg0);
            this.cfr_renamed_4.cfr_renamed_9619(this.cfr_renamed_119);
            return;
        }
        this.cfr_renamed_4 = null;
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

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 2;
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

    /*
     * WARNING - void declaration
     */
    public sprqmk(String string, String string2) throws NullPointerException {
        void arg0;
        void arg1;
        sprqmk sprqmk2 = this;
        sprqmk sprqmk3 = this;
        sprqmk3.cfr_renamed_1 = cfr_renamed_91;
        sprqmk3.cfr_renamed_4 = null;
        sprqmk2.cfr_renamed_119 = null;
        sprqmk2.cfr_renamed_0 = null;
        if (string == null || arg1 == null) {
            throw new NullPointerException();
        }
        sprqmk sprqmk4 = this;
        sprqmk4.cfr_renamed_3 = arg1;
        sprqmk4.cfr_renamed_2 = arg0;
        sprqmk sprqmk5 = this;
        this.cfr_renamed_112 = new sprfjk();
    }

    public void cfr_renamed_2533(ClassLoader arg0) {
        this.cfr_renamed_0 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String cfr_renamed_2521(String arg0, Locale arg1, TimeZone arg2) throws sprljk {
        String string = this.cfr_renamed_3;
        if (arg0 != null) {
            string = new StringBuilder().insert(0, string).append(".").append(arg0).toString();
        }
        try {
            ResourceBundle resourceBundle;
            ResourceBundle resourceBundle2;
            String string2 = (this.cfr_renamed_0 == null ? (resourceBundle2 = ResourceBundle.getBundle(this.cfr_renamed_2, arg1)) : (resourceBundle = ResourceBundle.getBundle(this.cfr_renamed_2, arg1, this.cfr_renamed_0))).getString(string);
            if (!this.cfr_renamed_1.equals(cfr_renamed_91)) {
                string2 = new String(string2.getBytes(cfr_renamed_91), this.cfr_renamed_1);
            }
            if (this.cfr_renamed_112.cfr_renamed_29()) return this.cfr_renamed_2531(string2, arg1);
            sprqmk sprqmk2 = this;
            string2 = sprqmk2.cfr_renamed_2536(string2, sprqmk2.cfr_renamed_112.cfr_renamed_2532(arg1), arg1, arg2);
            return this.cfr_renamed_2531(string2, arg1);
        }
        catch (MissingResourceException missingResourceException) {
            ClassLoader classLoader;
            String string3 = new StringBuilder().insert(0, sprkaq.cfr_renamed_9(",x\u0001>\u001b9\tp\u0001}O|\u0001m\u001d`O")).append(string).append(sprjvz.cfr_renamed_9("\u0013@]\tAL@FF[PL\u0013OZEV\t")).append(this.cfr_renamed_2).append(".").toString();
            sprqmk sprqmk3 = this;
            if (this.cfr_renamed_0 != null) {
                classLoader = sprqmk3.cfr_renamed_0;
                throw new sprljk(string3, this.cfr_renamed_2, string, arg1, classLoader);
            }
            classLoader = sprqmk3.cfr_renamed_2523();
            throw new sprljk(string3, this.cfr_renamed_2, string, arg1, classLoader);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        }
    }

    public sprnu cfr_renamed_2530() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprqmk(String string, String string2, String string3, Object[] objectArray) throws NullPointerException, UnsupportedEncodingException {
        void arg2;
        void arg0;
        void arg3;
        void arg1;
        sprqmk sprqmk2 = this;
        sprqmk sprqmk3 = this;
        sprqmk3.cfr_renamed_1 = cfr_renamed_91;
        sprqmk3.cfr_renamed_4 = null;
        sprqmk2.cfr_renamed_119 = null;
        sprqmk2.cfr_renamed_0 = null;
        if (string == null || arg1 == null || arg3 == null) {
            throw new NullPointerException();
        }
        sprqmk sprqmk4 = this;
        sprqmk4.cfr_renamed_3 = arg1;
        sprqmk4.cfr_renamed_2 = arg0;
        sprqmk sprqmk5 = this;
        this.cfr_renamed_112 = new sprfjk((Object[])arg3);
        if (!Charset.isSupported((String)arg2)) {
            throw new UnsupportedEncodingException(new StringBuilder().insert(0, sprkaq.cfr_renamed_9("M\u0007|O|\u0001z\u0000}\u0006w\b9M")).append((String)arg2).append(sprjvz.cfr_renamed_9("\u000b\u0013@@\t]FG\t@\\CY\\[GLW\u0007")).toString());
        }
        this.cfr_renamed_1 = arg2;
    }

    public void cfr_renamed_2535(Object arg0) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        this.cfr_renamed_291(objectArray);
    }

    public String cfr_renamed_2531(String arg0, Locale arg1) {
        if (this.cfr_renamed_4 != null) {
            int n;
            StringBuffer stringBuffer = new StringBuffer(arg0);
            Object[] objectArray = this.cfr_renamed_4.cfr_renamed_2532(arg1);
            int n2 = n = 0;
            while (n2 < objectArray.length) {
                stringBuffer.append(objectArray[n++]);
                n2 = n;
            }
            arg0 = stringBuffer.toString();
        }
        return arg0;
    }
}

