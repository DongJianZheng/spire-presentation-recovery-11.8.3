/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawj;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.spreai;
import com.spire.presentation.packages.spreel;
import com.spire.presentation.packages.sprevk;
import com.spire.presentation.packages.sprgei;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprlal;
import com.spire.presentation.packages.sprlql;
import com.spire.presentation.packages.sprmok;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqjm;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprso;
import com.spire.presentation.packages.sprsw;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprwnk;
import com.spire.presentation.packages.sprxjg;
import com.spire.presentation.packages.sprxjl;
import com.spire.presentation.packages.sprxo;
import com.spire.presentation.packages.sprxz;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprcvj
extends sprjmf {
    private Object cfr_renamed_91;
    private sprgei cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private String cfr_renamed_112;
    private spreai cfr_renamed_2;
    private sprqxk cfr_renamed_3;
    private static final sprqjm cfr_renamed_4 = new sprqjm();

    public byte[] cfr_renamed_2499(BigInteger arg0) {
        return cfr_renamed_4.cfr_renamed_2500(arg0, cfr_renamed_4.cfr_renamed_9157(this.cfr_renamed_3.cfr_renamed_1769()));
    }

    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(arg1 == null || arg1 instanceof sprgei || arg1 instanceof sprobi || arg1 instanceof spreai)) {
            throw new InvalidAlgorithmParameterException(sprxjg.cfr_renamed_9(":*T$\u0018\"\u001b7\u001d1\u001c(T5\u00157\u0015(\u00111\u00117\u0007e\u00070\u00045\u001b7\u0000 \u0010"));
        }
        if (this.cfr_renamed_91 instanceof spreel) {
            sprnzk sprnzk2;
            sprzuk sprzuk2;
            sprzuk sprzuk3;
            Object object;
            this.cfr_renamed_0 = null;
            if (!(arg0 instanceof sprso) && !(arg1 instanceof sprgei)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprlql.cfr_renamed_9("Gv\u0002dG|\u0000o\u0002x\nx\tiGo\u0002l\u0012t\u0015x\u0014=")).append(sprcvj.cfr_renamed_2498(sprgei.class)).append(sprxjg.cfr_renamed_9("T#\u001b7T,\u001a,\u0000,\u0015)\u001d6\u00151\u001d*\u001a")).toString());
            }
            if (arg0 instanceof sprso) {
                object = (sprso)arg0;
                sprzuk3 = (sprzuk)sprdbk.cfr_renamed_1220(object.cfr_renamed_2095());
                sprzuk2 = (sprzuk)sprdbk.cfr_renamed_1220(object.cfr_renamed_2094());
                sprnzk2 = null;
                if (object.cfr_renamed_2096() != null) {
                    sprnzk2 = (sprnzk)sprdbk.cfr_renamed_1216(object.cfr_renamed_2096());
                }
            } else {
                object = (sprgei)arg1;
                sprzuk3 = (sprzuk)sprdbk.cfr_renamed_1220((PrivateKey)arg0);
                sprzuk2 = (sprzuk)sprdbk.cfr_renamed_1220(((sprgei)object).cfr_renamed_2094());
                sprnzk2 = null;
                if (((sprgei)object).cfr_renamed_2096() != null) {
                    sprnzk2 = (sprnzk)sprdbk.cfr_renamed_1216(((sprgei)object).cfr_renamed_2096());
                }
                this.cfr_renamed_0 = object;
                this.cfr_renamed_4 = ((sprgei)this.cfr_renamed_0).cfr_renamed_4032();
            }
            object = new sprwnk(sprzuk3, sprzuk2, sprnzk2);
            this.cfr_renamed_3 = sprzuk3.cfr_renamed_284();
            ((spreel)this.cfr_renamed_91).cfr_renamed_5692((sprbj)object);
            return;
        }
        if (arg1 instanceof spreai) {
            if (!(this.cfr_renamed_91 instanceof sprxjl)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprlql.cfr_renamed_9("=\fx\u001e=\u0006z\u0015x\u0002p\u0002s\u0013=\u0004|\ts\biG\u007f\u0002=\u0012n\u0002yGj\u000ei\u000f=")).append(sprcvj.cfr_renamed_2498(spreai.class)).toString());
            }
            spreai spreai2 = (spreai)arg1;
            sprzuk sprzuk4 = (sprzuk)sprdbk.cfr_renamed_1220((PrivateKey)arg0);
            sprzuk sprzuk5 = (sprzuk)sprdbk.cfr_renamed_1220(spreai2.cfr_renamed_2094());
            sprnzk sprnzk3 = null;
            if (spreai2.cfr_renamed_2096() != null) {
                sprnzk3 = (sprnzk)sprdbk.cfr_renamed_1216(spreai2.cfr_renamed_2096());
            }
            sprcvj sprcvj2 = this;
            sprcvj2.cfr_renamed_2 = spreai2;
            this.cfr_renamed_4 = spreai2.cfr_renamed_4032();
            sprevk sprevk2 = new sprevk(sprzuk4, sprzuk5, sprnzk3);
            sprcvj2.cfr_renamed_3 = sprzuk4.cfr_renamed_284();
            ((sprxjl)this.cfr_renamed_91).cfr_renamed_5692(sprevk2);
            return;
        }
        if (!(arg0 instanceof PrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprxjg.cfr_renamed_9("e\u001f \re\u0015\"\u0006 \u0011(\u0011+\u0000e\u0006 \u00050\u001d7\u00116T")).append(sprcvj.cfr_renamed_2498(sprxo.class)).append(sprlql.cfr_renamed_9("=\u0001r\u0015=\u000es\u000ei\u000e|\u000bt\u0014|\u0013t\bs")).toString());
        }
        if (this.cfr_renamed_91 == null && arg1 instanceof sprobi) {
            throw new InvalidAlgorithmParameterException(sprxjg.cfr_renamed_9("\u001a*T\u000e0\u0003T6\u0004 \u0017,\u0012,\u0011!T#\u001b7T\u0010\u0007 \u0006\u000e\u0011<\u001d+\u0013\b\u00151\u00117\u001d$\u0018\u0016\u0004 \u0017"));
        }
        sprzuk sprzuk6 = (sprzuk)sprdbk.cfr_renamed_1220((PrivateKey)arg0);
        sprcvj sprcvj3 = this;
        sprcvj3.cfr_renamed_3 = sprzuk6.cfr_renamed_284();
        sprcvj3.cfr_renamed_4 = arg1 instanceof sprobi ? ((sprobi)arg1).cfr_renamed_4032() : null;
        ((spruy)this.cfr_renamed_91).cfr_renamed_5692(sprzuk6);
    }

    /*
     * WARNING - void declaration
     */
    public sprcvj(String string, sprxjl sprxjl2, sprjs sprjs2) {
        void arg2;
        void arg0;
        sprcvj sprcvj2 = this;
        void v1 = arg0;
        super((String)v1, (sprjs)arg2);
        sprcvj2.cfr_renamed_112 = v1;
        sprcvj2.cfr_renamed_91 = sprxjl2;
    }

    @Override
    public byte[] cfr_renamed_5696() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprcvj(String string, spruy spruy2, sprjs sprjs2) {
        void arg2;
        void arg0;
        sprcvj sprcvj2 = this;
        void v1 = arg0;
        super((String)v1, (sprjs)arg2);
        sprcvj2.cfr_renamed_112 = v1;
        sprcvj2.cfr_renamed_91 = spruy2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        block10: {
            block9: {
                if (this.cfr_renamed_3 == null) {
                    throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprlql.cfr_renamed_9("=\tr\u0013=\u000es\u000ei\u000e|\u000bt\u0014x\u00033")).toString());
                }
                if (!arg1) {
                    throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprxjg.cfr_renamed_9("T&\u0015+T*\u001a)\re\u0016 T'\u00111\u0003 \u0011+T1\u0003*T5\u00157\u0000,\u00116Z")).toString());
                }
                if (!(this.cfr_renamed_91 instanceof spreel)) break block9;
                if (!(arg0 instanceof sprsw)) {
                    var4_3 = (sprnzk)sprdbk.cfr_renamed_1216((PublicKey)arg0);
                    var5_7 = (sprnzk)sprdbk.cfr_renamed_1216(this.cfr_renamed_0.cfr_renamed_9200());
                    var3_10 /* !! */  = new sprmok(var4_3, var5_7);
                    v0 = this;
                } else {
                    var4_4 = (sprsw)arg0;
                    var5_8 = (sprnzk)sprdbk.cfr_renamed_1216(var4_4.cfr_renamed_2093());
                    var6_11 = (sprnzk)sprdbk.cfr_renamed_1216(var4_4.cfr_renamed_2092());
                    var3_10 /* !! */  = new sprmok(var5_8, var6_11);
                    v0 = this;
                }
                ** GOTO lbl32
            }
            v1 = arg0;
            if (!(this.cfr_renamed_91 instanceof sprxjl)) break block10;
            var4_5 = (sprnzk)sprdbk.cfr_renamed_1216((PublicKey)v1);
            var5_9 = (sprnzk)sprdbk.cfr_renamed_1216(this.cfr_renamed_2.cfr_renamed_9200());
            var3_10 /* !! */  = new sprlal(var4_5, var5_9);
            v0 = this;
            ** GOTO lbl32
        }
        if (!(v1 instanceof PublicKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprlql.cfr_renamed_9("Gv\u0002dG|\u0000o\u0002x\nx\tiGo\u0002l\u0012t\u0015x\u0014=")).append(sprcvj.cfr_renamed_2498(sprxz.class)).append(sprxjg.cfr_renamed_9("e\u0012*\u0006e\u0010*$-\u00156\u0011")).toString());
        }
        var3_10 /* !! */  = sprdbk.cfr_renamed_1216((PublicKey)arg0);
        try {
            v0 = this;
lbl32:
            // 4 sources

            v2 = this;
            if (v0.cfr_renamed_91 instanceof spruy) {
                v3 = this;
                v2.cfr_renamed_1 = v3.cfr_renamed_2499(((spruy)v3.cfr_renamed_91).cfr_renamed_5695(var3_10 /* !! */ ));
            } else {
                v2.cfr_renamed_1 = ((sprxjl)this.cfr_renamed_91).cfr_renamed_5695(var3_10 /* !! */ );
            }
        }
        catch (Exception var4_6) {
            throw new sprawj(this, sprlql.cfr_renamed_9("\u0004|\u000b~\u0012q\u0006i\u000er\t=\u0001|\u000eq\u0002y]=") + var4_6.getMessage(), var4_6);
        }
        return null;
    }

    private static /* synthetic */ String cfr_renamed_2498(Class arg0) {
        String string = arg0.getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }
}

