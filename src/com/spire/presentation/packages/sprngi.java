/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcgm;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreei;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprqpj;
import com.spire.presentation.packages.sprrbia;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class sprngi {
    public static PrivateKey cfr_renamed_2377(PrivateKey arg0, Provider arg1) throws IllegalArgumentException, NoSuchAlgorithmException {
        try {
            sprhfm sprhfm2;
            Object object;
            sprcom sprcom2 = sprcom.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            if (sprcom2.cfr_renamed_1254().cfr_renamed_593().cfr_renamed_5078(sprqo.cfr_renamed_93)) {
                throw new UnsupportedEncodingException(sprpjc.cfr_renamed_9("\u001bD\u0016K\u0017QXF\u0017K\u000e@\nQXb7v,\u0005\u0013@\u0001\u0005\fJX@\u0000U\u0014L\u001bL\f\u0005\bD\nD\u0015@\f@\nVV"));
            }
            sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprcom2.cfr_renamed_1254().cfr_renamed_284());
            if (sprcgm2.cfr_renamed_2317()) {
                object = sprlem.cfr_renamed_23(sprcgm2.cfr_renamed_284());
                sprhfm2 = sprqpj.cfr_renamed_9156((sprlem)object);
                if (sprhfm2.cfr_renamed_9181()) {
                    sprhfm2 = new sprhfm(sprhfm2.cfr_renamed_1769(), sprhfm2.cfr_renamed_9182(), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153());
                }
            } else if (sprcgm2.cfr_renamed_2320()) {
                sprhfm2 = new sprhfm(sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1769(), new sprfim(sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1145(), false), sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1146(), sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1153());
            } else {
                return arg0;
            }
            sprcgm2 = new sprcgm(sprhfm2);
            sprcom2 = new sprcom(new sprddm(sprbr.cfr_renamed_135, sprcgm2), sprcom2.cfr_renamed_1229());
            object = KeyFactory.getInstance(arg0.getAlgorithm(), arg1);
            return ((KeyFactory)object).generatePrivate(new PKCS8EncodedKeySpec(sprcom2.cfr_renamed_91()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw noSuchAlgorithmException;
        }
        catch (Exception exception) {
            throw new spreei(exception);
        }
    }

    public static PrivateKey cfr_renamed_2376(PrivateKey arg0, String arg1) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(arg1);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprrbia.cfr_renamed_9("\u0007\r\n\u0002\u000b\u0018D\n\r\u0002\u0000L\u0014\u001e\u000b\u001a\r\b\u0001\u001e^L")).append(arg1).toString());
        }
        return sprngi.cfr_renamed_2377(arg0, provider);
    }

    public static PublicKey cfr_renamed_2378(PublicKey arg0, String arg1) throws IllegalArgumentException, NoSuchAlgorithmException, NoSuchProviderException {
        Provider provider = Security.getProvider(arg1);
        if (provider == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprpjc.cfr_renamed_9("F\u0019K\u0016J\f\u0005\u001eL\u0016AXU\nJ\u000eL\u001c@\n\u001fX")).append(arg1).toString());
        }
        return sprngi.cfr_renamed_2379(arg0, provider);
    }

    public static PublicKey cfr_renamed_2379(PublicKey arg0, Provider arg1) throws IllegalArgumentException, NoSuchAlgorithmException {
        try {
            sprhfm sprhfm2;
            Object object;
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0.getEncoded()));
            if (sprvhm2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_5078(sprqo.cfr_renamed_93)) {
                throw new IllegalArgumentException(sprrbia.cfr_renamed_9("\u000f\u0005\u0002\n\u0003\u0010L\u0007\u0003\n\u001a\u0001\u001e\u0010L##78D\u0007\u0001\u0015D\u0018\u000bL\u0001\u0014\u0014\u0000\r\u000f\r\u0018D\u001c\u0005\u001e\u0005\u0001\u0001\u0018\u0001\u001e\u0017B"));
            }
            sprcgm sprcgm2 = sprcgm.cfr_renamed_23(sprvhm2.cfr_renamed_593().cfr_renamed_284());
            if (sprcgm2.cfr_renamed_2317()) {
                object = sprlem.cfr_renamed_23(sprcgm2.cfr_renamed_284());
                sprhfm2 = sprqpj.cfr_renamed_9156((sprlem)object);
                if (sprhfm2.cfr_renamed_9181()) {
                    sprhfm2 = new sprhfm(sprhfm2.cfr_renamed_1769(), sprhfm2.cfr_renamed_9182(), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153());
                }
            } else if (sprcgm2.cfr_renamed_2320()) {
                sprhfm2 = new sprhfm(sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1769(), new sprfim(sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1145(), false), sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1146(), sprsci.cfr_renamed_105.cfr_renamed_2312().cfr_renamed_1153());
            } else {
                return arg0;
            }
            sprcgm2 = new sprcgm(sprhfm2);
            sprvhm2 = new sprvhm(new sprddm(sprbr.cfr_renamed_135, sprcgm2), sprvhm2.cfr_renamed_2314().cfr_renamed_81());
            object = KeyFactory.getInstance(arg0.getAlgorithm(), arg1);
            return ((KeyFactory)object).generatePublic(new X509EncodedKeySpec(sprvhm2.cfr_renamed_91()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw illegalArgumentException;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw noSuchAlgorithmException;
        }
        catch (Exception exception) {
            throw new spreei(exception);
        }
    }
}

