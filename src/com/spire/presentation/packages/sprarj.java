/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprci;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdph;
import com.spire.presentation.packages.sprepj;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlaq;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpr;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprwhj;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.spryxh;
import com.spire.presentation.packages.sprzrk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.util.Enumeration;

public class sprarj
implements sprpr,
sprof {
    private BigInteger cfr_renamed_1;
    private transient sprci cfr_renamed_2;
    private transient sprof cfr_renamed_3;
    public static final long cfr_renamed_4 = 8581661527592305464L;

    @Override
    public String getFormat() {
        return spratc.cfr_renamed_9("1\u0017\"\u000fBd");
    }

    public sprarj() {
        sprarj sprarj2 = this;
        sprarj2.cfr_renamed_3 = new sprtlj();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        sprarj sprarj2;
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        String string = (String)objectInputStream.readObject();
        if (string != null) {
            sprarj sprarj3 = this;
            sprarj3.cfr_renamed_2 = new spryxh(string, (String)arg0.readObject(), (String)arg0.readObject());
            sprarj2 = this;
        } else {
            this.cfr_renamed_2 = new spryxh(new sprmsh((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject()));
            sprarj2 = this;
            arg0.readObject();
            arg0.readObject();
        }
        sprarj2.cfr_renamed_3 = new sprtlj();
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }

    @Override
    public String getAlgorithm() {
        return sprlaq.cfr_renamed_9("\u0000\u0004\u0014\u001ft\u007fv{");
    }

    public sprarj(sprzrk arg0, spryxh arg1) {
        sprarj sprarj2 = this;
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_1 = arg0.cfr_renamed_1980();
        this.cfr_renamed_2 = arg1;
        if (this.cfr_renamed_2 == null) {
            throw new IllegalArgumentException(spratc.cfr_renamed_9("\u0012,\u0004?A5\u0012|\u000f)\r0"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        try {
            return sprwhj.cfr_renamed_9410(sprlaq.cfr_renamed_9("\u0000\u0004\u0014\u001ft\u007fv{"), this.cfr_renamed_1, ((sprzrk)sprepj.cfr_renamed_1220(this)).cfr_renamed_284());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new IllegalStateException(invalidKeyException.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprarj(sprdph sprdph2) {
        void arg0;
        sprarj sprarj2 = this;
        sprarj sprarj3 = this;
        sprarj2.cfr_renamed_3 = new sprtlj();
        sprarj2.cfr_renamed_1 = sprdph2.cfr_renamed_1980();
        sprarj2.cfr_renamed_2 = new spryxh(new sprmsh(arg0.cfr_renamed_1155(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_1778()));
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_9064(arg0);
    }

    @Override
    public BigInteger cfr_renamed_1980() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprarj(sprpr sprpr2) {
        void arg0;
        sprarj sprarj2 = this;
        sprarj sprarj3 = this;
        sprarj3.cfr_renamed_3 = new sprtlj();
        sprarj2.cfr_renamed_1 = arg0.cfr_renamed_1980();
        sprarj2.cfr_renamed_2 = sprpr2.cfr_renamed_284();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        arg0.defaultWriteObject();
        if (this.cfr_renamed_2.cfr_renamed_2109() != null) {
            void v0 = arg0;
            sprarj sprarj2 = this;
            arg0.writeObject(sprarj2.cfr_renamed_2.cfr_renamed_2109());
            v0.writeObject(sprarj2.cfr_renamed_2.cfr_renamed_2108());
            v0.writeObject(this.cfr_renamed_2.cfr_renamed_2101());
            return;
        }
        void v2 = arg0;
        sprarj sprarj3 = this;
        void v4 = arg0;
        sprarj sprarj4 = this;
        arg0.writeObject(null);
        arg0.writeObject(sprarj4.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1155());
        v4.writeObject(sprarj4.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1604());
        v4.writeObject(this.cfr_renamed_2.cfr_renamed_130().cfr_renamed_1778());
        v2.writeObject(sprarj3.cfr_renamed_2.cfr_renamed_2108());
        v2.writeObject(sprarj3.cfr_renamed_2.cfr_renamed_2101());
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_3.cfr_renamed_9065(arg0, arg1);
    }

    @Override
    public sprci cfr_renamed_284() {
        return this.cfr_renamed_2;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprpr)) {
            return false;
        }
        sprpr sprpr2 = (sprpr)arg0;
        if (this.cfr_renamed_1980().equals(sprpr2.cfr_renamed_1980()) && this.cfr_renamed_284().cfr_renamed_130().equals(sprpr2.cfr_renamed_284().cfr_renamed_130()) && this.cfr_renamed_284().cfr_renamed_2108().equals(sprpr2.cfr_renamed_284().cfr_renamed_2108())) {
            sprarj sprarj2 = this;
            if (sprarj2.cfr_renamed_2491(sprarj2.cfr_renamed_284().cfr_renamed_2101(), sprpr2.cfr_renamed_284().cfr_renamed_2101())) {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprarj(sprcom sprcom2) throws IOException {
        sprarj sprarj2;
        sprcom sprcom3 = sprcom2;
        sprarj sprarj3 = this;
        sprarj3.cfr_renamed_3 = new sprtlj();
        sprxum sprxum2 = sprxum.cfr_renamed_23(sprcom3.cfr_renamed_1254().cfr_renamed_284());
        sprco sprco2 = sprcom3.cfr_renamed_1229();
        if (sprco2 instanceof sprktm) {
            sprarj2 = this;
            this.cfr_renamed_1 = sprktm.cfr_renamed_23(sprco2).cfr_renamed_162();
        } else {
            int n;
            void arg0;
            byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
            byte[] byArray2 = new byte[byArray.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n;
                byte by = byArray[byArray.length - 1 - n];
                byArray2[n3] = by;
                n2 = ++n;
            }
            sprarj2 = this;
            this.cfr_renamed_1 = new BigInteger(1, byArray2);
        }
        sprarj2.cfr_renamed_2 = spryxh.cfr_renamed_9051(sprxum2);
    }

    public int hashCode() {
        return this.cfr_renamed_1980().hashCode() ^ this.cfr_renamed_2.hashCode();
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
            sprcom sprcom2;
            sprcom sprcom3;
            if (this.cfr_renamed_2 instanceof spryxh) {
                sprcom sprcom4;
                sprcom3 = new sprcom(new sprddm(sprqo.spr\ufe34, new sprxum(new sprlem(this.cfr_renamed_2.cfr_renamed_2109()), new sprlem(this.cfr_renamed_2.cfr_renamed_2108()))), new sprfvg(byArray2));
                sprcom2 = sprcom4 = sprcom3;
            } else {
                sprcom sprcom5;
                sprcom3 = new sprcom(new sprddm(sprqo.spr\ufe34), new sprfvg(byArray2));
                sprcom2 = sprcom5 = sprcom3;
            }
            return sprcom2.cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

