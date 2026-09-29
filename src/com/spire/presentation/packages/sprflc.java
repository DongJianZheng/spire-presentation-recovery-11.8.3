/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhkc;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprisb;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sproie;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprsme;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprtiha;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprxb;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;

public class sprflc
implements ECPrivateKey,
sprab,
sprwb,
sprxb {
    public static final long cfr_renamed_112 = 7245981689601667138L;
    private String cfr_renamed_119;
    private boolean cfr_renamed_91;
    private transient sprooc cfr_renamed_0;
    private transient BigInteger cfr_renamed_1;
    private transient sprsme cfr_renamed_2;
    private transient ECParameterSpec cfr_renamed_3;
    private transient sprmra cfr_renamed_4;

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_0.cfr_renamed_1510(arg0);
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprflc sprflc2 = this;
        return sprijc.cfr_renamed_2328(sprflc2.cfr_renamed_3, sprflc2.cfr_renamed_91);
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_0.cfr_renamed_2152(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(ECPrivateKeySpec eCPrivateKeySpec) {
        void arg0;
        sprflc sprflc2 = this;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc3 = this;
        this.cfr_renamed_0 = new sprooc();
        sprflc2.cfr_renamed_1 = arg0.getS();
        sprflc2.cfr_renamed_3 = eCPrivateKeySpec.getParams();
    }

    public sprflc(sprhqb arg0) {
        sprhqb sprhqb2 = arg0;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc2 = this;
        this.cfr_renamed_0 = new sprooc();
        this.cfr_renamed_1 = sprhqb2.cfr_renamed_2112();
        if (sprhqb2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg0.cfr_renamed_2110().cfr_renamed_1769(), arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_3 = sprijc.cfr_renamed_2311(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_3 = null;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2329(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        sprflc sprflc2 = this;
        sprflc2.cfr_renamed_0 = new sprooc();
    }

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprjpfa.cfr_renamed_9("\u0010\u0010\u0012\u001cR\n\u0019\t\u001d\u000b\u001d\r\u0013\u000b"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprtiha.cfr_renamed_9("qE\u0014VFoBg@c\u0014MQ\u007f")).append(string);
        stringBuffer2.append(sprjpfa.cfr_renamed_9("\\Y\\Y\\Y\\Y\\Y\\Y\\*FY")).append(this.cfr_renamed_1.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprflc)) {
            return false;
        }
        sprflc sprflc2 = (sprflc)arg0;
        return this.cfr_renamed_2112().equals(sprflc2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprflc2.cfr_renamed_2308());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_0.cfr_renamed_2158();
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_2329(sprmke arg0) throws IOException {
        block7: {
            var2_2 = arg0.cfr_renamed_1254().cfr_renamed_284().cfr_renamed_119();
            if (var2_2 instanceof sprbne && (sprbne.cfr_renamed_23(var2_2).cfr_renamed_84() == 2 || sprbne.cfr_renamed_23(var2_2).cfr_renamed_84() == 3)) {
                this.cfr_renamed_2 = sprsme.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
                var3_3 = sprisb.cfr_renamed_2315(sprste.cfr_renamed_2316(this.cfr_renamed_2.cfr_renamed_2106()));
                var4_5 = var3_3.cfr_renamed_1769();
                var5_7 = sprijc.cfr_renamed_2114(var4_5, var3_3.cfr_renamed_2113());
                v0 = this;
                this.cfr_renamed_3 = new sprmjb(sprste.cfr_renamed_2316(this.cfr_renamed_2.cfr_renamed_2106()), var5_7, new ECPoint(var3_3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var3_3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var3_3.cfr_renamed_1146(), var3_3.cfr_renamed_1153());
                var6_9 = arg0.cfr_renamed_1229();
                var7_12 = sprxue.cfr_renamed_23(var6_9).cfr_renamed_186();
                var8_14 = new byte[var7_12.length];
                v1 = var9_15 = 0;
                while (v1 != var7_12.length) {
                    v2 = var9_15;
                    v3 = var7_12[var7_12.length - 1 - var9_15];
                    var8_14[v2] = v3;
                    v1 = ++var9_15;
                }
                this.cfr_renamed_1 = new BigInteger(1, var8_14);
                return;
            }
            var3_4 = spruxd.cfr_renamed_23(arg0.cfr_renamed_1254().cfr_renamed_284());
            if (!var3_4.cfr_renamed_2317()) break block7;
            var4_6 = sprtzd.cfr_renamed_23(var3_4.cfr_renamed_284());
            var5_8 = sprjkc.cfr_renamed_2318((sprtzd)var4_6);
            if (var5_8 == null) {
                var6_10 = sprste.cfr_renamed_2102((sprtzd)var4_6);
                var7_13 = sprijc.cfr_renamed_2114(var6_10.cfr_renamed_1769(), var6_10.cfr_renamed_2113());
                this.cfr_renamed_3 = new sprmjb(sprste.cfr_renamed_2316((sprtzd)var4_6), var7_13, new ECPoint(var6_10.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var6_10.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var6_10.cfr_renamed_1146(), var6_10.cfr_renamed_1153());
            } else {
                var6_11 = sprijc.cfr_renamed_2114(var5_8.cfr_renamed_1769(), var5_8.cfr_renamed_2113());
                this.cfr_renamed_3 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)var4_6), var6_11, new ECPoint(var5_8.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var5_8.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var5_8.cfr_renamed_1146(), var5_8.cfr_renamed_1153());
            }
            ** GOTO lbl45
        }
        if (var3_4.cfr_renamed_2320()) {
            v4 = arg0;
            this.cfr_renamed_3 = null;
        } else {
            var4_6 = sprfpd.cfr_renamed_23(var3_4.cfr_renamed_284());
            var5_8 = sprijc.cfr_renamed_2114(var4_6.cfr_renamed_1769(), var4_6.cfr_renamed_2113());
            this.cfr_renamed_3 = new ECParameterSpec((EllipticCurve)var5_8, new ECPoint(var4_6.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var4_6.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var4_6.cfr_renamed_1146(), var4_6.cfr_renamed_1153().intValue());
lbl45:
            // 3 sources

            v4 = arg0;
        }
        v5 = var4_6 = v4.cfr_renamed_1229();
        if (var4_6 instanceof sprooe) {
            var5_8 = sprooe.cfr_renamed_23(v5);
            this.cfr_renamed_1 = var5_8.cfr_renamed_97();
            return;
        }
        var5_8 = sproie.cfr_renamed_23(v5);
        v6 = this;
        v6.cfr_renamed_1 = var5_8.cfr_renamed_1521();
        v6.cfr_renamed_4 = var5_8.cfr_renamed_1157();
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_3 != null) {
            sprflc sprflc2 = this;
            return sprijc.cfr_renamed_2328(sprflc2.cfr_renamed_3, sprflc2.cfr_renamed_91);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprflc sprflc2 = this;
        void v1 = arg0;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc3 = this;
        this.cfr_renamed_0 = new sprooc();
        this.cfr_renamed_1 = v1.getS();
        sprflc2.cfr_renamed_119 = v1.getAlgorithm();
        sprflc2.cfr_renamed_3 = eCPrivateKey.getParams();
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

    public sprflc(sprmke sprmke2) throws IOException {
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc2 = this;
        this.cfr_renamed_0 = new sprooc();
        this.cfr_renamed_2329(sprmke2);
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(String string, spreed spreed2, sprhkc sprhkc2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprflc sprflc2;
        void arg3;
        void arg1;
        void arg0;
        sprflc sprflc3 = this;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc4 = this;
        sprflc3.cfr_renamed_0 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprflc3.cfr_renamed_119 = arg0;
        sprflc3.cfr_renamed_1 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprflc2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            sprflc2 = this;
            this.cfr_renamed_3 = arg3;
        }
        sprflc2.cfr_renamed_2 = arg2.cfr_renamed_2495();
        this.cfr_renamed_4 = this.cfr_renamed_2496((sprhkc)arg2);
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

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(String string, spreed spreed2) {
        void arg1;
        void arg0;
        sprflc sprflc2 = this;
        sprflc sprflc3 = this;
        sprflc3.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc4 = this;
        sprflc3.cfr_renamed_0 = new sprooc();
        sprflc3.cfr_renamed_119 = arg0;
        sprflc2.cfr_renamed_1 = arg1.cfr_renamed_2112();
        sprflc2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(sprflc sprflc2) {
        void arg0;
        sprflc sprflc3 = this;
        void v1 = arg0;
        sprflc sprflc4 = this;
        void v3 = arg0;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc5 = this;
        this.cfr_renamed_0 = new sprooc();
        this.cfr_renamed_1 = v3.cfr_renamed_1;
        sprflc4.cfr_renamed_3 = v3.cfr_renamed_3;
        sprflc4.cfr_renamed_91 = arg0.cfr_renamed_91;
        this.cfr_renamed_0 = v1.cfr_renamed_0;
        sprflc3.cfr_renamed_4 = v1.cfr_renamed_4;
        sprflc3.cfr_renamed_2 = sprflc2.cfr_renamed_2;
    }

    public sprflc() {
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc2 = this;
        this.cfr_renamed_0 = new sprooc();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sproie sproie2;
        sprkra sprkra2;
        sprflc sprflc2;
        spruxd spruxd2;
        Object object;
        if (this.cfr_renamed_2 != null) {
            byte[] byArray = new byte[32];
            sprflc sprflc3 = this;
            sprflc3.cfr_renamed_2325(byArray, 0, sprflc3.getS());
            try {
                sprmke sprmke2 = new sprmke(new sprije(sprji.cfr_renamed_4, this.cfr_renamed_2), new sprlqe(byArray));
                return sprmke2.cfr_renamed_104("DER");
            }
            catch (IOException iOException) {
                return null;
            }
        }
        if (this.cfr_renamed_3 instanceof sprmjb) {
            object = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_3).cfr_renamed_313());
            if (object == null) {
                object = new sprtzd(((sprmjb)this.cfr_renamed_3).cfr_renamed_313());
            }
            spruxd2 = new spruxd((sprtzd)object);
            sprflc2 = this;
        } else if (this.cfr_renamed_3 == null) {
            spruxd2 = new spruxd(sprume.cfr_renamed_3);
            sprflc2 = this;
        } else {
            sprflc sprflc4 = this;
            sprflc2 = sprflc4;
            Object object2 = object = sprijc.cfr_renamed_2323(sprflc4.cfr_renamed_3.getCurve());
            sprkra2 = new sprfpd((sprpib)object2, sprijc.cfr_renamed_2324((sprpib)object2, this.cfr_renamed_3.getGenerator(), this.cfr_renamed_91), this.cfr_renamed_3.getOrder(), BigInteger.valueOf(this.cfr_renamed_3.getCofactor()), this.cfr_renamed_3.getCurve().getSeed());
            spruxd2 = new spruxd((sprfpd)sprkra2);
        }
        if (sprflc2.cfr_renamed_4 != null) {
            sproie2 = new sproie(this.getS(), this.cfr_renamed_4, spruxd2);
            sprkra2 = sproie2;
        } else {
            sproie2 = new sproie(this.getS(), spruxd2);
            sprkra2 = sproie2;
        }
        try {
            object = new sprmke(new sprije(sprji.cfr_renamed_4, spruxd2.cfr_renamed_119()), sprkra2.cfr_renamed_119());
            return ((sprkra)object).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprtiha.cfr_renamed_9("dMwU\u0017>");
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_91 = !sprjpfa.cfr_renamed_9(")7?61).</*9=").equalsIgnoreCase(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprflc(String string, spreed spreed2, sprhkc sprhkc2, sprlpb sprlpb2) {
        void arg2;
        sprflc sprflc2;
        void arg3;
        void arg1;
        void arg0;
        sprflc sprflc3 = this;
        this.cfr_renamed_119 = "ECGOST3410";
        sprflc sprflc4 = this;
        sprflc3.cfr_renamed_0 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprflc3.cfr_renamed_119 = arg0;
        sprflc3.cfr_renamed_1 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprflc2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprflc2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(arg3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprflc2.cfr_renamed_2 = arg2.cfr_renamed_2495();
        this.cfr_renamed_4 = this.cfr_renamed_2496((sprhkc)arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmra cfr_renamed_2496(sprhkc arg0) {
        try {
            sprdce sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            return sprdce2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_1;
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_119;
    }
}

