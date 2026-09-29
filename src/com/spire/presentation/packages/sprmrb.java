/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbde;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdmb;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprhqb;
import com.spire.presentation.packages.sprijc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprlpb;
import com.spire.presentation.packages.sprmjb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooc;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.spruxd;
import com.spire.presentation.packages.sprveda;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprxb;
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

public class sprmrb
implements ECPrivateKey,
sprab,
sprwb,
sprxb {
    private boolean cfr_renamed_91;
    private sprmra cfr_renamed_0;
    private String cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private ECParameterSpec cfr_renamed_3;
    private sprooc cfr_renamed_4;

    @Override
    public String getFormat() {
        return sprrvy.cfr_renamed_9("BYQA1*");
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
                var5_5 = sprste.cfr_renamed_2102((sprtzd)var3_3);
                var6_7 = sprijc.cfr_renamed_2114(var5_5.cfr_renamed_1769(), var5_5.cfr_renamed_2113());
                v0 = this;
                v0.cfr_renamed_3 = new sprmjb(sprste.cfr_renamed_2316((sprtzd)var3_3), var6_7, new ECPoint(var5_5.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var5_5.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var5_5.cfr_renamed_1146(), var5_5.cfr_renamed_1153());
            } else {
                var5_6 = sprijc.cfr_renamed_2114(var4_4.cfr_renamed_1769(), var4_4.cfr_renamed_2113());
                this.cfr_renamed_3 = new sprmjb(sprjkc.cfr_renamed_2319((sprtzd)var3_3), var5_6, new ECPoint(var4_4.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var4_4.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var4_4.cfr_renamed_1146(), var4_4.cfr_renamed_1153());
            }
            ** GOTO lbl24
        }
        if (var2_2.cfr_renamed_2320()) {
            v1 = arg0;
            this.cfr_renamed_3 = null;
        } else {
            var3_3 = sprfpd.cfr_renamed_23(var2_2.cfr_renamed_284());
            var4_4 = sprijc.cfr_renamed_2114(var3_3.cfr_renamed_1769(), var3_3.cfr_renamed_2113());
            this.cfr_renamed_3 = new ECParameterSpec((EllipticCurve)var4_4, new ECPoint(var3_3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), var3_3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), var3_3.cfr_renamed_1146(), var3_3.cfr_renamed_1153().intValue());
lbl24:
            // 3 sources

            v1 = arg0;
        }
        var3_3 = v1.cfr_renamed_1229();
        if (var3_3 instanceof sprooe) {
            var4_4 = sprooe.cfr_renamed_23(var3_3);
            this.cfr_renamed_2 = var4_4.cfr_renamed_97();
            return;
        }
        var4_4 = new sprbde((sprbne)var3_3);
        v2 = this;
        v2.cfr_renamed_2 = var4_4.cfr_renamed_1521();
        v2.cfr_renamed_0 = var4_4.cfr_renamed_1157();
    }

    @Override
    public void cfr_renamed_2152(sprtzd arg0, spra arg1) {
        this.cfr_renamed_4.cfr_renamed_2152(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(String string, spreed spreed2) {
        void arg1;
        void arg0;
        sprmrb sprmrb2 = this;
        sprmrb sprmrb3 = this;
        sprmrb3.cfr_renamed_1 = "EC";
        sprmrb sprmrb4 = this;
        sprmrb3.cfr_renamed_4 = new sprooc();
        sprmrb3.cfr_renamed_1 = arg0;
        sprmrb2.cfr_renamed_2 = arg1.cfr_renamed_2112();
        sprmrb2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(ECPrivateKey eCPrivateKey) {
        void arg0;
        sprmrb sprmrb2 = this;
        void v1 = arg0;
        this.cfr_renamed_1 = "EC";
        sprmrb sprmrb3 = this;
        this.cfr_renamed_4 = new sprooc();
        this.cfr_renamed_2 = v1.getS();
        sprmrb2.cfr_renamed_1 = v1.getAlgorithm();
        sprmrb2.cfr_renamed_3 = eCPrivateKey.getParams();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        byte[] byArray = (byte[])arg0.readObject();
        this.cfr_renamed_2329(sprmke.cfr_renamed_23(sprvva.cfr_renamed_184(byArray)));
        this.cfr_renamed_1 = (String)arg0.readObject();
        sprmrb sprmrb2 = this;
        sprmrb2.cfr_renamed_91 = arg0.readBoolean();
        sprmrb2.cfr_renamed_4 = new sprooc();
        this.cfr_renamed_4.cfr_renamed_2290(arg0);
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream arg0) throws IOException {
        sprmrb sprmrb2 = this;
        ObjectOutputStream objectOutputStream = arg0;
        objectOutputStream.writeObject(this.getEncoded());
        objectOutputStream.writeObject(this.cfr_renamed_1);
        arg0.writeBoolean(sprmrb2.cfr_renamed_91);
        sprmrb2.cfr_renamed_4.cfr_renamed_2291(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(String string, spreed spreed2, sprdmb sprdmb2, ECParameterSpec eCParameterSpec) {
        void arg2;
        sprmrb sprmrb2;
        void arg3;
        void arg1;
        void arg0;
        sprmrb sprmrb3 = this;
        this.cfr_renamed_1 = "EC";
        sprmrb sprmrb4 = this;
        sprmrb3.cfr_renamed_4 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprmrb3.cfr_renamed_1 = arg0;
        sprmrb3.cfr_renamed_2 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprmrb2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            sprmrb2 = this;
            this.cfr_renamed_3 = arg3;
        }
        sprmrb2.cfr_renamed_0 = this.cfr_renamed_2330((sprdmb)arg2);
    }

    @Override
    public ECParameterSpec getParams() {
        return this.cfr_renamed_3;
    }

    @Override
    public spra cfr_renamed_1510(sprtzd arg0) {
        return this.cfr_renamed_4.cfr_renamed_1510(arg0);
    }

    public sprlpb cfr_renamed_2308() {
        if (this.cfr_renamed_3 != null) {
            sprmrb sprmrb2 = this;
            return sprijc.cfr_renamed_2328(sprmrb2.cfr_renamed_3, sprmrb2.cfr_renamed_91);
        }
        return sprbrb.cfr_renamed_86.cfr_renamed_2312();
    }

    @Override
    public void cfr_renamed_2327(String arg0) {
        this.cfr_renamed_91 = !sprveda.cfr_renamed_9("r.d/j0u%t3b$").equalsIgnoreCase(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprmra cfr_renamed_2330(sprdmb arg0) {
        try {
            sprdce sprdce2 = sprdce.cfr_renamed_23(sprvva.cfr_renamed_184(arg0.getEncoded()));
            return sprdce2.cfr_renamed_2314();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(String string, sprmrb sprmrb2) {
        void arg0;
        void arg1;
        sprmrb sprmrb3 = this;
        void v1 = arg1;
        sprmrb sprmrb4 = this;
        sprmrb sprmrb5 = this;
        sprmrb5.cfr_renamed_1 = "EC";
        sprmrb sprmrb6 = this;
        sprmrb5.cfr_renamed_4 = new sprooc();
        sprmrb5.cfr_renamed_1 = arg0;
        sprmrb4.cfr_renamed_2 = arg1.cfr_renamed_2;
        sprmrb4.cfr_renamed_3 = arg1.cfr_renamed_3;
        this.cfr_renamed_91 = v1.cfr_renamed_91;
        sprmrb3.cfr_renamed_4 = v1.cfr_renamed_4;
        sprmrb3.cfr_renamed_0 = sprmrb2.cfr_renamed_0;
    }

    @Override
    public sprlpb cfr_renamed_284() {
        if (this.cfr_renamed_3 == null) {
            return null;
        }
        sprmrb sprmrb2 = this;
        return sprijc.cfr_renamed_2328(sprmrb2.cfr_renamed_3, sprmrb2.cfr_renamed_91);
    }

    @Override
    public BigInteger getS() {
        return this.cfr_renamed_2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprrvy.cfr_renamed_9("~{|w<awbs`sf}`"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprveda.cfr_renamed_9("b#\u00070U\tQ\u0001S\u0005\u0007+B\u0019")).append(string);
        stringBuffer2.append(sprrvy.cfr_renamed_9("2222222222222A(2")).append(this.cfr_renamed_2.toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public sprmrb(String arg0, sprhqb arg1) {
        sprhqb sprhqb2 = arg1;
        sprmrb sprmrb2 = this;
        sprmrb2.cfr_renamed_1 = "EC";
        sprmrb sprmrb3 = this;
        sprmrb2.cfr_renamed_4 = new sprooc();
        sprmrb2.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = sprhqb2.cfr_renamed_2112();
        if (sprhqb2.cfr_renamed_2110() != null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg1.cfr_renamed_2110().cfr_renamed_1769(), arg1.cfr_renamed_2110().cfr_renamed_2113());
            this.cfr_renamed_3 = sprijc.cfr_renamed_2311(ellipticCurve, arg1.cfr_renamed_2110());
            return;
        }
        this.cfr_renamed_3 = null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public byte[] getEncoded() {
        block9: {
            if (this.cfr_renamed_3 instanceof sprmjb) {
                var2_1 = sprjkc.cfr_renamed_2326(((sprmjb)this.cfr_renamed_3).cfr_renamed_313());
                if (var2_1 == null) {
                    var2_1 = new sprtzd(((sprmjb)this.cfr_renamed_3).cfr_renamed_313());
                }
                var1_2 = new spruxd((sprtzd)var2_1);
                v0 = this;
            } else if (this.cfr_renamed_3 == null) {
                var1_2 = new spruxd(sprume.cfr_renamed_3);
                v0 = this;
            } else {
                v1 = this;
                v0 = v1;
                v2 = var2_1 = sprijc.cfr_renamed_2323(v1.cfr_renamed_3.getCurve());
                var3_3 = new sprfpd((sprpib)v2, sprijc.cfr_renamed_2324((sprpib)v2, this.cfr_renamed_3.getGenerator(), this.cfr_renamed_91), this.cfr_renamed_3.getOrder(), BigInteger.valueOf(this.cfr_renamed_3.getCofactor()), this.cfr_renamed_3.getCurve().getSeed());
                var1_2 = new spruxd((sprfpd)var3_3);
            }
            if (v0.cfr_renamed_0 == null) break block9;
            v3 = new sprbde(this.getS(), this.cfr_renamed_0, var1_2);
            var3_3 = v3;
            v4 = this;
            ** GOTO lbl27
        }
        v3 = new sprbde(this.getS(), var1_2);
        var3_3 = v3;
        try {
            v4 = this;
lbl27:
            // 2 sources

            if (v4.cfr_renamed_1.equals("ECGOST3410")) {
                v5 = new sprmke(new sprije(sprji.cfr_renamed_4, var1_2.cfr_renamed_119()), var3_3.cfr_renamed_119());
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

    @Override
    public BigInteger cfr_renamed_2112() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(String string, ECPrivateKeySpec eCPrivateKeySpec) {
        void arg1;
        void arg0;
        sprmrb sprmrb2 = this;
        sprmrb sprmrb3 = this;
        sprmrb3.cfr_renamed_1 = "EC";
        sprmrb sprmrb4 = this;
        sprmrb3.cfr_renamed_4 = new sprooc();
        sprmrb3.cfr_renamed_1 = arg0;
        sprmrb2.cfr_renamed_2 = arg1.getS();
        sprmrb2.cfr_renamed_3 = eCPrivateKeySpec.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprmrb(String string, spreed spreed2, sprdmb sprdmb2, sprlpb sprlpb2) {
        void arg2;
        sprmrb sprmrb2;
        void arg3;
        void arg1;
        void arg0;
        sprmrb sprmrb3 = this;
        this.cfr_renamed_1 = "EC";
        sprmrb sprmrb4 = this;
        sprmrb3.cfr_renamed_4 = new sprooc();
        sprqid sprqid2 = spreed2.cfr_renamed_284();
        sprmrb3.cfr_renamed_1 = arg0;
        sprmrb3.cfr_renamed_2 = arg1.cfr_renamed_2112();
        if (arg3 == null) {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(sprqid2.cfr_renamed_1769(), sprqid2.cfr_renamed_2113());
            sprmrb2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(sprqid2.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), sprqid2.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), sprqid2.cfr_renamed_1146(), sprqid2.cfr_renamed_1153().intValue());
        } else {
            EllipticCurve ellipticCurve = sprijc.cfr_renamed_2114(arg3.cfr_renamed_1769(), arg3.cfr_renamed_2113());
            sprmrb2 = this;
            this.cfr_renamed_3 = new ECParameterSpec(ellipticCurve, new ECPoint(arg3.cfr_renamed_1145().cfr_renamed_1969().cfr_renamed_1779(), arg3.cfr_renamed_1145().cfr_renamed_1973().cfr_renamed_1779()), arg3.cfr_renamed_1146(), arg3.cfr_renamed_1153().intValue());
        }
        sprmrb2.cfr_renamed_0 = this.cfr_renamed_2330((sprdmb)arg2);
    }

    @Override
    public Enumeration cfr_renamed_2158() {
        return this.cfr_renamed_4.cfr_renamed_2158();
    }

    public sprmrb() {
        this.cfr_renamed_1 = "EC";
        sprmrb sprmrb2 = this;
        this.cfr_renamed_4 = new sprooc();
    }

    public int hashCode() {
        return this.cfr_renamed_2112().hashCode() ^ this.cfr_renamed_2308().hashCode();
    }

    public sprmrb(sprmke sprmke2) throws IOException {
        this.cfr_renamed_1 = "EC";
        sprmrb sprmrb2 = this;
        this.cfr_renamed_4 = new sprooc();
        this.cfr_renamed_2329(sprmke2);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprmrb)) {
            return false;
        }
        sprmrb sprmrb2 = (sprmrb)arg0;
        return this.cfr_renamed_2112().equals(sprmrb2.cfr_renamed_2112()) && this.cfr_renamed_2308().equals(sprmrb2.cfr_renamed_2308());
    }
}

