/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczj;
import com.spire.presentation.packages.sprfqk;
import com.spire.presentation.packages.sprfsj;
import com.spire.presentation.packages.sprihp;
import com.spire.presentation.packages.sprjrk;
import com.spire.presentation.packages.sprksb;
import com.spire.presentation.packages.sprpqk;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprrhi;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzbk;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;

public class sprfak
extends KeyPairGenerator {
    private static Hashtable cfr_renamed_119 = new Hashtable();
    public boolean cfr_renamed_91;
    private static Object cfr_renamed_0 = new Object();
    public sprfqk cfr_renamed_1;
    public sprpqk cfr_renamed_2;
    public int cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprfak sprfak2 = this;
        this.cfr_renamed_3 = arg0;
        sprfak2.cfr_renamed_4 = arg1;
        sprfak2.cfr_renamed_91 = false;
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
    public KeyPair generateKeyPair() {
        Object object;
        Object object2;
        Object object3;
        if (!this.cfr_renamed_91) {
            sprfak sprfak2;
            object3 = spruaf.cfr_renamed_279(this.cfr_renamed_3);
            if (cfr_renamed_119.containsKey(object3)) {
                this.cfr_renamed_2 = (sprpqk)cfr_renamed_119.get(object3);
                sprfak2 = this;
            } else {
                object2 = sprsci.cfr_renamed_105.cfr_renamed_1454(this.cfr_renamed_3);
                if (object2 != null) {
                    sprfak sprfak3 = this;
                    sprfak2 = sprfak3;
                    sprfak3.cfr_renamed_2 = sprfak3.cfr_renamed_9452(sprfak3.cfr_renamed_4, (DHParameterSpec)object2);
                } else {
                    Object object4;
                    object = cfr_renamed_0;
                    // MONITORENTER : object
                    if (cfr_renamed_119.containsKey(object3)) {
                        this.cfr_renamed_2 = (sprpqk)cfr_renamed_119.get(object3);
                        object4 = object;
                    } else {
                        sprjrk sprjrk2 = new sprjrk();
                        object4 = object;
                        sprjrk2.cfr_renamed_2492(this.cfr_renamed_3, sprfsj.cfr_renamed_9372(this.cfr_renamed_3), this.cfr_renamed_4);
                        sprfak sprfak4 = this;
                        this.cfr_renamed_2 = new sprpqk(this.cfr_renamed_4, sprjrk2.cfr_renamed_2493());
                        cfr_renamed_119.put(object3, this.cfr_renamed_2);
                    }
                    // MONITOREXIT : object4
                    sprfak2 = this;
                }
            }
            sprfak2.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_91 = true;
        }
        object3 = this.cfr_renamed_1.cfr_renamed_1223();
        object2 = (sprryk)((sprsil)object3).cfr_renamed_1224();
        object = (sprquk)((sprsil)object3).cfr_renamed_1225();
        return new KeyPair(new sprczj((sprryk)object2), new sprzbk((sprquk)object));
    }

    private /* synthetic */ sprpqk cfr_renamed_9452(SecureRandom arg0, DHParameterSpec arg1) {
        if (arg1 instanceof sprrhi) {
            return new sprpqk(arg0, ((sprrhi)arg1).cfr_renamed_3373());
        }
        return new sprpqk(arg0, new sprwsk(arg1.getP(), arg1.getG(), null, arg1.getL()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprksb.cfr_renamed_9("\f9\u000e9\u0011=\b=\u000ex\u0013:\u0016=\u001f,\\6\u0013,\\9\\\u001c4\b\u001d*\u001d5\u0019,\u0019*/(\u0019;"));
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
        try {
            this.cfr_renamed_2 = this.cfr_renamed_9452(arg1, dHParameterSpec);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new InvalidAlgorithmParameterException(illegalArgumentException.getMessage(), illegalArgumentException);
        }
        this.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_2);
        this.cfr_renamed_91 = true;
    }

    public sprfak() {
        sprfak sprfak2 = this;
        super(sprihp.cfr_renamed_9("p\u0006"));
        sprfak sprfak3 = this;
        sprfak3.cfr_renamed_1 = new sprfqk();
        sprfak2.cfr_renamed_3 = 2048;
        sprfak2.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        sprfak2.cfr_renamed_91 = false;
    }
}

