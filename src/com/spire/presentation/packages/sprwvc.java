/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprccd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjk;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprldz;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sproie;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprsno;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprxb;
import com.spire.presentation.packages.sprxie;
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

public class sprwvc
implements ECPrivateKey,
sprab,
sprwb,
sprxb {
    private transient BigInteger cfr_renamed_119;
    private boolean cfr_renamed_91;
    private String cfr_renamed_0;
    public static final long cfr_renamed_1 = 7245981689601667138L;
    private transient ECParameterSpec cfr_renamed_2;
    private transient sprooc cfr_renamed_3;
    private transient sprmra cfr_renamed_4;

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_119;
    }

    @Override
    public String getFormat() {
        return sprsno.cfr_renamed_9("zyia\t\n");
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_2 != null) {
            sprwvc sprwvc2 = this;
            return sprijc.cfr_renamed_2328(sprwvc2.cfr_renamed_2, sprwvc2.cfr_renamed_91);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(sprwvc sprwvc2) {
        void arg0;
        sprwvc sprwvc3 = this;
        void v1 = arg0;
        sprwvc sprwvc4 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc5 = this;
        this.cfr_renamed_3 = new sprooc();
        sprwvc4.cfr_renamed_119 = arg0.cfr_renamed_119;
        sprwvc4.cfr_renamed_2 = arg0.cfr_renamed_2;
        this.cfr_renamed_91 = v1.cfr_renamed_91;
        sprwvc3.cfr_renamed_3 = v1.cfr_renamed_3;
        sprwvc3.cfr_renamed_4 = sprwvc2.cfr_renamed_4;
    }

    public sprwvc() {
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc2 = this;
        this.cfr_renamed_3 = new sprooc();
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_91 = !sprldz.cfr_renamed_9("\u0006\u0001\u0010\u0000\u001e\u001f\u0001\n\u0000\u001c\u0016\u000b").equalsIgnoreCase(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(String string, spreed spreed2, sprccd sprccd2, sprlpb sprlpb2) {
        void arg2;
        sprwvc sprwvc2;
        void arg3;
        void arg1;
        void arg0;
        sprwvc sprwvc3 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc4 = this;
        sprwvc3.cfr_renamed_3 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprwvc3.cfr_renamed_0 = arg0;
        sprwvc3.cfr_renamed_119 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprwvc2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprwvc2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(arg3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprwvc2.cfr_renamed_4 = this.cfr_renamed_2513((sprccd)arg2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprsno.cfr_renamed_9("F[DW\u0004AOBK@KFE@"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprldz.cfr_renamed_9("\u0016\fs\u001f!&%.'*s\u000466")).append(string);
        stringBuffer2.append(sprsno.cfr_renamed_9("\n\u0012\n\u0012\n\u0012\n\u0012\n\u0012\n\u0012\na\u0010\u0012")).append(this.cfr_renamed_119.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprwvc)) {
            return false;
        }
        sprwvc sprwvc2 = (sprwvc)arg0;
        return this.cfr_renamed_2112().equals(sprwvc2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprwvc2.cfr_renamed_2308());
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_3.cfr_renamed_2158();
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprwvc sprwvc2 = this;
        void v1 = arg0;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc3 = this;
        this.cfr_renamed_3 = new sprooc();
        this.cfr_renamed_119 = v1.getS();
        sprwvc2.cfr_renamed_0 = v1.getAlgorithm();
        sprwvc2.cfr_renamed_2 = eCPrivateKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(ECPrivateKeySpec eCPrivateKeySpec) {
        void arg0;
        sprwvc sprwvc2 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc3 = this;
        this.cfr_renamed_3 = new sprooc();
        sprwvc2.cfr_renamed_119 = arg0.getS();
        sprwvc2.cfr_renamed_2 = eCPrivateKeySpec.getParams();
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_2 == null) {
            return null;
        }
        sprwvc sprwvc2 = this;
        return sprijc.cfr_renamed_2328(sprwvc2.cfr_renamed_2, sprwvc2.cfr_renamed_91);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_2329(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        sprwvc sprwvc2 = this;
        sprwvc2.cfr_renamed_3 = new sprooc();
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_3.cfr_renamed_2152(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmra cfr_renamed_2513(sprccd arg0) {
        try {
            sprdce sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            return sprdce2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_2;
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

    public sprwvc(sprhqb arg0) {
        sprhqb sprhqb2 = arg0;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc2 = this;
        this.cfr_renamed_3 = new sprooc();
        this.cfr_renamed_119 = sprhqb2.cfr_renamed_2112();
        if (sprhqb2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg0.cfr_renamed_2110().cfr_renamed_1769(), arg0.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_2 = sprijc.cfr_renamed_2311(ellipticCurve, arg0.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_2 = null;
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void cfr_renamed_2329(sprmke arg0) throws IOException {
        block5: {
            var2_2 = new spruxd((sprvva)arg0.cfr_renamed_1254().cfr_renamed_284());
            if (!var2_2.cfr_renamed_2317()) break block5;
            var3_3 = sprtzd.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprjkc.cfr_renamed_2318((sprtzd)var3_3);
            if (var4_4 == null) {
                var5_5 = sprxie.cfr_renamed_2102((sprtzd)var3_3);
                var6_7 = sprijc.cfr_renamed_2114(var5_5.cfr_renamed_1769(), var5_5.cfr_renamed_2113());
                v0 = this;
                v0.cfr_renamed_2 = new sprmjb(var3_3.cfr_renamed_19(), var6_7, new ECPoint(var5_5.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var5_5.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var5_5.cfr_renamed_1146(), var5_5.cfr_renamed_1153());
            } else {
                var5_6 = sprijc.cfr_renamed_2114(var4_4.cfr_renamed_1769(), var4_4.cfr_renamed_2113());
                this.cfr_renamed_2 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)var3_3), var5_6, new ECPoint(var4_4.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var4_4.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var4_4.cfr_renamed_1146(), var4_4.cfr_renamed_1153());
            }
            ** GOTO lbl24
        }
        if (var2_2.cfr_renamed_2320()) {
            v1 = arg0;
            this.cfr_renamed_2 = null;
        } else {
            var3_3 = sprfpd.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprijc.cfr_renamed_2114(var3_3.cfr_renamed_1769(), var3_3.cfr_renamed_2113());
            this.cfr_renamed_2 = new ECParameterSpec((EllipticCurve)var4_4, new ECPoint(var3_3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var3_3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var3_3.cfr_renamed_1146(), var3_3.cfr_renamed_1153().intValue());
lbl24:
            // 3 sources

            v1 = arg0;
        }
        v2 = var3_3 = v1.cfr_renamed_1229();
        if (var3_3 instanceof sprooe) {
            var4_4 = sprooe.cfr_renamed_23(v2);
            this.cfr_renamed_119 = var4_4.cfr_renamed_97();
            return;
        }
        var4_4 = sproie.cfr_renamed_23(v2);
        v3 = this;
        v3.cfr_renamed_119 = var4_4.cfr_renamed_1521();
        v3.cfr_renamed_4 = var4_4.cfr_renamed_1157();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public byte[] getEncoded() {
        block9: {
            if (this.cfr_renamed_2 instanceof sprmjb) {
                var2_1 = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
                if (var2_1 == null) {
                    var2_1 = new sprtzd(((sprmjb)this.cfr_renamed_2).cfr_renamed_313());
                }
                var1_2 = new spruxd((sprtzd)var2_1);
                v0 = this;
            } else if (this.cfr_renamed_2 == null) {
                var1_2 = new spruxd(sprume.cfr_renamed_3);
                v0 = this;
            } else {
                v1 = this;
                v0 = v1;
                v2 = var2_1 = sprijc.cfr_renamed_2323(v1.cfr_renamed_2.getCurve());
                var3_3 = new sprfpd((sprpib)v2, sprijc.cfr_renamed_2324((sprpib)v2, this.cfr_renamed_2.getGenerator(), this.cfr_renamed_91), this.cfr_renamed_2.getOrder(), BigInteger.valueOf(this.cfr_renamed_2.getCofactor()), this.cfr_renamed_2.getCurve().getSeed());
                var1_2 = new spruxd((sprfpd)var3_3);
            }
            if (v0.cfr_renamed_4 == null) break block9;
            v3 = new sproie(this.getS(), this.cfr_renamed_4, var1_2);
            var3_3 = v3;
            v4 = this;
            ** GOTO lbl27
        }
        v3 = new sproie(this.getS(), var1_2);
        var3_3 = v3;
        try {
            v4 = this;
lbl27:
            // 2 sources

            if (v4.cfr_renamed_0.equals("DSTU4145")) {
                v5 = new sprmke(new sprije(sprjk.cfr_renamed_4, var1_2.cfr_renamed_119()), var3_3.cfr_renamed_119());
                v6 = var2_1 = v5;
            } else {
                v5 = new sprmke(new sprije(sprtk.cfr_renamed_137, var1_2.cfr_renamed_119()), var3_3.cfr_renamed_119());
                v6 = var2_1 = v5;
            }
            return v6.cfr_renamed_104("DER");
        }
        catch (IOException var4_4) {
            return null;
        }
    }

    public sprwvc(sprmke sprmke2) throws IOException {
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc2 = this;
        this.cfr_renamed_3 = new sprooc();
        this.cfr_renamed_2329(sprmke2);
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(String string, spreed spreed2, sprccd sprccd2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprwvc sprwvc2;
        void arg3;
        void arg1;
        void arg0;
        sprwvc sprwvc3 = this;
        this.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc4 = this;
        sprwvc3.cfr_renamed_3 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprwvc3.cfr_renamed_0 = arg0;
        sprwvc3.cfr_renamed_119 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprwvc2 = this;
            this.cfr_renamed_2 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            sprwvc2 = this;
            this.cfr_renamed_2 = arg3;
        }
        sprwvc2.cfr_renamed_4 = this.cfr_renamed_2513((sprccd)arg2);
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_3.cfr_renamed_1510(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprwvc(String string, spreed spreed2) {
        void arg1;
        void arg0;
        sprwvc sprwvc2 = this;
        sprwvc sprwvc3 = this;
        sprwvc3.cfr_renamed_0 = "DSTU4145";
        sprwvc sprwvc4 = this;
        sprwvc3.cfr_renamed_3 = new sprooc();
        sprwvc3.cfr_renamed_0 = arg0;
        sprwvc2.cfr_renamed_119 = arg1.cfr_renamed_2112();
        sprwvc2.cfr_renamed_2 = null;
    }
}

