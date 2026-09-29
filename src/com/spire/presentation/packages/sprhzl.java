/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprksf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrhm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruem;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;
import java.util.Vector;

public class sprhzl
extends sprqqe {
    public static final sprlem cfr_renamed_102 = sprdl.cfr_renamed_88;
    public static final sprlem cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    public static final sprlem cfr_renamed_152;
    public static final sprlem cfr_renamed_112;
    public static final sprlem cfr_renamed_119;
    public static final sprlem cfr_renamed_91;
    public static final sprlem cfr_renamed_0;
    public static final sprlem cfr_renamed_1;
    public static final sprlem cfr_renamed_2;
    private sprszm cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    public static sprhzl cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprhzl) {
            return (sprhzl)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprhzl((sprszm)arg0);
        }
        if (arg0 instanceof spruem) {
            return new sprhzl((sprszm)((spruem)arg0).cfr_renamed_206().cfr_renamed_85(0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprksf.cfr_renamed_9("1\u0015/\u0015+\f*[+\u0019.\u001e'\u000fd\u0012*[\"\u001a'\u000f+\t=Ad")).append(arg0.getClass().getName()).toString());
    }

    static {
        cfr_renamed_91 = sprdl.cfr_renamed_1513;
        cfr_renamed_119 = sprdl.cfr_renamed_2855;
        cfr_renamed_86 = sprwr.cfr_renamed_724;
        cfr_renamed_0 = sprwr.cfr_renamed_1223;
        cfr_renamed_1 = sprwr.cfr_renamed_88;
        cfr_renamed_152 = new sprlem("1.3.6.1.4.1.188.7.1.1.2");
        cfr_renamed_112 = new sprlem("1.2.840.113533.7.66.10");
        cfr_renamed_93 = new sprlem("1.3.14.3.2.7");
        cfr_renamed_2 = sprdl.cfr_renamed_2797;
        cfr_renamed_4 = sprdl.cfr_renamed_1479;
    }

    public sprhzl(sprszm sprszm2) {
        this.cfr_renamed_3 = sprszm2;
    }

    public Vector cfr_renamed_11195(sprlem arg0) {
        Enumeration enumeration = this.cfr_renamed_3.cfr_renamed_329();
        Vector<sprrhm> vector = new Vector<sprrhm>();
        if (arg0 == null) {
            Enumeration enumeration2 = enumeration;
            while (enumeration2.hasMoreElements()) {
                Enumeration enumeration3 = enumeration;
                enumeration2 = enumeration3;
                sprrhm sprrhm2 = sprrhm.cfr_renamed_23(enumeration3.nextElement());
                vector.addElement(sprrhm2);
            }
        } else {
            while (enumeration.hasMoreElements()) {
                sprrhm sprrhm3 = sprrhm.cfr_renamed_23(enumeration.nextElement());
                if (!arg0.cfr_renamed_5078(sprrhm3.cfr_renamed_4590())) continue;
                vector.addElement(sprrhm3);
            }
        }
        return vector;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3;
    }
}

