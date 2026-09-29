/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprctk;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprjzj;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnn;
import com.spire.presentation.packages.sprpyk;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtik;
import com.spire.presentation.packages.sprucq;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvsk;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
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

public class sprhyj
extends sprcqj {
    private boolean cfr_renamed_93;
    private AlgorithmParameters cfr_renamed_86;
    private sprcsh cfr_renamed_152;
    private spryye cfr_renamed_112;
    private final sprrr cfr_renamed_119;
    private spryye cfr_renamed_91;
    private int cfr_renamed_0;
    private sprvsk cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private ByteArrayOutputStream cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int n, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        void arg3;
        sprhyj sprhyj2;
        void arg1;
        void arg0;
        void arg2;
        this.cfr_renamed_91 = null;
        if (!(algorithmParameterSpec instanceof sprcsh)) {
            throw new InvalidAlgorithmParameterException(sprucq.cfr_renamed_9("T)J(\u0019>\\|I=J/\\8\u0019\u0015|\u000f\u0019,X.X1\\(\\.J"));
        }
        this.cfr_renamed_152 = (sprcsh)arg2;
        byte[] byArray = this.cfr_renamed_152.cfr_renamed_596();
        if (this.cfr_renamed_0 != 0 && (byArray == null || byArray.length != this.cfr_renamed_0)) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("\u001e\u0004\u001e\b\u0015k9%p\u0002\u0015\u0018p\u001b191&5?59#k>.5/#k$$p)5k")).append(this.cfr_renamed_0).append(sprucq.cfr_renamed_9("\u0019>@(\\/\u00190V2^")).toString());
        }
        if (arg0 == true || arg0 == 3) {
            if (arg1 instanceof PublicKey) {
                this.cfr_renamed_112 = sprdbk.cfr_renamed_1216((PublicKey)arg1);
                sprhyj2 = this;
            } else {
                if (!(arg1 instanceof sprnn)) throw new InvalidKeyException(sprqzo.cfr_renamed_9("&%8$k2.p;18#.4k\".3\" \"5%$l#k >2'9(p\u000e\u0013k;.)k6$\"k5%39);$\"?%"));
                sprnn sprnn2 = (sprnn)arg1;
                sprhyj2 = this;
                this.cfr_renamed_112 = sprdbk.cfr_renamed_1216(sprnn2.cfr_renamed_1224());
                this.cfr_renamed_91 = sprdbk.cfr_renamed_1220(sprnn2.cfr_renamed_1225());
            }
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprqzo.cfr_renamed_9("&%8$k2.p;18#.4k\u0015\bp 52"));
            if (arg1 instanceof PrivateKey) {
                this.cfr_renamed_112 = sprdbk.cfr_renamed_1220((PrivateKey)arg1);
                sprhyj2 = this;
            } else {
                if (!(arg1 instanceof sprnn)) throw new InvalidKeyException(sprucq.cfr_renamed_9("1L/M|[9\u0019,X/J9]|K9Z5I5\\2M{J|I.P*X(\\||\u001f\u00197\\%\u0019:V.\u00198\\?K%I(P3W"));
                sprnn sprnn3 = (sprnn)arg1;
                sprhyj2 = this;
                this.cfr_renamed_91 = sprdbk.cfr_renamed_1216(sprnn3.cfr_renamed_1224());
                this.cfr_renamed_112 = sprdbk.cfr_renamed_1220(sprnn3.cfr_renamed_1225());
            }
        }
        sprhyj2.cfr_renamed_2 = arg3;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3.reset();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        sprqxk sprqxk2;
        sprbj sprbj2;
        byte[] byArray;
        block15: {
            sprqal sprqal2;
            block14: {
                if (arg2 != 0) {
                    this.cfr_renamed_3.write(arg0, arg1, arg2);
                }
                sprhyj sprhyj2 = this;
                byArray = sprhyj2.cfr_renamed_3.toByteArray();
                sprhyj2.cfr_renamed_3.reset();
                sprbj2 = new sprctk(this.cfr_renamed_152.cfr_renamed_2097(), this.cfr_renamed_152.cfr_renamed_2099(), this.cfr_renamed_152.cfr_renamed_2100(), this.cfr_renamed_152.cfr_renamed_2098());
                if (sprhyj2.cfr_renamed_152.cfr_renamed_596() != null) {
                    sprbj2 = new sprkpk(sprbj2, this.cfr_renamed_152.cfr_renamed_596());
                }
                sprqxk2 = ((sprmuk)this.cfr_renamed_112).cfr_renamed_284();
                if (this.cfr_renamed_91 != null) {
                    try {
                        sprhyj sprhyj3;
                        if (this.cfr_renamed_4 != 1 && this.cfr_renamed_4 != 3) {
                            sprhyj sprhyj4 = this;
                            sprhyj3 = sprhyj4;
                            sprhyj sprhyj5 = this;
                            sprhyj4.cfr_renamed_1.cfr_renamed_9427(false, sprhyj5.cfr_renamed_112, sprhyj5.cfr_renamed_91, sprbj2);
                            return sprhyj3.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
                        }
                        sprhyj sprhyj6 = this;
                        sprhyj3 = sprhyj6;
                        sprhyj sprhyj7 = this;
                        sprhyj6.cfr_renamed_1.cfr_renamed_9427(true, sprhyj7.cfr_renamed_91, sprhyj7.cfr_renamed_112, sprbj2);
                        return sprhyj3.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
                    }
                    catch (Exception exception) {
                        throw new sprazh(sprucq.cfr_renamed_9("L2X>U9\u0019(V|I.V?\\/J|[0V?R"), exception);
                    }
                }
                if (this.cfr_renamed_4 == 1) break block14;
                if (this.cfr_renamed_4 != 3) break block15;
            }
            (sprqal2 = new sprqal()).cfr_renamed_5536(new sprftk(sprqxk2, this.cfr_renamed_2));
            boolean bl = this.cfr_renamed_152.cfr_renamed_9050();
            sprpyk sprpyk2 = new sprpyk(sprqal2, new sprjzj(this, bl));
            try {
                sprhyj sprhyj8 = this;
                sprhyj8.cfr_renamed_1.cfr_renamed_9428(sprhyj8.cfr_renamed_112, sprbj2, sprpyk2);
                return sprhyj8.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
            }
            catch (Exception exception) {
                throw new sprazh(sprqzo.cfr_renamed_9(">>*2'5k$$p;\"$3.#8p)<$3 "), exception);
            }
        }
        if (this.cfr_renamed_4 != 2) {
            if (this.cfr_renamed_4 != 4) throw new IllegalStateException(sprqzo.cfr_renamed_9("3\" #59p%??p\">\"$\"1'985/"));
        }
        try {
            sprhyj sprhyj9 = this;
            sprhyj9.cfr_renamed_1.cfr_renamed_9429(sprhyj9.cfr_renamed_112, sprbj2, new sprtik(sprqxk2));
            return sprhyj9.cfr_renamed_1.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprull sprull2) {
            throw new sprazh(sprucq.cfr_renamed_9("L2X>U9\u0019(V|I.V?\\/J|[0V?R"), sprull2);
        }
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprhyj sprhyj2;
        if (this.cfr_renamed_86 == null && this.cfr_renamed_152 != null) {
            try {
                sprhyj sprhyj3 = this;
                sprhyj3.cfr_renamed_86 = sprhyj3.cfr_renamed_119.cfr_renamed_1540(sprucq.cfr_renamed_9("p\u0019j"));
                sprhyj3.cfr_renamed_86.init(this.cfr_renamed_152);
                sprhyj2 = this;
                return sprhyj2.cfr_renamed_86;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprhyj2 = this;
        return sprhyj2.cfr_renamed_86;
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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("(1%>$$k8*>/<.p8%; '9.4k *\"*=.$.\"k#;5(jk")).append(invalidAlgorithmParameterException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhyj(sprvsk sprvsk2, int n) {
        void arg0;
        sprhyj sprhyj2 = this;
        sprhyj sprhyj3 = this;
        sprhyj sprhyj4 = this;
        sprhyj sprhyj5 = this;
        sprhyj sprhyj6 = this;
        sprhyj5.cfr_renamed_119 = new sprdki();
        sprhyj5.cfr_renamed_4 = -1;
        sprhyj5.cfr_renamed_3 = new ByteArrayOutputStream();
        sprhyj4.cfr_renamed_86 = null;
        sprhyj4.cfr_renamed_152 = null;
        sprhyj3.cfr_renamed_93 = false;
        sprhyj3.cfr_renamed_91 = null;
        sprhyj2.cfr_renamed_1 = arg0;
        sprhyj2.cfr_renamed_0 = n;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprucq.cfr_renamed_9("w\u0013i\u001d}\u0018p\u0012~"))) {
            return;
        }
        if (!string.equals(sprqzo.cfr_renamed_9("\u0000\u0000\u0013\u0018e\u001b\u0011\u000f\u0014\u0002\u001e\f"))) {
            if (string.equals(sprucq.cfr_renamed_9("\fr\u001fjki\u001d}\u0018p\u0012~"))) {
                return;
            }
            throw new NoSuchPaddingException(sprqzo.cfr_renamed_9(" *4/9%7k>$$k1=1\"<*2'5k'\"$#p\u0002\u0015\u0018\u0013\" #59"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhyj(sprvsk sprvsk2) {
        void arg0;
        sprhyj sprhyj2 = this;
        sprhyj sprhyj3 = this;
        sprhyj sprhyj4 = this;
        sprhyj sprhyj5 = this;
        sprhyj sprhyj6 = this;
        sprhyj5.cfr_renamed_119 = new sprdki();
        sprhyj5.cfr_renamed_4 = -1;
        sprhyj5.cfr_renamed_3 = new ByteArrayOutputStream();
        sprhyj4.cfr_renamed_86 = null;
        sprhyj4.cfr_renamed_152 = null;
        sprhyj3.cfr_renamed_93 = false;
        sprhyj3.cfr_renamed_91 = null;
        sprhyj2.cfr_renamed_1 = arg0;
        sprhyj2.cfr_renamed_0 = 0;
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_152 != null) {
            return this.cfr_renamed_152.cfr_renamed_596();
        }
        return null;
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        sprhyj sprhyj2;
        int n;
        int n2;
        sprhyj sprhyj3;
        if (this.cfr_renamed_112 == null) {
            throw new IllegalStateException(sprucq.cfr_renamed_9("?P,Q9K|W3M|P2P(P=U5J9]"));
        }
        sprhyj sprhyj4 = this;
        int n3 = sprhyj4.cfr_renamed_1.cfr_renamed_1472().cfr_renamed_2404();
        if (sprhyj4.cfr_renamed_91 == null) {
            sprgxh sprgxh2 = ((sprmuk)this.cfr_renamed_112).cfr_renamed_284().cfr_renamed_1769();
            sprhyj3 = this;
            int n4 = (sprgxh2.cfr_renamed_1938() + 7) / 8;
            n2 = 1 + 2 * n4;
        } else {
            n2 = 0;
            sprhyj3 = this;
        }
        int n5 = sprhyj3.cfr_renamed_3.size() + arg0;
        if (this.cfr_renamed_1.cfr_renamed_2471() == null) {
            if (this.cfr_renamed_4 == 2 || this.cfr_renamed_4 == 4) {
                n = n5 - n3 - n2;
                sprhyj2 = this;
            } else {
                n = n5;
                sprhyj2 = this;
            }
        } else if (this.cfr_renamed_4 == 1 || this.cfr_renamed_4 == 3) {
            sprhyj sprhyj5 = this;
            sprhyj2 = sprhyj5;
            n = sprhyj5.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1202(n5);
        } else if (this.cfr_renamed_4 == 2 || this.cfr_renamed_4 == 4) {
            sprhyj sprhyj6 = this;
            sprhyj2 = sprhyj6;
            n = sprhyj6.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1202(n5 - n3 - n2);
        } else {
            throw new IllegalStateException(sprqzo.cfr_renamed_9("3\" #59p%??p\">\"$\"1'985/"));
        }
        if (sprhyj2.cfr_renamed_4 == 1 || this.cfr_renamed_4 == 3) {
            return n3 + n2 + n;
        }
        if (this.cfr_renamed_4 == 2 || this.cfr_renamed_4 == 4) {
            return n;
        }
        throw new IllegalStateException(sprucq.cfr_renamed_9("?P,Q9K|W3M|P2P(P=U5J9]"));
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_1.cfr_renamed_2471() != null) {
            return this.cfr_renamed_1.cfr_renamed_2471().cfr_renamed_1195();
        }
        return 0;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprqzo.cfr_renamed_9("\u001e\u0004\u001e\u000e"))) {
            this.cfr_renamed_93 = false;
            return;
        }
        if (string.equals(sprucq.cfr_renamed_9("}\u0014x\u0019j"))) {
            this.cfr_renamed_93 = true;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("(1%w?p8%; $\"?p&?/5k")).append(arg0).toString());
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprzg) {
            return ((sprzg)((Object)arg0)).cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938();
        }
        throw new IllegalArgumentException(sprucq.cfr_renamed_9("W3M|X2\u0019\u0019z|R9@"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprhyj sprhyj2;
        sprcsh sprcsh2 = null;
        if (arg2 != null) {
            try {
                sprcsh2 = arg2.getParameterSpec(sprcsh.class);
                sprhyj2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("(1%>$$k\".3$7%985k *\"*=.$.\"8jk")).append(exception.toString()).toString());
            }
        } else {
            sprhyj2 = this;
        }
        sprhyj2.cfr_renamed_86 = arg2;
        this.engineInit(arg0, arg1, sprcsh2, arg3);
    }
}

