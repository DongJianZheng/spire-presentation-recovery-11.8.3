/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxlh;
import com.spire.presentation.packages.sprzmq;
import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

public class sprcrb
extends SecretKeyFactorySpi
implements sprgb {
    public sprtzd cfr_renamed_3;
    public String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcrb(String string, sprtzd sprtzd2) {
        void arg0;
        sprcrb sprcrb2 = this;
        sprcrb2.cfr_renamed_4 = arg0;
        sprcrb2.cfr_renamed_3 = sprtzd2;
    }

    @Override
    public SecretKey engineGenerateSecret(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof SecretKeySpec) {
            return (SecretKey)((Object)arg0);
        }
        throw new InvalidKeySpecException(sprzmq.cfr_renamed_9("\u0004H;G!O)\u0006\u0006C4u=C."));
    }

    @Override
    public SecretKey engineTranslateKey(SecretKey arg0) throws InvalidKeyException {
        if (arg0 == null) {
            throw new InvalidKeyException(sprxlh.cfr_renamed_9("\f\t\u001eL\u0017\r\u0015\r\n\t\u0013\t\u0015L\u000e\u001fG\u0002\u0012\u0000\u000b"));
        }
        if (!arg0.getAlgorithm().equalsIgnoreCase(this.cfr_renamed_4)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprzmq.cfr_renamed_9("m(_mH\"RmI+\u00069_=Cm")).append(this.cfr_renamed_4).append(".").toString());
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
            throw new InvalidKeySpecException(sprxlh.cfr_renamed_9("\f\t\u001e?\u0017\t\u0004L\u0017\r\u0015\r\n\t\u0013\t\u0015L\u000e\u001fG\u0002\u0012\u0000\u000b"));
        }
        if (arg0 == null) {
            throw new InvalidKeySpecException(sprzmq.cfr_renamed_9("&C4\u0006=G?G C9C?\u0006$UmH8J!"));
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

