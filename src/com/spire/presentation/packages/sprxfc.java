/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnc;
import com.spire.presentation.packages.sprnjb;
import com.spire.presentation.packages.sprnnb;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprshd;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprstq;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;

public class sprxfc
implements sprnc,
sprwb {
    public static final long cfr_renamed_1 = 8581661527592305464L;
    private transient sprmb cfr_renamed_2;
    private transient sprwb cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (this.cfr_renamed_2.cfr_renamed_2109() != null) {
            void v0 = arg0;
            sprxfc sprxfc2 = this;
            arg0.writeObject(sprxfc2.cfr_renamed_2.cfr_renamed_2109());
            v0.writeObject(sprxfc2.cfr_renamed_2.cfr_renamed_2108());
            v0.writeObject(this.cfr_renamed_2.cfr_renamed_2101());
            return;
        }
        void v2 = arg0;
        sprxfc sprxfc3 = this;
        void v4 = arg0;
        sprxfc sprxfc4 = this;
        arg0.writeObject(null);
        arg0.writeObject(sprxfc4.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1155());
        v4.writeObject(sprxfc4.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1604());
        v4.writeObject(this.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1778());
        v2.writeObject(sprxfc3.cfr_renamed_2.cfr_renamed_2108());
        v2.writeObject(sprxfc3.cfr_renamed_2.cfr_renamed_2101());
    }

    /*
     * WARNING - void declaration
     */
    public sprxfc(sprnjb sprnjb2) {
        void arg0;
        sprxfc sprxfc2 = this;
        sprxfc sprxfc3 = this;
        sprxfc2.cfr_renamed_3 = new sprooc();
        sprxfc2.cfr_renamed_4 = sprnjb2.cfr_renamed_1980();
        sprxfc2.cfr_renamed_2 = new sprnnb(new sprrob(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_1778()));
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_3.cfr_renamed_2152(arg0, arg1);
    }

    private /* synthetic */ boolean cfr_renamed_2491(Object arg0, Object arg1) {
        if (arg0 == arg1) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        return arg0.equals(arg1);
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_3.cfr_renamed_1510(arg0);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    public sprxfc(sprmke sprmke2) throws IOException {
        int n;
        void arg0;
        sprxfc sprxfc2 = this;
        sprxfc2.cfr_renamed_3 = new sprooc();
        sprsme sprsme2 = new sprsme((sprbne)arg0.cfr_renamed_1473().cfr_renamed_284());
        byte[] byArray = sprxue.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
        byte[] byArray2 = new byte[byArray.length];
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = n;
            byte by = byArray[byArray.length - 1 - n];
            byArray2[n3] = by;
            n2 = ++n;
        }
        this.cfr_renamed_4 = new BigInteger(1, byArray2);
        this.cfr_renamed_2 = sprnnb.cfr_renamed_2104(sprsme2);
    }

    @Override
    public String getAlgorithm() {
        return sprqvn.cfr_renamed_9("IZ]A=!?%");
    }

    /*
     * WARNING - void declaration
     */
    public sprxfc(sprnc sprnc2) {
        void arg0;
        sprxfc sprxfc2 = this;
        sprxfc sprxfc3 = this;
        sprxfc3.cfr_renamed_3 = new sprooc();
        sprxfc2.cfr_renamed_4 = arg0.cfr_renamed_1980();
        sprxfc2.cfr_renamed_2 = sprnc2.cfr_renamed_284();
    }

    public int hashCode() {
        return this.cfr_renamed_1980().hashCode() ^ this.cfr_renamed_2.hashCode();
    }

    public sprxfc(sprshd arg0, sprnnb arg1) {
        sprxfc sprxfc2 = this;
        this.cfr_renamed_3 = new sprooc();
        this.cfr_renamed_4 = arg0.cfr_renamed_1980();
        this.cfr_renamed_2 = arg1;
        if (this.cfr_renamed_2 == null) {
            throw new IllegalArgumentException(sprstq.cfr_renamed_9(">((;m1>x#-!4"));
        }
    }

    @Override
    public String getFormat() {
        return sprqvn.cfr_renamed_9("^^MF--");
    }

    @Override
    public byte[] getEncoded() {
        int n;
        byte[] byArray = this.cfr_renamed_1980().toByteArray();
        byte[] byArray2 = byArray[0] == 0 ? new byte[byArray.length - 1] : new byte[byArray.length];
        int n2 = n = 0;
        while (n2 != byArray2.length) {
            int n3 = n;
            byte by = byArray[byArray.length - 1 - n];
            byArray2[n3] = by;
            n2 = ++n;
        }
        try {
            sprmke sprmke2;
            sprmke sprmke3;
            if (this.cfr_renamed_2 instanceof sprnnb) {
                sprmke sprmke4;
                sprmke3 = new sprmke(new sprije(sprji.cfr_renamed_102, new sprsme(new sprtzd(this.cfr_renamed_2.cfr_renamed_2109()), new sprtzd(this.cfr_renamed_2.cfr_renamed_2108()))), new sprlqe(byArray2));
                sprmke2 = sprmke4 = sprmke3;
            } else {
                sprmke sprmke5;
                sprmke3 = new sprmke(new sprije(sprji.cfr_renamed_102), new sprlqe(byArray2));
                sprmke2 = sprmke5 = sprmke3;
            }
            return sprmke2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sprxfc() {
        sprxfc sprxfc2 = this;
        sprxfc2.cfr_renamed_3 = new sprooc();
    }

    @Override
    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprxfc sprxfc2;
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        String string = (String)objectInputStream.readObject();
        if (string != null) {
            sprxfc sprxfc3 = this;
            sprxfc3.cfr_renamed_2 = new sprnnb(string, (String)arg0.readObject(), (String)arg0.readObject());
            sprxfc2 = this;
        } else {
            this.cfr_renamed_2 = new sprnnb(new sprrob((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject()));
            sprxfc2 = this;
            arg0.readObject();
            arg0.readObject();
        }
        sprxfc2.cfr_renamed_3 = new sprooc();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprnc)) {
            return false;
        }
        sprnc sprnc2 = (sprnc)arg0;
        if (this.cfr_renamed_1980().equals(sprnc2.cfr_renamed_1980()) && this.cfr_renamed_284().cfr_renamed_130().equals(sprnc2.cfr_renamed_284().cfr_renamed_130()) && this.cfr_renamed_284().cfr_renamed_2108().equals(sprnc2.cfr_renamed_284().cfr_renamed_2108())) {
            sprxfc sprxfc2 = this;
            if (sprxfc2.cfr_renamed_2491(sprxfc2.cfr_renamed_284().cfr_renamed_2101(), sprnc2.cfr_renamed_284().cfr_renamed_2101())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public sprmb cfr_renamed_284() {
        return this.cfr_renamed_2;
    }
}

