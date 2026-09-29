/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbff;
import com.spire.presentation.packages.sprdtj;
import com.spire.presentation.packages.sprfma;
import com.spire.presentation.packages.sprgq;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprvwj;
import com.spire.presentation.packages.sprzgi;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprzck
implements sprgq {
    private final PrivateKey cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprrr cfr_renamed_3;
    private SecretKey cfr_renamed_4;

    public static sprdtj cfr_renamed_9538(PrivateKey arg0, byte[] arg1) {
        return new sprdtj(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprzck(PrivateKey privateKey, byte[] byArray, sprrr sprrr2) {
        void arg2;
        void arg0;
        sprzck sprzck2 = this;
        sprzck sprzck3 = this;
        sprzck3.cfr_renamed_4 = null;
        sprzck3.cfr_renamed_1 = arg0;
        sprzck2.cfr_renamed_3 = arg2;
        sprzck2.cfr_renamed_2 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7163(byte[] arg0, byte[] arg1, byte[] arg2) {
        try {
            Cipher cipher;
            Cipher cipher2;
            Cipher cipher3 = cipher2 = this.cfr_renamed_3.cfr_renamed_1496(sprfma.cfr_renamed_9("x\u001bn\u0006v\np8T;U\u001cu\u000e\u000fz\u000b"));
            cipher3.init(4, (Key)this.cfr_renamed_1, new sprzgi(this.cfr_renamed_2));
            this.cfr_renamed_4 = (SecretKey)cipher3.unwrap(arg0, sprbff.cfr_renamed_9("iY{"), 3);
            Cipher cipher4 = cipher = this.cfr_renamed_3.cfr_renamed_1496(sprfma.cfr_renamed_9("~\fp"));
            cipher4.init(2, (Key)this.cfr_renamed_4, sprvwj.cfr_renamed_9529(arg2, 128));
            return cipher4.doFinal(arg1);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    @Override
    public byte[] cfr_renamed_1521() {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprbff.cfr_renamed_9("Fs\boM\u007fZy\\<CyQ<ZyKs^yZyL"));
        }
        return this.cfr_renamed_4.getEncoded();
    }
}

