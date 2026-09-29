/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprexc;
import com.spire.presentation.packages.sprgc;
import com.spire.presentation.packages.sprhj;
import com.spire.presentation.packages.sprig;
import com.spire.presentation.packages.sprmc;
import com.spire.presentation.packages.sprmuc;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprwtc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.spryio;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;

public class spresc
implements sprgc {
    private long cfr_renamed_145;
    private volatile int cfr_renamed_114;
    private static final int cfr_renamed_96 = 16384;
    private final sprgc cfr_renamed_105;
    private static final long cfr_renamed_137 = 120000L;
    private sprwtc cfr_renamed_79;
    private volatile sprpxc cfr_renamed_107;
    private sprwtc cfr_renamed_132;
    private sprwtc cfr_renamed_102;
    private final sprsc cfr_renamed_93;
    private volatile boolean cfr_renamed_86;
    private final sprhj cfr_renamed_152;
    private volatile boolean cfr_renamed_112;
    private sprwtc cfr_renamed_119;
    private sprig cfr_renamed_91;
    private sprwtc cfr_renamed_0;
    private volatile boolean cfr_renamed_1;
    private static final int cfr_renamed_2 = 13;
    private final sprmuc cfr_renamed_3;
    private static final long cfr_renamed_4 = 240000L;

    @Override
    public void cfr_renamed_2635(byte[] arg0, int arg1, int arg2) throws IOException {
        short s;
        block9: {
            block8: {
                s = 23;
                if (this.cfr_renamed_86) break block8;
                spresc spresc2 = this;
                if (spresc2.cfr_renamed_119 != spresc2.cfr_renamed_0) break block9;
            }
            s = 22;
            if (sprzsc.cfr_renamed_2762(arg0, arg1) == 20) {
                sprwtc sprwtc2;
                sprwtc sprwtc3 = null;
                if (this.cfr_renamed_86) {
                    sprwtc2 = sprwtc3 = this.cfr_renamed_132;
                } else {
                    spresc spresc3 = this;
                    if (spresc3.cfr_renamed_119 == spresc3.cfr_renamed_0) {
                        sprwtc3 = this.cfr_renamed_79;
                    }
                    sprwtc2 = sprwtc3;
                }
                if (sprwtc2 == null) {
                    throw new IllegalStateException();
                }
                byte[] byArray = new byte[1];
                byArray[0] = 1;
                byte[] byArray2 = byArray;
                this.cfr_renamed_3146((short)20, byArray2, 0, byArray2.length);
                this.cfr_renamed_119 = sprwtc3;
            }
        }
        this.cfr_renamed_3146(s, arg0, arg1, arg2);
    }

    public void cfr_renamed_3141() {
        if (this.cfr_renamed_0 != null) {
            this.cfr_renamed_119 = this.cfr_renamed_0;
            return;
        }
        this.cfr_renamed_119 = this.cfr_renamed_79;
    }

    public sprpxc cfr_renamed_3106() {
        return this.cfr_renamed_107;
    }

    /*
     * Exception decompiling
     */
    @Override
    public int cfr_renamed_2633(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[TRYBLOCK]], but top level block is 12[SWITCH]
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

    @Override
    public int cfr_renamed_2636() throws IOException {
        spresc spresc2 = this;
        return Math.min(spresc2.cfr_renamed_114, spresc2.cfr_renamed_119.cfr_renamed_2471().cfr_renamed_2775(this.cfr_renamed_105.cfr_renamed_2636() - 13));
    }

    public void cfr_renamed_3147(short arg0, String arg1) throws IOException {
        this.cfr_renamed_2931((short)1, arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public spresc(sprgc sprgc2, sprsc sprsc2, sprhj sprhj2, short s) {
        void arg2;
        void arg1;
        void arg0;
        spresc spresc2 = this;
        spresc spresc3 = this;
        spresc spresc4 = this;
        spresc spresc5 = this;
        spresc spresc6 = this;
        spresc spresc7 = this;
        spresc spresc8 = this;
        spresc spresc9 = this;
        spresc9.cfr_renamed_3 = new sprmuc();
        spresc8.cfr_renamed_1 = false;
        spresc8.cfr_renamed_112 = false;
        spresc7.cfr_renamed_107 = null;
        spresc7.cfr_renamed_91 = null;
        spresc6.cfr_renamed_0 = null;
        spresc6.cfr_renamed_145 = 0L;
        spresc5.cfr_renamed_105 = arg0;
        spresc5.cfr_renamed_93 = arg1;
        spresc4.cfr_renamed_152 = arg2;
        spresc4.cfr_renamed_86 = true;
        this.cfr_renamed_79 = new sprwtc(0, new sprexc((sprsc)arg1));
        spresc3.cfr_renamed_132 = null;
        spresc3.cfr_renamed_102 = this.cfr_renamed_79;
        spresc2.cfr_renamed_119 = spresc2.cfr_renamed_79;
        spresc2.cfr_renamed_2838(16384);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_3148() {
        if (!this.cfr_renamed_1) {
            spresc spresc2;
            try {
                if (!this.cfr_renamed_112) {
                    this.cfr_renamed_3147((short)0, null);
                }
                this.cfr_renamed_105.cfr_renamed_2637();
                spresc2 = this;
            }
            catch (Exception exception) {
                spresc2 = this;
            }
            spresc2.cfr_renamed_1 = true;
        }
    }

    public void cfr_renamed_3139(sprig arg0) {
        block5: {
            block4: {
                spresc spresc2 = this;
                if (spresc2.cfr_renamed_102 == spresc2.cfr_renamed_79) break block4;
                spresc spresc3 = this;
                if (spresc3.cfr_renamed_119 != spresc3.cfr_renamed_79) break block5;
            }
            throw new IllegalStateException();
        }
        if (arg0 != null) {
            this.cfr_renamed_91 = arg0;
            this.cfr_renamed_0 = this.cfr_renamed_79;
            this.cfr_renamed_145 = System.currentTimeMillis() + 240000L;
        }
        this.cfr_renamed_86 = false;
        this.cfr_renamed_79 = this.cfr_renamed_132;
        this.cfr_renamed_132 = null;
    }

    public void cfr_renamed_2838(int arg0) {
        this.cfr_renamed_114 = arg0;
    }

    private /* synthetic */ void cfr_renamed_3146(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg3 > this.cfr_renamed_114) {
            throw new spryad(80);
        }
        if (arg3 < 1 && arg0 != 23) {
            throw new spryad(80);
        }
        spresc spresc2 = this;
        int n = spresc2.cfr_renamed_119.cfr_renamed_3149();
        long l = spresc2.cfr_renamed_119.cfr_renamed_3150();
        byte[] byArray = spresc2.cfr_renamed_119.cfr_renamed_2471().cfr_renamed_2771(spresc.cfr_renamed_3151(n, l), arg0, arg1, arg2, arg3);
        byte[] byArray2 = new byte[byArray.length + 13];
        sprzsc.cfr_renamed_2693(arg0, byArray2, 0);
        sprpxc sprpxc2 = this.cfr_renamed_107 != null ? this.cfr_renamed_107 : this.cfr_renamed_93.cfr_renamed_2824();
        sprzsc.cfr_renamed_2702(sprpxc2, byArray2, 1);
        sprzsc.cfr_renamed_2679(n, byArray2, 3);
        sprzsc.cfr_renamed_2671(l, byArray2, 5);
        sprzsc.cfr_renamed_2679(byArray.length, byArray2, 11);
        System.arraycopy(byArray, 0, byArray2, 13, byArray.length);
        this.cfr_renamed_105.cfr_renamed_2635(byArray2, 0, byArray2.length);
    }

    public sprpxc cfr_renamed_3152() {
        sprpxc sprpxc2 = this.cfr_renamed_107;
        this.cfr_renamed_107 = null;
        return sprpxc2;
    }

    private /* synthetic */ int cfr_renamed_3153(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int n;
        int n2;
        if (this.cfr_renamed_3.cfr_renamed_84() > 0) {
            int n3 = 0;
            if (this.cfr_renamed_3.cfr_renamed_84() >= 13) {
                byte[] byArray = new byte[2];
                this.cfr_renamed_3.cfr_renamed_2943(byArray, 0, 2, 11);
                n3 = sprzsc.cfr_renamed_2705(byArray, 0);
            }
            spresc spresc2 = this;
            int n4 = Math.min(spresc2.cfr_renamed_3.cfr_renamed_84(), 13 + n3);
            spresc2.cfr_renamed_3.cfr_renamed_2912(arg0, arg1, n4, 0);
            return n4;
        }
        int n5 = this.cfr_renamed_105.cfr_renamed_2633(arg0, arg1, arg2, arg3);
        if (n5 >= 13 && n5 > (n2 = 13 + (n = sprzsc.cfr_renamed_2705(arg0, arg1 + 11)))) {
            this.cfr_renamed_3.cfr_renamed_2923(arg0, arg1 + n2, n5 - n2);
            n5 = n2;
        }
        return n5;
    }

    @Override
    public int cfr_renamed_2634() throws IOException {
        spresc spresc2 = this;
        return Math.min(spresc2.cfr_renamed_114, spresc2.cfr_renamed_102.cfr_renamed_2471().cfr_renamed_2775(this.cfr_renamed_105.cfr_renamed_2634() - 13));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2931(short s, short s2, String string, Exception exception) throws IOException {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spresc spresc2 = this;
        spresc2.cfr_renamed_152.cfr_renamed_2932((short)arg0, (short)arg1, (String)arg2, (Exception)arg3);
        byte[] byArray = new byte[]{(byte)arg0, (byte)arg1};
        spresc2.cfr_renamed_3146((short)21, byArray, 0, 2);
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        if (!this.cfr_renamed_1) {
            if (this.cfr_renamed_86) {
                this.cfr_renamed_3147((short)90, spryio.cfr_renamed_9("&P\u0016QS@\u0012M\u0010F\u001fF\u0017\u0003\u001bB\u001dG\u0000K\u0012H\u0016"));
            }
            this.cfr_renamed_3148();
        }
    }

    public void cfr_renamed_3115(sprmc arg0) {
        if (this.cfr_renamed_132 != null) {
            throw new IllegalStateException();
        }
        this.cfr_renamed_132 = new sprwtc(this.cfr_renamed_119.cfr_renamed_3149() + 1, arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void spr\u3028\ufe34(short arg0) {
        if (!this.cfr_renamed_1) {
            spresc spresc2;
            try {
                this.cfr_renamed_2931((short)2, arg0, null, null);
                spresc2 = this;
            }
            catch (Exception exception) {
                spresc2 = this;
            }
            spresc2.cfr_renamed_112 = true;
            this.cfr_renamed_3148();
        }
    }

    private static /* synthetic */ long cfr_renamed_3151(int arg0, long arg1) {
        return ((long)arg0 & 0xFFFFFFFFL) << 48 | arg1;
    }
}

