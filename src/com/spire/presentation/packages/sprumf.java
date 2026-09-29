/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartTextArea;
import com.spire.presentation.packages.sprbag;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprmyf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqye;
import com.spire.presentation.packages.sprsbi;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprwnf;
import com.spire.presentation.packages.sprwpf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprumf
extends CipherSpi {
    private final String cfr_renamed_91;
    private AlgorithmParameters cfr_renamed_0;
    private sprwnf cfr_renamed_1;
    private sprsbi cfr_renamed_2;
    private sprbag cfr_renamed_3;
    private sprwpf cfr_renamed_4;

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(sprhah.cfr_renamed_9(")?\u0013p\u0014%\u0017 \b\"\u00135\u0003p\u000e>G1G'\u00151\u0017 \u000e>\u0000p\n?\u00035"));
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        if (arg2 != 3) {
            throw new InvalidKeyException(ChartTextArea.cfr_renamed_9("\u0014l\u0017{[Q>A)G/]0G\"\"\bw\u000br\u0014p\u000fg\u001f"));
        }
        try {
            sprmyf sprmyf2;
            sprmyf sprmyf3 = sprmyf2 = new sprmyf(this.cfr_renamed_4.cfr_renamed_5650());
            byte[] byArray = sprmyf3.cfr_renamed_5685(sproze.cfr_renamed_533(arg0, 0, sprmyf3.cfr_renamed_5687()));
            spryy spryy2 = sprqye.cfr_renamed_5665(this.cfr_renamed_2.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(byArray);
            sproze.cfr_renamed_3408(byArray);
            spryy2.cfr_renamed_5535(false, sprtpk2);
            byte[] byArray2 = sproze.cfr_renamed_533(arg0, sprmyf2.cfr_renamed_5687(), arg0.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(spryy2.cfr_renamed_1579(byArray2, 0, byArray2.length), arg1);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            return secretKeySpec;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhah.cfr_renamed_9("\u0012>\u00062\u000b5G$\bp\u0002(\u0013\"\u00063\u0013p,\u00044p\u00145\u0004\"\u0002$]p")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("w\u0015c\u0019n\u001e\"\u000fm[g\u0003v\tc\u0018v[I/Q[q\u001ea\tg\u000f8[")).append(sprull2.getMessage()).toString());
        }
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new IllegalStateException(sprhah.cfr_renamed_9(")?\u0013p\u0014%\u0017 \b\"\u00135\u0003p\u000e>G1G'\u00151\u0017 \u000e>\u0000p\n?\u00035"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprumf sprumf2;
        if (this.cfr_renamed_0 != null) {
            sprumf2 = this;
            return sprumf2.cfr_renamed_0;
        }
        try {
            sprumf sprumf3 = this;
            sprumf3.cfr_renamed_0 = AlgorithmParameters.getInstance(sprumf3.cfr_renamed_91, "BCPQC");
            sprumf3.cfr_renamed_0.init(this.cfr_renamed_2);
            sprumf2 = this;
            return sprumf2.cfr_renamed_0;
        }
        catch (Exception exception) {
            throw sprvhf.cfr_renamed_5211(exception.toString(), exception);
        }
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int n;
        if (arg2 == null) {
            n = arg0;
            sprumf sprumf2 = this;
            sprumf2.cfr_renamed_2 = new sprsbi(ChartTextArea.cfr_renamed_9(":G(/0U+"));
        } else {
            if (!(arg2 instanceof sprsbi)) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, this.cfr_renamed_91).append(sprhah.cfr_renamed_9("p\u00041\tp\b>\u000b)G1\u00043\u0002 \u0013p,\u00044\u0000\u0006\"\u0006=\u0002$\u0002\"4 \u00023")).toString());
            }
            this.cfr_renamed_2 = (sprsbi)arg2;
            n = arg0;
        }
        if (n == 3) {
            if (arg1 instanceof sprwnf) {
                this.cfr_renamed_1 = (sprwnf)arg1;
                this.cfr_renamed_3 = new sprbag(sprybl.cfr_renamed_5688(arg3));
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("4l\u0017{[c[")).append(this.cfr_renamed_91).append(sprhah.cfr_renamed_9("G \u00122\u000b9\u0004p\f5\u001ep\u00041\tp\u00055G%\u00145\u0003p\u0001?\u0015p\u0010\"\u0006 \u00179\t7")).toString());
        }
        if (arg0 == 4) {
            if (arg1 instanceof sprwpf) {
                this.cfr_renamed_4 = (sprwpf)arg1;
                return;
            }
            throw new InvalidKeyException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("4l\u0017{[c[")).append(this.cfr_renamed_91).append(sprhah.cfr_renamed_9("p\u0017\"\u000e&\u0006$\u0002p\f5\u001ep\u00041\tp\u00055G%\u00145\u0003p\u0001?\u0015p\u0012>\u0010\"\u0006 \u00179\t7")).toString());
        }
        throw new InvalidParameterException(ChartTextArea.cfr_renamed_9("8k\u000bj\u001ep[m\u0015n\u0002\"\rc\u0017k\u001f\"\u001dm\t\"\fp\u001ar\u000bk\u0015eTw\u0015u\tc\u000br\u0012l\u001c"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        if (arg0.getEncoded() == null) {
            throw new InvalidKeyException(sprhah.cfr_renamed_9("\u0013\u0006>\t?\u0013p\u0010\"\u0006 G;\u0002)Kp\t%\u000b<G5\t3\b4\u000e>\u0000~"));
        }
        try {
            sprumf sprumf2 = this;
            sprki sprki2 = sprumf2.cfr_renamed_3.cfr_renamed_5686(sprumf2.cfr_renamed_1.cfr_renamed_5650());
            spryy spryy2 = sprqye.cfr_renamed_5665(sprumf2.cfr_renamed_2.cfr_renamed_5666());
            sprtpk sprtpk2 = new sprtpk(sprki2.cfr_renamed_3880());
            sprki sprki3 = sprki2;
            spryy2.cfr_renamed_5535(true, sprtpk2);
            byte[] byArray = sprki3.cfr_renamed_5684();
            sprki3.destroy();
            byte[] byArray2 = arg0.getEncoded();
            byte[] byArray3 = sproze.cfr_renamed_543(byArray, spryy2.cfr_renamed_1575(byArray2, 0, byArray2.length));
            sproze.cfr_renamed_3408(byArray2);
            return byArray3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("\u000el\u001a`\u0017g[v\u0014\"\u001cg\u0015g\tc\u000fg[I/Q[q\u001ea\tg\u000f8[")).append(illegalArgumentException.getMessage()).toString());
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalBlockSizeException(new StringBuilder().insert(0, sprhah.cfr_renamed_9("\u0012>\u00062\u000b5G$\bp\u00035\u0014$\u0015?\u001ep\u000e>\u00135\u00159\np\u00111\u000b%\u0002#]p")).append(destroyFailedException.getMessage()).toString());
        }
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    public sprumf(String string) throws NoSuchAlgorithmException {
        this.cfr_renamed_91 = string;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("R\u001af\u001fk\u0015e[")).append(arg0).append(sprhah.cfr_renamed_9("G%\t;\t?\u0010>")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprumf sprumf2;
        sprsbi sprsbi2 = null;
        if (arg2 != null) {
            try {
                sprsbi2 = arg2.getParameterSpec(sprsbi.class);
                sprumf2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, ChartTextArea.cfr_renamed_9("\u0018c\u0015%\u000f\"\u0013c\u0015f\u0017g[r\u001ap\u001ao\u001ev\u001ep[")).append(arg2.toString()).toString());
            }
        } else {
            sprumf2 = this;
        }
        sprumf2.engineInit(arg0, arg1, sprsbi2, arg3);
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhah.cfr_renamed_9("$1\t>\b$G#\u0012 \u0017?\u0015$G=\b4\u0002p")).append(arg0).toString());
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        throw new IllegalStateException(ChartTextArea.cfr_renamed_9("L\u0014v[q\u000er\u000bm\tv\u001ef[k\u0015\"\u001a\"\fp\u001ar\u000bk\u0015e[o\u0014f\u001e"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw sprvhf.cfr_renamed_5213(invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        }
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return 2048;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new IllegalStateException(sprhah.cfr_renamed_9(")?\u0013p\u0014%\u0017 \b\"\u00135\u0003p\u000e>G1G'\u00151\u0017 \u000e>\u0000p\n?\u00035"));
    }
}

