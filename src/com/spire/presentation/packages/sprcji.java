/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.sprezh;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprhok;
import com.spire.presentation.packages.sprjdi;
import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprnji;
import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruck;
import com.spire.presentation.packages.spruji;
import com.spire.presentation.packages.sprwlk;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

public class sprcji
extends MacSpi
implements sprjy {
    private spraq cfr_renamed_82;
    private int cfr_renamed_126;
    private int cfr_renamed_88;
    private int cfr_renamed_31;

    @Override
    public void engineReset() {
        this.cfr_renamed_82.cfr_renamed_41();
    }

    @Override
    public int engineGetMacLength() {
        return this.cfr_renamed_82.cfr_renamed_2404();
    }

    @Override
    public byte[] engineDoFinal() {
        sprcji sprcji2 = this;
        byte[] byArray = new byte[sprcji2.engineGetMacLength()];
        sprcji2.cfr_renamed_82.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_82.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public void engineUpdate(byte arg0) {
        this.cfr_renamed_82.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprcji(spraq spraq2, int n, int n2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        sprcji sprcji2 = this;
        sprcji sprcji3 = this;
        sprcji sprcji4 = this;
        this.cfr_renamed_88 = 2;
        sprcji4.cfr_renamed_31 = 1;
        sprcji4.cfr_renamed_126 = 160;
        sprcji3.cfr_renamed_82 = arg0;
        sprcji3.cfr_renamed_88 = arg1;
        sprcji2.cfr_renamed_31 = arg2;
        sprcji2.cfr_renamed_126 = n3;
    }

    public sprcji(spraq spraq2) {
        sprcji sprcji2 = this;
        sprcji sprcji3 = this;
        sprcji3.cfr_renamed_88 = 2;
        sprcji3.cfr_renamed_31 = 1;
        sprcji2.cfr_renamed_126 = 160;
        sprcji2.cfr_renamed_82 = spraq2;
    }

    private static /* synthetic */ Hashtable cfr_renamed_2401(Map arg0) {
        Iterator iterator;
        Hashtable hashtable = new Hashtable();
        Iterator iterator2 = iterator = arg0.keySet().iterator();
        while (iterator2.hasNext()) {
            Object k;
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            Object k2 = k = iterator3.next();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block34: {
            block33: {
                block32: {
                    block31: {
                        block30: {
                            block29: {
                                block28: {
                                    block23: {
                                        block21: {
                                            block25: {
                                                block27: {
                                                    block26: {
                                                        block24: {
                                                            if (arg0 == null) {
                                                                throw new InvalidKeyException(sprdsh.cfr_renamed_9("H$ZaJ2\u0003/V-O"));
                                                            }
                                                            if (!(arg0 instanceof spruck)) break block23;
                                                            try {
                                                                var4_3 = (SecretKey)arg0;
                                                            }
                                                            catch (Exception var6_4) {
                                                                throw new InvalidKeyException(sprqld.cfr_renamed_9("D,W4%U4\u0015q\u0016a\u000ef\u0002gGuGG\u0002w\u0015q\u0013_\u0002mHD%Q,q\u001e"));
                                                            }
                                                            {
                                                                var5_6 = (PBEParameterSpec)arg1;
                                                            }
                                                            if (var4_3 instanceof PBEKey && var5_6 == null) {
                                                                var5_6 = new PBEParameterSpec(((PBEKey)var4_3).getSalt(), ((PBEKey)var4_3).getIterationCount());
                                                            }
                                                            var6_5 = 1;
                                                            var7_8 = 160;
                                                            if (!this.cfr_renamed_82.cfr_renamed_1315().startsWith(sprqld.cfr_renamed_9("S(G3"))) break block24;
                                                            var6_5 = 6;
                                                            var7_8 = 256;
                                                            v0 = var4_3;
                                                            break block21;
                                                        }
                                                        if (!(this.cfr_renamed_82 instanceof sprfwk) || this.cfr_renamed_82.cfr_renamed_1315().startsWith("SHA-1")) break block25;
                                                        if (!this.cfr_renamed_82.cfr_renamed_1315().startsWith("SHA-224")) break block26;
                                                        var6_5 = 7;
                                                        var7_8 = 224;
                                                        v0 = var4_3;
                                                        break block21;
                                                    }
                                                    if (!this.cfr_renamed_82.cfr_renamed_1315().startsWith("SHA-256")) break block27;
                                                    var6_5 = 4;
                                                    var7_8 = 256;
                                                    v0 = var4_3;
                                                    break block21;
                                                }
                                                if (this.cfr_renamed_82.cfr_renamed_1315().startsWith("SHA-384")) {
                                                    var6_5 = 8;
                                                    var7_8 = 384;
                                                    v0 = var4_3;
                                                    break block21;
                                                } else if (this.cfr_renamed_82.cfr_renamed_1315().startsWith("SHA-512")) {
                                                    var6_5 = 9;
                                                    var7_8 = 512;
                                                    v0 = var4_3;
                                                    break block21;
                                                } else {
                                                    if (!this.cfr_renamed_82.cfr_renamed_1315().startsWith("RIPEMD160")) {
                                                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("/Las\n`\u0012\u0012s\u0003,B1S(M&\u0003'L3\u0003\tn\u0000`{\u0003")).append(this.cfr_renamed_82.cfr_renamed_1315()).toString());
                                                    }
                                                    var6_5 = 2;
                                                    var7_8 = 160;
                                                    v0 = var4_3;
                                                }
                                                break block21;
                                            }
                                            v0 = var4_3;
                                        }
                                        v1 = var3_9 = sprjdi.cfr_renamed_9252((SecretKey)v0, 2, var6_5, var7_8, (PBEParameterSpec)var5_6);
                                        break block28;
                                    }
                                    if (arg0 instanceof sprgbi) {
                                        var4_3 = (sprgbi)arg0;
                                        if (var4_3.cfr_renamed_2292() != null) {
                                            var3_9 = var4_3.cfr_renamed_2292();
                                        } else {
                                            if (!(arg1 instanceof PBEParameterSpec)) {
                                                throw new InvalidAlgorithmParameterException(sprqld.cfr_renamed_9("D%QGf\u0002e\u0012}\u0015q\u001447V\"4\u0017u\u0015u\nq\u0013q\u0015gG`\b4\u0005qGg\u0002`I"));
                                            }
                                            var3_9 = sprjdi.cfr_renamed_9253((sprgbi)var4_3, arg1);
                                        }
                                    } else {
                                        if (arg1 instanceof PBEParameterSpec) {
                                            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("(M S1Q.S3J W$\u00031B3B,F5F3\u00035Z1F{\u0003")).append(arg1.getClass().getName()).toString());
                                        }
                                        var3_9 = new sprtpk(arg0.getEncoded());
                                    }
                                    v1 = var3_9;
                                }
                                v2 = var3_9;
                                if (v1 instanceof sprkpk) {
                                    var4_3 = (sprtpk)((sprkpk)v2).cfr_renamed_284();
                                    v3 = arg1;
                                } else {
                                    var4_3 = (sprtpk)v2;
                                    v3 = arg1;
                                }
                                v4 = arg1;
                                if (!(v3 instanceof sprnji)) break block29;
                                var5_6 = (sprnji)v4;
                                var3_9 = new sprtxk((sprtpk)var4_3, var5_6.cfr_renamed_9214(), var5_6.cfr_renamed_596(), var5_6.cfr_renamed_9215());
                                v5 = this;
                                ** GOTO lbl113
                            }
                            if (!(v4 instanceof IvParameterSpec)) break block30;
                            var3_9 = new sprkpk((sprbj)var4_3, ((IvParameterSpec)arg1).getIV());
                            v5 = this;
                            ** GOTO lbl113
                        }
                        if (!(arg1 instanceof RC2ParameterSpec)) break block31;
                        var3_9 = new sprkpk(new sprhok(var4_3.cfr_renamed_1521(), ((RC2ParameterSpec)arg1).getEffectiveKeyBits()), ((RC2ParameterSpec)arg1).getIV());
                        v5 = this;
                        ** GOTO lbl113
                    }
                    if (!(arg1 instanceof sprezh)) break block32;
                    var3_9 = new sprwlk(sprcji.cfr_renamed_2401(((sprezh)arg1).cfr_renamed_284())).cfr_renamed_2402(var4_3.cfr_renamed_1521()).cfr_renamed_1451();
                    v5 = this;
                    ** GOTO lbl113
                }
                if (arg1 != null) break block33;
                var3_9 = new sprtpk(arg0.getEncoded());
                v5 = this;
                ** GOTO lbl113
            }
            if (!spruji.cfr_renamed_9244(arg1)) break block34;
            var3_9 = spruji.cfr_renamed_9241((sprtpk)var4_3, arg1);
            v5 = this;
            ** GOTO lbl113
        }
        if (!(arg1 instanceof PBEParameterSpec)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqld.cfr_renamed_9("a\t\u007f\t{\u0010zGd\u0006f\u0006y\u0002`\u0002fG`\u001ed\u0002.G")).append(arg1.getClass().getName()).toString());
        }
        try {
            v5 = this;
lbl113:
            // 7 sources

            v5.cfr_renamed_82.cfr_renamed_5692(var3_9);
            return;
        }
        catch (Exception var5_7) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdsh.cfr_renamed_9("@ M/L5\u0003(M(W(B-J;Fan\u0000`{\u0003")).append(var5_7.getMessage()).toString());
        }
    }
}

