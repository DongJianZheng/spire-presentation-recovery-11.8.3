/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravz;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfpq;
import com.spire.presentation.packages.sprguh;
import com.spire.presentation.packages.spridm;
import com.spire.presentation.packages.sprkzh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnsh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproyj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprtuj;
import com.spire.presentation.packages.sprubi;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxjk;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class sprbyj
extends sprclj
implements sprcn {
    public sprqw cfr_renamed_3;
    public String cfr_renamed_4;

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_135)) {
            return new sproyj(this.cfr_renamed_4, arg0, this.cfr_renamed_3);
        }
        throw new IOException(new StringBuilder().insert(0, sprfpq.cfr_renamed_9("2$4'!!' >h:,6&'!5!6:s")).append(sprlem2).append(spravz.cfr_renamed_9("U7\u001b~\u001e;\f~\u001b1\u0001~\u0007;\u00161\u00120\u001c-\u0010:")).toString());
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if ((arg1.isAssignableFrom(KeySpec.class) || arg1.isAssignableFrom(ECPublicKeySpec.class)) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            sprrxh sprrxh2 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new ECPublicKeySpec(eCPublicKey.getW(), sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_2113()), sprrxh2));
        }
        if ((arg1.isAssignableFrom(KeySpec.class) || arg1.isAssignableFrom(ECPrivateKeySpec.class)) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            sprrxh sprrxh3 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new ECPrivateKeySpec(eCPrivateKey.getS(), sprnlj.cfr_renamed_9153(sprnlj.cfr_renamed_9052(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_2113()), sprrxh3));
        }
        if (arg1.isAssignableFrom(sprnsh.class) && arg0 instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey)arg0;
            if (eCPublicKey.getParams() != null) {
                return new sprnsh(sprnlj.cfr_renamed_9155(eCPublicKey.getParams(), eCPublicKey.getW()), sprnlj.cfr_renamed_9150(eCPublicKey.getParams()));
            }
            sprrxh sprrxh4 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new sprnsh(sprnlj.cfr_renamed_9155(eCPublicKey.getParams(), eCPublicKey.getW()), sprrxh4);
        }
        if (arg1.isAssignableFrom(sprguh.class) && arg0 instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey)arg0;
            if (eCPrivateKey.getParams() != null) {
                return new sprguh(eCPrivateKey.getS(), sprnlj.cfr_renamed_9150(eCPrivateKey.getParams()));
            }
            sprrxh sprrxh5 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            return new sprguh(eCPrivateKey.getS(), sprrxh5);
        }
        if (arg1.isAssignableFrom(sprkzh.class) && arg0 instanceof ECPublicKey) {
            if (arg0 instanceof sproyj) {
                sproyj sproyj2 = (sproyj)arg0;
                sprrxh sprrxh6 = sproyj2.cfr_renamed_284();
                try {
                    return new sprkzh(sprxjk.cfr_renamed_9398(new sprnzk(sproyj2.cfr_renamed_1604(), new sprqxk(sprrxh6.cfr_renamed_1769(), sprrxh6.cfr_renamed_1145(), sprrxh6.cfr_renamed_1146(), sprrxh6.cfr_renamed_1153(), sprrxh6.cfr_renamed_2113()))));
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprfpq.cfr_renamed_9("==)1$6h''s8!'7=0-s-=+<,:&4rs")).append(iOException.getMessage()).toString());
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, spravz.cfr_renamed_9("\u001c0\u0003?\u00197\u0011~\u001e;\f~\u0001'\u0005;O~")).append(arg0.getClass().getName()).toString());
        }
        if (arg1.isAssignableFrom(sprubi.class) && arg0 instanceof ECPrivateKey) {
            if (arg0 instanceof sprtuj) {
                try {
                    return new sprubi(sprcom.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_1229().cfr_renamed_119().cfr_renamed_91());
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprfpq.cfr_renamed_9("+2&=''h6&0'7-7h8-*rs")).append(iOException.getMessage()).toString());
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, spravz.cfr_renamed_9("\u001c0\u0003?\u00197\u0011~\u001e;\f~\u0001'\u0005;O~")).append(arg0.getClass().getName()).toString());
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprguh) {
            return new sprtuj(this.cfr_renamed_4, (sprguh)arg0, this.cfr_renamed_3);
        }
        if (arg0 instanceof ECPrivateKeySpec) {
            return new sprtuj(this.cfr_renamed_4, (ECPrivateKeySpec)arg0, this.cfr_renamed_3);
        }
        if (arg0 instanceof sprubi) {
            spridm spridm2 = spridm.cfr_renamed_23(((sprubi)arg0).getEncoded());
            try {
                return new sprtuj(this.cfr_renamed_4, new sprcom(new sprddm(sprbr.cfr_renamed_135, spridm2.cfr_renamed_9439()), spridm2), this.cfr_renamed_3);
            }
            catch (IOException iOException) {
                throw new InvalidKeySpecException(new StringBuilder().insert(0, sprfpq.cfr_renamed_9("*2,s-=+<,:&4rs")).append(iOException.getMessage()).toString());
            }
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprlem2.cfr_renamed_5078(sprbr.cfr_renamed_135)) {
            return new sprtuj(this.cfr_renamed_4, arg0, this.cfr_renamed_3);
        }
        throw new IOException(new StringBuilder().insert(0, spravz.cfr_renamed_9("?\u00199\u001a,\u001c*\u001d3U7\u0011;\u001b*\u001c8\u001c;\u0007~")).append(sprlem2).append(sprfpq.cfr_renamed_9("h:&s#61s&<<s:6+</=! -7")).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprbyj(String string, sprqw sprqw2) {
        void arg0;
        sprbyj sprbyj2 = this;
        sprbyj2.cfr_renamed_4 = arg0;
        sprbyj2.cfr_renamed_3 = sprqw2;
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof ECPublicKey) {
            return new sproyj((ECPublicKey)arg0, this.cfr_renamed_3);
        }
        if (arg0 instanceof ECPrivateKey) {
            return new sprtuj((ECPrivateKey)arg0, this.cfr_renamed_3);
        }
        throw new InvalidKeyException(spravz.cfr_renamed_9("\u001e;\f~\u0001'\u0005;U+\u001b5\u001b1\u00020"));
    }

    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        block7: {
            block6: {
                try {
                    if (!(arg0 instanceof sprnsh)) break block6;
                    return new sproyj(this.cfr_renamed_4, (sprnsh)arg0, this.cfr_renamed_3);
                }
                catch (Exception exception) {
                    throw new InvalidKeySpecException(new StringBuilder().insert(0, spravz.cfr_renamed_9("7\u001b(\u00142\u001c:U\u0015\u0010'&.\u0010=O~")).append(exception.getMessage()).toString(), exception);
                }
            }
            if (!(arg0 instanceof ECPublicKeySpec)) break block7;
            return new sproyj(this.cfr_renamed_4, (ECPublicKeySpec)arg0, this.cfr_renamed_3);
        }
        if (arg0 instanceof sprkzh) {
            spryye spryye2 = sprxjk.cfr_renamed_9400(((sprkzh)arg0).getEncoded());
            if (spryye2 instanceof sprnzk) {
                sprqxk sprqxk2 = ((sprnzk)spryye2).cfr_renamed_284();
                return this.engineGeneratePublic(new sprnsh(((sprnzk)spryye2).cfr_renamed_1604(), new sprrxh(sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_1145(), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153(), sprqxk2.cfr_renamed_2113())));
            }
            throw new IllegalArgumentException(sprfpq.cfr_renamed_9("'#-=;  s#61s! h=''h6+s8&*?!0h8-*"));
        }
        return super.engineGeneratePublic(arg0);
    }
}

