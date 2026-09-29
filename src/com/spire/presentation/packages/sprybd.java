/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbuc;
import com.spire.presentation.packages.sprcrc;
import com.spire.presentation.packages.sprdtc;
import com.spire.presentation.packages.sprek;
import com.spire.presentation.packages.sprfcd;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprhj;
import com.spire.presentation.packages.sprhsc;
import com.spire.presentation.packages.sprirc;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sproc;
import com.spire.presentation.packages.sproj;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprvyc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;

public class sprybd
extends sprkxc {
    public sprdtc cfr_renamed_119;
    public sprfrc cfr_renamed_91;
    public sprek cfr_renamed_0;
    public sproc cfr_renamed_1;
    public byte[] cfr_renamed_2;
    public sprvyc cfr_renamed_3;
    public sproj cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    @Override
    public void cfr_renamed_2873(short arg0, byte[] arg1) throws IOException {
        block78: {
            var3_3 = new ByteArrayInputStream(arg1);
            if (this.cfr_renamed_102) {
                if (arg0 != 20 || this.cfr_renamed_135 != 2) {
                    throw new spryad(10);
                }
                this.cfr_renamed_2887(var3_3);
                this.cfr_renamed_135 = (short)15;
                this.cfr_renamed_2889();
                this.cfr_renamed_135 = (short)13;
                this.cfr_renamed_135 = (short)16;
                return;
            }
            switch (arg0) {
                case 11: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 2: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_3035(null);
                        }
                        case 3: {
                            v0 = var3_3;
                            this.cfr_renamed_152 = sprbbd.cfr_renamed_2661(v0);
                            sprybd.cfr_renamed_2674(v0);
                            if (this.cfr_renamed_152 == null || this.cfr_renamed_152.cfr_renamed_29()) {
                                this.cfr_renamed_91 = (sprfrc)false;
                            }
                            v1 = this;
                            v1.cfr_renamed_1.cfr_renamed_2786(this.cfr_renamed_152);
                            this.cfr_renamed_4 = v1.cfr_renamed_0.cfr_renamed_3036();
                            v1.cfr_renamed_4.cfr_renamed_2422(this.cfr_renamed_152);
                            break;
                        }
                        default: {
                            throw new spryad(10);
                        }
                    }
                    v1.cfr_renamed_135 = (short)4;
                    return;
                }
                case 22: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 4: {
                            if (false) ** GOTO lbl-1000
                            if (this.cfr_renamed_91 == false) {
                                throw new spryad(10);
                            }
                            v2 = var3_3;
                            this.cfr_renamed_3 = sprvyc.cfr_renamed_2661(v2);
                            sprybd.cfr_renamed_2674(v2);
                            this.cfr_renamed_135 = (short)5;
                            return;
                        }
                    }
                    throw new spryad(10);
                }
                case 20: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 13: {
                            if (false) ** GOTO lbl-1000
                            if (this.cfr_renamed_724) {
                                throw new spryad(10);
                            }
                        }
                        case 14: {
                            this.cfr_renamed_2887(var3_3);
                            this.cfr_renamed_135 = (short)15;
                            this.cfr_renamed_135 = (short)16;
                            return;
                        }
                    }
                    throw new spryad(10);
                }
                case 2: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 1: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_3037(var3_3);
                            this.cfr_renamed_135 = (short)2;
                            if (this.cfr_renamed_126.cfr_renamed_112 >= 0) {
                                var4_4 = 1 << 8 + this.cfr_renamed_126.cfr_renamed_112;
                                this.cfr_renamed_133.cfr_renamed_2838(var4_4);
                            }
                            v3 = this;
                            this.cfr_renamed_126.cfr_renamed_91 = sprybd.cfr_renamed_2839(v3.cfr_renamed_2820(), this.cfr_renamed_126.cfr_renamed_2840());
                            this.cfr_renamed_126.cfr_renamed_3 = 12;
                            v3.cfr_renamed_133.cfr_renamed_2841();
                            if (this.cfr_renamed_102) {
                                this.cfr_renamed_126.cfr_renamed_152 = sprzra.cfr_renamed_158(this.cfr_renamed_82.cfr_renamed_2667());
                                v4 = this;
                                this.cfr_renamed_133.cfr_renamed_2859(this.cfr_renamed_2844().cfr_renamed_2860(), v4.cfr_renamed_2844().cfr_renamed_2471());
                                v4.cfr_renamed_2862();
                                return;
                            }
                            this.cfr_renamed_2929();
                            if (this.cfr_renamed_2.length > 0) {
                                v5 = this;
                                this.cfr_renamed_107 = new sprirc(this.cfr_renamed_2, null);
                                return;
                            }
                            break block78;
                        }
                        default: {
                            throw new spryad(10);
                        }
                    }
                }
                case 23: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 2: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_3035(sprybd.cfr_renamed_2885(var3_3));
                            return;
                        }
                    }
                    throw new spryad(10);
                }
                case 14: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 2: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_3035(null);
                        }
                        case 3: {
                            this.cfr_renamed_1.cfr_renamed_2798();
                            this.cfr_renamed_4 = null;
                        }
                        case 4: 
                        case 5: {
                            this.cfr_renamed_1.cfr_renamed_2956();
                        }
                        case 6: 
                        case 7: {
                            sprybd.cfr_renamed_2674(var3_3);
                            v6 = this;
                            v6.cfr_renamed_135 = (short)8;
                            v6.cfr_renamed_133.cfr_renamed_2881().cfr_renamed_2883();
                            var4_5 = v6.cfr_renamed_0.cfr_renamed_3038();
                            if (var4_5 != null) {
                                this.cfr_renamed_2874(var4_5);
                            }
                            this.cfr_renamed_135 = (short)9;
                            var5_7 = null;
                            v7 = this;
                            if (this.cfr_renamed_91 == null) {
                                v7.cfr_renamed_1.cfr_renamed_2845();
                                v8 = this;
                            } else {
                                var5_7 = v7.cfr_renamed_4.cfr_renamed_3039(this.cfr_renamed_91);
                                v9 = this;
                                if (var5_7 == null) {
                                    v9.cfr_renamed_1.cfr_renamed_2845();
                                    v10 = this;
                                    v8 = v10;
                                    v10.cfr_renamed_2877(sprbbd.cfr_renamed_4);
                                } else {
                                    v9.cfr_renamed_1.cfr_renamed_2796(var5_7);
                                    v11 = this;
                                    v8 = v11;
                                    v11.cfr_renamed_2877(var5_7.cfr_renamed_2141());
                                }
                            }
                            v8.cfr_renamed_135 = (short)10;
                            v12 = this;
                            this.cfr_renamed_3040();
                            this.cfr_renamed_135 = (short)11;
                            v13 = this;
                            sprybd.cfr_renamed_2858(v12.cfr_renamed_2820(), v13.cfr_renamed_1);
                            v13.cfr_renamed_133.cfr_renamed_2859(this.cfr_renamed_2844().cfr_renamed_2860(), this.cfr_renamed_2844().cfr_renamed_2471());
                            var6_8 = v12.cfr_renamed_133.cfr_renamed_2861();
                            if (var5_7 != null && var5_7 instanceof sprzk) {
                                var7_9 = (sprzk)var5_7;
                                if (sprzsc.cfr_renamed_2631(this.cfr_renamed_2820())) {
                                    var8_10 = var7_9.cfr_renamed_2804();
                                    if (var8_10 == null) {
                                        throw new spryad(80);
                                    }
                                    var9_11 = var6_8.cfr_renamed_2821(var8_10.cfr_renamed_2690());
                                    v14 = var7_9;
                                } else {
                                    var8_10 = null;
                                    var9_11 = sprybd.cfr_renamed_2822(this.cfr_renamed_2820(), var6_8, null);
                                    v14 = var7_9;
                                }
                                var10_12 = v14.cfr_renamed_2805(var9_11);
                                var11_13 = new sprpbd(var8_10, var10_12);
                                this.cfr_renamed_3041(var11_13);
                                this.cfr_renamed_135 = (short)12;
                            }
                            v15 = this;
                            v15.cfr_renamed_2862();
                            v15.cfr_renamed_2889();
                            this.cfr_renamed_135 = (short)13;
                            return;
                        }
                    }
                    throw new spryad(40);
                }
                case 12: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 2: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_3035(null);
                        }
                        case 3: {
                            this.cfr_renamed_1.cfr_renamed_2798();
                            this.cfr_renamed_4 = null;
                        }
                        case 4: 
                        case 5: {
                            ** break;
                        }
                        default: {
                            throw new spryad(10);
                        }
lbl-1000:
                        // 1 sources

                        {
                            v16 = var3_3;
                            this.cfr_renamed_1.cfr_renamed_2789(v16);
                            sprybd.cfr_renamed_2674(v16);
                            this.cfr_renamed_135 = (short)6;
                        }
                    }
                    return;
                }
                case 13: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 4: 
                        case 5: {
                            if (false) ** GOTO lbl-1000
                            this.cfr_renamed_1.cfr_renamed_2956();
                        }
                        case 6: {
                            if (this.cfr_renamed_4 == null) {
                                throw new spryad(40);
                            }
                            ** GOTO lbl-1000
                        }
                        default: {
                            throw new spryad(10);
                        }
lbl-1000:
                        // 1 sources

                        {
                            this.cfr_renamed_91 = sprfrc.cfr_renamed_2628(this.cfr_renamed_2820(), var3_3);
                            sprybd.cfr_renamed_2674(var3_3);
                            this.cfr_renamed_1.cfr_renamed_2803(this.cfr_renamed_91);
                            sprzsc.cfr_renamed_2689(this.cfr_renamed_133.cfr_renamed_2881(), this.cfr_renamed_91.cfr_renamed_2882());
                            this.cfr_renamed_135 = (short)7;
                        }
                    }
                    return;
                }
                case 4: {
                    switch (this.cfr_renamed_135) lbl-1000:
                    // 2 sources

                    {
                        case 13: {
                            if (false) ** GOTO lbl-1000
                            if (!this.cfr_renamed_724) {
                                throw new spryad(10);
                            }
                            v17 = this;
                            v17.cfr_renamed_2929();
                            v17.cfr_renamed_3042(var3_3);
                            this.cfr_renamed_135 = (short)14;
                            v18 = var3_3;
                            ** GOTO lbl211
                        }
                        default: {
                            throw new spryad(10);
                        }
                    }
                }
                case 0: {
                    v18 = var3_3;
                    while (false) {
                    }
lbl211:
                    // 2 sources

                    sprybd.cfr_renamed_2674(v18);
                    if (this.cfr_renamed_135 == 16) {
                        if (sprzsc.cfr_renamed_2665(this.cfr_renamed_2820())) {
                            throw new spryad(40);
                        }
                        var4_6 = sproqr.cfr_renamed_9("7\n\u000b\n\u0002\u0000\u0011\u0006\u0004\u001b\f\u0000\u000bO\u000b\u0000\u0011O\u0016\u001a\u0015\u001f\n\u001d\u0011\n\u0001");
                        this.cfr_renamed_2926((short)100, var4_6);
                        return;
                    }
                    break block78;
                }
            }
            throw new spryad(10);
        }
    }

    public void cfr_renamed_3035(Vector arg0) throws IOException {
        sprybd sprybd2 = this;
        sprybd2.cfr_renamed_0.cfr_renamed_2416(arg0);
        this.cfr_renamed_135 = (short)3;
        this.cfr_renamed_1 = sprybd2.cfr_renamed_0.cfr_renamed_2875();
        this.cfr_renamed_1.cfr_renamed_2797(this.cfr_renamed_2820());
    }

    public void cfr_renamed_3040() throws IOException {
        sprfcd sprfcd2;
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 16);
        this.cfr_renamed_1.cfr_renamed_2801(sprfcd3);
        sprfcd3.cfr_renamed_2818();
    }

    public void cfr_renamed_3042(ByteArrayInputStream arg0) throws IOException {
        ByteArrayInputStream byteArrayInputStream = arg0;
        sprbuc sprbuc2 = sprbuc.cfr_renamed_2661(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        this.cfr_renamed_0.cfr_renamed_3043(sprbuc2);
    }

    private static /* synthetic */ SecureRandom cfr_renamed_3044() {
        sprhsc sprhsc2 = new sprhsc();
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(sprhsc2.cfr_renamed_3045(20, true));
        return secureRandom;
    }

    /*
     * WARNING - void declaration
     */
    public sprybd(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        void arg2;
        void arg1;
        void arg0;
        sprybd sprybd2 = this;
        sprybd sprybd3 = this;
        sprybd sprybd4 = this;
        super((InputStream)arg0, (OutputStream)arg1, (SecureRandom)arg2);
        this.cfr_renamed_0 = null;
        sprybd4.cfr_renamed_119 = null;
        sprybd4.cfr_renamed_2 = null;
        sprybd3.cfr_renamed_1 = null;
        sprybd3.cfr_renamed_4 = null;
        sprybd2.cfr_renamed_3 = null;
        sprybd2.cfr_renamed_91 = null;
    }

    public void cfr_renamed_3041(sprpbd arg0) throws IOException {
        sprfcd sprfcd2;
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 15);
        arg0.cfr_renamed_2623(sprfcd3);
        sprfcd3.cfr_renamed_2818();
    }

    /*
     * Exception decompiling
     */
    public void cfr_renamed_3037(ByteArrayInputStream arg0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[DOLOOP]], but top level block is 1[WHILELOOP]
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
    public void cfr_renamed_2871() {
        sprybd sprybd2 = this;
        sprybd sprybd3 = this;
        super.cfr_renamed_2871();
        this.cfr_renamed_2 = null;
        sprybd3.cfr_renamed_1 = null;
        sprybd3.cfr_renamed_4 = null;
        sprybd2.cfr_renamed_3 = null;
        sprybd2.cfr_renamed_91 = null;
    }

    public void cfr_renamed_3046() throws IOException {
        boolean bl;
        sprfcd sprfcd2;
        byte[] byArray;
        sprpxc sprpxc2;
        block7: {
            block8: {
                sprybd sprybd2 = this;
                this.cfr_renamed_133.cfr_renamed_2826(sprybd2.cfr_renamed_0.cfr_renamed_3047());
                sprpxc2 = sprybd2.cfr_renamed_0.cfr_renamed_2824();
                if (sprpxc2.cfr_renamed_2848()) {
                    throw new spryad(80);
                }
                sprybd sprybd3 = this;
                sprybd3.cfr_renamed_2820().cfr_renamed_2850(sprpxc2);
                byArray = sprzsc.cfr_renamed_1;
                if (sprybd3.cfr_renamed_107 != null && ((byArray = this.cfr_renamed_107.cfr_renamed_2811()) == null || byArray.length > 32)) {
                    byArray = sprzsc.cfr_renamed_1;
                }
                sprybd sprybd4 = this;
                sprybd4.cfr_renamed_952 = sprybd4.cfr_renamed_0.cfr_renamed_3048();
                sprybd4.cfr_renamed_3 = sprybd4.cfr_renamed_0.cfr_renamed_3049();
                if (byArray.length <= 0 || this.cfr_renamed_82 == null) break block7;
                sprybd sprybd5 = this;
                if (!sprzra.cfr_renamed_539(sprybd5.cfr_renamed_952, sprybd5.cfr_renamed_82.cfr_renamed_2840())) break block8;
                sprybd sprybd6 = this;
                if (sprzra.cfr_renamed_557((short[])sprybd6.cfr_renamed_3, sprybd6.cfr_renamed_82.cfr_renamed_3050())) break block7;
            }
            byArray = sprzsc.cfr_renamed_1;
        }
        sprybd sprybd7 = this;
        sprybd7.cfr_renamed_4 = sprybd7.cfr_renamed_0.cfr_renamed_3051();
        sprfcd sprfcd3 = sprfcd2 = new sprfcd(this, 1);
        sprzsc.cfr_renamed_2749(sprpxc2, sprfcd3);
        sprfcd3.write(this.cfr_renamed_126.cfr_renamed_2726());
        sprzsc.cfr_renamed_2638(byArray, sprfcd3);
        byte[] byArray2 = sprzsc.cfr_renamed_2642((Hashtable)((Object)sprybd7.cfr_renamed_4), cfr_renamed_86);
        boolean bl2 = null == byArray2;
        boolean bl3 = bl = !sprzra.cfr_renamed_539(this.cfr_renamed_952, 255);
        if (bl2 && bl) {
            this.cfr_renamed_952 = sprzra.cfr_renamed_542(this.cfr_renamed_952, 255);
        }
        sprybd sprybd8 = this;
        sprzsc.cfr_renamed_2752(sprybd8.cfr_renamed_952, sprfcd2);
        sprzsc.cfr_renamed_2706((short[])sprybd8.cfr_renamed_3, sprfcd2);
        if (sprybd8.cfr_renamed_4 != null) {
            sprybd.cfr_renamed_2837(sprfcd2, (Hashtable)((Object)this.cfr_renamed_4));
        }
        sprfcd2.cfr_renamed_2818();
    }

    public void cfr_renamed_3052(sprek arg0) throws IOException {
        spruuc spruuc2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprseca.cfr_renamed_9("3\u0002x\u0005W\u001a}\u0013z\u00023Vw\u0017z\u0018{\u00024\u0014qVz\u0003x\u001a"));
        }
        if (this.cfr_renamed_0 != null) {
            throw new IllegalStateException(sproqr.cfr_renamed_9("B\f\n\u0001\u000b\n\u0006\u001bBO\u0006\u000e\u000bO\n\u0001\t\u0016E\r\u0000O\u0006\u000e\t\u0003\u0000\u000bE\u0000\u000b\f\u0000"));
        }
        sprybd sprybd2 = this;
        sprybd2.cfr_renamed_0 = arg0;
        sprybd sprybd3 = this;
        sprybd2.cfr_renamed_126 = new sprgbd();
        sprybd3.cfr_renamed_126.cfr_renamed_2 = 1;
        sprybd sprybd4 = this;
        sprybd2.cfr_renamed_119 = new sprdtc(sprybd4.cfr_renamed_499, sprybd4.cfr_renamed_126);
        sprybd2.cfr_renamed_126.cfr_renamed_86 = sprybd.cfr_renamed_2864(arg0.cfr_renamed_2865(), this.cfr_renamed_119.cfr_renamed_2866());
        sprybd2.cfr_renamed_0.cfr_renamed_3053(this.cfr_renamed_119);
        sprybd2.cfr_renamed_133.cfr_renamed_2797(this.cfr_renamed_119);
        sprzc sprzc2 = arg0.cfr_renamed_3054();
        if (sprzc2 != null && (spruuc2 = sprzc2.cfr_renamed_2813()) != null) {
            sprybd sprybd5 = this;
            sprybd5.cfr_renamed_107 = sprzc2;
            sprybd5.cfr_renamed_82 = spruuc2;
        }
        this.cfr_renamed_3046();
        this.cfr_renamed_135 = 1;
        this.cfr_renamed_2867();
    }

    @Override
    public sprhj cfr_renamed_2844() {
        return this.cfr_renamed_0;
    }

    public sprybd(InputStream arg0, OutputStream arg1) {
        this(arg0, arg1, sprybd.cfr_renamed_3044());
    }

    @Override
    public sprcrc cfr_renamed_2820() {
        return this.cfr_renamed_119;
    }
}

