/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.spruld;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprzde;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;

public class sprnkb
implements DSAPublicKey {
    private static final long cfr_renamed_2 = 1752452449903495175L;
    private DSAParams cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnkb(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        void arg0;
        sprnkb sprnkb2 = this;
        sprnkb2.cfr_renamed_4 = arg0;
        sprnkb2.cfr_renamed_3 = dSAParameterSpec;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnkb(sprdce arg0) {
        sprooe sprooe2;
        try {
            sprooe2 = (sprooe)arg0.cfr_renamed_1227();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprwzj.cfr_renamed_9("\u0007\u001a\u0018\u0015\u0002\u001d\nT\u0007\u001a\b\u001bN\u0007\u001a\u0006\u001b\u0017\u001a\u0001\u001c\u0011N\u001d\u0000T*'/T\u001e\u0001\f\u0018\u0007\u0017N\u001f\u000b\r"));
        }
        this.cfr_renamed_4 = sprooe2.cfr_renamed_97();
        if (this.cfr_renamed_2289(arg0.cfr_renamed_593().cfr_renamed_284())) {
            sprzde sprzde2 = sprzde.cfr_renamed_23(arg0.cfr_renamed_593().cfr_renamed_284());
            sprnkb sprnkb2 = this;
            sprnkb2.cfr_renamed_3 = new DSAParameterSpec(sprzde2.cfr_renamed_1155(), sprzde2.cfr_renamed_1604(), sprzde2.cfr_renamed_1145());
        }
    }

    @Override
    public BigInteger getY() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprdkea.cfr_renamed_9("}a\u007fm?{txpzp|~z"));
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer.append(sprwzj.cfr_renamed_9("*'/T>\u0001\f\u0018\u0007\u0017N?\u000b\r")).append(string);
        stringBuffer2.append(sprdkea.cfr_renamed_9("(1(1(1(1(1(1q+(")).append(this.getY().toString(16)).append(string);
        return stringBuffer2.toString();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = 4 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        this.cfr_renamed_4 = (BigInteger)arg0.readObject();
        sprnkb sprnkb2 = this;
        sprnkb2.cfr_renamed_3 = new DSAParameterSpec((BigInteger)arg0.readObject(), (BigInteger)arg0.readObject(), (BigInteger)arg0.readObject());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        sprnkb sprnkb2 = this;
        arg0.writeObject(this.cfr_renamed_4);
        arg0.writeObject(sprnkb2.cfr_renamed_3.getP());
        v0.writeObject(sprnkb2.cfr_renamed_3.getQ());
        v0.writeObject(this.cfr_renamed_3.getG());
    }

    private /* synthetic */ boolean cfr_renamed_2289(spra arg0) {
        return arg0 != null && !sprume.cfr_renamed_3.equals(arg0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
        return this.getY().equals(dSAPublicKey.getY()) && this.getParams().getG().equals(dSAPublicKey.getParams().getG()) && this.getParams().getP().equals(dSAPublicKey.getParams().getP()) && this.getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    /*
     * WARNING - void declaration
     */
    public sprnkb(DSAPublicKey dSAPublicKey) {
        void arg0;
        sprnkb sprnkb2 = this;
        sprnkb2.cfr_renamed_4 = arg0.getY();
        sprnkb2.cfr_renamed_3 = dSAPublicKey.getParams();
    }

    /*
     * WARNING - void declaration
     */
    public sprnkb(DSAPublicKeySpec dSAPublicKeySpec) {
        void arg0;
        this.cfr_renamed_4 = dSAPublicKeySpec.getY();
        sprnkb sprnkb2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.getP(), arg0.getQ(), arg0.getG());
    }

    /*
     * WARNING - void declaration
     */
    public sprnkb(spruld spruld2) {
        void arg0;
        this.cfr_renamed_4 = spruld2.spr\u3181();
        sprnkb sprnkb2 = this;
        this.cfr_renamed_3 = new DSAParameterSpec(arg0.cfr_renamed_284().cfr_renamed_1155(), arg0.cfr_renamed_284().cfr_renamed_1604(), arg0.cfr_renamed_284().cfr_renamed_1145());
    }

    @Override
    public String getFormat() {
        return sprwzj.cfr_renamed_9(",@A^M");
    }

    @Override
    public DSAParams getParams() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            if (this.cfr_renamed_3 != null) return new sprdce(new sprije(sprtk.cfr_renamed_314, new sprzde(this.cfr_renamed_3.getP(), this.cfr_renamed_3.getQ(), this.cfr_renamed_3.getG())), new sprooe(this.cfr_renamed_4)).cfr_renamed_104("DER");
            return new sprdce(new sprije(sprtk.cfr_renamed_314), new sprooe(this.cfr_renamed_4)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getAlgorithm() {
        return "DSA";
    }

    public int hashCode() {
        return this.getY().hashCode() ^ this.getParams().getG().hashCode() ^ this.getParams().getP().hashCode() ^ this.getParams().getQ().hashCode();
    }
}

