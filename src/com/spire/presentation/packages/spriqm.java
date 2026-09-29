/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgpm;
import com.spire.presentation.packages.sprimz;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfn;
import com.spire.presentation.packages.sprqhm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.util.Enumeration;

public class spriqm
extends sprqqe {
    public static final sprlem cfr_renamed_126;
    public static final sprlem cfr_renamed_88;
    public static final sprlem cfr_renamed_31;
    public static final sprlem cfr_renamed_272;
    public static final sprlem cfr_renamed_145;
    public static final sprlem cfr_renamed_114;
    public static final sprlem cfr_renamed_96;
    public static final sprlem cfr_renamed_105;
    private String cfr_renamed_137;
    public static final sprlem cfr_renamed_79;
    public static final sprlem cfr_renamed_107;
    private sprszm cfr_renamed_132;
    public static final sprlem cfr_renamed_102;
    public static final sprlem cfr_renamed_93;
    public static final sprlem cfr_renamed_86;
    private sprgpm cfr_renamed_152;
    private sprszm cfr_renamed_112;
    public static final sprlem cfr_renamed_119;
    public static final sprlem cfr_renamed_91;
    public static final sprlem cfr_renamed_0;
    public static final sprlem cfr_renamed_1;
    private sproug cfr_renamed_2;
    public static final sprlem cfr_renamed_3;
    public static final sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ spriqm(sprszm sprszm2) {
        Enumeration enumeration;
        Enumeration enumeration2;
        void arg0;
        if (sprszm2.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("dJB\u000bUNW^CEEN\u0006XOQC\u0011\u0006")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration3 = arg0.cfr_renamed_329();
        sprco sprco2 = (sprco)enumeration3.nextElement();
        if (sprco2 instanceof sprnvm) {
            if (((sprnvm)sprco2).cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprimz.cfr_renamed_9("D{b:r{a:hokxch<:")).append(((sprnvm)sprco2).cfr_renamed_312()).toString());
            }
            this.cfr_renamed_152 = sprgpm.cfr_renamed_5085((sprnvm)sprco2, true);
            sprco2 = (sprco)enumeration3.nextElement();
        }
        this.cfr_renamed_132 = sprszm.cfr_renamed_23(sprco2);
        if (enumeration3.hasMoreElements()) {
            sprco2 = (sprco)enumeration3.nextElement();
            if (sprco2 instanceof sprszm) {
                enumeration2 = enumeration3;
                this.cfr_renamed_112 = sprszm.cfr_renamed_23(sprco2);
            } else if (sprco2 instanceof sprpfn) {
                enumeration2 = enumeration3;
                this.cfr_renamed_137 = sprpfn.cfr_renamed_23(sprco2).cfr_renamed_314();
            } else {
                if (!(sprco2 instanceof sproug)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("iGO\u0006DDACHR\u000bCEEDSERNTNB\u0011\u0006")).append(sprco2.getClass()).toString());
                enumeration2 = enumeration3;
                this.cfr_renamed_2 = sproug.cfr_renamed_23(sprco2);
            }
        } else {
            enumeration2 = enumeration3;
        }
        if (enumeration2.hasMoreElements()) {
            sprco2 = (sprco)enumeration3.nextElement();
            if (sprco2 instanceof sprpfn) {
                enumeration = enumeration3;
                this.cfr_renamed_137 = sprpfn.cfr_renamed_23(sprco2).cfr_renamed_314();
            } else {
                if (!(sprco2 instanceof sprfvg)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprimz.cfr_renamed_9("D{b:ixl\u007fen&\u007fhyiohnchc~<:")).append(sprco2.getClass()).toString());
                this.cfr_renamed_2 = (sprfvg)sprco2;
                enumeration = enumeration3;
            }
        } else {
            enumeration = enumeration3;
        }
        if (!enumeration.hasMoreElements()) return;
        sprco2 = (sprco)enumeration3.nextElement();
        if (!(sprco2 instanceof sprfvg)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("iGO\u0006DDACHR\u000bCEEDSERNTNB\u0011\u0006")).append(sprco2.getClass()).toString());
        this.cfr_renamed_2 = (sprfvg)sprco2;
    }

    /*
     * WARNING - void declaration
     */
    public spriqm(sprgpm sprgpm2, sprqhm[] sprqhmArray, sprlem[] sprlemArray, String string, sproug sproug2) {
        void arg4;
        void arg3;
        void arg1;
        void arg0;
        this.cfr_renamed_152 = arg0;
        spriqm spriqm2 = this;
        this.cfr_renamed_132 = new sprcen((sprco[])arg1);
        if (sprlemArray != null) {
            void arg2;
            this.cfr_renamed_112 = new sprcen((sprco[])arg2);
        }
        this.cfr_renamed_137 = arg3;
        this.cfr_renamed_2 = arg4;
    }

    public sprlem[] cfr_renamed_4621() {
        Enumeration enumeration;
        if (this.cfr_renamed_112 == null) {
            return new sprlem[0];
        }
        sprlem[] sprlemArray = new sprlem[this.cfr_renamed_112.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_112.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprlemArray[++n] = sprlem.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprlemArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(5);
        if (this.cfr_renamed_152 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)this.cfr_renamed_152));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_132);
        if (this.cfr_renamed_112 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_112);
        }
        if (this.cfr_renamed_137 != null) {
            sprrvm2.cfr_renamed_5004(new sprldn(this.cfr_renamed_137, true));
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }

    public String cfr_renamed_4620() {
        return this.cfr_renamed_137;
    }

    public sprgpm cfr_renamed_4619() {
        return this.cfr_renamed_152;
    }

    public sproug cfr_renamed_4618() {
        return this.cfr_renamed_2;
    }

    public sprqhm[] cfr_renamed_4622() {
        Enumeration enumeration;
        sprqhm[] sprqhmArray = new sprqhm[this.cfr_renamed_132.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_132.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprqhmArray[++n] = sprqhm.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprqhmArray;
    }

    static {
        cfr_renamed_86 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("(+"));
        cfr_renamed_272 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\u0005\u0014"));
        cfr_renamed_31 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("()"));
        cfr_renamed_145 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\u0005\u0012"));
        cfr_renamed_79 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("(/"));
        cfr_renamed_105 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\u0005\u0010"));
        cfr_renamed_4 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("(-"));
        cfr_renamed_102 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\u0005\u001e"));
        cfr_renamed_96 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("(#"));
        cfr_renamed_3 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\b\u001a\u0016"));
        cfr_renamed_107 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("47+"));
        cfr_renamed_114 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\b\u001a\u0014"));
        cfr_renamed_119 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("47)"));
        cfr_renamed_88 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\b\u001a\u0012"));
        cfr_renamed_126 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("47/"));
        cfr_renamed_1 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\b\u001a\u0010"));
        cfr_renamed_91 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("47-"));
        cfr_renamed_0 = new sprlem(sprgpm.cfr_renamed_4 + sprarg.cfr_renamed_9("\b\u001a\u001e"));
        cfr_renamed_93 = new sprlem(sprgpm.cfr_renamed_4 + sprimz.cfr_renamed_9("47#"));
    }

    public static spriqm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spriqm) {
            return (spriqm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new spriqm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprarg.cfr_renamed_9("OGJNAJJ\u000bIILNE_\u0006BH\u000bANRbHXRJHHC\u0011\u0006")).append(arg0.getClass().getName()).toString());
    }
}

