/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgkz;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprqqy;
import com.spire.presentation.packages.sprtzd;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.util.Hashtable;

public abstract class sprtuc {
    private static final Hashtable cfr_renamed_4 = new Hashtable();

    public Signature cfr_renamed_2553(sprtzd arg0) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.cfr_renamed_1539((String)cfr_renamed_4.get(arg0));
    }

    static {
        cfr_renamed_4.put(sprmg.cfr_renamed_91, sprqqy.cfr_renamed_9("I%[\\m\u0004n\u0005H>["));
        cfr_renamed_4.put(sprmg.cfr_renamed_112, sprgkz.cfr_renamed_9("\u0012 \u0000Zt^6\u00015\u0000\u0013;\u0000"));
        cfr_renamed_4.put(sprmg.cfr_renamed_2, sprqqy.cfr_renamed_9(">R,+\u001as\u0019r?I,{\u0003~ ]++"));
        cfr_renamed_4.put(sprmg.cfr_renamed_4, sprgkz.cfr_renamed_9(";\t)s]w\u001f(\u001c):\u0012) \u0006%%\u0006.p"));
        cfr_renamed_4.put(sprmg.cfr_renamed_31, sprqqy.cfr_renamed_9("I%[X+_m\u0004n\u0005H>["));
        cfr_renamed_4.put(sprmg.cfr_renamed_119, sprgkz.cfr_renamed_9(";\t)tYs\u001f(\u001c):\u0012) \u0006%%\u0006.p"));
        cfr_renamed_4.put(sprmg.cfr_renamed_88, sprqqy.cfr_renamed_9("I%[\\m\u0004n\u0005_.^>["));
        cfr_renamed_4.put(sprmg.cfr_renamed_272, sprgkz.cfr_renamed_9("\u0012 \u0000Zs\\6\u00015\u0000\u0004+\u0005;\u0000"));
        cfr_renamed_4.put(sprmg.cfr_renamed_1, "SHA256withECDSA");
        cfr_renamed_4.put(sprmg.cfr_renamed_93, "SHA384withECDSA");
        cfr_renamed_4.put(sprmg.cfr_renamed_114, sprqqy.cfr_renamed_9("I%[X+_m\u0004n\u0005_.^>["));
    }

    public abstract Signature cfr_renamed_1539(String var1) throws NoSuchProviderException, NoSuchAlgorithmException;
}

