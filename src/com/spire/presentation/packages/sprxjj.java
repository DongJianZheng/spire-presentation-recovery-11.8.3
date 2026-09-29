/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprctk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdq;
import com.spire.presentation.packages.sprgsj;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlzk;
import com.spire.presentation.packages.sprmhk;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnkj;
import com.spire.presentation.packages.sprpyk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvsk;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprwhja;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.spryyk;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class sprxjj
extends sprcqj {
    private SecureRandom cfr_renamed_102;
    private spryye cfr_renamed_93;
    private spryye cfr_renamed_86;
    private int cfr_renamed_152;
    private ByteArrayOutputStream cfr_renamed_112;
    private final sprrr cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private AlgorithmParameters cfr_renamed_1;
    private sprvsk cfr_renamed_3;
    private sprcsh cfr_renamed_4;

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprdq) {
            String string = ((sprdq)arg0).getAlgorithm();
            if ("X25519".equalsIgnoreCase(string)) {
                return 256;
            }
            if ("X448".equalsIgnoreCase(string)) {
                return 448;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("_@A@EYD\u000erjb\u000eAKS\u000eKBMAXG^FG\u000e")).append(string).toString());
        }
        throw new IllegalArgumentException(sprufba.cfr_renamed_9("l)vfc(\"\u001eF\u000e\"-g?"));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int n, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        void arg3;
        sprxjj sprxjj2;
        void arg1;
        void arg0;
        void arg2;
        this.cfr_renamed_86 = null;
        if (!(algorithmParameterSpec instanceof sprcsh)) {
            throw new InvalidAlgorithmParameterException(sprwhja.cfr_renamed_9("C_]^\u000eHK\n^K]YKN\u000ecky\u000eZOXOGK^KX]"));
        }
        this.cfr_renamed_4 = (sprcsh)arg2;
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_596();
        if (this.cfr_renamed_152 != 0 && (byArray == null || byArray.length != this.cfr_renamed_152)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprufba.cfr_renamed_9("L\tL\u0005Gfk(\"\u000fG\u0015\"\u0016c4c+g2g4qfl#g\"qfv)\"$gf")).append(this.cfr_renamed_152).append(sprwhja.cfr_renamed_9("\u000eHW^KY\u000eFADI")).toString());
        }
        if (arg0 == true || arg0 == 3) {
            if (!(arg1 instanceof PublicKey)) throw new InvalidKeyException(sprufba.cfr_renamed_9("o3q2\"$gfr'q5g\"\"4g%k6k#l2%5\"6w$n/afZ\u0002Jfi#{fd)pfg(a4{6v/m("));
            this.cfr_renamed_93 = sprnkj.cfr_renamed_1216((PublicKey)arg1);
            sprxjj2 = this;
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprufba.cfr_renamed_9("o3q2\"$gfr'q5g\"\"\u001eF\u000e\"-g?"));
            if (!(arg1 instanceof PrivateKey)) throw new InvalidKeyException(sprwhja.cfr_renamed_9("C_]^\u000eHK\n^K]YKN\u000eXKIGZGO@^\tY\u000eZ\\CXKZO\u000erjb\u000eAKS\u000eLAX\u000eNKI\\S^^GE@"));
            this.cfr_renamed_93 = sprnkj.cfr_renamed_1220((PrivateKey)arg1);
            sprxjj2 = this;
        }
        sprxjj2.cfr_renamed_102 = arg3;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_112.reset();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprxjj sprxjj2;
        if (this.cfr_renamed_1 == null && this.cfr_renamed_4 != null) {
            try {
                sprxjj sprxjj3 = this;
                sprxjj3.cfr_renamed_1 = sprxjj3.cfr_renamed_119.cfr_renamed_1540(sprwhja.cfr_renamed_9("go}"));
                sprxjj3.cfr_renamed_1.init(this.cfr_renamed_4);
                sprxjj2 = this;
                return sprxjj2.cfr_renamed_1;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprxjj2 = this;
        return sprxjj2.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_112.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprxjj(sprvsk sprvsk2, int n) {
        void arg0;
        sprxjj sprxjj2 = this;
        sprxjj sprxjj3 = this;
        sprxjj sprxjj4 = this;
        sprxjj sprxjj5 = this;
        sprxjj sprxjj6 = this;
        sprxjj5.cfr_renamed_119 = new sprdki();
        sprxjj5.cfr_renamed_91 = -1;
        sprxjj5.cfr_renamed_112 = new ByteArrayOutputStream();
        sprxjj4.cfr_renamed_1 = null;
        sprxjj4.cfr_renamed_4 = null;
        sprxjj3.cfr_renamed_0 = false;
        sprxjj3.cfr_renamed_86 = null;
        sprxjj2.cfr_renamed_3 = arg0;
        sprxjj2.cfr_renamed_152 = n;
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_596();
        }
        return null;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprufba.cfr_renamed_9("L\tL\u0003"))) {
            this.cfr_renamed_0 = false;
            return;
        }
        if (string.equals(sprwhja.cfr_renamed_9("jboo}"))) {
            this.cfr_renamed_0 = true;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprufba.cfr_renamed_9("%c(%2\"5w6r)p2\"+m\"gf")).append(arg0).toString());
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_3.cfr_renamed_2471() != null) {
            return this.cfr_renamed_3.cfr_renamed_2471().cfr_renamed_1195();
        }
        return 0;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        sprxjj sprxjj2;
        int n;
        int n2;
        sprxjj sprxjj3;
        if (this.cfr_renamed_93 == null) {
            throw new IllegalStateException(sprwhja.cfr_renamed_9("IGZFO\\\n@EZ\nGDG^GKBC]OJ"));
        }
        sprxjj sprxjj4 = this;
        int n3 = sprxjj4.cfr_renamed_3.cfr_renamed_1472().cfr_renamed_2404();
        if (sprxjj4.cfr_renamed_86 == null) {
            sprgxh sprgxh2 = ((sprmuk)this.cfr_renamed_93).cfr_renamed_284().cfr_renamed_1769();
            sprxjj3 = this;
            int n4 = (sprgxh2.cfr_renamed_1938() + 7) / 8;
            n2 = 2 * n4;
        } else {
            n2 = 0;
            sprxjj3 = this;
        }
        int n5 = sprxjj3.cfr_renamed_112.size() + arg0;
        if (this.cfr_renamed_3.cfr_renamed_2471() == null) {
            n = n5;
            sprxjj2 = this;
        } else if (this.cfr_renamed_91 == 1 || this.cfr_renamed_91 == 3) {
            sprxjj sprxjj5 = this;
            sprxjj2 = sprxjj5;
            n = sprxjj5.cfr_renamed_3.cfr_renamed_2471().cfr_renamed_1202(n5);
        } else if (this.cfr_renamed_91 == 2 || this.cfr_renamed_91 == 4) {
            sprxjj sprxjj6 = this;
            sprxjj2 = sprxjj6;
            n = sprxjj6.cfr_renamed_3.cfr_renamed_2471().cfr_renamed_1202(n5 - n3 - n2);
        } else {
            throw new IllegalStateException(sprufba.cfr_renamed_9("a/r.g4\"(m2\"/l/v/c*k5g\""));
        }
        if (sprxjj2.cfr_renamed_91 == 1 || this.cfr_renamed_91 == 3) {
            return n3 + n2 + n;
        }
        if (this.cfr_renamed_91 == 2 || this.cfr_renamed_91 == 4) {
            return n;
        }
        throw new IllegalStateException(sprwhja.cfr_renamed_9("IGZFO\\\n@EZ\nGDG^GKBC]OJ"));
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprufba.cfr_renamed_9("\bM\u0016C\u0002F\u000fL\u0001"))) {
            return;
        }
        if (!string.equals(sprwhja.cfr_renamed_9("zei}\u001f~kjngdi"))) {
            if (string.equals(sprufba.cfr_renamed_9("R\rA\u00155\u0016C\u0002F\u000fL\u0001"))) {
                return;
            }
            throw new NoSuchPaddingException(sprwhja.cfr_renamed_9("ZONJC@M\u000eDA^\u000eKXKGFOHBO\u000e]G^F\ngo}iGZFO\\"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_112.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprxjj sprxjj2;
        sprcsh sprcsh2 = null;
        if (arg2 != null) {
            try {
                sprcsh2 = arg2.getParameterSpec(sprcsh.class);
                sprxjj2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprufba.cfr_renamed_9("%c(l)vfp#a)e(k5gfr'p'o#v#p58f")).append(exception.toString()).toString());
            }
        } else {
            sprxjj2 = this;
        }
        sprxjj2.cfr_renamed_1 = arg2;
        this.engineInit(arg0, arg1, sprcsh2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprxjj(sprvsk sprvsk2) {
        void arg0;
        sprxjj sprxjj2 = this;
        sprxjj sprxjj3 = this;
        sprxjj sprxjj4 = this;
        sprxjj sprxjj5 = this;
        sprxjj sprxjj6 = this;
        sprxjj5.cfr_renamed_119 = new sprdki();
        sprxjj5.cfr_renamed_91 = -1;
        sprxjj5.cfr_renamed_112 = new ByteArrayOutputStream();
        sprxjj4.cfr_renamed_1 = null;
        sprxjj4.cfr_renamed_4 = null;
        sprxjj3.cfr_renamed_0 = false;
        sprxjj3.cfr_renamed_86 = null;
        sprxjj2.cfr_renamed_3 = arg0;
        sprxjj2.cfr_renamed_152 = 0;
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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("MK@DA^\u000eBODJFK\n]_^ZBCKN\u000eZOXOGK^KX\u000eY^OM\u0010\u000e")).append(invalidAlgorithmParameterException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        int n;
        if (arg2 != 0) {
            this.cfr_renamed_112.write(arg0, arg1, arg2);
        }
        sprxjj sprxjj2 = this;
        byte[] byArray = sprxjj2.cfr_renamed_112.toByteArray();
        sprxjj2.cfr_renamed_112.reset();
        sprbj sprbj2 = new sprctk(this.cfr_renamed_4.cfr_renamed_2097(), this.cfr_renamed_4.cfr_renamed_2099(), this.cfr_renamed_4.cfr_renamed_2100(), this.cfr_renamed_4.cfr_renamed_2098());
        if (sprxjj2.cfr_renamed_4.cfr_renamed_596() != null) {
            sprbj2 = new sprkpk(sprbj2, this.cfr_renamed_4.cfr_renamed_596());
        }
        if (this.cfr_renamed_86 != null) {
            try {
                sprxjj sprxjj3;
                if (this.cfr_renamed_91 != 1 && this.cfr_renamed_91 != 3) {
                    sprxjj sprxjj4 = this;
                    sprxjj3 = sprxjj4;
                    sprxjj sprxjj5 = this;
                    sprxjj4.cfr_renamed_3.cfr_renamed_9427(false, sprxjj5.cfr_renamed_93, sprxjj5.cfr_renamed_86, sprbj2);
                    return sprxjj3.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
                }
                sprxjj sprxjj6 = this;
                sprxjj3 = sprxjj6;
                sprxjj sprxjj7 = this;
                sprxjj6.cfr_renamed_3.cfr_renamed_9427(true, sprxjj7.cfr_renamed_86, sprxjj7.cfr_renamed_93, sprbj2);
                return sprxjj3.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new sprazh(sprufba.cfr_renamed_9("3l'`*gfv)\"6p)a#q5\"$n)a-"), exception);
            }
        }
        boolean bl = this.cfr_renamed_93 instanceof sprwgk || this.cfr_renamed_93 instanceof spruek;
        int n2 = n = bl ? 256 : 448;
        if (this.cfr_renamed_91 == 1 || this.cfr_renamed_91 == 3) {
            sprii sprii2 = bl ? new sprlzk() : new spryyk();
            sprii2.cfr_renamed_5536(new sprgye(this.cfr_renamed_102, n));
            sprpyk sprpyk2 = new sprpyk(sprii2, new sprgsj(this, bl));
            try {
                sprxjj sprxjj8 = this;
                sprxjj8.cfr_renamed_3.cfr_renamed_9428(sprxjj8.cfr_renamed_93, sprbj2, sprpyk2);
                return sprxjj8.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new sprazh(sprwhja.cfr_renamed_9("[DOHBO\u000e^A\n^XAIKY]\nLFAIE"), exception);
            }
        }
        if (this.cfr_renamed_91 != 2) {
            if (this.cfr_renamed_91 != 4) throw new IllegalStateException(sprwhja.cfr_renamed_9("IGZFO\\\n@EZ\nGDG^GKBC]OJ"));
        }
        try {
            sprxjj sprxjj9 = this;
            sprxjj9.cfr_renamed_3.cfr_renamed_9429(sprxjj9.cfr_renamed_93, sprbj2, new sprmhk(bl));
            return sprxjj9.cfr_renamed_3.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprull sprull2) {
            throw new sprazh(sprufba.cfr_renamed_9("3l'`*gfv)\"6p)a#q5\"$n)a-"), sprull2);
        }
    }
}

