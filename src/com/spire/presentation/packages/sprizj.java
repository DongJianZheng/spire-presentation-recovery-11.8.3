/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbk;
import com.spire.presentation.packages.sprlvd;
import com.spire.presentation.packages.sproz;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.spruxy;
import com.spire.presentation.packages.sprvwj;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class sprizj
implements sproz {
    private final SecureRandom cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprizj(SecureRandom secureRandom, sprrr sprrr2) {
        void arg0;
        sprizj sprizj2 = this;
        sprizj2.cfr_renamed_1 = arg0;
        sprizj2.cfr_renamed_4 = sprrr2;
    }

    @Override
    public byte[] cfr_renamed_596() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1512(byte[] byArray) {
        sprizj sprizj2 = this;
        this.cfr_renamed_2 = new byte[16];
        sprizj2.cfr_renamed_1.nextBytes(this.cfr_renamed_2);
        sprizj2.cfr_renamed_3 = new byte[12];
        sprizj2.cfr_renamed_1.nextBytes(this.cfr_renamed_3);
        try {
            void arg0;
            Cipher cipher;
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.cfr_renamed_2, spruxy.cfr_renamed_9("ZUH"));
            Cipher cipher2 = cipher = this.cfr_renamed_4.cfr_renamed_1496(sprlvd.cfr_renamed_9("\u0002-\f"));
            cipher2.init(1, (Key)secretKeySpec, sprvwj.cfr_renamed_9529(this.cfr_renamed_3, 128));
            return cipher2.doFinal((byte[])arg0);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    @Override
    public byte[] cfr_renamed_1521() {
        return this.cfr_renamed_2;
    }

    public /* synthetic */ sprizj(SecureRandom arg0, sprrr arg1, sprhbk arg2) {
        this(arg0, arg1);
    }
}

