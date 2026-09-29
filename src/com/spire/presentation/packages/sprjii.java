/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraam;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgjm;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprian;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmfka;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpgaa;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvem;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprjii
extends sprqqe {
    public static final sprlem cfr_renamed_134;
    public static final sprlem cfr_renamed_954;
    private Vector cfr_renamed_805;
    public static final sprlem cfr_renamed_131;
    public static final sprlem cfr_renamed_722;
    public static final sprlem cfr_renamed_955;
    private spraam cfr_renamed_1228;
    public static final sprlem cfr_renamed_1260;
    private boolean cfr_renamed_499;
    public static final sprlem cfr_renamed_135;
    public static final sprlem cfr_renamed_956;
    public static final sprlem cfr_renamed_952;
    public static final sprlem cfr_renamed_728;
    public static final sprlem cfr_renamed_128;
    public static final sprlem cfr_renamed_957;
    public static final sprlem cfr_renamed_314;
    public static final sprlem cfr_renamed_951;
    public static final Hashtable cfr_renamed_84;
    public static boolean cfr_renamed_723;
    public static final sprlem cfr_renamed_1226;
    private static final Boolean cfr_renamed_287;
    public static final sprlem cfr_renamed_724;
    public static final sprlem cfr_renamed_953;
    public static final sprlem cfr_renamed_133;
    public static final Hashtable cfr_renamed_185;
    public static final sprlem spr\ufe34;
    public static final Hashtable cfr_renamed_82;
    public static final Hashtable cfr_renamed_126;
    private static final Boolean cfr_renamed_88;
    public static final sprlem cfr_renamed_31;
    public static final sprlem cfr_renamed_272;
    public static final sprlem cfr_renamed_145;
    public static final sprlem cfr_renamed_114;
    public static final sprlem cfr_renamed_96;
    private int cfr_renamed_105;
    public static final Hashtable cfr_renamed_137;
    public static final sprlem cfr_renamed_79;
    public static final sprlem cfr_renamed_107;
    public static final sprlem cfr_renamed_132;
    public static final sprlem cfr_renamed_102;
    public static final Hashtable cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    public static final sprlem cfr_renamed_152;
    public static final sprlem cfr_renamed_112;
    public static final sprlem cfr_renamed_119;
    public static final sprlem cfr_renamed_91;
    public static final sprlem cfr_renamed_0;
    private sprszm cfr_renamed_1;
    private Vector cfr_renamed_2;
    private Vector cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    public sprjii(boolean arg0, Hashtable arg1, String arg2) {
        this(arg0, arg1, arg2, new sprvem());
    }

    /*
     * WARNING - void declaration
     */
    public sprjii(boolean bl, Hashtable hashtable, String string, spraam spraam2) {
        void arg0;
        Object object;
        Object object2;
        void arg2;
        sprjii sprjii2 = this;
        this.cfr_renamed_1228 = null;
        sprjii sprjii3 = this;
        this.cfr_renamed_3 = new Vector();
        sprjii2.cfr_renamed_805 = new Vector();
        sprjii2.cfr_renamed_2 = new Vector();
        sprjii2.cfr_renamed_1228 = spraam2;
        sprgjm sprgjm2 = new sprgjm((String)arg2);
        while (sprgjm2.cfr_renamed_4444()) {
            void arg1;
            object2 = sprgjm2.cfr_renamed_4445();
            if (((String)object2).indexOf(43) > 0) {
                Object object3 = object = new sprgjm((String)object2, '+');
                Object object4 = object3;
                this.cfr_renamed_4459((Hashtable)arg1, ((sprgjm)object3).cfr_renamed_4445(), cfr_renamed_88);
                while (((sprgjm)object4).cfr_renamed_4444()) {
                    Object object5 = object;
                    object4 = object5;
                    this.cfr_renamed_4459((Hashtable)arg1, ((sprgjm)object5).cfr_renamed_4445(), cfr_renamed_287);
                }
                continue;
            }
            this.cfr_renamed_4459((Hashtable)arg1, (String)object2, cfr_renamed_88);
        }
        if (arg0 != false) {
            int n;
            object2 = new Vector();
            object = new Vector();
            Vector vector = new Vector();
            int n2 = 1;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_3.size()) {
                Object object6 = object2;
                if (((Boolean)this.cfr_renamed_2.elementAt(n)).booleanValue()) {
                    ((Vector)object6).insertElementAt(this.cfr_renamed_3.elementAt(n), n2);
                    sprjii sprjii4 = this;
                    ((Vector)object).insertElementAt(sprjii4.cfr_renamed_805.elementAt(n), n2);
                    vector.insertElementAt(sprjii4.cfr_renamed_2.elementAt(n), n2++);
                } else {
                    ((Vector)object6).insertElementAt(this.cfr_renamed_3.elementAt(n), 0);
                    sprjii sprjii5 = this;
                    ((Vector)object).insertElementAt(sprjii5.cfr_renamed_805.elementAt(n), 0);
                    vector.insertElementAt(sprjii5.cfr_renamed_2.elementAt(n), 0);
                    n2 = 1;
                }
                n3 = ++n;
            }
            sprjii sprjii6 = this;
            sprjii6.cfr_renamed_3 = object2;
            sprjii6.cfr_renamed_805 = object;
            this.cfr_renamed_2 = vector;
        }
    }

    private /* synthetic */ String cfr_renamed_4455(String arg0) {
        int n;
        if (arg0.length() == 0 || arg0.indexOf(92) < 0 && arg0.indexOf(34) < 0) {
            return arg0.trim();
        }
        char[] cArray = arg0.toCharArray();
        boolean bl = false;
        boolean bl2 = false;
        StringBuffer stringBuffer = new StringBuffer(arg0.length());
        int n2 = 0;
        if (cArray[0] == '\\' && cArray[1] == '#') {
            n2 = 2;
            stringBuffer.append(sprpgaa.cfr_renamed_9("9\""));
        }
        boolean bl3 = false;
        int n3 = 0;
        int n4 = n = n2;
        while (n4 != cArray.length) {
            char c = cArray[n];
            if (c != ' ') {
                bl3 = true;
            }
            if (c == '\"') {
                if (!bl) {
                    bl2 = !bl2;
                } else {
                    stringBuffer.append(c);
                }
                bl = false;
            } else if (c == '\\' && !bl && !bl2) {
                bl = true;
                n3 = stringBuffer.length();
            } else if (c != ' ' || bl || bl3) {
                stringBuffer.append(c);
                bl = false;
            }
            n4 = ++n;
        }
        if (stringBuffer.length() > 0) {
            StringBuffer stringBuffer2 = stringBuffer;
            while (stringBuffer2.charAt(stringBuffer.length() - 1) == ' ' && n3 != stringBuffer.length() - 1) {
                StringBuffer stringBuffer3 = stringBuffer;
                stringBuffer2 = stringBuffer3;
                stringBuffer3.setLength(stringBuffer3.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprjii(Vector vector, Vector vector2, spraam spraam2) {
        void arg0;
        int n;
        void arg1;
        void arg2;
        sprjii sprjii2 = this;
        this.cfr_renamed_1228 = null;
        sprjii sprjii3 = this;
        this.cfr_renamed_3 = new Vector();
        sprjii2.cfr_renamed_805 = new Vector();
        sprjii2.cfr_renamed_2 = new Vector();
        sprjii2.cfr_renamed_1228 = arg2;
        if (vector.size() != arg1.size()) {
            throw new IllegalArgumentException(sprmfka.cfr_renamed_9("U\\^F\u001aC_VNZH\u0015W@IA\u001aW_\u0015ITWP\u001aY_[]AR\u0015[F\u001aC[YOPI\u001b"));
        }
        int n2 = n = 0;
        while (n2 < arg0.size()) {
            sprjii sprjii4 = this;
            sprjii4.cfr_renamed_3.addElement(arg0.elementAt(n));
            sprjii4.cfr_renamed_805.addElement(arg1.elementAt(n));
            sprjii4.cfr_renamed_2.addElement(cfr_renamed_88);
            n2 = ++n;
        }
    }

    @Override
    public boolean equals(Object arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        sprjii sprjii2;
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprjii) && !(arg0 instanceof sprszm)) {
            return false;
        }
        sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().cfr_renamed_5078(sprxgf2)) {
            return true;
        }
        try {
            sprjii2 = sprjii.cfr_renamed_23(arg0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        int n6 = this.cfr_renamed_3.size();
        if (n6 != sprjii2.cfr_renamed_3.size()) {
            return false;
        }
        boolean[] blArray = new boolean[n6];
        if (this.cfr_renamed_3.elementAt(0).equals(sprjii2.cfr_renamed_3.elementAt(0))) {
            n5 = 0;
            n4 = n6;
            n3 = 1;
            n2 = n5;
        } else {
            n5 = n6 - 1;
            n4 = -1;
            n3 = -1;
            n2 = n5;
        }
        int n7 = n = n2;
        while (n7 != n4) {
            boolean bl;
            block12: {
                int n8;
                boolean bl2 = false;
                sprlem sprlem2 = (sprlem)this.cfr_renamed_3.elementAt(n);
                String string = (String)this.cfr_renamed_805.elementAt(n);
                int n9 = n8 = 0;
                while (n9 < n6) {
                    String string2;
                    sprlem sprlem3;
                    if (!blArray[n8] && sprlem2.cfr_renamed_5078(sprlem3 = (sprlem)sprjii2.cfr_renamed_3.elementAt(n8)) && this.cfr_renamed_4453(string, string2 = (String)sprjii2.cfr_renamed_805.elementAt(n8))) {
                        blArray[n8] = true;
                        bl = bl2 = true;
                        break block12;
                    }
                    n9 = ++n8;
                }
                bl = bl2;
            }
            if (!bl) {
                return false;
            }
            n7 = n + n3;
        }
        return true;
    }

    public Vector cfr_renamed_205() {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_805.size()) {
            vector.addElement(this.cfr_renamed_805.elementAt(n++));
            n2 = n;
        }
        return vector;
    }

    public Vector cfr_renamed_4461() {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            vector.addElement(this.cfr_renamed_3.elementAt(n++));
            n2 = n;
        }
        return vector;
    }

    public sprjii() {
        sprjii sprjii2 = this;
        this.cfr_renamed_1228 = null;
        sprjii sprjii3 = this;
        sprjii2.cfr_renamed_3 = new Vector();
        sprjii3.cfr_renamed_805 = new Vector();
        sprjii2.cfr_renamed_2 = new Vector();
    }

    public String cfr_renamed_4454(boolean arg0, Hashtable arg1) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        Vector<StringBuffer> vector = new Vector<StringBuffer>();
        boolean bl = true;
        StringBuffer stringBuffer2 = null;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            if (((Boolean)this.cfr_renamed_2.elementAt(n)).booleanValue()) {
                StringBuffer stringBuffer3 = stringBuffer2;
                stringBuffer3.append('+');
                sprjii sprjii2 = this;
                sprjii2.cfr_renamed_11121(stringBuffer3, arg1, (sprlem)sprjii2.cfr_renamed_3.elementAt(n), (String)this.cfr_renamed_805.elementAt(n));
            } else {
                stringBuffer2 = new StringBuffer();
                sprjii sprjii3 = this;
                sprjii3.cfr_renamed_11121(stringBuffer2, arg1, (sprlem)sprjii3.cfr_renamed_3.elementAt(n), (String)this.cfr_renamed_805.elementAt(n));
                vector.addElement(stringBuffer2);
            }
            n2 = ++n;
        }
        if (arg0) {
            int n3 = n = vector.size() - 1;
            while (n3 >= 0) {
                StringBuffer stringBuffer4;
                if (bl) {
                    bl = false;
                    stringBuffer4 = stringBuffer;
                } else {
                    StringBuffer stringBuffer5 = stringBuffer;
                    stringBuffer4 = stringBuffer5;
                    stringBuffer5.append(',');
                }
                stringBuffer4.append(vector.elementAt(n--).toString());
                n3 = n;
            }
        } else {
            int n4 = n = 0;
            while (n4 < vector.size()) {
                StringBuffer stringBuffer6;
                if (bl) {
                    bl = false;
                    stringBuffer6 = stringBuffer;
                } else {
                    StringBuffer stringBuffer7 = stringBuffer;
                    stringBuffer6 = stringBuffer7;
                    stringBuffer7.append(',');
                }
                stringBuffer6.append(vector.elementAt(n++).toString());
                n4 = n;
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_1 == null) {
            int n;
            sprrvm sprrvm2 = new sprrvm();
            sprrvm sprrvm3 = new sprrvm();
            sprlem sprlem2 = null;
            int n2 = n = 0;
            while (n2 != this.cfr_renamed_3.size()) {
                sprlem sprlem3;
                sprrvm sprrvm4 = new sprrvm(2);
                sprlem sprlem4 = (sprlem)this.cfr_renamed_3.elementAt(n);
                sprrvm4.cfr_renamed_5004(sprlem4);
                String string = (String)this.cfr_renamed_805.elementAt(n);
                sprrvm4.cfr_renamed_5004(this.cfr_renamed_1228.cfr_renamed_11120(sprlem4, string));
                if (sprlem2 == null || ((Boolean)this.cfr_renamed_2.elementAt(n)).booleanValue()) {
                    sprrvm3.cfr_renamed_5004(new sprcen(sprrvm4));
                    sprlem3 = sprlem4;
                } else {
                    sprrvm2.cfr_renamed_5004(new sprocn(sprrvm3));
                    sprrvm3 = new sprrvm();
                    sprlem3 = sprlem4;
                    sprrvm3.cfr_renamed_5004(new sprcen(sprrvm4));
                }
                sprlem2 = sprlem3;
                n2 = ++n;
            }
            sprrvm2.cfr_renamed_5004(new sprocn(sprrvm3));
            this.cfr_renamed_1 = new sprcen(sprrvm2);
        }
        return this.cfr_renamed_1;
    }

    public sprjii(boolean arg0, String arg1) {
        this(arg0, cfr_renamed_126, arg1);
    }

    public sprjii(sprszm arg0) {
        sprjii sprjii2 = this;
        this.cfr_renamed_1228 = null;
        sprjii sprjii3 = this;
        sprjii2.cfr_renamed_3 = new Vector();
        sprjii3.cfr_renamed_805 = new Vector();
        sprjii2.cfr_renamed_2 = new Vector();
        this.cfr_renamed_1 = arg0;
        Enumeration enumeration = this.cfr_renamed_1.cfr_renamed_329();
        while (enumeration.hasMoreElements()) {
            int n;
            spridn spridn2 = spridn.cfr_renamed_23(((sprco)enumeration.nextElement()).cfr_renamed_119());
            int n2 = n = 0;
            while (n2 < spridn2.cfr_renamed_84()) {
                sprjii sprjii4;
                sprszm sprszm2 = sprszm.cfr_renamed_23(spridn2.cfr_renamed_85(n).cfr_renamed_119());
                if (sprszm2.cfr_renamed_84() != 2) {
                    throw new IllegalArgumentException(sprpgaa.cfr_renamed_9("\u0007`\u0001m\u001c!\u0016h\u001fd\u0001!\u0015`\fs"));
                }
                this.cfr_renamed_3.addElement(sprlem.cfr_renamed_23(sprszm2.cfr_renamed_85(0)));
                sprco sprco2 = sprszm2.cfr_renamed_85(1);
                if (!(sprco2 instanceof sprml) || sprco2 instanceof sprian) {
                    try {
                        this.cfr_renamed_805.addElement(new StringBuilder().insert(0, "#").append(this.cfr_renamed_4451(sprfqe.cfr_renamed_485(sprco2.cfr_renamed_119().cfr_renamed_104("DER")))).toString());
                        sprjii4 = this;
                    }
                    catch (IOException iOException) {
                        throw new IllegalArgumentException(sprmfka.cfr_renamed_9("V[[TZN\u0015_[YZ^P\u001aC[YOP"));
                    }
                } else {
                    String string = ((sprml)((Object)sprco2)).cfr_renamed_314();
                    if (string.length() > 0 && string.charAt(0) == '#') {
                        this.cfr_renamed_805.addElement(new StringBuilder().insert(0, "\\").append(string).toString());
                    } else {
                        this.cfr_renamed_805.addElement(string);
                    }
                    sprjii4 = this;
                }
                sprjii4.cfr_renamed_2.addElement(n != 0 ? cfr_renamed_287 : cfr_renamed_88);
                n2 = ++n;
            }
        }
    }

    public String toString() {
        return this.cfr_renamed_4454(cfr_renamed_723, cfr_renamed_137);
    }

    /*
     * WARNING - void declaration
     */
    public sprjii(Vector vector, Hashtable hashtable, spraam spraam2) {
        void arg1;
        int n;
        void arg2;
        sprjii sprjii2 = this;
        this.cfr_renamed_1228 = null;
        sprjii sprjii3 = this;
        this.cfr_renamed_3 = new Vector();
        sprjii2.cfr_renamed_805 = new Vector();
        sprjii2.cfr_renamed_2 = new Vector();
        sprjii2.cfr_renamed_1228 = arg2;
        if (vector != null) {
            void arg0;
            int n2 = n = 0;
            while (n2 != arg0.size()) {
                sprjii sprjii4 = this;
                sprjii4.cfr_renamed_3.addElement(arg0.elementAt(n));
                sprjii4.cfr_renamed_2.addElement(cfr_renamed_88);
                n2 = ++n;
            }
        } else {
            Enumeration enumeration;
            Enumeration enumeration2 = enumeration = arg1.keys();
            while (enumeration2.hasMoreElements()) {
                sprjii sprjii5 = this;
                Enumeration enumeration3 = enumeration;
                enumeration2 = enumeration3;
                sprjii5.cfr_renamed_3.addElement(enumeration3.nextElement());
                sprjii5.cfr_renamed_2.addElement(cfr_renamed_88);
            }
        }
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_3.size()) {
            sprlem sprlem2 = (sprlem)this.cfr_renamed_3.elementAt(n);
            if (arg1.get(sprlem2) == null) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprpgaa.cfr_renamed_9("O\n!\u0004u\u0011s\fc\u0010u\u0000!\u0003n\u0017!\nc\u000fd\u0006uEh\u0001!H!")).append(sprlem2.cfr_renamed_19()).append(sprmfka.cfr_renamed_9("\u0015\u0017\u0015JTIF_Q\u001aAU\u0015^\\IAS[]@SFRP^\u0015TTWP")).toString());
            }
            this.cfr_renamed_805.addElement(arg1.get(sprlem2));
            n3 = ++n;
        }
    }

    public sprjii(String arg0) {
        this(cfr_renamed_723, cfr_renamed_126, arg0);
    }

    public boolean cfr_renamed_4452(Object arg0, boolean arg1) {
        int n;
        sprjii sprjii2;
        if (!arg1) {
            return this.equals(arg0);
        }
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprjii) && !(arg0 instanceof sprszm)) {
            return false;
        }
        sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
        if (this.cfr_renamed_119().cfr_renamed_5078(sprxgf2)) {
            return true;
        }
        try {
            sprjii2 = sprjii.cfr_renamed_23(arg0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        int n2 = this.cfr_renamed_3.size();
        if (n2 != sprjii2.cfr_renamed_3.size()) {
            return false;
        }
        int n3 = n = 0;
        while (n3 < n2) {
            sprlem sprlem2;
            sprlem sprlem3 = (sprlem)this.cfr_renamed_3.elementAt(n);
            if (sprlem3.cfr_renamed_5078(sprlem2 = (sprlem)sprjii2.cfr_renamed_3.elementAt(n))) {
                String string;
                String string2 = (String)this.cfr_renamed_805.elementAt(n);
                if (!this.cfr_renamed_4453(string2, string = (String)sprjii2.cfr_renamed_805.elementAt(n))) {
                    return false;
                }
            } else {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxgf cfr_renamed_4450(String arg0) {
        try {
            return sprxgf.cfr_renamed_184(sprfqe.cfr_renamed_5216(arg0, 1, arg0.length() - 1));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprpgaa.cfr_renamed_9("\u0010o\u000eo\nv\u000b!\u0000o\u0006n\u0001h\u000bfEh\u000b!\u000b`\bd_!")).append(iOException).toString());
        }
    }

    private /* synthetic */ void cfr_renamed_4459(Hashtable arg0, String arg1, Boolean arg2) {
        sprgjm sprgjm2 = new sprgjm(arg1, '=');
        String string = sprgjm2.cfr_renamed_4445();
        if (!sprgjm2.cfr_renamed_4444()) {
            throw new IllegalArgumentException(sprmfka.cfr_renamed_9("XT^YC\u0015\\ZHX[ANP^\u0015^\\HPYAUGC\u0015IAH\\TR"));
        }
        String string2 = sprgjm2.cfr_renamed_4445();
        sprjii sprjii2 = this;
        sprlem sprlem2 = sprjii2.cfr_renamed_4460(string, arg0);
        sprjii2.cfr_renamed_3.addElement(sprlem2);
        sprjii2.cfr_renamed_805.addElement(this.cfr_renamed_4455(string2));
        sprjii2.cfr_renamed_2.addElement(arg2);
    }

    public sprjii(String arg0, spraam arg1) {
        this(cfr_renamed_723, cfr_renamed_126, arg0, arg1);
    }

    public static sprjii cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjii) {
            return (sprjii)arg0;
        }
        if (arg0 instanceof sprnbm) {
            return new sprjii(sprszm.cfr_renamed_23(((sprnbm)arg0).cfr_renamed_119()));
        }
        if (arg0 != null) {
            return new sprjii(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprlem cfr_renamed_4460(String arg0, Hashtable arg1) {
        if (sprkoe.cfr_renamed_116(arg0 = arg0.trim()).startsWith(sprpgaa.cfr_renamed_9("*H!/"))) {
            return new sprlem(arg0.substring(4));
        }
        if (arg0.charAt(0) >= '0' && arg0.charAt(0) <= '9') {
            return new sprlem(arg0);
        }
        sprlem sprlem2 = (sprlem)arg1.get(sprkoe.cfr_renamed_425(arg0));
        if (sprlem2 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmfka.cfr_renamed_9("o[Q[UBT\u0015UWPPYA\u001a\\^\u0015\u0017\u0015")).append(arg0).append(sprpgaa.cfr_renamed_9("!H!\u0015`\u0016r\u0000eEu\n!\u0001h\u0016u\fo\u0002t\fr\rd\u0001!\u000b`\bd")).toString());
        }
        return sprlem2;
    }

    @Override
    public int hashCode() {
        int n;
        if (this.cfr_renamed_499) {
            return this.cfr_renamed_105;
        }
        this.cfr_renamed_499 = true;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            String string = (String)this.cfr_renamed_805.elementAt(n);
            sprjii sprjii2 = this;
            string = sprjii2.cfr_renamed_4456(string);
            string = sprjii2.cfr_renamed_4457(string);
            sprjii2.cfr_renamed_105 ^= this.cfr_renamed_3.elementAt(n).hashCode();
            sprjii2.cfr_renamed_105 ^= string.hashCode();
            n2 = ++n;
        }
        return this.cfr_renamed_105;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_11121(StringBuffer arg0, Hashtable arg1, sprlem arg2, String arg3) {
        StringBuffer stringBuffer;
        String string = (String)arg1.get(arg2);
        if (string != null) {
            StringBuffer stringBuffer2 = arg0;
            stringBuffer = stringBuffer2;
            stringBuffer2.append(string);
        } else {
            StringBuffer stringBuffer3 = arg0;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(arg2.cfr_renamed_19());
        }
        stringBuffer.append('=');
        StringBuffer stringBuffer4 = arg0;
        int n = stringBuffer4.length();
        stringBuffer4.append(arg3);
        int n2 = arg0.length();
        if (arg3.length() >= 2 && arg3.charAt(0) == '\\' && arg3.charAt(1) == '#') {
            n += 2;
        }
        int n3 = n;
        while (n3 < n2 && arg0.charAt(n) == ' ') {
            int n4 = n;
            arg0.insert(n4, "\\");
            ++n2;
            n3 = n += 2;
        }
        while (--n2 > n && arg0.charAt(n2) == ' ') {
            arg0.insert(n2, '\\');
        }
        int n5 = n;
        block5: while (n5 <= n2) {
            switch (arg0.charAt(n)) {
                case '\"': 
                case '+': 
                case ',': 
                case ';': 
                case '<': 
                case '=': 
                case '>': 
                case '\\': {
                    int n6 = n;
                    arg0.insert(n6, "\\");
                    ++n2;
                    n5 = n += 2;
                    continue block5;
                }
            }
            n5 = ++n;
        }
        return;
    }

    private /* synthetic */ String cfr_renamed_4457(String arg0) {
        StringBuffer stringBuffer = new StringBuffer();
        if (arg0.length() != 0) {
            char c = arg0.charAt(0);
            stringBuffer.append(c);
            int n = 1;
            int n2 = n;
            while (n2 < arg0.length()) {
                char c2 = arg0.charAt(n);
                if (c != ' ' || c2 != ' ') {
                    stringBuffer.append(c2);
                }
                c = c2;
                n2 = ++n;
            }
        }
        return stringBuffer.toString();
    }

    public sprjii(Hashtable arg0) {
        this(null, arg0);
    }

    public sprjii(Vector arg0, Hashtable arg1) {
        this(arg0, arg1, (spraam)new sprvem());
    }

    public sprjii(boolean arg0, String arg1, spraam arg2) {
        this(arg0, cfr_renamed_126, arg1, arg2);
    }

    private /* synthetic */ boolean cfr_renamed_4453(String arg0, String arg1) {
        String string;
        sprjii sprjii2 = this;
        String string2 = sprjii2.cfr_renamed_4456(arg0);
        if (!string2.equals(string = sprjii2.cfr_renamed_4456(arg1))) {
            sprjii sprjii3 = this;
            if (!(string2 = sprjii3.cfr_renamed_4457(string2)).equals(string = sprjii3.cfr_renamed_4457(string))) {
                return false;
            }
        }
        return true;
    }

    public sprjii(Vector arg0, Vector arg1) {
        this(arg0, arg1, (spraam)new sprvem());
    }

    public Vector cfr_renamed_11122(sprlem arg0) {
        int n;
        Vector<String> vector = new Vector<String>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_805.size()) {
            if (this.cfr_renamed_3.elementAt(n).equals(arg0)) {
                String string = (String)this.cfr_renamed_805.elementAt(n);
                if (string.length() > 2 && string.charAt(0) == '\\' && string.charAt(1) == '#') {
                    vector.addElement(string.substring(1));
                } else {
                    vector.addElement(string);
                }
            }
            n2 = ++n;
        }
        return vector;
    }

    private /* synthetic */ String cfr_renamed_4456(String arg0) {
        sprxgf sprxgf2;
        String string = sprkoe.cfr_renamed_425(arg0.trim());
        if (string.length() > 0 && string.charAt(0) == '#' && (sprxgf2 = this.cfr_renamed_4450(string)) instanceof sprml) {
            string = sprkoe.cfr_renamed_425(((sprml)((Object)sprxgf2)).cfr_renamed_314().trim());
        }
        return string;
    }

    static {
        cfr_renamed_272 = new sprlem(sprmfka.cfr_renamed_9("\u0007\u0014\u0000\u0014\u0001\u0014\u0003"));
        cfr_renamed_951 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/T1"));
        cfr_renamed_722 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000b\u0004"));
        cfr_renamed_132 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/T3"));
        cfr_renamed_128 = new sprlem(sprmfka.cfr_renamed_9("\u0007\u0014\u0000\u0014\u0001\u0014\u0006"));
        cfr_renamed_134 = new sprlem(sprpgaa.cfr_renamed_9("3K4K5K4"));
        cfr_renamed_955 = new sprlem(sprmfka.cfr_renamed_9("\u0007\u0014\u0000\u0014\u0001\u0014\f"));
        cfr_renamed_79 = cfr_renamed_134;
        cfr_renamed_953 = new sprlem(sprpgaa.cfr_renamed_9("3K4K5K6"));
        cfr_renamed_0 = new sprlem(sprmfka.cfr_renamed_9("\u0007\u0014\u0000\u0014\u0001\u0014\r"));
        cfr_renamed_96 = new sprlem(sprpgaa.cfr_renamed_9("3K4K5K5"));
        cfr_renamed_152 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000e\u0007"));
        cfr_renamed_1260 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/Q2"));
        cfr_renamed_119 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000e\u0001"));
        cfr_renamed_112 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/Q4"));
        cfr_renamed_86 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000b\u0000"));
        cfr_renamed_954 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/T6"));
        cfr_renamed_107 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000e\u0003"));
        cfr_renamed_31 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/S4"));
        cfr_renamed_135 = new sprlem(sprmfka.cfr_renamed_9("\u0004\u0014\u0006\u0014\u0003\u0014\u0004\u0014\u0000\u0014\u0000\u0014\u0002\u0014\f\u0014\u0004"));
        cfr_renamed_956 = new sprlem(sprpgaa.cfr_renamed_9("0K2K7K0K4K4K6K8K3"));
        cfr_renamed_4 = new sprlem(sprmfka.cfr_renamed_9("\u0004\u0014\u0006\u0014\u0003\u0014\u0004\u0014\u0000\u0014\u0000\u0014\u0002\u0014\f\u0014\u0006"));
        cfr_renamed_952 = new sprlem(sprpgaa.cfr_renamed_9("0K2K7K0K4K4K6K8K5"));
        spr\ufe34 = new sprlem(sprmfka.cfr_renamed_9("\u0004\u0014\u0006\u0014\u0003\u0014\u0004\u0014\u0000\u0014\u0000\u0014\u0002\u0014\f\u0014\u0000"));
        cfr_renamed_133 = new sprlem(sprpgaa.cfr_renamed_9("0K2K2S/]/V/T5"));
        cfr_renamed_145 = new sprlem(sprmfka.cfr_renamed_9("\b\u001b\u000f\u001b\u000e\u001b\u000b\u0003"));
        cfr_renamed_724 = new sprlem(sprpgaa.cfr_renamed_9("W/P/Q/P5"));
        cfr_renamed_131 = sprhl.cfr_renamed_2941;
        cfr_renamed_957 = sprhl.cfr_renamed_3238;
        cfr_renamed_314 = sprdl.cfr_renamed_3243;
        cfr_renamed_102 = sprdl.cfr_renamed_3032;
        cfr_renamed_91 = sprdl.cfr_renamed_1604;
        cfr_renamed_114 = cfr_renamed_314;
        cfr_renamed_728 = new sprlem(sprmfka.cfr_renamed_9("\n\u001b\u0003\u001b\b\u0006\u000e\u0007\u0014\u0004\u0003\u0007\n\u0005\t\u0005\n\u001b\u000b\u0005\n\u001b\u000b\u001b\b\u0000"));
        cfr_renamed_1226 = new sprlem(sprpgaa.cfr_renamed_9("1K8K3V5W/T8W1U2U1K0U1K0K0"));
        cfr_renamed_723 = false;
        cfr_renamed_137 = new Hashtable();
        cfr_renamed_185 = new Hashtable();
        cfr_renamed_93 = new Hashtable();
        cfr_renamed_126 = new Hashtable();
        cfr_renamed_84 = cfr_renamed_137;
        cfr_renamed_82 = cfr_renamed_126;
        cfr_renamed_287 = new Boolean(true);
        cfr_renamed_88 = new Boolean(false);
        cfr_renamed_137.put(cfr_renamed_272, sprmfka.cfr_renamed_9("v"));
        cfr_renamed_137.put(cfr_renamed_951, sprpgaa.cfr_renamed_9("N"));
        cfr_renamed_137.put(cfr_renamed_132, sprmfka.cfr_renamed_9("a"));
        cfr_renamed_137.put(cfr_renamed_722, sprpgaa.cfr_renamed_9("*T"));
        cfr_renamed_137.put(cfr_renamed_128, sprmfka.cfr_renamed_9("y{"));
        cfr_renamed_137.put(cfr_renamed_953, sprpgaa.cfr_renamed_9("M"));
        cfr_renamed_137.put(cfr_renamed_0, sprmfka.cfr_renamed_9("ia"));
        cfr_renamed_137.put(cfr_renamed_134, sprpgaa.cfr_renamed_9("6D7H$M+T(C S"));
        cfr_renamed_137.put(cfr_renamed_314, sprmfka.cfr_renamed_9("p"));
        cfr_renamed_137.put(cfr_renamed_728, sprpgaa.cfr_renamed_9("!B"));
        cfr_renamed_137.put(cfr_renamed_1226, sprmfka.cfr_renamed_9("`sq"));
        cfr_renamed_137.put(cfr_renamed_955, sprpgaa.cfr_renamed_9("6U7D U"));
        cfr_renamed_137.put(cfr_renamed_96, sprmfka.cfr_renamed_9("fogttwp"));
        cfr_renamed_137.put(cfr_renamed_152, sprpgaa.cfr_renamed_9("F,W O+@(D"));
        cfr_renamed_137.put(cfr_renamed_1260, sprmfka.cfr_renamed_9("s{sastvf"));
        cfr_renamed_137.put(cfr_renamed_119, sprpgaa.cfr_renamed_9("\"D+D7@1H*O"));
        cfr_renamed_137.put(cfr_renamed_91, sprmfka.cfr_renamed_9("@TFNGOVN@HP^t^QHPIF"));
        cfr_renamed_137.put(cfr_renamed_102, sprpgaa.cfr_renamed_9("\u0010o\u0016u\u0017t\u0006u\u0010s\u0000e+`\bd"));
        cfr_renamed_137.put(cfr_renamed_112, sprmfka.cfr_renamed_9("o[SDOPsQ_[N\\\\\\_G"));
        cfr_renamed_137.put(cfr_renamed_107, sprpgaa.cfr_renamed_9("!O"));
        cfr_renamed_137.put(cfr_renamed_31, sprmfka.cfr_renamed_9("eIPOQU[CX"));
        cfr_renamed_137.put(cfr_renamed_145, sprpgaa.cfr_renamed_9("Q\nr\u0011`\t@\u0001e\u0017d\u0016r"));
        cfr_renamed_137.put(cfr_renamed_133, sprmfka.cfr_renamed_9("{[X_tNwSGN]"));
        cfr_renamed_137.put(cfr_renamed_952, sprpgaa.cfr_renamed_9("&n\u0010o\u0011s\u001cN\u0003B\fu\f{\u0000o\u0016i\fq"));
        cfr_renamed_137.put(spr\ufe34, sprmfka.cfr_renamed_9("yZO[NGCz\\g_FSQ_[YP"));
        cfr_renamed_137.put(cfr_renamed_4, sprpgaa.cfr_renamed_9("\"d\u000be\u0000s"));
        cfr_renamed_137.put(cfr_renamed_956, sprmfka.cfr_renamed_9("jY[V_z\\wSGN]"));
        cfr_renamed_137.put(cfr_renamed_135, sprpgaa.cfr_renamed_9("E\u0004u\u0000N\u0003C\fs\u0011i"));
        cfr_renamed_137.put(cfr_renamed_954, sprmfka.cfr_renamed_9("jZIA[YyZ^P"));
        cfr_renamed_137.put(cfr_renamed_86, sprpgaa.cfr_renamed_9("'t\u0016h\u000bd\u0016r&`\u0011d\u0002n\u0017x"));
        cfr_renamed_137.put(cfr_renamed_131, sprmfka.cfr_renamed_9("a_Y_ERZTPt@WW_G"));
        cfr_renamed_137.put(cfr_renamed_957, "Name");
        cfr_renamed_185.put(cfr_renamed_272, sprpgaa.cfr_renamed_9("B"));
        cfr_renamed_185.put(cfr_renamed_951, sprmfka.cfr_renamed_9("z"));
        cfr_renamed_185.put(cfr_renamed_722, sprpgaa.cfr_renamed_9("*T"));
        cfr_renamed_185.put(cfr_renamed_128, sprmfka.cfr_renamed_9("y{"));
        cfr_renamed_185.put(cfr_renamed_953, sprpgaa.cfr_renamed_9("M"));
        cfr_renamed_185.put(cfr_renamed_0, sprmfka.cfr_renamed_9("ia"));
        cfr_renamed_185.put(cfr_renamed_955, sprpgaa.cfr_renamed_9("6U7D U"));
        cfr_renamed_185.put(cfr_renamed_728, sprmfka.cfr_renamed_9("~v"));
        cfr_renamed_185.put(cfr_renamed_1226, sprpgaa.cfr_renamed_9("T,E"));
        cfr_renamed_93.put(cfr_renamed_272, sprmfka.cfr_renamed_9("v"));
        cfr_renamed_93.put(cfr_renamed_951, sprpgaa.cfr_renamed_9("N"));
        cfr_renamed_93.put(cfr_renamed_722, sprmfka.cfr_renamed_9("u`"));
        cfr_renamed_93.put(cfr_renamed_128, sprpgaa.cfr_renamed_9("&O"));
        cfr_renamed_93.put(cfr_renamed_953, sprmfka.cfr_renamed_9("y"));
        cfr_renamed_93.put(cfr_renamed_0, sprpgaa.cfr_renamed_9("6U"));
        cfr_renamed_93.put(cfr_renamed_955, sprmfka.cfr_renamed_9("iahp\u007fa"));
        cfr_renamed_126.put("c", cfr_renamed_272);
        cfr_renamed_126.put("o", cfr_renamed_951);
        cfr_renamed_126.put("t", cfr_renamed_132);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\nt"), cfr_renamed_722);
        cfr_renamed_126.put("cn", cfr_renamed_128);
        cfr_renamed_126.put("l", cfr_renamed_953);
        cfr_renamed_126.put("st", cfr_renamed_0);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("I["), cfr_renamed_134);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0016d\u0017h\u0004m\u000bt\bc\u0000s"), cfr_renamed_134);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("IAHP_A"), cfr_renamed_955);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0000l\u0004h\t`\u0001e\u0017d\u0016r"), cfr_renamed_114);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("^V"), cfr_renamed_728);
        cfr_renamed_126.put("e", cfr_renamed_114);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("t\fe"), cfr_renamed_1226);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("FOGTTWP"), cfr_renamed_96);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("f\fw\u0000o\u000b`\bd"), cfr_renamed_152);
        cfr_renamed_126.put("initials", cfr_renamed_1260);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("]PTPHTN\\U["), cfr_renamed_119);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("t\u000br\u0011s\u0010b\u0011t\u0017d\u0001`\u0001e\u0017d\u0016r"), cfr_renamed_91);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("O[IAH@YAOG_QTTWP"), cfr_renamed_102);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0010o\fp\u0010d\fe\u0000o\u0011h\u0003h\u0000s"), cfr_renamed_112);
        cfr_renamed_126.put("dn", cfr_renamed_107);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("EIPOQU[CX"), cfr_renamed_31);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("q\nr\u0011`\t`\u0001e\u0017d\u0016r"), cfr_renamed_145);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("[[X_Z\\WSGN]"), cfr_renamed_133);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0006n\u0010o\u0011s\u001cn\u0003b\fu\f{\u0000o\u0016i\fq"), cfr_renamed_952);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("YZO[NGCZ\\G_FSQ_[YP"), spr\ufe34);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0002d\u000be\u0000s"), cfr_renamed_4);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("JY[V_Z\\WSGN]"), cfr_renamed_956);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("e\u0004u\u0000n\u0003c\fs\u0011i"), cfr_renamed_135);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("JZIA[YYZ^P"), cfr_renamed_954);
        cfr_renamed_126.put(sprpgaa.cfr_renamed_9("\u0007t\u0016h\u000bd\u0016r\u0006`\u0011d\u0002n\u0017x"), cfr_renamed_86);
        cfr_renamed_126.put(sprmfka.cfr_renamed_9("A_Y_ERZTPT@WW_G"), cfr_renamed_131);
        cfr_renamed_126.put("name", cfr_renamed_957);
    }

    private /* synthetic */ String cfr_renamed_4451(byte[] arg0) {
        int n;
        char[] cArray = new char[arg0.length];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            int n3 = n++;
            cArray[n3] = (char)(arg0[n3] & 0xFF);
            n2 = n;
        }
        return new String(cArray);
    }

    public static sprjii cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjii.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }
}

