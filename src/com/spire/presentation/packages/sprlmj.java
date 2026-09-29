/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprekj;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprjq;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtlj;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
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

public class sprlmj
implements ECPrivateKey,
sprxo,
sprof,
sprjq {
    private transient BigInteger cfr_renamed_112;
    private transient sprxum cfr_renamed_119;
    private transient ECParameterSpec cfr_renamed_91;
    private boolean cfr_renamed_0;
    public static final long cfr_renamed_1 = 7245981689601667138L;
    private String cfr_renamed_2;
    private transient sprtlj cfr_renamed_3;
    private transient sprgbf cfr_renamed_4;

    private /* synthetic */ sprgbf cfr_renamed_9437(sprekj arg0) {
        return sprvhm.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_2314();
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprrxh cfr_renamed_284() {
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        return sprnlj.cfr_renamed_9150(this.cfr_renamed_91);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(sprlmj sprlmj2) {
        void arg0;
        sprlmj sprlmj3 = this;
        void v1 = arg0;
        sprlmj sprlmj4 = this;
        void v3 = arg0;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj5 = this;
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_112 = v3.cfr_renamed_112;
        sprlmj4.cfr_renamed_91 = v3.cfr_renamed_91;
        sprlmj4.cfr_renamed_0 = arg0.cfr_renamed_0;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        sprlmj3.cfr_renamed_4 = v1.cfr_renamed_4;
        sprlmj3.cfr_renamed_119 = sprlmj2.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprlmj sprlmj2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj3 = this;
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_112 = v1.getS();
        sprlmj2.cfr_renamed_2 = v1.getAlgorithm();
        sprlmj2.cfr_renamed_91 = eCPrivateKey.getParams();
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_91;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprlmj)) {
            return false;
        }
        sprlmj sprlmj2 = (sprlmj)arg0;
        return this.cfr_renamed_2112().equals(sprlmj2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprlmj2.cfr_renamed_2308());
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_0 = !sprizc.cfr_renamed_9("IP_QQNN[OMYZ").equalsIgnoreCase(arg0);
    }

    public String toString() {
        sprlmj sprlmj2 = this;
        return sprqpj.cfr_renamed_9380(sprlmj2.cfr_renamed_2, sprlmj2.cfr_renamed_112, this.cfr_renamed_2308());
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(String string, sprzuk sprzuk2, sprekj sprekj2, sprrxh sprrxh2) {
        void arg2;
        sprlmj sprlmj2;
        void arg3;
        void arg1;
        void arg0;
        sprlmj sprlmj3 = this;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj4 = this;
        sprlmj3.cfr_renamed_3 = new sprtlj();
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        sprlmj3.cfr_renamed_2 = arg0;
        sprlmj3.cfr_renamed_112 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprlmj2 = this;
            this.cfr_renamed_91 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprlmj2 = this;
            this.cfr_renamed_91 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(arg3.cfr_renamed_1145()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprlmj2.cfr_renamed_119 = arg2.cfr_renamed_2495();
        this.cfr_renamed_4 = this.cfr_renamed_9437((sprekj)arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(ECPrivateKeySpec eCPrivateKeySpec) {
        void arg0;
        sprlmj sprlmj2 = this;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj3 = this;
        this.cfr_renamed_3 = new sprtlj();
        sprlmj2.cfr_renamed_112 = arg0.getS();
        sprlmj2.cfr_renamed_91 = eCPrivateKeySpec.getParams();
    }

    public sprrxh cfr_renamed_2308() {
        if (this.cfr_renamed_91 != null) {
            return sprnlj.cfr_renamed_9150(this.cfr_renamed_91);
        }
        return sprsci.cfr_renamed_105.cfr_renamed_2312();
    }

    @Override
    public sprco cfr_renamed_9064(sprlem arg0) {
        return this.cfr_renamed_3.cfr_renamed_9064(arg0);
    }

    @Override
    public byte[] getEncoded() {
        spridm spridm2;
        sprqqe sprqqe2;
        sprlmj sprlmj2;
        int n;
        sprcgm sprcgm2;
        Object object;
        int n2;
        boolean bl = this.cfr_renamed_112.bitLength() > 256;
        sprlem sprlem2 = bl ? sprdt.cfr_renamed_91 : sprdt.cfr_renamed_96;
        int n3 = n2 = bl ? 64 : 32;
        if (this.cfr_renamed_119 != null) {
            byte[] byArray = new byte[n2];
            this.cfr_renamed_9436(byArray, n2, 0, this.getS());
            try {
                sprcom sprcom2 = new sprcom(new sprddm(sprlem2, this.cfr_renamed_119), new sprfvg(byArray));
                return sprcom2.cfr_renamed_104("DER");
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (this.cfr_renamed_91 instanceof sprxvh) {
            object = sprqpj.cfr_renamed_2326(((sprxvh)this.cfr_renamed_91).cfr_renamed_313());
            if (object == null) {
                object = new sprlem(((sprxvh)this.cfr_renamed_91).cfr_renamed_313());
            }
            sprcgm2 = new sprcgm((sprlem)object);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_91.getOrder(), this.getS());
            sprlmj2 = this;
        } else if (this.cfr_renamed_91 == null) {
            sprcgm2 = new sprcgm(sprpen.cfr_renamed_4);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, null, this.getS());
            sprlmj2 = this;
        } else {
            sprlmj sprlmj3 = this;
            sprlmj2 = sprlmj3;
            Object object2 = object = sprnlj.cfr_renamed_2323(sprlmj3.cfr_renamed_91.getCurve());
            Object object3 = object;
            sprqqe2 = new sprhfm((sprgxh)object3, new sprfim(sprnlj.cfr_renamed_9154((sprgxh)object3, this.cfr_renamed_91.getGenerator()), this.cfr_renamed_0), this.cfr_renamed_91.getOrder(), BigInteger.valueOf(this.cfr_renamed_91.getCofactor()), this.cfr_renamed_91.getCurve().getSeed());
            sprcgm2 = new sprcgm((sprhfm)sprqqe2);
            n = sprqpj.cfr_renamed_9160(sprsci.cfr_renamed_105, this.cfr_renamed_91.getOrder(), this.getS());
        }
        if (sprlmj2.cfr_renamed_4 != null) {
            spridm2 = new spridm(n, this.getS(), this.cfr_renamed_4, sprcgm2);
            sprqqe2 = spridm2;
        } else {
            spridm2 = new spridm(n, this.getS(), (sprco)sprcgm2);
            sprqqe2 = spridm2;
        }
        try {
            object = new sprcom(new sprddm(sprlem2, sprcgm2.cfr_renamed_119()), sprqqe2.cfr_renamed_119());
            return ((sprqqe)object).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void cfr_renamed_9065(sprlem arg0, sprco arg1) {
        this.cfr_renamed_3.cfr_renamed_9065(arg0, arg1);
    }

    public sprlmj(sprcom sprcom2) throws IOException {
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj2 = this;
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_9159(sprcom2);
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_112;
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
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
    public BigInteger getS() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(String string, sprzuk sprzuk2) {
        void arg1;
        void arg0;
        sprlmj sprlmj2 = this;
        sprlmj sprlmj3 = this;
        sprlmj3.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj4 = this;
        sprlmj3.cfr_renamed_3 = new sprtlj();
        sprlmj3.cfr_renamed_2 = arg0;
        sprlmj2.cfr_renamed_112 = arg1.cfr_renamed_2112();
        sprlmj2.cfr_renamed_91 = null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_9159(sprcom arg0) throws IOException {
        block8: {
            var2_2 = arg0.cfr_renamed_1254().cfr_renamed_284().cfr_renamed_119();
            if (var2_2 instanceof sprszm && (sprszm.cfr_renamed_23(var2_2).cfr_renamed_84() == 2 || sprszm.cfr_renamed_23(var2_2).cfr_renamed_84() == 3)) {
                this.cfr_renamed_119 = sprxum.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
                var3_3 = sprzfi.cfr_renamed_2315(spralm.cfr_renamed_7555(this.cfr_renamed_119.cfr_renamed_2106()));
                var4_5 = var3_3.cfr_renamed_1769();
                var5_7 = sprnlj.cfr_renamed_9052(var4_5, var3_3.cfr_renamed_2113());
                v0 = this;
                this.cfr_renamed_91 = new sprxvh(spralm.cfr_renamed_7555(this.cfr_renamed_119.cfr_renamed_2106()), var5_7, sprnlj.cfr_renamed_9053(var3_3.cfr_renamed_1145()), var3_3.cfr_renamed_1146(), var3_3.cfr_renamed_1153());
                var6_9 = arg0.cfr_renamed_1369();
                if (var6_9.cfr_renamed_186().length == 32 || var6_9.cfr_renamed_186().length == 64) {
                    this.cfr_renamed_112 = new BigInteger(1, sproze.cfr_renamed_537(var6_9.cfr_renamed_186()));
                    return;
                }
                var7_12 = arg0.cfr_renamed_1229();
                if (var7_12 instanceof sprktm) {
                    this.cfr_renamed_112 = sprktm.cfr_renamed_23(var7_12).cfr_renamed_162();
                    return;
                }
                var8_14 = sproug.cfr_renamed_23(var7_12).cfr_renamed_186();
                this.cfr_renamed_112 = new BigInteger(1, sproze.cfr_renamed_537(var8_14));
                return;
            }
            var3_4 = sprcgm.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
            if (!var3_4.cfr_renamed_2317()) break block8;
            var4_6 = sprlem.cfr_renamed_23(var3_4.cfr_renamed_284());
            var5_8 = sprqpj.cfr_renamed_9156((sprlem)var4_6);
            if (var5_8 == null) {
                var6_10 = spralm.cfr_renamed_9184((sprlem)var4_6);
                var7_13 = sprnlj.cfr_renamed_9052(var6_10.cfr_renamed_1769(), var6_10.cfr_renamed_2113());
                this.cfr_renamed_91 = new sprxvh(spralm.cfr_renamed_7555((sprlem)var4_6), var7_13, sprnlj.cfr_renamed_9053(var6_10.cfr_renamed_1145()), var6_10.cfr_renamed_1146(), var6_10.cfr_renamed_1153());
            } else {
                var6_11 = sprnlj.cfr_renamed_9052(var5_8.cfr_renamed_1769(), var5_8.cfr_renamed_2113());
                this.cfr_renamed_91 = new sprxvh(sprqpj.cfr_renamed_7554((sprlem)var4_6), var6_11, sprnlj.cfr_renamed_9053(var5_8.cfr_renamed_1145()), var5_8.cfr_renamed_1146(), var5_8.cfr_renamed_1153());
            }
            ** GOTO lbl42
        }
        if (var3_4.cfr_renamed_2320()) {
            v1 = arg0;
            this.cfr_renamed_91 = null;
        } else {
            var4_6 = sprhfm.cfr_renamed_23(var3_4.cfr_renamed_284());
            var5_8 = sprnlj.cfr_renamed_9052(var4_6.cfr_renamed_1769(), var4_6.cfr_renamed_2113());
            this.cfr_renamed_91 = new ECParameterSpec((EllipticCurve)var5_8, sprnlj.cfr_renamed_9053(var4_6.cfr_renamed_1145()), var4_6.cfr_renamed_1146(), var4_6.cfr_renamed_1153().intValue());
lbl42:
            // 3 sources

            v1 = arg0;
        }
        v2 = var4_6 = v1.cfr_renamed_1229();
        if (var4_6 instanceof sprktm) {
            var5_8 = sprktm.cfr_renamed_23(v2);
            this.cfr_renamed_112 = var5_8.cfr_renamed_97();
            return;
        }
        var5_8 = spridm.cfr_renamed_23(v2);
        v3 = this;
        v3.cfr_renamed_112 = var5_8.cfr_renamed_1521();
        v3.cfr_renamed_4 = var5_8.cfr_renamed_1157();
    }

    @Override
    public String getFormat() {
        return sprbgp.cfr_renamed_9("\u001c\t\u000f\u0011oz");
    }

    public sprlmj(sprguh arg0) {
        sprguh sprguh2 = arg0;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj2 = this;
        this.cfr_renamed_3 = new sprtlj();
        this.cfr_renamed_112 = sprguh2.cfr_renamed_2112();
        if (sprguh2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(arg0.cfr_renamed_2110().cfr_renamed_1769(), arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_91 = sprnlj.cfr_renamed_9153(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_91 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprlmj(String string, sprzuk sprzuk2, sprekj sprekj2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprlmj sprlmj2;
        void arg3;
        void arg1;
        void arg0;
        sprlmj sprlmj3 = this;
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj4 = this;
        sprlmj3.cfr_renamed_3 = new sprtlj();
        sprqxk sprqxk2 = sprzuk2.cfr_renamed_284();
        sprlmj3.cfr_renamed_2 = arg0;
        sprlmj3.cfr_renamed_112 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprnlj.cfr_renamed_9052(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_2113());
            sprlmj2 = this;
            this.cfr_renamed_91 = new ECParameterSpec(ellipticCurve, sprnlj.cfr_renamed_9053(sprqxk2.cfr_renamed_1145()), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153().intValue());
        } else {
            sprlmj2 = this;
            this.cfr_renamed_91 = arg3;
        }
        sprlmj2.cfr_renamed_119 = arg2.cfr_renamed_2495();
        this.cfr_renamed_4 = this.cfr_renamed_9437((sprekj)arg2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9159(sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(byArray)));
        sprlmj sprlmj2 = this;
        sprlmj2.cfr_renamed_3 = new sprtlj();
    }

    private /* synthetic */ void cfr_renamed_9436(byte[] arg0, int arg1, int arg2, BigInteger arg3) {
        int n;
        byte[] byArray = arg3.toByteArray();
        if (byArray.length < arg1) {
            byte[] byArray2 = new byte[arg1];
            System.arraycopy(byArray, 0, byArray2, byArray2.length - byArray.length, byArray.length);
            byArray = byArray2;
        }
        int n2 = n = 0;
        while (n2 != arg1) {
            int n3 = arg2 + n;
            byte by = byArray[byArray.length - 1 - n];
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    public sprlmj() {
        this.cfr_renamed_2 = "ECGOST3410-2012";
        sprlmj sprlmj2 = this;
        this.cfr_renamed_3 = new sprtlj();
    }
}

