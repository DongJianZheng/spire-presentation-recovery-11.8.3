/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqpb;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprysm;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class sprvai {
    private static /* synthetic */ byte[] cfr_renamed_9175(sprlem arg0, byte[] arg1, int arg2, char[] arg3, byte[] arg4, String arg5) throws Exception {
        Mac mac;
        sprlem sprlem2 = arg0;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(sprlem2.cfr_renamed_19(), arg5);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg1, arg2);
        PBEKeySpec pBEKeySpec = new PBEKeySpec(arg3);
        SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
        Mac mac2 = mac = Mac.getInstance(sprlem2.cfr_renamed_19(), arg5);
        mac2.init(secretKey, pBEParameterSpec);
        mac2.update(arg4);
        return mac2.doFinal();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_9176(byte[] arg0, char[] arg1, String arg2) throws IOException {
        sprysm sprysm2 = sprysm.cfr_renamed_23(arg0);
        spruom spruom2 = sprysm2.cfr_renamed_1475();
        byte[] byArray = sprxgf.cfr_renamed_184(sproug.cfr_renamed_23(spruom2.cfr_renamed_480()).cfr_renamed_186()).cfr_renamed_104("DER");
        spruom2 = new spruom(spruom2.cfr_renamed_696(), new sprfvg(byArray));
        sprcpm sprcpm2 = sprysm2.cfr_renamed_1470();
        try {
            int n = sprcpm2.cfr_renamed_1478().intValue();
            byte[] byArray2 = sproug.cfr_renamed_23(spruom2.cfr_renamed_480()).cfr_renamed_186();
            byte[] byArray3 = sprvai.cfr_renamed_9175(sprcpm2.cfr_renamed_1472().cfr_renamed_1473().cfr_renamed_593(), sprcpm2.cfr_renamed_1477(), n, arg1, byArray2, arg2);
            sprddm sprddm2 = new sprddm(sprcpm2.cfr_renamed_1472().cfr_renamed_1473().cfr_renamed_593(), sprpen.cfr_renamed_4);
            sprdim sprdim2 = new sprdim(sprddm2, byArray3);
            sprcpm2 = new sprcpm(sprdim2, sprcpm2.cfr_renamed_1477(), n);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprqpb.cfr_renamed_9("y\u0000n\u001dnR\u007f\u001dr\u0001h\u0000i\u0011h\u001br\u0015<?]1&R")).append(exception.toString()).toString());
        }
        sprysm2 = new sprysm(spruom2, sprcpm2);
        return sprysm2.cfr_renamed_104("DER");
    }

    public static byte[] cfr_renamed_9177(byte[] arg0) throws IOException {
        return sprysm.cfr_renamed_23(arg0).cfr_renamed_104("DER");
    }
}

