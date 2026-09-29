/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdi;
import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcjj;
import com.spire.presentation.packages.sprclj;
import com.spire.presentation.packages.sprcn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprkzh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprmpk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprqx;
import com.spire.presentation.packages.sprrnj;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprubi;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvs;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprwpj;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjk;
import com.spire.presentation.packages.sprxkj;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;

public class sprnoj
extends sprclj
implements sprcn {
    public static final byte[] cfr_renamed_93;
    private static final byte cfr_renamed_86 = 111;
    private static final byte cfr_renamed_152 = 110;
    public static final byte[] cfr_renamed_112;
    public static final byte[] cfr_renamed_119;
    public static final byte[] cfr_renamed_91;
    private static final byte cfr_renamed_0 = 112;
    private static final byte cfr_renamed_1 = 113;
    public String cfr_renamed_2;
    private final boolean cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public KeySpec engineGetKeySpec(Key arg0, Class arg1) throws InvalidKeySpecException {
        if (arg1.isAssignableFrom(sprubi.class) && arg0 instanceof sprcjj) {
            try {
                sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.getEncoded());
                sproug sproug2 = sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(2));
                byte[] byArray = sproug.cfr_renamed_23(sprxgf.cfr_renamed_184(sproug2.cfr_renamed_186())).cfr_renamed_186();
                return new sprubi(sprmpk.cfr_renamed_9399(new sprbyk(byArray)));
            }
            catch (IOException iOException) {
                throw new InvalidKeySpecException(iOException.getMessage(), iOException.getCause());
            }
        }
        if (arg1.isAssignableFrom(sprkzh.class) && arg0 instanceof sprxkj) {
            try {
                byte[] byArray = arg0.getEncoded();
                if (!sproze.cfr_renamed_5135(cfr_renamed_112, 0, cfr_renamed_112.length, byArray, 0, byArray.length - 32)) {
                    throw new InvalidKeySpecException(sprbuy.cfr_renamed_9("H\u001cw\u0013m\u001beRD\u00163G4C8Rq\u0007c\u001eh\u0011!\u0019d\u000b!\u0017o\u0011n\u0016h\u001cf"));
                }
                sprnuk sprnuk2 = new sprnuk(byArray, cfr_renamed_112.length);
                return new sprkzh(sprxjk.cfr_renamed_9398(sprnuk2));
            }
            catch (IOException iOException) {
                throw new InvalidKeySpecException(iOException.getMessage(), iOException.getCause());
            }
        }
        if (arg1.isAssignableFrom(sprbdi.class)) {
            if (arg0 instanceof sprvs) {
                return new sprbdi(((sprvs)arg0).cfr_renamed_9424());
            }
            if (arg0 instanceof sprqx) {
                return new sprbdi(((sprqx)arg0).cfr_renamed_9425());
            }
        }
        return super.engineGetKeySpec(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnoj(String string, boolean bl, int n) {
        void arg1;
        void arg0;
        sprnoj sprnoj2 = this;
        this.cfr_renamed_2 = arg0;
        sprnoj2.cfr_renamed_3 = arg1;
        sprnoj2.cfr_renamed_4 = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public PublicKey engineGeneratePublic(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof X509EncodedKeySpec) {
            byte[] byArray;
            byte[] byArray2 = ((X509EncodedKeySpec)arg0).getEncoded();
            if (this.cfr_renamed_4 != 0 && this.cfr_renamed_4 != byArray2[8]) return super.engineGeneratePublic(arg0);
            if (byArray2[9] == 5 && byArray2[10] == 0) {
                sprvhm sprvhm2 = sprvhm.cfr_renamed_23(byArray2);
                sprvhm2 = new sprvhm(new sprddm(sprvhm2.cfr_renamed_593().cfr_renamed_593()), sprvhm2.cfr_renamed_2314().cfr_renamed_81());
                try {
                    byArray = byArray2 = sprvhm2.cfr_renamed_104("DER");
                }
                catch (IOException iOException) {
                    throw new InvalidKeySpecException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("\u001c(\t9\u0010,\t|\t3].\u0018?\u00122\u000e(\u000f)\u001e(]7\u0018%]:\u001c5\u00119\u0019f]")).append(iOException.getMessage()).toString());
                }
            } else {
                byArray = byArray2;
            }
            switch (byArray[8]) {
                case 111: {
                    return new sprwpj(cfr_renamed_119, byArray2);
                }
                case 110: {
                    return new sprwpj(cfr_renamed_93, byArray2);
                }
                case 113: {
                    return new sprxkj(cfr_renamed_91, byArray2);
                }
                case 112: {
                    return new sprxkj(cfr_renamed_112, byArray2);
                }
            }
            return super.engineGeneratePublic(arg0);
        } else {
            if (arg0 instanceof sprbdi) {
                byte[] byArray = ((sprbdi)arg0).getEncoded();
                switch (this.cfr_renamed_4) {
                    case 111: {
                        return new sprwpj(new sprlnk(byArray));
                    }
                    case 110: {
                        return new sprwpj(new sprwgk(byArray));
                    }
                    case 113: {
                        return new sprxkj(new sprpxk(byArray));
                    }
                    case 112: {
                        return new sprxkj(new sprnuk(byArray));
                    }
                }
                throw new InvalidKeySpecException(sprbuy.cfr_renamed_9("\u0014`\u0011u\u001ds\u000b!\u001cn\u0006!\u0013!\u0001q\u0017b\u001bg\u001bbRu\u000bq\u0017-Rb\u0013o\u001cn\u0006!\u0000d\u0011n\u0015o\u001br\u0017!\u0000`\u0005!\u0017o\u0011n\u0016h\u001cf"));
            }
            if (!(arg0 instanceof sprkzh)) return super.engineGeneratePublic(arg0);
            spryye spryye2 = sprxjk.cfr_renamed_9400(((sprkzh)arg0).getEncoded());
            if (!(spryye2 instanceof sprnuk)) throw new IllegalStateException(sprhky.cfr_renamed_9("\u0012,\u00182\u000e/\u0015|\r)\u001f0\u0014?]7\u0018%]2\u0012(]\u0019\u0019nHiLe],\b>\u00115\u001e|\u00169\u0004"));
            return new sprxkj(new byte[0], ((sprnuk)spryye2).cfr_renamed_91());
        }
    }

    @Override
    public PublicKey cfr_renamed_3215(sprvhm arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_593().cfr_renamed_593();
        if (this.cfr_renamed_3) {
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 111) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_4)) {
                return new sprwpj(arg0);
            }
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 110) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_3)) {
                return new sprwpj(arg0);
            }
        } else if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_2) || sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 113) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_2)) {
                return new sprxkj(arg0);
            }
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 112) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
                return new sprxkj(arg0);
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("`\u001ef\u001ds\u001bu\u001alRh\u0016d\u001cu\u001bg\u001bd\u0000!")).append(sprlem2).append(sprhky.cfr_renamed_9("|\u00142]7\u0018%]2\u0012(].\u0018?\u0012;\u00135\u00079\u0019")).toString());
    }

    @Override
    public Key engineTranslateKey(Key arg0) throws InvalidKeyException {
        throw new InvalidKeyException(sprbuy.cfr_renamed_9("\u0019d\u000b!\u0006x\u0002dRt\u001cj\u001cn\u0005o"));
    }

    @Override
    public PrivateKey engineGeneratePrivate(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof sprubi) {
            spryye spryye2 = sprmpk.cfr_renamed_9401(((sprubi)arg0).getEncoded());
            if (spryye2 instanceof sprbyk) {
                return new sprcjj((sprbyk)spryye2);
            }
            throw new IllegalStateException(sprhky.cfr_renamed_9("\u0012,\u00182\u000e/\u0015|\r.\u0014*\u001c(\u0018|\u00169\u0004|\u00133\t|88OiHmD|\r.\u0014*\u001c(\u0018|\u00169\u0004"));
        }
        return super.engineGeneratePrivate(arg0);
    }

    static {
        cfr_renamed_119 = sprfqe.cfr_renamed_488(sprbuy.cfr_renamed_9("A1F3A1B4B7B2@cD4DgB2A8B1"));
        cfr_renamed_93 = sprfqe.cfr_renamed_488(sprhky.cfr_renamed_9("oMn\u001coMlHlKlNn\u001fjHj\u0018lNnLlM"));
        cfr_renamed_91 = sprfqe.cfr_renamed_488(sprbuy.cfr_renamed_9("A1F2A1B4B7B2@cD4E0B2A`B1"));
        cfr_renamed_112 = sprfqe.cfr_renamed_488(sprhky.cfr_renamed_9("oMn\u001coMlHlKlNn\u001fjHkMlNnLlM"));
    }

    @Override
    public PrivateKey cfr_renamed_5653(sprcom arg0) throws IOException {
        sprlem sprlem2 = arg0.cfr_renamed_1254().cfr_renamed_593();
        if (this.cfr_renamed_3) {
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 111) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_4)) {
                return new sprrnj(arg0);
            }
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 110) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_3)) {
                return new sprrnj(arg0);
            }
        } else if (sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_2) || sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 113) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_2)) {
                return new sprcjj(arg0);
            }
            if ((this.cfr_renamed_4 == 0 || this.cfr_renamed_4 == 112) && sprlem2.cfr_renamed_5078(sprtu.cfr_renamed_0)) {
                return new sprcjj(arg0);
            }
        }
        throw new IOException(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("`\u001ef\u001ds\u001bu\u001alRh\u0016d\u001cu\u001bg\u001bd\u0000!")).append(sprlem2).append(sprhky.cfr_renamed_9("|\u00142]7\u0018%]2\u0012(].\u0018?\u0012;\u00135\u00079\u0019")).toString());
    }
}

