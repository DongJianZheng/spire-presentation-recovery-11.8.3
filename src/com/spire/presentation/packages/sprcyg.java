/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracda;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprlvg;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtqg;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprcyg {
    private sprrr cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Signature cfr_renamed_1539(String arg0) throws sprtqg {
        try {
            return this.cfr_renamed_4.cfr_renamed_1539(arg0);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprtqg(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("\u0006W\u000bX\nBEU\u0017S\u0004B\u0000\u0016\u0016_\u0002X\u0004B\u0010D\u0000\fE")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public KeyFactory cfr_renamed_1511(String arg0) throws GeneralSecurityException, sprtqg {
        return this.cfr_renamed_4.cfr_renamed_1511(arg0);
    }

    public Cipher cfr_renamed_7920(int arg0, boolean arg1) throws sprtqg {
        String string = arg1 ? spracda.cfr_renamed_9("\r/\f") : sprlwy.cfr_renamed_9("y\u0015S\u000bf\"f&p'");
        String string2 = new StringBuilder().insert(0, sprmxg.cfr_renamed_7548(arg0)).append("/").append(string).append(spracda.cfr_renamed_9("F\u0000\u0006\u001e\b*\r'\u0007)")).toString();
        return this.cfr_renamed_1496(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MessageDigest cfr_renamed_7921(int arg0) throws GeneralSecurityException, sprtqg {
        String string = this.cfr_renamed_7544(arg0);
        try {
            return this.cfr_renamed_4.cfr_renamed_7438(string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (arg0 < 8) throw noSuchAlgorithmException;
            if (arg0 > 11) throw noSuchAlgorithmException;
            return this.cfr_renamed_4.cfr_renamed_7438(new StringBuilder().insert(0, "SHA").append(string.substring(4)).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprbg cfr_renamed_7568(boolean arg0, int arg1, byte[] arg2) throws sprtqg {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(arg2, sprmxg.cfr_renamed_7548(arg1));
            Cipher cipher = this.cfr_renamed_7920(arg1, arg0);
            if (arg0) {
                Cipher cipher2 = cipher;
                byte[] byArray = new byte[cipher2.getBlockSize()];
                cipher2.init(2, (Key)secretKeySpec, new IvParameterSpec(byArray));
                return new sprlvg(this, cipher);
            }
            cipher.init(2, secretKeySpec);
            return new sprlvg(this, cipher);
        }
        catch (sprtqg sprtqg2) {
            throw sprtqg2;
        }
        catch (Exception exception) {
            throw new sprtqg(sprlwy.cfr_renamed_9(" N\u0006S\u0015B\fY\u000b\u0016\u0006D\u0000W\u0011_\u000bQEU\fF\rS\u0017"), exception);
        }
    }

    public KeyAgreement cfr_renamed_2382(String arg0) throws GeneralSecurityException {
        return this.cfr_renamed_4.cfr_renamed_2382(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_1496(String arg0) throws sprtqg {
        try {
            return this.cfr_renamed_4.cfr_renamed_1496(arg0);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprtqg(new StringBuilder().insert(0, spracda.cfr_renamed_9("\n/\u0007 \u0006:I-\u001b+\b:\fn\n'\u0019&\f<Sn")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public AlgorithmParameters cfr_renamed_1540(String arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.cfr_renamed_4.cfr_renamed_1540(arg0);
    }

    public KeyPairGenerator cfr_renamed_2381(String arg0) throws GeneralSecurityException {
        return this.cfr_renamed_4.cfr_renamed_2381(arg0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_7922(int arg0) throws sprtqg {
        try {
            switch (arg0) {
                case 7: 
                case 8: 
                case 9: {
                    return this.cfr_renamed_4.cfr_renamed_1496(sprlwy.cfr_renamed_9("$s6a\u0017W\u0015"));
                }
                case 11: 
                case 12: 
                case 13: {
                    return this.cfr_renamed_4.cfr_renamed_1496(spracda.cfr_renamed_9("*/\u0004+\u0005\"\u0000/><\b>"));
                }
                default: {
                    throw new sprtqg(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("C\u000b]\u000bY\u0012XEA\u0017W\u0015\u0016\u0004Z\u0002Y\u0017_\u0011^\b\fE")).append(arg0).toString());
                }
            }
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprtqg(new StringBuilder().insert(0, spracda.cfr_renamed_9("\n/\u0007 \u0006:I-\u001b+\b:\fn\n'\u0019&\f<Sn")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public sprcyg(sprrr sprrr2) {
        this.cfr_renamed_4 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Signature cfr_renamed_7923(int arg0, int arg1) throws sprtqg {
        switch (arg0) {
            case 1: 
            case 3: {
                String string = "RSA";
                sprcyg sprcyg2 = this;
                return sprcyg2.cfr_renamed_1539(new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(spracda.cfr_renamed_9("\u001e'\u001d&")).append(string).toString());
            }
            case 17: {
                String string = "DSA";
                sprcyg sprcyg2 = this;
                return sprcyg2.cfr_renamed_1539(new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(spracda.cfr_renamed_9("\u001e'\u001d&")).append(string).toString());
            }
            case 16: 
            case 20: {
                String string = sprlwy.cfr_renamed_9(" Z\"W\bW\t");
                sprcyg sprcyg2 = this;
                return sprcyg2.cfr_renamed_1539(new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(spracda.cfr_renamed_9("\u001e'\u001d&")).append(string).toString());
            }
            case 19: {
                String string = spracda.cfr_renamed_9("\u000b*\n:\u000f");
                sprcyg sprcyg2 = this;
                return sprcyg2.cfr_renamed_1539(new StringBuilder().insert(0, sprmxg.cfr_renamed_7544(arg1)).append(spracda.cfr_renamed_9("\u001e'\u001d&")).append(string).toString());
            }
            case 22: {
                return this.cfr_renamed_1539("Ed25519");
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("\u0010X\u000eX\nA\u000b\u0016\u0004Z\u0002Y\u0017_\u0011^\b\u0016\u0011W\u0002\u0016\fXEE\fQ\u000bW\u0011C\u0017S_")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public String cfr_renamed_7544(int arg0) throws sprtqg {
        switch (arg0) {
            case 2: {
                return "SHA-1";
            }
            case 5: {
                return sprlwy.cfr_renamed_9("(rW");
            }
            case 1: {
                return "MD5";
            }
            case 3: {
                return "RIPEMD160";
            }
            case 8: {
                return "SHA-256";
            }
            case 9: {
                return "SHA-384";
            }
            case 10: {
                return "SHA-512";
            }
            case 11: {
                return "SHA-224";
            }
            case 6: {
                return spracda.cfr_renamed_9("\u001a \t,\u001c");
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("\u0010X\u000eX\nA\u000b\u0016\rW\u0016^EW\tQ\nD\fB\r[EB\u0004QE_\u000b\u0016\u0002S\u0011r\fQ\u0000E\u0011x\u0004[\u0000\fE")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cipher cfr_renamed_7924(int arg0) throws sprtqg {
        switch (arg0) {
            case 1: 
            case 2: {
                return this.cfr_renamed_1496(spracda.cfr_renamed_9(";\u001d(a,\r+a9\u0005*\u001dX\u001e\b*\r'\u0007)"));
            }
            case 16: 
            case 20: {
                return this.cfr_renamed_1496(sprlwy.cfr_renamed_9("s\tq\u0004[\u0004ZJs&tJf.u6\u00075W\u0001R\fX\u0002"));
            }
            case 17: {
                throw new sprtqg(spracda.cfr_renamed_9("\r\b N:I;\u001a+I\n:\u000fI(\u0006<I+\u0007-\u001b7\u0019:\u0000!\u0007`"));
            }
            case 19: {
                throw new sprtqg(sprlwy.cfr_renamed_9("&W\u000b\u0011\u0011\u0016\u0010E\u0000\u0016 u!e$\u0016\u0003Y\u0017\u0016\u0000X\u0006D\u001cF\u0011_\nXK"));
            }
            case 22: {
                throw new sprtqg(spracda.cfr_renamed_9("\r\b N:I;\u001a+I\u000b-\n:\u000fI(\u0006<I+\u0007-\u001b7\u0019:\u0000!\u0007`"));
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprlwy.cfr_renamed_9("C\u000b]\u000bY\u0012XEW\u0016O\b[\u0000B\u0017_\u0006\u0016\u0004Z\u0002Y\u0017_\u0011^\b\fE")).append(arg0).toString());
    }
}

