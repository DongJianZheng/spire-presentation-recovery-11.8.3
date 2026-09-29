/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdjk;
import com.spire.presentation.packages.spreai;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjgk;
import com.spire.presentation.packages.sprjmf;
import com.spire.presentation.packages.sprjnn;
import com.spire.presentation.packages.sprjpl;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprnfl;
import com.spire.presentation.packages.sprnkj;
import com.spire.presentation.packages.sprobi;
import com.spire.presentation.packages.sprov;
import com.spire.presentation.packages.sprril;
import com.spire.presentation.packages.sprrnj;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprwpj;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzgl;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprnmj
extends sprjmf {
    private spreai cfr_renamed_1;
    private sprov cfr_renamed_2;
    private byte[] cfr_renamed_3;

    @Override
    public byte[] cfr_renamed_5696() {
        return this.cfr_renamed_3;
    }

    public sprnmj(String arg0) {
        super(sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle") ? sprjnn.cfr_renamed_9("\"\u001b2") : arg0, null);
    }

    private /* synthetic */ sprov cfr_renamed_9426(String arg0) throws InvalidKeyException {
        if (!this.cfr_renamed_112.equals(sprjpl.cfr_renamed_9("\u000bI\u001b")) && !this.cfr_renamed_112.startsWith(arg0)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprjnn.cfr_renamed_9("6\u0014>\n/\b0\n-\u0013>\u000e:Z4\u001f&Z9\u0015-Z")).append(this.cfr_renamed_112).toString());
        }
        if (this.cfr_renamed_112.indexOf(85) > 0) {
            if (arg0.startsWith("X448")) {
                return new sprnfl(new sprril());
            }
            return new sprnfl(new sprzgl());
        }
        if (arg0.startsWith("X448")) {
            return new sprril();
        }
        return new sprzgl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_5691(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprnmj sprnmj2;
        sprnmj sprnmj3;
        if (!(arg0 instanceof PrivateKey)) {
            throw new InvalidKeyException(sprjpl.cfr_renamed_9("}!d%l'hsU\u0017Esf6ts\u007f6|&d!h7"));
        }
        spryye spryye2 = sprnkj.cfr_renamed_1220((PrivateKey)arg0);
        if (spryye2 instanceof spruek) {
            sprnmj sprnmj4 = this;
            sprnmj3 = sprnmj4;
            sprnmj4.cfr_renamed_2 = sprnmj4.cfr_renamed_9426("X25519");
        } else {
            if (!(spryye2 instanceof sprsfk)) throw new IllegalStateException(sprjnn.cfr_renamed_9("*\u0014,\u000f/\n0\b+\u001f;Z/\b6\f>\u000e:Z4\u001f&Z+\u0003/\u001f"));
            sprnmj sprnmj5 = this;
            sprnmj3 = sprnmj5;
            sprnmj5.cfr_renamed_2 = sprnmj5.cfr_renamed_9426("X448");
        }
        sprnmj3.cfr_renamed_4 = null;
        if (arg1 instanceof spreai) {
            if (this.cfr_renamed_112.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException(sprjpl.cfr_renamed_9("2j!h6`6c'-2a4b!d'e>-=b'-\u0017E\u0006-1l h7"));
            }
            this.cfr_renamed_1 = (spreai)arg1;
            sprnmj sprnmj6 = this;
            sprnmj6.cfr_renamed_4 = sprnmj6.cfr_renamed_1.cfr_renamed_4032();
            sprnmj6.cfr_renamed_2.cfr_renamed_5692(new sprdjk(spryye2, ((sprrnj)this.cfr_renamed_1.cfr_renamed_2094()).cfr_renamed_9389(), ((sprwpj)this.cfr_renamed_1.cfr_renamed_2096()).cfr_renamed_9389()));
            sprnmj2 = this;
        } else if (arg1 != null) {
            this.cfr_renamed_2.cfr_renamed_5692(spryye2);
            if (!(arg1 instanceof sprobi)) throw new InvalidAlgorithmParameterException(sprjpl.cfr_renamed_9("&c8c<z=-\u0003l!l>h'h!^#h0"));
            if (this.cfr_renamed_91 == null) {
                throw new InvalidAlgorithmParameterException(sprjnn.cfr_renamed_9("\u00140Z\u0014>\u0019Z,\n:\u00196\u001c6\u001f;Z9\u0015-Z\n\t:\b\u0014\u001f&\u00131\u001d\u0012\u001b+\u001f-\u0013>\u0016\f\n:\u0019"));
            }
            this.cfr_renamed_4 = ((sprobi)arg1).cfr_renamed_4032();
            sprnmj2 = this;
        } else {
            sprnmj sprnmj7 = this;
            sprnmj2 = sprnmj7;
            sprnmj7.cfr_renamed_2.cfr_renamed_5692(spryye2);
        }
        if (sprnmj2.cfr_renamed_91 == null || this.cfr_renamed_4 != null) return;
        this.cfr_renamed_4 = new byte[0];
    }

    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        if (!(arg0 instanceof PublicKey)) {
            throw new InvalidKeyException(sprjnn.cfr_renamed_9("\n*\u00183\u0013<Z\u0007>\u0017Z4\u001f&Z-\u001f.\u000f6\b:\u001e"));
        }
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprjpl.cfr_renamed_9("sc<ysd=d'd2a:~6i}")).toString());
        }
        if (!arg1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_112).append(sprjnn.cfr_renamed_9("Z<\u001b1Z0\u00143\u0003\u007f\u0018:Z=\u001f+\r:\u001f1Z+\r0Z/\u001b-\u000e6\u001f,T")).toString());
        }
        spryye spryye2 = sprnkj.cfr_renamed_1216((PublicKey)arg0);
        sprnmj sprnmj2 = this;
        sprnmj2.cfr_renamed_3 = new byte[sprnmj2.cfr_renamed_2.cfr_renamed_8005()];
        if (sprnmj2.cfr_renamed_1 != null) {
            this.cfr_renamed_2.cfr_renamed_8006(new sprjgk(spryye2, ((sprwpj)this.cfr_renamed_1.cfr_renamed_9200()).cfr_renamed_9389()), this.cfr_renamed_3, 0);
        } else {
            this.cfr_renamed_2.cfr_renamed_8006(spryye2, this.cfr_renamed_3, 0);
        }
        return null;
    }

    public sprnmj(String arg0, sprjs arg1) {
        sprjs sprjs2;
        String string;
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle")) {
            string = sprjpl.cfr_renamed_9("\u000bI\u001b");
            sprjs2 = arg1;
        } else {
            string = arg0;
            sprjs2 = arg1;
        }
        super(string, sprjs2);
    }
}

