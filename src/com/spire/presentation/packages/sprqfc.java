/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdqc;
import com.spire.presentation.packages.sprgpr;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmb;
import com.spire.presentation.packages.sprnnb;
import com.spire.presentation.packages.sprpc;
import com.spire.presentation.packages.sprpcd;
import com.spire.presentation.packages.sprqnb;
import com.spire.presentation.packages.sprriq;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprtzd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;

public class sprqfc
implements sprpc {
    public static final long cfr_renamed_2 = -6251023343619275990L;
    private BigInteger cfr_renamed_3;
    private transient sprmb cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqfc(sprpc sprpc2) {
        void arg0;
        sprqfc sprqfc2 = this;
        sprqfc2.cfr_renamed_3 = arg0.spr\u3181();
        sprqfc2.cfr_renamed_4 = sprpc2.cfr_renamed_284();
    }

    @Override
    public BigInteger spr\u3181() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprqfc(BigInteger bigInteger, sprnnb sprnnb2) {
        void arg0;
        sprqfc sprqfc2 = this;
        sprqfc2.cfr_renamed_3 = arg0;
        sprqfc2.cfr_renamed_4 = sprnnb2;
    }

    /*
     * WARNING - void declaration
     */
    public sprqfc(sprqnb sprqnb2) {
        void arg0;
        this.cfr_renamed_3 = sprqnb2.spr\u3181();
        sprqfc sprqfc2 = this;
        this.cfr_renamed_4 = new sprnnb(new sprrob(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_1778()));
    }

    @Override
    public String getAlgorithm() {
        return sprgpr.cfr_renamed_9("K(_3?S=W");
    }

    @Override
    public sprmb cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (this.cfr_renamed_4.cfr_renamed_2109() != null) {
            void v0 = arg0;
            sprqfc sprqfc2 = this;
            arg0.writeObject(sprqfc2.cfr_renamed_4.cfr_renamed_2109());
            v0.writeObject(sprqfc2.cfr_renamed_4.cfr_renamed_2108());
            v0.writeObject(this.cfr_renamed_4.cfr_renamed_2101());
            return;
        }
        void v2 = arg0;
        sprqfc sprqfc3 = this;
        void v4 = arg0;
        sprqfc sprqfc4 = this;
        arg0.writeObject(null);
        arg0.writeObject(sprqfc4.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1155());
        v4.writeObject(sprqfc4.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1604());
        v4.writeObject(this.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1778());
        v2.writeObject(sprqfc3.cfr_renamed_4.cfr_renamed_2108());
        v2.writeObject(sprqfc3.cfr_renamed_4.cfr_renamed_2101());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprriq.cfr_renamed_9("ZgXk\u0018}S~W|WzY|"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprgpr.cfr_renamed_9(" C4XT8V<G\\\u0012n\u000be\u0004,,i\u001e")).append(string);
        stringBuffer2.append(sprriq.cfr_renamed_9(".\u0016.\u0016.\u0016.\u0016.\u0016.\u0016w\f.")).append(this.spr\u3181().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprqfc(sprpcd sprpcd2, sprnnb sprnnb2) {
        void arg0;
        sprqfc sprqfc2 = this;
        sprqfc2.cfr_renamed_3 = arg0.spr\u3181();
        sprqfc2.cfr_renamed_4 = sprnnb2;
    }

    @Override
    public String getFormat() {
        return sprgpr.cfr_renamed_9("?\"R<^");
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprqfc) {
            sprqfc sprqfc2 = (sprqfc)arg0;
            return this.cfr_renamed_3.equals(sprqfc2.cfr_renamed_3) && this.cfr_renamed_4.equals(sprqfc2.cfr_renamed_4);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqfc(sprdce arg0) {
        sprsme sprsme2 = new sprsme((sprbne)arg0.cfr_renamed_1473().cfr_renamed_284());
        try {
            int n;
            byte[] byArray = ((sprlqe)arg0.cfr_renamed_1227()).cfr_renamed_186();
            byte[] byArray2 = new byte[byArray.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n;
                byte by = byArray[byArray.length - 1 - n];
                byArray2[n3] = by;
                n2 = ++n;
            }
            this.cfr_renamed_3 = new BigInteger(1, byArray2);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprriq.cfr_renamed_9("gXxWb_j\u0016gXhY.EzD{UzC|S._`\u0016Iy]b=\u0002?\u0006.F{Tb_m\u0016eSw"));
        }
        this.cfr_renamed_4 = sprnnb.cfr_renamed_2104(sprsme2);
    }

    @Override
    public byte[] getEncoded() {
        int n;
        byte[] byArray = this.spr\u3181().toByteArray();
        byte[] byArray2 = byArray[0] == 0 ? new byte[byArray.length - 1] : new byte[byArray.length];
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n;
            byte by = byArray[byArray.length - 1 - n];
            byArray2[n3] = by;
            n2 = ++n;
        }
        try {
            sprdce sprdce2;
            if (this.cfr_renamed_4 instanceof sprnnb) {
                sprdce sprdce3;
                if (this.cfr_renamed_4.cfr_renamed_2101() != null) {
                    sprdce sprdce4;
                    sprdce3 = new sprdce(new sprije(sprji.cfr_renamed_102, new sprsme(new sprtzd(this.cfr_renamed_4.cfr_renamed_2109()), new sprtzd(this.cfr_renamed_4.cfr_renamed_2108()), new sprtzd(this.cfr_renamed_4.cfr_renamed_2101()))), new sprlqe(byArray2));
                    sprdce2 = sprdce4 = sprdce3;
                } else {
                    sprdce sprdce5;
                    sprdce3 = new sprdce(new sprije(sprji.cfr_renamed_102, new sprsme(new sprtzd(this.cfr_renamed_4.cfr_renamed_2109()), new sprtzd(this.cfr_renamed_4.cfr_renamed_2108()))), new sprlqe(byArray2));
                    sprdce2 = sprdce5 = sprdce3;
                }
            } else {
                sprdce sprdce6;
                sprdce2 = sprdce6 = new sprdce(new sprije(sprji.cfr_renamed_102), new sprlqe(byArray2));
            }
            return sprdqc.cfr_renamed_1188(sprdce2);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_4.hashCode();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        String string = (String)objectInputStream.readObject();
        if (string != null) {
            sprqfc sprqfc2 = this;
            sprqfc2.cfr_renamed_4 = new sprnnb(string, (String)arg0.readObject(), (String)arg0.readObject());
            return;
        }
        this.cfr_renamed_4 = new sprnnb(new sprrob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject()));
        arg0.readObject();
        arg0.readObject();
    }
}

