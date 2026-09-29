/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprgbk;
import com.spire.presentation.packages.sprhqba;
import com.spire.presentation.packages.sprkck;
import com.spire.presentation.packages.sprkzh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmpk;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprsbk;
import com.spire.presentation.packages.sprubi;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvtj;
import com.spire.presentation.packages.sprxjk;
import com.spire.presentation.packages.sprytk;
import com.spire.presentation.packages.sprywh;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class sprdvj
extends sprclj {
    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DSAPrivateKeySpec) {
            return new sprsbk((DSAPrivateKeySpec)arg0);
        }
        if (arg0 instanceof sprubi) {
            spryye spryye2 = sprmpk.cfr_renamed_9401(((sprubi)arg0).getEncoded());
            if (spryye2 instanceof sprusk) {
                return this.engineGeneratePrivate(new DSAPrivateKeySpec(((sprusk)spryye2).cfr_renamed_1980(), ((sprusk)spryye2).cfr_renamed_284().cfr_renamed_1155(), ((sprusk)spryye2).cfr_renamed_284().cfr_renamed_1604(), ((sprusk)spryye2).cfr_renamed_284().cfr_renamed_1145()));
            }
            throw new IllegalArgumentException(sprywh.cfr_renamed_9("(j\"t4i/:7h.l&n\":,\u007f>:.igt(ng~4{gj5s1{5\u007fgq\"c"));
        }
        return super.engineGeneratePrivate(arg0);
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        if (arg0 instanceof DSAPublicKey) {
            return new sprgbk((DSAPublicKey)arg0);
        }
        if (arg0 instanceof DSAPrivateKey) {
            return new sprsbk((DSAPrivateKey)arg0);
        }
        throw new InvalidKeyException(sprhqba.cfr_renamed_9("PZB\u001fOFKZ\u001bJUTUPLQ"));
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (sprkck.cfr_renamed_9449(sprlem2)) {
            return new sprgbk(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("{+}(h.n/wgs#\u007f)n.|.\u007f5:")).append(sprlem2).append(sprhqba.cfr_renamed_9("\u001bVU\u001fPZB\u001fUPO\u001fIZXP\\QRL^[")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof DSAPublicKeySpec) {
            try {
                return new sprgbk((DSAPublicKeySpec)arg0);
            }
            catch (Exception exception) {
                throw new sprvtj(this, sprywh.cfr_renamed_9("s)l&v.~gQ\"c\u0014j\"y}:") + exception.getMessage(), exception);
            }
        }
        if (!(arg0 instanceof sprkzh)) {
            return super.engineGeneratePublic(arg0);
        }
        spryye spryye2 = sprxjk.cfr_renamed_9400(((sprkzh)arg0).getEncoded());
        if (spryye2 instanceof sprytk) {
            return this.engineGeneratePublic(new DSAPublicKeySpec(((sprytk)spryye2).spr\u3181(), ((sprytk)spryye2).cfr_renamed_284().cfr_renamed_1155(), ((sprytk)spryye2).cfr_renamed_284().cfr_renamed_1604(), ((sprytk)spryye2).cfr_renamed_284().cfr_renamed_1145()));
        }
        throw new IllegalArgumentException(sprhqba.cfr_renamed_9("TO^QHLS\u001fKJYSR\\\u001bT^F\u001bVH\u001fUPO\u001f_LZ\u001fKJYSR\\\u001bT^F"));
    }

    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(DSAPublicKeySpec.class) && arg0 instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        }
        if (arg1.isAssignableFrom(DSAPrivateKeySpec.class) && arg0 instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        }
        if (arg1.isAssignableFrom(sprkzh.class) && arg0 instanceof DSAPublicKey) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey)arg0;
            try {
                return new sprkzh(sprxjk.cfr_renamed_9398(new sprytk(dSAPublicKey.getY(), new sprmqk(dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG()))));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("2t&x+\u007fgn(:7h(~2y\":\"t$u#s)}}:")).append(iOException.getMessage()).toString());
            }
        }
        if (arg1.isAssignableFrom(sprubi.class) && arg0 instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey)arg0;
            try {
                return new sprubi(sprmpk.cfr_renamed_9399(new sprusk(dSAPrivateKey.getX(), new sprmqk(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()))));
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprhqba.cfr_renamed_9("NQZ]WZ\u001bKT\u001fKMT[N\\^\u001f^QXP_VUX\u0001\u001f")).append(iOException.getMessage()).toString());
            }
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (sprkck.cfr_renamed_9449(sprlem2)) {
            return new sprsbk(arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprywh.cfr_renamed_9("{+}(h.n/wgs#\u007f)n.|.\u007f5:")).append(sprlem2).append(sprhqba.cfr_renamed_9("\u001bVU\u001fPZB\u001fUPO\u001fIZXP\\QRL^[")).toString());
    }
}

