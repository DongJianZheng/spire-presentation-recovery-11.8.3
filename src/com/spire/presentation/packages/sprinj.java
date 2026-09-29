/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprci;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepj;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjij;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprmtk;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprtci;
import com.spire.presentation.packages.spruv;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwhj;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.spryxh;
import com.spire.presentation.packages.sprzqh;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;

public class sprinj
implements spruv {
    private BigInteger cfr_renamed_2;
    public static final long cfr_renamed_3 = -6251023343619275990L;
    private transient sprci cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (this.cfr_renamed_4.cfr_renamed_2109() != null) {
            void v0 = arg0;
            sprinj sprinj2 = this;
            arg0.writeObject(sprinj2.cfr_renamed_4.cfr_renamed_2109());
            v0.writeObject(sprinj2.cfr_renamed_4.cfr_renamed_2108());
            v0.writeObject(this.cfr_renamed_4.cfr_renamed_2101());
            return;
        }
        void v2 = arg0;
        sprinj sprinj3 = this;
        void v4 = arg0;
        sprinj sprinj4 = this;
        arg0.writeObject(null);
        arg0.writeObject(sprinj4.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1155());
        v4.writeObject(sprinj4.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1604());
        v4.writeObject(this.cfr_renamed_4.cfr_renamed_130().cfr_renamed_1778());
        v2.writeObject(sprinj3.cfr_renamed_4.cfr_renamed_2108());
        v2.writeObject(sprinj3.cfr_renamed_4.cfr_renamed_2101());
    }

    /*
     * WARNING - void declaration
     */
    public sprinj(BigInteger bigInteger, spryxh spryxh2) {
        void arg0;
        sprinj sprinj2 = this;
        sprinj2.cfr_renamed_2 = arg0;
        sprinj2.cfr_renamed_4 = spryxh2;
    }

    @Override
    public String getAlgorithm() {
        return sprtci.cfr_renamed_9("\u0019u\rnm\u000eo\n");
    }

    /*
     * WARNING - void declaration
     */
    public sprinj(spruv spruv2) {
        void arg0;
        sprinj sprinj2 = this;
        sprinj2.cfr_renamed_2 = arg0.spr\u3181();
        sprinj2.cfr_renamed_4 = spruv2.cfr_renamed_284();
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
            sprvhm sprvhm2;
            if (this.cfr_renamed_4 instanceof spryxh) {
                sprvhm sprvhm3;
                if (this.cfr_renamed_4.cfr_renamed_2101() != null) {
                    sprvhm sprvhm4;
                    sprvhm3 = new sprvhm(new sprddm(sprqo.spr\ufe34, new sprxum(new sprlem(this.cfr_renamed_4.cfr_renamed_2109()), new sprlem(this.cfr_renamed_4.cfr_renamed_2108()), new sprlem(this.cfr_renamed_4.cfr_renamed_2101()))), new sprfvg(byArray2));
                    sprvhm2 = sprvhm4 = sprvhm3;
                } else {
                    sprvhm sprvhm5;
                    sprvhm3 = new sprvhm(new sprddm(sprqo.spr\ufe34, new sprxum(new sprlem(this.cfr_renamed_4.cfr_renamed_2109()), new sprlem(this.cfr_renamed_4.cfr_renamed_2108()))), new sprfvg(byArray2));
                    sprvhm2 = sprvhm5 = sprvhm3;
                }
            } else {
                sprvhm sprvhm6;
                sprvhm2 = sprvhm6 = new sprvhm(new sprddm(sprqo.spr\ufe34), new sprfvg(byArray2));
            }
            return sprjij.cfr_renamed_5675(sprvhm2);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprccb.cfr_renamed_9("\u000f+b5n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        try {
            return sprwhj.cfr_renamed_9411(sprtci.cfr_renamed_9("\u0019u\rnm\u000eo\n"), this.cfr_renamed_2, ((sprmtk)sprepj.cfr_renamed_1216(this)).cfr_renamed_284());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new IllegalStateException(invalidKeyException.getMessage());
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        String string = (String)objectInputStream.readObject();
        if (string != null) {
            sprinj sprinj2 = this;
            sprinj2.cfr_renamed_4 = new spryxh(string, (String)arg0.readObject(), (String)arg0.readObject());
            return;
        }
        this.cfr_renamed_4 = new spryxh(new sprmsh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject()));
        arg0.readObject();
        arg0.readObject();
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprinj) {
            sprinj sprinj2 = (sprinj)arg0;
            return this.cfr_renamed_2.equals(sprinj2.cfr_renamed_2) && this.cfr_renamed_4.equals(sprinj2.cfr_renamed_4);
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprinj(sprmtk sprmtk2, spryxh spryxh2) {
        void arg0;
        sprinj sprinj2 = this;
        sprinj2.cfr_renamed_2 = arg0.spr\u3181();
        sprinj2.cfr_renamed_4 = spryxh2;
    }

    public int hashCode() {
        return this.cfr_renamed_2.hashCode() ^ this.cfr_renamed_4.hashCode();
    }

    @Override
    public sprci cfr_renamed_284() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprinj(sprzqh sprzqh2) {
        void arg0;
        this.cfr_renamed_2 = sprzqh2.spr\u3181();
        sprinj sprinj2 = this;
        this.cfr_renamed_4 = new spryxh(new sprmsh(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_1778()));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprinj(sprvhm sprvhm2) {
        sprxum sprxum2 = sprxum.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
        try {
            int n;
            void arg0;
            byte[] byArray = ((sprfvg)arg0.cfr_renamed_1227()).cfr_renamed_186();
            byte[] byArray2 = new byte[byArray.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n;
                byte by = byArray[byArray.length - 1 - n];
                byArray2[n3] = by;
                n2 = ++n;
            }
            this.cfr_renamed_2 = new BigInteger(1, byArray2);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprccb.cfr_renamed_9(">k!d;l3%>k1jwv#w\"f#p%`wl9%\u0010J\u0004Qd1f5wu\"g;l4%<`."));
        }
        this.cfr_renamed_4 = spryxh.cfr_renamed_9051(sprxum2);
    }

    @Override
    public BigInteger spr\u3181() {
        return this.cfr_renamed_2;
    }
}

