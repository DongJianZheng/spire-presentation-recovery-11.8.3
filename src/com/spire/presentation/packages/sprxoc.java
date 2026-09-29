/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprab;
import com.spire.presentation.packages.sprbme;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprggd;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprizd;
import com.spire.presentation.packages.sprjkc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprpzca;
import com.spire.presentation.packages.sprqb;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrb;
import com.spire.presentation.packages.sprrmd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtdd;
import com.spire.presentation.packages.sprtnd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvb;
import com.spire.presentation.packages.sprvmz;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzf;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

public class sprxoc
extends KeyAgreementSpi {
    private sprqid cfr_renamed_152;
    private BigInteger cfr_renamed_112;
    private String cfr_renamed_119;
    private static final sprizd cfr_renamed_91 = new sprizd();
    private static final Hashtable cfr_renamed_0 = new Hashtable();
    private static final Hashtable cfr_renamed_1;
    private sprzf cfr_renamed_2;
    private static final Hashtable cfr_renamed_3;
    private sprib cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2497(Key arg0) throws InvalidKeyException {
        if (this.cfr_renamed_2 instanceof sprpzca) {
            if (!(arg0 instanceof sprqb)) {
                throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprvmz.cfr_renamed_9("<:y(<0{#y4q4r%<#y i8n4oq")).append(sprxoc.cfr_renamed_2498(sprqb.class)).append(sprbme.cfr_renamed_9("j\t%\u001dj\u0006$\u0006>\u0006+\u0003#\u001c+\u001b#\u0000$")).toString());
            }
            sprqb sprqb2 = (sprqb)arg0;
            spreed spreed2 = (spreed)sprjkc.cfr_renamed_1220(sprqb2.cfr_renamed_2095());
            spreed spreed3 = (spreed)sprjkc.cfr_renamed_1220(sprqb2.cfr_renamed_2094());
            sprwmd sprwmd2 = null;
            if (sprqb2.cfr_renamed_2096() != null) {
                sprwmd2 = (sprwmd)sprjkc.cfr_renamed_1216(sprqb2.cfr_renamed_2096());
            }
            sprtnd sprtnd2 = new sprtnd(spreed2, spreed3, sprwmd2);
            this.cfr_renamed_152 = spreed2.cfr_renamed_284();
            this.cfr_renamed_2.cfr_renamed_1524(sprtnd2);
            return;
        }
        if (!(arg0 instanceof PrivateKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprvmz.cfr_renamed_9("<:y(<0{#y4q4r%<#y i8n4oq")).append(sprxoc.cfr_renamed_2498(sprab.class)).append(sprbme.cfr_renamed_9("j\t%\u001dj\u0006$\u0006>\u0006+\u0003#\u001c+\u001b#\u0000$")).toString());
        }
        spreed spreed4 = (spreed)sprjkc.cfr_renamed_1220((PrivateKey)arg0);
        this.cfr_renamed_152 = spreed4.cfr_renamed_284();
        this.cfr_renamed_2.cfr_renamed_1524(spreed4);
    }

    @Override
    public void engineInit(Key arg0, SecureRandom arg1) throws InvalidKeyException {
        this.cfr_renamed_2497(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprxoc(String string, sprzf sprzf2, sprib sprib2) {
        void arg1;
        void arg0;
        sprxoc sprxoc2 = this;
        this.cfr_renamed_119 = arg0;
        sprxoc2.cfr_renamed_2 = arg1;
        sprxoc2.cfr_renamed_4 = sprib2;
    }

    @Override
    public SecretKey engineGenerateSecret(String arg0) throws NoSuchAlgorithmException {
        sprxoc sprxoc2 = this;
        byte[] byArray = sprxoc2.cfr_renamed_2499(sprxoc2.cfr_renamed_112);
        String string = arg0;
        String string2 = sprywa.cfr_renamed_116(string);
        String string3 = string;
        if (cfr_renamed_3.containsKey(string2)) {
            string3 = ((sprtzd)cfr_renamed_3.get(string2)).cfr_renamed_19();
        }
        if (this.cfr_renamed_4 != null) {
            if (!cfr_renamed_0.containsKey(string3)) {
                throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprvmz.cfr_renamed_9("$r:r>k?<0p6s#u%t<<4r2s$r%y#y5&q")).append(arg0).toString());
            }
            int n = (Integer)cfr_renamed_0.get(string3);
            sprrmd sprrmd2 = new sprrmd(new sprtzd(string3), n, byArray);
            byte[] byArray2 = new byte[n / 8];
            sprxoc sprxoc3 = this;
            sprxoc3.cfr_renamed_4.cfr_renamed_2342(sprrmd2);
            sprxoc3.cfr_renamed_4.cfr_renamed_2341(byArray2, 0, byArray2.length);
            byArray = byArray2;
        } else if (cfr_renamed_0.containsKey(string3)) {
            Integer n = (Integer)cfr_renamed_0.get(string3);
            byte[] byArray3 = new byte[n / 8];
            System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
            byArray = byArray3;
        }
        if (cfr_renamed_1.containsKey(string3)) {
            sprtdd.cfr_renamed_1520(byArray);
        }
        return new SecretKeySpec(byArray, arg0);
    }

    static {
        cfr_renamed_3 = new Hashtable();
        cfr_renamed_1 = new Hashtable();
        Integer n = spriwa.cfr_renamed_279(64);
        Integer n2 = spriwa.cfr_renamed_279(128);
        Integer n3 = spriwa.cfr_renamed_279(192);
        Integer n4 = spriwa.cfr_renamed_279(256);
        cfr_renamed_0.put(sprdg.cfr_renamed_287.cfr_renamed_19(), n2);
        cfr_renamed_0.put(sprdg.cfr_renamed_152.cfr_renamed_19(), n3);
        cfr_renamed_0.put(sprdg.cfr_renamed_102.cfr_renamed_19(), n4);
        cfr_renamed_0.put(sprdg.cfr_renamed_185.cfr_renamed_19(), n2);
        cfr_renamed_0.put(sprdg.cfr_renamed_3.cfr_renamed_19(), n3);
        cfr_renamed_0.put(sprdg.cfr_renamed_91.cfr_renamed_19(), n4);
        cfr_renamed_0.put(sprm.cfr_renamed_1472.cfr_renamed_19(), n3);
        cfr_renamed_0.put(sprm.cfr_renamed_1262.cfr_renamed_19(), n3);
        cfr_renamed_0.put(sprdh.cfr_renamed_102.cfr_renamed_19(), n);
        cfr_renamed_3.put(sprbme.cfr_renamed_9("+\u000f<\u000f+\u000f"), sprm.cfr_renamed_1262);
        cfr_renamed_3.put(sprvmz.cfr_renamed_9("\u0010Y\u0002"), sprdg.cfr_renamed_102);
        cfr_renamed_3.put("DES", sprdh.cfr_renamed_102);
        cfr_renamed_1.put("DES", "DES");
        cfr_renamed_1.put(sprbme.cfr_renamed_9("+\u000f<\u000f+\u000f"), "DES");
        cfr_renamed_1.put(sprdh.cfr_renamed_102.cfr_renamed_19(), "DES");
        cfr_renamed_1.put(sprm.cfr_renamed_1262.cfr_renamed_19(), "DES");
        cfr_renamed_1.put(sprm.cfr_renamed_1472.cfr_renamed_19(), "DES");
    }

    private /* synthetic */ byte[] cfr_renamed_2499(BigInteger arg0) {
        return cfr_renamed_91.cfr_renamed_2500(arg0, cfr_renamed_91.cfr_renamed_2321(this.cfr_renamed_152.cfr_renamed_1769()));
    }

    @Override
    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.cfr_renamed_4 != null) {
            throw new UnsupportedOperationException(sprvmz.cfr_renamed_9("W\u0015Zq\u007f0rqs?p(<3yqi\"y5<&t4rq}={>n8h9qqu\"<:r>k?"));
        }
        sprxoc sprxoc2 = this;
        return sprxoc2.cfr_renamed_2499(sprxoc2.cfr_renamed_112);
    }

    @Override
    public Key engineDoPhase(Key arg0, boolean arg1) throws InvalidKeyException, IllegalStateException {
        sprxoc sprxoc2;
        sprt sprt2;
        if (this.cfr_renamed_152 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprbme.cfr_renamed_9("j\u0001%\u001bj\u0006$\u0006>\u0006+\u0003#\u001c/\u000bd")).toString());
        }
        if (!arg1) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprvmz.cfr_renamed_9("q\u007f0rqs?p(<3yq~4h&y4rqh&sql0n%u4o\u007f")).toString());
        }
        if (this.cfr_renamed_2 instanceof sprpzca) {
            if (!(arg0 instanceof sprrb)) {
                throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprbme.cfr_renamed_9("O!\n3O+\b8\n/\u0002/\u0001>O8\n;\u001a#\u001d/\u001cj")).append(sprxoc.cfr_renamed_2498(sprrb.class)).append(sprvmz.cfr_renamed_9("<7s#<5s\u0001t0o4")).toString());
            }
            sprrb sprrb2 = (sprrb)arg0;
            sprwmd sprwmd2 = (sprwmd)sprjkc.cfr_renamed_1216(sprrb2.cfr_renamed_2093());
            sprwmd sprwmd3 = (sprwmd)sprjkc.cfr_renamed_1216(sprrb2.cfr_renamed_2092());
            sprt2 = new sprggd(sprwmd2, sprwmd3);
            sprxoc2 = this;
        } else {
            if (!(arg0 instanceof PublicKey)) {
                throw new InvalidKeyException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprbme.cfr_renamed_9("O!\n3O+\b8\n/\u0002/\u0001>O8\n;\u001a#\u001d/\u001cj")).append(sprxoc.cfr_renamed_2498(sprvb.class)).append(sprvmz.cfr_renamed_9("<7s#<5s\u0001t0o4")).toString());
            }
            sprt2 = sprjkc.cfr_renamed_1216((PublicKey)arg0);
            sprxoc2 = this;
        }
        sprxoc2.cfr_renamed_112 = this.cfr_renamed_2.cfr_renamed_2501(sprt2);
        return null;
    }

    @Override
    public int engineGenerateSecret(byte[] arg0, int arg1) throws IllegalStateException, ShortBufferException {
        byte[] byArray = this.engineGenerateSecret();
        if (arg0.length - arg1 < byArray.length) {
            throw new ShortBufferException(new StringBuilder().insert(0, this.cfr_renamed_119).append(sprbme.cfr_renamed_9("j\u0004/\u0016j\u000e-\u001d/\n'\n$\u001bpO$\n/\u000bj")).append(byArray.length).append(sprvmz.cfr_renamed_9("<3e%y\"")).toString());
        }
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return byArray.length;
    }

    private static /* synthetic */ String cfr_renamed_2498(Class arg0) {
        String string = arg0.getName();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    @Override
    public void engineInit(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (arg1 != null) {
            throw new InvalidAlgorithmParameterException(sprbme.cfr_renamed_9("\u0004\u0000j\u000e&\b%\u001d#\u001b\"\u0002j\u001f+\u001d+\u0002/\u001b/\u001d9O9\u001a:\u001f%\u001d>\n."));
        }
        this.cfr_renamed_2497(arg0);
    }
}

