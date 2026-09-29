/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprxnc;
import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

public class sprodi
extends SecretKeyFactorySpi
implements sprjy {
    public sprlem cfr_renamed_3;
    public String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprodi(String string, sprlem sprlem2) {
        void arg0;
        sprodi sprodi2 = this;
        sprodi2.cfr_renamed_4 = arg0;
        sprodi2.cfr_renamed_3 = sprlem2;
    }

    @Override
    public SecretKey engineGenerateSecret(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof SecretKeySpec) {
            return new SecretKeySpec(((SecretKeySpec)arg0).getEncoded(), this.cfr_renamed_4);
        }
        throw new InvalidKeySpecException(sprxnc.cfr_renamed_9("\bM7B-J%\u0003\nF8p1F\""));
    }

    @Override
    public SecretKey engineTranslateKey(SecretKey arg0) throws InvalidKeyException {
        if (arg0 == null) {
            throw new InvalidKeyException(sprver.cfr_renamed_9(";A)\u0004 E\"E=A$A\"\u00049WpJ%H<"));
        }
        if (!arg0.getAlgorithm().equalsIgnoreCase(this.cfr_renamed_4)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprxnc.cfr_renamed_9("h$ZaM.WaL'\u00035Z1Fa")).append(this.cfr_renamed_4).append(".").toString());
        }
        return new SecretKeySpec(arg0.getEncoded(), this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public KeySpec engineGetKeySpec(SecretKey arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1 == null) {
            throw new InvalidKeySpecException(sprver.cfr_renamed_9(";A)w A3\u0004 E\"E=A$A\"\u00049WpJ%H<"));
        }
        if (arg0 == null) {
            throw new InvalidKeySpecException(sprxnc.cfr_renamed_9("*F8\u00031B3B,F5F3\u0003(PaM4O-"));
        }
        if (SecretKeySpec.class.isAssignableFrom(arg1)) {
            return new SecretKeySpec(arg0.getEncoded(), this.cfr_renamed_4);
        }
        try {
            Class[] classArray = new Class[1];
            classArray[0] = byte[].class;
            Class[] classArray2 = classArray;
            Constructor constructor = arg1.getConstructor(classArray2);
            Object[] objectArray = new Object[]{arg0.getEncoded()};
            return (KeySpec)constructor.newInstance(objectArray);
        }
        catch (Exception exception) {
            throw new InvalidKeySpecException(exception.toString());
        }
    }
}

