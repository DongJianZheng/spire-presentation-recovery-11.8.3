/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.sprekj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkii;
import com.spire.presentation.packages.sprlmj;
import com.spire.presentation.packages.sprmpp;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwvh;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class sprgkj
extends KeyPairGenerator {
    public int cfr_renamed_119;
    public boolean cfr_renamed_91;
    public SecureRandom cfr_renamed_0;
    public String cfr_renamed_1;
    public sprftk cfr_renamed_2;
    public sprqal cfr_renamed_3;
    public Object cfr_renamed_4;

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprkii) {
            sprkii sprkii2 = (sprkii)arg0;
            this.cfr_renamed_9434(sprkii2, arg1);
            return;
        }
        if (arg0 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)arg0;
            this.cfr_renamed_4 = arg0;
            sprgkj sprgkj2 = this;
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153()), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_91 = true;
            return;
        }
        AlgorithmParameterSpec algorithmParameterSpec = arg0;
        if (arg0 instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec)algorithmParameterSpec;
            this.cfr_renamed_4 = arg0;
            sprgxh sprgxh2 = sprnlj.cfr_renamed_2323(eCParameterSpec.getCurve());
            spreuh spreuh2 = sprnlj.cfr_renamed_9154(sprgxh2, eCParameterSpec.getGenerator());
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprgxh2, spreuh2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_91 = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECGenParameterSpec || arg0 instanceof sprwvh) {
            sprgkj sprgkj3;
            String string;
            AlgorithmParameterSpec algorithmParameterSpec2 = arg0;
            if (arg0 instanceof ECGenParameterSpec) {
                string = ((ECGenParameterSpec)algorithmParameterSpec2).getName();
                sprgkj3 = this;
            } else {
                string = ((sprwvh)algorithmParameterSpec2).cfr_renamed_313();
                sprgkj3 = this;
            }
            sprgkj3.cfr_renamed_9434(new sprkii(string), arg1);
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() != null) {
            sprrxh sprrxh3 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            this.cfr_renamed_4 = arg0;
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_1145(), sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153()), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_91 = true;
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() == null) {
            throw new InvalidAlgorithmParameterException(sprawc.cfr_renamed_9("oVmO!S`Q`NdWdQ!S`PrFe\u0003cVu\u0003oL!JlSmJbJu`@\u0003rFu"));
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("\f#\u000e#\u0011'\b'\u000eb\u0013 \u0016'\u001f6\\,\u00136\\#\\\u0007?\u0012\u001d0\u001d/\u00196\u00190/2\u0019!Fb")).append(arg0.getClass().getName()).toString());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 5;
        int cfr_ignored_0 = 2 << 3 ^ 3;
        int n4 = n2;
        int n5 = 4 << 4 ^ 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(sprawc.cfr_renamed_9("D`!hdZ!s`Js\u0003FFoFsBuLs\u0003oLu\u0003hMhWhBmJrFe"));
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprnzk sprnzk2 = (sprnzk)sprsil2.cfr_renamed_1224();
        sprzuk sprzuk2 = (sprzuk)sprsil2.cfr_renamed_1225();
        if (this.cfr_renamed_4 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)this.cfr_renamed_4;
            sprekj sprekj2 = new sprekj(this.cfr_renamed_1, sprnzk2, sprrxh2);
            return new KeyPair(sprekj2, new sprlmj(this.cfr_renamed_1, sprzuk2, sprekj2, sprrxh2));
        }
        if (this.cfr_renamed_4 == null) {
            return new KeyPair(new sprekj(this.cfr_renamed_1, sprnzk2), new sprlmj(this.cfr_renamed_1, sprzuk2));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_4;
        sprekj sprekj3 = new sprekj(this.cfr_renamed_1, sprnzk2, eCParameterSpec);
        return new KeyPair(sprekj3, new sprlmj(this.cfr_renamed_1, sprzuk2, sprekj3, eCParameterSpec));
    }

    public sprgkj() {
        sprgkj sprgkj2 = this;
        sprgkj sprgkj3 = this;
        super("ECGOST3410-2012");
        this.cfr_renamed_4 = null;
        sprgkj sprgkj4 = this;
        this.cfr_renamed_3 = new sprqal();
        sprgkj3.cfr_renamed_1 = "ECGOST3410-2012";
        sprgkj3.cfr_renamed_119 = 239;
        sprgkj2.cfr_renamed_0 = null;
        sprgkj2.cfr_renamed_91 = false;
    }

    private /* synthetic */ void cfr_renamed_9434(sprkii arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprhfm sprhfm2 = spralm.cfr_renamed_9184(arg0.cfr_renamed_2106());
        if (sprhfm2 == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmpp.cfr_renamed_9("7\u0012)\u0012-\u000b,\\!\t0\n'Fb")).append(arg0.cfr_renamed_2106()).toString());
        }
        sprgkj sprgkj2 = this;
        sprgkj2.cfr_renamed_4 = new sprxvh(spralm.cfr_renamed_7555(arg0.cfr_renamed_2106()), sprhfm2.cfr_renamed_1769(), sprhfm2.cfr_renamed_1145(), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153(), sprhfm2.cfr_renamed_2113());
        sprgkj2.cfr_renamed_2 = new sprftk(new sprbuk(new sprxrk(arg0.cfr_renamed_2106(), sprhfm2), arg0.cfr_renamed_2106(), arg0.cfr_renamed_2107(), arg0.cfr_renamed_2105()), arg1);
        this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_2);
        this.cfr_renamed_91 = true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_0 = secureRandom;
        if (this.cfr_renamed_4 == null) {
            throw new InvalidParameterException(sprmpp.cfr_renamed_9("7\u0012)\u0012-\u000b,\\)\u0019;\\1\u00158\u0019l"));
        }
        try {
            void arg1;
            sprgkj sprgkj2 = this;
            sprgkj2.initialize((ECGenParameterSpec)sprgkj2.cfr_renamed_4, (SecureRandom)arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprawc.cfr_renamed_9("HdZ!PhYd\u0003oLu\u0003bLoEhDtQ`AmF/"));
        }
    }
}

