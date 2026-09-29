/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraoe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdmp;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprice;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxfaa;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import java.util.Enumeration;

public class sprehe
extends sprkra {
    private sprbne cfr_renamed_126;
    private sprxue cfr_renamed_88;
    public static final sprtzd cfr_renamed_31;
    public static final sprtzd cfr_renamed_272;
    public static final sprtzd cfr_renamed_145;
    public static final sprtzd cfr_renamed_114;
    public static final sprtzd cfr_renamed_96;
    public static final sprtzd cfr_renamed_105;
    public static final sprtzd cfr_renamed_137;
    public static final sprtzd cfr_renamed_79;
    private String cfr_renamed_107;
    public static final sprtzd cfr_renamed_132;
    public static final sprtzd cfr_renamed_102;
    private sprbne cfr_renamed_93;
    private sprnee cfr_renamed_86;
    public static final sprtzd cfr_renamed_152;
    public static final sprtzd cfr_renamed_112;
    public static final sprtzd cfr_renamed_119;
    public static final sprtzd cfr_renamed_91;
    public static final sprtzd cfr_renamed_0;
    public static final sprtzd cfr_renamed_1;
    public static final sprtzd cfr_renamed_2;
    public static final sprtzd cfr_renamed_3;
    public static final sprtzd cfr_renamed_4;

    public sprxue cfr_renamed_4618() {
        return this.cfr_renamed_88;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_86 != null) {
            sprlre2.cfr_renamed_49(new sprhse(true, 0, this.cfr_renamed_86));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_126);
        if (this.cfr_renamed_93 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_93);
        }
        if (this.cfr_renamed_107 != null) {
            sprlre2.cfr_renamed_49(new spraoe(this.cfr_renamed_107, true));
        }
        if (this.cfr_renamed_88 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_88);
        }
        return new sprpse(sprlre2);
    }

    public static sprehe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprehe) {
            return (sprehe)arg0;
        }
        if (arg0 instanceof sprbne) {
            return new sprehe((sprbne)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxfaa.cfr_renamed_9("hCmJfNm\u000fnMkJb[!Fo\u000ffJufo\\uNoLd\u0015!")).append(arg0.getClass().getName()).toString());
    }

    public sprnee cfr_renamed_4619() {
        return this.cfr_renamed_86;
    }

    public String cfr_renamed_4620() {
        return this.cfr_renamed_107;
    }

    static {
        cfr_renamed_0 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("-a"));
        cfr_renamed_3 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("\u00013"));
        cfr_renamed_114 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("-c"));
        cfr_renamed_112 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("\u00015"));
        cfr_renamed_79 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("-e"));
        cfr_renamed_31 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("\u00017"));
        cfr_renamed_152 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("-g"));
        cfr_renamed_105 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("\u00019"));
        cfr_renamed_102 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("-i"));
        cfr_renamed_145 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("/\u001e1"));
        cfr_renamed_4 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("~2a"));
        cfr_renamed_2 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("/\u001e3"));
        cfr_renamed_137 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("~2c"));
        cfr_renamed_119 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("/\u001e5"));
        cfr_renamed_132 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("~2e"));
        cfr_renamed_1 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("/\u001e7"));
        cfr_renamed_96 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("~2g"));
        cfr_renamed_272 = new sprtzd(sprnee.cfr_renamed_3 + sprxfaa.cfr_renamed_9("/\u001e9"));
        cfr_renamed_91 = new sprtzd(sprnee.cfr_renamed_3 + sprdmp.cfr_renamed_9("~2i"));
    }

    public sprtzd[] cfr_renamed_4621() {
        Enumeration enumeration;
        if (this.cfr_renamed_93 == null) {
            return new sprtzd[0];
        }
        sprtzd[] sprtzdArray = new sprtzd[this.cfr_renamed_93.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_93.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            sprtzdArray[++n] = sprtzd.cfr_renamed_23(enumeration3.nextElement());
        }
        return sprtzdArray;
    }

    public sprice[] cfr_renamed_4622() {
        Enumeration enumeration;
        sprice[] spriceArray = new sprice[this.cfr_renamed_126.cfr_renamed_84()];
        int n = 0;
        Enumeration enumeration2 = enumeration = this.cfr_renamed_126.cfr_renamed_329();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            spriceArray[++n] = sprice.cfr_renamed_23(enumeration3.nextElement());
        }
        return spriceArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprehe(sprnee sprnee2, sprice[] spriceArray, sprtzd[] sprtzdArray, String string, sprxue sprxue2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        int n;
        this.cfr_renamed_86 = sprnee2;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != ((void)arg1).length) {
            sprlre2.cfr_renamed_49((spra)arg1[n++]);
            n2 = n;
        }
        this.cfr_renamed_126 = new sprpse(sprlre2);
        if (arg2 != null) {
            sprlre2 = new sprlre();
            int n3 = n = 0;
            while (n3 != ((void)arg2).length) {
                sprlre2.cfr_renamed_49((spra)arg2[n++]);
                n3 = n;
            }
            this.cfr_renamed_93 = new sprpse(sprlre2);
        }
        this.cfr_renamed_107 = arg3;
        this.cfr_renamed_88 = arg4;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ sprehe(sprbne sprbne2) {
        Enumeration enumeration;
        Enumeration enumeration2;
        void arg0;
        if (sprbne2.cfr_renamed_84() > 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxfaa.cfr_renamed_9("CNe\u000frJpZdAbJ!\\hUd\u0015!")).append(arg0.cfr_renamed_84()).toString());
        }
        Enumeration enumeration3 = arg0.cfr_renamed_329();
        spra spra2 = (spra)enumeration3.nextElement();
        if (spra2 instanceof spryte) {
            if (((spryte)spra2).cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdmp.cfr_renamed_9("A1gpw1dpm%n2f\"9p")).append(((spryte)spra2).cfr_renamed_312()).toString());
            }
            this.cfr_renamed_86 = sprnee.cfr_renamed_341((spryte)spra2, true);
            spra2 = (spra)enumeration3.nextElement();
        }
        this.cfr_renamed_126 = sprbne.cfr_renamed_23(spra2);
        if (enumeration3.hasMoreElements()) {
            spra2 = (spra)enumeration3.nextElement();
            if (spra2 instanceof sprbne) {
                enumeration2 = enumeration3;
                this.cfr_renamed_93 = sprbne.cfr_renamed_23(spra2);
            } else if (spra2 instanceof spraoe) {
                enumeration2 = enumeration3;
                this.cfr_renamed_107 = spraoe.cfr_renamed_23(spra2).cfr_renamed_314();
            } else {
                if (!(spra2 instanceof sprxue)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprxfaa.cfr_renamed_9("m`K!@cEdLu\u000fdAb@tAuJsJe\u0015!")).append(spra2.getClass()).toString());
                enumeration2 = enumeration3;
                this.cfr_renamed_88 = sprxue.cfr_renamed_23(spra2);
            }
        } else {
            enumeration2 = enumeration3;
        }
        if (enumeration2.hasMoreElements()) {
            spra2 = (spra)enumeration3.nextElement();
            if (spra2 instanceof spraoe) {
                enumeration = enumeration3;
                this.cfr_renamed_107 = spraoe.cfr_renamed_23(spra2).cfr_renamed_314();
            } else {
                if (!(spra2 instanceof sprlqe)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprdmp.cfr_renamed_9("A1gpl2i5`$#5m3l%m$f\"f49p")).append(spra2.getClass()).toString());
                this.cfr_renamed_88 = (sprlqe)spra2;
                enumeration = enumeration3;
            }
        } else {
            enumeration = enumeration3;
        }
        if (!enumeration.hasMoreElements()) return;
        spra2 = (spra)enumeration3.nextElement();
        if (!(spra2 instanceof sprlqe)) throw new IllegalArgumentException(new StringBuilder().insert(0, sprxfaa.cfr_renamed_9("m`K!@cEdLu\u000fdAb@tAuJsJe\u0015!")).append(spra2.getClass()).toString());
        this.cfr_renamed_88 = (sprlqe)spra2;
    }
}

