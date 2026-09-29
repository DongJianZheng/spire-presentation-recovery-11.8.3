/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprjry;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnhm;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprqw;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsdz;
import com.spire.presentation.packages.sprxvh;
import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class sprpzj
extends AlgorithmParametersSpi {
    private String cfr_renamed_3;
    private ECParameterSpec cfr_renamed_4;

    @Override
    public String engineToString() {
        return sprjry.cfr_renamed_9("$]AN\u0000l\u0000s\u0004j\u0004l\u0012");
    }

    @Override
    public byte[] engineGetEncoded(String arg0) throws IOException {
        if (this.cfr_renamed_2396(arg0)) {
            sprcgm sprcgm2;
            if (this.cfr_renamed_4 == null) {
                sprcgm sprcgm3;
                sprcgm2 = sprcgm3 = new sprcgm(sprpen.cfr_renamed_4);
            } else if (this.cfr_renamed_3 != null) {
                sprcgm sprcgm4;
                sprcgm2 = sprcgm4 = new sprcgm(sprqpj.cfr_renamed_2326(this.cfr_renamed_3));
            } else {
                sprcgm sprcgm5;
                sprrxh sprrxh2 = sprnlj.cfr_renamed_9150(this.cfr_renamed_4);
                sprhfm sprhfm2 = new sprhfm(sprrxh2.cfr_renamed_1769(), new sprfim(sprrxh2.cfr_renamed_1145(), false), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153(), sprrxh2.cfr_renamed_2113());
                sprcgm2 = sprcgm5 = new sprcgm(sprhfm2);
            }
            return sprcgm2.cfr_renamed_91();
        }
        throw new IOException(new StringBuilder().insert(0, sprsdz.cfr_renamed_9("R\u000fl\u000fh\u0016iAw\u0000u\u0000j\u0004s\u0004u\u0012'\u0007h\u0013j\u0000sAn\u000f' k\u0006h\u0013n\u0015o\fW\u0000u\u0000j\u0004s\u0004u\u0012'\u000ee\u000bb\u0002s['")).append(arg0).toString());
    }

    public boolean cfr_renamed_2396(String arg0) {
        return arg0 == null || arg0.equals("ASN.1");
    }

    @Override
    public void engineInit(byte[] arg0) throws IOException {
        this.engineInit(arg0, "ASN.1");
    }

    @Override
    public byte[] engineGetEncoded() throws IOException {
        return this.engineGetEncoded("ASN.1");
    }

    @Override
    public void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
        if (arg0 instanceof ECGenParameterSpec) {
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec)arg0;
            sprqw sprqw2 = sprsci.cfr_renamed_105;
            sprhfm sprhfm2 = sprdbk.cfr_renamed_9440(eCGenParameterSpec, sprqw2);
            if (null == sprhfm2) {
                throw new InvalidParameterSpecException(new StringBuilder().insert(0, sprjry.cfr_renamed_9("[\">\u0002k\u0013h\u0004>\u000f\u007f\f{Ap\u000ejAl\u0004}\u000ey\u000fw\u001b{\u0005$A")).append(eCGenParameterSpec.getName()).toString());
            }
            this.cfr_renamed_3 = eCGenParameterSpec.getName();
            ECParameterSpec eCParameterSpec = sprnlj.cfr_renamed_9386(sprhfm2);
            sprpzj sprpzj2 = this;
            this.cfr_renamed_4 = new sprxvh(this.cfr_renamed_3, eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()));
            return;
        }
        if (arg0 instanceof ECParameterSpec) {
            sprpzj sprpzj3;
            if (arg0 instanceof sprxvh) {
                this.cfr_renamed_3 = ((sprxvh)arg0).cfr_renamed_313();
                sprpzj3 = this;
            } else {
                sprpzj3 = this;
                this.cfr_renamed_3 = null;
            }
            sprpzj3.cfr_renamed_4 = (ECParameterSpec)arg0;
            return;
        }
        throw new InvalidParameterSpecException(new StringBuilder().insert(0, sprsdz.cfr_renamed_9("F\r`\u000eu\bs\tj1f\u0013f\fb\u0015b\u0013T\u0011b\u0002'\u0002k\u0000t\u0012'\u000fh\u0015'\u0013b\u0002h\u0006i\b}\u0004c['")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public void engineInit(byte[] arg0, String arg1) throws IOException {
        if (this.cfr_renamed_2396(arg1)) {
            sprcgm sprcgm2 = sprcgm.cfr_renamed_23(arg0);
            sprgxh sprgxh2 = sprnlj.cfr_renamed_9384(sprsci.cfr_renamed_105, sprcgm2);
            if (sprcgm2.cfr_renamed_2317()) {
                sprlem sprlem2 = sprlem.cfr_renamed_23(sprcgm2.cfr_renamed_284());
                this.cfr_renamed_3 = sprnhm.cfr_renamed_7555(sprlem2);
                if (this.cfr_renamed_3 == null) {
                    this.cfr_renamed_3 = sprlem2.cfr_renamed_19();
                }
            }
            this.cfr_renamed_4 = sprnlj.cfr_renamed_9385(sprcgm2, sprgxh2);
            return;
        }
        throw new IOException(new StringBuilder().insert(0, sprjry.cfr_renamed_9("4p\np\u000ei\u000f>\u0004p\u0002q\u0005{\u0005>\u0011\u007f\u0013\u007f\f{\u0015{\u0013mAx\u000el\f\u007f\u0015>\bpA_\ry\u000el\bj\ts1\u007f\u0013\u007f\f{\u0015{\u0013mAq\u0003t\u0004}\u0015$A")).append(arg1).toString());
    }

    @Override
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> arg0) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(arg0) || arg0 == AlgorithmParameterSpec.class) {
            return (T)this.cfr_renamed_4;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(arg0)) {
            if (this.cfr_renamed_3 != null) {
                sprlem sprlem2 = sprqpj.cfr_renamed_2326(this.cfr_renamed_3);
                if (sprlem2 != null) {
                    return (T)new ECGenParameterSpec(sprlem2.cfr_renamed_19());
                }
                return (T)new ECGenParameterSpec(this.cfr_renamed_3);
            }
            sprlem sprlem3 = sprqpj.cfr_renamed_9381(sprnlj.cfr_renamed_9150(this.cfr_renamed_4));
            if (sprlem3 != null) {
                return (T)new ECGenParameterSpec(sprlem3.cfr_renamed_19());
            }
        }
        throw new InvalidParameterSpecException(new StringBuilder().insert(0, sprsdz.cfr_renamed_9("B\"' k\u0006h\u0013n\u0015o\fW\u0000u\u0000j\u0004s\u0004u\u0012'\u0002f\u000fi\u000esAd\u000ei\u0017b\u0013sAs\u000e'")).append(arg0.getName()).toString());
    }
}

