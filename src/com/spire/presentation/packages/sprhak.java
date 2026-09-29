/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprcsh;
import com.spire.presentation.packages.sprdbk;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprduk;
import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhml;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprooz;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpyk;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqjm;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvhl;
import com.spire.presentation.packages.sprvsk;
import com.spire.presentation.packages.sprxvj;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzg;
import com.spire.presentation.packages.sprzgi;
import com.spire.presentation.packages.sprzuk;
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

public class sprhak
extends sprcqj {
    private sprvsk cfr_renamed_105;
    private ByteArrayOutputStream cfr_renamed_137;
    private int cfr_renamed_79;
    private final sprduk cfr_renamed_107;
    private sprzgi cfr_renamed_132;
    private int cfr_renamed_102;
    private final sprrr cfr_renamed_93;
    private boolean cfr_renamed_86;
    private spryye cfr_renamed_152;
    private final int cfr_renamed_112;
    private static final sprqjm cfr_renamed_119 = new sprqjm();
    private final spraq cfr_renamed_91;
    private spryye cfr_renamed_0;
    private final int cfr_renamed_1;
    private final sprvhl cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private AlgorithmParameters cfr_renamed_4;

    @Override
    public int engineGetOutputSize(int arg0) {
        sprhak sprhak2;
        int n;
        int n2;
        sprhak sprhak3;
        if (this.cfr_renamed_0 == null) {
            throw new IllegalStateException(sprooz.cfr_renamed_9("\u00041\u00170\u0002*G6\b,G1\t1\u00131\u00064\u000e+\u0002<"));
        }
        sprhak sprhak4 = this;
        int n3 = sprhak4.cfr_renamed_105.cfr_renamed_1472().cfr_renamed_2404();
        if (sprhak4.cfr_renamed_152 == null) {
            sprgxh sprgxh2 = ((sprmuk)this.cfr_renamed_0).cfr_renamed_284().cfr_renamed_1769();
            sprhak3 = this;
            int n4 = (sprgxh2.cfr_renamed_1938() + 7) / 8;
            n2 = 2 * n4;
        } else {
            n2 = 0;
            sprhak3 = this;
        }
        int n5 = sprhak3.cfr_renamed_137.size() + arg0;
        if (this.cfr_renamed_105.cfr_renamed_2471() == null) {
            n = n5;
            sprhak2 = this;
        } else if (this.cfr_renamed_102 == 1 || this.cfr_renamed_102 == 3) {
            sprhak sprhak5 = this;
            sprhak2 = sprhak5;
            n = sprhak5.cfr_renamed_105.cfr_renamed_2471().cfr_renamed_1202(n5);
        } else if (this.cfr_renamed_102 == 2 || this.cfr_renamed_102 == 4) {
            sprhak sprhak6 = this;
            sprhak2 = sprhak6;
            n = sprhak6.cfr_renamed_105.cfr_renamed_2471().cfr_renamed_1202(n5 - n3 - n2);
        } else {
            throw new IllegalStateException(sprebda.cfr_renamed_9("y\u0019j\u0018\u007f\u0002:\u001eu\u0004:\u0019t\u0019n\u0019{\u001cs\u0003\u007f\u0014"));
        }
        if (sprhak2.cfr_renamed_102 == 1 || this.cfr_renamed_102 == 3) {
            return n3 + n2 + n;
        }
        if (this.cfr_renamed_102 == 2 || this.cfr_renamed_102 == 4) {
            return n;
        }
        throw new IllegalStateException(sprooz.cfr_renamed_9("\u00041\u00170\u0002*G6\b,G1\t1\u00131\u00064\u000e+\u0002<"));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_137.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprebda.cfr_renamed_9("\u0013{\u001et\u001fnPr\u0011t\u0014v\u0015:\u0003o\u0000j\u001cs\u0015~Pj\u0011h\u0011w\u0015n\u0015hPi\u0000\u007f\u0013 P")).append(invalidAlgorithmParameterException.getMessage()).toString());
        }
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (arg2 != 0) {
            this.cfr_renamed_137.write(arg0, arg1, arg2);
        }
        sprhak sprhak2 = this;
        byte[] byArray = sprhak2.cfr_renamed_137.toByteArray();
        sprhak2.cfr_renamed_137.reset();
        sprqxk sprqxk2 = ((sprmuk)sprhak2.cfr_renamed_0).cfr_renamed_284();
        if (this.cfr_renamed_102 == 1 || this.cfr_renamed_102 == 3) {
            sprqal sprqal2 = new sprqal();
            sprqal2.cfr_renamed_5536(new sprftk(sprqxk2, this.cfr_renamed_3));
            sprhak sprhak3 = this;
            boolean bl = sprhak3.cfr_renamed_132.cfr_renamed_9202();
            sprpyk sprpyk2 = new sprpyk(sprqal2, new sprxvj(this, bl));
            sprhml sprhml2 = sprpyk2.cfr_renamed_31();
            sprhak3.cfr_renamed_2.cfr_renamed_5692(sprhml2.cfr_renamed_3537().cfr_renamed_1225());
            sprhak sprhak4 = this;
            byte[] byArray2 = cfr_renamed_119.cfr_renamed_2500(sprhak4.cfr_renamed_2.cfr_renamed_5695(sprhak4.cfr_renamed_0), cfr_renamed_119.cfr_renamed_9157(sprqxk2.cfr_renamed_1769()));
            byte[] byArray3 = new byte[arg2 + this.cfr_renamed_1];
            this.cfr_renamed_107.cfr_renamed_5671(new sprook(byArray2, this.cfr_renamed_132.cfr_renamed_8278()));
            sprhak3.cfr_renamed_107.cfr_renamed_2341(byArray3, 0, byArray3.length);
            byte[] byArray4 = new byte[arg2 + this.cfr_renamed_112];
            int n = 0;
            int n2 = n;
            while (n2 != arg2) {
                int n3 = n;
                byte by = (byte)(arg0[arg1 + n3] ^ byArray3[n]);
                byArray4[n3] = by;
                n2 = ++n;
            }
            sprtpk sprtpk2 = new sprtpk(byArray3, arg2, byArray3.length - arg2);
            sprhak sprhak5 = this;
            sprhak5.cfr_renamed_91.cfr_renamed_5692(sprtpk2);
            sprhak5.cfr_renamed_91.cfr_renamed_1197(byArray4, 0, arg2);
            byte[] byArray5 = new byte[sprhak5.cfr_renamed_91.cfr_renamed_2404()];
            sprhak5.cfr_renamed_91.cfr_renamed_1219(byArray5, 0);
            sproze.cfr_renamed_3408(sprtpk2.cfr_renamed_1521());
            sproze.cfr_renamed_3408(byArray3);
            System.arraycopy(byArray5, 0, byArray4, arg2, this.cfr_renamed_112);
            return sproze.cfr_renamed_543(sprhml2.cfr_renamed_3536(), byArray4);
        }
        if (this.cfr_renamed_102 == 2 || this.cfr_renamed_102 == 4) {
            int n;
            sprzuk sprzuk2 = (sprzuk)this.cfr_renamed_0;
            sprgxh sprgxh2 = sprzuk2.cfr_renamed_284().cfr_renamed_1769();
            int n4 = (sprgxh2.cfr_renamed_1938() + 7) / 8;
            if (arg0[arg1] == 4) {
                n4 = 1 + 2 * n4;
                n = arg2;
            } else {
                n4 = 1 + n4;
                n = arg2;
            }
            int n5 = n - (n4 + this.cfr_renamed_112);
            int n6 = arg1;
            spreuh spreuh2 = sprgxh2.cfr_renamed_2002(sproze.cfr_renamed_533(arg0, n6, n6 + n4));
            sprhak sprhak6 = this;
            sprhak sprhak7 = this;
            sprhak6.cfr_renamed_2.cfr_renamed_5692(sprhak7.cfr_renamed_0);
            byte[] byArray6 = cfr_renamed_119.cfr_renamed_2500(this.cfr_renamed_2.cfr_renamed_5695(new sprnzk(spreuh2, sprzuk2.cfr_renamed_284())), cfr_renamed_119.cfr_renamed_9157(sprqxk2.cfr_renamed_1769()));
            byte[] byArray7 = new byte[n5 + this.cfr_renamed_1];
            sprhak6.cfr_renamed_107.cfr_renamed_5671(new sprook(byArray6, this.cfr_renamed_132.cfr_renamed_8278()));
            sprhak7.cfr_renamed_107.cfr_renamed_2341(byArray7, 0, byArray7.length);
            byte[] byArray8 = new byte[n5];
            int n7 = 0;
            int n8 = n7;
            while (n8 != byArray8.length) {
                int n9 = n7;
                byte by = (byte)(arg0[arg1 + n4 + n9] ^ byArray7[n7]);
                byArray8[n9] = by;
                n8 = ++n7;
            }
            sprtpk sprtpk3 = new sprtpk(byArray7, n5, byArray7.length - n5);
            sprhak sprhak8 = this;
            sprhak8.cfr_renamed_91.cfr_renamed_5692(sprtpk3);
            sprhak8.cfr_renamed_91.cfr_renamed_1197(arg0, arg1 + n4, byArray8.length);
            sprhak sprhak9 = this;
            byte[] byArray9 = new byte[sprhak9.cfr_renamed_91.cfr_renamed_2404()];
            sprhak9.cfr_renamed_91.cfr_renamed_1219(byArray9, 0);
            sproze.cfr_renamed_3408(sprtpk3.cfr_renamed_1521());
            sproze.cfr_renamed_3408(byArray7);
            if (!sproze.cfr_renamed_5245(sprhak9.cfr_renamed_112, byArray9, 0, arg0, arg1 + (arg2 - this.cfr_renamed_112))) {
                throw new BadPaddingException(sprooz.cfr_renamed_9("5\u0006;G>\u000e=\u000b<"));
            }
            return byArray8;
        }
        throw new IllegalStateException(sprebda.cfr_renamed_9("y\u0019j\u0018\u007f\u0002:\u001eu\u0004:\u0019t\u0019n\u0019{\u001cs\u0003\u007f\u0014"));
    }

    @Override
    public byte[] engineGetIV() {
        return null;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprooz.cfr_renamed_9(";\u00066@,G+\u0012(\u00177\u0015,G5\b<\u0002x")).append(arg0).toString());
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] byArray = this.engineDoFinal(arg0, arg1, arg2);
        System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
        return byArray.length;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(sprebda.cfr_renamed_9("j\u0011~\u0014s\u001e}Pt\u001fnP{\u0006{\u0019v\u0011x\u001c\u007fPm\u0019n\u0018:9_#Y\u0019j\u0018\u007f\u0002"));
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprzg) {
            return ((sprzg)((Object)arg0)).cfr_renamed_284().cfr_renamed_1769().cfr_renamed_1938();
        }
        throw new IllegalArgumentException(sprooz.cfr_renamed_9("6\b,G9\tx\"\u001bG3\u0002!"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprhak sprhak2;
        if (this.cfr_renamed_4 == null && this.cfr_renamed_132 != null) {
            try {
                sprhak sprhak3 = this;
                sprhak3.cfr_renamed_4 = sprhak3.cfr_renamed_93.cfr_renamed_1540(sprebda.cfr_renamed_9("9_#"));
                sprhak3.cfr_renamed_4.init(this.cfr_renamed_132);
                sprhak2 = this;
                return sprhak2.cfr_renamed_4;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprhak2 = this;
        return sprhak2.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int n, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        void arg3;
        sprhak sprhak2;
        void arg1;
        void arg0;
        sprhak sprhak3 = this;
        sprhak3.cfr_renamed_152 = null;
        sprhak3.cfr_renamed_132 = (sprzgi)algorithmParameterSpec;
        if (arg0 == true || arg0 == 3) {
            if (!(arg1 instanceof PublicKey)) throw new InvalidKeyException(sprooz.cfr_renamed_9("5\u0012+\u0013x\u0005=G(\u0006+\u0014=\u0003x\u0015=\u00041\u00171\u00026\u0013\u007f\u0014x\u0017-\u00054\u000e;G\u001d$x\f=\u001ex\u00017\u0015x\u00026\u0004*\u001e(\u00131\b6"));
            this.cfr_renamed_0 = sprdbk.cfr_renamed_1216((PublicKey)arg1);
            sprhak2 = this;
        } else {
            if (arg0 != 2 && arg0 != 4) throw new InvalidKeyException(sprooz.cfr_renamed_9("5\u0012+\u0013x\u0005=G(\u0006+\u0014=\u0003x\"\u001bG3\u0002!"));
            if (!(arg1 instanceof PrivateKey)) throw new InvalidKeyException(sprebda.cfr_renamed_9("w\u0005i\u0004:\u0012\u007fPj\u0011i\u0003\u007f\u0014:\u0002\u007f\u0013s\u0000s\u0015t\u0004=\u0003:\u0000h\u0019l\u0011n\u0015:5YPq\u0015cP|\u001fhP~\u0015y\u0002c\u0000n\u0019u\u001e"));
            this.cfr_renamed_0 = sprdbk.cfr_renamed_1220((PrivateKey)arg1);
            sprhak2 = this;
        }
        sprhak2.cfr_renamed_3 = arg3;
        this.cfr_renamed_102 = arg0;
        this.cfr_renamed_137.reset();
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_137.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprhak sprhak2;
        sprcsh sprcsh2 = null;
        if (arg2 != null) {
            try {
                sprcsh2 = arg2.getParameterSpec(sprcsh.class);
                sprhak2 = this;
            }
            catch (Exception exception) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprebda.cfr_renamed_9("\u0013{\u001et\u001fnPh\u0015y\u001f}\u001es\u0003\u007fPj\u0011h\u0011w\u0015n\u0015h\u0003 P")).append(exception.toString()).toString());
            }
        } else {
            sprhak2 = this;
        }
        sprhak2.cfr_renamed_4 = arg2;
        this.engineInit(arg0, arg1, sprcsh2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprhak(sprvhl sprvhl2, sprduk sprduk2, spraq spraq2, int n, int n2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhak sprhak2 = this;
        sprhak sprhak3 = this;
        sprhak sprhak4 = this;
        sprhak sprhak5 = this;
        sprhak sprhak6 = this;
        sprhak sprhak7 = this;
        sprhak7.cfr_renamed_93 = new sprdki();
        sprhak6.cfr_renamed_102 = -1;
        sprhak6.cfr_renamed_137 = new ByteArrayOutputStream();
        sprhak6.cfr_renamed_4 = null;
        sprhak5.cfr_renamed_132 = null;
        sprhak5.cfr_renamed_86 = false;
        sprhak4.cfr_renamed_152 = null;
        sprhak4.cfr_renamed_2 = arg0;
        sprhak3.cfr_renamed_107 = arg1;
        sprhak3.cfr_renamed_91 = arg2;
        sprhak2.cfr_renamed_1 = arg3;
        sprhak2.cfr_renamed_112 = n2;
    }
}

