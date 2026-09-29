/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlej;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtji;
import com.spire.presentation.packages.spruyi;
import com.spire.presentation.packages.sprwvj;
import com.spire.presentation.packages.sprxqr;
import com.spire.presentation.packages.sprxzi;
import com.spire.presentation.packages.sprzyfa;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class sprwdj
extends KeyStoreSpi {
    private final sprrr cfr_renamed_2;
    private final Hashtable<String, sprlej> cfr_renamed_3;
    private static final String cfr_renamed_4 = "BC JKS store is read-only and only supports certificate entries";

    private /* synthetic */ sprxzi cfr_renamed_9264(InputStream arg0, char[] arg1) throws IOException {
        sprgf sprgf2 = sprtji.cfr_renamed_2390("SHA-1");
        byte[] byArray = sprkqe.cfr_renamed_471(arg0);
        if (arg1 != null) {
            sprgf sprgf3 = sprgf2;
            this.cfr_renamed_9265(sprgf3, arg1);
            sprgf3.cfr_renamed_1197(byArray, 0, byArray.length - sprgf2.cfr_renamed_1218());
            sprgf sprgf4 = sprgf2;
            byte[] byArray2 = new byte[sprgf4.cfr_renamed_1218()];
            sprgf4.cfr_renamed_1219(byArray2, 0);
            byte[] byArray3 = new byte[byArray2.length];
            System.arraycopy(byArray, byArray.length - byArray2.length, byArray3, 0, byArray2.length);
            if (!sproze.cfr_renamed_559(byArray2, byArray3)) {
                sproze.cfr_renamed_492(byArray, (byte)0);
                throw new IOException(sprxqr.cfr_renamed_9(" \f#\u001e'\u0002\"\tp\u0004>\u000e?\u001f\"\b3\u0019p\u0002\"M#\u0019?\u001f5M$\f=\u001d5\u001f5\tp\u001a9\u00198"));
            }
            return new sprxzi(byArray, 0, byArray.length - byArray2.length);
        }
        return new sprxzi(byArray, 0, byArray.length - sprgf2.cfr_renamed_1218());
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        throw new KeyStoreException(cfr_renamed_4);
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (arg0 == null) {
            this.engineLoad(null, null);
            return;
        }
        if (arg0 instanceof sprwvj) {
            sprwvj sprwvj2 = (sprwvj)arg0;
            this.engineLoad(sprwvj2.cfr_renamed_2920(), spruyi.cfr_renamed_9263(arg0));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzyfa.cfr_renamed_9("1\u0004\u007f\u0018*\u001b/\u0004-\u001f\u007f\r0\u0019\u007fL/\n-\n2L\u007f\u00049K+\u0012/\u000e\u007f")).append(arg0.getClass().getName()).toString());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 3;
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Certificate engineGetCertificate(String arg0) {
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        synchronized (hashtable) {
            sprlej sprlej2 = this.cfr_renamed_3.get(arg0);
            if (sprlej2 == null) return null;
            return sprlej2.cfr_renamed_4;
        }
    }

    public boolean engineProbe(InputStream arg0) throws IOException {
        DataInputStream dataInputStream;
        int n = (arg0 instanceof DataInputStream ? (dataInputStream = (DataInputStream)arg0) : (dataInputStream = new DataInputStream(arg0))).readInt();
        int n2 = dataInputStream.readInt();
        return n == -17957139 && (n2 == 1 || n2 == 2);
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        throw new KeyStoreException(cfr_renamed_4);
    }

    private /* synthetic */ void cfr_renamed_9265(sprgf arg0, char[] arg1) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length) {
            sprgf sprgf2 = arg0;
            sprgf2.cfr_renamed_1221((byte)(arg1[n] >> 8));
            sprgf2.cfr_renamed_1221((byte)arg1[++n]);
            n2 = n;
        }
        arg0.cfr_renamed_1197(sprkoe.cfr_renamed_433(sprxqr.cfr_renamed_9(" 9\n8\u0019)M\u0011\u001d8\u001f?\t9\u00195")), 0, 16);
    }

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException, NoSuchAlgorithmException, CertificateException {
        throw new IOException(cfr_renamed_4);
    }

    @Override
    public int engineSize() {
        return this.cfr_renamed_3.size();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Override
    public void engineLoad(InputStream arg0, char[] arg1) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (arg0 == null) {
            return;
        }
        v0 = this;
        var3_3 = v0.cfr_renamed_9264(arg0, arg1);
        var4_4 = v0.cfr_renamed_3;
        synchronized (var4_4) {
            try {
                block26: {
                    var5_5 = new DataInputStream(var3_3);
                    var6_6 = var5_5.readInt();
                    var7_7 = var5_5.readInt();
                    if (var6_6 != -17957139) break block26;
                    var8_8 = null;
                    var9_9 = null;
                    switch (var7_7) lbl-1000:
                    // 2 sources

                    {
                        case 1: {
                            if (false) ** GOTO lbl-1000
                            var8_8 = this.cfr_renamed_9266(sprzyfa.cfr_renamed_9("\u0007Ej[f"));
                            v1 = var5_5;
                            break;
                        }
                        case 2: {
                            var9_9 = new Hashtable<String, CertificateFactory>();
                            v1 = var5_5;
                            break;
                        }
                        default: {
                            throw new IllegalStateException(sprxqr.cfr_renamed_9("%\u00031\u000f<\bp\u0019?M4\u0004#\u000e5\u001f>M#\u0019?\u001f5M&\b\"\u001e9\u0002>"));
                        }
                    }
                    var10_10 = v1.readInt();
                    v2 = var11_11 = 0;
                    while (v2 < var10_10) {
                        switch (var5_5.readInt()) {
                            case 1: {
                                throw new IOException("BC JKS store is read-only and only supports certificate entries");
                            }
lbl33:
                            // 2 sources

                            case 2: {
                                if (false) ** GOTO lbl33
                                var13_12 = var5_5.readUTF();
                                var14_13 = new Date(var5_5.readLong());
                                if (var7_7 != 2) ** GOTO lbl46
                                var15_15 = var5_5.readUTF();
                                if (var9_9.containsKey(var15_15)) {
                                    var8_8 = (CertificateFactory)var9_9.get(var15_15);
                                    v3 = var5_5;
                                } else {
                                    var8_8 = this.cfr_renamed_9266(var15_15);
                                    var9_9.put(var15_15, var8_8);
lbl46:
                                    // 2 sources

                                    v3 = var5_5;
                                }
                                var15_14 = v3.readInt();
                                var16_16 = new byte[var15_14];
                                var5_5.readFully(var16_16);
                                var17_17 = new sprxzi(var16_16, 0, var16_16.length);
                                try {
                                    var18_18 = var8_8.generateCertificate(var17_17);
                                    if (var17_17.available() != 0) {
                                        throw new IOException(sprzyfa.cfr_renamed_9("/\n,\u0018(\u0004-\u000f\u007f\u00021\b0\u0019-\u000e<\u001f\u007f\u0004-K,\u001f0\u0019:K+\n2\u001b:\u0019:\u000f\u007f\u001c6\u001f7"));
                                    }
                                }
                                finally {
                                    var17_17.cfr_renamed_9248();
                                }
                                this.cfr_renamed_3.put(var13_12, new sprlej(var14_13, var18_18));
                                break;
                            }
                            default: {
                                throw new IllegalStateException(sprxqr.cfr_renamed_9("\u0018>\f2\u00015M$\u0002p\t9\u001e3\b\"\u0003p\b>\u0019\"\u0014p\u0019)\u001d5"));
                            }
                        }
                        v2 = ++var11_11;
                    }
                }
                if (var3_3.available() != 0) {
                    throw new IOException(sprzyfa.cfr_renamed_9("/\n,\u0018(\u0004-\u000f\u007f\u00021\b0\u0019-\u000e<\u001f\u007f\u0004-K,\u001f0\u0019:K+\n2\u001b:\u0019:\u000f\u007f\u001c6\u001f7"));
                }
            }
            finally {
                var3_3.cfr_renamed_9248();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        // MONITORENTER : hashtable
        // MONITOREXIT : hashtable
        return this.cfr_renamed_3.containsKey(arg0);
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean engineContainsAlias(String arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprxqr.cfr_renamed_9("1\u00019\f#M&\f<\u00185M9\u001ep\u0003%\u0001<"));
        }
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        // MONITORENTER : hashtable
        // MONITOREXIT : hashtable
        return this.cfr_renamed_3.containsKey(arg0);
    }

    public sprwdj(sprrr sprrr2) {
        sprwdj sprwdj2 = this;
        this.cfr_renamed_3 = new Hashtable();
        this.cfr_renamed_2 = sprrr2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public Enumeration<String> engineAliases() {
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        // MONITORENTER : hashtable
        // MONITOREXIT : hashtable
        return this.cfr_renamed_3.keys();
    }

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        return null;
    }

    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        throw new KeyStoreException(cfr_renamed_4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Date engineGetCreationDate(String arg0) {
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        synchronized (hashtable) {
            sprlej sprlej2 = this.cfr_renamed_3.get(arg0);
            if (sprlej2 == null) return null;
            return sprlej2.cfr_renamed_3;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        Hashtable<String, sprlej> hashtable = this.cfr_renamed_3;
        synchronized (hashtable) {
            for (Map.Entry<String, sprlej> entry : this.cfr_renamed_3.entrySet()) {
                if (!entry.getValue().cfr_renamed_4.equals(arg0)) continue;
                return entry.getKey();
            }
            return null;
        }
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        throw new KeyStoreException(cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ CertificateFactory cfr_renamed_9266(String arg0) throws CertificateException {
        if (this.cfr_renamed_2 == null) {
            return CertificateFactory.getInstance(arg0);
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_1550(arg0);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new CertificateException(noSuchProviderException.toString());
        }
    }

    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        return null;
    }
}

