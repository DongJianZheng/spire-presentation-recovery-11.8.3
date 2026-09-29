/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafi;
import com.spire.presentation.packages.spravk;
import com.spire.presentation.packages.spraxk;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbwk;
import com.spire.presentation.packages.sprcwj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdoha;
import com.spire.presentation.packages.sprekl;
import com.spire.presentation.packages.sprerk;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.sprfal;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprgbl;
import com.spire.presentation.packages.sprgqh;
import com.spire.presentation.packages.sprgqk;
import com.spire.presentation.packages.sprgxk;
import com.spire.presentation.packages.sprhbl;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprhok;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.spribi;
import com.spire.presentation.packages.spriki;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprjdi;
import com.spire.presentation.packages.sprjlk;
import com.spire.presentation.packages.sprjqk;
import com.spire.presentation.packages.sprjuk;
import com.spire.presentation.packages.sprjwk;
import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprkbi;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuk;
import com.spire.presentation.packages.sprltk;
import com.spire.presentation.packages.sprmfi;
import com.spire.presentation.packages.sprmik;
import com.spire.presentation.packages.sprmki;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprmwk;
import com.spire.presentation.packages.sprmyk;
import com.spire.presentation.packages.sprnji;
import com.spire.presentation.packages.sproak;
import com.spire.presentation.packages.sproqk;
import com.spire.presentation.packages.spror;
import com.spire.presentation.packages.sproyk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprprh;
import com.spire.presentation.packages.sprpuk;
import com.spire.presentation.packages.sprqqk;
import com.spire.presentation.packages.sprsek;
import com.spire.presentation.packages.sprshi;
import com.spire.presentation.packages.sprswk;
import com.spire.presentation.packages.sprsxj;
import com.spire.presentation.packages.sprto;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtxk;
import com.spire.presentation.packages.spruck;
import com.spire.presentation.packages.spruji;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprwqk;
import com.spire.presentation.packages.sprxal;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzu;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

public class spruhi
extends sprmki
implements sprjy {
    private spror cfr_renamed_952;
    private String cfr_renamed_728;
    private sprto cfr_renamed_128;
    private static final int cfr_renamed_957 = 512;
    private static final Class[] cfr_renamed_314;
    private int cfr_renamed_951;
    private String cfr_renamed_84;
    private sprkpk cfr_renamed_723;
    private sprtxk cfr_renamed_1226;
    private boolean cfr_renamed_287;
    private PBEParameterSpec cfr_renamed_724;
    private int cfr_renamed_953;
    private boolean cfr_renamed_133;
    private int cfr_renamed_185;
    private sprmr cfr_renamed_82;
    private int cfr_renamed_126;

    /*
     * WARNING - void declaration
     */
    public spruhi(sprmr sprmr2) {
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        this.cfr_renamed_951 = -1;
        spruhi4.cfr_renamed_126 = 0;
        spruhi4.cfr_renamed_287 = true;
        spruhi3.cfr_renamed_724 = null;
        spruhi3.cfr_renamed_728 = null;
        spruhi2.cfr_renamed_84 = null;
        spruhi2.cfr_renamed_82 = sprmr2;
        spruhi spruhi5 = this;
        spruhi2.cfr_renamed_128 = new spriki((sprmr)arg0);
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        int n = this.cfr_renamed_128.cfr_renamed_2345(arg2);
        if (n > 0) {
            byte[] byArray = new byte[n];
            int n2 = this.cfr_renamed_128.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            if (n2 == 0) {
                return null;
            }
            if (n2 != byArray.length) {
                byte[] byArray2 = new byte[n2];
                System.arraycopy(byArray, 0, byArray2, 0, n2);
                return byArray2;
            }
            return byArray;
        }
        this.cfr_renamed_128.cfr_renamed_505(arg0, arg1, arg2, null, 0);
        return null;
    }

    @Override
    public void engineUpdateAAD(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_128.cfr_renamed_2410(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int n = 0;
        if (arg4 + this.engineGetOutputSize(arg2) > arg3.length) {
            throw new ShortBufferException(sprhky.cfr_renamed_9("3\b(\r)\t|\u001f)\u001b:\u0018.](\u00123]/\u00153\u000f(]:\u0012.]5\u0013,\b(S"));
        }
        try {
            if (arg2 != 0) {
                n = this.cfr_renamed_128.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
            }
            return n + this.cfr_renamed_128.cfr_renamed_1219(arg3, arg4 + n);
        }
        catch (sprwjl sprwjl2) {
            throw new IllegalBlockSizeException(sprwjl2.getMessage());
        }
        catch (sprddl sprddl2) {
            throw new IllegalBlockSizeException(sprddl2.getMessage());
        }
    }

    static {
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = spruji.cfr_renamed_2;
        classArray[3] = sprprh.class;
        classArray[4] = IvParameterSpec.class;
        classArray[5] = PBEParameterSpec.class;
        cfr_renamed_314 = classArray;
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(spror spror2) {
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        spruhi5.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi4.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi3.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        spruhi2.cfr_renamed_82 = arg0.cfr_renamed_1397();
        spruhi2.cfr_renamed_952 = spror2;
        spruhi spruhi6 = this;
        spruhi2.cfr_renamed_128 = new spriki(arg0.cfr_renamed_1397());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (arg4 + this.cfr_renamed_128.cfr_renamed_2345(arg2) > arg3.length) {
            throw new ShortBufferException(sprdoha.cfr_renamed_9("M\u0015V\u0010W\u0014\u0002\u0002W\u0006D\u0005P@V\u000fM@Q\bM\u0012V@D\u000fP@K\u000eR\u0015VN"));
        }
        try {
            return this.cfr_renamed_128.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        catch (sprddl sprddl2) {
            throw new IllegalStateException(sprddl2.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        spruhi spruhi2;
        if (this.cfr_renamed_2 == null) {
            if (this.cfr_renamed_724 != null) {
                try {
                    spruhi spruhi3 = this;
                    spruhi3.cfr_renamed_2 = spruhi3.cfr_renamed_9250(spruhi3.cfr_renamed_728);
                    spruhi3.cfr_renamed_2.init(this.cfr_renamed_724);
                    spruhi2 = this;
                    return spruhi2.cfr_renamed_2;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            if (this.cfr_renamed_1226 != null) {
                if (this.cfr_renamed_82 == null) {
                    try {
                        spruhi spruhi4 = this;
                        spruhi4.cfr_renamed_2 = spruhi4.cfr_renamed_9250(sprdl.cfr_renamed_1344.cfr_renamed_19());
                        spruhi4.cfr_renamed_2.init(new sprfvg(this.cfr_renamed_1226.cfr_renamed_596()).cfr_renamed_91());
                        spruhi2 = this;
                        return spruhi2.cfr_renamed_2;
                    }
                    catch (Exception exception) {
                        throw new RuntimeException(exception.toString());
                    }
                }
                try {
                    spruhi spruhi5 = this;
                    spruhi5.cfr_renamed_2 = spruhi5.cfr_renamed_9250(sprhky.cfr_renamed_9(":\u001f0"));
                    spruhi5.cfr_renamed_2.init(new sprsek(this.cfr_renamed_1226.cfr_renamed_596(), this.cfr_renamed_1226.cfr_renamed_2404() / 8).cfr_renamed_91());
                    spruhi2 = this;
                    return spruhi2.cfr_renamed_2;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.toString());
                }
            }
            if (this.cfr_renamed_723 != null) {
                String string = this.cfr_renamed_128.cfr_renamed_2349().cfr_renamed_1315();
                if (string.indexOf(47) >= 0) {
                    String string2 = string;
                    string = string2.substring(0, string2.indexOf(47));
                }
                try {
                    spruhi spruhi6 = this;
                    spruhi6.cfr_renamed_2 = spruhi6.cfr_renamed_9250(string);
                    spruhi6.cfr_renamed_2.init(new IvParameterSpec(this.cfr_renamed_723.cfr_renamed_1205()));
                    spruhi2 = this;
                    return spruhi2.cfr_renamed_2;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.toString());
                }
            }
        }
        spruhi2 = this;
        return spruhi2.cfr_renamed_2;
    }

    private /* synthetic */ sprbj cfr_renamed_9254(AlgorithmParameterSpec arg0, sprbj arg1) {
        if (arg1 instanceof sprkpk) {
            sprbj sprbj2 = ((sprkpk)arg1).cfr_renamed_284();
            if (arg0 instanceof IvParameterSpec) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec)arg0;
                this.cfr_renamed_723 = new sprkpk(sprbj2, ivParameterSpec.getIV());
                arg1 = this.cfr_renamed_723;
                return arg1;
            }
            if (arg0 instanceof sprprh) {
                sprprh sprprh2 = (sprprh)arg0;
                arg1 = new sprjlk(arg1, sprprh2.cfr_renamed_3345());
                if (sprprh2.cfr_renamed_1205() != null && this.cfr_renamed_126 != 0) {
                    this.cfr_renamed_723 = new sprkpk(sprbj2, sprprh2.cfr_renamed_1205());
                    arg1 = this.cfr_renamed_723;
                }
            }
        } else {
            AlgorithmParameterSpec algorithmParameterSpec = arg0;
            if (arg0 instanceof IvParameterSpec) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec)algorithmParameterSpec;
                this.cfr_renamed_723 = new sprkpk(arg1, ivParameterSpec.getIV());
                arg1 = this.cfr_renamed_723;
                return arg1;
            }
            if (algorithmParameterSpec instanceof sprprh) {
                sprprh sprprh3 = (sprprh)arg0;
                arg1 = new sprjlk(arg1, sprprh3.cfr_renamed_3345());
                if (sprprh3.cfr_renamed_1205() != null && this.cfr_renamed_126 != 0) {
                    arg1 = new sprkpk(arg1, sprprh3.cfr_renamed_1205());
                }
            }
        }
        return arg1;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        if (this.cfr_renamed_82 == null) {
            throw new NoSuchPaddingException(sprdoha.cfr_renamed_9("\u000eM@R\u0001F\u0004K\u000eE@Q\u0015R\u0010M\u0012V\u0005F@D\u000fP@V\bK\u0013\u0002\u0001N\u0007M\u0012K\u0014J\r"));
        }
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprhky.cfr_renamed_9("3\u0013-\u001d9\u00184\u0012:"))) {
            if (this.cfr_renamed_128.cfr_renamed_2409()) {
                spruhi spruhi2 = this;
                spruhi2.cfr_renamed_128 = new spriki(new sprirk(this.cfr_renamed_128.cfr_renamed_2349()));
                return;
            }
        } else {
            if (string.equals(sprdoha.cfr_renamed_9("7k4j#v3")) || string.equals(sprhky.cfr_renamed_9("\u001f)\u000f-\u001d9\u00184\u0012:")) || string.equals(sprdoha.cfr_renamed_9("a3\u00110c$f)l'"))) {
                this.cfr_renamed_128 = new spriki(new sproyk(this.cfr_renamed_128.cfr_renamed_2349()));
                return;
            }
            spruhi spruhi3 = this;
            spruhi3.cfr_renamed_133 = true;
            if (spruhi3.cfr_renamed_2407(spruhi3.cfr_renamed_84)) {
                throw new NoSuchPaddingException(sprhky.cfr_renamed_9("22\u0011%]\u0012\u0012\f\u001c8\u00195\u0013;]?\u001c2]>\u0018|\b/\u00188]+\u0014(\u0015|<\u0019<\u0018]1\u00128\u0018/S"));
            }
            if (string.equals(sprdoha.cfr_renamed_9("r+a3\u00170c$f)l'")) || string.equals(sprhky.cfr_renamed_9("\f6\u001f.k-\u001d9\u00184\u0012:"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349());
                return;
            }
            if (string.equals(sprdoha.cfr_renamed_9(":g2m\"{4g0c$f)l'"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349(), new sprmwk());
                return;
            }
            if (string.equals(sprhky.cfr_renamed_9("4\u000f2mMmOj-\u001d9\u00184\u0012:")) || string.equals(sprdoha.cfr_renamed_9(")q/\u0013P\u0013R\u0014M\u00100c$f)l'"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349(), new sprjuk());
                return;
            }
            if (string.equals(sprhky.cfr_renamed_9("\u0004DrOo-\u001d9\u00184\u0012:")) || string.equals(sprdoha.cfr_renamed_9("8\u001bR\u00110c$f)l'"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349(), new sprwqk());
                return;
            }
            if (string.equals(sprhky.cfr_renamed_9("\u0015.\u0013JdLjPh-\u001d9\u00184\u0012:")) || string.equals(sprdoha.cfr_renamed_9("k3mY\u0015Y\u0015M\u00130c$f)l'"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349(), new sprerk());
                return;
            }
            if (string.equals(sprhky.cfr_renamed_9("\b?\u001f-\u001d9\u00184\u0012:"))) {
                this.cfr_renamed_128 = new spriki(this.cfr_renamed_128.cfr_renamed_2349(), new sprhbl());
                return;
            }
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprdoha.cfr_renamed_9("r\u0001F\u0004K\u000eE@")).append(arg0).append(sprhky.cfr_renamed_9("])\u00137\u00133\n2S")).toString());
        }
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_1226 != null) {
            return this.cfr_renamed_1226.cfr_renamed_596();
        }
        if (this.cfr_renamed_723 != null) {
            return this.cfr_renamed_723.cfr_renamed_1205();
        }
        return null;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        if (this.cfr_renamed_82 == null) {
            throw new NoSuchAlgorithmException(sprdoha.cfr_renamed_9("L\u000f\u0002\rM\u0004G@Q\u0015R\u0010M\u0012V\u0005F@D\u000fP@V\bK\u0013\u0002\u0001N\u0007M\u0012K\u0014J\r"));
        }
        this.cfr_renamed_84 = sprkoe.cfr_renamed_116(arg0);
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9("8\u001f?"))) {
            this.cfr_renamed_126 = 0;
            spruhi spruhi2 = this;
            this.cfr_renamed_128 = new spriki(this.cfr_renamed_82);
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("#`#"))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new spriki(sprhqk.cfr_renamed_7530(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.startsWith(sprhky.cfr_renamed_9("2\u001a?"))) {
            spruhi spruhi3 = this;
            spruhi3.cfr_renamed_126 = spruhi3.cfr_renamed_82.cfr_renamed_1195();
            if (spruhi3.cfr_renamed_84.length() != 3) {
                int n = Integer.parseInt(this.cfr_renamed_84.substring(3));
                this.cfr_renamed_128 = new spriki(new sprbwk(this.cfr_renamed_82, n));
                return;
            }
            this.cfr_renamed_128 = new spriki(new sprbwk(this.cfr_renamed_82, 8 * this.cfr_renamed_82.cfr_renamed_1195()));
            return;
        }
        if (this.cfr_renamed_84.startsWith(sprdoha.cfr_renamed_9("#d\""))) {
            spruhi spruhi4 = this;
            spruhi4.cfr_renamed_126 = spruhi4.cfr_renamed_82.cfr_renamed_1195();
            if (spruhi4.cfr_renamed_84.length() != 3) {
                int n = Integer.parseInt(this.cfr_renamed_84.substring(3));
                this.cfr_renamed_128 = new spriki(new spretk(this.cfr_renamed_82, n));
                return;
            }
            this.cfr_renamed_128 = new spriki(new spretk(this.cfr_renamed_82, 8 * this.cfr_renamed_82.cfr_renamed_1195()));
            return;
        }
        if (this.cfr_renamed_84.startsWith(sprhky.cfr_renamed_9("\f:\f>\u001a?"))) {
            boolean bl = this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("r'r#d\"u)v(k6"));
            if (!bl && this.cfr_renamed_84.length() != 6) {
                throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("2\u0012|\u00103\u00199]/\b,\r3\u000f(]:\u0012.]")).append(this.cfr_renamed_84).toString());
            }
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new spriki(new sprpuk(this.cfr_renamed_82, bl));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("m0g.r'r#d\""))) {
            this.cfr_renamed_126 = 0;
            this.cfr_renamed_128 = new spriki(new sprxal(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9(";\u001aL"))) {
            this.cfr_renamed_126 = 0;
            this.cfr_renamed_128 = new sprkbi(new sprqqk(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("&dS\u000fQ"))) {
            this.cfr_renamed_126 = 0;
            this.cfr_renamed_128 = new sprkbi(new sprmyk(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9(".\u0015>"))) {
            spruhi spruhi5 = this;
            spruhi5.cfr_renamed_126 = spruhi5.cfr_renamed_82.cfr_renamed_1195();
            if (spruhi5.cfr_renamed_126 < 16) {
                throw new IllegalArgumentException(sprdoha.cfr_renamed_9("u\u0001P\u000eK\u000eEZ\u00023k#\u000f-M\u0004G@A\u0001L@@\u0005A\u000fO\u0005\u0002\u0001\u0002\u0014U\u000fV\tO\u0005\u000f\u0010C\u0004\u0002\tD@V\bG@@\fM\u0003I\u0013K\u001aG@M\u0006\u0002\u0014J\u0005\u0002\u0003K\u0010J\u0005P@K\u0013\u0002\u0014M\u000f\u0002\u0013O\u0001N\f\f@w\u0013G@C@A\tR\bG\u0012\u0002\u0017K\u0014J@C@@\fM\u0003I@Q\tX\u0005\u0002\u000fD@C\u0014\u0002\fG\u0001Q\u0014\u0002Q\u0010X\u0002\u0002K\u0014Q@\n\u0005\f\u0007\f@c%qI"));
            }
            spruhi spruhi6 = this;
            spruhi6.cfr_renamed_287 = false;
            spruhi6.cfr_renamed_128 = new spriki(new sprirk(new sprswk(this.cfr_renamed_82)));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9(">\b/"))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_287 = false;
            spruhi spruhi7 = this;
            if (this.cfr_renamed_82 instanceof sprekl) {
                spruhi7.cfr_renamed_128 = new spriki(new sprirk(new sprgxk(this.cfr_renamed_82)));
                return;
            }
            spruhi7.cfr_renamed_128 = new spriki(new sprirk(new sprswk(this.cfr_renamed_82)));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("e/d\""))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new spriki(new sprirk(new sprjwk(this.cfr_renamed_82)));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9("\u001b>\u001a?"))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new spriki(new sprirk(new sprfal(this.cfr_renamed_82)));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("#v3"))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new spriki(new sproyk(sprhqk.cfr_renamed_7530(this.cfr_renamed_82)));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9(">\u001f0"))) {
            this.cfr_renamed_126 = 12;
            spruhi spruhi8 = this;
            if (this.cfr_renamed_82 instanceof sprekl) {
                spruhi8.cfr_renamed_128 = new sprafi(new spravk(this.cfr_renamed_82));
                return;
            }
            spruhi8.cfr_renamed_128 = new sprafi(new sprjqk(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("/a\""))) {
            if (this.cfr_renamed_952 != null) {
                spruhi spruhi9 = this;
                spruhi9.cfr_renamed_126 = 15;
                spruhi spruhi10 = this;
                spruhi9.cfr_renamed_128 = new sprafi(new sprkuk(spruhi10.cfr_renamed_82, spruhi10.cfr_renamed_952.cfr_renamed_1397()));
                return;
            }
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("\u001e=\u0013{\t|\u000e)\r,\u0012.\t|\u00103\u00199]")).append(arg0).toString());
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("%c8"))) {
            this.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
            this.cfr_renamed_128 = new sprafi(new sproqk(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprhky.cfr_renamed_9(":\u001f0q.\u0015+"))) {
            this.cfr_renamed_126 = 12;
            this.cfr_renamed_128 = new sprafi(new sprltk(this.cfr_renamed_82));
            return;
        }
        if (this.cfr_renamed_84.equals(sprdoha.cfr_renamed_9("'a-"))) {
            spruhi spruhi11 = this;
            if (this.cfr_renamed_82 instanceof sprekl) {
                spruhi11.cfr_renamed_126 = this.cfr_renamed_82.cfr_renamed_1195();
                this.cfr_renamed_128 = new sprafi(new sprgbl(this.cfr_renamed_82));
                return;
            }
            spruhi11.cfr_renamed_126 = 12;
            this.cfr_renamed_128 = new sprafi(new sprgqk(this.cfr_renamed_82));
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("\u001e=\u0013{\t|\u000e)\r,\u0012.\t|\u00103\u00199]")).append(arg0).toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int var1_1, Key var2_2, AlgorithmParameterSpec var3_3, SecureRandom var4_4) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block73: {
            block78: {
                block77: {
                    block76: {
                        block74: {
                            block75: {
                                block72: {
                                    block71: {
                                        block70: {
                                            block69: {
                                                block68: {
                                                    v0 = this;
                                                    v1 = this;
                                                    v1.cfr_renamed_724 = null;
                                                    v1.cfr_renamed_728 = null;
                                                    v0.cfr_renamed_2 = null;
                                                    v0.cfr_renamed_1226 = null;
                                                    if (!(var2_2 instanceof SecretKey)) {
                                                        v2 = new StringBuilder().insert(0, sprdoha.cfr_renamed_9("i\u0005[@D\u000fP@C\fE\u000fP\tV\bO@"));
                                                        if (arg1 != null) {
                                                            v3 = arg1.getAlgorithm();
                                                            throw new InvalidKeyException(v2.append(v3).append(sprhky.cfr_renamed_9("|\u00133\t|\u000e)\u0014(\u001c>\u00119]:\u0012.]/\u00041\u00109\t.\u0014?]9\u0013.\u0004,\t5\u00122S")).toString());
                                                        }
                                                        v3 = null;
                                                        throw new InvalidKeyException(v2.append(v3).append(sprhky.cfr_renamed_9("|\u00133\t|\u000e)\u0014(\u001c>\u00119]:\u0012.]/\u00041\u00109\t.\u0014?]9\u0013.\u0004,\t5\u00122S")).toString());
                                                    }
                                                    if (arg2 == null && this.cfr_renamed_82 != null && this.cfr_renamed_82.cfr_renamed_1315().startsWith(sprdoha.cfr_renamed_9("p#\u0017M\u0014T"))) {
                                                        throw new InvalidAlgorithmParameterException(sprhky.cfr_renamed_9("\u000e>i].\u0018-\b5\u000f9\u000e|\u001c2]\u000e>i-=\u000f=\u00109\t9\u000f/.,\u0018?](\u0012|\u001f9],\u001c/\u000e9\u0019|\u00142S"));
                                                    }
                                                    if (this.cfr_renamed_951 != 2 && !(arg1 instanceof spruck)) break block68;
                                                    try {
                                                        var6_5 = (SecretKey)arg1;
                                                    }
                                                    catch (Exception var7_8) {
                                                        throw new InvalidKeyException(sprdoha.cfr_renamed_9("r+a3\u0013R\u0002\u0012G\u0011W\tP\u0005Q@C@q\u0005A\u0012G\u0014i\u0005[Or\"g+G\u0019"));
                                                    }
                                                    if (arg2 instanceof PBEParameterSpec) {
                                                        this.cfr_renamed_724 = (PBEParameterSpec)arg2;
                                                    }
                                                    if (var6_5 instanceof PBEKey && this.cfr_renamed_724 == null) {
                                                        var7_9 = (PBEKey)var6_5;
                                                        if (var7_9.getSalt() == null) {
                                                            throw new InvalidAlgorithmParameterException(sprhky.cfr_renamed_9("\f?\u001969\u0004|\u000f9\f)\u0014.\u0018/],\u001c.\u001c1\u0018(\u0018.\u000e|\t3]/\r9\u001e5\u001b%]/\u001c0\t"));
                                                        }
                                                        this.cfr_renamed_724 = new PBEParameterSpec(var7_9.getSalt(), var7_9.getIterationCount());
                                                    }
                                                    if (this.cfr_renamed_724 == null && !(var6_5 instanceof PBEKey)) {
                                                        throw new InvalidKeyException(sprdoha.cfr_renamed_9("c\fE\u000fP\tV\bO@P\u0005S\u0015K\u0012G\u0013\u0002\u0001\u00020`%\u0002\u000bG\u0019"));
                                                    }
                                                    if (arg1 instanceof sprgbi) {
                                                        v4 = var7_9 = ((sprgbi)arg1).cfr_renamed_2292();
                                                        if (var7_9 instanceof sprkpk) {
                                                            var5_10 = v4;
                                                        } else {
                                                            if (v4 != null) throw new InvalidKeyException(sprhky.cfr_renamed_9("\u001d\u0011;\u0012.\u0014(\u00151].\u0018-\b5\u000f9\u000e|\u001c|-\u001e8|\u00169\u0004|\u000e)\u0014(\u001c>\u00119]:\u0012.]\f6\u001f.mO"));
                                                            v5 = this;
                                                            v6 = this;
                                                            var5_10 = sprjdi.cfr_renamed_9251(var6_5.getEncoded(), 2, v5.cfr_renamed_953, v5.cfr_renamed_185, this.cfr_renamed_126 * 8, v6.cfr_renamed_724, v6.cfr_renamed_128.cfr_renamed_1315());
                                                        }
                                                    } else {
                                                        v7 = this;
                                                        v8 = this;
                                                        var5_10 = sprjdi.cfr_renamed_9251(var6_5.getEncoded(), 2, v7.cfr_renamed_953, v7.cfr_renamed_185, this.cfr_renamed_126 * 8, v8.cfr_renamed_724, v8.cfr_renamed_128.cfr_renamed_1315());
                                                    }
                                                    if (var5_10 instanceof sprkpk) {
                                                        this.cfr_renamed_723 = (sprkpk)var5_10;
                                                    }
                                                    ** GOTO lbl107
                                                }
                                                if (!(arg1 instanceof sproak)) break block69;
                                                var6_5 = (sproak)arg1;
                                                if (arg2 instanceof PBEParameterSpec) {
                                                    this.cfr_renamed_724 = (PBEParameterSpec)arg2;
                                                }
                                                if (var6_5 instanceof sprsxj && this.cfr_renamed_724 == null) {
                                                    v9 = this;
                                                    v9.cfr_renamed_724 = new PBEParameterSpec(((sprsxj)var6_5).getSalt(), ((sprsxj)var6_5).getIterationCount());
                                                }
                                                v10 = this;
                                                v11 = this;
                                                var5_10 = sprjdi.cfr_renamed_9251(var6_5.getEncoded(), 0, v10.cfr_renamed_953, v10.cfr_renamed_185, this.cfr_renamed_126 * 8, v11.cfr_renamed_724, v11.cfr_renamed_128.cfr_renamed_1315());
                                                if (var5_10 instanceof sprkpk) {
                                                    this.cfr_renamed_723 = (sprkpk)var5_10;
                                                }
                                                ** GOTO lbl107
                                            }
                                            if (!(arg1 instanceof sprgbi)) break block70;
                                            var6_5 = (sprgbi)arg1;
                                            v12 = this;
                                            if (var6_5.cfr_renamed_113() != null) {
                                                v12.cfr_renamed_728 = var6_5.cfr_renamed_113().cfr_renamed_19();
                                                v13 = var6_5;
                                            } else {
                                                v12.cfr_renamed_728 = var6_5.getAlgorithm();
                                                v13 = var6_5;
                                            }
                                            if (v13.cfr_renamed_2292() != null) {
                                                v14 = var5_10 = this.cfr_renamed_9254((AlgorithmParameterSpec)arg2, var6_5.cfr_renamed_2292());
                                            } else {
                                                if (arg2 instanceof PBEParameterSpec == false) throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("r\"g@P\u0005S\u0015K\u0012G\u0013\u00020`%\u0002\u0010C\u0012C\rG\u0014G\u0012Q@V\u000f\u0002\u0002G@Q\u0005VN"));
                                                this.cfr_renamed_724 = (PBEParameterSpec)arg2;
                                                v14 = var5_10 = sprjdi.cfr_renamed_9249((sprgbi)var6_5, (AlgorithmParameterSpec)arg2, this.cfr_renamed_128.cfr_renamed_2349().cfr_renamed_1315());
                                            }
                                            if (v14 instanceof sprkpk) {
                                                this.cfr_renamed_723 = (sprkpk)var5_10;
                                            }
                                            ** GOTO lbl107
                                        }
                                        if (!(arg1 instanceof PBEKey)) break block71;
                                        var6_5 = (PBEKey)arg1;
                                        this.cfr_renamed_724 = (PBEParameterSpec)arg2;
                                        if (var6_5 instanceof sprcwj && this.cfr_renamed_724 == null) {
                                            this.cfr_renamed_724 = new PBEParameterSpec(var6_5.getSalt(), var6_5.getIterationCount());
                                        }
                                        v15 = this;
                                        v16 = this;
                                        v17 = this;
                                        var5_10 = sprjdi.cfr_renamed_9251(var6_5.getEncoded(), v15.cfr_renamed_951, v15.cfr_renamed_953, v16.cfr_renamed_185, v16.cfr_renamed_126 * 8, v17.cfr_renamed_724, v17.cfr_renamed_128.cfr_renamed_1315());
                                        if (var5_10 instanceof sprkpk) {
                                            this.cfr_renamed_723 = (sprkpk)var5_10;
                                        }
                                        ** GOTO lbl107
                                    }
                                    if (!(arg1 instanceof sprgqh)) {
                                        if (this.cfr_renamed_951 == 0) throw new InvalidKeyException(sprhky.cfr_renamed_9("\u001d\u0011;\u0012.\u0014(\u00151].\u0018-\b5\u000f9\u000e|\u001c|-\u001e8|\u00169\u0004"));
                                        if (this.cfr_renamed_951 == 4) throw new InvalidKeyException(sprhky.cfr_renamed_9("\u001d\u0011;\u0012.\u0014(\u00151].\u0018-\b5\u000f9\u000e|\u001c|-\u001e8|\u00169\u0004"));
                                        if (this.cfr_renamed_951 == 1) throw new InvalidKeyException(sprhky.cfr_renamed_9("\u001d\u0011;\u0012.\u0014(\u00151].\u0018-\b5\u000f9\u000e|\u001c|-\u001e8|\u00169\u0004"));
                                        if (this.cfr_renamed_951 == 5) {
                                            throw new InvalidKeyException(sprhky.cfr_renamed_9("\u001d\u0011;\u0012.\u0014(\u00151].\u0018-\b5\u000f9\u000e|\u001c|-\u001e8|\u00169\u0004"));
                                        }
                                        var5_10 = new sprtpk(arg1.getEncoded());
                                        v18 = arg2;
                                    } else {
                                        var5_10 = null;
lbl107:
                                        // 5 sources

                                        v18 = arg2;
                                    }
                                    if (!(v18 instanceof sprnji)) break block72;
                                    v19 = this;
                                    if (!v19.cfr_renamed_2407(v19.cfr_renamed_84) && !(this.cfr_renamed_128 instanceof sprafi)) {
                                        throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("!g!f0C\u0012C\rG\u0014G\u0012q\u0010G\u0003\u0002\u0003C\u000e\u0002\u000fL\f[@@\u0005\u0002\u0015Q\u0005F@U\tV\b\u0002!g!f@O\u000fF\u0005QN"));
                                    }
                                    var6_5 = (sprnji)arg2;
                                    v20 = var5_10;
                                    if (var5_10 instanceof sprkpk) {
                                        var7_9 = (sprtpk)((sprkpk)v20).cfr_renamed_284();
                                        v21 = this;
                                    } else {
                                        var7_9 = (sprtpk)v20;
                                        v21 = this;
                                    }
                                    v21.cfr_renamed_1226 = new sprtxk((sprtpk)var7_9, var6_5.cfr_renamed_9214(), var6_5.cfr_renamed_596(), var6_5.cfr_renamed_9215());
                                    var5_10 = v21.cfr_renamed_1226;
                                    v22 = this;
                                    break block73;
                                }
                                if (!(arg2 instanceof IvParameterSpec)) break block74;
                                if (this.cfr_renamed_126 == 0) break block75;
                                var6_5 = (IvParameterSpec)arg2;
                                if (var6_5.getIV().length != this.cfr_renamed_126 && !(this.cfr_renamed_128 instanceof sprafi) && this.cfr_renamed_287) {
                                    throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("4\n]1\b/\t|\u001f9]")).append(this.cfr_renamed_126).append(sprdoha.cfr_renamed_9("\u0002\u0002[\u0014G\u0013\u0002\fM\u000eEN")).toString());
                                }
                                if (var5_10 instanceof sprkpk) {
                                    v23 = new sprkpk(((sprkpk)var5_10).cfr_renamed_284(), var6_5.getIV());
                                    var5_10 = v23;
                                    v24 = this;
                                } else {
                                    v23 = new sprkpk((sprbj)var5_10, var6_5.getIV());
                                    var5_10 = v23;
                                    v24 = this;
                                }
                                v24.cfr_renamed_723 = (sprkpk)var5_10;
                                v22 = this;
                                break block73;
                            }
                            if (this.cfr_renamed_84 != null && this.cfr_renamed_84.equals(sprhky.cfr_renamed_9("8\u001f?"))) {
                                throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("%a\"\u0002\rM\u0004G@F\u000fG\u0013\u0002\u000eM\u0014\u0002\u0015Q\u0005\u0002\u0001L@k6"));
                            }
                            ** GOTO lbl221
                        }
                        if (!(arg2 instanceof sprprh)) break block76;
                        var6_5 = (sprprh)arg2;
                        var5_10 = new sprjlk(new sprtpk(arg1.getEncoded()), ((sprprh)arg2).cfr_renamed_3345());
                        if (var6_5.cfr_renamed_1205() != null && this.cfr_renamed_126 != 0) {
                            if (var5_10 instanceof sprkpk) {
                                v25 = new sprkpk(((sprkpk)var5_10).cfr_renamed_284(), var6_5.cfr_renamed_1205());
                                var5_10 = v25;
                                v26 = this;
                            } else {
                                v25 = new sprkpk((sprbj)var5_10, var6_5.cfr_renamed_1205());
                                var5_10 = v25;
                                v26 = this;
                            }
                            v26.cfr_renamed_723 = (sprkpk)var5_10;
                        }
                        ** GOTO lbl221
                    }
                    if (!(arg2 instanceof RC2ParameterSpec)) break block77;
                    var6_5 = (RC2ParameterSpec)arg2;
                    var5_10 = new sprhok(arg1.getEncoded(), ((RC2ParameterSpec)arg2).getEffectiveKeyBits());
                    if (var6_5.getIV() != null && this.cfr_renamed_126 != 0) {
                        if (var5_10 instanceof sprkpk) {
                            v27 = new sprkpk(((sprkpk)var5_10).cfr_renamed_284(), var6_5.getIV());
                            var5_10 = v27;
                            v28 = this;
                        } else {
                            v27 = new sprkpk((sprbj)var5_10, var6_5.getIV());
                            var5_10 = v27;
                            v28 = this;
                        }
                        v28.cfr_renamed_723 = (sprkpk)var5_10;
                    }
                    ** GOTO lbl221
                }
                if (!(arg2 instanceof RC5ParameterSpec)) break block78;
                var6_5 = (RC5ParameterSpec)arg2;
                var5_10 = new sprmik(arg1.getEncoded(), ((RC5ParameterSpec)arg2).getRounds());
                if (this.cfr_renamed_82.cfr_renamed_1315().startsWith(sprhky.cfr_renamed_9("/\u001fH")) == false) throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("p#\u0017@R\u0001P\u0001O\u0005V\u0005P\u0013\u0002\u0010C\u0013Q\u0005F@V\u000f\u0002\u0001\u0002\u0003K\u0010J\u0005P@V\bC\u0014\u0002\tQ@L\u000fV@p#\u0017N"));
                if (this.cfr_renamed_82.cfr_renamed_1315().equals(sprdoha.cfr_renamed_9("p#\u0017M\u0011R"))) {
                    if (var6_5.getWordSize() != 32) {
                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("/\u001fH|\u001c0\u000f9\u001c8\u0004|\u000e9\t|\b,]:\u0012.]=]+\u0012.\u0019|\u000e5\u00079]3\u001b|Nn]2\u0012(]")).append(var6_5.getWordSize()).append(".").toString());
                    }
                } else if (this.cfr_renamed_82.cfr_renamed_1315().equals(sprdoha.cfr_renamed_9("p#\u0017M\u0014T")) && var6_5.getWordSize() != 64) {
                    throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("/\u001fH|\u001c0\u000f9\u001c8\u0004|\u000e9\t|\b,]:\u0012.]=]+\u0012.\u0019|\u000e5\u00079]3\u001b|Kh]2\u0012(]")).append(var6_5.getWordSize()).append(".").toString());
                }
                if (var6_5.getIV() != null && this.cfr_renamed_126 != 0) {
                    if (var5_10 instanceof sprkpk) {
                        v29 = new sprkpk(((sprkpk)var5_10).cfr_renamed_284(), var6_5.getIV());
                        var5_10 = v29;
                        v30 = this;
                    } else {
                        v29 = new sprkpk((sprbj)var5_10, var6_5.getIV());
                        var5_10 = v29;
                        v30 = this;
                    }
                    v30.cfr_renamed_723 = (sprkpk)var5_10;
                }
                ** GOTO lbl221
            }
            v31 = arg2;
            if (arg2 instanceof spribi) {
                var6_5 = (spribi)v31;
                var5_10 = new spraxk((sprtpk)var5_10, var6_5.cfr_renamed_9209(), var6_5.cfr_renamed_3339(), var6_5.cfr_renamed_9208());
                v22 = this;
            } else if (spruji.cfr_renamed_9244((AlgorithmParameterSpec)v31)) {
                v32 = this;
                if (!v32.cfr_renamed_2407(v32.cfr_renamed_84) && !(this.cfr_renamed_128 instanceof sprafi)) {
                    throw new InvalidAlgorithmParameterException(sprhky.cfr_renamed_9("\u001b>\u0011-=\u000f=\u00109\t9\u000f\u000f\r9\u001e|\u001e=\u0013|\u00122\u0011%]>\u0018|\b/\u00188]+\u0014(\u0015|<\u0019<\u0018]1\u00128\u0018/S"));
                }
                v33 = var5_10;
                if (var5_10 instanceof sprkpk) {
                    var6_5 = (sprtpk)((sprkpk)v33).cfr_renamed_284();
                    v34 = this;
                } else {
                    var6_5 = (sprtpk)v33;
                    v34 = this;
                }
                v34.cfr_renamed_1226 = spruji.cfr_renamed_9241((sprtpk)var6_5, (AlgorithmParameterSpec)arg2);
                var5_10 = v34.cfr_renamed_1226;
                v22 = this;
            } else {
                if (arg2 != null && !(arg2 instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("\u0015L\u000bL\u000fU\u000e\u0002\u0010C\u0012C\rG\u0014G\u0012\u0002\u0014[\u0010GN"));
                }
lbl221:
                // 6 sources

                v22 = this;
            }
        }
        if (v22.cfr_renamed_126 == 0 || var5_10 instanceof sprkpk || var5_10 instanceof sprtxk) ** GOTO lbl239
        var6_5 = arg3;
        if (var6_5 == null) {
            var6_5 = sprybl.cfr_renamed_2794();
        }
        if (arg0 == true) ** GOTO lbl231
        if (arg0 == 3) {
lbl231:
            // 2 sources

            var7_9 = new byte[this.cfr_renamed_126];
            var6_5.nextBytes((byte[])var7_9);
            var5_10 = new sprkpk((sprbj)var5_10, (byte[])var7_9);
            this.cfr_renamed_723 = var5_10;
            v35 = arg3;
        } else {
            if (this.cfr_renamed_128.cfr_renamed_2349().cfr_renamed_1315().indexOf(sprhky.cfr_renamed_9("\f:\f>\u001a?")) < 0) {
                throw new InvalidAlgorithmParameterException(sprdoha.cfr_renamed_9("\u000eM@k6\u0002\u0013G\u0014\u0002\u0017J\u0005L@M\u000eG@G\u0018R\u0005A\u0014G\u0004"));
            }
lbl239:
            // 3 sources

            v35 = arg3;
        }
        if (v35 != null && this.cfr_renamed_133) {
            var5_10 = new sprbgk((sprbj)var5_10, (SecureRandom)arg3);
        }
        try {
            switch (arg0) {
                case 1: 
                case 3: {
                    v36 = this;
                    v37 = v36;
                    v36.cfr_renamed_128.cfr_renamed_5535(true, (sprbj)var5_10);
                    break;
                }
                case 2: 
                case 4: {
                    v38 = this;
                    v37 = v38;
                    v38.cfr_renamed_128.cfr_renamed_5535(false, (sprbj)var5_10);
                    break;
                }
                default: {
                    throw new InvalidParameterException(new StringBuilder().insert(0, sprhky.cfr_renamed_9("\b2\u00162\u0012+\u0013|\u0012,\u00103\u00199]")).append((int)arg0).append(sprdoha.cfr_renamed_9("@R\u0001Q\u0013G\u0004")).toString());
                }
            }
            if (v37.cfr_renamed_128 instanceof sprafi == false) return;
            if (this.cfr_renamed_1226 != null) return;
            var6_5 = sprafi.cfr_renamed_9255((sprafi)this.cfr_renamed_128);
            this.cfr_renamed_1226 = new sprtxk((sprtpk)this.cfr_renamed_723.cfr_renamed_284(), var6_5.cfr_renamed_1472().length * 8, this.cfr_renamed_723.cfr_renamed_1205());
            return;
        }
        catch (IllegalArgumentException var6_6) {
            throw new InvalidAlgorithmParameterException(var6_6.getMessage(), var6_6);
        }
        catch (Exception var6_7) {
            throw new sprshi(var6_7.getMessage(), var6_7);
        }
    }

    public spruhi(sprzu arg0) {
        spruhi spruhi2;
        sprzu sprzu2 = arg0;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        spruhi5.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi4.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi3.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        this.cfr_renamed_82 = sprzu2.cfr_renamed_2349();
        if (sprzu2.cfr_renamed_1315().indexOf(sprhky.cfr_renamed_9(":\u001f0")) >= 0) {
            spruhi2 = this;
            this.cfr_renamed_126 = 12;
        } else {
            spruhi spruhi6 = this;
            spruhi2 = spruhi6;
            spruhi6.cfr_renamed_126 = spruhi6.cfr_renamed_82.cfr_renamed_1195();
        }
        spruhi2.cfr_renamed_128 = new sprafi(arg0);
    }

    @Override
    public int engineGetBlockSize() {
        if (this.cfr_renamed_82 == null) {
            return -1;
        }
        return this.cfr_renamed_82.cfr_renamed_1195();
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(sprmr sprmr2, boolean bl, int n) {
        void arg1;
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        this.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi5.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi4.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        spruhi3.cfr_renamed_82 = arg0;
        spruhi2.cfr_renamed_287 = arg1;
        spruhi spruhi6 = this;
        spruhi2.cfr_renamed_128 = new spriki((sprmr)arg0);
        spruhi2.cfr_renamed_126 = n / 8;
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
            throw new InvalidKeyException(invalidAlgorithmParameterException.getMessage());
        }
    }

    @Override
    public void engineUpdateAAD(ByteBuffer arg0) {
        int n;
        int n2 = arg0.remaining();
        if (n2 < 1) {
            return;
        }
        if (arg0.hasArray()) {
            ByteBuffer byteBuffer = arg0;
            this.engineUpdateAAD(byteBuffer.array(), arg0.arrayOffset() + arg0.position(), n2);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (n2 <= 512) {
            byte[] byArray = new byte[n2];
            arg0.get(byArray);
            this.engineUpdateAAD(byArray, 0, byArray.length);
            sproze.cfr_renamed_492(byArray, (byte)0);
            return;
        }
        byte[] byArray = new byte[512];
        do {
            n = Math.min(byArray.length, n2);
            arg0.get(byArray, 0, n);
            this.engineUpdateAAD(byArray, 0, n);
        } while ((n2 -= n) > 0);
        sproze.cfr_renamed_492(byArray, (byte)0);
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
    }

    public spruhi(sprirk arg0, int arg1) {
        this(arg0, true, arg1);
    }

    private /* synthetic */ boolean cfr_renamed_2407(String arg0) {
        return sprdoha.cfr_renamed_9("#a-").equals(arg0) || sprhky.cfr_renamed_9("8\u001d%").equals(arg0) || sprdoha.cfr_renamed_9("'a-").equals(arg0) || sprhky.cfr_renamed_9(":\u001f0q.\u0015+").equals(arg0) || sprdoha.cfr_renamed_9("/a\"").equals(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        int n = 0;
        byte[] byArray = new byte[this.engineGetOutputSize(arg2)];
        if (arg2 != 0) {
            n = this.cfr_renamed_128.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        }
        try {
            n += this.cfr_renamed_128.cfr_renamed_1219(byArray, n);
        }
        catch (sprddl sprddl2) {
            throw new IllegalBlockSizeException(sprddl2.getMessage());
        }
        if (n == byArray.length) {
            return byArray;
        }
        if (n > byArray.length) {
            throw new IllegalBlockSizeException(sprhky.cfr_renamed_9("5\u0013(\u0018.\u0013=\u0011|\u001f)\u001b:\u0018.]3\u000b9\u000f:\u00113\n"));
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(sprirk sprirk2, boolean bl, int n) {
        void arg1;
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        this.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi5.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi4.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        spruhi3.cfr_renamed_82 = arg0.cfr_renamed_2349();
        spruhi spruhi6 = this;
        spruhi3.cfr_renamed_128 = new spriki((sprirk)arg0);
        spruhi2.cfr_renamed_287 = arg1;
        spruhi2.cfr_renamed_126 = n / 8;
    }

    public spruhi(sprmr arg0, int arg1) {
        this(arg0, true, arg1);
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return this.cfr_renamed_128.cfr_renamed_1202(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(spriw spriw2, boolean bl, int n) {
        void arg0;
        void arg1;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        this.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi5.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi4.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        spruhi3.cfr_renamed_82 = null;
        spruhi2.cfr_renamed_287 = arg1;
        spruhi2.cfr_renamed_126 = n;
        spruhi spruhi6 = this;
        spruhi2.cfr_renamed_128 = new sprafi((spriw)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(sprzu sprzu2, boolean bl, int n) {
        void arg1;
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        this.cfr_renamed_951 = -1;
        spruhi5.cfr_renamed_126 = 0;
        spruhi5.cfr_renamed_287 = true;
        spruhi4.cfr_renamed_724 = null;
        spruhi4.cfr_renamed_728 = null;
        spruhi3.cfr_renamed_84 = null;
        spruhi3.cfr_renamed_82 = arg0.cfr_renamed_2349();
        spruhi2.cfr_renamed_287 = arg1;
        spruhi2.cfr_renamed_126 = n;
        spruhi spruhi6 = this;
        spruhi2.cfr_renamed_128 = new sprafi((spriw)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruhi(sprmr sprmr2, int n, int n2, int n3, int n4) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spruhi spruhi2 = this;
        spruhi spruhi3 = this;
        spruhi spruhi4 = this;
        spruhi spruhi5 = this;
        spruhi spruhi6 = this;
        this.cfr_renamed_951 = -1;
        spruhi6.cfr_renamed_126 = 0;
        spruhi6.cfr_renamed_287 = true;
        spruhi5.cfr_renamed_724 = null;
        spruhi5.cfr_renamed_728 = null;
        spruhi4.cfr_renamed_84 = null;
        spruhi4.cfr_renamed_82 = arg0;
        spruhi3.cfr_renamed_951 = arg1;
        spruhi3.cfr_renamed_953 = arg2;
        spruhi2.cfr_renamed_185 = arg3;
        spruhi2.cfr_renamed_126 = n4;
        spruhi spruhi7 = this;
        spruhi2.cfr_renamed_128 = new spriki((sprmr)arg0);
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null && (algorithmParameterSpec = sprmfi.cfr_renamed_9238(arg2, cfr_renamed_314)) == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprdoha.cfr_renamed_9("\u0003C\u000e\u0005\u0014\u0002\bC\u000eF\fG@R\u0001P\u0001O\u0005V\u0005P@")).append(arg2.toString()).toString());
        }
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
        this.cfr_renamed_2 = arg2;
    }
}

