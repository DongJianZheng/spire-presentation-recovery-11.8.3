/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgd;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjid;
import com.spire.presentation.packages.sprksc;
import com.spire.presentation.packages.sprlyc;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprnnd;
import com.spire.presentation.packages.sprprc;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprufba;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprzmd;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;

public class sprdyc
extends KeyPairGenerator {
    public int cfr_renamed_112;
    public SecureRandom cfr_renamed_119;
    private static Object cfr_renamed_91;
    public boolean cfr_renamed_0;
    private static Hashtable cfr_renamed_1;
    public int cfr_renamed_2;
    public sprnnd cfr_renamed_3;
    public sprjid cfr_renamed_4;

    public sprdyc() {
        sprdyc sprdyc2 = this;
        super(sprufba.cfr_renamed_9("F\u000e"));
        sprdyc sprdyc3 = this;
        this.cfr_renamed_3 = new sprnnd();
        this.cfr_renamed_112 = 1024;
        sprdyc2.cfr_renamed_2 = 20;
        sprdyc2.cfr_renamed_119 = new SecureRandom();
        sprdyc2.cfr_renamed_0 = false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprdyc sprdyc2 = this;
        sprdyc2.cfr_renamed_112 = arg0;
        sprdyc2.cfr_renamed_119 = secureRandom;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprprc.cfr_renamed_9("ttvtipppv5kwnpga${ka$t$QLEegexaaagWeav"));
        }
        DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
        sprdyc sprdyc2 = this;
        this.cfr_renamed_4 = new sprjid(arg1, new sprzmd(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
        this.cfr_renamed_3.cfr_renamed_1222(this.cfr_renamed_4);
        this.cfr_renamed_0 = true;
    }

    static {
        cfr_renamed_1 = new Hashtable();
        cfr_renamed_91 = new Object();
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
        if (!this.cfr_renamed_0) {
            sprdyc sprdyc2;
            object3 = spriwa.cfr_renamed_279(this.cfr_renamed_112);
            if (cfr_renamed_1.containsKey(object3)) {
                this.cfr_renamed_4 = (sprjid)cfr_renamed_1.get(object3);
                sprdyc2 = this;
            } else {
                object2 = sprbrb.cfr_renamed_86.cfr_renamed_1454(this.cfr_renamed_112);
                if (object2 != null) {
                    sprdyc2 = this;
                    this.cfr_renamed_4 = new sprjid(this.cfr_renamed_119, new sprzmd(((DHParameterSpec)object2).getP(), ((DHParameterSpec)object2).getG(), null, ((DHParameterSpec)object2).getL()));
                } else {
                    Object object4;
                    object = cfr_renamed_91;
                    // MONITORENTER : object
                    if (cfr_renamed_1.containsKey(object3)) {
                        this.cfr_renamed_4 = (sprjid)cfr_renamed_1.get(object3);
                        object4 = object;
                    } else {
                        sprbgd sprbgd2 = new sprbgd();
                        object4 = object;
                        sprbgd2.cfr_renamed_2492(this.cfr_renamed_112, this.cfr_renamed_2, this.cfr_renamed_119);
                        this.cfr_renamed_4 = new sprjid(this.cfr_renamed_119, sprbgd2.cfr_renamed_2493());
                        cfr_renamed_1.put(object3, this.cfr_renamed_4);
                    }
                    // MONITOREXIT : object4
                    sprdyc2 = this;
                }
            }
            sprdyc2.cfr_renamed_3.cfr_renamed_1222(this.cfr_renamed_4);
            this.cfr_renamed_0 = true;
        }
        object3 = this.cfr_renamed_3.cfr_renamed_1223();
        object2 = (sprmgd)((sprwnd)object3).cfr_renamed_1224();
        object = (sprrkd)((sprwnd)object3).cfr_renamed_1225();
        return new KeyPair(new sprksc((sprmgd)object2), new sprlyc((sprrkd)object));
    }
}

