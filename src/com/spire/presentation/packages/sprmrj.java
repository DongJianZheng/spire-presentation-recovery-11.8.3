/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjj;
import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcoj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctm;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprgkj;
import com.spire.presentation.packages.sprhao;
import com.spire.presentation.packages.sprkhk;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprkzh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlnj;
import com.spire.presentation.packages.sprmpk;
import com.spire.presentation.packages.sprubi;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxjk;
import com.spire.presentation.packages.spryye;
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

public class sprmrj
extends sprclj {
    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if ((arg1.isAssignableFrom(KeySpec.class) || arg1.isAssignableFrom(RSAPublicKeySpec.class)) && arg0 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg0;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        if ((arg1.isAssignableFrom(KeySpec.class) || arg1.isAssignableFrom(RSAPrivateCrtKeySpec.class)) && arg0 instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey)arg0;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        }
        if ((arg1.isAssignableFrom(KeySpec.class) || arg1.isAssignableFrom(RSAPrivateKeySpec.class)) && arg0 instanceof RSAPrivateKey) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)arg0;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        if (arg1.isAssignableFrom(sprkzh.class) && arg0 instanceof RSAPublicKey) {
            try {
                return new sprkzh(sprxjk.cfr_renamed_9398(new sprkik(false, ((RSAPublicKey)arg0).getModulus(), ((RSAPublicKey)arg0).getPublicExponent())));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprhao.cfr_renamed_9("`gtkyl5}z)e{zm`jp)pgvfq`{n/)")).append(iOException.getMessage()).toString());
            }
        }
        if (arg1.isAssignableFrom(sprubi.class) && arg0 instanceof RSAPrivateCrtKey) {
            try {
                return new sprubi(sprmpk.cfr_renamed_9399(new sprkhk(((RSAPrivateCrtKey)arg0).getModulus(), ((RSAPrivateCrtKey)arg0).getPublicExponent(), ((RSAPrivateCrtKey)arg0).getPrivateExponent(), ((RSAPrivateCrtKey)arg0).getPrimeP(), ((RSAPrivateCrtKey)arg0).getPrimeQ(), ((RSAPrivateCrtKey)arg0).getPrimeExponentP(), ((RSAPrivateCrtKey)arg0).getPrimeExponentQ(), ((RSAPrivateCrtKey)arg0).getCrtCoefficient())));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprgkj.cfr_renamed_9("`/t#y$55zae3z%`\"pap/v.q({&/a")).append(iOException.getMessage()).toString());
            }
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprgij.cfr_renamed_9397(sprlem2)) {
            return new sprbjj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprhao.cfr_renamed_9("hynz{|}}d5`ql{}|o|lg)")).append(sprlem2).append(sprgkj.cfr_renamed_9("5({a~$la{.aag$v.r/|2p%")).toString());
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof RSAPublicKeySpec) {
            return new sprbjj((RSAPublicKeySpec)arg0);
        }
        if (arg0 instanceof sprkzh) {
            spryye spryye2 = sprxjk.cfr_renamed_9400(((sprkzh)arg0).getEncoded());
            if (spryye2 instanceof sprkik) {
                return new sprbjj((sprkik)spryye2);
            }
            throw new InvalidKeySpecException(sprhao.cfr_renamed_9("Fel{)FZ])e|we|j5bpp5`f){fa)GZT)e|we|j5bpp"));
        }
        return super.engineGeneratePublic(arg0);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof RSAPublicKey) {
            return new sprbjj((RSAPublicKey)arg0);
        }
        if (arg0 instanceof RSAPrivateCrtKey) {
            return new sprlnj((RSAPrivateCrtKey)arg0);
        }
        if (arg0 instanceof RSAPrivateKey) {
            return new sprcoj((RSAPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprgkj.cfr_renamed_9("~$laa8e$54{*{.b/"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprgij.cfr_renamed_9397(sprlem2)) {
            sprctm sprctm2 = sprctm.cfr_renamed_23(arg0.cfr_renamed_1229());
            if (sprctm2.cfr_renamed_2304().intValue() == 0) {
                return new sprcoj(arg0.cfr_renamed_1254(), sprctm2);
            }
            return new sprlnj(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprhao.cfr_renamed_9("hynz{|}}d5`ql{}|o|lg)")).append(sprlem2).append(sprgkj.cfr_renamed_9("5({a~$la{.aag$v.r/|2p%")).toString());
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
                return this.cfr_renamed_5653(sprcom.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
            }
            catch (Exception exception) {
                try {
                    return new sprlnj(sprctm.cfr_renamed_23(((PKCS8EncodedKeySpec)arg0).getEncoded()));
                }
                catch (Exception exception2) {
                    throw new sprboj(new StringBuilder().insert(0, sprhao.cfr_renamed_9("`gtkyl5}z)e{zjpzf)~ll)fypj/)")).append(exception.toString()).toString(), exception);
                }
            }
        }
        if (arg0 instanceof RSAPrivateCrtKeySpec) {
            return new sprlnj((RSAPrivateCrtKeySpec)arg0);
        }
        if (arg0 instanceof RSAPrivateKeySpec) {
            return new sprcoj((RSAPrivateKeySpec)arg0);
        }
        if (!(arg0 instanceof sprubi)) {
            throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhao.cfr_renamed_9("`g~gz~{)^llZelv)apel/)")).append(arg0.getClass().getName()).toString());
        }
        spryye spryye2 = sprmpk.cfr_renamed_9401(((sprubi)arg0).getEncoded());
        if (spryye2 instanceof sprkhk) {
            return new sprlnj((sprkhk)spryye2);
        }
        throw new InvalidKeySpecException(sprgkj.cfr_renamed_9("z1p/5\u0012F\t51`#y(va~$la|25/z55\u0013F\u000051g(c a$5*p8"));
    }
}

