/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfcb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjab;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprlhb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvsl;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwtba;
import com.spire.presentation.packages.sprxoa;
import com.spire.presentation.packages.sprxta;
import java.io.IOException;
import java.security.PrivateKey;

public class sprreb
implements sprt,
PrivateKey {
    private sprxta[] cfr_renamed_86;
    private sprjta cfr_renamed_152;
    private sprmpa cfr_renamed_112;
    private sprfcb cfr_renamed_119;
    private sprkqa cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private String cfr_renamed_2;
    private sprxta cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public sprxta[] cfr_renamed_1148() {
        return this.cfr_renamed_86;
    }

    public String toString() {
        String string = "";
        string = new StringBuilder().insert(0, string).append(sprwtba.cfr_renamed_9("\u0018:@+]1K6W1\u0018;]8J:]\u007fW9\u0018+P:\u00189Q:T;\u0018\u007f\u0018\u007f\u0018\u007f\u0002\u007f")).append(this.cfr_renamed_1).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprvsl.cfr_renamed_9("\u000f\u000bF\u0002J\u0001\\\u0006@\u0001\u000f\u0000IO[\u0007JOL\u0000K\n\u000fO\u000fO\u000fO\u000fO\u000fO\u000fO\u000fO\u0015O")).append(this.cfr_renamed_0).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprwtba.cfr_renamed_9("\u00186J-];M<Q=T:\u0018\u0018W/H>\u0018/W3A1W2Q>T\u007f\u0018\u007f\u0018\u007f\u0018\u007f\u0002\u007f")).append(this.cfr_renamed_3).append("\n").toString();
        return string;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_0;
    }

    public sprtzd cfr_renamed_113() {
        return new sprtzd("1.3.6.1.4.1.8301.3.1.3.4.2");
    }

    @Override
    public String getFormat() {
        return null;
    }

    public sprxta cfr_renamed_1147() {
        return this.cfr_renamed_3;
    }

    public sprmpa cfr_renamed_845() {
        return this.cfr_renamed_112;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprreb)) {
            return false;
        }
        sprreb sprreb2 = (sprreb)arg0;
        return this.cfr_renamed_1 == sprreb2.cfr_renamed_1 && this.cfr_renamed_0 == sprreb2.cfr_renamed_0 && this.cfr_renamed_112.equals(sprreb2.cfr_renamed_112) && this.cfr_renamed_3.equals(sprreb2.cfr_renamed_3) && this.cfr_renamed_91.equals(sprreb2.cfr_renamed_91) && this.cfr_renamed_152.equals(sprreb2.cfr_renamed_152);
    }

    public int hashCode() {
        sprreb sprreb2 = this;
        return sprreb2.cfr_renamed_0 + sprreb2.cfr_renamed_1 + this.cfr_renamed_112.hashCode() + this.cfr_renamed_3.hashCode() + this.cfr_renamed_91.hashCode() + this.cfr_renamed_152.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprreb(String string, int n, int n2, sprmpa sprmpa2, sprxta sprxta2, sprkqa sprkqa2, sprjta sprjta2, sprxta[] sprxtaArray) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprreb sprreb2 = this;
        sprreb sprreb3 = this;
        sprreb sprreb4 = this;
        sprreb sprreb5 = this;
        sprreb5.cfr_renamed_2 = arg0;
        sprreb5.cfr_renamed_1 = arg1;
        sprreb4.cfr_renamed_0 = arg2;
        sprreb4.cfr_renamed_112 = arg3;
        sprreb3.cfr_renamed_3 = arg4;
        sprreb3.cfr_renamed_91 = arg5;
        sprreb2.cfr_renamed_152 = arg6;
        sprreb2.cfr_renamed_86 = sprxtaArray;
    }

    public sprjta cfr_renamed_1153() {
        return this.cfr_renamed_152;
    }

    public sprvva cfr_renamed_1248() {
        return null;
    }

    @Override
    public String getAlgorithm() {
        return sprvsl.cfr_renamed_9("b\fj\u0003F\nL\n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprreb sprreb2 = this;
        sprreb sprreb3 = this;
        sprreb sprreb4 = this;
        sprjab sprjab2 = new sprjab(new sprtzd(this.cfr_renamed_2), sprreb2.cfr_renamed_1, sprreb2.cfr_renamed_0, sprreb3.cfr_renamed_112, sprreb3.cfr_renamed_3, sprreb4.cfr_renamed_91, sprreb4.cfr_renamed_152, this.cfr_renamed_86);
        try {
            sprije sprije2 = new sprije(this.cfr_renamed_113(), sprume.cfr_renamed_3);
            sprmke sprmke2 = new sprmke(sprije2, sprjab2);
            return (sprije)sprmke2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public sprkqa cfr_renamed_1155() {
        return this.cfr_renamed_91;
    }

    public sprfcb cfr_renamed_1247() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprreb(sprlhb sprlhb2) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1150(), arg0.cfr_renamed_845(), arg0.cfr_renamed_1147(), arg0.cfr_renamed_1155(), arg0.cfr_renamed_1153(), arg0.cfr_renamed_1148());
        void arg0;
        this.cfr_renamed_119 = sprlhb2.cfr_renamed_284();
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3.cfr_renamed_813();
    }

    public sprreb(sprxoa arg0) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1150(), arg0.cfr_renamed_845(), arg0.cfr_renamed_1147(), arg0.cfr_renamed_1155(), arg0.cfr_renamed_1153(), arg0.cfr_renamed_1148());
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_2;
    }
}

