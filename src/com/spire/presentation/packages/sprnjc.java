/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spremc;
import com.spire.presentation.packages.sprfbp;
import com.spire.presentation.packages.sprhjc;
import com.spire.presentation.packages.sprknc;
import com.spire.presentation.packages.sprlbe;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprnic;
import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprylc;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class sprnjc
extends sprknc {
    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof RSAPublicKey) {
            return new sprhjc((RSAPublicKey)arg0);
        }
        if (arg0 instanceof RSAPrivateCrtKey) {
            return new sprylc((RSAPrivateCrtKey)arg0);
        }
        if (arg0 instanceof RSAPrivateKey) {
            return new sprnic((RSAPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprfbp.cfr_renamed_9("vzd?ifmz=jstspjq"));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof RSAPublicKeySpec) {
            return new sprhjc((RSAPublicKeySpec)arg0);
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(RSAPublicKeySpec.class) && arg0 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg0;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if (arg1.isAssignableFrom(RSAPrivateKeySpec.class) && arg0 instanceof RSAPrivateKey) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)arg0;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (arg1.isAssignableFrom(RSAPrivateCrtKeySpec.class) && arg0 instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg0;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PublicKey cfr_renamed_1226(sprdce arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (spremc.cfr_renamed_2475(sprtzd2)) {
            return new sprhjc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprprc.cfr_renamed_9("thrkgmalx$|`pjamsmpv5")).append(sprtzd2).append(sprfbp.cfr_renamed_9("=vs?vzd?spi?oz~pzqtlx{")).toString());
    }

    @Override
    public PrivateKey cfr_renamed_1228(sprmke arg0) throws IOException {
        sprtzd sprtzd2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (spremc.cfr_renamed_2475(sprtzd2)) {
            sprlbe sprlbe2 = sprlbe.cfr_renamed_23(arg0.cfr_renamed_1229());
            if (sprlbe2.cfr_renamed_2304().intValue() == 0) {
                return new sprnic(sprlbe2);
            }
            return new sprylc(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprprc.cfr_renamed_9("thrkgmalx$|`pjamsmpv5")).append(sprtzd2).append(sprfbp.cfr_renamed_9("=vs?vzd?spi?oz~pzqtlx{")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof PKCS8EncodedKeySpec) {
            try {
                return this.cfr_renamed_1228(sprmke.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
            }
            catch (Exception exception) {
                try {
                    return new sprylc(sprlbe.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
                }
                catch (Exception exception2) {
                    throw new sprpjc(new StringBuilder().insert(0, sprprc.cfr_renamed_9("q{ewhp$ak5tgkvafw5op}5weav>5")).append(exception.toString()).toString(), exception);
                }
            }
        }
        if (arg0 instanceof RSAPrivateCrtKeySpec) {
            return new sprylc((RSAPrivateCrtKeySpec)arg0);
        }
        if (arg0 instanceof RSAPrivateKeySpec) {
            return new sprnic((RSAPrivateKeySpec)arg0);
        }
        throw new InvalidKeySpecException(new StringBuilder().insert(0, sprfbp.cfr_renamed_9("Hqvqrhs?VzdLmz~?ifmz'?")).append(arg0.getClass().getName()).toString());
    }
}

