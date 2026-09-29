/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprhig;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnli;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class sprude
extends sprkra {
    public static final sprtzd cfr_renamed_723;
    public static final sprtzd cfr_renamed_1226;
    public static final sprtzd cfr_renamed_287;
    public static final sprtzd cfr_renamed_724;
    public static final sprtzd cfr_renamed_953;
    public static final sprtzd cfr_renamed_133;
    public static final sprtzd cfr_renamed_185;
    public static final sprtzd spr\ufe34;
    public static final sprtzd cfr_renamed_82;
    public static final sprtzd cfr_renamed_126;
    public static final sprtzd cfr_renamed_88;
    public static final sprtzd cfr_renamed_31;
    private Vector cfr_renamed_272;
    public static final sprtzd cfr_renamed_145;
    public static final sprtzd cfr_renamed_114;
    private Hashtable cfr_renamed_96;
    public static final sprtzd cfr_renamed_105;
    public static final sprtzd cfr_renamed_137;
    public static final sprtzd cfr_renamed_79;
    public static final sprtzd cfr_renamed_107;
    public static final sprtzd cfr_renamed_132;
    public static final sprtzd cfr_renamed_102;
    public static final sprtzd cfr_renamed_93;
    public static final sprtzd cfr_renamed_86;
    public static final sprtzd cfr_renamed_152;
    public static final sprtzd cfr_renamed_112;
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    private /* synthetic */ sprtzd[] cfr_renamed_4462(Vector arg0) {
        int n;
        sprtzd[] sprtzdArray = new sprtzd[arg0.size()];
        int n2 = n = 0;
        while (n2 != sprtzdArray.length) {
            int n3 = n++;
            sprtzdArray[n3] = (sprtzd)arg0.elementAt(n3);
            n2 = n;
        }
        return sprtzdArray;
    }

    public sprude(Hashtable arg0) {
        this(null, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprude(Vector vector, Vector vector2) {
        Enumeration enumeration;
        sprude sprude2 = this;
        this.cfr_renamed_96 = new Hashtable();
        sprude2.cfr_renamed_272 = new Vector();
        Enumeration enumeration2 = enumeration = vector.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            this.cfr_renamed_272.addElement(enumeration3.nextElement());
        }
        int n = 0;
        enumeration = this.cfr_renamed_272.elements();
        Enumeration enumeration4 = enumeration;
        while (enumeration4.hasMoreElements()) {
            void arg1;
            sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
            sprfje sprfje2 = (sprfje)arg1.elementAt(n);
            enumeration4 = enumeration;
            ++n;
            this.cfr_renamed_96.put(sprtzd2, sprfje2);
        }
    }

    public Enumeration cfr_renamed_99() {
        return this.cfr_renamed_272.elements();
    }

    public sprfje cfr_renamed_100(sprtzd arg0) {
        return (sprfje)this.cfr_renamed_96.get(arg0);
    }

    private /* synthetic */ sprtzd[] cfr_renamed_78(boolean arg0) {
        int n;
        Vector vector = new Vector();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_272.size()) {
            sprude sprude2 = this;
            Object e = sprude2.cfr_renamed_272.elementAt(n);
            if (((sprfje)sprude2.cfr_renamed_96.get(e)).cfr_renamed_101() == arg0) {
                vector.addElement(e);
            }
            n2 = ++n;
        }
        return this.cfr_renamed_4462(vector);
    }

    public static sprude cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprude) {
            return (sprude)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprude((sprbne)arg0);
        }
        if (arg0 instanceof sprszd) {
            return new sprude((sprbne)((sprszd)arg0).cfr_renamed_119());
        }
        if (arg0 instanceof spryte) {
            return sprude.cfr_renamed_23(((spryte)arg0).cfr_renamed_2456());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprnli.cfr_renamed_9("`zesnwe6ftcsjb)\u007fg6ns}_ge}wgul,)")).append(arg0.getClass().getName()).toString());
    }

    public boolean cfr_renamed_4463(sprude arg0) {
        if (this.cfr_renamed_96.size() != arg0.cfr_renamed_96.size()) {
            return false;
        }
        Enumeration enumeration = this.cfr_renamed_96.keys();
        while (enumeration.hasMoreElements()) {
            Object k = enumeration.nextElement();
            if (this.cfr_renamed_96.get(k).equals(arg0.cfr_renamed_96.get(k))) continue;
            return false;
        }
        return true;
    }

    public sprude(sprbne sprbne2) {
        Enumeration enumeration;
        sprude sprude2 = this;
        this.cfr_renamed_96 = new Hashtable();
        sprude2.cfr_renamed_272 = new Vector();
        Enumeration enumeration2 = enumeration = sprbne2.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            sprude sprude3;
            sprbne sprbne3 = sprbne.cfr_renamed_23(enumeration.nextElement());
            if (sprbne3.cfr_renamed_84() == 3) {
                sprude sprude4 = this;
                sprude3 = sprude4;
                sprude4.cfr_renamed_96.put(sprbne3.cfr_renamed_85(0), new sprfje(sprnpe.cfr_renamed_23(sprbne3.cfr_renamed_85(1)), sprxue.cfr_renamed_23(sprbne3.cfr_renamed_85(2))));
            } else if (sprbne3.cfr_renamed_84() == 2) {
                sprude sprude5 = this;
                sprude3 = sprude5;
                sprude5.cfr_renamed_96.put(sprbne3.cfr_renamed_85(0), new sprfje(false, sprxue.cfr_renamed_23(sprbne3.cfr_renamed_85(1))));
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprhig.cfr_renamed_9(")S\u000f\u0012\u0018W\u001aG\u000e\\\bWKA\u0002H\u000e\bK")).append(sprbne3.cfr_renamed_84()).toString());
            }
            sprude3.cfr_renamed_272.addElement(sprbne3.cfr_renamed_85(0));
            enumeration2 = enumeration;
        }
    }

    public sprtzd[] cfr_renamed_665() {
        return this.cfr_renamed_78(false);
    }

    public sprtzd[] cfr_renamed_662() {
        return this.cfr_renamed_78(true);
    }

    public sprtzd[] cfr_renamed_583() {
        sprude sprude2 = this;
        return sprude2.cfr_renamed_4462(sprude2.cfr_renamed_272);
    }

    @Override
    public sprvva cfr_renamed_119() {
        Enumeration enumeration;
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_272.elements();
        while (enumeration2.hasMoreElements()) {
            sprtzd sprtzd2 = (sprtzd)enumeration.nextElement();
            sprfje sprfje2 = (sprfje)this.cfr_renamed_96.get(sprtzd2);
            sprlre sprlre3 = new sprlre();
            sprlre3.cfr_renamed_49(sprtzd2);
            if (sprfje2.cfr_renamed_101()) {
                sprlre3.cfr_renamed_49(sprnpe.cfr_renamed_0);
            }
            sprlre3.cfr_renamed_49(sprfje2.cfr_renamed_97());
            enumeration2 = enumeration;
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        }
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprude(Vector vector, Hashtable hashtable) {
        Enumeration<Object> enumeration;
        Enumeration<Object> enumeration2;
        void arg1;
        sprude sprude2 = this;
        this.cfr_renamed_96 = new Hashtable();
        sprude2.cfr_renamed_272 = new Vector();
        if (vector == null) {
            enumeration2 = arg1.keys();
            enumeration = enumeration2;
        } else {
            void arg0;
            enumeration2 = arg0.elements();
            enumeration = enumeration2;
        }
        while (enumeration.hasMoreElements()) {
            Enumeration<Object> enumeration3 = enumeration2;
            enumeration = enumeration3;
            this.cfr_renamed_272.addElement(sprtzd.cfr_renamed_23(enumeration3.nextElement()));
        }
        enumeration2 = this.cfr_renamed_272.elements();
        Enumeration<Object> enumeration4 = enumeration2;
        while (enumeration4.hasMoreElements()) {
            sprtzd sprtzd2 = sprtzd.cfr_renamed_23(enumeration2.nextElement());
            sprfje sprfje2 = (sprfje)arg1.get(sprtzd2);
            enumeration4 = enumeration2;
            this.cfr_renamed_96.put(sprtzd2, sprfje2);
        }
    }

    public static sprude cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprude.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    static {
        cfr_renamed_3 = new sprtzd(sprnli.cfr_renamed_9("$'#'$080"));
        cfr_renamed_82 = new sprtzd("2.5.29.14");
        cfr_renamed_137 = new sprtzd("2.5.29.15");
        cfr_renamed_119 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0003]"));
        cfr_renamed_152 = new sprtzd("2.5.29.17");
        cfr_renamed_133 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/''1"));
        cfr_renamed_79 = new sprtzd("2.5.29.19");
        cfr_renamed_114 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0000["));
        cfr_renamed_112 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'$8"));
        cfr_renamed_953 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0000X"));
        cfr_renamed_86 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'$="));
        cfr_renamed_132 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0000\\"));
        cfr_renamed_4 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'$1"));
        cfr_renamed_102 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0000R"));
        cfr_renamed_31 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'%9"));
        cfr_renamed_93 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0001Z"));
        cfr_renamed_91 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'%;"));
        cfr_renamed_88 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0001X"));
        cfr_renamed_287 = new sprtzd("2.5.29.35");
        cfr_renamed_126 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'%?"));
        cfr_renamed_145 = new sprtzd("2.5.29.37");
        cfr_renamed_723 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0006]"));
        cfr_renamed_105 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'#="));
        cfr_renamed_1 = new sprtzd(sprhig.cfr_renamed_9("Z\u001cX\u001c]\u001cZ\u001c^\u001c^\u001c\\\u001cZ\u001cZ"));
        cfr_renamed_0 = new sprtzd(sprnli.cfr_renamed_9("''%' '''#'#'!''''8"));
        cfr_renamed_724 = new sprtzd(sprhig.cfr_renamed_9("\u0003E\u0001E\u0004E\u0003E\u0007E\u0007E\u0005E\u0003E\u0003Y"));
        cfr_renamed_2 = new sprtzd(sprnli.cfr_renamed_9("88:8?888<8<8>888;"));
        spr\ufe34 = new sprtzd(sprhig.cfr_renamed_9("Z\u001cX\u001c]\u001cZ\u001c^\u001c^\u001c\\\u001cZ\u001cX"));
        cfr_renamed_1226 = new sprtzd(sprnli.cfr_renamed_9("88:8?888<8<8>888="));
        cfr_renamed_107 = new sprtzd(sprhig.cfr_renamed_9("Y\u001c^\u001cY\u000bE\u0007]"));
        cfr_renamed_185 = new sprtzd(sprnli.cfr_renamed_9(";8<8;/'#<"));
    }
}

