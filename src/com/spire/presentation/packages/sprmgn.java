/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfgn;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqnaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprurca;
import com.spire.presentation.packages.sprven;
import com.spire.presentation.packages.sprvfia;
import com.spire.presentation.packages.sprvvja;
import com.spire.presentation.packages.sprzcf;

@sprtea
public class sprmgn
extends spreen {
    @sprtea
    public sprgtja cfr_renamed_96;
    @sprtea
    public int cfr_renamed_105;
    private boolean cfr_renamed_137;
    @sprtea
    public spracn cfr_renamed_79;
    @sprtea
    public int cfr_renamed_107;
    @sprtea
    public int cfr_renamed_132;
    private sprven cfr_renamed_102;
    @sprtea
    public boolean cfr_renamed_93;
    @sprtea
    public String cfr_renamed_86;
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public int cfr_renamed_112;
    @sprtea
    public String cfr_renamed_119;
    @sprtea
    public byte[] cfr_renamed_91;
    @sprtea
    public int cfr_renamed_0;
    @sprtea
    public int cfr_renamed_1;
    @sprtea
    public spreen cfr_renamed_2;
    @sprtea
    public int cfr_renamed_3;
    @sprtea
    public byte[] cfr_renamed_4;

    /*
     * Exception decompiling
     */
    public static byte[] cfr_renamed_11545(byte[] arg0, sprvfia arg1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    private /* synthetic */ byte[] cfr_renamed_11592() {
        if (this.cfr_renamed_91 == null) {
            this.cfr_renamed_91 = new byte[this.cfr_renamed_105];
        }
        return this.cfr_renamed_91;
    }

    private /* synthetic */ String cfr_renamed_11593() {
        boolean bl;
        sprpdja sprpdja2 = new sprpdja();
        boolean bl2 = false;
        do {
            sprmgn sprmgn2 = this;
            int n = sprmgn2.cfr_renamed_2.cfr_renamed_11556(sprmgn2.cfr_renamed_4, 0, 1);
            if (n != 1) {
                throw new sprurca(sprqnaa.cfr_renamed_9("\u0005+5=  315!p\u0000\u001f\u0003p75$4,>\"p\u0002\n\f\u0000e8 1!57~"));
            }
            if (this.cfr_renamed_4[0] == 0) {
                bl = bl2 = true;
                continue;
            }
            sprpdja2.cfr_renamed_11594(this.cfr_renamed_4[0]);
            bl = bl2;
        } while (!bl);
        byte[] byArray = sprpdja2.cfr_renamed_4529();
        return sprfgn.cfr_renamed_152.cfr_renamed_11595(byArray, 0, byArray.length);
    }

    @Override
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        int n;
        if (this.cfr_renamed_102 != null) {
            this.cfr_renamed_102.cfr_renamed_11596(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_112 == 2) {
            n = arg2;
            this.cfr_renamed_112 = 0;
        } else {
            if (this.cfr_renamed_112 != 0) {
                throw new sprurca(sprzcf.cfr_renamed_9("\"R\u000f]\u000eGAd\u0013Z\u0015VAR\u0007G\u0004AAa\u0004R\u0005Z\u000fTO"));
            }
            n = arg2;
        }
        if (n == 0) {
            return;
        }
        sprmgn sprmgn2 = this;
        sprmgn2.cfr_renamed_11597().cfr_renamed_86 = arg0;
        sprmgn2.cfr_renamed_79.cfr_renamed_91 = arg1;
        sprmgn2.cfr_renamed_79.cfr_renamed_0 = arg2;
        boolean bl = false;
        do {
            int n2;
            sprmgn sprmgn3 = this;
            sprmgn3.cfr_renamed_79.cfr_renamed_112 = this.cfr_renamed_11592();
            this.cfr_renamed_79.cfr_renamed_79 = 0;
            sprmgn3.cfr_renamed_79.cfr_renamed_119 = this.cfr_renamed_91.length;
            sprmgn sprmgn4 = this;
            int n3 = n2 = this.cfr_renamed_11598() ? sprmgn4.cfr_renamed_79.cfr_renamed_11584(this.cfr_renamed_3) : sprmgn4.cfr_renamed_79.cfr_renamed_11588(this.cfr_renamed_3);
            if (n2 != 0 && n2 != 1) {
                throw new sprurca((this.cfr_renamed_11598() ? sprqnaa.cfr_renamed_9("!5") : "in") + sprzcf.cfr_renamed_9("\u0007_\u0000G\b]\u0006\tA") + this.cfr_renamed_79.cfr_renamed_3);
            }
            sprmgn sprmgn5 = this;
            sprmgn5.cfr_renamed_2.cfr_renamed_4924(sprmgn5.cfr_renamed_91, 0, this.cfr_renamed_91.length - this.cfr_renamed_79.cfr_renamed_119);
            boolean bl2 = bl = this.cfr_renamed_79.cfr_renamed_0 == 0 && this.cfr_renamed_79.cfr_renamed_119 != 0;
            if (this.cfr_renamed_0 != 1952 || this.cfr_renamed_11598()) continue;
            boolean bl3 = bl = this.cfr_renamed_79.cfr_renamed_0 == 8 && this.cfr_renamed_79.cfr_renamed_119 != 0;
        } while (!bl);
    }

    @Override
    public void cfr_renamed_11548(long arg0) {
        throw new UnsupportedOperationException();
    }

    @sprtea
    public int cfr_renamed_11599() {
        if (this.cfr_renamed_102 == null) {
            return 0;
        }
        return this.cfr_renamed_102.cfr_renamed_11600();
    }

    @Override
    public void cfr_renamed_2947() {
        this.cfr_renamed_2.cfr_renamed_2947();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2637() {
        if (this.cfr_renamed_2 == null) {
            return;
        }
        try {
            this.cfr_renamed_3120();
            return;
        }
        finally {
            sprmgn sprmgn2 = this;
            sprmgn2.cfr_renamed_11575();
            if (!sprmgn2.cfr_renamed_93) {
                this.cfr_renamed_2.cfr_renamed_2637();
            }
            this.cfr_renamed_2 = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_11550(byte[] arg0, sprvfia arg1) {
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprpdja sprpdja3;
            block7: {
                block6: {
                    Object[] objectArray = new Object[3];
                    objectArray[0] = sprpdja2;
                    objectArray[1] = 0;
                    objectArray[2] = 9;
                    spreen spreen2 = (spreen)arg1.cfr_renamed_11601(sprqnaa.cfr_renamed_9("\u0004-96p\f\u0003e\u0019\">*\" 4"), 512, null, null, objectArray);
                    try {
                        spreen2.cfr_renamed_4924(arg0, 0, arg0.length);
                        if (spreen2 == null) break block6;
                        sprpdja3 = sprpdja2;
                        spreen2.cfr_renamed_2637();
                        break block7;
                    }
                    catch (Throwable throwable) {
                        if (spreen2 == null) throw throwable;
                        spreen2.cfr_renamed_2637();
                        throw throwable;
                    }
                }
                sprpdja3 = sprpdja2;
            }
            byte[] byArray = sprpdja3.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    @sprtea
    public boolean cfr_renamed_11598() {
        return this.cfr_renamed_152 == 0;
    }

    private /* synthetic */ void cfr_renamed_3120() {
        if (this.cfr_renamed_79 == null) {
            return;
        }
        if (this.cfr_renamed_112 == 0) {
            int n;
            boolean bl = false;
            do {
                sprmgn sprmgn2 = this;
                sprmgn2.cfr_renamed_79.cfr_renamed_112 = this.cfr_renamed_11592();
                this.cfr_renamed_79.cfr_renamed_79 = 0;
                sprmgn2.cfr_renamed_79.cfr_renamed_119 = this.cfr_renamed_91.length;
                int n2 = n = this.cfr_renamed_11598() ? this.cfr_renamed_79.cfr_renamed_11584(4) : this.cfr_renamed_79.cfr_renamed_11588(4);
                if (n != 1 && n != 0) {
                    throw new sprurca((this.cfr_renamed_11598() ? sprzcf.cfr_renamed_9("W\u0004") : "in") + sprqnaa.cfr_renamed_9("6)119+7\u007fp") + this.cfr_renamed_79.cfr_renamed_3);
                }
                if (this.cfr_renamed_91.length - this.cfr_renamed_79.cfr_renamed_119 > 0) {
                    sprmgn sprmgn3 = this;
                    sprmgn3.cfr_renamed_2.cfr_renamed_4924(sprmgn3.cfr_renamed_91, 0, this.cfr_renamed_91.length - this.cfr_renamed_79.cfr_renamed_119);
                }
                boolean bl2 = bl = this.cfr_renamed_79.cfr_renamed_0 == 0 && this.cfr_renamed_79.cfr_renamed_119 != 0;
                if (this.cfr_renamed_0 != 1952 || this.cfr_renamed_11598()) continue;
                boolean bl3 = bl = this.cfr_renamed_79.cfr_renamed_0 == 8 && this.cfr_renamed_79.cfr_renamed_119 != 0;
            } while (!bl);
            sprmgn sprmgn4 = this;
            sprmgn4.cfr_renamed_2947();
            if (sprmgn4.cfr_renamed_0 == 1952) {
                if (this.cfr_renamed_11598()) {
                    sprmgn sprmgn5 = this;
                    n = sprmgn5.cfr_renamed_102.cfr_renamed_11600();
                    sprmgn5.cfr_renamed_2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(n), 0, 4);
                    int n3 = (int)(sprmgn5.cfr_renamed_102.cfr_renamed_11603() & 0xFFFFFFFFL);
                    sprmgn5.cfr_renamed_2.cfr_renamed_4924(sprtzja.cfr_renamed_11602(n3), 0, 4);
                    return;
                }
                throw new sprurca(sprzcf.cfr_renamed_9("d\u0013Z\u0015Z\u000fTAD\bG\t\u0013\u0005V\u0002\\\fC\u0013V\u0012@\b\\\u000f\u0013\b@A]\u000eGA@\u0014C\u0011\\\u0013G\u0004WO"));
            }
        } else if (this.cfr_renamed_112 == 1 && this.cfr_renamed_0 == 1952) {
            if (!this.cfr_renamed_11598()) {
                if (this.cfr_renamed_79.cfr_renamed_93 == 0L) {
                    return;
                }
                byte[] byArray = new byte[8];
                if (this.cfr_renamed_79.cfr_renamed_0 != 8) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = this.cfr_renamed_79.cfr_renamed_0;
                    throw new sprurca(sprraia.cfr_renamed_11562(sprqnaa.cfr_renamed_9("\u0015\"*$*3*<e57\"*\"kp\u0004&$9)1'< \u0012<$ #\f>x+u-ip (55&$ 4eh"), objectArray));
                }
                System.arraycopy(this.cfr_renamed_79.cfr_renamed_86, this.cfr_renamed_79.cfr_renamed_91, byArray, 0, byArray.length);
                sprmgn sprmgn6 = this;
                int n = sprtzja.cfr_renamed_11604(byArray, 0);
                int n4 = sprmgn6.cfr_renamed_102.cfr_renamed_11600();
                int n5 = sprtzja.cfr_renamed_11604(byArray, 4);
                int n6 = (int)(sprmgn6.cfr_renamed_79.cfr_renamed_93 & 0xFFFFFFFFL);
                if (n4 != n) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = n4;
                    objectArray[1] = n;
                    throw new sprurca(sprraia.cfr_renamed_11562(sprzcf.cfr_renamed_9("q\u0000WAp3pR\u0001AZ\u000f\u0013&i(cA@\u0015A\u0004R\f\u001dA\u001b\u0000P\u0015F\u0000_IHQ\t9\u000b\u001c\u001a@\u000e\u0004K\u0011V\u0002G\u0004WIHP\t9\u000b\u001c\u001aH"), objectArray));
                }
                if (n6 != n5) {
                    Object[] objectArray = new Object[2];
                    objectArray[0] = n6;
                    objectArray[1] = n5;
                    throw new sprurca(sprraia.cfr_renamed_11562(sprqnaa.cfr_renamed_9("\u0012$4e#,* p,>e\u0017\u001f\u0019\u0015p6$75$=kpm1&$01)x>`8ydm (55&$ 4m+t-ly"), objectArray));
                }
            } else {
                throw new sprurca(sprzcf.cfr_renamed_9("a\u0004R\u0005Z\u000fTAD\bG\t\u0013\u0002\\\fC\u0013V\u0012@\b\\\u000f\u0013\b@A]\u000eGA@\u0014C\u0011\\\u0013G\u0004WO"));
            }
        }
    }

    private /* synthetic */ void cfr_renamed_11575() {
        sprmgn sprmgn2;
        if (this.cfr_renamed_11597() == null) {
            return;
        }
        if (this.cfr_renamed_11598()) {
            sprmgn sprmgn3 = this;
            sprmgn2 = sprmgn3;
            sprmgn3.cfr_renamed_79.cfr_renamed_11579();
        } else {
            sprmgn sprmgn4 = this;
            sprmgn2 = sprmgn4;
            sprmgn4.cfr_renamed_79.cfr_renamed_11574();
        }
        sprmgn2.cfr_renamed_79 = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_11554(String arg0, sprvfia arg1) {
        byte[] byArray = sprszca.cfr_renamed_11605().cfr_renamed_11606(arg0);
        sprpdja sprpdja2 = new sprpdja();
        try {
            sprpdja sprpdja3;
            block7: {
                block6: {
                    Object[] objectArray = new Object[3];
                    objectArray[0] = sprpdja2;
                    objectArray[1] = 0;
                    objectArray[2] = 9;
                    spreen spreen2 = (spreen)arg1.cfr_renamed_11601(sprqnaa.cfr_renamed_9("\u0004-96p\f\u0003e\u0019\">*\" 4"), 512, null, null, objectArray);
                    try {
                        spreen2.cfr_renamed_4924(byArray, 0, byArray.length);
                        if (spreen2 == null) break block6;
                        sprpdja3 = sprpdja2;
                        spreen2.cfr_renamed_2637();
                        break block7;
                    }
                    catch (Throwable throwable) {
                        if (spreen2 == null) throw throwable;
                        spreen2.cfr_renamed_2637();
                        throw throwable;
                    }
                }
                sprpdja3 = sprpdja2;
            }
            byte[] byArray2 = sprpdja3.cfr_renamed_4529();
            return byArray2;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    private /* synthetic */ int cfr_renamed_11607() {
        int n = 0;
        byte[] byArray = new byte[10];
        int n2 = this.cfr_renamed_2.cfr_renamed_11556(byArray, 0, byArray.length);
        if (n2 == 0) {
            return 0;
        }
        if (n2 != 10) {
            throw new sprurca(sprzcf.cfr_renamed_9("}\u000eGARAE\u0000_\bWAt;z1\u0013\u0012G\u0013V\u0000^O"));
        }
        if (byArray[0] != 31 || (byArray[1] & 0xFF) != 139 || byArray[2] != 8) {
            throw new sprurca(sprqnaa.cfr_renamed_9("\u00071!p\u0002\n\f\u0000e8 1!57~"));
        }
        int n3 = sprtzja.cfr_renamed_11604(byArray, 4);
        this.cfr_renamed_96 = sprfgn.cfr_renamed_119.cfr_renamed_11608(n3);
        n += n2;
        if ((byArray[3] & 0xFF & 4) == 4) {
            sprmgn sprmgn2 = this;
            n2 = sprmgn2.cfr_renamed_2.cfr_renamed_11556(byArray, 0, 2);
            n += n2;
            short s = (short)((byArray[0] & 0xFF) + (byArray[1] & 0xFF) * 256);
            byte[] byArray2 = new byte[s];
            n2 = sprmgn2.cfr_renamed_2.cfr_renamed_11556(byArray2, 0, byArray2.length);
            if (n2 != s) {
                throw new sprurca(sprzcf.cfr_renamed_9("4]\u0004K\u0011V\u0002G\u0004WAV\u000fWL\\\u0007\u001e\u0007Z\rVAA\u0004R\u0005Z\u000fTAt;z1\u0013\tV\u0000W\u0004AO"));
            }
            n += n2;
        }
        if ((byArray[3] & 0xFF & 8) == 8) {
            this.cfr_renamed_119 = this.cfr_renamed_11593();
        }
        if ((byArray[3] & 0xFF & 0x10) == 16) {
            this.cfr_renamed_86 = this.cfr_renamed_11593();
        }
        if ((byArray[3] & 0xFF & 2) == 2) {
            sprmgn sprmgn3 = this;
            sprmgn3.cfr_renamed_11556(sprmgn3.cfr_renamed_4, 0, 1);
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spracn cfr_renamed_11597() {
        sprmgn sprmgn2;
        if (this.cfr_renamed_79 == null) {
            boolean bl = this.cfr_renamed_0 == 1950;
            this.cfr_renamed_79 = new spracn();
            if (this.cfr_renamed_152 == 1) {
                sprmgn sprmgn3 = this;
                sprmgn2 = sprmgn3;
                sprmgn3.cfr_renamed_79.cfr_renamed_11576(bl);
                return sprmgn2.cfr_renamed_79;
            }
            sprmgn sprmgn4 = this;
            sprmgn4.cfr_renamed_79.cfr_renamed_1 = sprmgn4.cfr_renamed_107;
            sprmgn4.cfr_renamed_79.cfr_renamed_11582(this.cfr_renamed_132, bl);
        }
        sprmgn2 = this;
        return sprmgn2.cfr_renamed_79;
    }

    @Override
    public boolean cfr_renamed_11552() {
        return this.cfr_renamed_2.cfr_renamed_11552();
    }

    @Override
    public boolean cfr_renamed_11560() {
        return this.cfr_renamed_2.cfr_renamed_11560();
    }

    @Override
    public long cfr_renamed_11547(long arg0, int arg1) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int cfr_renamed_11556(byte[] arg0, int arg1, int arg2) {
        sprmgn sprmgn2;
        int n;
        block20: {
            if (this.cfr_renamed_112 == 2) {
                if (!this.cfr_renamed_2.cfr_renamed_11552()) {
                    throw new sprurca(sprqnaa.cfr_renamed_9("\u0004-5e#1\" 1(p,#e>*$e\" 1!1'< ~"));
                }
                this.cfr_renamed_112 = 1;
                this.cfr_renamed_11597().cfr_renamed_0 = 0;
                if (this.cfr_renamed_0 == 1952) {
                    sprmgn sprmgn3 = this;
                    sprmgn3.cfr_renamed_1 = sprmgn3.cfr_renamed_11607();
                    if (sprmgn3.cfr_renamed_1 == 0) {
                        return 0;
                    }
                }
            }
            if (this.cfr_renamed_112 != 1) {
                throw new sprurca(sprzcf.cfr_renamed_9("p\u0000]\u000f\\\u0015\u00133V\u0000WAR\u0007G\u0004AAd\u0013Z\u0015Z\u000fTO"));
            }
            if (arg2 == 0) {
                return 0;
            }
            if (this.cfr_renamed_137 && this.cfr_renamed_11598()) {
                return 0;
            }
            if (arg0 == null) {
                throw new NullPointerException(sprqnaa.cfr_renamed_9("'%#6 \""));
            }
            if (arg2 < 0) {
                throw new IllegalArgumentException(sprzcf.cfr_renamed_9("1R\u0013R\fV\u0015V\u0013\u0013\u000fR\fV[\u0013\u0002\\\u0014]\u0015"));
            }
            if (arg1 < sprvvja.cfr_renamed_11609(arg0).cfr_renamed_11610(0)) {
                throw new IllegalArgumentException(sprqnaa.cfr_renamed_9("\u0015171(5157p+1(5\u007fp*6## $"));
            }
            if (arg1 + arg2 > arg0.length) {
                throw new IllegalArgumentException(sprzcf.cfr_renamed_9("1R\u0013R\fV\u0015V\u0013\u0013\u000fR\fV[\u0013\u0002\\\u0014]\u0015"));
            }
            n = 0;
            sprmgn sprmgn4 = this;
            sprmgn4.cfr_renamed_79.cfr_renamed_112 = arg0;
            sprmgn4.cfr_renamed_79.cfr_renamed_79 = arg1;
            sprmgn4.cfr_renamed_79.cfr_renamed_119 = arg2;
            sprmgn4.cfr_renamed_79.cfr_renamed_86 = this.cfr_renamed_11592();
            do {
                if (this.cfr_renamed_79.cfr_renamed_0 == 0 && !this.cfr_renamed_137) {
                    sprmgn sprmgn5 = this;
                    sprmgn5.cfr_renamed_79.cfr_renamed_91 = 0;
                    sprmgn sprmgn6 = this;
                    sprmgn5.cfr_renamed_79.cfr_renamed_0 = sprmgn6.cfr_renamed_2.cfr_renamed_11556(sprmgn6.cfr_renamed_91, 0, this.cfr_renamed_91.length);
                    if (this.cfr_renamed_79.cfr_renamed_0 == 0) {
                        this.cfr_renamed_137 = true;
                    }
                }
                sprmgn sprmgn7 = this;
                int n2 = n = this.cfr_renamed_11598() ? sprmgn7.cfr_renamed_79.cfr_renamed_11584(this.cfr_renamed_3) : sprmgn7.cfr_renamed_79.cfr_renamed_11588(this.cfr_renamed_3);
                if (this.cfr_renamed_137 && n == -5) {
                    return 0;
                }
                if (n != 0 && n != 1) {
                    Object[] objectArray = new Object[3];
                    objectArray[0] = this.cfr_renamed_11598() ? sprzcf.cfr_renamed_9("W\u0004") : "in";
                    objectArray[1] = n;
                    objectArray[2] = this.cfr_renamed_79.cfr_renamed_3;
                    throw new sprurca(sprraia.cfr_renamed_11562(sprqnaa.cfr_renamed_9(">`86)119+7\u007fpe\"&m>a8pe=67x+w-"), objectArray));
                }
                if (!this.cfr_renamed_137 && n != 1 || this.cfr_renamed_79.cfr_renamed_119 != arg2) continue;
                sprmgn2 = this;
                break block20;
            } while (this.cfr_renamed_79.cfr_renamed_119 > 0 && !this.cfr_renamed_137 && n == 0);
            sprmgn2 = this;
        }
        if (sprmgn2.cfr_renamed_79.cfr_renamed_119 > 0) {
            if (n != 0 || this.cfr_renamed_79.cfr_renamed_0 == 0) {
                // empty if block
            }
            if (this.cfr_renamed_137 && this.cfr_renamed_11598() && (n = this.cfr_renamed_79.cfr_renamed_11584(4)) != 0 && n != 1) {
                Object[] objectArray = new Object[2];
                objectArray[0] = n;
                objectArray[1] = this.cfr_renamed_79.cfr_renamed_3;
                throw new sprurca(sprraia.cfr_renamed_11562(sprqnaa.cfr_renamed_9("\u0014 6)119+7\u007fpe\"&m>`8pe=67x+t-"), objectArray));
            }
        }
        n = arg2 - this.cfr_renamed_79.cfr_renamed_119;
        if (this.cfr_renamed_102 != null) {
            this.cfr_renamed_102.cfr_renamed_11596(arg0, arg1, n);
        }
        return n;
    }

    @Override
    public long cfr_renamed_806() {
        return this.cfr_renamed_2.cfr_renamed_806();
    }

    /*
     * WARNING - void declaration
     */
    public sprmgn(spreen spreen2, int n, int n2, int n3, boolean bl) {
        void arg2;
        void arg3;
        void arg1;
        void arg4;
        void arg0;
        sprmgn sprmgn2 = this;
        sprmgn sprmgn3 = this;
        sprmgn sprmgn4 = this;
        sprmgn sprmgn5 = this;
        sprmgn sprmgn6 = this;
        sprmgn sprmgn7 = this;
        sprmgn7.cfr_renamed_79 = null;
        sprmgn7.cfr_renamed_112 = 2;
        sprmgn6.cfr_renamed_105 = 8192;
        sprmgn6.cfr_renamed_4 = new byte[1];
        sprmgn5.cfr_renamed_107 = 0;
        sprmgn5.cfr_renamed_137 = false;
        sprmgn4.cfr_renamed_3 = 0;
        sprmgn4.cfr_renamed_2 = arg0;
        sprmgn3.cfr_renamed_93 = arg4;
        sprmgn3.cfr_renamed_152 = arg1;
        sprmgn2.cfr_renamed_0 = arg3;
        sprmgn2.cfr_renamed_132 = arg2;
        if (n3 == 1952) {
            sprmgn sprmgn8 = this;
            sprmgn8.cfr_renamed_102 = new sprven();
        }
    }

    @Override
    public long cfr_renamed_3274() {
        throw new UnsupportedOperationException();
    }

    /*
     * Exception decompiling
     */
    public static String cfr_renamed_11542(byte[] arg0, sprvfia arg1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: non catch before exception catch block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2354)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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
    public void cfr_renamed_11561(long arg0) {
        this.cfr_renamed_2.cfr_renamed_11561(arg0);
    }

    @Override
    public boolean cfr_renamed_11557() {
        return this.cfr_renamed_2.cfr_renamed_11557();
    }
}

