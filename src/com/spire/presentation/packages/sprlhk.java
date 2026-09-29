/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdv;
import com.spire.presentation.packages.sprry;
import com.spire.presentation.packages.sprumk;
import com.spire.presentation.packages.sprwj;
import java.security.SecureRandom;

public class sprlhk
extends SecureRandom {
    private final boolean cfr_renamed_0;
    private final sprwj cfr_renamed_1;
    private final SecureRandom cfr_renamed_2;
    private final sprry cfr_renamed_3;
    private sprdv cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void nextBytes(byte[] arg0) {
        sprlhk sprlhk2 = this;
        synchronized (sprlhk2) {
            if (this.cfr_renamed_4 == null) {
                this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_9961(this.cfr_renamed_1);
            }
            if (this.cfr_renamed_4.cfr_renamed_3298(arg0, null, this.cfr_renamed_0) < 0) {
                sprlhk sprlhk3 = this;
                sprlhk3.cfr_renamed_4.cfr_renamed_3299(null);
                sprlhk3.cfr_renamed_4.cfr_renamed_3298(arg0, null, this.cfr_renamed_0);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(long arg0) {
        sprlhk sprlhk2 = this;
        synchronized (sprlhk2) {
            if (this.cfr_renamed_2 != null) {
                this.cfr_renamed_2.setSeed(arg0);
            }
            return;
        }
    }

    @Override
    public byte[] generateSeed(int arg0) {
        return sprumk.cfr_renamed_9951(this.cfr_renamed_1, arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void setSeed(byte[] arg0) {
        sprlhk sprlhk2 = this;
        synchronized (sprlhk2) {
            if (this.cfr_renamed_2 != null) {
                this.cfr_renamed_2.setSeed(arg0);
            }
            return;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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
     * WARNING - void declaration
     */
    public sprlhk(SecureRandom secureRandom, sprwj sprwj2, sprry sprry2, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprlhk sprlhk2 = this;
        sprlhk sprlhk3 = this;
        sprlhk3.cfr_renamed_2 = arg0;
        sprlhk3.cfr_renamed_1 = arg1;
        sprlhk2.cfr_renamed_3 = arg2;
        sprlhk2.cfr_renamed_0 = bl;
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_3.cfr_renamed_593();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_3299(byte[] arg0) {
        sprlhk sprlhk2 = this;
        synchronized (sprlhk2) {
            if (this.cfr_renamed_4 == null) {
                this.cfr_renamed_4 = this.cfr_renamed_3.cfr_renamed_9961(this.cfr_renamed_1);
            }
            this.cfr_renamed_4.cfr_renamed_3299(arg0);
            return;
        }
    }
}

