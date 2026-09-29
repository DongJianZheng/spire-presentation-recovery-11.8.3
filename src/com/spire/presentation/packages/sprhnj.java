/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreph;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmon;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxlj;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxum;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprzfi;
import com.spire.presentation.packages.sprzuk;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;

public class sprhnj
implements ECPrivateKey,
sprxo,
sprof,
sprjq {
    private String cfr_renamed_112;
    private transient sprgbf cfr_renamed_119;
    private boolean cfr_renamed_91;
    private transient ECParameterSpec cfr_renamed_0;
    private transient sprco cfr_renamed_1;
    private transient sprtlj cfr_renamed_2;
    public static final long cfr_renamed_3 = 7245981689601667138L;
    private transient BigInteger cfr_renamed_4;

    public sprhnj(sprcom sprcom2) throws IOException {
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj2 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_9159(sprcom2);
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_0 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(ECPrivateKeySpec eCPrivateKeySpec) {
        void arg0;
        sprhnj sprhnj2 = this;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj3 = this;
        this.cfr_renamed_2 = new sprtlj();
        sprhnj2.cfr_renamed_4 = arg0.getS();
        sprhnj2.cfr_renamed_0 = eCPrivateKeySpec.getParams();
    }

    public sprhnj(sprguh arg0) {
        sprguh sprguh2 = arg0;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj2 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_4 = sprguh2.cfr_renamed_2112();
        if (sprguh2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg0.cfr_renamed_2110().cfr_renamed_1769(), arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_0 = sprnlj.cfr_renamed_9153(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_91 = !sprceaa.cfr_renamed_9("{'m&c9|,}:k-").equalsIgnoreCase(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        spridm spridm2;
        sprqqe sprqqe2;
        sprhnj sprhnj2;
        int n;
        sprcgm sprcgm2;
        Object object;
        if (this.cfr_renamed_1 != null) {
            byte[] byArray = new byte[32];
            sprhnj sprhnj3 = this;
            sprhnj3.cfr_renamed_2325(byArray, 0, sprhnj3.getS());
            try {
                sprcom sprcom2 = new sprcom(new sprddm(sprqo.cfr_renamed_93, this.cfr_renamed_1), new sprfvg(byArray));
                return sprcom2.cfr_renamed_104("DER");
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (this.cfr_renamed_0 instanceof sprxvh) {
            object = sprqpj.cfr_renamed_2326(((sprxvh)this.cfr_renamed_0).cfr_renamed_313());
            if (object == null) {
                object = new sprlem(((sprxvh)this.cfr_renamed_0).cfr_renamed_313());
            }
            sprcgm2 = new sprcgm((sprlem)object);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_0.getOrder(), this.getS());
            sprhnj2 = this;
        } else if (this.cfr_renamed_0 == null) {
            sprcgm2 = new sprcgm(sprpen.cfr_renamed_4);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, null, this.getS());
            sprhnj2 = this;
        } else {
            sprhnj sprhnj4 = this;
            sprhnj2 = sprhnj4;
            Object object2 = object = sprnlj.cfr_renamed_2323(sprhnj4.cfr_renamed_0.getCurve());
            Object object3 = object;
            sprqqe2 = new sprhfm((sprgxh)object3, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)object3, this.cfr_renamed_0.getGenerator()), this.cfr_renamed_91), this.cfr_renamed_0.getOrder(), BigInteger.valueOf(this.cfr_renamed_0.getCofactor()), this.cfr_renamed_0.getCurve().getSeed());
            sprcgm2 = new sprcgm((sprhfm)sprqqe2);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_0.getOrder(), this.getS());
        }
        if (sprhnj2.cfr_renamed_119 != null) {
            spridm2 = new spridm(n, this.getS(), this.cfr_renamed_119, sprcgm2);
            sprqqe2 = spridm2;
        } else {
            spridm2 = new spridm(n, this.getS(), (sprco)sprcgm2);
            sprqqe2 = spridm2;
        }
        try {
            object = new sprcom(new sprddm(sprqo.cfr_renamed_93, sprcgm2.cfr_renamed_119()), sprqqe2.cfr_renamed_119());
            return ((sprqqe)object).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(String string, sprzuk sprzuk2, sprxlj sprxlj2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprhnj sprhnj2;
        void arg1;
        void arg0;
        sprhnj sprhnj3 = this;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj4 = this;
        this.cfr_renamed_2 = new sprtlj();
        sprhnj3.cfr_renamed_112 = arg0;
        sprhnj3.cfr_renamed_4 = arg1.cfr_renamed_2112();
        if (eCParameterSpec == null) {
            sprqxk sprqxk2 = arg1.cfr_renamed_284();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprhnj2 = this;
            this.cfr_renamed_0 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            void arg3;
            sprhnj2 = this;
            this.cfr_renamed_0 = arg3;
        }
        sprhnj2.cfr_renamed_1 = arg2.cfr_renamed_2495();
        this.cfr_renamed_119 = this.cfr_renamed_9438((sprxlj)arg2);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_0;
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_2.cfr_renamed_9064(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(String string, sprzuk sprzuk2, sprxlj sprxlj2, sprrxh sprrxh2) {
        void arg2;
        sprhnj sprhnj2;
        void arg1;
        void arg0;
        sprhnj sprhnj3 = this;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj4 = this;
        this.cfr_renamed_2 = new sprtlj();
        sprhnj3.cfr_renamed_112 = arg0;
        sprhnj3.cfr_renamed_4 = arg1.cfr_renamed_2112();
        if (sprrxh2 == null) {
            sprqxk sprqxk2 = arg1.cfr_renamed_284();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprhnj2 = this;
            this.cfr_renamed_0 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            void arg3;
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprhnj2 = this;
            this.cfr_renamed_0 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(arg3.cfr_renamed_1145()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprhnj2.cfr_renamed_1 = arg2.cfr_renamed_2495();
        this.cfr_renamed_119 = this.cfr_renamed_9438((sprxlj)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprhnj sprhnj2 = this;
        void v1 = arg0;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj3 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_4 = v1.getS();
        sprhnj2.cfr_renamed_112 = v1.getAlgorithm();
        sprhnj2.cfr_renamed_0 = eCPrivateKey.getParams();
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_2.cfr_renamed_9065(arg0, arg1);
    }

    public sprhnj() {
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj2 = this;
        this.cfr_renamed_2 = new sprtlj();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprgbf cfr_renamed_9438(sprxlj arg0) {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            return sprvhm2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprmon.cfr_renamed_9("2\u0001!\u0019Ar");
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(sprhnj sprhnj2) {
        void arg0;
        sprhnj sprhnj3 = this;
        void v1 = arg0;
        sprhnj sprhnj4 = this;
        void v3 = arg0;
        this.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj5 = this;
        this.cfr_renamed_2 = new sprtlj();
        this.cfr_renamed_4 = v3.cfr_renamed_4;
        sprhnj4.cfr_renamed_0 = v3.cfr_renamed_0;
        sprhnj4.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprhnj3.cfr_renamed_119 = v1.cfr_renamed_119;
        sprhnj3.cfr_renamed_1 = sprhnj2.cfr_renamed_1;
    }

    public String toString() {
        sprhnj sprhnj2 = this;
        return sprqpj.cfr_renamed_9380(sprhnj2.cfr_renamed_112, sprhnj2.cfr_renamed_4, this.cfr_renamed_2308());
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprhnj)) {
            return false;
        }
        sprhnj sprhnj2 = (sprhnj)arg0;
        return this.cfr_renamed_2112().equals(sprhnj2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprhnj2.cfr_renamed_2308());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_2.cfr_renamed_2158();
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_0 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_0);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    private /* synthetic */ void cfr_renamed_9159(sprcom arg0) throws IOException {
        sprcom sprcom2;
        Object object;
        sprco sprco2;
        sprco sprco3 = arg0.cfr_renamed_1254().cfr_renamed_284();
        sprxgf sprxgf2 = sprco3.cfr_renamed_119();
        if (sprxgf2 instanceof sprszm && (sprszm.cfr_renamed_23(sprxgf2).cfr_renamed_84() == 2 || sprszm.cfr_renamed_23(sprxgf2).cfr_renamed_84() == 3)) {
            int n;
            sprxum sprxum2 = sprxum.cfr_renamed_23(sprco3);
            this.cfr_renamed_1 = sprxum2;
            spreph spreph2 = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(((sprxum)this.cfr_renamed_1).cfr_renamed_2106()));
            sprgxh sprgxh2 = spreph2.cfr_renamed_1769();
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprgxh2, spreph2.cfr_renamed_2113());
            sprhnj sprhnj2 = this;
            sprhnj2.cfr_renamed_0 = new sprxvh(spralm.cfr_renamed_7555(sprxum2.cfr_renamed_2106()), ellipticCurve, sprnlj.cfr_renamed_9053(spreph2.cfr_renamed_1145()), spreph2.cfr_renamed_1146(), spreph2.cfr_renamed_1153());
            sprco sprco4 = arg0.cfr_renamed_1229();
            if (sprco4 instanceof sprktm) {
                this.cfr_renamed_4 = sprktm.cfr_renamed_23(sprco4).cfr_renamed_162();
                return;
            }
            byte[] byArray = sproug.cfr_renamed_23(sprco4).cfr_renamed_186();
            byte[] byArray2 = new byte[byArray.length];
            int n2 = n = 0;
            while (n2 != byArray.length) {
                int n3 = n;
                byte by = byArray[byArray.length - 1 - n];
                byArray2[n3] = by;
                n2 = ++n;
            }
            this.cfr_renamed_4 = new BigInteger(1, byArray2);
            return;
        }
        sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprco3);
        if (sprcgm2.cfr_renamed_2317()) {
            sprco2 = sprlem.cfr_renamed_23(sprcgm2.cfr_renamed_284());
            object = sprqpj.cfr_renamed_9156((sprlem)sprco2);
            if (object == null) {
                throw new IllegalStateException();
            }
            String string = sprqpj.cfr_renamed_7554((sprlem)sprco2);
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(((sprhfm)object).cfr_renamed_1769(), ((sprhfm)object).cfr_renamed_2113());
            sprcom2 = arg0;
            this.cfr_renamed_0 = new sprxvh(string, ellipticCurve, sprnlj.cfr_renamed_9053(((sprhfm)object).cfr_renamed_1145()), ((sprhfm)object).cfr_renamed_1146(), ((sprhfm)object).cfr_renamed_1153());
        } else if (sprcgm2.cfr_renamed_2320()) {
            sprcom2 = arg0;
            this.cfr_renamed_0 = null;
        } else {
            sprco2 = sprhfm.cfr_renamed_23(sprcgm2.cfr_renamed_284());
            object = sprnlj.cfr_renamed_9052(((sprhfm)sprco2).cfr_renamed_1769(), ((sprhfm)sprco2).cfr_renamed_2113());
            sprcom2 = arg0;
            this.cfr_renamed_0 = new ECParameterSpec((EllipticCurve)object, sprnlj.cfr_renamed_9053(((sprhfm)sprco2).cfr_renamed_1145()), ((sprhfm)sprco2).cfr_renamed_1146(), ((sprhfm)sprco2).cfr_renamed_1153().intValue());
        }
        sprco sprco5 = sprco2 = sprcom2.cfr_renamed_1229();
        if (sprco2 instanceof sprktm) {
            object = sprktm.cfr_renamed_23(sprco5);
            this.cfr_renamed_4 = ((sprktm)object).cfr_renamed_97();
            return;
        }
        object = spridm.cfr_renamed_23(sprco5);
        sprhnj sprhnj3 = this;
        sprhnj3.cfr_renamed_4 = ((spridm)object).cfr_renamed_1521();
        sprhnj3.cfr_renamed_119 = ((spridm)object).cfr_renamed_1157();
    }

    private /* synthetic */ void cfr_renamed_2325(byte[] arg0, int arg1, BigInteger arg2) {
        int n;
        byte[] byArray = arg2.toByteArray();
        if (byArray.length < 32) {
            byte[] byArray2 = new byte[32];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != 32) {
            int n3 = arg1 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhnj(String string, sprzuk sprzuk2) {
        void arg1;
        void arg0;
        sprhnj sprhnj2 = this;
        sprhnj sprhnj3 = this;
        sprhnj3.cfr_renamed_112 = "ECGOST3410";
        sprhnj sprhnj4 = this;
        sprhnj3.cfr_renamed_2 = new sprtlj();
        sprhnj3.cfr_renamed_112 = arg0;
        sprhnj2.cfr_renamed_4 = arg1.cfr_renamed_2112();
        sprhnj2.cfr_renamed_0 = null;
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9159(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        sprhnj sprhnj2 = this;
        sprhnj2.cfr_renamed_2 = new sprtlj();
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_4;
    }
}

