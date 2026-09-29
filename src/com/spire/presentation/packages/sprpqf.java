/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmuaa;
import com.spire.presentation.packages.sprojn;
import com.spire.presentation.packages.sprvhm;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;

public abstract class sprpqf
extends KeyFactorySpi
implements sprcn {
    private final Set<sprlem> cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_5680(sprlem arg0) throws InvalidKeySpecException {
        if (this.cfr_renamed_4 != null) {
            if (!this.cfr_renamed_4.cfr_renamed_5078(arg0)) {
                throw new InvalidKeySpecException(new StringBuilder().insert(0, sprmuaa.cfr_renamed_9("\u0011P\u001bQ\nL\u001d]\f\u001e\u0019R\u001fQ\nW\fV\u0015\u001e7w<\u001e\u001eQ\n\u001e\u0013[\u0001\u0004X")).append(arg0).toString());
            }
        } else if (!this.cfr_renamed_3.contains(arg0)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprojn.cfr_renamed_9("2-8,)1> /c:/<,)*/+6c\u0014\n\u001fc=,)c0&\"y{")).append(arg0).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprpqf(sprlem sprlem2) {
        void arg0;
        sprpqf sprpqf2 = this;
        sprpqf2.cfr_renamed_4 = arg0;
        sprpqf2.cfr_renamed_3 = null;
    }

    public sprpqf(Set<sprlem> set) {
        sprpqf sprpqf2 = this;
        sprpqf2.cfr_renamed_4 = null;
        sprpqf2.cfr_renamed_3 = set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprmuaa.cfr_renamed_9("-P\u000bK\bN\u0017L\f[\u001c\u001e\u0013[\u0001\u001e\u000bN\u001d]\u0011X\u0011]\u0019J\u0011Q\u0016\u0004X")).append(arg0.getClass()).append(".").toString());
        }
        byte[] byArray = ((PKCS8EncodedKeySpec)arg0).getEncoded();
        try {
            sprcom sprcom2 = sprcom.cfr_renamed_23(byArray);
            sprpqf sprpqf2 = this;
            sprpqf2.cfr_renamed_5680(sprcom2.cfr_renamed_1254().cfr_renamed_593());
            return sprpqf2.cfr_renamed_5653(sprcom2);
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (!(arg0 instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprojn.cfr_renamed_9("\u000e-0-445c0&\"c(3> 2%2 :72,5y{")).append(arg0).append(".").toString());
        }
        byte[] byArray = ((X509EncodedKeySpec)arg0).getEncoded();
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(byArray);
            sprpqf sprpqf2 = this;
            sprpqf2.cfr_renamed_5680(sprvhm2.cfr_renamed_593().cfr_renamed_593());
            return sprpqf2.cfr_renamed_3215(sprvhm2);
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }
}

