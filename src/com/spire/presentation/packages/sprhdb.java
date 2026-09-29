/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhb;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruna;
import com.spire.presentation.packages.spruqr;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxgb;
import com.spire.presentation.packages.sprxta;
import java.io.IOException;
import java.security.PrivateKey;

public class sprhdb
implements sprt,
PrivateKey {
    private static final long cfr_renamed_102 = 1L;
    private int cfr_renamed_93;
    private sprjta cfr_renamed_86;
    private sprxta[] cfr_renamed_152;
    private int cfr_renamed_112;
    private sprjta cfr_renamed_119;
    private String cfr_renamed_91;
    private sprkqa cfr_renamed_0;
    private sprxta cfr_renamed_1;
    private sprdcb cfr_renamed_2;
    private sprkqa cfr_renamed_3;
    private sprmpa cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprhdb)) {
            return false;
        }
        sprhdb sprhdb2 = (sprhdb)arg0;
        return this.cfr_renamed_93 == sprhdb2.cfr_renamed_93 && this.cfr_renamed_112 == sprhdb2.cfr_renamed_112 && this.cfr_renamed_4.equals(sprhdb2.cfr_renamed_4) && this.cfr_renamed_1.equals(sprhdb2.cfr_renamed_1) && this.cfr_renamed_86.equals(sprhdb2.cfr_renamed_86) && this.cfr_renamed_0.equals(sprhdb2.cfr_renamed_0) && this.cfr_renamed_3.equals(sprhdb2.cfr_renamed_3) && this.cfr_renamed_119.equals(sprhdb2.cfr_renamed_119);
    }

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_1;
    }

    public sprvva cfr_renamed_1248() {
        return null;
    }

    public sprtzd cfr_renamed_113() {
        return new sprtzd("1.3.6.1.4.1.8301.3.1.3.4.1");
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprhdb(spruhb spruhb2) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1150(), arg0.cfr_renamed_845(), arg0.cfr_renamed_1147(), arg0.cfr_renamed_1149(), arg0.cfr_renamed_1152(), arg0.cfr_renamed_1151(), arg0.cfr_renamed_1153(), arg0.cfr_renamed_1148());
        void arg0;
        this.cfr_renamed_2 = spruhb2.cfr_renamed_284();
    }

    public sprkqa cfr_renamed_1151() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_91;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_119;
    }

    @Override
    public String getFormat() {
        return null;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_93;
    }

    public sprjta cfr_renamed_1149() {
        return this.cfr_renamed_86;
    }

    public sprdcb cfr_renamed_1238() {
        return this.cfr_renamed_2;
    }

    public sprkqa cfr_renamed_1152() {
        return this.cfr_renamed_0;
    }

    public int hashCode() {
        sprhdb sprhdb2 = this;
        return sprhdb2.cfr_renamed_112 + sprhdb2.cfr_renamed_93 + this.cfr_renamed_4.hashCode() + this.cfr_renamed_1.hashCode() + this.cfr_renamed_86.hashCode() + this.cfr_renamed_0.hashCode() + this.cfr_renamed_3.hashCode() + this.cfr_renamed_119.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprhdb sprhdb2 = this;
        sprhdb sprhdb3 = this;
        sprhdb sprhdb4 = this;
        sprhdb sprhdb5 = this;
        sprxgb sprxgb2 = new sprxgb(new sprtzd(this.cfr_renamed_91), sprhdb2.cfr_renamed_93, sprhdb2.cfr_renamed_112, sprhdb3.cfr_renamed_4, sprhdb3.cfr_renamed_1, sprhdb4.cfr_renamed_86, sprhdb4.cfr_renamed_0, sprhdb5.cfr_renamed_3, sprhdb5.cfr_renamed_119, this.cfr_renamed_152);
        try {
            sprije sprije2 = new sprije(this.cfr_renamed_113(), sprume.cfr_renamed_3);
            sprmke sprmke2 = new sprmke(sprije2, sprxgb2);
            return (sprije)sprmke2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String string = new StringBuilder().insert(0, spruqr.cfr_renamed_9("Qf\u0014d\u0016~\u0019*\u001elQ~\u0019oQi\u001en\u0014*Q*Q*Q*Q*Q0Q")).append(this.cfr_renamed_93).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprjpm.cfr_renamed_9("9?p6|5j2v594\u007f{m3|{z4}>9{9{9{9a9")).append(this.cfr_renamed_112).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(spruqr.cfr_renamed_9("Qc\u0003x\u0014n\u0004i\u0018h\u001doQM\u001ez\u0001kQz\u001ef\bd\u001eg\u0018k\u001d0Q")).append(this.cfr_renamed_1).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprjpm.cfr_renamed_9("9sr{a{rr46x/k2a{J\u00054j9{9{9{9{9a9")).append(this.cfr_renamed_86).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(spruqr.cfr_renamed_9("Qz\u0014x\u001c\u007f\u0005k\u0005c\u001edQZ@*Q*Q*Q*Q*Q*Q*Q0Q")).append(this.cfr_renamed_0).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprjpm.cfr_renamed_9("9+|)t.m:m2v59\u000b+{9{9{9{9{9{9{9a9")).append(this.cfr_renamed_3).toString();
        return string;
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_4;
    }

    public sprhdb(spruna arg0) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1150(), arg0.cfr_renamed_845(), arg0.cfr_renamed_1147(), arg0.cfr_renamed_1149(), arg0.cfr_renamed_1152(), arg0.cfr_renamed_1151(), arg0.cfr_renamed_1153(), arg0.cfr_renamed_1148());
    }

    @Override
    public String getAlgorithm() {
        return spruqr.cfr_renamed_9("G\u0012O\u001dc\u0014i\u0014");
    }

    /*
     * WARNING - void declaration
     */
    public sprhdb(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprjta sprjta2, sprkqa sprkqa2, sprkqa sprkqa3, sprjta sprjta3, sprxta[] sprxtaArray) {
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhdb sprhdb2 = this;
        sprhdb sprhdb3 = this;
        sprhdb sprhdb4 = this;
        sprhdb sprhdb5 = this;
        sprhdb sprhdb6 = this;
        sprhdb6.cfr_renamed_91 = arg0;
        sprhdb6.cfr_renamed_93 = arg1;
        sprhdb5.cfr_renamed_112 = arg2;
        sprhdb5.cfr_renamed_4 = arg3;
        sprhdb4.cfr_renamed_1 = arg4;
        sprhdb4.cfr_renamed_86 = arg5;
        sprhdb3.cfr_renamed_0 = arg6;
        sprhdb3.cfr_renamed_3 = arg7;
        sprhdb2.cfr_renamed_119 = arg8;
        sprhdb2.cfr_renamed_152 = sprxtaArray;
    }

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_152;
    }
}

