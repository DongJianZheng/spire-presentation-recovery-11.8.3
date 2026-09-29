/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvc;
import com.spire.presentation.packages.spresc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprkvc;
import com.spire.presentation.packages.sprnyc;
import com.spire.presentation.packages.sprqwc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprytc;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class spryrc {
    private Hashtable cfr_renamed_152;
    private final spresc cfr_renamed_112;
    private boolean cfr_renamed_119;
    private int cfr_renamed_91;
    private Hashtable cfr_renamed_0;
    private int cfr_renamed_1;
    private sprgg cfr_renamed_2;
    private static final int cfr_renamed_3 = 10;
    private Vector cfr_renamed_4;

    private static /* synthetic */ boolean cfr_renamed_3127(Hashtable arg0) {
        Enumeration enumeration = arg0.elements();
        while (enumeration.hasMoreElements()) {
            if (((sprqwc)enumeration.nextElement()).cfr_renamed_3128() != null) continue;
            return false;
        }
        return true;
    }

    public spryrc(sprsc arg0, spresc arg1) {
        spryrc spryrc2 = this;
        spryrc spryrc3 = this;
        spryrc spryrc4 = this;
        spryrc spryrc5 = this;
        spryrc4.cfr_renamed_152 = new Hashtable();
        spryrc4.cfr_renamed_0 = null;
        spryrc4.cfr_renamed_4 = new Vector();
        spryrc3.cfr_renamed_119 = true;
        spryrc3.cfr_renamed_1 = 0;
        spryrc2.cfr_renamed_91 = 0;
        this.cfr_renamed_112 = arg1;
        spryrc2.cfr_renamed_2 = new sprkvc();
        this.cfr_renamed_2.cfr_renamed_2797(arg0);
    }

    public byte[] cfr_renamed_3117(short arg0) throws IOException {
        sprcvc sprcvc2 = this.cfr_renamed_3105();
        if (sprcvc2.cfr_renamed_324() != arg0) {
            throw new spryad(10);
        }
        return sprcvc2.cfr_renamed_2573();
    }

    private static /* synthetic */ void cfr_renamed_3129(Hashtable arg0) {
        Enumeration enumeration;
        Enumeration enumeration2 = enumeration = arg0.elements();
        while (enumeration2.hasMoreElements()) {
            ((sprqwc)enumeration.nextElement()).cfr_renamed_41();
            enumeration2 = enumeration;
        }
    }

    private /* synthetic */ void cfr_renamed_3130(sprcvc arg0) throws IOException {
        int n;
        int n2;
        int n3 = this.cfr_renamed_112.cfr_renamed_2636() - 12;
        if (n3 < 1) {
            throw new spryad(80);
        }
        int n4 = arg0.cfr_renamed_2573().length;
        int n5 = 0;
        do {
            n = Math.min(n4 - n5, n3);
            n2 = n5;
            this.cfr_renamed_3131(arg0, n2, n);
        } while ((n5 = n2 + n) < n4);
    }

    public static /* synthetic */ void cfr_renamed_3132(Hashtable arg0) {
        spryrc.cfr_renamed_3129(arg0);
    }

    private /* synthetic */ sprcvc cfr_renamed_3133(sprcvc arg0) throws IOException {
        if (arg0.cfr_renamed_324() != 0) {
            sprcvc sprcvc2 = arg0;
            byte[] byArray = sprcvc2.cfr_renamed_2573();
            byte[] byArray2 = new byte[12];
            sprzsc.cfr_renamed_2693(sprcvc2.cfr_renamed_324(), byArray2, 0);
            sprzsc.cfr_renamed_2654(byArray.length, byArray2, 1);
            sprzsc.cfr_renamed_2679(arg0.cfr_renamed_3134(), byArray2, 4);
            sprzsc.cfr_renamed_2654(0, byArray2, 6);
            sprzsc.cfr_renamed_2654(byArray.length, byArray2, 9);
            this.cfr_renamed_2.cfr_renamed_1197(byArray2, 0, byArray2.length);
            this.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
        }
        return arg0;
    }

    public static /* synthetic */ Hashtable cfr_renamed_3135(spryrc arg0) {
        return arg0.cfr_renamed_152;
    }

    private /* synthetic */ void cfr_renamed_3136() {
        spryrc spryrc2 = this;
        spryrc.cfr_renamed_3129(spryrc2.cfr_renamed_152);
        spryrc2.cfr_renamed_0 = spryrc2.cfr_renamed_152;
        spryrc spryrc3 = this;
        spryrc2.cfr_renamed_152 = new Hashtable();
    }

    public sprgg cfr_renamed_2861() {
        spryrc spryrc2 = this;
        sprgg sprgg2 = spryrc2.cfr_renamed_2;
        spryrc2.cfr_renamed_2 = spryrc2.cfr_renamed_2.cfr_renamed_2958();
        return sprgg2;
    }

    public void cfr_renamed_3137() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    public void cfr_renamed_3120() {
        spryrc spryrc2;
        sprnyc sprnyc2 = null;
        if (!this.cfr_renamed_119) {
            spryrc spryrc3 = this;
            spryrc2 = spryrc3;
            spryrc3.cfr_renamed_3138();
        } else {
            if (this.cfr_renamed_152 != null) {
                sprnyc2 = new sprnyc(this);
            }
            spryrc2 = this;
        }
        spryrc2.cfr_renamed_112.cfr_renamed_3139(sprnyc2);
    }

    /*
     * Exception decompiling
     */
    public sprcvc cfr_renamed_3105() throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[UNCONDITIONALDOLOOP]], but top level block is 4[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private /* synthetic */ void cfr_renamed_3138() {
        Enumeration enumeration = this.cfr_renamed_152.keys();
        while (enumeration.hasMoreElements()) {
            if ((Integer)enumeration.nextElement() < this.cfr_renamed_91) continue;
        }
    }

    public void cfr_renamed_3108(short arg0, byte[] arg1) throws IOException {
        sprzsc.cfr_renamed_2662(arg1.length);
        if (!this.cfr_renamed_119) {
            spryrc spryrc2 = this;
            spryrc2.cfr_renamed_3138();
            spryrc2.cfr_renamed_119 = true;
            spryrc2.cfr_renamed_4.removeAllElements();
        }
        sprcvc sprcvc2 = new sprcvc(this.cfr_renamed_1++, arg0, arg1, null);
        spryrc spryrc3 = this;
        sprcvc sprcvc3 = sprcvc2;
        this.cfr_renamed_4.addElement(sprcvc3);
        spryrc3.cfr_renamed_3130(sprcvc3);
        spryrc3.cfr_renamed_3133(sprcvc2);
    }

    private /* synthetic */ void cfr_renamed_3140() throws IOException {
        int n;
        this.cfr_renamed_112.cfr_renamed_3141();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            spryrc spryrc2 = this;
            spryrc2.cfr_renamed_3130((sprcvc)spryrc2.cfr_renamed_4.elementAt(n++));
            n2 = n;
        }
    }

    public static /* synthetic */ int cfr_renamed_3142(spryrc arg0) {
        return arg0.cfr_renamed_91;
    }

    public sprgg cfr_renamed_2881() {
        return this.cfr_renamed_2;
    }

    public static /* synthetic */ void cfr_renamed_3143(spryrc arg0) throws IOException {
        arg0.cfr_renamed_3140();
    }

    public static /* synthetic */ boolean cfr_renamed_3144(Hashtable arg0) {
        return spryrc.cfr_renamed_3127(arg0);
    }

    public void cfr_renamed_2841() {
        this.cfr_renamed_2 = this.cfr_renamed_2.cfr_renamed_2957();
    }

    private /* synthetic */ void cfr_renamed_3131(sprcvc arg0, int arg1, int arg2) throws IOException {
        sprytc sprytc2 = new sprytc(12 + arg2);
        sprcvc sprcvc2 = arg0;
        sprzsc.cfr_renamed_2676(sprcvc2.cfr_renamed_324(), sprytc2);
        sprzsc.cfr_renamed_2713(sprcvc2.cfr_renamed_2573().length, sprytc2);
        sprytc sprytc3 = sprytc2;
        sprzsc.cfr_renamed_2648(arg0.cfr_renamed_3134(), sprytc3);
        sprzsc.cfr_renamed_2713(arg1, sprytc2);
        sprzsc.cfr_renamed_2713(arg2, sprytc2);
        sprytc2.write(arg0.cfr_renamed_2573(), arg1, arg2);
        sprytc3.cfr_renamed_3145(this.cfr_renamed_112);
    }
}

